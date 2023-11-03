
public class Pyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		for(int i=0;i<n;i++){
		    for(int k=0;k<n-i;k++){
		        System.out.print(" ");
		    }
		    for(int j=0;j<=i*2;j++){
		         System.out.print("*");
		    }
		    System.out.println();
		}
		for(int i=n-1;i>=0;i--){
		    for(int k=0;k<=n-i;k++){
		        System.out.print(" ");
		    }
		    for(int j=0;j<(i*2)-1;j++){
		         System.out.print("*");
		    }
		    System.out.println();
		}

	}

}
