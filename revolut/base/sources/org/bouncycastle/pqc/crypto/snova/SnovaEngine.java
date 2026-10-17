package org.bouncycastle.pqc.crypto.snova;

import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Map;
import org.bouncycastle.crypto.digests.SHAKEDigest;
import org.bouncycastle.crypto.engines.AESEngine;
import org.bouncycastle.crypto.modes.CTRModeCipher;
import org.bouncycastle.crypto.modes.SICBlockCipher;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.GF16;
import org.bouncycastle.util.Integers;
import org.bouncycastle.util.Pack;
import v0.a;

/* JADX INFO: loaded from: classes14.dex */
class SnovaEngine {
    private static final Map<Integer, byte[]> fixedAbqSet = new HashMap();
    private static final Map<Integer, byte[][]> sSet = new HashMap();
    private static final Map<Integer, int[][]> xSSet = new HashMap();
    final byte[][] S;
    private final int alpha;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final int f228884l;
    private final int lsq;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final int f228885m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f228886n;
    private final int o;
    private final SnovaParameters params;
    private final int v;
    final int[][] xS;

    public SnovaEngine(SnovaParameters snovaParameters) {
        int i;
        this.params = snovaParameters;
        int l2 = snovaParameters.getL();
        this.f228884l = l2;
        int lsq = snovaParameters.getLsq();
        this.lsq = lsq;
        this.f228885m = snovaParameters.getM();
        this.v = snovaParameters.getV();
        this.o = snovaParameters.getO();
        this.alpha = snovaParameters.getAlpha();
        this.f228886n = snovaParameters.getN();
        int i2 = 0;
        if (!xSSet.containsKey(Integers.valueOf(l2))) {
            int i3 = 2;
            byte[][] bArr = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, l2, lsq);
            int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, l2, lsq);
            be_aI(bArr[0], 0, (byte) 1);
            beTheS(bArr[1]);
            while (true) {
                int i5 = this.f228884l;
                if (i3 >= i5) {
                    break;
                }
                GF16Utils.gf16mMul(bArr[i3 - 1], bArr[1], bArr[i3], i5);
                i3++;
            }
            int i6 = 0;
            while (true) {
                i = this.f228884l;
                if (i6 >= i) {
                    break;
                }
                for (int i21 = 0; i21 < this.lsq; i21++) {
                    iArr[i6][i21] = GF16Utils.gf16FromNibble(bArr[i6][i21]);
                }
                i6++;
            }
            sSet.put(Integers.valueOf(i), bArr);
            xSSet.put(Integers.valueOf(this.f228884l), iArr);
        }
        this.S = sSet.get(Integers.valueOf(this.f228884l));
        this.xS = xSSet.get(Integers.valueOf(this.f228884l));
        if (this.f228884l >= 4 || fixedAbqSet.containsKey(Integers.valueOf(this.o))) {
            return;
        }
        int i22 = this.alpha;
        int i32 = this.f228884l;
        int i33 = i22 * i32;
        int i43 = i32 * i33;
        int i59 = this.o;
        int i66 = i59 * i33;
        int i74 = i59 * i43;
        byte[] bArr2 = new byte[i74 << 2];
        int i92 = i74 + i66;
        byte[] bArr3 = new byte[i92];
        byte[] bArr4 = new byte[i66 << 2];
        byte[] bytes = "SNOVA_ABQ".getBytes();
        SHAKEDigest sHAKEDigest = new SHAKEDigest(256);
        sHAKEDigest.update(bytes, 0, bytes.length);
        sHAKEDigest.doFinal(bArr3, 0, i92);
        int i96 = i74 << 1;
        GF16.decode(bArr3, bArr2, i96);
        GF16.decode(bArr3, i43, bArr4, 0, i66 << 1);
        int i99 = 0;
        int i100 = 0;
        int i101 = 0;
        while (true) {
            int i102 = this.o;
            if (i99 >= i102) {
                fixedAbqSet.put(Integers.valueOf(i102), bArr2);
                return;
            }
            int i103 = i2;
            int i104 = i100;
            int i105 = i101;
            while (i103 < this.alpha) {
                makeInvertibleByAddingAS(bArr2, i105);
                makeInvertibleByAddingAS(bArr2, i74 + i105);
                genAFqS(bArr4, i104, bArr2, i96 + i105);
                genAFqS(bArr4, i66 + i104, bArr2, i96 + i74 + i105);
                i103++;
                i104 += this.f228884l;
                i105 += this.lsq;
            }
            i99++;
            i101 += i43;
            i100 += i33;
            i2 = 0;
        }
    }

    private void beTheS(byte[] bArr) {
        int i;
        int i2;
        int i3 = 0;
        int i5 = 0;
        while (true) {
            i = this.f228884l;
            if (i3 >= i) {
                break;
            }
            int i6 = 0;
            while (true) {
                i2 = this.f228884l;
                if (i6 < i2) {
                    bArr[i5 + i6] = (byte) ((8 - (i3 + i6)) & 15);
                    i6++;
                }
            }
            i3++;
            i5 += i2;
        }
        if (i == 5) {
            bArr[24] = 9;
        }
    }

    private void be_aI(byte[] bArr, int i, byte b4) {
        int i2 = this.f228884l + 1;
        int i3 = 0;
        while (i3 < this.f228884l) {
            bArr[i] = b4;
            i3++;
            i += i2;
        }
    }

    private static void copy4DMatrix(byte[][][][] bArr, byte[][][][] bArr2, int i, int i2, int i3, int i5) {
        for (int i6 = 0; i6 < i; i6++) {
            for (int i21 = 0; i21 < i2; i21++) {
                for (int i22 = 0; i22 < i3; i22++) {
                    System.arraycopy(bArr[i6][i21][i22], 0, bArr2[i6][i21][i22], 0, i5);
                }
            }
        }
    }

    private byte determinant2x2(byte[] bArr, int i) {
        return (byte) (GF16.mul(bArr[i + 1], bArr[i + 2]) ^ GF16.mul(bArr[i], bArr[i + 3]));
    }

    private byte determinant3x3(byte[] bArr, int i) {
        byte b4 = bArr[i];
        byte b5 = bArr[i + 1];
        byte b7 = bArr[i + 2];
        byte b13 = bArr[i + 3];
        byte b15 = bArr[i + 4];
        byte b17 = bArr[i + 5];
        byte b40 = bArr[i + 6];
        byte b61 = bArr[i + 7];
        byte b64 = bArr[i + 8];
        return (byte) ((GF16.mul(b5, GF16.mul(b13, b64) ^ GF16.mul(b17, b40)) ^ GF16.mul(b4, GF16.mul(b15, b64) ^ GF16.mul(b17, b61))) ^ GF16.mul(b7, GF16.mul(b13, b61) ^ GF16.mul(b15, b40)));
    }

    private byte determinant4x4(byte[] bArr, int i) {
        byte b4 = bArr[i];
        byte b5 = bArr[i + 1];
        byte b7 = bArr[i + 2];
        byte b13 = bArr[i + 3];
        byte b15 = bArr[i + 4];
        byte b17 = bArr[i + 5];
        byte b40 = bArr[i + 6];
        byte b61 = bArr[i + 7];
        byte b64 = bArr[i + 8];
        byte b69 = bArr[i + 9];
        byte b76 = bArr[i + 10];
        byte b86 = bArr[i + 11];
        byte b91 = bArr[i + 12];
        byte b98 = bArr[i + 13];
        byte b100 = bArr[i + 14];
        byte b101 = bArr[i + 15];
        byte bMul = (byte) (GF16.mul(b76, b101) ^ GF16.mul(b86, b100));
        byte bMul2 = (byte) (GF16.mul(b69, b101) ^ GF16.mul(b86, b98));
        byte bMul3 = (byte) (GF16.mul(b69, b100) ^ GF16.mul(b76, b98));
        byte bMul4 = (byte) (GF16.mul(b86, b91) ^ GF16.mul(b64, b101));
        byte bMul5 = (byte) (GF16.mul(b76, b91) ^ GF16.mul(b64, b100));
        byte bMul6 = (byte) (GF16.mul(b64, b98) ^ GF16.mul(b69, b91));
        return (byte) (GF16.mul(b13, (GF16.mul(b15, bMul3) ^ GF16.mul(b17, bMul5)) ^ GF16.mul(b40, bMul6)) ^ ((GF16.mul(b4, (GF16.mul(b17, bMul) ^ GF16.mul(b40, bMul2)) ^ GF16.mul(b61, bMul3)) ^ GF16.mul(b5, (GF16.mul(b15, bMul) ^ GF16.mul(b40, bMul4)) ^ GF16.mul(b61, bMul5))) ^ GF16.mul(b7, (GF16.mul(b15, bMul2) ^ GF16.mul(b17, bMul4)) ^ GF16.mul(b61, bMul6))));
    }

    private byte determinant5x5(byte[] bArr, int i) {
        byte b4 = bArr[i];
        byte b5 = bArr[i + 1];
        byte b7 = bArr[i + 2];
        byte b13 = bArr[i + 3];
        byte b15 = bArr[i + 4];
        byte b17 = bArr[i + 5];
        byte b40 = bArr[i + 6];
        byte b61 = bArr[i + 7];
        byte b64 = bArr[i + 8];
        byte b69 = bArr[i + 9];
        byte b76 = bArr[i + 10];
        byte b86 = bArr[i + 11];
        byte b91 = bArr[i + 12];
        byte b98 = bArr[i + 13];
        byte b100 = bArr[i + 14];
        byte b101 = bArr[i + 15];
        byte b102 = bArr[i + 16];
        byte b103 = bArr[i + 17];
        byte b104 = bArr[i + 18];
        byte b105 = bArr[i + 19];
        byte b106 = bArr[i + 20];
        byte b107 = bArr[i + 21];
        byte b108 = bArr[i + 22];
        byte b109 = bArr[i + 23];
        byte b110 = bArr[i + 24];
        byte bMul = (byte) (GF16.mul(b17, b86) ^ GF16.mul(b40, b76));
        byte bMul2 = (byte) (GF16.mul(b17, b91) ^ GF16.mul(b61, b76));
        byte bMul3 = (byte) (GF16.mul(b17, b98) ^ GF16.mul(b64, b76));
        byte bMul4 = (byte) (GF16.mul(b17, b100) ^ GF16.mul(b69, b76));
        byte bMul5 = (byte) (GF16.mul(b40, b91) ^ GF16.mul(b61, b86));
        byte bMul6 = (byte) (GF16.mul(b40, b98) ^ GF16.mul(b64, b86));
        byte bMul7 = (byte) (GF16.mul(b40, b100) ^ GF16.mul(b69, b86));
        byte bMul8 = (byte) (GF16.mul(b61, b98) ^ GF16.mul(b64, b91));
        byte bMul9 = (byte) (GF16.mul(b61, b100) ^ GF16.mul(b69, b91));
        byte bMul10 = (byte) (GF16.mul(b64, b100) ^ GF16.mul(b69, b98));
        return (byte) (((byte) (GF16.mul((GF16.mul(b13, bMul7) ^ GF16.mul(b5, bMul10)) ^ GF16.mul(b15, bMul6), GF16.mul(b101, b108) ^ GF16.mul(b103, b106)) ^ ((byte) (((byte) (((byte) (GF16.mul((GF16.mul(b4, bMul10) ^ GF16.mul(b13, bMul4)) ^ GF16.mul(b15, bMul3), GF16.mul(b102, b108) ^ GF16.mul(b103, b107)) ^ ((byte) (((byte) (((byte) (((byte) (((byte) GF16.mul((GF16.mul(b4, bMul5) ^ GF16.mul(b5, bMul2)) ^ GF16.mul(b7, bMul), GF16.mul(b104, b110) ^ GF16.mul(b105, b109))) ^ GF16.mul((GF16.mul(b4, bMul6) ^ GF16.mul(b5, bMul3)) ^ GF16.mul(b13, bMul), GF16.mul(b103, b110) ^ GF16.mul(b105, b108)))) ^ GF16.mul((GF16.mul(b4, bMul7) ^ GF16.mul(b5, bMul4)) ^ GF16.mul(b15, bMul), GF16.mul(b103, b109) ^ GF16.mul(b104, b108)))) ^ GF16.mul((GF16.mul(b4, bMul8) ^ GF16.mul(b7, bMul3)) ^ GF16.mul(b13, bMul2), GF16.mul(b102, b110) ^ GF16.mul(b105, b107)))) ^ GF16.mul((GF16.mul(b4, bMul9) ^ GF16.mul(b7, bMul4)) ^ GF16.mul(b15, bMul2), GF16.mul(b102, b109) ^ GF16.mul(b104, b107)))))) ^ GF16.mul((GF16.mul(b5, bMul8) ^ GF16.mul(b7, bMul6)) ^ GF16.mul(b13, bMul5), GF16.mul(b101, b110) ^ GF16.mul(b105, b106)))) ^ GF16.mul(GF16.mul(b15, bMul5) ^ (GF16.mul(b5, bMul9) ^ GF16.mul(b7, bMul7)), GF16.mul(b101, b109) ^ GF16.mul(b104, b106)))))) ^ GF16.mul((GF16.mul(b7, bMul10) ^ GF16.mul(b13, bMul9)) ^ GF16.mul(b15, bMul8), GF16.mul(b101, b107) ^ GF16.mul(b102, b106)));
    }

    private void genAFqS(byte[] bArr, int i, byte[] bArr2, int i2) {
        int i3;
        int i5;
        be_aI(bArr2, i2, bArr[i]);
        int i6 = 1;
        while (true) {
            i3 = this.f228884l;
            if (i6 >= i3 - 1) {
                break;
            }
            gf16mScaleTo(this.S[i6], bArr[i + i6], bArr2, i2);
            i6++;
        }
        if (bArr[(i + i3) - 1] != 0) {
            i5 = bArr[(i + i3) - 1];
        } else {
            int i21 = bArr[i];
            i5 = 16 - (i21 + (i21 == 0 ? 1 : 0));
        }
        gf16mScaleTo(this.S[i3 - 1], (byte) i5, bArr2, i2);
    }

    private void genAFqSCT(byte[] bArr, int i, byte[] bArr2) {
        int i2;
        int[] iArr = new int[this.lsq];
        int i3 = this.f228884l + 1;
        int iGf16FromNibble = GF16Utils.gf16FromNibble(bArr[i]);
        int i5 = 0;
        int i6 = 0;
        while (i5 < this.f228884l) {
            iArr[i6] = iGf16FromNibble;
            i5++;
            i6 += i3;
        }
        int i21 = 1;
        while (true) {
            i2 = this.f228884l;
            if (i21 >= i2 - 1) {
                break;
            }
            int iGf16FromNibble2 = GF16Utils.gf16FromNibble(bArr[i + i21]);
            for (int i22 = 0; i22 < this.lsq; i22++) {
                iArr[i22] = iArr[i22] ^ (this.xS[i21][i22] * iGf16FromNibble2);
            }
            i21++;
        }
        int iCtGF16IsNotZero = GF16Utils.ctGF16IsNotZero(bArr[(i2 + i) - 1]);
        int iGf16FromNibble3 = GF16Utils.gf16FromNibble((byte) a.a(GF16Utils.ctGF16IsNotZero(bArr[i]) + 15, bArr[i], 1 - iCtGF16IsNotZero, bArr[(this.f228884l + i) - 1] * iCtGF16IsNotZero));
        for (int i32 = 0; i32 < this.lsq; i32++) {
            int i33 = iArr[i32] ^ (this.xS[this.f228884l - 1][i32] * iGf16FromNibble3);
            iArr[i32] = i33;
            bArr2[i32] = GF16Utils.gf16ToNibble(i33);
        }
        Arrays.fill(iArr, 0);
    }

    private void genF(MapGroup2 mapGroup2, MapGroup1 mapGroup1, byte[][][] bArr) {
        byte[][][][] bArr2 = mapGroup1.f228878p11;
        byte[][][][] bArr3 = mapGroup2.f228881f11;
        int i = this.f228885m;
        int i2 = this.v;
        copy4DMatrix(bArr2, bArr3, i, i2, i2, this.lsq);
        copy4DMatrix(mapGroup1.f228879p12, mapGroup2.f228882f12, this.f228885m, this.v, this.o, this.lsq);
        copy4DMatrix(mapGroup1.f228880p21, mapGroup2.f228883f21, this.f228885m, this.o, this.v, this.lsq);
        for (int i3 = 0; i3 < this.f228885m; i3++) {
            for (int i5 = 0; i5 < this.v; i5++) {
                for (int i6 = 0; i6 < this.o; i6++) {
                    for (int i21 = 0; i21 < this.v; i21++) {
                        byte[][][] bArr4 = mapGroup1.f228878p11[i3];
                        GF16Utils.gf16mMulToTo(bArr4[i5][i21], bArr[i21][i6], bArr4[i21][i5], mapGroup2.f228882f12[i3][i5][i6], mapGroup2.f228883f21[i3][i6][i5], this.f228884l);
                    }
                }
            }
        }
    }

    private void genSeedsAndT12(byte[][][] bArr, byte[] bArr2) {
        int i = this.v * this.o * this.f228884l;
        int i2 = (i + 1) >>> 1;
        byte[] bArr3 = new byte[i2];
        SHAKEDigest sHAKEDigest = new SHAKEDigest(256);
        sHAKEDigest.update(bArr2, 0, bArr2.length);
        sHAKEDigest.doFinal(bArr3, 0, i2);
        byte[] bArr4 = new byte[i];
        GF16.decode(bArr3, bArr4, i);
        int i3 = 0;
        for (int i5 = 0; i5 < this.v; i5++) {
            for (int i6 = 0; i6 < this.o; i6++) {
                genAFqSCT(bArr4, i3, bArr[i5][i6]);
                i3 += this.f228884l;
            }
        }
    }

    private void generateASMatrixTo(byte[] bArr, int i, byte b4) {
        int i2;
        int i3 = 0;
        while (i3 < this.f228884l) {
            int i5 = 0;
            while (true) {
                i2 = this.f228884l;
                if (i5 < i2) {
                    byte b5 = (byte) (8 - (i3 + i5));
                    if (i2 == 5 && i3 == 4 && i5 == 4) {
                        b5 = 9;
                    }
                    int i6 = i + i5;
                    bArr[i6] = (byte) (GF16.mul(b5, b4) ^ bArr[i6]);
                    i5++;
                }
            }
            i3++;
            i += i2;
        }
    }

    private byte gf16Determinant(byte[] bArr, int i) {
        int i2 = this.f228884l;
        if (i2 == 2) {
            return determinant2x2(bArr, i);
        }
        if (i2 == 3) {
            return determinant3x3(bArr, i);
        }
        if (i2 == 4) {
            return determinant4x4(bArr, i);
        }
        if (i2 == 5) {
            return determinant5x5(bArr, i);
        }
        throw new IllegalStateException();
    }

    private void gf16mScaleTo(byte[] bArr, byte b4, byte[] bArr2, int i) {
        int i2;
        int i3 = 0;
        int i5 = 0;
        while (i3 < this.f228884l) {
            int i6 = 0;
            while (true) {
                i2 = this.f228884l;
                if (i6 < i2) {
                    int i21 = i5 + i6;
                    int i22 = i21 + i;
                    bArr2[i22] = (byte) (GF16.mul(bArr[i21], b4) ^ bArr2[i22]);
                    i6++;
                }
            }
            i3++;
            i5 += i2;
        }
    }

    private void makeInvertibleByAddingAS(byte[] bArr, int i) {
        if (gf16Determinant(bArr, i) != 0) {
            return;
        }
        for (int i2 = 1; i2 < 16; i2++) {
            generateASMatrixTo(bArr, i, (byte) i2);
            if (gf16Determinant(bArr, i) != 0) {
                return;
            }
        }
    }

    public void genABQP(MapGroup1 mapGroup1, byte[] bArr) {
        int i = this.lsq;
        int i2 = this.f228885m;
        int i3 = this.alpha;
        int i5 = this.f228886n;
        int i6 = ((((i5 * i5) - (i2 * i2)) * i2) + (i2 * 2 * i3)) * i;
        int i21 = this.f228884l;
        int i22 = (i21 * 2 * i2 * i3) + i6;
        int i32 = ((i2 * i3) * i21) << 1;
        byte[] bArr2 = new byte[i32];
        int i33 = (i22 + 1) >> 1;
        byte[] bArr3 = new byte[i33];
        if (this.params.isPkExpandShake()) {
            byte[] bArr4 = new byte[8];
            SHAKEDigest sHAKEDigest = new SHAKEDigest(128);
            long j2 = 0;
            int i43 = 0;
            while (i33 > 0) {
                sHAKEDigest.update(bArr, 0, bArr.length);
                Pack.longToLittleEndian(j2, bArr4, 0);
                sHAKEDigest.update(bArr4, 0, 8);
                int iMin = Math.min(i33, 168);
                sHAKEDigest.doFinal(bArr3, i43, iMin);
                i43 += iMin;
                i33 -= iMin;
                j2++;
            }
        } else {
            CTRModeCipher cTRModeCipherNewInstance = SICBlockCipher.newInstance(AESEngine.newInstance());
            cTRModeCipherNewInstance.init(true, new ParametersWithIV(new KeyParameter(bArr), new byte[16]));
            int blockSize = cTRModeCipherNewInstance.getBlockSize();
            byte[] bArr5 = new byte[blockSize];
            int i59 = 0;
            while (true) {
                int i66 = i59 + blockSize;
                if (i66 > i33) {
                    break;
                }
                cTRModeCipherNewInstance.processBlock(bArr5, 0, bArr3, i59);
                i59 = i66;
            }
            if (i59 < i33) {
                cTRModeCipherNewInstance.processBlock(bArr5, 0, bArr5, 0);
                System.arraycopy(bArr5, 0, bArr3, i59, i33 - i59);
            }
        }
        if ((this.lsq & 1) == 0) {
            mapGroup1.decode(bArr3, (i22 - i32) >> 1, this.f228884l >= 4);
        } else {
            int i74 = i22 - i32;
            byte[] bArr6 = new byte[i74];
            GF16.decode(bArr3, bArr6, i74);
            mapGroup1.fill(bArr6, this.f228884l >= 4);
        }
        if (this.f228884l < 4) {
            int i92 = this.o;
            int i96 = this.alpha * i92 * this.lsq;
            byte[] bArr7 = fixedAbqSet.get(Integers.valueOf(i92));
            MapGroup1.fillAlpha(bArr7, 0, mapGroup1.aAlpha, this.f228885m * i96);
            MapGroup1.fillAlpha(bArr7, i96, mapGroup1.bAlpha, (this.f228885m - 1) * i96);
            MapGroup1.fillAlpha(bArr7, i96 * 2, mapGroup1.qAlpha1, (this.f228885m - 2) * i96);
            MapGroup1.fillAlpha(bArr7, i96 * 3, mapGroup1.qAlpha2, (this.f228885m - 3) * i96);
            return;
        }
        GF16.decode(bArr3, (i22 - i32) >> 1, bArr2, 0, i32);
        int i99 = this.f228885m * this.alpha * this.f228884l;
        int i100 = 0;
        for (int i101 = 0; i101 < this.f228885m; i101++) {
            for (int i102 = 0; i102 < this.alpha; i102++) {
                makeInvertibleByAddingAS(mapGroup1.aAlpha[i101][i102], 0);
                makeInvertibleByAddingAS(mapGroup1.bAlpha[i101][i102], 0);
                genAFqS(bArr2, i100, mapGroup1.qAlpha1[i101][i102], 0);
                genAFqS(bArr2, i99, mapGroup1.qAlpha2[i101][i102], 0);
                int i103 = this.f228884l;
                i100 += i103;
                i99 += i103;
            }
        }
    }

    public void genMap1T12Map2(SnovaKeyElements snovaKeyElements, byte[] bArr, byte[] bArr2) {
        genSeedsAndT12(snovaKeyElements.T12, bArr2);
        genABQP(snovaKeyElements.map1, bArr);
        genF(snovaKeyElements.map2, snovaKeyElements.map1, snovaKeyElements.T12);
    }

    public void genP22(byte[] bArr, int i, byte[][][] bArr2, byte[][][][] bArr3, byte[][][][] bArr4) {
        int i2 = this.o;
        int i3 = this.lsq * i2;
        int i5 = i2 * i3;
        int i6 = this.f228885m * i5;
        byte[] bArr5 = new byte[i6];
        int i21 = 0;
        int i22 = 0;
        while (i21 < this.f228885m) {
            int i32 = 0;
            int i33 = i22;
            while (i32 < this.o) {
                int i43 = 0;
                int i59 = i33;
                while (i43 < this.o) {
                    int i66 = 0;
                    while (i66 < this.v) {
                        byte[][] bArr6 = bArr2[i66];
                        int i74 = i43;
                        GF16Utils.gf16mMulTo(bArr6[i32], bArr4[i21][i66][i74], bArr3[i21][i32][i66], bArr6[i74], bArr5, i59, this.f228884l);
                        i66++;
                        i43 = i74;
                    }
                    i43++;
                    i59 += this.lsq;
                }
                i32++;
                i33 += i3;
            }
            i21++;
            i22 += i5;
        }
        GF16.encode(bArr5, bArr, i, i6);
    }
}
