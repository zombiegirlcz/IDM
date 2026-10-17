package org.bouncycastle.crypto.kems.mlkem;

import com.google.common.primitives.UnsignedBytes;
import org.bouncycastle.crypto.digests.SHAKEDigest;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes14.dex */
class MLKEMIndCpa {
    private static final int NUM_MATRIX_BLOCKS = 3;
    private static final int SHAKE128_RATE = 168;
    private final MLKEMEngine engine;

    public MLKEMIndCpa(MLKEMEngine mLKEMEngine) {
        this.engine = mLKEMEngine;
    }

    private byte[] packCipherText(PolyVec polyVec, Poly poly) {
        int polyVecCompressedBytes = this.engine.getPolyVecCompressedBytes();
        byte[] bArr = new byte[this.engine.getCipherTextBytes()];
        polyVec.compressPolyVec(bArr, 0);
        System.arraycopy(this.engine.getK() == 4 ? poly.compressPoly160() : poly.compressPoly128(), 0, bArr, polyVecCompressedBytes, this.engine.getPolyCompressedBytes());
        return bArr;
    }

    private static int rejectionSampling(Poly poly, int i, int i2, byte[] bArr, int i3) {
        int i5 = 0;
        int i6 = 0;
        while (i5 < i2) {
            int i21 = i6 + 3;
            if (i21 > i3) {
                break;
            }
            short s2 = (short) (bArr[i6] & UnsignedBytes.MAX_VALUE);
            byte b4 = bArr[i6 + 1];
            short s3 = (short) ((s2 | (((short) (b4 & UnsignedBytes.MAX_VALUE)) << 8)) & 4095);
            short s4 = (short) (((((short) (bArr[i6 + 2] & UnsignedBytes.MAX_VALUE)) << 4) | (((short) (b4 & UnsignedBytes.MAX_VALUE)) >> 4)) & 4095);
            if (s3 < 3329) {
                poly.setCoeffIndex(i + i5, s3);
                i5++;
            }
            if (i5 < i2 && s4 < 3329) {
                poly.setCoeffIndex(i + i5, s4);
                i5++;
            }
            i6 = i21;
        }
        return i5;
    }

    private void unpackCipherText(PolyVec polyVec, Poly poly, byte[] bArr, int i) {
        polyVec.decompressPolyVec(bArr, i);
        int polyVecCompressedBytes = this.engine.getPolyVecCompressedBytes() + i;
        if (this.engine.getK() == 4) {
            poly.decompressPoly160(bArr, polyVecCompressedBytes);
        } else {
            poly.decompressPoly128(bArr, polyVecCompressedBytes);
        }
    }

    public void decrypt(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        int k = this.engine.getK();
        PolyVec polyVec = new PolyVec(k);
        PolyVec polyVec2 = new PolyVec(k);
        Poly poly = new Poly();
        Poly poly2 = new Poly();
        unpackCipherText(polyVec, poly, bArr2, 0);
        unpackSecretKey(polyVec2, bArr);
        polyVec.polyVecNtt();
        PolyVec.pointwiseAccountMontgomery(poly2, polyVec2, polyVec, this.engine);
        poly2.polyInverseNttToMont();
        poly2.subtract(poly);
        poly2.reduce();
        poly2.toMsg(bArr3);
    }

    public byte[] encrypt(byte[] bArr, int i, byte[] bArr2, int i2, byte[] bArr3, int i3) {
        PolyVec[] polyVecArr;
        byte b4;
        int k = this.engine.getK();
        PolyVec polyVec = new PolyVec(k);
        PolyVec polyVec2 = new PolyVec(k);
        PolyVec polyVec3 = new PolyVec(k);
        PolyVec polyVec4 = new PolyVec(k);
        Poly poly = new Poly();
        Poly poly2 = new Poly();
        Poly poly3 = new Poly();
        byte[] bArrUnpackPublicKey = unpackPublicKey(polyVec2, bArr, i);
        poly3.fromMsg(bArr2, i2);
        PolyVec[] polyVecArr2 = new PolyVec[this.engine.getK()];
        for (int i5 = 0; i5 < k; i5++) {
            polyVecArr2[i5] = new PolyVec(k);
        }
        generateMatrixA(polyVecArr2, bArrUnpackPublicKey, true);
        SHAKEDigest sHAKEDigest = new SHAKEDigest(256);
        if (this.engine.getEta1() == 2) {
            int i6 = 0;
            b4 = 0;
            while (i6 < k) {
                polyVec.getVectorIndex(i6).getNoiseEta2(sHAKEDigest, bArr3, i3, b4);
                i6++;
                b4 = (byte) (b4 + 1);
                polyVecArr2 = polyVecArr2;
            }
            polyVecArr = polyVecArr2;
        } else {
            polyVecArr = polyVecArr2;
            int i21 = 0;
            b4 = 0;
            while (i21 < k) {
                polyVec.getVectorIndex(i21).getNoiseEta3(sHAKEDigest, bArr3, i3, b4);
                i21++;
                b4 = (byte) (b4 + 1);
            }
        }
        int i22 = 0;
        while (i22 < k) {
            polyVec3.getVectorIndex(i22).getNoiseEta2(sHAKEDigest, bArr3, i3, b4);
            i22++;
            b4 = (byte) (b4 + 1);
        }
        poly.getNoiseEta2(sHAKEDigest, bArr3, i3, b4);
        polyVec.polyVecNtt();
        for (int i32 = 0; i32 < k; i32++) {
            PolyVec.pointwiseAccountMontgomery(polyVec4.getVectorIndex(i32), polyVecArr[i32], polyVec, this.engine);
        }
        PolyVec.pointwiseAccountMontgomery(poly2, polyVec2, polyVec, this.engine);
        polyVec4.polyVecInverseNttToMont();
        poly2.polyInverseNttToMont();
        polyVec4.addPoly(polyVec3);
        poly2.add(poly);
        poly2.add(poly3);
        polyVec4.reducePoly();
        poly2.reduce();
        return packCipherText(polyVec4, poly2);
    }

    public byte[][] generateKeyPair(byte[] bArr) {
        int k = this.engine.getK();
        PolyVec polyVec = new PolyVec(k);
        PolyVec polyVec2 = new PolyVec(k);
        byte[] bArr2 = new byte[64];
        MLKEMEngine.hash_G(Arrays.append(bArr, (byte) k), bArr2);
        PolyVec[] polyVecArr = new PolyVec[k];
        for (int i = 0; i < k; i++) {
            polyVecArr[i] = new PolyVec(k);
        }
        generateMatrixA(polyVecArr, bArr2, false);
        SHAKEDigest sHAKEDigest = new SHAKEDigest(256);
        if (this.engine.getEta1() == 2) {
            int i2 = 0;
            byte b4 = 0;
            while (i2 < k) {
                polyVec.getVectorIndex(i2).getNoiseEta2(sHAKEDigest, bArr2, 32, b4);
                i2++;
                b4 = (byte) (b4 + 1);
            }
            int i3 = 0;
            while (i3 < k) {
                polyVec2.getVectorIndex(i3).getNoiseEta2(sHAKEDigest, bArr2, 32, b4);
                i3++;
                b4 = (byte) (b4 + 1);
            }
        } else {
            int i5 = 0;
            byte b5 = 0;
            while (i5 < k) {
                polyVec.getVectorIndex(i5).getNoiseEta3(sHAKEDigest, bArr2, 32, b5);
                i5++;
                b5 = (byte) (b5 + 1);
            }
            int i6 = 0;
            while (i6 < k) {
                polyVec2.getVectorIndex(i6).getNoiseEta3(sHAKEDigest, bArr2, 32, b5);
                i6++;
                b5 = (byte) (b5 + 1);
            }
        }
        polyVec.polyVecNtt();
        polyVec2.polyVecNtt();
        PolyVec polyVec3 = new PolyVec(k);
        for (int i21 = 0; i21 < k; i21++) {
            PolyVec.pointwiseAccountMontgomery(polyVec3.getVectorIndex(i21), polyVecArr[i21], polyVec, this.engine);
            polyVec3.getVectorIndex(i21).convertToMont();
        }
        polyVec3.addPoly(polyVec2);
        polyVec3.reducePoly();
        return new byte[][]{packPublicKey(polyVec3, bArr2), packSecretKey(polyVec)};
    }

    public void generateMatrixA(PolyVec[] polyVecArr, byte[] bArr, boolean z) {
        byte b4;
        int k = this.engine.getK();
        SHAKEDigest sHAKEDigest = new SHAKEDigest(128);
        byte[] bArr2 = new byte[506];
        for (int i = 0; i < k; i++) {
            for (int i2 = 0; i2 < k; i2++) {
                sHAKEDigest.reset();
                sHAKEDigest.update(bArr, 0, 32);
                if (z) {
                    sHAKEDigest.update((byte) i);
                    b4 = (byte) i2;
                } else {
                    sHAKEDigest.update((byte) i2);
                    b4 = (byte) i;
                }
                sHAKEDigest.update(b4);
                int i3 = 504;
                sHAKEDigest.doOutput(bArr2, 0, 504);
                int iRejectionSampling = rejectionSampling(polyVecArr[i].getVectorIndex(i2), 0, 256, bArr2, 504);
                while (iRejectionSampling < 256) {
                    int i5 = i3 % 3;
                    for (int i6 = 0; i6 < i5; i6++) {
                        bArr2[i6] = bArr2[(i3 - i5) + i6];
                    }
                    sHAKEDigest.doOutput(bArr2, i5, 336);
                    i3 = i5 + 168;
                    iRejectionSampling += rejectionSampling(polyVecArr[i].getVectorIndex(i2), iRejectionSampling, 256 - iRejectionSampling, bArr2, i3);
                }
            }
        }
    }

    public byte[] packPublicKey(PolyVec polyVec, byte[] bArr) {
        int publicKeyBytes = this.engine.getPublicKeyBytes();
        int polyVecBytes = this.engine.getPolyVecBytes();
        byte[] bArr2 = new byte[publicKeyBytes];
        polyVec.toBytes(bArr2, 0);
        System.arraycopy(bArr, 0, bArr2, polyVecBytes, 32);
        return bArr2;
    }

    public byte[] packSecretKey(PolyVec polyVec) {
        byte[] bArr = new byte[this.engine.getPolyVecBytes()];
        polyVec.toBytes(bArr, 0);
        return bArr;
    }

    public byte[] unpackPublicKey(PolyVec polyVec, byte[] bArr, int i) {
        int polyVecBytes = this.engine.getPolyVecBytes();
        byte[] bArr2 = new byte[32];
        polyVec.fromBytes(bArr, i);
        System.arraycopy(bArr, i + polyVecBytes, bArr2, 0, 32);
        return bArr2;
    }

    public void unpackSecretKey(PolyVec polyVec, byte[] bArr) {
        polyVec.fromBytes(bArr, 0);
    }
}
