//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    print("введите кол-во рядов: ")
    val rows = readLine()!!.toInt()
    print("введите кол-во столбцов: ")
    val columns = readLine()!!.toInt()
    val array = Array(rows){ IntArray(columns) }
    val numbers = mutableSetOf<Char>()

        for(i in 0 until rows)
        {
            for(j in 0 until columns)
            {
                print("введите число: ")
                array[i][j] = readLine()!!.toInt()
                array[i][j].toString().forEach { numbers.add(it) }
            }
        }
    for(i in 0 until rows)
    {
        for(j in 0 until columns)
        {
            print("${array[i][j]} ")
        }
        println()
    }

    print(numbers.size)

}