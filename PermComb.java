package perm.comb;
// import java util package(in order to use scanner class)
import java.util.*; 
public class PermComb {

    // instance variables
    int n;
    int r;
    int f;
    
    // constructor to initialize instance variables
    PermComb(){
        f = 1;
    }
    
    // method to input total number of objects and the objects selected
    void input(){
        
        // create scanner class object s
        Scanner s = new Scanner(System.in);
        System.out.print("total number of objects = ");
        n = s.nextInt();
        System.out.print("number of objects selected = ");
        r = s.nextInt();
        
    }
    
    // method to find permutation
    void perm(){
        f = 1;
        int numer = fact(n);
        f = 1; 
        int denom = fact(n - r);
        int p = numer / denom;
        System.out.println("Permutation: " + p);
    }
    
    // method to find combination
    void comb(){
        f = 1;
        int numer = fact(n);
        f = 1; 
        int denom1 = fact(r);
        f = 1; 
        int denom2 = fact(n - r);
        int denom = denom1 * denom2;
        
        int p = numer / denom;
        System.out.println("Combination: " + p);
    
    }
    
    // method to find factorial using recursion
    int fact(int x){
        if(x == 0)
            return f;
        f = f * x;
        return fact(x-1);
    }
    
    
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 to find permutation and 2 to find combination: ");
        int x = sc.nextInt();
        
        // creating class object
        PermComb ob = new PermComb();
        ob.input();
        
        // switch case to call the methods according to the user's choice
        switch (x) {
            case 1:
                ob.perm();
                break;
            case 2:
                ob.comb();
                break;
            default:
                System.out.println("Wrong Input");
                break;
        }
    }
    
}
