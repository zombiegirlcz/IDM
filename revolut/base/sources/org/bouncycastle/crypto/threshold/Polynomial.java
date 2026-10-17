package org.bouncycastle.crypto.threshold;

import com.google.common.primitives.UnsignedBytes;
import org.bouncycastle.crypto.threshold.ShamirSecretSplitter;

/* JADX INFO: loaded from: classes14.dex */
abstract class Polynomial {
    public static Polynomial newInstance(ShamirSecretSplitter.Algorithm algorithm, ShamirSecretSplitter.Mode mode) {
        return mode == ShamirSecretSplitter.Mode.Native ? new PolynomialNative(algorithm) : new PolynomialTable(algorithm);
    }

    public abstract byte gfDiv(int i, int i2);

    public abstract byte gfMul(int i, int i2);

    public byte gfPow(int i, byte b4) {
        byte bGfMul = 1;
        for (int i2 = 0; i2 < 8; i2++) {
            if (((1 << i2) & b4) != 0) {
                bGfMul = gfMul(bGfMul & UnsignedBytes.MAX_VALUE, i & 255);
            }
            int i3 = i & 255;
            i = gfMul(i3, i3);
        }
        return bGfMul;
    }

    public byte[] gfVecMul(byte[] bArr, byte[][] bArr2) {
        byte[] bArr3 = new byte[bArr2[0].length];
        for (int i = 0; i < bArr2[0].length; i++) {
            int iGfMul = 0;
            for (int i2 = 0; i2 < bArr.length; i2++) {
                iGfMul ^= gfMul(bArr[i2] & UnsignedBytes.MAX_VALUE, bArr2[i2][i] & UnsignedBytes.MAX_VALUE);
            }
            bArr3[i] = (byte) iGfMul;
        }
        return bArr3;
    }
}
