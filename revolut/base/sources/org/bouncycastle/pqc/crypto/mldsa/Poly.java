package org.bouncycastle.pqc.crypto.mldsa;

import com.google.common.primitives.UnsignedBytes;
import com.youTransactor.uCube.rpc.Constants;
import org.bouncycastle.crypto.digests.SHAKEDigest;

/* JADX INFO: loaded from: classes14.dex */
class Poly {
    private static final int DilithiumN = 256;
    private int[] coeffs = new int[256];
    private final MLDSAEngine engine;
    private final int polyUniformNBlocks;
    private final Symmetric symmetric;

    public Poly(MLDSAEngine mLDSAEngine) {
        this.engine = mLDSAEngine;
        Symmetric symmetricGetSymmetric = mLDSAEngine.GetSymmetric();
        this.symmetric = symmetricGetSymmetric;
        int i = symmetricGetSymmetric.stream128BlockBytes;
        this.polyUniformNBlocks = (i + 767) / i;
    }

    private static int rejectEta(Poly poly, int i, int i2, byte[] bArr, int i3, int i5) {
        int i6 = 0;
        int i21 = 0;
        while (i6 < i2 && i21 < i3) {
            byte b4 = bArr[i21];
            int i22 = b4 & 15;
            i21++;
            int i32 = (b4 & UnsignedBytes.MAX_VALUE) >> 4;
            if (i5 == 2) {
                if (i22 < 15) {
                    poly.setCoeffIndex(i + i6, 2 - (i22 - (((i22 * Constants.TAG_KSN_FORMATS) >> 10) * 5)));
                    i6++;
                }
                if (i32 < 15 && i6 < i2) {
                    poly.setCoeffIndex(i + i6, 2 - (i32 - (((i32 * Constants.TAG_KSN_FORMATS) >> 10) * 5)));
                    i6++;
                }
            } else if (i5 == 4) {
                if (i22 < 9) {
                    poly.setCoeffIndex(i + i6, 4 - i22);
                    i6++;
                }
                if (i32 < 9 && i6 < i2) {
                    poly.setCoeffIndex(i + i6, 4 - i32);
                    i6++;
                }
            }
        }
        return i6;
    }

    private static int rejectUniform(Poly poly, int i, int i2, byte[] bArr, int i3) {
        int i5 = 0;
        int i6 = 0;
        while (i5 < i2 && i6 + 3 <= i3) {
            int i21 = i6 + 2;
            int i22 = ((bArr[i6 + 1] & UnsignedBytes.MAX_VALUE) << 8) | (bArr[i6] & UnsignedBytes.MAX_VALUE);
            i6 += 3;
            int i32 = (i22 | ((bArr[i21] & UnsignedBytes.MAX_VALUE) << 16)) & 8388607;
            if (i32 < 8380417) {
                poly.setCoeffIndex(i + i5, i32);
                i5++;
            }
        }
        return i5;
    }

    private void unpackZ(byte[] bArr) {
        int dilithiumGamma1 = this.engine.getDilithiumGamma1();
        int i = 0;
        if (dilithiumGamma1 != 131072) {
            if (dilithiumGamma1 != 524288) {
                throw new RuntimeException("Wrong Dilithiumn Gamma1!");
            }
            while (i < 128) {
                int i2 = i * 2;
                int i3 = i * 5;
                int i5 = i3 + 2;
                setCoeffIndex(i2, ((bArr[i3] & UnsignedBytes.MAX_VALUE) | ((bArr[i3 + 1] & UnsignedBytes.MAX_VALUE) << 8) | ((bArr[i5] & UnsignedBytes.MAX_VALUE) << 16)) & 1048575);
                int i6 = i2 + 1;
                setCoeffIndex(i6, (((bArr[i3 + 4] & UnsignedBytes.MAX_VALUE) << 12) | ((bArr[i5] & UnsignedBytes.MAX_VALUE) >> 4) | ((bArr[i3 + 3] & UnsignedBytes.MAX_VALUE) << 4)) & 1048575);
                setCoeffIndex(i2, dilithiumGamma1 - getCoeffIndex(i2));
                setCoeffIndex(i6, dilithiumGamma1 - getCoeffIndex(i6));
                i++;
            }
            return;
        }
        while (i < 64) {
            int i21 = i * 4;
            int i22 = i * 9;
            int i32 = i22 + 2;
            setCoeffIndex(i21, ((bArr[i22] & UnsignedBytes.MAX_VALUE) | ((bArr[i22 + 1] & UnsignedBytes.MAX_VALUE) << 8) | ((bArr[i32] & UnsignedBytes.MAX_VALUE) << 16)) & 262143);
            int i33 = i21 + 1;
            int i43 = i22 + 4;
            setCoeffIndex(i33, (((bArr[i32] & UnsignedBytes.MAX_VALUE) >> 2) | ((bArr[i22 + 3] & UnsignedBytes.MAX_VALUE) << 6) | ((bArr[i43] & UnsignedBytes.MAX_VALUE) << 14)) & 262143);
            int i59 = i21 + 2;
            int i66 = i22 + 6;
            setCoeffIndex(i59, (((bArr[i43] & UnsignedBytes.MAX_VALUE) >> 4) | ((bArr[i22 + 5] & UnsignedBytes.MAX_VALUE) << 4) | ((bArr[i66] & UnsignedBytes.MAX_VALUE) << 12)) & 262143);
            int i74 = i21 + 3;
            setCoeffIndex(i74, (((bArr[i22 + 8] & UnsignedBytes.MAX_VALUE) << 10) | ((bArr[i66] & UnsignedBytes.MAX_VALUE) >> 6) | ((bArr[i22 + 7] & UnsignedBytes.MAX_VALUE) << 2)) & 262143);
            setCoeffIndex(i21, dilithiumGamma1 - getCoeffIndex(i21));
            setCoeffIndex(i33, dilithiumGamma1 - getCoeffIndex(i33));
            setCoeffIndex(i59, dilithiumGamma1 - getCoeffIndex(i59));
            setCoeffIndex(i74, dilithiumGamma1 - getCoeffIndex(i74));
            i++;
        }
    }

    public void addPoly(Poly poly) {
        for (int i = 0; i < 256; i++) {
            setCoeffIndex(i, getCoeffIndex(i) + poly.getCoeffIndex(i));
        }
    }

    public void challenge(byte[] bArr, int i, int i2) {
        int i3;
        int i5;
        int i6;
        byte[] bArr2 = new byte[this.symmetric.stream256BlockBytes];
        SHAKEDigest sHAKEDigest = new SHAKEDigest(256);
        sHAKEDigest.update(bArr, i, i2);
        sHAKEDigest.doOutput(bArr2, 0, this.symmetric.stream256BlockBytes);
        long j2 = 0;
        int i21 = 0;
        while (true) {
            i3 = 8;
            if (i21 >= 8) {
                break;
            }
            j2 |= ((long) (bArr2[i21] & UnsignedBytes.MAX_VALUE)) << (i21 * 8);
            i21++;
        }
        for (int i22 = 0; i22 < 256; i22++) {
            setCoeffIndex(i22, 0);
        }
        int dilithiumTau = 256 - this.engine.getDilithiumTau();
        while (dilithiumTau < 256) {
            while (true) {
                int i32 = this.symmetric.stream256BlockBytes;
                if (i3 >= i32) {
                    sHAKEDigest.doOutput(bArr2, 0, i32);
                    i3 = 0;
                }
                i5 = i3 + 1;
                i6 = bArr2[i3] & UnsignedBytes.MAX_VALUE;
                if (i6 <= dilithiumTau) {
                    break;
                } else {
                    i3 = i5;
                }
            }
            setCoeffIndex(dilithiumTau, getCoeffIndex(i6));
            setCoeffIndex(i6, (int) (1 - ((j2 & 1) * 2)));
            j2 >>= 1;
            dilithiumTau++;
            i3 = i5;
        }
    }

    public boolean checkNorm(int i) {
        if (i > 1047552) {
            return true;
        }
        for (int i2 = 0; i2 < 256; i2++) {
            if (getCoeffIndex(i2) - ((getCoeffIndex(i2) >> 31) & (getCoeffIndex(i2) * 2)) >= i) {
                return true;
            }
        }
        return false;
    }

    public void conditionalAddQ() {
        for (int i = 0; i < 256; i++) {
            setCoeffIndex(i, Reduce.conditionalAddQ(getCoeffIndex(i)));
        }
    }

    public void copyTo(Poly poly) {
        System.arraycopy(this.coeffs, 0, poly.coeffs, 0, 256);
    }

    public void decompose(Poly poly) {
        int dilithiumGamma2 = this.engine.getDilithiumGamma2();
        for (int i = 0; i < 256; i++) {
            int[] iArrDecompose = Rounding.decompose(getCoeffIndex(i), dilithiumGamma2);
            setCoeffIndex(i, iArrDecompose[1]);
            poly.setCoeffIndex(i, iArrDecompose[0]);
        }
    }

    public int getCoeffIndex(int i) {
        return this.coeffs[i];
    }

    public int[] getCoeffs() {
        return this.coeffs;
    }

    public void invNttToMont() {
        setCoeffs(Ntt.invNttToMont(getCoeffs()));
    }

    public void packW1(byte[] bArr, int i) {
        int i2 = 0;
        if (this.engine.getDilithiumGamma2() != 95232) {
            if (this.engine.getDilithiumGamma2() == 261888) {
                while (i2 < 128) {
                    int i3 = i2 * 2;
                    bArr[i + i2] = (byte) ((getCoeffIndex(i3 + 1) << 4) | getCoeffIndex(i3));
                    i2++;
                }
                return;
            }
            return;
        }
        while (i2 < 64) {
            int i5 = (i2 * 3) + i;
            int i6 = i2 * 4;
            int i21 = i6 + 1;
            bArr[i5] = (byte) (((byte) getCoeffIndex(i6)) | (getCoeffIndex(i21) << 6));
            int i22 = i6 + 2;
            bArr[i5 + 1] = (byte) (((byte) (getCoeffIndex(i21) >> 2)) | (getCoeffIndex(i22) << 4));
            bArr[i5 + 2] = (byte) ((getCoeffIndex(i6 + 3) << 2) | ((byte) (getCoeffIndex(i22) >> 4)));
            i2++;
        }
    }

    public void pointwiseAccountMontgomery(PolyVecL polyVecL, PolyVecL polyVecL2) {
        Poly poly = new Poly(this.engine);
        pointwiseMontgomery(polyVecL.getVectorIndex(0), polyVecL2.getVectorIndex(0));
        for (int i = 1; i < this.engine.getDilithiumL(); i++) {
            poly.pointwiseMontgomery(polyVecL.getVectorIndex(i), polyVecL2.getVectorIndex(i));
            addPoly(poly);
        }
    }

    public void pointwiseMontgomery(Poly poly, Poly poly2) {
        for (int i = 0; i < 256; i++) {
            setCoeffIndex(i, Reduce.montgomeryReduce(((long) poly.getCoeffIndex(i)) * ((long) poly2.getCoeffIndex(i))));
        }
    }

    public byte[] polyEtaPack(byte[] bArr, int i) {
        byte[] bArr2 = new byte[8];
        if (this.engine.getDilithiumEta() == 2) {
            for (int i2 = 0; i2 < 32; i2++) {
                int i3 = i2 * 8;
                bArr2[0] = (byte) (this.engine.getDilithiumEta() - getCoeffIndex(i3));
                bArr2[1] = (byte) (this.engine.getDilithiumEta() - getCoeffIndex(i3 + 1));
                bArr2[2] = (byte) (this.engine.getDilithiumEta() - getCoeffIndex(i3 + 2));
                bArr2[3] = (byte) (this.engine.getDilithiumEta() - getCoeffIndex(i3 + 3));
                bArr2[4] = (byte) (this.engine.getDilithiumEta() - getCoeffIndex(i3 + 4));
                bArr2[5] = (byte) (this.engine.getDilithiumEta() - getCoeffIndex(i3 + 5));
                bArr2[6] = (byte) (this.engine.getDilithiumEta() - getCoeffIndex(i3 + 6));
                bArr2[7] = (byte) (this.engine.getDilithiumEta() - getCoeffIndex(i3 + 7));
                int i5 = (i2 * 3) + i;
                bArr[i5] = (byte) (bArr2[0] | (bArr2[1] << 3) | (bArr2[2] << 6));
                bArr[i5 + 1] = (byte) ((bArr2[3] << 1) | (bArr2[2] >> 2) | (bArr2[4] << 4) | (bArr2[5] << 7));
                bArr[i5 + 2] = (byte) ((bArr2[5] >> 1) | (bArr2[6] << 2) | (bArr2[7] << 5));
            }
        } else {
            if (this.engine.getDilithiumEta() != 4) {
                throw new RuntimeException("Eta needs to be 2 or 4!");
            }
            for (int i6 = 0; i6 < 128; i6++) {
                int i21 = i6 * 2;
                bArr2[0] = (byte) (this.engine.getDilithiumEta() - getCoeffIndex(i21));
                byte dilithiumEta = (byte) (this.engine.getDilithiumEta() - getCoeffIndex(i21 + 1));
                bArr2[1] = dilithiumEta;
                bArr[i + i6] = (byte) ((dilithiumEta << 4) | bArr2[0]);
            }
        }
        return bArr;
    }

    public void polyEtaUnpack(byte[] bArr, int i) {
        int dilithiumEta = this.engine.getDilithiumEta();
        int i2 = 0;
        if (this.engine.getDilithiumEta() != 2) {
            if (this.engine.getDilithiumEta() == 4) {
                while (i2 < 128) {
                    int i3 = i2 * 2;
                    int i5 = i + i2;
                    setCoeffIndex(i3, bArr[i5] & 15);
                    int i6 = i3 + 1;
                    setCoeffIndex(i6, (bArr[i5] & UnsignedBytes.MAX_VALUE) >> 4);
                    setCoeffIndex(i3, dilithiumEta - getCoeffIndex(i3));
                    setCoeffIndex(i6, dilithiumEta - getCoeffIndex(i6));
                    i2++;
                }
                return;
            }
            return;
        }
        while (i2 < 32) {
            int i21 = (i2 * 3) + i;
            int i22 = i2 * 8;
            setCoeffIndex(i22, bArr[i21] & 7);
            int i32 = i22 + 1;
            setCoeffIndex(i32, ((bArr[i21] & UnsignedBytes.MAX_VALUE) >> 3) & 7);
            int i33 = i22 + 2;
            int i43 = i21 + 1;
            setCoeffIndex(i33, ((bArr[i21] & UnsignedBytes.MAX_VALUE) >> 6) | (((bArr[i43] & UnsignedBytes.MAX_VALUE) << 2) & 7));
            int i59 = i22 + 3;
            setCoeffIndex(i59, ((bArr[i43] & UnsignedBytes.MAX_VALUE) >> 1) & 7);
            int i66 = i22 + 4;
            setCoeffIndex(i66, ((bArr[i43] & UnsignedBytes.MAX_VALUE) >> 4) & 7);
            int i74 = i22 + 5;
            int i92 = i21 + 2;
            setCoeffIndex(i74, ((bArr[i43] & UnsignedBytes.MAX_VALUE) >> 7) | (((bArr[i92] & UnsignedBytes.MAX_VALUE) << 1) & 7));
            int i96 = i22 + 6;
            setCoeffIndex(i96, ((bArr[i92] & UnsignedBytes.MAX_VALUE) >> 2) & 7);
            int i99 = i22 + 7;
            setCoeffIndex(i99, ((bArr[i92] & UnsignedBytes.MAX_VALUE) >> 5) & 7);
            setCoeffIndex(i22, dilithiumEta - getCoeffIndex(i22));
            setCoeffIndex(i32, dilithiumEta - getCoeffIndex(i32));
            setCoeffIndex(i33, dilithiumEta - getCoeffIndex(i33));
            setCoeffIndex(i59, dilithiumEta - getCoeffIndex(i59));
            setCoeffIndex(i66, dilithiumEta - getCoeffIndex(i66));
            setCoeffIndex(i74, dilithiumEta - getCoeffIndex(i74));
            setCoeffIndex(i96, dilithiumEta - getCoeffIndex(i96));
            setCoeffIndex(i99, dilithiumEta - getCoeffIndex(i99));
            i2++;
        }
    }

    public int polyMakeHint(Poly poly, Poly poly2) {
        int coeffIndex = 0;
        for (int i = 0; i < 256; i++) {
            setCoeffIndex(i, Rounding.makeHint(poly.getCoeffIndex(i), poly2.getCoeffIndex(i), this.engine));
            coeffIndex += getCoeffIndex(i);
        }
        return coeffIndex;
    }

    public void polyNtt() {
        setCoeffs(Ntt.ntt(this.coeffs));
    }

    public void polyUseHint(Poly poly, Poly poly2) {
        for (int i = 0; i < 256; i++) {
            setCoeffIndex(i, Rounding.useHint(poly.getCoeffIndex(i), poly2.getCoeffIndex(i), this.engine.getDilithiumGamma2()));
        }
    }

    public byte[] polyt0Pack(byte[] bArr, int i) {
        for (int i2 = 0; i2 < 32; i2++) {
            int i3 = i2 * 8;
            int[] iArr = {4096 - getCoeffIndex(i3), 4096 - getCoeffIndex(i3 + 1), 4096 - getCoeffIndex(i3 + 2), 4096 - getCoeffIndex(i3 + 3), 4096 - getCoeffIndex(i3 + 4), 4096 - getCoeffIndex(i3 + 5), 4096 - getCoeffIndex(i3 + 6), 4096 - getCoeffIndex(i3 + 7)};
            int i5 = (i2 * 13) + i;
            int i6 = iArr[0];
            bArr[i5] = (byte) i6;
            int i21 = i5 + 1;
            byte b4 = (byte) (i6 >> 8);
            bArr[i21] = b4;
            int i22 = iArr[1];
            bArr[i21] = (byte) (b4 | ((byte) (i22 << 5)));
            bArr[i5 + 2] = (byte) (i22 >> 3);
            int i32 = i5 + 3;
            byte b5 = (byte) (i22 >> 11);
            bArr[i32] = b5;
            int i33 = iArr[2];
            bArr[i32] = (byte) (b5 | ((byte) (i33 << 2)));
            int i43 = i5 + 4;
            byte b7 = (byte) (i33 >> 6);
            bArr[i43] = b7;
            int i59 = iArr[3];
            bArr[i43] = (byte) (b7 | ((byte) (i59 << 7)));
            bArr[i5 + 5] = (byte) (i59 >> 1);
            int i66 = i5 + 6;
            byte b13 = (byte) (i59 >> 9);
            bArr[i66] = b13;
            int i74 = iArr[4];
            bArr[i66] = (byte) (b13 | ((byte) (i74 << 4)));
            bArr[i5 + 7] = (byte) (i74 >> 4);
            int i92 = i5 + 8;
            byte b15 = (byte) (i74 >> 12);
            bArr[i92] = b15;
            int i96 = iArr[5];
            bArr[i92] = (byte) (b15 | ((byte) (i96 << 1)));
            int i99 = i5 + 9;
            byte b17 = (byte) (i96 >> 7);
            bArr[i99] = b17;
            int i100 = iArr[6];
            bArr[i99] = (byte) (b17 | ((byte) (i100 << 6)));
            bArr[i5 + 10] = (byte) (i100 >> 2);
            int i101 = i5 + 11;
            byte b40 = (byte) (i100 >> 10);
            bArr[i101] = b40;
            int i102 = iArr[7];
            bArr[i101] = (byte) (((byte) (i102 << 3)) | b40);
            bArr[i5 + 12] = (byte) (i102 >> 5);
        }
        return bArr;
    }

    public void polyt0Unpack(byte[] bArr, int i) {
        for (int i2 = 0; i2 < 32; i2++) {
            int i3 = (i2 * 13) + i;
            int i5 = i2 * 8;
            int i6 = i3 + 1;
            setCoeffIndex(i5, ((bArr[i3] & UnsignedBytes.MAX_VALUE) | ((bArr[i6] & UnsignedBytes.MAX_VALUE) << 8)) & 8191);
            int i21 = i5 + 1;
            int i22 = i3 + 3;
            setCoeffIndex(i21, (((bArr[i6] & UnsignedBytes.MAX_VALUE) >> 5) | ((bArr[i3 + 2] & UnsignedBytes.MAX_VALUE) << 3) | ((bArr[i22] & UnsignedBytes.MAX_VALUE) << 11)) & 8191);
            int i32 = i5 + 2;
            int i33 = i3 + 4;
            setCoeffIndex(i32, (((bArr[i22] & UnsignedBytes.MAX_VALUE) >> 2) | ((bArr[i33] & UnsignedBytes.MAX_VALUE) << 6)) & 8191);
            int i43 = i5 + 3;
            int i59 = i3 + 6;
            setCoeffIndex(i43, (((bArr[i33] & UnsignedBytes.MAX_VALUE) >> 7) | ((bArr[i3 + 5] & UnsignedBytes.MAX_VALUE) << 1) | ((bArr[i59] & UnsignedBytes.MAX_VALUE) << 9)) & 8191);
            int i66 = i5 + 4;
            int i74 = i3 + 8;
            setCoeffIndex(i66, (((bArr[i59] & UnsignedBytes.MAX_VALUE) >> 4) | ((bArr[i3 + 7] & UnsignedBytes.MAX_VALUE) << 4) | ((bArr[i74] & UnsignedBytes.MAX_VALUE) << 12)) & 8191);
            int i92 = i5 + 5;
            int i96 = i3 + 9;
            setCoeffIndex(i92, (((bArr[i74] & UnsignedBytes.MAX_VALUE) >> 1) | ((bArr[i96] & UnsignedBytes.MAX_VALUE) << 7)) & 8191);
            int i99 = i5 + 6;
            int i100 = i3 + 11;
            setCoeffIndex(i99, (((bArr[i96] & UnsignedBytes.MAX_VALUE) >> 6) | ((bArr[i3 + 10] & UnsignedBytes.MAX_VALUE) << 2) | ((bArr[i100] & UnsignedBytes.MAX_VALUE) << 10)) & 8191);
            int i101 = i5 + 7;
            setCoeffIndex(i101, (((bArr[i3 + 12] & UnsignedBytes.MAX_VALUE) << 5) | ((bArr[i100] & UnsignedBytes.MAX_VALUE) >> 3)) & 8191);
            setCoeffIndex(i5, 4096 - getCoeffIndex(i5));
            setCoeffIndex(i21, 4096 - getCoeffIndex(i21));
            setCoeffIndex(i32, 4096 - getCoeffIndex(i32));
            setCoeffIndex(i43, 4096 - getCoeffIndex(i43));
            setCoeffIndex(i66, 4096 - getCoeffIndex(i66));
            setCoeffIndex(i92, 4096 - getCoeffIndex(i92));
            setCoeffIndex(i99, 4096 - getCoeffIndex(i99));
            setCoeffIndex(i101, 4096 - getCoeffIndex(i101));
        }
    }

    public byte[] polyt1Pack() {
        byte[] bArr = new byte[320];
        for (int i = 0; i < 64; i++) {
            int i2 = i * 5;
            int[] iArr = this.coeffs;
            int i3 = i * 4;
            int i5 = iArr[i3];
            bArr[i2] = (byte) i5;
            int i6 = iArr[i3 + 1];
            bArr[i2 + 1] = (byte) ((i5 >> 8) | (i6 << 2));
            int i21 = i6 >> 6;
            int i22 = iArr[i3 + 2];
            bArr[i2 + 2] = (byte) (i21 | (i22 << 4));
            int i32 = iArr[i3 + 3];
            bArr[i2 + 3] = (byte) ((i32 << 6) | (i22 >> 4));
            bArr[i2 + 4] = (byte) (i32 >> 2);
        }
        return bArr;
    }

    public void polyt1Unpack(byte[] bArr) {
        for (int i = 0; i < 64; i++) {
            int i2 = i * 4;
            int i3 = i * 5;
            int i5 = i3 + 1;
            setCoeffIndex(i2, ((bArr[i3] & UnsignedBytes.MAX_VALUE) | ((bArr[i5] & UnsignedBytes.MAX_VALUE) << 8)) & 1023);
            int i6 = i3 + 2;
            setCoeffIndex(i2 + 1, (((bArr[i5] & UnsignedBytes.MAX_VALUE) >> 2) | ((bArr[i6] & UnsignedBytes.MAX_VALUE) << 6)) & 1023);
            int i21 = (bArr[i6] & UnsignedBytes.MAX_VALUE) >> 4;
            int i22 = i3 + 3;
            setCoeffIndex(i2 + 2, (i21 | ((bArr[i22] & UnsignedBytes.MAX_VALUE) << 4)) & 1023);
            setCoeffIndex(i2 + 3, (((bArr[i3 + 4] & UnsignedBytes.MAX_VALUE) << 2) | ((bArr[i22] & UnsignedBytes.MAX_VALUE) >> 6)) & 1023);
        }
    }

    public void power2Round(Poly poly) {
        Rounding.power2RoundAll(this.coeffs, poly.coeffs);
    }

    public void reduce() {
        for (int i = 0; i < 256; i++) {
            setCoeffIndex(i, Reduce.reduce32(getCoeffIndex(i)));
        }
    }

    public void setCoeffIndex(int i, int i2) {
        this.coeffs[i] = i2;
    }

    public void setCoeffs(int[] iArr) {
        this.coeffs = iArr;
    }

    public void shiftLeft() {
        for (int i = 0; i < 256; i++) {
            setCoeffIndex(i, getCoeffIndex(i) << 13);
        }
    }

    public void subtract(Poly poly) {
        for (int i = 0; i < 256; i++) {
            setCoeffIndex(i, getCoeffIndex(i) - poly.getCoeffIndex(i));
        }
    }

    public String toString() {
        StringBuilder sb6 = new StringBuilder("[");
        int i = 0;
        while (true) {
            int[] iArr = this.coeffs;
            if (i >= iArr.length) {
                sb6.append("]");
                return sb6.toString();
            }
            sb6.append(iArr[i]);
            if (i != this.coeffs.length - 1) {
                sb6.append(", ");
            }
            i++;
        }
    }

    public void uniformBlocks(byte[] bArr, short s2) {
        int i = this.polyUniformNBlocks;
        Symmetric symmetric = this.symmetric;
        int i2 = i * symmetric.stream128BlockBytes;
        byte[] bArr2 = new byte[i2 + 2];
        symmetric.stream128init(bArr, s2);
        this.symmetric.stream128squeezeBlocks(bArr2, 0, i2);
        int iRejectUniform = rejectUniform(this, 0, 256, bArr2, i2);
        while (iRejectUniform < 256) {
            int i3 = i2 % 3;
            for (int i5 = 0; i5 < i3; i5++) {
                bArr2[i5] = bArr2[(i2 - i3) + i5];
            }
            Symmetric symmetric2 = this.symmetric;
            symmetric2.stream128squeezeBlocks(bArr2, i3, symmetric2.stream128BlockBytes);
            i2 = this.symmetric.stream128BlockBytes + i3;
            iRejectUniform += rejectUniform(this, iRejectUniform, 256 - iRejectUniform, bArr2, i2);
        }
    }

    public void uniformEta(byte[] bArr, short s2) {
        int i;
        int i2;
        int dilithiumEta = this.engine.getDilithiumEta();
        if (this.engine.getDilithiumEta() == 2) {
            i = this.symmetric.stream256BlockBytes;
            i2 = i + 135;
        } else {
            if (this.engine.getDilithiumEta() != 4) {
                throw new RuntimeException("Wrong Dilithium Eta!");
            }
            i = this.symmetric.stream256BlockBytes;
            i2 = i + Constants.TAG_E2_CONFIGURATION_PAYMENT_SCHEME_CUSTOMIZATION;
        }
        int i3 = i2 / i;
        Symmetric symmetric = this.symmetric;
        int i5 = i3 * symmetric.stream256BlockBytes;
        byte[] bArr2 = new byte[i5];
        symmetric.stream256init(bArr, s2);
        this.symmetric.stream256squeezeBlocks(bArr2, 0, i5);
        Poly poly = this;
        int iRejectEta = rejectEta(poly, 0, 256, bArr2, i5, dilithiumEta);
        while (iRejectEta < 256) {
            Symmetric symmetric2 = poly.symmetric;
            symmetric2.stream256squeezeBlocks(bArr2, 0, symmetric2.stream256BlockBytes);
            iRejectEta += rejectEta(poly, iRejectEta, 256 - iRejectEta, bArr2, poly.symmetric.stream256BlockBytes, dilithiumEta);
            poly = this;
        }
    }

    public void uniformGamma1(byte[] bArr, short s2) {
        int polyUniformGamma1NBlocks = this.engine.getPolyUniformGamma1NBlocks();
        Symmetric symmetric = this.symmetric;
        byte[] bArr2 = new byte[polyUniformGamma1NBlocks * symmetric.stream256BlockBytes];
        symmetric.stream256init(bArr, s2);
        this.symmetric.stream256squeezeBlocks(bArr2, 0, this.engine.getPolyUniformGamma1NBlocks() * this.symmetric.stream256BlockBytes);
        unpackZ(bArr2);
    }

    public void zPack(byte[] bArr, int i) {
        int dilithiumGamma1 = this.engine.getDilithiumGamma1();
        int i2 = 0;
        if (dilithiumGamma1 != 131072) {
            if (dilithiumGamma1 != 524288) {
                throw new RuntimeException("Wrong Dilithium Gamma1!");
            }
            while (i2 < 128) {
                int i3 = i2 * 2;
                int coeffIndex = dilithiumGamma1 - getCoeffIndex(i3);
                int coeffIndex2 = dilithiumGamma1 - getCoeffIndex(i3 + 1);
                int i5 = (i2 * 5) + i;
                bArr[i5] = (byte) coeffIndex;
                bArr[i5 + 1] = (byte) (coeffIndex >> 8);
                bArr[i5 + 2] = (byte) (((byte) (coeffIndex >> 16)) | (coeffIndex2 << 4));
                bArr[i5 + 3] = (byte) (coeffIndex2 >> 4);
                bArr[i5 + 4] = (byte) (coeffIndex2 >> 12);
                i2++;
            }
            return;
        }
        while (i2 < 64) {
            int i6 = i2 * 4;
            int coeffIndex3 = dilithiumGamma1 - getCoeffIndex(i6);
            int coeffIndex4 = dilithiumGamma1 - getCoeffIndex(i6 + 1);
            int coeffIndex5 = dilithiumGamma1 - getCoeffIndex(i6 + 2);
            int coeffIndex6 = dilithiumGamma1 - getCoeffIndex(i6 + 3);
            int i21 = (i2 * 9) + i;
            bArr[i21] = (byte) coeffIndex3;
            bArr[i21 + 1] = (byte) (coeffIndex3 >> 8);
            bArr[i21 + 2] = (byte) (((byte) (coeffIndex3 >> 16)) | (coeffIndex4 << 2));
            bArr[i21 + 3] = (byte) (coeffIndex4 >> 6);
            bArr[i21 + 4] = (byte) (((byte) (coeffIndex4 >> 14)) | (coeffIndex5 << 4));
            bArr[i21 + 5] = (byte) (coeffIndex5 >> 4);
            bArr[i21 + 6] = (byte) (((byte) (coeffIndex5 >> 12)) | (coeffIndex6 << 6));
            bArr[i21 + 7] = (byte) (coeffIndex6 >> 2);
            bArr[i21 + 8] = (byte) (coeffIndex6 >> 10);
            i2++;
        }
    }

    public void zUnpack(byte[] bArr) {
        int i = 0;
        if (this.engine.getDilithiumGamma1() != 131072) {
            if (this.engine.getDilithiumGamma1() != 524288) {
                throw new RuntimeException("Wrong Dilithium Gamma1!");
            }
            while (i < 128) {
                int i2 = i * 2;
                int i3 = i * 5;
                int i5 = i3 + 2;
                setCoeffIndex(i2, ((bArr[i3] & UnsignedBytes.MAX_VALUE) | ((bArr[i3 + 1] & UnsignedBytes.MAX_VALUE) << 8) | ((bArr[i5] & UnsignedBytes.MAX_VALUE) << 16)) & 1048575);
                int i6 = i2 + 1;
                setCoeffIndex(i6, (((bArr[i3 + 4] & UnsignedBytes.MAX_VALUE) << 12) | ((bArr[i5] & UnsignedBytes.MAX_VALUE) >>> 4) | ((bArr[i3 + 3] & UnsignedBytes.MAX_VALUE) << 4)) & 1048575);
                setCoeffIndex(i2, this.engine.getDilithiumGamma1() - getCoeffIndex(i2));
                setCoeffIndex(i6, this.engine.getDilithiumGamma1() - getCoeffIndex(i6));
                i++;
            }
            return;
        }
        while (i < 64) {
            int i21 = i * 4;
            int i22 = i * 9;
            int i32 = i22 + 2;
            setCoeffIndex(i21, ((bArr[i22] & UnsignedBytes.MAX_VALUE) | ((bArr[i22 + 1] & UnsignedBytes.MAX_VALUE) << 8) | ((bArr[i32] & UnsignedBytes.MAX_VALUE) << 16)) & 262143);
            int i33 = i21 + 1;
            int i43 = i22 + 4;
            setCoeffIndex(i33, (((bArr[i32] & UnsignedBytes.MAX_VALUE) >>> 2) | ((bArr[i22 + 3] & UnsignedBytes.MAX_VALUE) << 6) | ((bArr[i43] & UnsignedBytes.MAX_VALUE) << 14)) & 262143);
            int i59 = i21 + 2;
            int i66 = i22 + 6;
            setCoeffIndex(i59, (((bArr[i43] & UnsignedBytes.MAX_VALUE) >>> 4) | ((bArr[i22 + 5] & UnsignedBytes.MAX_VALUE) << 4) | ((bArr[i66] & UnsignedBytes.MAX_VALUE) << 12)) & 262143);
            int i74 = i21 + 3;
            setCoeffIndex(i74, (((bArr[i22 + 8] & UnsignedBytes.MAX_VALUE) << 10) | ((bArr[i66] & UnsignedBytes.MAX_VALUE) >>> 6) | ((bArr[i22 + 7] & UnsignedBytes.MAX_VALUE) << 2)) & 262143);
            setCoeffIndex(i21, this.engine.getDilithiumGamma1() - getCoeffIndex(i21));
            setCoeffIndex(i33, this.engine.getDilithiumGamma1() - getCoeffIndex(i33));
            setCoeffIndex(i59, this.engine.getDilithiumGamma1() - getCoeffIndex(i59));
            setCoeffIndex(i74, this.engine.getDilithiumGamma1() - getCoeffIndex(i74));
            i++;
        }
    }
}
