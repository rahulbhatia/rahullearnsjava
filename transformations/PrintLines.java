// PrintLines

import java.util.Scanner;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;

public class PrintLines {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a file name: ");

        String filename = scanner.next();

        System.out.println("Processing " + filename);

        processFile(filename);

    }
    
    public static void processFile(String filename) {
        try {
            BufferedReader br = new BufferedReader(new FileReader(filename));  
            StringBuffer line = null; 
            while ((line = br.readLine()) != null)  
            {  
                processLine(line);
            } 
        }
        catch(FileNotFoundException f) {
            System.out.println("File Not Found");
            return;
        }
        catch(java.io.IOException e) {
            System.out.println("Caught an IOException");
            return;
        }
    }

    public static void processLine(String line) {
        System.out.println((new StringBuffer(line).reverse()));
    }
}