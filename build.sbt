import AssemblyKeys._

assemblySettings

name := "pio-template-text-similarity"

organization := "com.kolibero"

scalaVersion := "2.11.12"

libraryDependencies ++= Seq(
  "org.apache.predictionio" %% "apache-predictionio-core" % "0.14.0" % "provided",
  "org.apache.spark"        %% "spark-core"               % "2.4.0"             % "provided",
  "org.apache.spark"        %% "spark-mllib"              % "2.4.0"             % "provided")
