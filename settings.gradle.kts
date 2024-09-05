pluginManagement {
    val kotlinVersion: String by settings
    plugins {
        kotlin("jvm") version "2.0.0"
    }

}
plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.8.0"
}
rootProject.name = "KotlinService"


include("m1l1-first")
