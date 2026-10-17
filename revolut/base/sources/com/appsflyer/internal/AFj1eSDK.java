package com.appsflyer.internal;

/* JADX INFO: loaded from: classes16.dex */
public final class AFj1eSDK {
    public int AFInAppEventParameterName;
    public int values;

    public static char[] values(long j2, char[] cArr, int i) {
        int length = cArr.length;
        char[] cArr2 = new char[length];
        int i2 = 0;
        int i3 = 0;
        int i5 = 4;
        while (i2 < cArr.length) {
            if ((((j2 >>> i2) & 1) != i || i3 >= 4) && i5 < length) {
                cArr2[i5] = cArr[i2];
                i5++;
                i2++;
            } else {
                cArr2[i3] = cArr[i2];
                i3++;
                i2++;
            }
        }
        return cArr2;
    }
}
