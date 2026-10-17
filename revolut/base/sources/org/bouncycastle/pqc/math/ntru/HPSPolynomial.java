package org.bouncycastle.pqc.math.ntru;

import com.google.common.primitives.UnsignedBytes;
import org.bouncycastle.crypto.hpke.HPKE;
import org.bouncycastle.pqc.math.ntru.parameters.NTRUHPSParameterSet;

/* JADX INFO: loaded from: classes14.dex */
public class HPSPolynomial extends Polynomial {
    public HPSPolynomial(NTRUHPSParameterSet nTRUHPSParameterSet) {
        super(nTRUHPSParameterSet);
    }

    @Override // org.bouncycastle.pqc.math.ntru.Polynomial
    public void lift(Polynomial polynomial) {
        short[] sArr = this.coeffs;
        System.arraycopy(polynomial.coeffs, 0, sArr, 0, sArr.length);
        z3ToZq();
    }

    @Override // org.bouncycastle.pqc.math.ntru.Polynomial
    public void sqFromBytes(byte[] bArr) {
        int length = this.coeffs.length;
        int i = 0;
        while (i < this.params.packDegree() / 8) {
            short[] sArr = this.coeffs;
            int i2 = i * 8;
            int i3 = i * 11;
            int i5 = bArr[i3] & UnsignedBytes.MAX_VALUE;
            byte b4 = bArr[i3 + 1];
            sArr[i2] = (short) (i5 | ((((short) (b4 & UnsignedBytes.MAX_VALUE)) & 7) << 8));
            int i6 = (b4 & UnsignedBytes.MAX_VALUE) >>> 3;
            byte b5 = bArr[i3 + 2];
            sArr[i2 + 1] = (short) (i6 | ((((short) (b5 & UnsignedBytes.MAX_VALUE)) & 63) << 5));
            int i21 = ((b5 & UnsignedBytes.MAX_VALUE) >>> 6) | ((((short) (bArr[i3 + 3] & UnsignedBytes.MAX_VALUE)) & 255) << 2);
            byte b7 = bArr[i3 + 4];
            sArr[i2 + 2] = (short) (i21 | ((((short) (b7 & UnsignedBytes.MAX_VALUE)) & 1) << 10));
            int i22 = (b7 & UnsignedBytes.MAX_VALUE) >>> 1;
            byte b13 = bArr[i3 + 5];
            sArr[i2 + 3] = (short) (i22 | ((((short) (b13 & UnsignedBytes.MAX_VALUE)) & 15) << 7));
            int i32 = (b13 & UnsignedBytes.MAX_VALUE) >>> 4;
            byte b15 = bArr[i3 + 6];
            sArr[i2 + 4] = (short) (((((short) (b15 & UnsignedBytes.MAX_VALUE)) & 127) << 4) | i32);
            int i33 = ((b15 & UnsignedBytes.MAX_VALUE) >>> 7) | ((((short) (bArr[i3 + 7] & UnsignedBytes.MAX_VALUE)) & 255) << 1);
            byte b17 = bArr[i3 + 8];
            sArr[i2 + 5] = (short) (i33 | ((((short) (b17 & UnsignedBytes.MAX_VALUE)) & 3) << 9));
            int i43 = (b17 & UnsignedBytes.MAX_VALUE) >>> 2;
            byte b40 = bArr[i3 + 9];
            sArr[i2 + 6] = (short) (i43 | ((((short) (b40 & UnsignedBytes.MAX_VALUE)) & 31) << 6));
            sArr[i2 + 7] = (short) (((b40 & UnsignedBytes.MAX_VALUE) >>> 5) | ((((short) (bArr[i3 + 10] & UnsignedBytes.MAX_VALUE)) & 255) << 3));
            i++;
        }
        int iPackDegree = this.params.packDegree() & 7;
        if (iPackDegree == 2) {
            short[] sArr2 = this.coeffs;
            int i59 = i * 8;
            int i66 = i * 11;
            int i74 = bArr[i66] & UnsignedBytes.MAX_VALUE;
            byte b61 = bArr[i66 + 1];
            sArr2[i59] = (short) (i74 | ((((short) (b61 & UnsignedBytes.MAX_VALUE)) & 7) << 8));
            sArr2[i59 + 1] = (short) (((((short) (bArr[i66 + 2] & UnsignedBytes.MAX_VALUE)) & 63) << 5) | ((b61 & UnsignedBytes.MAX_VALUE) >>> 3));
        } else if (iPackDegree == 4) {
            short[] sArr3 = this.coeffs;
            int i92 = i * 8;
            int i96 = i * 11;
            int i99 = bArr[i96] & UnsignedBytes.MAX_VALUE;
            byte b64 = bArr[i96 + 1];
            sArr3[i92] = (short) (i99 | ((((short) (b64 & UnsignedBytes.MAX_VALUE)) & 7) << 8));
            int i100 = (b64 & UnsignedBytes.MAX_VALUE) >>> 3;
            byte b69 = bArr[i96 + 2];
            sArr3[i92 + 1] = (short) (i100 | ((((short) (b69 & UnsignedBytes.MAX_VALUE)) & 63) << 5));
            int i101 = ((((short) (bArr[i96 + 3] & UnsignedBytes.MAX_VALUE)) & 255) << 2) | ((b69 & UnsignedBytes.MAX_VALUE) >>> 6);
            byte b76 = bArr[i96 + 4];
            sArr3[i92 + 2] = (short) (i101 | ((((short) (b76 & UnsignedBytes.MAX_VALUE)) & 1) << 10));
            sArr3[i92 + 3] = (short) (((((short) (bArr[i96 + 5] & UnsignedBytes.MAX_VALUE)) & 15) << 7) | ((b76 & UnsignedBytes.MAX_VALUE) >>> 1));
        }
        this.coeffs[length - 1] = 0;
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
            int i5 = i2 * 11;
            short s2 = sArr[0];
            bArr[i5] = (byte) (s2 & 255);
            short s3 = sArr[1];
            bArr[i5 + 1] = (byte) ((s2 >>> 8) | ((s3 & 31) << 3));
            int i6 = s3 >>> 5;
            short s4 = sArr[2];
            bArr[i5 + 2] = (byte) (i6 | ((s4 & 3) << 6));
            bArr[i5 + 3] = (byte) ((s4 >>> 2) & 255);
            int i21 = s4 >>> 10;
            short s6 = sArr[3];
            bArr[i5 + 4] = (byte) (i21 | ((s6 & 127) << 1));
            short s11 = sArr[4];
            bArr[i5 + 5] = (byte) ((s6 >>> 7) | ((s11 & 15) << 4));
            short s27 = sArr[5];
            bArr[i5 + 6] = (byte) ((s11 >>> 4) | ((s27 & 1) << 7));
            bArr[i5 + 7] = (byte) ((s27 >>> 1) & 255);
            int i22 = s27 >>> 9;
            short s37 = sArr[6];
            bArr[i5 + 8] = (byte) (i22 | ((s37 & 63) << 2));
            short s51 = sArr[7];
            bArr[i5 + 9] = (byte) ((s37 >>> 6) | ((s51 & 7) << 5));
            bArr[i5 + 10] = (byte) (s51 >>> 3);
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
        int iPackDegree = this.params.packDegree() & 7;
        if (iPackDegree == 2) {
            int i43 = i2 * 11;
            short s60 = sArr[0];
            bArr[i43] = (byte) (s60 & 255);
            int i59 = s60 >>> 8;
            short s61 = sArr[1];
            bArr[i43 + 1] = (byte) (i59 | ((s61 & 31) << 3));
            bArr[i43 + 2] = (byte) ((s61 >>> 5) | ((sArr[2] & 3) << 6));
            return bArr;
        }
        if (iPackDegree != 4) {
            return bArr;
        }
        int i66 = i2 * 11;
        short s67 = sArr[0];
        bArr[i66] = (byte) (s67 & 255);
        int i74 = s67 >>> 8;
        short s73 = sArr[1];
        bArr[i66 + 1] = (byte) (i74 | ((s73 & 31) << 3));
        short s100 = sArr[2];
        bArr[i66 + 2] = (byte) ((s73 >>> 5) | ((s100 & 3) << 6));
        bArr[i66 + 3] = (byte) ((s100 >>> 2) & 255);
        int i92 = s100 >>> 10;
        short s101 = sArr[3];
        bArr[i66 + 4] = (byte) (i92 | ((s101 & 127) << 1));
        bArr[i66 + 5] = (byte) ((s101 >>> 7) | ((sArr[4] & 15) << 4));
        return bArr;
    }
}
