package com.example.myapp

import android.graphics.Bitmap
import android.media.Image
import com.google.android.gms.maps.model.LatLng
import java.time.LocalDateTime

data class User(

    var name: String = "",
    var email: String = "",
    var uId: String = ""

)
{
    constructor(): this("", "", "")


}

data class Contents(
    var name: String="",//id
    var title: String="",
    var content: String="",
    var location: String="",
    var proceeding: Boolean=true,
    var category: String="",
    var finding: Boolean=true,
    var dateTime: String = "",
    var lat: Double = 0.0,
    var lng : Double = 0.0)