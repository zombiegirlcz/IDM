package org.bouncycastle.crypto.kems.mlkem;

import com.google.common.base.Ascii;
import com.google.common.primitives.UnsignedBytes;
import org.bouncycastle.crypto.Xof;

/* JADX INFO: loaded from: classes14.dex */
class Poly {
    private final short[] coeffs = new short[256];

    public static void baseMultMontgomery(Poly poly, Poly poly2, Poly poly3) {
        for (int i = 0; i < 64; i++) {
            short[] sArr = poly.coeffs;
            int i2 = i * 4;
            short coeffIndex = poly2.getCoeffIndex(i2);
            int i3 = i2 + 1;
            short coeffIndex2 = poly2.getCoeffIndex(i3);
            short coeffIndex3 = poly3.getCoeffIndex(i2);
            short coeffIndex4 = poly3.getCoeffIndex(i3);
            short[] sArr2 = Ntt.ZETAS;
            int i5 = i + 64;
            Ntt.baseMult(sArr, i2, coeffIndex, coeffIndex2, coeffIndex3, coeffIndex4, sArr2[i5]);
            int i6 = i2 + 2;
            int i21 = i2 + 3;
            Ntt.baseMult(poly.coeffs, i6, poly2.getCoeffIndex(i6), poly2.getCoeffIndex(i21), poly3.getCoeffIndex(i6), poly3.getCoeffIndex(i21), (short) (sArr2[i5] * (-1)));
        }
    }

    public static int checkModulus(byte[] bArr, int i) {
        int iCheckModulus = -1;
        for (int i2 = 0; i2 < 128; i2++) {
            int i3 = (i2 * 3) + i;
            int i5 = bArr[i3] & UnsignedBytes.MAX_VALUE;
            int i6 = bArr[i3 + 1] & UnsignedBytes.MAX_VALUE;
            iCheckModulus = iCheckModulus & Reduce.checkModulus((short) ((i5 | (i6 << 8)) & 4095)) & Reduce.checkModulus((short) ((((bArr[i3 + 2] & UnsignedBytes.MAX_VALUE) << 4) | (i6 >> 4)) & 4095));
        }
        return iCheckModulus;
    }

    private static void prf(Xof xof2, byte[] bArr, int i, byte b4, byte[] bArr2) {
        xof2.update(bArr, i, 32);
        xof2.update(b4);
        xof2.doFinal(bArr2, 0, bArr2.length);
    }

    public void add(Poly poly) {
        for (int i = 0; i < 256; i++) {
            short[] sArr = this.coeffs;
            sArr[i] = (short) (sArr[i] + poly.coeffs[i]);
        }
    }

    public byte[] compressPoly128() {
        byte[] bArr = new byte[8];
        byte[] bArr2 = new byte[128];
        condSubQ();
        int i = 0;
        for (int i2 = 0; i2 < 32; i2++) {
            for (int i3 = 0; i3 < 8; i3++) {
                bArr[i3] = (byte) (((((getCoeffIndex((i2 * 8) + i3) << 4) + 1665) * 80635) >> 28) & 15);
            }
            bArr2[i] = (byte) (bArr[0] | (bArr[1] << 4));
            bArr2[i + 1] = (byte) (bArr[2] | (bArr[3] << 4));
            bArr2[i + 2] = (byte) (bArr[4] | (bArr[5] << 4));
            bArr2[i + 3] = (byte) (bArr[6] | (bArr[7] << 4));
            i += 4;
        }
        return bArr2;
    }

    public byte[] compressPoly160() {
        byte[] bArr = new byte[8];
        byte[] bArr2 = new byte[160];
        condSubQ();
        int i = 0;
        for (int i2 = 0; i2 < 32; i2++) {
            for (int i3 = 0; i3 < 8; i3++) {
                bArr[i3] = (byte) (((((getCoeffIndex((i2 * 8) + i3) << 5) + 1664) * 40318) >> 27) & 31);
            }
            bArr2[i] = (byte) (bArr[0] | (bArr[1] << 5));
            bArr2[i + 1] = (byte) ((bArr[1] >> 3) | (bArr[2] << 2) | (bArr[3] << 7));
            bArr2[i + 2] = (byte) ((bArr[3] >> 1) | (bArr[4] << 4));
            bArr2[i + 3] = (byte) ((bArr[5] << 1) | (bArr[4] >> 4) | (bArr[6] << 6));
            bArr2[i + 4] = (byte) ((bArr[6] >> 2) | (bArr[7] << 3));
            i += 5;
        }
        return bArr2;
    }

    public void condSubQ() {
        for (int i = 0; i < 256; i++) {
            short[] sArr = this.coeffs;
            sArr[i] = Reduce.condSubQ(sArr[i]);
        }
    }

    public void convertToMont() {
        for (int i = 0; i < 256; i++) {
            setCoeffIndex(i, Reduce.montgomeryReduce(getCoeffIndex(i) * 1353));
        }
    }

    public void decompressPoly128(byte[] bArr, int i) {
        for (int i2 = 0; i2 < 128; i2++) {
            int i3 = i2 * 2;
            setCoeffIndex(i3, (short) (((((short) (bArr[i] & 15)) * 3329) + 8) >> 4));
            setCoeffIndex(i3 + 1, (short) (((((short) ((bArr[i] & UnsignedBytes.MAX_VALUE) >> 4)) * 3329) + 8) >> 4));
            i++;
        }
    }

    public void decompressPoly160(byte[] bArr, int i) {
        int i2 = i;
        for (int i3 = 0; i3 < 32; i3++) {
            byte b4 = bArr[i2];
            byte b5 = (byte) (b4 & UnsignedBytes.MAX_VALUE);
            int i5 = (b4 & UnsignedBytes.MAX_VALUE) >> 5;
            byte b7 = bArr[i2 + 1];
            byte b13 = (byte) (i5 | ((b7 & UnsignedBytes.MAX_VALUE) << 3));
            byte b15 = (byte) ((b7 & UnsignedBytes.MAX_VALUE) >> 2);
            int i6 = (b7 & UnsignedBytes.MAX_VALUE) >> 7;
            byte b17 = bArr[i2 + 2];
            byte b40 = (byte) (i6 | ((b17 & UnsignedBytes.MAX_VALUE) << 1));
            int i21 = (b17 & UnsignedBytes.MAX_VALUE) >> 4;
            byte b61 = bArr[i2 + 3];
            byte b64 = (byte) (i21 | ((b61 & UnsignedBytes.MAX_VALUE) << 4));
            byte b69 = (byte) ((b61 & UnsignedBytes.MAX_VALUE) >> 1);
            int i22 = (b61 & UnsignedBytes.MAX_VALUE) >> 6;
            byte b76 = bArr[i2 + 4];
            byte[] bArr2 = {b5, b13, b15, b40, b64, b69, (byte) (((b76 & UnsignedBytes.MAX_VALUE) << 2) | i22), (byte) ((b76 & UnsignedBytes.MAX_VALUE) >> 3)};
            i2 += 5;
            for (int i32 = 0; i32 < 8; i32++) {
                setCoeffIndex((i3 * 8) + i32, (short) ((((bArr2[i32] & Ascii.US) * 3329) + 16) >> 5));
            }
        }
    }

    public void fromBytes(byte[] bArr, int i) {
        for (int i2 = 0; i2 < 128; i2++) {
            int i3 = (i2 * 3) + i;
            int i5 = bArr[i3] & UnsignedBytes.MAX_VALUE;
            int i6 = bArr[i3 + 1] & UnsignedBytes.MAX_VALUE;
            int i21 = bArr[i3 + 2] & UnsignedBytes.MAX_VALUE;
            short[] sArr = this.coeffs;
            int i22 = i2 * 2;
            sArr[i22] = (short) ((i5 | (i6 << 8)) & 4095);
            sArr[i22 + 1] = (short) (((i21 << 4) | (i6 >> 4)) & 4095);
        }
    }

    public void fromMsg(byte[] bArr, int i) {
        for (int i2 = 0; i2 < 32; i2++) {
            int i3 = bArr[i + i2] & 255;
            for (int i5 = 0; i5 < 8; i5++) {
                setCoeffIndex((i2 * 8) + i5, (short) (((short) (-((i3 >> i5) & 1))) & 1665));
            }
        }
    }

    public short getCoeffIndex(int i) {
        return this.coeffs[i];
    }

    public short[] getCoeffs() {
        return this.coeffs;
    }

    public void getNoiseEta2(Xof xof2, byte[] bArr, int i, byte b4) {
        byte[] bArr2 = new byte[128];
        prf(xof2, bArr, i, b4, bArr2);
        CBD.eta2(this, bArr2);
    }

    public void getNoiseEta3(Xof xof2, byte[] bArr, int i, byte b4) {
        byte[] bArr2 = new byte[192];
        prf(xof2, bArr, i, b4, bArr2);
        CBD.eta3(this, bArr2);
    }

    public void polyInverseNttToMont() {
        Ntt.invNtt(this.coeffs);
    }

    public void polyNtt() {
        Ntt.ntt(this.coeffs);
        reduce();
    }

    public void reduce() {
        for (int i = 0; i < 256; i++) {
            short[] sArr = this.coeffs;
            sArr[i] = Reduce.barrettReduce(sArr[i]);
        }
    }

    public void setCoeffIndex(int i, short s2) {
        this.coeffs[i] = s2;
    }

    public void subtract(Poly poly) {
        for (int i = 0; i < 256; i++) {
            short[] sArr = this.coeffs;
            sArr[i] = (short) (poly.coeffs[i] - sArr[i]);
        }
    }

    public void toBytes(byte[] bArr, int i) {
        condSubQ();
        for (int i2 = 0; i2 < 128; i2++) {
            short[] sArr = this.coeffs;
            int i3 = i2 * 2;
            short s2 = sArr[i3];
            short s3 = sArr[i3 + 1];
            int i5 = (i2 * 3) + i;
            bArr[i5] = (byte) s2;
            bArr[i5 + 1] = (byte) ((s2 >> 8) | (s3 << 4));
            bArr[i5 + 2] = (byte) (s3 >> 4);
        }
    }

    public void toMsg(byte[] bArr) {
        condSubQ();
        for (int i = 0; i < 32; i++) {
            bArr[i] = 0;
            for (int i2 = 0; i2 < 8; i2++) {
                short coeffIndex = getCoeffIndex((i * 8) + i2);
                bArr[i] = (byte) (((byte) ((((coeffIndex - 2497) & (832 - coeffIndex)) >>> 31) << i2)) | bArr[i]);
            }
        }
    }
}
