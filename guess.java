package main;
import java.util.Scanner;
public class guess {
    private int number = 5; 
    public guess(){

    }
    public void run() {
        guess g = new guess();
        Scanner player = new Scanner(System.in);
        System.out.println("enter the number");
        int i = player.nextInt();
        if(i == g.number){
            System.out.println("you win");
            System.exit(i);

        }
        while(i != g.number){
            System.out.println("enter the number");
            int again = player.nextInt();
            if(again == g.number){
                System.out.println("you win");
                break;
            }
            if(again != g.number){
                System.out.println("you lose");
                break;
            }

        }
        
 
    }
    
}
