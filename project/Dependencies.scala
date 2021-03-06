import sbt._

object Dependencies {

  val scala = "2.11.8"

  val baseDependencies = Seq(
    "org.scala-lang" % "scala-compiler" % scala % "compile",
    "org.scala-lang" % "scala-library" % scala % "compile",
    "org.scala-lang" % "scala-reflect" % scala % "compile",
    "com.typesafe" % "config" % "1.2.1" % "compile",
    "junit" % "junit" % "4.4",
    "com.github.tototoshi" % "scala-csv_2.11" % "1.1.2" % "compile",
    "org.scala-lang" % "jline" % "2.11.0-M3" % "compile",
    "org.scalaforge" % "scalax" % "0.1" % "compile",
    "org.scala-lang" % "scala-pickling_2.11" % "0.9.1" % "compile",
    "org.scalaz" %% "scalaz-core" % "7.2.0",
    "org.scalactic" % "scalactic_2.11" % "2.2.6",
    "org.scalatest" % "scalatest_2.11" % "2.2.6" % "test",
    "com.typesafe.akka" %% "akka-stream" % "2.4.6",
    "com.github.scopt" % "scopt_2.11" % "3.5.0",
    "com.github.transcendent-ai-labs.DynaML" % "dynaml_2.11" % "v1.4.2-beta.1",
    "org.scodec" % "scodec-core_2.11" % "1.10.2",
    "org.scodec" % "scodec-bits_2.11" % "1.1.1",
    "org.scodec" % "scodec-stream_2.11" % "1.0.0",
    "org.scodec" % "scodec-scalaz_2.11" % "1.3.0"
  )

  val loggingDependency = Seq("log4j" % "log4j" % "1.2.17" % "compile")

}