package me.kcra.hydrazine.utils

data class ProtocolData(
    val minecraftVersion: String,
    val version: Int,
    val dataVersion: Int,
    val usesNetty: Boolean,
    val majorVersion: String
)
