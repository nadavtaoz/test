package DivideByZeroException;


import java.awt.*; 
import java.awt.event.*;

import javax.swing.JTextField;

public class SimpleCalculator implements ActionListener 
{
  private Button bt1, bt2, bt3, bt4,bt5,bt6,bt7,bt8,bb0,bb1,bb2,bb3,bb4,bb5,bb6,bb7,bb8,bb9;
  private JTextField tf1, tf2, tf3,nadav,and,netali;
  private double result,num1=0,num2=0,point1=0,point2=0,temp1,temp2; 
  private Frame frame; 
  private Panel panel0,panel1, panel2, panel3,panel4,panel5,nullp1;
  private boolean flag = false,point = false;
  private char oper = '&';

  public static void main (String args[]) 
  { 
    SimpleCalculator operator = new SimpleCalculator(); 
    operator.go(); 
  }

  public void doPlus() 
  { 
	merge();	 
    result = num1 + num2; 
    tf3.setText(String.valueOf(result)); 
  }
  public void doMinus() 
  { 
	  merge();	 
    result = num1 - num2; 
    tf3.setText(String.valueOf(result)); 
  }

  public void doMult() 
  { 
	  merge();	 
    result = num1 * num2; 
    tf3.setText(String.valueOf(result)); 
  }

  public void doDiv() throws ImpossibleComputationException 
  { 
	  merge();	 
    if (num2==0) 
    { 
    	ImpossibleComputationException  e = new ImpossibleComputationException();
    	throw e;
    } 
    else 
    { 
      result = num1 / num2; 
      tf3.setText(String.valueOf(result)); 
    } 
  }
  public void doMod()
  {
	  merge();	 
	  result = num1%num2;
	  tf3.setText(String.valueOf(result)); 
  }
  public void merge()
  {
	    if(point)
	    	if(!flag)num1 = decinalFraction((int)num1,(int)point1);
	    	else num2 = decinalFraction((int)num2,(int)point2); 
	    point1=0;
	    point2=0;
	    point=false;
  }
  public double decinalFraction(int tmp1,int tmp2)
  {
	  int count=0,tmp4,tmp5=tmp2;
	  double tmp3=tmp2;
	  while(tmp5>0)
	  {
		  tmp5=tmp5/10;
		  count++;
	  }
	  tmp4=(int) (Math.pow(10,count));
	  tmp3=(double)tmp2/tmp4;
	  return (double)tmp1+tmp3;
  }
  public void inputNum(int num)
  {
	 String line; 
	 if(point)
		 if(!flag) {point1 = (point1*10)+num;
		 line = String.valueOf((int)num1)+"."+String.valueOf((int)point1);
		 tf1.setText(line);		 
		 return;}
		 else {point2 = (point2*10)+num;
		 line = String.valueOf(num1)+oper+String.valueOf((int)num2)+"."+String.valueOf((int)point2);
		 tf1.setText(line);		 
		 return;}
	  if(flag)
	  {	  
		  num2 = (num2*10)+num;
		  line = String.valueOf(num1)+oper+String.valueOf(num2);
		  tf1.setText(line);
	  }
	  else 
	  {
		  num1 = (num1*10)+num;
		  tf1.setText(String.valueOf(num1));
	  }	  
  }
  public void clear()
  {
	  tf3.setText(String.valueOf(0));
	  tf1.setText(String.valueOf(0));
  }
  public void go() 
  { 
    frame = new Frame("Simple Calculator"); 
    bt1 = new Button("+"); 
    bt2 = new Button("-"); 
    bt3 = new Button("*"); 
    bt4 = new Button("/"); 
    bt5 = new Button("%");
    bt6 = new Button("CLR");
    bt7 = new Button(".");
    bt8 = new Button("=");
    bb0 = new Button("0");
    bb1 = new Button("1");
    bb2 = new Button("2");
    bb3 = new Button("3");
    bb4 = new Button("4");
    bb5 = new Button("5");
    bb6 = new Button("6");
    bb7 = new Button("7");
    bb8 = new Button("8");
    bb9 = new Button("9");
    nadav = new JTextField("Nadav");
    nadav.setBackground(Color.yellow);
    and = new JTextField("and");
    and.setBackground(Color.yellow);
    netali = new JTextField("Netali");
    netali.setBackground(Color.yellow);
    tf1 = new JTextField(20);
    tf1.setHorizontalAlignment(JTextField.CENTER);
    tf2 = new JTextField("Java Respect");
    tf2.setBackground(Color.yellow);
    tf3 = new JTextField(30); 
    tf3.setHorizontalAlignment(JTextField.CENTER);
    panel0 = new Panel();
    panel1 = new Panel(); 
    panel2 = new Panel(); 
    panel3 = new Panel(); 
    panel4 = new Panel(); 
    panel5 = new Panel(); 
    nullp1 = new Panel();
    nullp1.setName("Java Respect");
    frame.setLayout(new GridLayout(5,4,5,5));
    panel0.add(tf1);
    panel0.setBackground(Color.cyan);
    panel0.setLocation(10, 5);
    panel1.add(tf3); 
    panel1.setBackground(Color.cyan);
    frame.add(panel0);
    frame.add(panel1); 
    frame.add(nadav); 
    frame.add(and); 
    frame.add(netali); 
    frame.add(bb7);
    frame.add(bb8);
    frame.add(bb9);
    frame.add(bt4);
    frame.add(tf2);
    frame.add(bb4);
    frame.add(bb5);
    frame.add(bb6);
    frame.add(bt3);
    frame.add(bt5);
    frame.add(bb1);
    frame.add(bb2);
    frame.add(bb3);
    frame.add(bt2);
    frame.add(bt6);
    frame.add(bb0);
    frame.add(bt7);
    frame.add(bt1);
    frame.add(bt8);
    frame.setSize(400, 400); 
    frame.setBackground(Color.yellow); 
    frame.setVisible(true); 
    bt1.addActionListener(this); 
    bt2.addActionListener(this); 
    bt3.addActionListener(this); 
    bt4.addActionListener(this); 
    bt5.addActionListener(this); 
    bt6.addActionListener(this); 
    bt7.addActionListener(this); 
    bt8.addActionListener(this);
    bb0.addActionListener(this);
    bb1.addActionListener(this); 
    bb2.addActionListener(this); 
    bb3.addActionListener(this); 
    bb4.addActionListener(this); 
    bb5.addActionListener(this); 
    bb6.addActionListener(this); 
    bb7.addActionListener(this); 
    bb8.addActionListener(this); 
    bb9.addActionListener(this); 
    frame.addWindowListener(new WindowAdapter() 
    { 
      public void windowClosing(WindowEvent event) 
      { 
        frame.dispose(); 
        System.exit(0); 
      } 
    } 
         ); 
  }

    	  public void actionPerformed(ActionEvent e) 
    	  { 
    	    try 
    	    { 
    	      switch (e.getActionCommand())
    	      {
    	      case ".": point = true; break;  
    	      case "+": oper = '+';merge();flag=true;	 break;      
    	      case "-": oper = '-';merge();flag=true;	 break;
    	      case "/": oper = '/';merge();flag=true;	 break;
    	      case "*": oper = '*';merge();flag=true;	 break;
    	      case "%": oper = '%';merge();flag=true;	 break;
    	      case "CLR": clear(); 
    	      case "=": 
    	    	  switch(oper)
    	    	  {
    	    	  case '+': doPlus();break;
    	    	  case '-': doMinus();break;
    	    	  case '/': doDiv();break;    	   
    	    	  case '*': doMult();break;
    	    	  case '%': doMod();break;
    	    	  }
    	      flag = false;
    	      point = false;  
    	      num1=0;num2=0;
    	      break;
    	      case "0": inputNum(0);break;
    	      case "1": inputNum(1);break;
    	      case "2": inputNum(2);break;
    	      case "3": inputNum(3);break;  
    	      case "4": inputNum(4);break;  
    	      case "5": inputNum(5);break;  
    	      case "6": inputNum(6);break;  
    	      case "7": inputNum(7);break;  
    	      case "8": inputNum(8);break;  
    	      case "9": inputNum(9);break;   
    	      } 
    } 
    catch(ImpossibleComputationException ex) 
    { 
      tf3.setText(ex.getMessage()); 
    } 
    catch(NumberFormatException ex2) 
    { 
      tf3.setText("One of the parameters can't be converted to integer number"); 
    } 
  } 
} 
