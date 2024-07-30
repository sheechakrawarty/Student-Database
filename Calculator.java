import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


class Calculator extends JFrame implements ActionListener{
    
        JLabel l1,l2,l3,l;
        JTextField t1,t2,t3,t4;
        JButton b1,b2,b3,b4,b5;
        Font font;

        Calculator(){
            setLayout(new FlowLayout());
            setSize(300,300);
            setVisible(true);
            l = new JLabel("Calculator");
            font = new Font("Arial", Font.BOLD,35);
            l.setFont(font);
            l.setBounds(100,500,100,30);

            l1 = new JLabel("Number 1");
            l2 = new JLabel("Number 2");
            l3 = new JLabel("Result");
            l1.setFont(font);
            

            t1 = new JTextField(10);
            t2 = new JTextField(10);
            t3 = new JTextField(10);

            b1 = new JButton("add");
            b2 = new JButton("clear");
            b3 = new JButton("subtract");
            b4 = new JButton("divide");
            b5 = new JButton("Multiply");

            l1.setBounds(200,300,50,30);
            l2.setBounds(400,400,50,30);
            l3.setBounds(600,500,50,30);
            b1.setBounds(200,600,50,30);
            add(l);
            add(l1);add(t1);
            add(l2);add(t2);
            add(l3);add(t3);
            add(b1);add(b2);
            add(b3);add(b4);
            add(b5);
            b1.addActionListener(this);
            b2.addActionListener(this);
            b3.addActionListener(this);
            b4.addActionListener(this);
            b5.addActionListener(this);


        }
    public static void main(String[] args){
            new Calculator();
    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource() == b1){
        int a = Integer.parseInt(t1.getText());
        int b = Integer.parseInt(t2.getText());
        int c = a+b;
        t3.setText(String.valueOf(c));
        }
        if(e.getSource() == b3){
        int a = Integer.parseInt(t1.getText());
        int b = Integer.parseInt(t2.getText());
        int c = a-b;
        t3.setText(String.valueOf(c));
        }
        if(e.getSource() == b4){
        int a = Integer.parseInt(t1.getText());
        int b = Integer.parseInt(t2.getText());
        int c = a/b;
        t3.setText(String.valueOf(c));
        }
        if(e.getSource() == b5){
        int a = Integer.parseInt(t1.getText());
        int b = Integer.parseInt(t2.getText());
        int c = a*b;
        t3.setText(String.valueOf(c));
        }
        if(e.getSource() == b2){
            t1.setText("");
            t2.setText("");
            t3.setText("");
        }

    }
}