package com.appsflyer.internal;

/* JADX INFO: loaded from: classes.dex */
public class AFj1cSDK {
    public static void values(byte[] bArr, byte b4, long j2) {
        for (int i = 0; i < bArr.length; i++) {
            if (((1 << i) & j2) != 0) {
                bArr[i] = (byte) (bArr[i] ^ b4);
            }
        }
    }
}
