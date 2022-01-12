 public class Book extends TangibleAsset {
   private String isbon;

   public Book(String name, innt price, String color, String isbon) {
     super(name,price,color);
     this.isbon = isbon;
   }

   public String getIsbon(){return this.isbon;}
 }  
