package calculator;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calc {

	private JFrame frame;
	private JTextField txtDisplay;
	
    double firstnum;
	double secondnum;
	double result;
	String operations;
	String answer;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calc window = new Calc();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calc() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 322, 401);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
	 	textField = new JTextField();
		textField.setBounds(10, 11, 252, 31);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		//-------------------------Row 1-------------------------//
		
		JButton btnclr = new JButton("clr");
		btnclr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JTextArea txtDisplay=new JTextArea();
				firstnum= Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations="clr";
			}
		});
		btnclr.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnclr.setBounds(10,110, 50, 50);
		frame.getContentPane().add(btnclr);
		
		JButton btnC = new JButton("c");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JTextArea txtDisplay=new JTextArea();
				//firstnum= Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText(null);
				operations="c";
			}
		});
		btnC.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnC.setBounds(66,54, 50, 50);
		frame.getContentPane().add(btnC);
		
		JButton btnP = new JButton("%");
		btnP.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			JTextArea txtDisplay=new JTextArea();
			firstnum= Double.parseDouble(txtDisplay.getText());
			txtDisplay.setText("");
			operations="%";
		}
		});
		btnP.setFont(new Font("Tahoma",Font.BOLD, 11));
		btnP.setBounds(122,54,50,50);
		frame.getContentPane().add(btnP);
		
		JButton btnPlus= new JButton("+");
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JTextArea txtDisplay=new JTextArea();
			firstnum=Double.parseDouble(txtDisplay.getText());
			txtDisplay.setText("");
			operations="+";
			}
		});
		btnPlus.setFont(new Font("Tahoma",Font.BOLD, 11));
		btnPlus.setBounds(178,54,50,50);
		frame.getContentPane().add(btnPlus);
		
		
		//-----------------------------Row 2-----------------------------//
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JTextArea txtDisplay=new JTextArea();
				String EnterNumber=txtDisplay.getText()+btn7.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 11));
		btn7.setBounds(10, 110, 50, 50);
		frame.getContentPane().add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JTextArea txtDisplay=new JTextArea();
				String EnterNumber=txtDisplay.getText()+btn8.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 11));
		btn8.setBounds(66, 110, 50, 50);
		frame.getContentPane().add(btn8);
		JButton btn9= new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JTextArea txtDisplay=new JTextArea();
				String EnterNumber=txtDisplay.getText()+btn9.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		btn9.setFont(new Font("Tahoma",Font.BOLD, 11));
		btn9.setBounds(122,110,50,50);
		frame.getContentPane().add(btn9);
		
		JButton btnS= new JButton("-");
		btnP.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JTextArea txtDisplay=new JTextArea();
				firstnum= Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations="-";
			}
		});
		btnS.setFont(new Font("Tahoma",Font.BOLD, 11));
		btnS.setBounds(178,130,50,50);
		frame.getContentPane().add(btnS);
		
		
		//----------------------Row 3---------------------------------------//
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JTextArea txtDisplay=new JTextArea();
				String EnterNumber=txtDisplay.getText()+btn4.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 11));
		btn4.setBounds(10,166, 50, 50);
		frame.getContentPane().add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JTextArea txtDisplay=new JTextArea();
				String EnterNumber=txtDisplay.getText()+btn5.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 11));
		btn5.setBounds(66,166, 50, 50);
		frame.getContentPane().add(btn5);
		
		JButton btn6= new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JTextArea txtDisplay=new JTextArea();
				String EnterNumber=txtDisplay.getText()+btn6.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		btn6.setFont(new Font("Tahoma",Font.BOLD, 11));
		btn6.setBounds(122,166,50,50);
		frame.getContentPane().add(btn6);
		
		JButton btnMul= new JButton("*");
		btnP.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			JTextArea txtDisplay=new JTextArea();
						firstnum= Double.parseDouble(txtDisplay.getText());
						txtDisplay.setText("");
						operations="%";
					}
		});
		btnMul.setFont(new Font("Tahoma",Font.BOLD, 11));
		btnMul.setBounds(172,166,50,50);
		frame.getContentPane().add(btnMul);
		
		//----------------------Row 4---------------------------------------//
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JTextArea txtDisplay=new JTextArea();
				String EnterNumber=txtDisplay.getText()+btn1.getText();
				txtDisplay.setText(EnterNumber);
				}
		});
		btn1.setFont(new Font("Tahoma", Font.BOLD, 11));
		btn1.setBounds(10,222, 50, 50);
		frame.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JTextArea txtDisplay=new JTextArea();
				String EnterNumber=txtDisplay.getText()+btn2.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		btn2.setFont(new Font("Tahoma", Font.BOLD, 11));
		btn2.setBounds(66,222, 50, 50);
		frame.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JTextArea txtDisplay=new JTextArea();
				String EnterNumber=txtDisplay.getText()+btn3.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		btn3.setFont(new Font("Tahoma",Font.BOLD, 11));
		btn3.setBounds(122,222,50,50);
		frame.getContentPane().add(btn3);
		
		JButton btnD= new JButton("/");
		btnD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JTextArea txtDisplay=new JTextArea();

				firstnum= Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations="/";
			}
		});
		
		btnD.setFont(new Font("Tahoma",Font.BOLD, 11));
		btnD.setBounds(178,222,50,50);
		frame.getContentPane().add(btnD);
		
        //------------------------Row 5--------------------------------------//
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JTextArea txtDisplay=new JTextArea();

				String EnterNumber=txtDisplay.getText()+btn0.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		btn0.setFont(new Font("Tahoma", Font.BOLD, 11));
		btn0.setBounds(10,270, 50, 50);
		frame.getContentPane().add(btn0);
		
		JButton btnDot = new JButton(".");
		btnP.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JTextArea txtDisplay=new JTextArea();

				firstnum= Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations="%";
			}
		});
		btnDot.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnDot.setBounds(66,270, 50, 50);
		frame.getContentPane().add(btnDot);
		
		JButton btnEq= new JButton("=");
		btnEq.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			JTextArea txtDisplay=new JTextArea();

			String answer;
		secondnum=Double.parseDouble(txtDisplay.getText());
		if (operations=="+") {
			result=firstnum+secondnum;
			answer=String.format("%.2f",result);
			txtDisplay.setText(answer);
		}
		else if (operations=="-")
		{
			result=firstnum-secondnum;
			answer=String.format("%.2f", result);
			txtDisplay.setText(answer);
		}
		else if(operations=="*")
		{
			result=firstnum-secondnum;
			answer=String.format("%.2f",result);
			txtDisplay.setText(answer);
		}
		else if(operations=="/")
		{
			result=firstnum-secondnum;
			answer=String.format("%.2f", result);
			txtDisplay.setText(answer);
		}
		else if(operations=="%")
		{
			result=firstnum-secondnum;
			answer=String.format("%.2f", result);
			txtDisplay.setText(answer);
		}
		else if(operations=="^")
		{
			result=firstnum-secondnum;
			answer=String.format("%.2f", result);
		}
		btnEq.setFont(new Font("Tahoma",Font.BOLD, 11));
		btnEq.setBounds(122,270,50,50);
		frame.getContentPane().add(btnEq);
		
		JButton btnPow = new JButton("^");
		btnP.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum= Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations="%";
			}
		});
		btnPow.setFont(new Font("Tahoma",Font.BOLD,11));
	    btnPow.setBounds(178, 270, 50, 50);
		frame.getContentPane().add(btnPow);
		
		}
		
		}
