package org.bouncycastle.pqc.crypto.cmce;

import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes14.dex */
class Utils {
    public static short bitrev(short s2, int i) {
        short s3 = (short) (((s2 & 65280) >> 8) | ((s2 & 255) << 8));
        short s4 = (short) (((s3 & 61680) >> 4) | ((s3 & 3855) << 4));
        short s6 = (short) (((s4 & 52428) >> 2) | ((s4 & 13107) << 2));
        short s11 = (short) (((s6 & 43690) >> 1) | ((s6 & 21845) << 1));
        return (short) (i == 12 ? s11 >> 4 : s11 >> 3);
    }

    public static int load4(byte[] bArr, int i) {
        return Pack.littleEndianToInt(bArr, i);
    }

    public static long load8(byte[] bArr, int i) {
        return Pack.littleEndianToLong(bArr, i);
    }

    public static short load_gf(byte[] bArr, int i, int i2) {
        return (short) (Pack.littleEndianToShort(bArr, i) & i2);
    }

    public static void store8(byte[] bArr, int i, long j2) {
        bArr[i] = (byte) (j2 & 255);
        bArr[i + 1] = (byte) ((j2 >> 8) & 255);
        bArr[i + 2] = (byte) ((j2 >> 16) & 255);
        bArr[i + 3] = (byte) ((j2 >> 24) & 255);
        bArr[i + 4] = (byte) ((j2 >> 32) & 255);
        bArr[i + 5] = (byte) ((j2 >> 40) & 255);
        bArr[i + 6] = (byte) ((j2 >> 48) & 255);
        bArr[i + 7] = (byte) ((j2 >> 56) & 255);
    }

    public static void store_gf(byte[] bArr, int i, short s2) {
        bArr[i] = (byte) (s2 & 255);
        bArr[i + 1] = (byte) (s2 >> 8);
    }
}
