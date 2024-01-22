package PizzaGenerator;
public class Pizza {
     private int price;
     private boolean veg;
     private int extratoppingsprice=100;
     private int extracheeseprice=150;
     private int bagpackprice=20;
     private int basepizzaprice;
     private boolean isExtraCheeseAdded=false;
     private boolean isExtraToppingsAdded=false;
     private boolean isOptedforTakeAway=false;
     
     public Pizza(boolean veg) {
     this.veg=veg;
     if(this.veg) {
    	 this.price=300;
     }
     else {
    	 this.price=400;
     }
     basepizzaprice=this.price;
     }
     
     public void addextracheese() {
      isExtraCheeseAdded=true;	 
      this.price+=extracheeseprice;
     }
     
     public void addextratoppings() {
    	 isExtraToppingsAdded=true;
    	 this.price+=extratoppingsprice;    	 
     }
     public void takeaway() {
    isOptedforTakeAway=true;	 
    this.price+=bagpackprice; 	    	 
     }
     public void getbill() {
    	 String bill = " ";
    	 System.out.println(" pizza : " + basepizzaprice );
    	 if(isExtraCheeseAdded) {
         bill+="Extra cheese added : "+ extracheeseprice+"\n";
     }
         if(isExtraToppingsAdded) {
        	 bill+="Extra toppings added:"+extratoppingsprice + "\n";
         }
         if(isOptedforTakeAway) {
         bill+="take away opted :"+ bagpackprice+"\n";
         }
         bill+="Bill : "+ this.price + "\n";
         System.out.println(bill);
         }                    
     public void getpizzaprice() {
    	 System.out.println(this.price);
     }
}
