package org.bouncycastle.pqc.math.ntru;

import com.google.common.primitives.UnsignedBytes;
import org.bouncycastle.crypto.hpke.HPKE;
import org.bouncycastle.pqc.math.ntru.parameters.NTRUHRSSParameterSet;

/* JADX INFO: loaded from: classes14.dex */
public class HRSSPolynomial extends Polynomial {
    public HRSSPolynomial(NTRUHRSSParameterSet nTRUHRSSParameterSet) {
        super(nTRUHRSSParameterSet);
    }

    @Override // org.bouncycastle.pqc.math.ntru.Polynomial
    public void lift(Polynomial polynomial) {
        int length = this.coeffs.length;
        Polynomial polynomialCreatePolynomial = this.params.createPolynomial();
        short s2 = (short) (3 - (length % 3));
        short[] sArr = polynomialCreatePolynomial.coeffs;
        short[] sArr2 = polynomial.coeffs;
        int i = 0;
        int i2 = 2 - s2;
        int i3 = sArr2[0] * i2;
        short s3 = sArr2[1];
        short s4 = sArr2[2];
        sArr[0] = (short) ((s4 * s2) + i3);
        sArr[1] = (short) (s3 * i2);
        sArr[2] = (short) (s4 * i2);
        short s6 = 0;
        for (int i5 = 3; i5 < length; i5++) {
            short[] sArr3 = polynomialCreatePolynomial.coeffs;
            short s11 = sArr3[0];
            short[] sArr4 = polynomial.coeffs;
            sArr3[0] = (short) ((((s2 * 2) + s6) * sArr4[i5]) + s11);
            int i6 = s6 + s2;
            sArr3[1] = (short) ((sArr4[i5] * i6) + sArr3[1]);
            sArr3[2] = (short) ((sArr4[i5] * s6) + sArr3[2]);
            s6 = (short) (i6 % 3);
        }
        short[] sArr5 = polynomialCreatePolynomial.coeffs;
        short s27 = sArr5[1];
        short[] sArr6 = polynomial.coeffs;
        short s37 = sArr6[0];
        int i21 = s2 + s6;
        sArr5[1] = (short) ((s37 * i21) + s27);
        short s51 = (short) ((s37 * s6) + sArr5[2]);
        sArr5[2] = s51;
        sArr5[2] = (short) ((sArr6[1] * i21) + s51);
        for (int i22 = 3; i22 < length; i22++) {
            short[] sArr7 = polynomialCreatePolynomial.coeffs;
            short s60 = sArr7[i22 - 3];
            short[] sArr8 = polynomial.coeffs;
            sArr7[i22] = (short) (((sArr8[i22] + sArr8[i22 - 1] + sArr8[i22 - 2]) * 2) + s60);
        }
        polynomialCreatePolynomial.mod3PhiN();
        polynomialCreatePolynomial.z3ToZq();
        this.coeffs[0] = (short) (-polynomialCreatePolynomial.coeffs[0]);
        while (i < length - 1) {
            short[] sArr9 = this.coeffs;
            int i32 = i + 1;
            short[] sArr10 = polynomialCreatePolynomial.coeffs;
            sArr9[i32] = (short) (sArr10[i] - sArr10[i32]);
            i = i32;
        }
    }

    @Override // org.bouncycastle.pqc.math.ntru.Polynomial
    public void sqFromBytes(byte[] bArr) {
        int i = 0;
        while (i < this.params.packDegree() / 8) {
            short[] sArr = this.coeffs;
            int i2 = i * 8;
            int i3 = i * 13;
            int i5 = bArr[i3] & UnsignedBytes.MAX_VALUE;
            byte b4 = bArr[i3 + 1];
            sArr[i2] = (short) (i5 | ((((short) (b4 & UnsignedBytes.MAX_VALUE)) & 31) << 8));
            int i6 = ((b4 & UnsignedBytes.MAX_VALUE) >>> 5) | (((short) (bArr[i3 + 2] & UnsignedBytes.MAX_VALUE)) << 3);
            byte b5 = bArr[i3 + 3];
            sArr[i2 + 1] = (short) (i6 | ((((short) (b5 & UnsignedBytes.MAX_VALUE)) & 3) << 11));
            int i21 = (b5 & UnsignedBytes.MAX_VALUE) >>> 2;
            byte b7 = bArr[i3 + 4];
            sArr[i2 + 2] = (short) (i21 | ((((short) (b7 & UnsignedBytes.MAX_VALUE)) & 127) << 6));
            int i22 = ((b7 & UnsignedBytes.MAX_VALUE) >>> 7) | (((short) (bArr[i3 + 5] & UnsignedBytes.MAX_VALUE)) << 1);
            byte b13 = bArr[i3 + 6];
            sArr[i2 + 3] = (short) (i22 | ((((short) (b13 & UnsignedBytes.MAX_VALUE)) & 15) << 9));
            int i32 = (((short) (bArr[i3 + 7] & UnsignedBytes.MAX_VALUE)) << 4) | ((b13 & UnsignedBytes.MAX_VALUE) >>> 4);
            byte b15 = bArr[i3 + 8];
            sArr[i2 + 4] = (short) (i32 | ((((short) (b15 & UnsignedBytes.MAX_VALUE)) & 1) << 12));
            int i33 = (b15 & UnsignedBytes.MAX_VALUE) >>> 1;
            byte b17 = bArr[i3 + 9];
            sArr[i2 + 5] = (short) (i33 | ((((short) (b17 & UnsignedBytes.MAX_VALUE)) & 63) << 7));
            int i43 = (((short) (bArr[i3 + 10] & UnsignedBytes.MAX_VALUE)) << 2) | ((b17 & UnsignedBytes.MAX_VALUE) >>> 6);
            byte b40 = bArr[i3 + 11];
            sArr[i2 + 6] = (short) (i43 | ((((short) (b40 & UnsignedBytes.MAX_VALUE)) & 7) << 10));
            sArr[i2 + 7] = (short) (((b40 & UnsignedBytes.MAX_VALUE) >>> 3) | (((short) (bArr[i3 + 12] & UnsignedBytes.MAX_VALUE)) << 5));
            i++;
        }
        int iPackDegree = this.params.packDegree() & 7;
        if (iPackDegree == 2) {
            short[] sArr2 = this.coeffs;
            int i59 = i * 8;
            int i66 = i * 13;
            int i74 = bArr[i66] & UnsignedBytes.MAX_VALUE;
            byte b61 = bArr[i66 + 1];
            sArr2[i59] = (short) (i74 | ((((short) (b61 & UnsignedBytes.MAX_VALUE)) & 31) << 8));
            sArr2[i59 + 1] = (short) (((((short) (bArr[i66 + 3] & UnsignedBytes.MAX_VALUE)) & 3) << 11) | ((b61 & UnsignedBytes.MAX_VALUE) >>> 5) | (((short) (bArr[i66 + 2] & UnsignedBytes.MAX_VALUE)) << 3));
        } else if (iPackDegree == 4) {
            short[] sArr3 = this.coeffs;
            int i92 = i * 8;
            int i96 = i * 13;
            int i99 = bArr[i96] & UnsignedBytes.MAX_VALUE;
            byte b64 = bArr[i96 + 1];
            sArr3[i92] = (short) (i99 | ((((short) (b64 & UnsignedBytes.MAX_VALUE)) & 31) << 8));
            int i100 = ((b64 & UnsignedBytes.MAX_VALUE) >>> 5) | (((short) (bArr[i96 + 2] & UnsignedBytes.MAX_VALUE)) << 3);
            byte b69 = bArr[i96 + 3];
            sArr3[i92 + 1] = (short) (i100 | ((((short) (b69 & UnsignedBytes.MAX_VALUE)) & 3) << 11));
            int i101 = (b69 & UnsignedBytes.MAX_VALUE) >>> 2;
            byte b76 = bArr[i96 + 4];
            sArr3[i92 + 2] = (short) (i101 | ((((short) (b76 & UnsignedBytes.MAX_VALUE)) & 127) << 6));
            sArr3[i92 + 3] = (short) (((((short) (bArr[i96 + 6] & UnsignedBytes.MAX_VALUE)) & 15) << 9) | ((b76 & UnsignedBytes.MAX_VALUE) >>> 7) | (((short) (bArr[i96 + 5] & UnsignedBytes.MAX_VALUE)) << 1));
        }
        this.coeffs[this.params.n() - 1] = 0;
    }

    @Override // org.bouncycastle.pqc.math.ntru.Polynomial
    public byte[] sqToBytes(int i) {
        byte[] bArr = new byte[i];
        short[] sArr = new short[8];
        int i2 = 0;
        while (i2 < this.params.packDegree() / 8) {
            for (int i3 = 0; i3 < 8; i3++) {
                sArr[i3] = (short) Polynomial.modQ(this.coeffs[(i2 * 8) + i3] & HPKE.aead_EXPORT_ONLY, this.params.q());
            }
            int i5 = i2 * 13;
            short s2 = sArr[0];
            bArr[i5] = (byte) (s2 & 255);
            short s3 = sArr[1];
            bArr[i5 + 1] = (byte) ((s2 >>> 8) | ((s3 & 7) << 5));
            bArr[i5 + 2] = (byte) ((s3 >>> 3) & 255);
            int i6 = s3 >>> 11;
            short s4 = sArr[2];
            bArr[i5 + 3] = (byte) (i6 | ((s4 & 63) << 2));
            short s6 = sArr[3];
            bArr[i5 + 4] = (byte) ((s4 >>> 6) | ((s6 & 1) << 7));
            bArr[i5 + 5] = (byte) ((s6 >>> 1) & 255);
            int i21 = s6 >>> 9;
            short s11 = sArr[4];
            bArr[i5 + 6] = (byte) (i21 | ((s11 & 15) << 4));
            bArr[i5 + 7] = (byte) ((s11 >>> 4) & 255);
            short s27 = sArr[5];
            bArr[i5 + 8] = (byte) ((s11 >>> 12) | ((s27 & 127) << 1));
            int i22 = s27 >>> 7;
            short s37 = sArr[6];
            bArr[i5 + 9] = (byte) (i22 | ((s37 & 3) << 6));
            bArr[i5 + 10] = (byte) ((s37 >>> 2) & 255);
            short s51 = sArr[7];
            bArr[i5 + 11] = (byte) ((s37 >>> 10) | ((s51 & 31) << 3));
            bArr[i5 + 12] = (byte) (s51 >>> 5);
            i2++;
        }
        int i32 = 0;
        while (true) {
            int i33 = i2 * 8;
            if (i32 >= this.params.packDegree() - i33) {
                break;
            }
            sArr[i32] = (short) Polynomial.modQ(this.coeffs[i33 + i32] & HPKE.aead_EXPORT_ONLY, this.params.q());
            i32++;
        }
        while (i32 < 8) {
            sArr[i32] = 0;
            i32++;
        }
        int iPackDegree = this.params.packDegree() - ((this.params.packDegree() / 8) * 8);
        if (iPackDegree != 2) {
            if (iPackDegree != 4) {
                return bArr;
            }
            int i43 = i2 * 13;
            short s60 = sArr[0];
            bArr[i43] = (byte) (s60 & 255);
            short s61 = sArr[1];
            bArr[i43 + 1] = (byte) ((s60 >>> 8) | ((s61 & 7) << 5));
            bArr[i43 + 2] = (byte) ((s61 >>> 3) & 255);
            int i59 = s61 >>> 11;
            short s67 = sArr[2];
            bArr[i43 + 3] = (byte) (i59 | ((s67 & 63) << 2));
            int i66 = s67 >>> 6;
            short s73 = sArr[3];
            bArr[i43 + 4] = (byte) (i66 | ((s73 & 1) << 7));
            bArr[i43 + 5] = (byte) ((s73 >>> 1) & 255);
            bArr[i43 + 6] = (byte) ((s73 >>> 9) | ((sArr[4] & 15) << 4));
        }
        int i74 = i2 * 13;
        short s100 = sArr[0];
        bArr[i74] = (byte) (s100 & 255);
        int i92 = s100 >>> 8;
        short s101 = sArr[1];
        bArr[i74 + 1] = (byte) (i92 | ((s101 & 7) << 5));
        bArr[i74 + 2] = (byte) ((s101 >>> 3) & 255);
        bArr[i74 + 3] = (byte) ((s101 >>> 11) | ((sArr[2] & 63) << 2));
        return bArr;
    }
}
