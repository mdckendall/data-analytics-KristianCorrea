import java.io.FileReader;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.util.ArrayList;

class Main {
	public static void main(String[] args) throws FileNotFoundException {

		ArrayList<String> arrayList = new ArrayList<>();
		FileReader fr = new FileReader("names.txt");
		Scanner fileScanner = new Scanner(fr);
    Scanner input = new Scanner(System.in);
    while (fileScanner.hasNextLine()) {
      arrayList.add(fileScanner.nextLine()); 
    }
    var quit = false;
    while(!quit){
      System.out.println("1) Salary");
      System.out.println("2) Jobs");
      System.out.println("3) Demand");
      System.out.println("4) Students");
      System.out.println("5) Quit");
      
      
      switch(input.nextInt()){
        case 1: System.out.println("$98,345 average salary in South Florida!");
        case 2: System.out.println("US News - 100 Best Jobs!");
        case 3: System.out.println("Top 10 Forbes In-Demand Jobs!");
        case 4: {
          System.out.println("Current Students:");
          for(var e: arrayList){
            System.out.println(e);
          }
        }
        default: {
          System.out.println("Quitting");
          quit = true;
        }
      }
    }
	}
}