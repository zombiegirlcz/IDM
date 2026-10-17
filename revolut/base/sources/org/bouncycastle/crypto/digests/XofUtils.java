package org.bouncycastle.crypto.digests;

import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes14.dex */
public class XofUtils {
    public static byte[] encode(byte b4) {
        return Arrays.concatenate(leftEncode(8L), new byte[]{b4});
    }

    public static byte[] leftEncode(long j2) {
        long j3 = j2;
        byte b4 = 1;
        while (true) {
            j3 >>= 8;
            if (j3 == 0) {
                break;
            }
            b4 = (byte) (b4 + 1);
        }
        byte[] bArr = new byte[b4 + 1];
        bArr[0] = b4;
        for (int i = 1; i <= b4; i++) {
            bArr[i] = (byte) (j2 >> ((b4 - i) * 8));
        }
        return bArr;
    }

    public static byte[] rightEncode(long j2) {
        long j3 = j2;
        byte b4 = 1;
        while (true) {
            j3 >>= 8;
            if (j3 == 0) {
                break;
            }
            b4 = (byte) (b4 + 1);
        }
        byte[] bArr = new byte[b4 + 1];
        bArr[b4] = b4;
        for (int i = 0; i < b4; i++) {
            bArr[i] = (byte) (j2 >> (((b4 - i) - 1) * 8));
        }
        return bArr;
    }

    public static byte[] encode(byte[] bArr, int i, int i2) {
        return bArr.length == i2 ? Arrays.concatenate(leftEncode(i2 * 8), bArr) : Arrays.concatenate(leftEncode(i2 * 8), Arrays.copyOfRange(bArr, i, i2 + i));
    }
}
