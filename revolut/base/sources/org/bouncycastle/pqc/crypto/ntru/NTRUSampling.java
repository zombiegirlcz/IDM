package org.bouncycastle.pqc.crypto.ntru;

import com.google.common.primitives.UnsignedBytes;
import net.sf.scuba.smartcards.ISO7816;
import org.bouncycastle.crypto.hpke.HPKE;
import org.bouncycastle.pqc.math.ntru.HPSPolynomial;
import org.bouncycastle.pqc.math.ntru.HRSSPolynomial;
import org.bouncycastle.pqc.math.ntru.Polynomial;
import org.bouncycastle.pqc.math.ntru.parameters.NTRUHPSParameterSet;
import org.bouncycastle.pqc.math.ntru.parameters.NTRUHRSSParameterSet;
import org.bouncycastle.pqc.math.ntru.parameters.NTRUParameterSet;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes14.dex */
class NTRUSampling {
    private final NTRUParameterSet params;

    public NTRUSampling(NTRUParameterSet nTRUParameterSet) {
        this.params = nTRUParameterSet;
    }

    private static int mod3(int i) {
        return i % 3;
    }

    public PolynomialPair sampleFg(byte[] bArr) {
        NTRUParameterSet nTRUParameterSet = this.params;
        if (nTRUParameterSet instanceof NTRUHRSSParameterSet) {
            return new PolynomialPair(sampleIidPlus(Arrays.copyOfRange(bArr, 0, nTRUParameterSet.sampleIidBytes())), sampleIidPlus(Arrays.copyOfRange(bArr, this.params.sampleIidBytes(), bArr.length)));
        }
        if (nTRUParameterSet instanceof NTRUHPSParameterSet) {
            return new PolynomialPair((HPSPolynomial) sampleIid(Arrays.copyOfRange(bArr, 0, nTRUParameterSet.sampleIidBytes())), sampleFixedType(Arrays.copyOfRange(bArr, this.params.sampleIidBytes(), bArr.length)));
        }
        throw new IllegalArgumentException("Invalid polynomial type");
    }

    public HPSPolynomial sampleFixedType(byte[] bArr) {
        int i;
        int i2;
        int iN = this.params.n();
        int iWeight = ((NTRUHPSParameterSet) this.params).weight();
        HPSPolynomial hPSPolynomial = new HPSPolynomial((NTRUHPSParameterSet) this.params);
        int i3 = iN - 1;
        int[] iArr = new int[i3];
        int i5 = 0;
        while (true) {
            i = i3 / 4;
            if (i5 >= i) {
                break;
            }
            int i6 = i5 * 4;
            int i21 = i5 * 15;
            iArr[i6] = ((bArr[i21] & UnsignedBytes.MAX_VALUE) << 2) + ((bArr[i21 + 1] & UnsignedBytes.MAX_VALUE) << 10) + ((bArr[i21 + 2] & UnsignedBytes.MAX_VALUE) << 18) + ((bArr[i21 + 3] & UnsignedBytes.MAX_VALUE) << 26);
            iArr[i6 + 1] = ((bArr[(i5 * 3) + 15] & ISO7816.INS_GET_RESPONSE) >> 4) + ((bArr[i21 + 4] & UnsignedBytes.MAX_VALUE) << 4) + ((bArr[i21 + 5] & UnsignedBytes.MAX_VALUE) << 12) + ((bArr[i21 + 6] & UnsignedBytes.MAX_VALUE) << 20) + ((bArr[i21 + 7] & UnsignedBytes.MAX_VALUE) << 28);
            int i22 = ((bArr[(i5 * 7) + 15] & 240) >> 2) + ((bArr[i21 + 8] & UnsignedBytes.MAX_VALUE) << 6) + ((bArr[i21 + 9] & UnsignedBytes.MAX_VALUE) << 14) + ((bArr[i21 + 10] & UnsignedBytes.MAX_VALUE) << 22);
            byte b4 = bArr[i21 + 11];
            iArr[i6 + 2] = i22 + ((b4 & UnsignedBytes.MAX_VALUE) << 30);
            iArr[i6 + 3] = (b4 & 252) + ((bArr[i21 + 12] & UnsignedBytes.MAX_VALUE) << 8) + ((bArr[i21 + 13] & UnsignedBytes.MAX_VALUE) << 16) + ((bArr[i21 + 14] & UnsignedBytes.MAX_VALUE) << 24);
            i5++;
        }
        int i32 = i * 4;
        if (i3 > i32) {
            int i33 = i * 15;
            iArr[i32] = ((bArr[i33] & UnsignedBytes.MAX_VALUE) << 2) + ((bArr[i33 + 1] & UnsignedBytes.MAX_VALUE) << 10) + ((bArr[i33 + 2] & UnsignedBytes.MAX_VALUE) << 18) + ((bArr[i33 + 3] & UnsignedBytes.MAX_VALUE) << 26);
            iArr[i32 + 1] = ((bArr[(i * 3) + 15] & ISO7816.INS_GET_RESPONSE) >> 4) + ((bArr[i33 + 4] & UnsignedBytes.MAX_VALUE) << 4) + ((bArr[i33 + 5] & UnsignedBytes.MAX_VALUE) << 12) + ((bArr[i33 + 6] & UnsignedBytes.MAX_VALUE) << 20) + ((bArr[i33 + 7] & UnsignedBytes.MAX_VALUE) << 28);
        }
        int i43 = 0;
        while (true) {
            i2 = iWeight / 2;
            if (i43 >= i2) {
                break;
            }
            iArr[i43] = iArr[i43] | 1;
            i43++;
        }
        while (i2 < iWeight) {
            iArr[i2] = iArr[i2] | 2;
            i2++;
        }
        java.util.Arrays.sort(iArr);
        for (int i59 = 0; i59 < i3; i59++) {
            hPSPolynomial.coeffs[i59] = (short) (iArr[i59] & 3);
        }
        hPSPolynomial.coeffs[i3] = 0;
        return hPSPolynomial;
    }

    public Polynomial sampleIid(byte[] bArr) {
        Polynomial polynomialCreatePolynomial = this.params.createPolynomial();
        for (int i = 0; i < this.params.n() - 1; i++) {
            polynomialCreatePolynomial.coeffs[i] = (short) mod3(bArr[i] & UnsignedBytes.MAX_VALUE);
        }
        polynomialCreatePolynomial.coeffs[this.params.n() - 1] = 0;
        return polynomialCreatePolynomial;
    }

    public HRSSPolynomial sampleIidPlus(byte[] bArr) {
        int i;
        int iN = this.params.n();
        HRSSPolynomial hRSSPolynomial = (HRSSPolynomial) sampleIid(bArr);
        int i2 = 0;
        while (true) {
            i = iN - 1;
            if (i2 >= i) {
                break;
            }
            short[] sArr = hRSSPolynomial.coeffs;
            short s2 = sArr[i2];
            sArr[i2] = (short) (s2 | (-(s2 >>> 1)));
            i2++;
        }
        int i3 = 0;
        short s3 = 0;
        while (i3 < i) {
            short[] sArr2 = hRSSPolynomial.coeffs;
            int i5 = i3 + 1;
            s3 = (short) (s3 + ((short) (sArr2[i5] * sArr2[i3])));
            i3 = i5;
        }
        short s4 = (short) ((-((s3 & HPKE.aead_EXPORT_ONLY) >>> 15)) | 1);
        for (int i6 = 0; i6 < i; i6 += 2) {
            short[] sArr3 = hRSSPolynomial.coeffs;
            sArr3[i6] = (short) (sArr3[i6] * s4);
        }
        for (int i21 = 0; i21 < i; i21++) {
            short[] sArr4 = hRSSPolynomial.coeffs;
            short s6 = sArr4[i21];
            sArr4[i21] = (short) ((((s6 & HPKE.aead_EXPORT_ONLY) >>> 15) ^ (s6 & HPKE.aead_EXPORT_ONLY)) & 3);
        }
        return hRSSPolynomial;
    }

    public PolynomialPair sampleRm(byte[] bArr) {
        NTRUParameterSet nTRUParameterSet = this.params;
        if (nTRUParameterSet instanceof NTRUHRSSParameterSet) {
            return new PolynomialPair((HRSSPolynomial) sampleIid(Arrays.copyOfRange(bArr, 0, nTRUParameterSet.sampleIidBytes())), (HRSSPolynomial) sampleIid(Arrays.copyOfRange(bArr, this.params.sampleIidBytes(), bArr.length)));
        }
        if (nTRUParameterSet instanceof NTRUHPSParameterSet) {
            return new PolynomialPair((HPSPolynomial) sampleIid(Arrays.copyOfRange(bArr, 0, nTRUParameterSet.sampleIidBytes())), sampleFixedType(Arrays.copyOfRange(bArr, this.params.sampleIidBytes(), bArr.length)));
        }
        throw new IllegalArgumentException("Invalid polynomial type");
    }
}
