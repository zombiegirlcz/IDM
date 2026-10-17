package org.bouncycastle.pqc.crypto.frodo;

/* JADX INFO: loaded from: classes14.dex */
abstract class Noise {
    public static void sample(short[] sArr, short[] sArr2, int i, short[] sArr3) {
        int length = sArr3.length;
        for (int i2 = 0; i2 < length; i2++) {
            short s2 = sArr2[i + i2];
            int i3 = (65535 & s2) >>> 1;
            int i5 = s2 & 1;
            int i6 = 0;
            for (int i21 = 0; i21 < sArr.length - 1; i21++) {
                i6 += (sArr[i21] - i3) >>> 31;
            }
            sArr3[i2] = (short) (((-i5) ^ i6) + i5);
        }
    }
}
