package org.bouncycastle.crypto.threshold;

import com.google.common.primitives.UnsignedBytes;
import java.io.IOException;
import java.lang.reflect.Array;
import org.bouncycastle.crypto.threshold.ShamirSecretSplitter;

/* JADX INFO: loaded from: classes14.dex */
public class ShamirSplitSecret implements SplitSecret {
    private final Polynomial poly;
    private final ShamirSplitSecretShare[] secretShares;

    public ShamirSplitSecret(Polynomial polynomial, ShamirSplitSecretShare[] shamirSplitSecretShareArr) {
        this.secretShares = shamirSplitSecretShareArr;
        this.poly = polynomial;
    }

    public ShamirSplitSecret divide(int i) throws IOException {
        int i2 = 0;
        while (true) {
            ShamirSplitSecretShare[] shamirSplitSecretShareArr = this.secretShares;
            if (i2 >= shamirSplitSecretShareArr.length) {
                return this;
            }
            byte[] encoded = shamirSplitSecretShareArr[i2].getEncoded();
            for (int i3 = 0; i3 < encoded.length; i3++) {
                encoded[i3] = this.poly.gfDiv(encoded[i3] & UnsignedBytes.MAX_VALUE, i);
            }
            int i5 = i2 + 1;
            this.secretShares[i2] = new ShamirSplitSecretShare(encoded, i5);
            i2 = i5;
        }
    }

    @Override // org.bouncycastle.crypto.threshold.SplitSecret
    public byte[] getSecret() throws IOException {
        ShamirSplitSecretShare[] shamirSplitSecretShareArr = this.secretShares;
        int length = shamirSplitSecretShareArr.length;
        byte[] bArr = new byte[length];
        int i = length - 1;
        byte[] bArr2 = new byte[i];
        byte[][] bArr3 = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, length, shamirSplitSecretShareArr[0].getEncoded().length);
        for (int i2 = 0; i2 < length; i2++) {
            bArr3[i2] = this.secretShares[i2].getEncoded();
            byte b4 = 0;
            for (int i3 = 0; i3 < length; i3++) {
                if (i3 != i2) {
                    Polynomial polynomial = this.poly;
                    ShamirSplitSecretShare[] shamirSplitSecretShareArr2 = this.secretShares;
                    int i5 = shamirSplitSecretShareArr2[i3].f228577r;
                    bArr2[b4] = polynomial.gfDiv(i5, shamirSplitSecretShareArr2[i2].f228577r ^ i5);
                    b4 = (byte) (b4 + 1);
                }
            }
            byte bGfMul = 1;
            for (int i6 = 0; i6 != i; i6++) {
                bGfMul = this.poly.gfMul(bGfMul & UnsignedBytes.MAX_VALUE, bArr2[i6] & UnsignedBytes.MAX_VALUE);
            }
            bArr[i2] = bGfMul;
        }
        return this.poly.gfVecMul(bArr, bArr3);
    }

    public ShamirSplitSecret multiple(int i) throws IOException {
        int i2 = 0;
        while (true) {
            ShamirSplitSecretShare[] shamirSplitSecretShareArr = this.secretShares;
            if (i2 >= shamirSplitSecretShareArr.length) {
                return this;
            }
            byte[] encoded = shamirSplitSecretShareArr[i2].getEncoded();
            for (int i3 = 0; i3 < encoded.length; i3++) {
                encoded[i3] = this.poly.gfMul(encoded[i3] & UnsignedBytes.MAX_VALUE, i);
            }
            int i5 = i2 + 1;
            this.secretShares[i2] = new ShamirSplitSecretShare(encoded, i5);
            i2 = i5;
        }
    }

    public ShamirSplitSecret(ShamirSecretSplitter.Algorithm algorithm, ShamirSecretSplitter.Mode mode, ShamirSplitSecretShare[] shamirSplitSecretShareArr) {
        this.secretShares = shamirSplitSecretShareArr;
        this.poly = Polynomial.newInstance(algorithm, mode);
    }

    @Override // org.bouncycastle.crypto.threshold.SplitSecret
    public ShamirSplitSecretShare[] getSecretShares() {
        return this.secretShares;
    }
}
