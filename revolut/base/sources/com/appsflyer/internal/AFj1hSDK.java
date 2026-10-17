package com.appsflyer.internal;

import com.google.common.base.Ascii;
import com.google.common.primitives.UnsignedBytes;

/* JADX INFO: loaded from: classes.dex */
public final class AFj1hSDK {
    private static byte[] e = new byte[256];
    static final byte[] AFInAppEventType = new byte[256];
    static final int[] AFKeystoreWrapper = new int[256];
    static final int[] values = new int[256];
    static final int[] AFInAppEventParameterName = new int[256];
    static final int[] valueOf = new int[256];
    private static int[] AFLogger = new int[10];

    static {
        byte[] bArr;
        int i;
        byte b4 = 1;
        byte b5 = 1;
        do {
            b4 = (byte) (((b4 & 128) != 0 ? 27 : 0) ^ ((b4 << 1) ^ b4));
            byte b7 = (byte) (b5 ^ (b5 << 1));
            byte b13 = (byte) (b7 ^ (b7 << 2));
            byte b15 = (byte) (b13 ^ (b13 << 4));
            b5 = (byte) (b15 ^ ((b15 & 128) != 0 ? (byte) 9 : (byte) 0));
            bArr = e;
            i = b4 & UnsignedBytes.MAX_VALUE;
            int i2 = b5 & UnsignedBytes.MAX_VALUE;
            bArr[i] = (byte) (((((b5 ^ 99) ^ ((i2 << 1) | (i2 >> 7))) ^ ((i2 << 2) | (i2 >> 6))) ^ ((i2 << 3) | (i2 >> 5))) ^ ((i2 >> 4) | (i2 << 4)));
        } while (i != 1);
        bArr[0] = 99;
        for (int i3 = 0; i3 < 256; i3++) {
            int i5 = e[i3] & UnsignedBytes.MAX_VALUE;
            AFInAppEventType[i5] = (byte) i3;
            int i6 = i3 << 1;
            if (i6 >= 256) {
                i6 ^= 283;
            }
            int i21 = i6 << 1;
            if (i21 >= 256) {
                i21 ^= 283;
            }
            int i22 = i21 << 1;
            if (i22 >= 256) {
                i22 ^= 283;
            }
            int i32 = i22 ^ i3;
            int i33 = ((i6 ^ (i21 ^ i22)) << 24) | (i32 << 16) | ((i32 ^ i21) << 8) | (i32 ^ i6);
            AFKeystoreWrapper[i5] = i33;
            values[i5] = (i33 >>> 8) | (i33 << 24);
            AFInAppEventParameterName[i5] = (i33 >>> 16) | (i33 << 16);
            valueOf[i5] = (i33 << 8) | (i33 >>> 24);
        }
        AFLogger[0] = 16777216;
        int i43 = 1;
        for (int i59 = 1; i59 < 10; i59++) {
            i43 <<= 1;
            if (i43 >= 256) {
                i43 ^= 283;
            }
            AFLogger[i59] = i43 << 24;
        }
    }

    public static byte[][] AFInAppEventParameterName(int i) {
        byte[][] bArr = new byte[4][];
        for (int i2 = 0; i2 < 4; i2++) {
            int i3 = i >>> (i2 << 3);
            bArr[i2] = new byte[]{(byte) (i3 & 3), (byte) ((i3 >> 2) & 3), (byte) ((i3 >> 4) & 3), (byte) ((i3 >> 6) & 3)};
        }
        return bArr;
    }

    public static int[] AFInAppEventParameterName(byte[] bArr, int i) throws IllegalArgumentException {
        if (bArr.length == 16) {
            int i2 = 4;
            int i3 = (i + 1) * 4;
            int[] iArr = new int[i3];
            int i5 = 0;
            for (int i6 = 0; i6 < 4; i6++) {
                int i21 = i5 + 3;
                int i22 = ((bArr[i5 + 1] & UnsignedBytes.MAX_VALUE) << 16) | (bArr[i5] << Ascii.CAN) | ((bArr[i5 + 2] & UnsignedBytes.MAX_VALUE) << 8);
                i5 += 4;
                iArr[i6] = i22 | (bArr[i21] & UnsignedBytes.MAX_VALUE);
            }
            int i32 = 4;
            int i33 = 0;
            int i43 = 0;
            while (i32 < i3) {
                int i59 = iArr[i32 - 1];
                if (i33 == 0) {
                    byte[] bArr2 = e;
                    i59 = ((bArr2[i59 >>> 24] & UnsignedBytes.MAX_VALUE) | (((bArr2[(i59 >>> 16) & 255] << Ascii.CAN) | ((bArr2[(i59 >>> 8) & 255] & UnsignedBytes.MAX_VALUE) << 16)) | ((bArr2[i59 & 255] & UnsignedBytes.MAX_VALUE) << 8))) ^ AFLogger[i43];
                    i33 = 4;
                    i43++;
                }
                iArr[i32] = i59 ^ iArr[i32 - 4];
                i32++;
                i33--;
            }
            if (bArr.length == 16) {
                int[] iArr2 = new int[i3];
                int i66 = i * 4;
                iArr2[0] = iArr[i66];
                int i74 = 1;
                iArr2[1] = iArr[i66 + 1];
                iArr2[2] = iArr[i66 + 2];
                char c2 = 3;
                iArr2[3] = iArr[i66 + 3];
                int i92 = i66 - 4;
                while (i74 < i) {
                    int i96 = iArr[i92];
                    int[] iArr3 = AFKeystoreWrapper;
                    byte[] bArr3 = e;
                    int i99 = iArr3[bArr3[i96 >>> 24] & UnsignedBytes.MAX_VALUE];
                    int[] iArr4 = values;
                    int i100 = i99 ^ iArr4[bArr3[(i96 >>> 16) & 255] & UnsignedBytes.MAX_VALUE];
                    int[] iArr5 = AFInAppEventParameterName;
                    int i101 = i100 ^ iArr5[bArr3[(i96 >>> 8) & 255] & UnsignedBytes.MAX_VALUE];
                    int[] iArr6 = valueOf;
                    iArr2[i2] = iArr6[bArr3[i96 & 255] & UnsignedBytes.MAX_VALUE] ^ i101;
                    int i102 = iArr[i92 + 1];
                    char c3 = c2;
                    int[] iArr7 = iArr2;
                    iArr7[i2 + 1] = ((iArr4[bArr3[(i102 >>> 16) & 255] & UnsignedBytes.MAX_VALUE] ^ iArr3[bArr3[i102 >>> 24] & UnsignedBytes.MAX_VALUE]) ^ iArr5[bArr3[(i102 >>> 8) & 255] & UnsignedBytes.MAX_VALUE]) ^ iArr6[bArr3[i102 & 255] & UnsignedBytes.MAX_VALUE];
                    int i103 = iArr[i92 + 2];
                    int i104 = i2 + 3;
                    iArr7[i2 + 2] = iArr6[bArr3[i103 & 255] & UnsignedBytes.MAX_VALUE] ^ ((iArr3[bArr3[i103 >>> 24] & UnsignedBytes.MAX_VALUE] ^ iArr4[bArr3[(i103 >>> 16) & 255] & UnsignedBytes.MAX_VALUE]) ^ iArr5[bArr3[(i103 >>> 8) & 255] & UnsignedBytes.MAX_VALUE]);
                    int i105 = iArr[i92 + 3];
                    i2 += 4;
                    iArr7[i104] = iArr6[bArr3[i105 & 255] & UnsignedBytes.MAX_VALUE] ^ ((iArr3[bArr3[i105 >>> 24] & UnsignedBytes.MAX_VALUE] ^ iArr4[bArr3[(i105 >>> 16) & 255] & UnsignedBytes.MAX_VALUE]) ^ iArr5[bArr3[(i105 >>> 8) & 255] & UnsignedBytes.MAX_VALUE]);
                    i92 -= 4;
                    i74++;
                    c2 = c3;
                    iArr2 = iArr7;
                }
                int[] iArr8 = iArr2;
                iArr8[i2] = iArr[i92];
                iArr8[i2 + 1] = iArr[i92 + 1];
                iArr8[i2 + 2] = iArr[i92 + 2];
                iArr8[i2 + 3] = iArr[i92 + 3];
                return iArr8;
            }
            throw new IllegalArgumentException();
        }
        throw new IllegalArgumentException();
    }
}
