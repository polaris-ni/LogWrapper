package com.treasure.log

/**
 * @date 2022/5/25
 * @author Liangyong Ni
 * description ExceptionKtx
 */
fun Throwable.printOnDebug() {
    if (Log.isDebug()) {
        printStackTrace()
    }
}