class pattern1 {
    public static void main(String args[]){
    // *****
    // *****
    // *****
    // *****
    // *****
     /*   for(int i =1; i<=5; i++){
            for (int j =1; j <=5; j++){
                System.out.print("*");
            }
            System.out.println();
        }*/
//*****
//*   *
//*   *
//*****
int n =5;
int m = 4;     
for(int i =1; i<=5; i++){ // outer loop
    for(int j =1; j<=5; j++){// inner loop
    if(i == 1|| j ==1 || i == 5 || j == 5){
        System.out.print("*");
    } else{
        System.out.print(" ");
    }
    }
    System.out.println();
    
    
    }
}
}