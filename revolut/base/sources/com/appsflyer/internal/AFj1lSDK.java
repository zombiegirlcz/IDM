package com.appsflyer.internal;

/* JADX INFO: loaded from: classes.dex */
public final class AFj1lSDK {
    private static void AFInAppEventParameterName(int[] iArr) {
        for (int i = 0; i < iArr.length / 2; i++) {
            int i2 = iArr[i];
            iArr[i] = iArr[(iArr.length - i) - 1];
            iArr[(iArr.length - i) - 1] = i2;
        }
    }

    public static void AFKeystoreWrapper(int i, int i2, boolean z, int i3, int[] iArr, int[][] iArr2, int[] iArr3) {
        if (!z) {
            AFInAppEventParameterName(iArr);
        }
        int i5 = 0;
        while (i5 < i3) {
            int i6 = i ^ iArr[i5];
            int i21 = i2 ^ ((iArr2[2][(i6 >>> 8) & 255] ^ (iArr2[0][i6 >>> 24] + iArr2[1][(i6 >>> 16) & 255])) + iArr2[3][i6 & 255]);
            i5++;
            i2 = i6;
            i = i21;
        }
        int i22 = i ^ iArr[iArr.length - 2];
        int i32 = i2 ^ iArr[iArr.length - 1];
        if (!z) {
            AFInAppEventParameterName(iArr);
        }
        iArr3[0] = i32;
        iArr3[1] = i22;
    }
}
