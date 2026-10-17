package org.bouncycastle.pqc.crypto.snova;

import java.lang.reflect.Array;
import java.security.SecureRandom;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.digests.SHAKEDigest;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.pqc.crypto.MessageSigner;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.GF16;

/* JADX INFO: loaded from: classes14.dex */
public class SnovaSigner implements MessageSigner {
    private SnovaEngine engine;
    private SnovaParameters params;
    private SnovaPrivateKeyParameters privKey;
    private SnovaPublicKeyParameters pubKey;
    private SecureRandom random;
    private final SHAKEDigest shake = new SHAKEDigest(256);

    private void evaluation(byte[] bArr, MapGroup1 mapGroup1, byte[][][][] bArr2, byte[] bArr3) {
        MapGroup1 mapGroup12 = mapGroup1;
        int m3 = this.params.getM();
        int alpha = this.params.getAlpha();
        int n3 = this.params.getN();
        int l2 = this.params.getL();
        int lsq = this.params.getLsq();
        int o = this.params.getO();
        Class cls = Byte.TYPE;
        byte[][][] bArr4 = (byte[][][]) Array.newInstance((Class<?>) cls, alpha, n3, lsq);
        byte[][][] bArr5 = (byte[][][]) Array.newInstance((Class<?>) cls, alpha, n3, lsq);
        byte[] bArr6 = new byte[lsq];
        int i = 0;
        int i2 = 0;
        while (i < m3) {
            int i3 = 0;
            int i5 = 0;
            while (i3 < n3) {
                int i6 = 0;
                while (i6 < alpha) {
                    GF16Utils.gf16mTranMulMul(bArr3, i5, mapGroup12.aAlpha[i][i6], mapGroup12.bAlpha[i][i6], mapGroup12.qAlpha1[i][i6], mapGroup12.qAlpha2[i][i6], bArr6, bArr4[i6][i3], bArr5[i6][i3], l2);
                    i6++;
                    i3 = i3;
                }
                i5 += lsq;
                i3++;
            }
            int i21 = l2;
            int i22 = i;
            int i32 = 0;
            while (i32 < alpha) {
                if (i22 >= o) {
                    i22 -= o;
                }
                int i33 = i;
                int i43 = 0;
                while (i43 < n3) {
                    int i59 = i2;
                    int i66 = i33;
                    int i74 = lsq;
                    int i92 = o;
                    int i96 = i22;
                    GF16Utils.gf16mMul(getPMatrix(mapGroup12, bArr2, i96, i43, 0), bArr5[i32][0], bArr6, i21);
                    int i99 = 1;
                    while (i99 < n3) {
                        GF16Utils.gf16mMulTo(getPMatrix(mapGroup1, bArr2, i96, i43, i99), bArr5[i32][i99], bArr6, i21);
                        i99++;
                        m3 = m3;
                    }
                    GF16Utils.gf16mMulTo(bArr4[i32][i43], bArr6, bArr, i59, i21);
                    i43++;
                    mapGroup12 = mapGroup1;
                    i22 = i96;
                    lsq = i74;
                    o = i92;
                    i33 = i66;
                    i2 = i59;
                }
                i32++;
                i22++;
                mapGroup12 = mapGroup1;
                o = o;
                i = i33;
            }
            i++;
            i2 += lsq;
            mapGroup12 = mapGroup1;
            l2 = i21;
        }
    }

    private byte[] getMessageHash(byte[] bArr) {
        byte[] bArr2 = new byte[this.shake.getDigestSize()];
        this.shake.update(bArr, 0, bArr.length);
        this.shake.doFinal(bArr2, 0);
        return bArr2;
    }

    private byte[] getPMatrix(MapGroup1 mapGroup1, byte[][][][] bArr, int i, int i2, int i3) {
        int v = this.params.getV();
        return i2 < v ? i3 < v ? mapGroup1.f228878p11[i][i2][i3] : mapGroup1.f228879p12[i][i2][i3 - v] : i3 < v ? mapGroup1.f228880p21[i][i2 - v][i3] : bArr[i][i2 - v][i3 - v];
    }

    private int performGaussianElimination(byte[][] bArr, byte[] bArr2, int i) {
        int i2 = i + 1;
        int i3 = 0;
        while (i3 < i) {
            int i5 = i3;
            while (i5 < i && bArr[i5][i3] == 0) {
                i5++;
            }
            if (i5 >= i) {
                return 1;
            }
            if (i5 != i3) {
                byte[] bArr3 = bArr[i3];
                bArr[i3] = bArr[i5];
                bArr[i5] = bArr3;
            }
            byte bInv = GF16.inv(bArr[i3][i3]);
            for (int i6 = i3; i6 < i2; i6++) {
                byte[] bArr4 = bArr[i3];
                bArr4[i6] = GF16.mul(bArr4[i6], bInv);
            }
            int i21 = i3 + 1;
            for (int i22 = i21; i22 < i; i22++) {
                byte b4 = bArr[i22][i3];
                if (b4 != 0) {
                    for (int i32 = i3; i32 < i2; i32++) {
                        byte[] bArr5 = bArr[i22];
                        bArr5[i32] = (byte) (bArr5[i32] ^ GF16.mul(bArr[i3][i32], b4));
                    }
                }
            }
            i3 = i21;
        }
        for (int i33 = i - 1; i33 >= 0; i33--) {
            byte bMul = bArr[i33][i];
            for (int i43 = i33 + 1; i43 < i; i43++) {
                bMul = (byte) (bMul ^ GF16.mul(bArr[i33][i43], bArr2[i43]));
            }
            bArr2[i33] = bMul;
        }
        return 0;
    }

    public void createSignedHash(byte[] bArr, int i, byte[] bArr2, int i2, byte[] bArr3, int i3, int i5, byte[] bArr4, int i6) {
        this.shake.update(bArr, 0, i);
        this.shake.update(bArr2, 0, i2);
        this.shake.update(bArr3, i3, i5);
        this.shake.doFinal(bArr4, 0, i6);
    }

    @Override // org.bouncycastle.pqc.crypto.MessageSigner
    public byte[] generateSignature(byte[] bArr) {
        byte[] bArrCopyOfRange;
        byte[] bArrCopyOfRange2;
        byte[] messageHash = getMessageHash(bArr);
        byte[] bArr2 = new byte[this.params.getSaltLength()];
        this.random.nextBytes(bArr2);
        byte[] bArr3 = new byte[this.params.getSaltLength() + (((this.params.getLsq() * this.params.getN()) + 1) >>> 1)];
        SnovaKeyElements snovaKeyElements = new SnovaKeyElements(this.params);
        if (this.params.isSkIsSeed()) {
            byte[] privateKey = this.privKey.getPrivateKey();
            bArrCopyOfRange = Arrays.copyOfRange(privateKey, 0, 16);
            bArrCopyOfRange2 = Arrays.copyOfRange(privateKey, 16, privateKey.length);
            this.engine.genMap1T12Map2(snovaKeyElements, bArrCopyOfRange, bArrCopyOfRange2);
        } else {
            byte[] privateKey2 = this.privKey.getPrivateKey();
            int length = (privateKey2.length - 48) << 1;
            byte[] bArr4 = new byte[length];
            GF16Utils.decodeMergeInHalf(privateKey2, bArr4, length);
            SnovaKeyElements.copy4d(bArr4, SnovaKeyElements.copy4d(bArr4, SnovaKeyElements.copy4d(bArr4, SnovaKeyElements.copy3d(bArr4, SnovaKeyElements.copy3d(bArr4, SnovaKeyElements.copy3d(bArr4, SnovaKeyElements.copy3d(bArr4, SnovaKeyElements.copy3d(bArr4, 0, snovaKeyElements.map1.aAlpha), snovaKeyElements.map1.bAlpha), snovaKeyElements.map1.qAlpha1), snovaKeyElements.map1.qAlpha2), snovaKeyElements.T12), snovaKeyElements.map2.f228881f11), snovaKeyElements.map2.f228882f12), snovaKeyElements.map2.f228883f21);
            bArrCopyOfRange = Arrays.copyOfRange(privateKey2, privateKey2.length - 48, privateKey2.length - 32);
            bArrCopyOfRange2 = Arrays.copyOfRange(privateKey2, privateKey2.length - 32, privateKey2.length);
        }
        byte[] bArr5 = bArrCopyOfRange2;
        byte[] bArr6 = bArrCopyOfRange;
        MapGroup1 mapGroup1 = snovaKeyElements.map1;
        byte[][][] bArr7 = mapGroup1.aAlpha;
        byte[][][] bArr8 = mapGroup1.bAlpha;
        byte[][][] bArr9 = mapGroup1.qAlpha1;
        byte[][][] bArr10 = mapGroup1.qAlpha2;
        byte[][][] bArr11 = snovaKeyElements.T12;
        MapGroup2 mapGroup2 = snovaKeyElements.map2;
        signDigestCore(bArr3, messageHash, bArr2, bArr7, bArr8, bArr9, bArr10, bArr11, mapGroup2.f228881f11, mapGroup2.f228882f12, mapGroup2.f228883f21, bArr6, bArr5);
        return Arrays.concatenate(bArr3, bArr);
    }

    @Override // org.bouncycastle.pqc.crypto.MessageSigner
    public void init(boolean z, CipherParameters cipherParameters) {
        SecureRandom secureRandom;
        if (z) {
            this.pubKey = null;
            if (cipherParameters instanceof ParametersWithRandom) {
                ParametersWithRandom parametersWithRandom = (ParametersWithRandom) cipherParameters;
                this.privKey = (SnovaPrivateKeyParameters) parametersWithRandom.getParameters();
                secureRandom = parametersWithRandom.getRandom();
            } else {
                this.privKey = (SnovaPrivateKeyParameters) cipherParameters;
                secureRandom = CryptoServicesRegistrar.getSecureRandom();
            }
            this.random = secureRandom;
            this.params = this.privKey.getParameters();
        } else {
            SnovaPublicKeyParameters snovaPublicKeyParameters = (SnovaPublicKeyParameters) cipherParameters;
            this.pubKey = snovaPublicKeyParameters;
            this.params = snovaPublicKeyParameters.getParameters();
            this.privKey = null;
            this.random = null;
        }
        this.engine = new SnovaEngine(this.params);
    }

    public void signDigestCore(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[][][] bArr4, byte[][][] bArr5, byte[][][] bArr6, byte[][][] bArr7, byte[][][] bArr8, byte[][][][] bArr9, byte[][][][] bArr10, byte[][][][] bArr11, byte[] bArr12, byte[] bArr13) {
        int i;
        int i2;
        int i3;
        int i5;
        byte[] bArr14;
        int i6;
        byte b4;
        int i21;
        byte b5;
        byte[] bArr15 = bArr13;
        int m3 = this.params.getM();
        int l2 = this.params.getL();
        int lsq = this.params.getLsq();
        int alpha = this.params.getAlpha();
        int v = this.params.getV();
        int o = this.params.getO();
        int n3 = this.params.getN();
        int i22 = m3 * lsq;
        int i32 = o * lsq;
        int i33 = v * lsq;
        int i43 = (i32 + 1) >>> 1;
        Class cls = Byte.TYPE;
        byte[][] bArr16 = (byte[][]) Array.newInstance((Class<?>) cls, i22, i22 + 1);
        byte[][] bArr17 = (byte[][]) Array.newInstance((Class<?>) cls, lsq, lsq);
        byte[] bArr18 = new byte[i22];
        byte[][][] bArr19 = (byte[][][]) Array.newInstance((Class<?>) cls, alpha, v, lsq);
        byte[][][] bArr20 = (byte[][][]) Array.newInstance((Class<?>) cls, alpha, v, lsq);
        byte[] bArr21 = new byte[lsq];
        byte[] bArr22 = new byte[lsq];
        byte[] bArr23 = new byte[lsq];
        byte[] bArr24 = new byte[i22];
        int i59 = n3 * lsq;
        byte[] bArr25 = new byte[i43];
        int i66 = (i33 + 1) >>> 1;
        int i74 = lsq;
        byte[] bArr26 = new byte[i66];
        byte[] bArr27 = new byte[l2];
        int i92 = l2;
        int i96 = o;
        int i99 = v;
        byte b7 = 0;
        byte[] bArr28 = bArr18;
        byte[] bArr29 = new byte[i59];
        int i100 = i66;
        byte[] bArr30 = bArr23;
        byte[] bArr31 = bArr22;
        int i101 = m3;
        int i102 = alpha;
        int i103 = i22;
        byte[] bArr32 = bArr27;
        createSignedHash(bArr12, bArr12.length, bArr2, bArr2.length, bArr3, 0, bArr3.length, bArr25, i43);
        byte[] bArr33 = bArr2;
        GF16.decode(bArr25, 0, bArr24, 0, i103);
        byte b13 = 0;
        while (true) {
            for (int i104 = b7; i104 < bArr16.length; i104++) {
                Arrays.fill(bArr16[i104], b7);
            }
            byte b15 = (byte) (b13 + 1);
            for (int i105 = b7; i105 < i103; i105++) {
                bArr16[i105][i103] = bArr24[i105];
            }
            this.shake.update(bArr15, b7, bArr15.length);
            this.shake.update(bArr33, b7, bArr33.length);
            this.shake.update(bArr3, b7, bArr3.length);
            this.shake.update(b15);
            int i106 = i100;
            this.shake.doFinal(bArr26, b7, i106);
            byte[] bArr34 = bArr29;
            GF16.decode(bArr26, bArr34, i106 << 1);
            int i107 = b7;
            int i108 = i101;
            int i109 = i107;
            while (i107 < i108) {
                byte[] bArr35 = bArr30;
                Arrays.fill(bArr35, b7);
                int i110 = i107;
                int i111 = b7;
                int i112 = i102;
                while (i111 < i112) {
                    byte b17 = b15;
                    int i113 = i96;
                    if (i110 >= i113) {
                        i110 -= i113;
                    }
                    int i114 = i110;
                    byte[] bArr36 = bArr24;
                    byte[] bArr37 = bArr26;
                    int i115 = i99;
                    int i116 = 0;
                    int i117 = 0;
                    while (i116 < i115) {
                        int i118 = i112;
                        byte[] bArr38 = bArr34;
                        GF16Utils.gf16mTranMulMul(bArr38, i117, bArr4[i107][i111], bArr5[i107][i111], bArr6[i107][i111], bArr7[i107][i111], bArr32, bArr19[i111][i116], bArr20[i111][i116], i92);
                        i117 += i74;
                        i103 = i103;
                        i116++;
                        bArr37 = bArr37;
                        i112 = i118;
                        bArr34 = bArr38;
                    }
                    byte[] bArr39 = bArr34;
                    int i119 = i112;
                    int i120 = i103;
                    byte[] bArr40 = bArr37;
                    int i121 = 0;
                    int i122 = 0;
                    while (i122 < i115) {
                        int i123 = i121;
                        while (i123 < i115) {
                            int i124 = i122;
                            int i125 = i119;
                            byte[] bArr41 = bArr32;
                            GF16Utils.gf16mMulMulTo(bArr19[i111][i122], bArr9[i114][i122][i123], bArr20[i111][i123], bArr41, bArr35, i92);
                            i123++;
                            i107 = i107;
                            i108 = i108;
                            i111 = i111;
                            i106 = i106;
                            bArr32 = bArr41;
                            i119 = i125;
                            i122 = i124;
                        }
                        i111 = i111;
                        i121 = 0;
                        bArr32 = bArr32;
                        i119 = i119;
                        i122++;
                        i107 = i107;
                    }
                    i112 = i119;
                    bArr32 = bArr32;
                    i96 = i113;
                    i99 = i115;
                    b15 = b17;
                    bArr24 = bArr36;
                    bArr26 = bArr40;
                    bArr34 = bArr39;
                    i111++;
                    i107 = i107;
                    i103 = i120;
                    i110 = i114 + 1;
                    i106 = i106;
                }
                int i126 = i106;
                int i127 = i108;
                byte[] bArr42 = bArr34;
                bArr30 = bArr35;
                byte b40 = b15;
                byte[] bArr43 = bArr24;
                byte[] bArr44 = bArr26;
                int i128 = i103;
                byte[] bArr45 = bArr32;
                int i129 = i74;
                int i130 = i92;
                int i131 = i99;
                int i132 = i96;
                int i133 = i107;
                int i134 = 0;
                int i135 = 0;
                while (i134 < i130) {
                    int i136 = i135;
                    int i137 = 0;
                    while (i137 < i130) {
                        byte[] bArr46 = bArr16[i109 + i136];
                        bArr46[i128] = (byte) (bArr30[i136] ^ bArr46[i128]);
                        i137++;
                        i136++;
                    }
                    i134++;
                    i135 = i136;
                }
                int i138 = 0;
                int i139 = 0;
                while (i138 < i132) {
                    int i140 = i133;
                    int i141 = 0;
                    while (i141 < i112) {
                        if (i140 >= i132) {
                            i140 -= i132;
                        }
                        int i142 = i140;
                        for (int i143 = 0; i143 < i129; i143++) {
                            Arrays.fill(bArr17[i143], (byte) 0);
                        }
                        int i144 = 0;
                        while (i144 < i131) {
                            int i145 = i141;
                            int i146 = i144;
                            GF16Utils.gf16mMulMul(bArr19[i141][i144], bArr10[i142][i144][i138], bArr7[i133][i141], bArr45, bArr21, i130);
                            byte[] bArr47 = bArr31;
                            GF16Utils.gf16mMulMul(bArr6[i133][i145], bArr11[i142][i138][i146], bArr20[i145][i146], bArr45, bArr47, i130);
                            int i147 = 0;
                            int i148 = 0;
                            int i149 = 0;
                            while (i147 < i129) {
                                if (i148 == i130) {
                                    i149 += i130;
                                    i148 = 0;
                                }
                                int i150 = i147;
                                int i151 = i148;
                                byte b61 = bArr21[i149];
                                byte b64 = bArr47[i148];
                                int i152 = 0;
                                int i153 = 0;
                                int i154 = 0;
                                int i155 = 0;
                                int i156 = 0;
                                while (i152 < i129) {
                                    if (i153 == i130) {
                                        i154++;
                                        i155 += i130;
                                        i6 = i152;
                                        b4 = bArr21[i149 + i154];
                                        b5 = bArr47[i155 + i151];
                                        i156 = 0;
                                        i21 = 0;
                                    } else {
                                        byte b69 = b61;
                                        i6 = i152;
                                        b4 = b69;
                                        byte b76 = b64;
                                        i21 = i153;
                                        b5 = b76;
                                    }
                                    int i157 = i149;
                                    byte b86 = bArr5[i133][i145][i156 + i151];
                                    byte[] bArr48 = bArr45;
                                    byte b91 = bArr4[i133][i145][i157 + i21];
                                    byte[] bArr49 = bArr17[i150];
                                    bArr49[i6] = (byte) (bArr49[i6] ^ (GF16.mul(b4, b86) ^ GF16.mul(b91, b5)));
                                    int i158 = i6 + 1;
                                    int i159 = i21 + 1;
                                    i156 += i130;
                                    b61 = b4;
                                    b64 = b5;
                                    i152 = i158;
                                    i153 = i159;
                                    i149 = i157;
                                    bArr45 = bArr48;
                                }
                                i147 = i150 + 1;
                                i148 = i151 + 1;
                            }
                            i144 = i146 + 1;
                            bArr31 = bArr47;
                            i141 = i145;
                        }
                        int i160 = i141;
                        byte[] bArr50 = bArr45;
                        byte[] bArr51 = bArr31;
                        int i161 = 0;
                        while (i161 < i129) {
                            int i162 = 0;
                            while (i162 < i129) {
                                byte[] bArr52 = bArr16[i109 + i161];
                                int i163 = i139 + i162;
                                bArr52[i163] = (byte) (bArr52[i163] ^ bArr17[i161][i162]);
                                i162++;
                                i161 = i161;
                            }
                            i161++;
                        }
                        i141 = i160 + 1;
                        i140 = i142 + 1;
                        bArr31 = bArr51;
                        bArr45 = bArr50;
                    }
                    i138++;
                    i139 += i129;
                }
                byte[] bArr53 = bArr45;
                i107 = i133 + 1;
                i109 += i129;
                i103 = i128;
                i92 = i130;
                i96 = i132;
                i99 = i131;
                i74 = i129;
                i108 = i127;
                b15 = b40;
                bArr24 = bArr43;
                bArr26 = bArr44;
                bArr34 = bArr42;
                i106 = i126;
                bArr32 = bArr53;
                i102 = i112;
                b7 = 0;
            }
            i100 = i106;
            bArr29 = bArr34;
            byte b98 = b15;
            byte[] bArr54 = bArr24;
            byte[] bArr55 = bArr26;
            int i164 = i103;
            int i165 = i102;
            byte[] bArr56 = bArr32;
            i = i74;
            byte[] bArr57 = bArr31;
            i2 = i92;
            i3 = i99;
            i5 = i96;
            bArr14 = bArr28;
            int i166 = i108;
            if (performGaussianElimination(bArr16, bArr14, i164) == 0) {
                break;
            }
            i103 = i164;
            bArr28 = bArr14;
            bArr31 = bArr57;
            i92 = i2;
            i96 = i5;
            i99 = i3;
            i74 = i;
            i101 = i166;
            b13 = b98;
            bArr24 = bArr54;
            bArr26 = bArr55;
            bArr32 = bArr56;
            bArr33 = bArr2;
            bArr15 = bArr13;
            i102 = i165;
            b7 = 0;
        }
        int i167 = 0;
        int i168 = 0;
        while (i167 < i3) {
            int i169 = 0;
            int i170 = 0;
            while (i170 < i5) {
                GF16Utils.gf16mMulTo(bArr8[i167][i170], bArr14, i169, bArr29, i168, i2);
                i170++;
                i169 += i;
            }
            i167++;
            i168 += i;
        }
        System.arraycopy(bArr14, 0, bArr29, i33, i32);
        GF16.encode(bArr29, bArr, i59);
        System.arraycopy(bArr3, 0, bArr, bArr.length - 16, 16);
    }

    @Override // org.bouncycastle.pqc.crypto.MessageSigner
    public boolean verifySignature(byte[] bArr, byte[] bArr2) {
        byte[] messageHash = getMessageHash(bArr);
        MapGroup1 mapGroup1 = new MapGroup1(this.params);
        byte[] encoded = this.pubKey.getEncoded();
        byte[] bArrCopyOf = Arrays.copyOf(encoded, 16);
        byte[] bArrCopyOfRange = Arrays.copyOfRange(encoded, 16, encoded.length);
        this.engine.genABQP(mapGroup1, bArrCopyOf);
        byte[][][][] bArr3 = (byte[][][][]) Array.newInstance((Class<?>) Byte.TYPE, this.params.getM(), this.params.getO(), this.params.getO(), this.params.getLsq());
        if ((this.params.getLsq() & 1) == 0) {
            MapGroup1.decodeP(bArrCopyOfRange, 0, bArr3, bArrCopyOfRange.length << 1);
        } else {
            int length = bArrCopyOfRange.length << 1;
            byte[] bArr4 = new byte[length];
            GF16.decode(bArrCopyOfRange, bArr4, length);
            MapGroup1.fillP(bArr4, 0, bArr3, length);
        }
        return verifySignatureCore(messageHash, bArr2, bArrCopyOf, mapGroup1, bArr3);
    }

    public boolean verifySignatureCore(byte[] bArr, byte[] bArr2, byte[] bArr3, MapGroup1 mapGroup1, byte[][][][] bArr4) {
        int lsq = this.params.getLsq();
        int o = this.params.getO() * lsq;
        int i = (o + 1) >>> 1;
        int saltLength = this.params.getSaltLength();
        int m3 = this.params.getM();
        int n3 = this.params.getN() * lsq;
        byte[] bArr5 = new byte[i];
        createSignedHash(bArr3, bArr3.length, bArr, bArr.length, bArr2, (n3 + 1) >>> 1, saltLength, bArr5, i);
        if ((o & 1) != 0) {
            int i2 = i - 1;
            bArr5[i2] = (byte) (bArr5[i2] & 15);
        }
        byte[] bArr6 = new byte[n3];
        GF16.decode(bArr2, 0, bArr6, 0, n3);
        int i3 = m3 * lsq;
        byte[] bArr7 = new byte[i3];
        evaluation(bArr7, mapGroup1, bArr4, bArr6);
        byte[] bArr8 = new byte[i];
        GF16.encode(bArr7, bArr8, i3);
        return Arrays.areEqual(bArr5, bArr8);
    }
}
