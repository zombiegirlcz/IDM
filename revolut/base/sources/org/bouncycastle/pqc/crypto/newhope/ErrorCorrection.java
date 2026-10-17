package org.bouncycastle.pqc.crypto.newhope;

import com.google.android.material.internal.ViewUtils;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes14.dex */
class ErrorCorrection {
    public static short LDDecode(int i, int i2, int i3, int i5) {
        return (short) (((((g(i) + g(i2)) + g(i3)) + g(i5)) - 98312) >>> 31);
    }

    public static int abs(int i) {
        int i2 = i >> 31;
        return (i ^ i2) - i2;
    }

    public static int f(int[] iArr, int i, int i2, int i3) {
        int i5 = (i3 * 2730) >> 25;
        int i6 = i5 - ((12288 - (i3 - (i5 * 12289))) >> 31);
        iArr[i] = (i6 >> 1) + (i6 & 1);
        int i21 = i6 - 1;
        iArr[i2] = (i21 >> 1) + (i21 & 1);
        return abs(i3 - (iArr[i] * 24578));
    }

    public static int g(int i) {
        int i2 = (i * 2730) >> 27;
        int i3 = i2 - ((49155 - (i - (49156 * i2))) >> 31);
        return abs((((i3 >> 1) + (i3 & 1)) * 98312) - i);
    }

    public static void helpRec(short[] sArr, short[] sArr2, byte[] bArr, byte b4) {
        short s2 = 8;
        byte[] bArr2 = new byte[8];
        bArr2[0] = b4;
        byte[] bArr3 = new byte[32];
        ChaCha20.process(bArr, bArr2, bArr3, 0, 32);
        int[] iArr = new int[8];
        int i = 0;
        while (i < 256) {
            int i2 = ((bArr3[i >>> 3] >>> (i & 7)) & 1) * 4;
            int i3 = i + 256;
            int i5 = i + 512;
            int iF = f(iArr, 0, 4, (sArr2[i] * s2) + i2) + f(iArr, 1, 5, (sArr2[i3] * s2) + i2) + f(iArr, 2, 6, (sArr2[i5] * s2) + i2);
            int i6 = i + ViewUtils.EDGE_TO_EDGE_FLAGS;
            int iF2 = (24577 - (iF + f(iArr, 3, 7, (sArr2[i6] * s2) + i2))) >> 31;
            int i21 = ~iF2;
            int[] iArr2 = {(i21 & iArr[0]) ^ (iArr[4] & iF2), (i21 & iArr[1]) ^ (iArr[5] & iF2), (i21 & iArr[2]) ^ (iArr[6] & iF2), (iArr[7] & iF2) ^ (i21 & iArr[3])};
            int i22 = iArr2[0];
            int i32 = iArr2[3];
            sArr[i] = (short) ((i22 - i32) & 3);
            sArr[i3] = (short) ((iArr2[1] - i32) & 3);
            sArr[i5] = (short) ((iArr2[2] - i32) & 3);
            sArr[i6] = (short) (((i32 * 2) + (-iF2)) & 3);
            i++;
            s2 = 8;
        }
    }

    public static void rec(byte[] bArr, short[] sArr, short[] sArr2) {
        Arrays.fill(bArr, (byte) 0);
        for (int i = 0; i < 256; i++) {
            int i2 = (sArr[i] * 8) + 196624;
            int i3 = sArr2[i] * 2;
            int i5 = i + ViewUtils.EDGE_TO_EDGE_FLAGS;
            short s2 = sArr2[i5];
            int i6 = i2 - ((i3 + s2) * 12289);
            int i21 = i + 256;
            int i22 = ((sArr[i21] * 8) + 196624) - (((sArr2[i21] * 2) + s2) * 12289);
            int i32 = i + 512;
            int[] iArr = {i6, i22, ((sArr[i32] * 8) + 196624) - (((sArr2[i32] * 2) + s2) * 12289), ((sArr[i5] * 8) + 196624) - (s2 * 12289)};
            int i33 = i >>> 3;
            bArr[i33] = (byte) ((LDDecode(iArr[0], iArr[1], iArr[2], iArr[3]) << (i & 7)) | bArr[i33]);
        }
    }
}
