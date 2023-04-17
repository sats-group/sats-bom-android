@file:Suppress("UnstableApiUsage")

plugins {
    `java-platform`
    id("com.vanniktech.maven.publish") version "0.25.2"
}

mavenPublishing {
    val versionName = System.getenv("VERSION_NAME") ?: "dev"

    coordinates("com.sats.sats-bom", "sats-bom", versionName)
}

publishing {
    repositories {
        maven {
            name
            url = uri("https://maven.pkg.github.com/sats-group/sats-bom-android")

            credentials {
                username = providers.gradleProperty("github.packages.username").orNull
                    ?: System.getenv("GH_PACKAGES_USERNAME")

                password = providers.gradleProperty("github.packages.password").orNull
                    ?: System.getenv("GH_PACKAGES_PASSWORD")
            }
        }
    }
}

javaPlatform {
    allowDependencies() // to forward other platforms
}

dependencies {
    constraints {
        api(libs.accompanist.insetsUi)
        api(libs.accompanist.navigation.animation)
        api(libs.accompanist.navigation.material)
        api(libs.accompanist.pager)
        api(libs.accompanist.pagerIndicator)
        api(libs.accompanist.permissions)
        api(libs.accompanist.placeholder)
        api(libs.accompanist.systemUiController)
        api(libs.accompanist.webview)
        api(libs.android.desugarJdkLibs)
        api(libs.androidx.activity.activity)
        api(libs.androidx.activity.compose)
        api(libs.androidx.appcompat)
        api(libs.androidx.browser)
        api(libs.androidx.camera)
        api(libs.androidx.camera.lifecycle)
        api(libs.androidx.camera.view)
        api(libs.androidx.cardView)
        api(libs.androidx.compose.animation)
        api(libs.androidx.compose.foundation)
        api(libs.androidx.compose.material)
        api(libs.androidx.compose.material.icons.core)
        api(libs.androidx.compose.material.icons.extended)
        api(libs.androidx.compose.runtime)
        api(libs.androidx.compose.runtime.livedata)
        api(libs.androidx.compose.runtime.runtime)
        api(libs.androidx.compose.ui)
        api(libs.androidx.compose.ui.test)
        api(libs.androidx.compose.ui.testManifest)
        api(libs.androidx.compose.ui.tooling)
        api(libs.androidx.compose.ui.tooling.preview)
        api(libs.androidx.constraintLayout)
        api(libs.androidx.core)
        api(libs.androidx.core.splashscreen)
        api(libs.androidx.dataStore.preferences)
        api(libs.androidx.fragment)
        api(libs.androidx.glance.app.widget)
        api(libs.androidx.hilt.compiler)
        api(libs.androidx.hilt.navigation.compose)
        api(libs.androidx.lifecycle.commonJava8)
        api(libs.androidx.lifecycle.liveData)
        api(libs.androidx.lifecycle.runtime)
        api(libs.androidx.lifecycle.viewModel)
        api(libs.androidx.lifecycle.viewModel.compose)
        api(libs.androidx.localBroadcastManager)
        api(libs.androidx.navigation.compose)
        api(libs.androidx.navigation.fragment)
        api(libs.androidx.navigation.ui)
        api(libs.androidx.paging.common)
        api(libs.androidx.paging.compose)
        api(libs.androidx.paging.runtime)
        api(libs.androidx.preferences)
        api(libs.androidx.recyclerView)
        api(libs.androidx.room.compiler)
        api(libs.androidx.room.ktx)
        api(libs.androidx.room.runtime)
        api(libs.androidx.swipeRefreshLayout)
        api(libs.androidx.test.core)
        api(libs.androidx.test.espresso.core)
        api(libs.androidx.test.espresso.intents)
        api(libs.androidx.test.junit)
        api(libs.androidx.test.orchestrator)
        api(libs.androidx.test.rules)
        api(libs.androidx.test.runner)
        api(libs.arrow.core)
        api(libs.arrow.optics)
        api(libs.arrow.optics.ksp)
        api(libs.coil.compose)
        api(libs.commonmark)
        api(libs.dagger.hilt.compiler)
        api(libs.dagger.hilt.runtime)
        api(libs.dagger.hilt.testing)
        api(libs.dokar.sheets)
        api(libs.firebase.analytics)
        api(libs.firebase.config)
        api(libs.firebase.crashlytics.runtime)
        api(libs.firebase.messaging)
        api(libs.glide.runtime)
        api(libs.google.material)
        api(libs.google.mlkit.barcode)
        api(libs.google.play.review)
        api(libs.google.play.review.ktx)
        api(libs.google.playServices.base)
        api(libs.google.playServices.location)
        api(libs.google.playServices.vision)
        api(libs.google.playServices.vision.common)
        api(libs.jetbrains.annotations)
        api(libs.junit4)
        api(libs.kotlin.reflect)
        api(libs.kotlin.stdLib)
        api(libs.kotlinx.coroutines.android)
        api(libs.kotlinx.coroutines.core)
        api(libs.kotlinx.coroutines.playServices)
        api(libs.kotlinx.coroutines.test)
        api(libs.kotlinx.datetime)
        api(libs.kotlinx.serialization.json)
        api(libs.ktor.client.cio)
        api(libs.ktor.client.contentNegotiation)
        api(libs.ktor.client.core)
        api(libs.ktor.client.logging)
        api(libs.ktor.client.mock)
        api(libs.ktor.serialization.kotlinx.json)
        api(libs.lottie.compose)
        api(libs.salesforce.marketingCloud)
        api(libs.shimmer)
        api(libs.slf4j.android)
        api(libs.slf4j.simple)
        api(libs.snapper)
        api(libs.turbine)
        api(libs.viewBindingPropertyDelegate)
        api(libs.zxing)
    }

    api(platform(libs.firebase.bom))
    api(platform(libs.androidx.compose.bom))
}
