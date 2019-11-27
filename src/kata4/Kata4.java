package kata4;

import java.io.IOException;
import java.util.ArrayList;

public class Kata4 {

    public static void main(String[] args) throws IOException{

        String name = "/Users/yuncai/NetBeansProjects/kata4/email.txt";
        
        ArrayList <String> listMail = MailList.read(name);
        
        Histogram <String> histogram = MailHistogramBuilder.build(listMail);
        
        new HistogramDisplay(histogram).execute();
    }

}
