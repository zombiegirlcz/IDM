package org.bouncycastle.pqc.math.ntru;

import com.google.common.primitives.UnsignedBytes;
import org.bouncycastle.crypto.hpke.HPKE;
import org.bouncycastle.pqc.math.ntru.parameters.NTRUHPSParameterSet;

/* JADX INFO: loaded from: classes14.dex */
public class HPS4096Polynomial extends HPSPolynomial {
    public HPS4096Polynomial(NTRUHPSParameterSet nTRUHPSParameterSet) {
        super(nTRUHPSParameterSet);
    }

    @Override // org.bouncycastle.pqc.math.ntru.HPSPolynomial, org.bouncycastle.pqc.math.ntru.Polynomial
    public void sqFromBytes(byte[] bArr) {
        for (int i = 0; i < this.params.packDegree() / 2; i++) {
            short[] sArr = this.coeffs;
            int i2 = i * 2;
            int i3 = i * 3;
            int i5 = bArr[i3] & UnsignedBytes.MAX_VALUE;
            byte b4 = bArr[i3 + 1];
            sArr[i2] = (short) (i5 | ((((short) (b4 & UnsignedBytes.MAX_VALUE)) & 15) << 8));
            sArr[i2 + 1] = (short) (((((short) (bArr[i3 + 2] & UnsignedBytes.MAX_VALUE)) & 255) << 4) | ((b4 & UnsignedBytes.MAX_VALUE) >>> 4));
        }
        this.coeffs[this.params.n() - 1] = 0;
    }

    @Override // org.bouncycastle.pqc.math.ntru.HPSPolynomial, org.bouncycastle.pqc.math.ntru.Polynomial
    public byte[] sqToBytes(int i) {
        byte[] bArr = new byte[i];
        int iQ = this.params.q();
        for (int i2 = 0; i2 < this.params.packDegree() / 2; i2++) {
            int i3 = i2 * 3;
            int i5 = i2 * 2;
            bArr[i3] = (byte) (Polynomial.modQ(this.coeffs[i5] & HPKE.aead_EXPORT_ONLY, iQ) & 255);
            int iModQ = Polynomial.modQ(this.coeffs[i5] & HPKE.aead_EXPORT_ONLY, iQ) >>> 8;
            int i6 = i5 + 1;
            bArr[i3 + 1] = (byte) (iModQ | ((Polynomial.modQ(this.coeffs[i6] & HPKE.aead_EXPORT_ONLY, iQ) & 15) << 4));
            bArr[i3 + 2] = (byte) (Polynomial.modQ(this.coeffs[i6] & HPKE.aead_EXPORT_ONLY, iQ) >>> 4);
        }
        return bArr;
    }
}
