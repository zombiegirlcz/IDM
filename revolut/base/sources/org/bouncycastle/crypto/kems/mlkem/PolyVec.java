package org.bouncycastle.crypto.kems.mlkem;

import com.google.common.primitives.UnsignedBytes;

/* JADX INFO: loaded from: classes14.dex */
class PolyVec {

    /* JADX INFO: renamed from: vec, reason: collision with root package name */
    final Poly[] f228431vec;

    public PolyVec(int i) {
        this.f228431vec = new Poly[i];
        for (int i2 = 0; i2 < i; i2++) {
            this.f228431vec[i2] = new Poly();
        }
    }

    public static int checkModulus(MLKEMEngine mLKEMEngine, byte[] bArr) {
        int k = mLKEMEngine.getK();
        int iCheckModulus = -1;
        for (int i = 0; i < k; i++) {
            iCheckModulus &= Poly.checkModulus(bArr, i * 384);
        }
        return iCheckModulus;
    }

    private void condSubQ() {
        int i = 0;
        while (true) {
            Poly[] polyArr = this.f228431vec;
            if (i >= polyArr.length) {
                return;
            }
            polyArr[i].condSubQ();
            i++;
        }
    }

    public static void pointwiseAccountMontgomery(Poly poly, PolyVec polyVec, PolyVec polyVec2, MLKEMEngine mLKEMEngine) {
        Poly poly2 = new Poly();
        Poly.baseMultMontgomery(poly, polyVec.f228431vec[0], polyVec2.f228431vec[0]);
        for (int i = 1; i < mLKEMEngine.getK(); i++) {
            Poly.baseMultMontgomery(poly2, polyVec.f228431vec[i], polyVec2.f228431vec[i]);
            poly.add(poly2);
        }
        poly.reduce();
    }

    public void addPoly(PolyVec polyVec) {
        int i = 0;
        while (true) {
            Poly[] polyArr = this.f228431vec;
            if (i >= polyArr.length) {
                return;
            }
            polyArr[i].add(polyVec.f228431vec[i]);
            i++;
        }
    }

    public void compressPolyVec(byte[] bArr, int i) {
        condSubQ();
        int i2 = 32;
        if (this.f228431vec.length != 4) {
            short[] sArr = new short[4];
            int i3 = i;
            for (int i5 = 0; i5 < this.f228431vec.length; i5++) {
                for (int i6 = 0; i6 < 64; i6++) {
                    for (int i21 = 0; i21 < 4; i21++) {
                        sArr[i21] = (short) (((((((long) this.f228431vec[i5].getCoeffIndex((i6 * 4) + i21)) << 10) + 1665) * 1290167) >> 32) & 1023);
                    }
                    short s2 = sArr[0];
                    bArr[i3] = (byte) s2;
                    short s3 = sArr[1];
                    bArr[i3 + 1] = (byte) ((s2 >> 8) | (s3 << 2));
                    int i22 = s3 >> 6;
                    short s4 = sArr[2];
                    bArr[i3 + 2] = (byte) (i22 | (s4 << 4));
                    int i32 = s4 >> 4;
                    short s6 = sArr[3];
                    bArr[i3 + 3] = (byte) (i32 | (s6 << 6));
                    bArr[i3 + 4] = (byte) (s6 >> 2);
                    i3 += 5;
                }
            }
            return;
        }
        short[] sArr2 = new short[8];
        int i33 = i;
        for (int i43 = 0; i43 < this.f228431vec.length; i43++) {
            int i59 = 0;
            while (i59 < i2) {
                int i66 = 0;
                while (i66 < 8) {
                    sArr2[i66] = (short) (((((((long) this.f228431vec[i43].getCoeffIndex((i59 * 8) + i66)) << 11) + 1664) * 645084) >> 31) & 2047);
                    i66++;
                    i2 = i2;
                }
                int i74 = i2;
                short s11 = sArr2[0];
                bArr[i33] = (byte) s11;
                short s27 = sArr2[1];
                bArr[i33 + 1] = (byte) ((s11 >> 8) | (s27 << 3));
                short s37 = sArr2[2];
                bArr[i33 + 2] = (byte) ((s27 >> 5) | (s37 << 6));
                bArr[i33 + 3] = (byte) (s37 >> 2);
                int i92 = s37 >> 10;
                short s51 = sArr2[3];
                bArr[i33 + 4] = (byte) (i92 | (s51 << 1));
                short s60 = sArr2[4];
                bArr[i33 + 5] = (byte) ((s51 >> 7) | (s60 << 4));
                short s61 = sArr2[5];
                bArr[i33 + 6] = (byte) ((s60 >> 4) | (s61 << 7));
                bArr[i33 + 7] = (byte) (s61 >> 1);
                short s67 = sArr2[6];
                bArr[i33 + 8] = (byte) ((s61 >> 9) | (s67 << 2));
                short s73 = sArr2[7];
                bArr[i33 + 9] = (byte) ((s67 >> 6) | (s73 << 5));
                bArr[i33 + 10] = (byte) (s73 >> 3);
                i33 += 11;
                i59++;
                i2 = i74;
            }
        }
    }

    public void decompressPolyVec(byte[] bArr, int i) {
        int i2 = 3;
        int i3 = 6;
        short s2 = 2;
        short s3 = 1;
        if (this.f228431vec.length != 4) {
            int i5 = i;
            for (int i6 = 0; i6 < this.f228431vec.length; i6++) {
                for (int i21 = 0; i21 < 64; i21++) {
                    int i22 = bArr[i5] & UnsignedBytes.MAX_VALUE;
                    byte b4 = bArr[i5 + 1];
                    short s4 = (short) (i22 | ((short) ((b4 & UnsignedBytes.MAX_VALUE) << 8)));
                    int i32 = (b4 & UnsignedBytes.MAX_VALUE) >> 2;
                    byte b5 = bArr[i5 + 2];
                    short s6 = (short) (i32 | ((short) ((b5 & UnsignedBytes.MAX_VALUE) << 6)));
                    int i33 = (b5 & UnsignedBytes.MAX_VALUE) >> 4;
                    byte b7 = bArr[i5 + 3];
                    short[] sArr = {s4, s6, (short) (i33 | ((short) ((b7 & UnsignedBytes.MAX_VALUE) << 4))), (short) (((b7 & UnsignedBytes.MAX_VALUE) >> 6) | ((short) ((bArr[i5 + 4] & UnsignedBytes.MAX_VALUE) << 2)))};
                    i5 += 5;
                    for (int i43 = 0; i43 < 4; i43++) {
                        this.f228431vec[i6].setCoeffIndex((i21 * 4) + i43, (short) ((((sArr[i43] & 1023) * 3329) + 512) >> 10));
                    }
                }
            }
            return;
        }
        int i59 = i;
        for (int i66 = 0; i66 < this.f228431vec.length; i66++) {
            int i74 = 0;
            while (i74 < 32) {
                int i92 = bArr[i59] & UnsignedBytes.MAX_VALUE;
                byte b13 = bArr[i59 + 1];
                short s11 = (short) (i92 | (((short) (b13 & UnsignedBytes.MAX_VALUE)) << 8));
                int i96 = (b13 & UnsignedBytes.MAX_VALUE) >> i2;
                byte b15 = bArr[i59 + 2];
                short s27 = (short) (i96 | (((short) (b15 & UnsignedBytes.MAX_VALUE)) << 5));
                int i99 = ((b15 & UnsignedBytes.MAX_VALUE) >> i3) | (((short) (bArr[i59 + 3] & UnsignedBytes.MAX_VALUE)) << s2);
                byte b17 = bArr[i59 + 4];
                int i100 = i2;
                short s37 = (short) (((short) ((b17 & UnsignedBytes.MAX_VALUE) << 10)) | i99);
                int i101 = (b17 & UnsignedBytes.MAX_VALUE) >> s3;
                byte b40 = bArr[i59 + 5];
                int i102 = i3;
                short s51 = (short) ((((short) (b40 & UnsignedBytes.MAX_VALUE)) << 7) | i101);
                int i103 = (b40 & UnsignedBytes.MAX_VALUE) >> 4;
                byte b61 = bArr[i59 + 6];
                short s60 = s2;
                short s61 = (short) ((((short) (b61 & UnsignedBytes.MAX_VALUE)) << 4) | i103);
                int i104 = ((b61 & UnsignedBytes.MAX_VALUE) >> 7) | (((short) (bArr[i59 + 7] & UnsignedBytes.MAX_VALUE)) << s3);
                byte b64 = bArr[i59 + 8];
                short s67 = (short) (((short) ((b64 & UnsignedBytes.MAX_VALUE) << 9)) | i104);
                int i105 = (b64 & UnsignedBytes.MAX_VALUE) >> 2;
                byte b69 = bArr[i59 + 9];
                short s73 = s3;
                short s100 = (short) ((((short) (b69 & UnsignedBytes.MAX_VALUE)) << 6) | i105);
                short s101 = (short) (((b69 & UnsignedBytes.MAX_VALUE) >> 5) | (((short) (bArr[i59 + 10] & UnsignedBytes.MAX_VALUE)) << 3));
                short[] sArr2 = new short[8];
                sArr2[0] = s11;
                sArr2[s73] = s27;
                sArr2[s60] = s37;
                sArr2[i100] = s51;
                sArr2[4] = s61;
                sArr2[5] = s67;
                sArr2[i102] = s100;
                sArr2[7] = s101;
                i59 += 11;
                for (int i106 = 0; i106 < 8; i106++) {
                    this.f228431vec[i66].setCoeffIndex((i74 * 8) + i106, (short) ((((sArr2[i106] & 2047) * 3329) + 1024) >> 11));
                }
                i74++;
                i2 = i100;
                i3 = i102;
                s2 = s60;
                s3 = s73;
            }
        }
    }

    public void fromBytes(byte[] bArr, int i) {
        int i2 = 0;
        while (true) {
            Poly[] polyArr = this.f228431vec;
            if (i2 >= polyArr.length) {
                return;
            }
            polyArr[i2].fromBytes(bArr, (i2 * 384) + i);
            i2++;
        }
    }

    public Poly getVectorIndex(int i) {
        return this.f228431vec[i];
    }

    public void polyVecInverseNttToMont() {
        int i = 0;
        while (true) {
            Poly[] polyArr = this.f228431vec;
            if (i >= polyArr.length) {
                return;
            }
            polyArr[i].polyInverseNttToMont();
            i++;
        }
    }

    public void polyVecNtt() {
        int i = 0;
        while (true) {
            Poly[] polyArr = this.f228431vec;
            if (i >= polyArr.length) {
                return;
            }
            polyArr[i].polyNtt();
            i++;
        }
    }

    public void reducePoly() {
        int i = 0;
        while (true) {
            Poly[] polyArr = this.f228431vec;
            if (i >= polyArr.length) {
                return;
            }
            polyArr[i].reduce();
            i++;
        }
    }

    public void toBytes(byte[] bArr, int i) {
        int i2 = 0;
        while (true) {
            Poly[] polyArr = this.f228431vec;
            if (i2 >= polyArr.length) {
                return;
            }
            polyArr[i2].toBytes(bArr, (i2 * 384) + i);
            i2++;
        }
    }
}
