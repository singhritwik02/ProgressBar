package MainPackage;

import javax.swing.*;

public class ProgressBar extends JFrame {
    JProgressBar progressBar;

    ProgressBar(){
        progressBar =new JProgressBar(0,2000);
        progressBar.setBounds(40,40,160,30);
        progressBar.setValue(0);
        progressBar.setStringPainted(true);
        add(progressBar);
        setSize(250,150);
        setLayout(null);
    }
    public void updateProgress(){
        int i = 0;
        while(i<=2000){
            progressBar.setValue(i);
            i=i+100;
            try{Thread.sleep(500);}catch(Exception e){
                e.printStackTrace();
            }
        }
    }
    public static void main(String[] args) {
        ProgressBar progressBar=new ProgressBar();
        progressBar.setVisible(true);
        progressBar.updateProgress();
    }
}