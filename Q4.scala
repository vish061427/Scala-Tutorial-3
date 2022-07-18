object Q4 extends App {
  def calcPrice(copies:Int):Double= {
    
    var coverPrice = copies*(24.95)*(0.6)

     if (copies>50){
      var shippingCost = 50*3 + (copies-50)*(0.75)
      return shippingCost + coverPrice
     }
    else{
      var shippingCost = copies*3
      return shippingCost + coverPrice
     }
  }

  println("The total wholesale cost for 60 copies is "+ calcPrice(60));
}
