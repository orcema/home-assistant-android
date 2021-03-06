package io.homeassistant.companion.android.data.integration

data class DiscoveryInfoResponse(
    val baseUrl: String,
    val locationName: String,
    val requiresApiPassword: Boolean,
    val version: String
)
