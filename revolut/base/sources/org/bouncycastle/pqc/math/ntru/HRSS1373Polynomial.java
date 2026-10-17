package org.bouncycastle.pqc.math.ntru;

import com.google.common.primitives.UnsignedBytes;
import org.bouncycastle.crypto.hpke.HPKE;
import org.bouncycastle.pqc.math.ntru.parameters.NTRUHRSSParameterSet;

/* JADX INFO: loaded from: classes14.dex */
public class HRSS1373Polynomial extends HRSSPolynomial {
    private static final int K = 86;
    private static final int L = 1376;
    private static final int M = 344;

    public HRSS1373Polynomial(NTRUHRSSParameterSet nTRUHRSSParameterSet) {
        super(nTRUHRSSParameterSet);
    }

    @Override // org.bouncycastle.pqc.math.ntru.HRSSPolynomial, org.bouncycastle.pqc.math.ntru.Polynomial
    public void sqFromBytes(byte[] bArr) {
        int i = 0;
        while (i < this.params.packDegree() / 4) {
            short[] sArr = this.coeffs;
            int i2 = i * 4;
            int i3 = i * 7;
            int i5 = bArr[i3] & UnsignedBytes.MAX_VALUE;
            byte b4 = bArr[i3 + 1];
            sArr[i2] = (short) (i5 | ((((short) (b4 & UnsignedBytes.MAX_VALUE)) & 63) << 8));
            int i6 = ((b4 & UnsignedBytes.MAX_VALUE) >>> 6) | (((short) (bArr[i3 + 2] & UnsignedBytes.MAX_VALUE)) << 2);
            byte b5 = bArr[i3 + 3];
            sArr[i2 + 1] = (short) (i6 | (((short) (b5 & 15)) << 10));
            int i21 = ((b5 & UnsignedBytes.MAX_VALUE) >>> 4) | ((((short) (bArr[i3 + 4] & UnsignedBytes.MAX_VALUE)) & 255) << 4);
            byte b7 = bArr[i3 + 5];
            sArr[i2 + 2] = (short) (i21 | (((short) (b7 & 3)) << 12));
            sArr[i2 + 3] = (short) (((b7 & UnsignedBytes.MAX_VALUE) >>> 2) | (((short) (bArr[i3 + 6] & UnsignedBytes.MAX_VALUE)) << 6));
            i++;
        }
        if (this.params.packDegree() % 4 == 2) {
            short[] sArr2 = this.coeffs;
            int i22 = i * 4;
            int i32 = i * 7;
            byte b13 = bArr[i32];
            byte b15 = bArr[i32 + 1];
            sArr2[i22] = (short) (b13 | ((b15 & 63) << 8));
            sArr2[i22 + 1] = (short) (((bArr[i32 + 3] & 15) << 10) | (bArr[i32 + 2] << 2) | (b15 >>> 6));
        }
        this.coeffs[this.params.n() - 1] = 0;
    }

    @Override // org.bouncycastle.pqc.math.ntru.HRSSPolynomial, org.bouncycastle.pqc.math.ntru.Polynomial
    public byte[] sqToBytes(int i) {
        byte[] bArr = new byte[i];
        short[] sArr = new short[4];
        int i2 = 0;
        while (i2 < this.params.packDegree() / 4) {
            for (int i3 = 0; i3 < 4; i3++) {
                sArr[i3] = (short) Polynomial.modQ(this.coeffs[(i2 * 4) + i3] & HPKE.aead_EXPORT_ONLY, this.params.q());
            }
            int i5 = i2 * 7;
            short s2 = sArr[0];
            bArr[i5] = (byte) (s2 & 255);
            short s3 = sArr[1];
            bArr[i5 + 1] = (byte) ((s2 >>> 8) | ((s3 & 3) << 6));
            bArr[i5 + 2] = (byte) ((s3 >>> 2) & 255);
            short s4 = sArr[2];
            bArr[i5 + 3] = (byte) ((s3 >>> 10) | ((s4 & 15) << 4));
            bArr[i5 + 4] = (byte) ((s4 >>> 4) & 255);
            short s6 = sArr[3];
            bArr[i5 + 5] = (byte) ((s4 >>> 12) | ((s6 & 63) << 2));
            bArr[i5 + 6] = (byte) (s6 >>> 6);
            i2++;
        }
        if (this.params.packDegree() % 4 == 2) {
            sArr[0] = (short) Polynomial.modQ(this.coeffs[this.params.packDegree() - 2] & HPKE.aead_EXPORT_ONLY, this.params.q());
            short sModQ = (short) Polynomial.modQ(this.coeffs[this.params.packDegree() - 1] & HPKE.aead_EXPORT_ONLY, this.params.q());
            sArr[1] = sModQ;
            int i6 = i2 * 7;
            short s11 = sArr[0];
            bArr[i6] = (byte) (s11 & 255);
            bArr[i6 + 1] = (byte) ((s11 >>> 8) | ((sModQ & 3) << 6));
            bArr[i6 + 2] = (byte) ((sModQ >>> 2) & 255);
            bArr[i6 + 3] = (byte) (sModQ >>> 10);
        }
        return bArr;
    }
}
