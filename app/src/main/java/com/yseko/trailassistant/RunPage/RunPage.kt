//package com.yseko.trailassistant.RunPage
//
//import android.location.LocationRequest
//import androidx.compose.foundation.layout.fillMaxSize
//import androidx.compose.foundation.lazy.LazyColumn
//import androidx.compose.foundation.lazy.LazyRow
//import androidx.compose.runtime.Composable
//import androidx.compose.ui.Modifier
//import com.google.android.gms.maps.model.CameraPosition
//import com.google.android.gms.maps.model.LatLng
//import com.google.maps.android.compose.GoogleMap
//import com.google.maps.android.compose.Marker
//import com.google.maps.android.compose.MarkerState
//import com.google.maps.android.compose.rememberCameraPositionState
//
//
//@Composable
//fun RunPage(){
//
//}
//
//
//@Composable
//fun MapSection(){
//    val singapore = LatLng(1.35, 103.87)
//    val cameraPositionState = rememberCameraPositionState {
//        position = CameraPosition.fromLatLngZoom(singapore, 10f)
//    }
//    GoogleMap(
//        modifier = Modifier.fillMaxSize(),
//        cameraPositionState = cameraPositionState
//    ) {
//        Marker(
//            state = MarkerState(position = singapore),
//            title = "Singapore",
//            snippet = "Marker in Singapore"
//        )
//    }
//}
//
//@Composable
//fun PlacesSection(){
//    LazyColumn(
//        modifier = Modifier
//    ){
//    }
//}
//
//@Composable
//fun PlacesRow(places: List<Place>){
//    LazyRow(
//        modifier = Modifier
//    ){
//        items(places){place->
//            Place(place)
//        }
//    }
//}
//
//@Composable
//fun Place(place: Place){
//
//}