object test {

  val b = List(1, 2, 3);

  def main(args: Array[String]) =
   System.out.println(
    b match {
      case List(1, 2, 3) => true;
      case _ => false;
    }
  )

}
