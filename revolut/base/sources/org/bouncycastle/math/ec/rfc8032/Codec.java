package org.bouncycastle.math.ec.rfc8032;

import com.google.common.base.Ascii;
import com.google.common.primitives.UnsignedBytes;

/* JADX INFO: loaded from: classes14.dex */
abstract class Codec {
    public static int decode16(byte[] bArr, int i) {
        return ((bArr[i + 1] & UnsignedBytes.MAX_VALUE) << 8) | (bArr[i] & UnsignedBytes.MAX_VALUE);
    }

    public static int decode24(byte[] bArr, int i) {
        return ((bArr[i + 2] & UnsignedBytes.MAX_VALUE) << 16) | (bArr[i] & UnsignedBytes.MAX_VALUE) | ((bArr[i + 1] & UnsignedBytes.MAX_VALUE) << 8);
    }

    public static int decode32(byte[] bArr, int i) {
        return (bArr[i + 3] << Ascii.CAN) | (bArr[i] & UnsignedBytes.MAX_VALUE) | ((bArr[i + 1] & UnsignedBytes.MAX_VALUE) << 8) | ((bArr[i + 2] & UnsignedBytes.MAX_VALUE) << 16);
    }

    public static void encode24(int i, byte[] bArr, int i2) {
        bArr[i2] = (byte) i;
        bArr[i2 + 1] = (byte) (i >>> 8);
        bArr[i2 + 2] = (byte) (i >>> 16);
    }

    public static void encode32(int i, byte[] bArr, int i2) {
        bArr[i2] = (byte) i;
        bArr[i2 + 1] = (byte) (i >>> 8);
        bArr[i2 + 2] = (byte) (i >>> 16);
        bArr[i2 + 3] = (byte) (i >>> 24);
    }

    public static void encode56(long j2, byte[] bArr, int i) {
        encode32((int) j2, bArr, i);
        encode24((int) (j2 >>> 32), bArr, i + 4);
    }

    public static void decode32(byte[] bArr, int i, int[] iArr, int i2, int i3) {
        for (int i5 = 0; i5 < i3; i5++) {
            iArr[i2 + i5] = decode32(bArr, (i5 * 4) + i);
        }
    }

    public static void encode32(int[] iArr, int i, int i2, byte[] bArr, int i3) {
        for (int i5 = 0; i5 < i2; i5++) {
            encode32(iArr[i + i5], bArr, (i5 * 4) + i3);
        }
    }
}
