package uri_1075;
import java.util.Scanner;
public class URI_1075 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int x = sc.nextInt();
        
        for (int i = 1; i < 10000; i++){
            if(i % x == 2)
                System.out.println(i);        
        }
    }
    
}
