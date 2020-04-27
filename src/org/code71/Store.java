package org.code71;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.border.CompoundBorder;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import javax.swing.JTextArea;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.Window.Type;

public class Store extends JFrame {

	private JPanel contentPane;
	private JTextField name;
	private JLabel lblSex;
	private JLabel lblProfession;
	private JComboBox pro;
	private JLabel lblBook;
	private JComboBox book;
	JTextArea op;
	final static int price = 200;
	private JLabel lblBookStoreManagement;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Store frame = new Store();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Store() {
		setType(Type.UTILITY);
		setResizable(false);
		setTitle("Book Store");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(500, 130, 450, 388);
		contentPane = new JPanel();
		contentPane.setForeground(Color.WHITE);
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Your Name");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(29, 41, 74, 25);
		contentPane.add(lblNewLabel);
		
		name = new JTextField();
		name.setBounds(113, 43, 106, 22);
		contentPane.add(name);
		name.setColumns(10);
		
		lblSex = new JLabel("Sex");
		lblSex.setForeground(Color.WHITE);
		lblSex.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblSex.setBounds(29, 88, 74, 25);
		contentPane.add(lblSex);
		
		JComboBox sex = new JComboBox();
		sex.setToolTipText("Select");
		sex.addItem("Male");
		sex.addItem("Female");
		sex.setBounds(113, 91, 106, 22);
		contentPane.add(sex);
		
		lblProfession = new JLabel("Profession");
		lblProfession.setForeground(Color.WHITE);
		lblProfession.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblProfession.setBounds(29, 135, 74, 25);
		contentPane.add(lblProfession);
		
		pro = new JComboBox();
		pro.setToolTipText("Select");
		pro.addItem("Student");
		pro.addItem("Teacher");
		pro.setBounds(113, 138, 106, 22);
		contentPane.add(pro);
		
		lblBook = new JLabel("Select Book");
		lblBook.setForeground(Color.WHITE);
		lblBook.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblBook.setBounds(29, 188, 74, 25);
		contentPane.add(lblBook);
		
		book = new JComboBox();
		book.setToolTipText("Select");
		book.setBounds(113, 191, 106, 22);
		book.addItem("Java");
		book.addItem("Advance C");
		book.addItem("C#");
		contentPane.add(book);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(name.getText().length()>=1) {
				
				if (book.getSelectedIndex()==0 && (sex.getSelectedIndex()==0 || sex.getSelectedIndex()==1) && pro.getSelectedIndex()==0) {
					String a="\nHello "+name.getText()+",\nYou are a student and\nopted for Java book\n\n";
				   
					String b="Total price: "+price;
					String c="\nCommison for you 30%";
					int commison = 200 - (price*30)/100;
					String d="\nFinal price: "+commison+"\nNow pay this bill...\n\n*Thanks for shopping*";
					op.setText(a+b+c+d);
				}
				else if (book.getSelectedIndex()==0 && (sex.getSelectedIndex()==0 || sex.getSelectedIndex()==1) && pro.getSelectedIndex()==1) {
					String a="\nHello "+name.getText()+",\nYou are a Teacher and\nopted for Java book\n\n";
				   
					String b="Total price: "+price;
					String c="\nCommison for you 40%";
					int commison = 200 - (price*40)/100;
					String d="\nFinal price: "+commison+"\nNow pay this bill...\n\n*Thanks for shopping*";
					op.setText(a+b+c+d);
				}
				
				else if (book.getSelectedIndex()==1 && (sex.getSelectedIndex()==0 || sex.getSelectedIndex()==1) && pro.getSelectedIndex()==0) {
					String a="\nHello "+name.getText()+",\nYou are a student and\nopted for\nAdvance C book\n\n";
				   
					String b="Total price: "+price;
					String c="\nCommison for you 30%";
					int commison = 200 - (price*30)/100;
					String d="\nFinal price: "+commison+"\nNow pay this bill...\n\n*Thanks for shopping*";
					op.setText(a+b+c+d);
				}
				else if (book.getSelectedIndex()==1 && (sex.getSelectedIndex()==0 || sex.getSelectedIndex()==1) && pro.getSelectedIndex()==1) {
					String a="\nHello "+name.getText()+",\nYou are a Teacher and\nopted for Advance C book\n\n";
				   
					String b="Total price: "+price;
					String c="\nCommison for you 40%";
					int commison = 200 - (price*40)/100;
					String d="\nFinal price: "+commison+"\nNow pay this bill...\n\n*Thanks for shopping*";
					op.setText(a+b+c+d);
				}
				
				else if (book.getSelectedIndex()==2 && (sex.getSelectedIndex()==0 || sex.getSelectedIndex()==1) && pro.getSelectedIndex()==0) {
					String a="\nHello "+name.getText()+",\nYou are a student and\nopted for C# book\n\n";
				   
					String b="Total price: "+price;
					String c="\nCommison for you 30%";
					int commison = 200 - (price*30)/100;
					String d="\nFinal price: "+commison+"\nNow pay this bill...\n\n*Thanks for shopping*";
					op.setText(a+b+c+d);
				}
				else if (book.getSelectedIndex()==2 && (sex.getSelectedIndex()==0 || sex.getSelectedIndex()==1) && pro.getSelectedIndex()==1) {
					String a="\nHello "+name.getText()+",\nYou are a Teacher and\nopted for C# book\n\n";
				   
					String b="Total price: "+price;
					String c="\nCommison for you 40%";
					int commison = 200 - (price*40)/100;
					String d="\nFinal price: "+commison+"\nNow pay this bill...\n\n*Thanks for shopping*";
					op.setText(a+b+c+d);
				}
				}
				
				else {
					JOptionPane.showMessageDialog(null, "Please Enter Your Name");
				}
				
				
				
				
			}
		});
		btnNewButton.setBackground(Color.DARK_GRAY);
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.setBounds(107, 262, 112, 35);
		contentPane.add(btnNewButton);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Output", TitledBorder.LEADING, TitledBorder.TOP, null, Color.BLUE));
		panel.setBounds(248, 41, 176, 256);
		contentPane.add(panel);
		panel.setLayout(null);
		
		op = new JTextArea();
		op.setEditable(false);
		op.setFont(new Font("Tahoma", Font.BOLD, 13));
		op.setBounds(10, 27, 156, 218);
		panel.add(op);
		
		lblBookStoreManagement = new JLabel("@Book Store Management System By Shoaeb");
		lblBookStoreManagement.setForeground(Color.WHITE);
		lblBookStoreManagement.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblBookStoreManagement.setBounds(68, 323, 295, 25);
		contentPane.add(lblBookStoreManagement);
	}
}
