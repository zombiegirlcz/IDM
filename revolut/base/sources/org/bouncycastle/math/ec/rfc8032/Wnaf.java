package org.bouncycastle.math.ec.rfc8032;

/* JADX INFO: loaded from: classes14.dex */
abstract class Wnaf {
    public static void getSignedVar(int[] iArr, int i, byte[] bArr) {
        int length = iArr.length * 2;
        int[] iArr2 = new int[length];
        int i2 = iArr[iArr.length - 1] >> 31;
        int length2 = iArr.length;
        int i3 = length;
        while (true) {
            length2--;
            if (length2 < 0) {
                break;
            }
            int i5 = iArr[length2];
            iArr2[i3 - 1] = (i2 << 16) | (i5 >>> 16);
            i3 -= 2;
            iArr2[i3] = i5;
            i2 = i5;
        }
        int i6 = 32 - i;
        int i21 = 0;
        int i22 = 0;
        int i32 = 0;
        while (i21 < length) {
            int i33 = iArr2[i21];
            while (i22 < 16) {
                int i43 = i33 >>> i22;
                if ((i43 & 1) == i32) {
                    i22++;
                } else {
                    int i59 = (i43 | 1) << i6;
                    bArr[(i21 << 4) + i22] = (byte) (i59 >> i6);
                    i22 += i;
                    i32 = i59 >>> 31;
                }
            }
            i21++;
            i22 -= 16;
        }
    }
}
