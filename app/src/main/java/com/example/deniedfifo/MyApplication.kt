package com.example.deniedfifo

import android.app.Application
import io.realm.Realm
import io.realm.RealmConfiguration
import io.realm.log.LogLevel

class MyApplication: Application() {
    override fun onCreate() {
        super.onCreate()

        val config =
            RealmConfiguration.Builder()
                .log(LogLevel.ALL)
                .schema(
                    setOf(AnObject::class)
                )
                .build()

        // this fails:
        val realm = Realm(config)
    }
}