package org.bouncycastle.pqc.legacy.rainbow;

import com.google.common.primitives.UnsignedBytes;
import java.lang.reflect.Array;
import java.security.SecureRandom;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.pqc.crypto.MessageSigner;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes14.dex */
public class RainbowSigner implements MessageSigner {
    private static final int MAXITS = 65536;

    /* JADX INFO: renamed from: cf, reason: collision with root package name */
    private ComputeInField f228929cf = new ComputeInField();
    private Digest hashAlgo;
    private RainbowKeyParameters key;
    private SecureRandom random;
    int signableDocumentLength;
    private Version version;

    /* JADX INFO: renamed from: org.bouncycastle.pqc.legacy.rainbow.RainbowSigner$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$org$bouncycastle$pqc$legacy$rainbow$Version;

        static {
            int[] iArr = new int[Version.values().length];
            $SwitchMap$org$bouncycastle$pqc$legacy$rainbow$Version = iArr;
            try {
                iArr[Version.CLASSIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$bouncycastle$pqc$legacy$rainbow$Version[Version.CIRCUMZENITHAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$org$bouncycastle$pqc$legacy$rainbow$Version[Version.COMPRESSED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private byte[] genSignature(byte[] bArr) {
        short[] sArr;
        int i;
        int i2;
        int i3;
        int i5;
        byte[] bArr2 = new byte[this.hashAlgo.getDigestSize()];
        this.hashAlgo.update(bArr, 0, bArr.length);
        this.hashAlgo.doFinal(bArr2, 0);
        int v16 = this.key.getParameters().getV1();
        int o110 = this.key.getParameters().getO1();
        int o210 = this.key.getParameters().getO2();
        int m3 = this.key.getParameters().getM();
        int n3 = this.key.getParameters().getN();
        RainbowPrivateKeyParameters rainbowPrivateKeyParameters = (RainbowPrivateKeyParameters) this.key;
        Digest digest = this.hashAlgo;
        this.random = new RainbowDRBG(RainbowUtil.hash(digest, rainbowPrivateKeyParameters.sk_seed, bArr2, new byte[digest.getDigestSize()]), rainbowPrivateKeyParameters.getParameters().getHash_algo());
        short[] sArr2 = new short[v16];
        short[] sArr3 = new short[o110];
        short[] sArr4 = new short[o210];
        Class cls = Short.TYPE;
        short[][] sArr5 = (short[][]) Array.newInstance((Class<?>) cls, o210, o110);
        int i6 = 0;
        short[][] sArr6 = (short[][]) Array.newInstance((Class<?>) cls, o210, o210);
        byte[] bArr3 = new byte[rainbowPrivateKeyParameters.getParameters().getLen_salt()];
        short[] sArr7 = new short[m3];
        short[] sArr8 = new short[o110];
        short[] sArr9 = new short[o210];
        int i21 = 0;
        short[][] sArrInverse = null;
        while (sArrInverse == null && i21 < 65536) {
            byte[] bArr4 = new byte[v16];
            this.random.nextBytes(bArr4);
            int i22 = 0;
            while (true) {
                i3 = i21;
                if (i22 >= v16) {
                    break;
                }
                sArr2[i22] = (short) (bArr4[i22] & UnsignedBytes.MAX_VALUE);
                i22++;
                i21 = i3;
            }
            short[][] sArr10 = (short[][]) Array.newInstance((Class<?>) cls, o110, o110);
            int i32 = 0;
            while (i32 < v16) {
                int i33 = 0;
                while (true) {
                    i5 = i32;
                    if (i33 < o110) {
                        int i43 = 0;
                        while (i43 < o110) {
                            int i59 = i43;
                            int i66 = i33;
                            short sMultElem = GF2Field.multElem(rainbowPrivateKeyParameters.l1_F2[i33][i5][i59], sArr2[i5]);
                            short[] sArr11 = sArr10[i66];
                            sArr11[i59] = GF2Field.addElem(sArr11[i59], sMultElem);
                            i43 = i59 + 1;
                            i33 = i66;
                        }
                        i33++;
                        i32 = i5;
                    }
                }
                i32 = i5 + 1;
            }
            sArrInverse = this.f228929cf.inverse(sArr10);
            i21 = i3 + 1;
        }
        int i74 = i21;
        int i92 = 0;
        while (i92 < o110) {
            int i96 = i92;
            sArr3[i96] = this.f228929cf.multiplyMatrix_quad(rainbowPrivateKeyParameters.l1_F1[i96], sArr2);
            i92 = i96 + 1;
        }
        int i99 = 0;
        while (i99 < v16) {
            int i100 = 0;
            while (true) {
                i2 = i99;
                if (i100 < o210) {
                    int i101 = i100;
                    sArr4[i101] = this.f228929cf.multiplyMatrix_quad(rainbowPrivateKeyParameters.l2_F1[i101], sArr2);
                    int i102 = 0;
                    while (i102 < o110) {
                        int i103 = i102;
                        short sMultElem2 = GF2Field.multElem(rainbowPrivateKeyParameters.l2_F2[i101][i2][i102], sArr2[i2]);
                        short[] sArr12 = sArr5[i101];
                        sArr12[i103] = GF2Field.addElem(sArr12[i103], sMultElem2);
                        i102 = i103 + 1;
                    }
                    int i104 = 0;
                    while (i104 < o210) {
                        int i105 = i104;
                        short sMultElem3 = GF2Field.multElem(rainbowPrivateKeyParameters.l2_F3[i101][i2][i104], sArr2[i2]);
                        short[] sArr13 = sArr6[i101];
                        sArr13[i105] = GF2Field.addElem(sArr13[i105], sMultElem3);
                        i104 = i105 + 1;
                    }
                    i100 = i101 + 1;
                    i99 = i2;
                }
            }
            i99 = i2 + 1;
        }
        byte[] bArr5 = new byte[m3];
        short[] sArr14 = sArr8;
        short[] sArrSolveEquation = null;
        int i106 = i74;
        while (true) {
            sArr = sArr2;
            if (sArrSolveEquation != null || i106 >= 65536) {
                break;
            }
            int[] iArr = new int[2];
            iArr[1] = o210;
            iArr[i6] = o210;
            short[][] sArr15 = (short[][]) Array.newInstance((Class<?>) cls, iArr);
            this.random.nextBytes(bArr3);
            short[] sArrMakeMessageRepresentative = makeMessageRepresentative(RainbowUtil.hash(this.hashAlgo, bArr2, bArr3, bArr5));
            byte[] bArr6 = bArr2;
            byte[] bArr7 = bArr5;
            Class cls2 = cls;
            int i107 = i6;
            System.arraycopy(this.f228929cf.addVect(Arrays.copyOf(sArrMakeMessageRepresentative, o110), this.f228929cf.multiplyMatrix(rainbowPrivateKeyParameters.f228925s1, Arrays.copyOfRange(sArrMakeMessageRepresentative, o110, m3))), i107, sArr7, i107, o110);
            System.arraycopy(sArrMakeMessageRepresentative, o110, sArr7, o110, o210);
            short[] sArrMultiplyMatrix = this.f228929cf.multiplyMatrix(sArrInverse, this.f228929cf.addVect(sArr3, Arrays.copyOf(sArr7, o110)));
            short[] sArrMultiplyMatrix2 = this.f228929cf.multiplyMatrix(sArr5, sArrMultiplyMatrix);
            int i108 = 0;
            while (i108 < o210) {
                int i109 = i108;
                sArr9[i109] = this.f228929cf.multiplyMatrix_quad(rainbowPrivateKeyParameters.l2_F5[i109], sArrMultiplyMatrix);
                i108 = i109 + 1;
            }
            short[] sArr16 = sArr9;
            short[] sArrAddVect = this.f228929cf.addVect(this.f228929cf.addVect(this.f228929cf.addVect(sArrMultiplyMatrix2, sArr16), sArr4), Arrays.copyOfRange(sArr7, o110, m3));
            int i110 = 0;
            while (i110 < o110) {
                int i111 = 0;
                while (true) {
                    i = i110;
                    if (i111 < o210) {
                        int i112 = 0;
                        while (i112 < o210) {
                            int i113 = i112;
                            int i114 = m3;
                            short sMultElem4 = GF2Field.multElem(rainbowPrivateKeyParameters.l2_F6[i111][i][i113], sArrMultiplyMatrix[i]);
                            short[] sArr17 = sArr15[i111];
                            sArr17[i113] = GF2Field.addElem(sArr17[i113], sMultElem4);
                            i112 = i113 + 1;
                            m3 = i114;
                        }
                        i111++;
                        i110 = i;
                    }
                }
                i110 = i + 1;
            }
            i106++;
            sArrSolveEquation = this.f228929cf.solveEquation(this.f228929cf.addMatrix(sArr15, sArr6), sArrAddVect);
            sArr14 = sArrMultiplyMatrix;
            sArr9 = sArr16;
            sArr2 = sArr;
            bArr2 = bArr6;
            bArr5 = bArr7;
            cls = cls2;
            m3 = m3;
            i6 = 0;
        }
        short[] sArr18 = sArrSolveEquation == null ? new short[o210] : sArrSolveEquation;
        short[] sArrAddVect2 = this.f228929cf.addVect(this.f228929cf.addVect(sArr, this.f228929cf.multiplyMatrix(rainbowPrivateKeyParameters.f228926t1, sArr14)), this.f228929cf.multiplyMatrix(rainbowPrivateKeyParameters.f228927t4, sArr18));
        short[] sArrAddVect3 = this.f228929cf.addVect(sArr14, this.f228929cf.multiplyMatrix(rainbowPrivateKeyParameters.t3, sArr18));
        short[] sArrCopyOf = Arrays.copyOf(sArrAddVect2, n3);
        System.arraycopy(sArrAddVect3, 0, sArrCopyOf, v16, o110);
        System.arraycopy(sArr18, 0, sArrCopyOf, o110 + v16, o210);
        if (i106 != 65536) {
            return Arrays.concatenate(RainbowUtil.convertArray(sArrCopyOf), bArr3);
        }
        throw new IllegalStateException("unable to generate signature - LES not solvable");
    }

    private short[] makeMessageRepresentative(byte[] bArr) {
        int i = this.signableDocumentLength;
        short[] sArr = new short[i];
        int i2 = 0;
        int i3 = 0;
        while (i2 < bArr.length) {
            sArr[i2] = (short) (bArr[i3] & UnsignedBytes.MAX_VALUE);
            i3++;
            i2++;
            if (i2 >= i) {
                break;
            }
        }
        return sArr;
    }

    @Override // org.bouncycastle.pqc.crypto.MessageSigner
    public byte[] generateSignature(byte[] bArr) {
        return genSignature(bArr);
    }

    @Override // org.bouncycastle.pqc.crypto.MessageSigner
    public void init(boolean z, CipherParameters cipherParameters) {
        RainbowKeyParameters rainbowKeyParameters;
        if (z) {
            if (cipherParameters instanceof ParametersWithRandom) {
                ParametersWithRandom parametersWithRandom = (ParametersWithRandom) cipherParameters;
                this.random = parametersWithRandom.getRandom();
                rainbowKeyParameters = (RainbowKeyParameters) parametersWithRandom.getParameters();
            } else {
                rainbowKeyParameters = (RainbowKeyParameters) cipherParameters;
                SecureRandom secureRandom = CryptoServicesRegistrar.getSecureRandom();
                byte[] bArr = new byte[rainbowKeyParameters.getParameters().getLen_skseed()];
                secureRandom.nextBytes(bArr);
                this.random = new RainbowDRBG(bArr, rainbowKeyParameters.getParameters().getHash_algo());
            }
            this.version = rainbowKeyParameters.getParameters().getVersion();
            this.key = rainbowKeyParameters;
        } else {
            RainbowKeyParameters rainbowKeyParameters2 = (RainbowKeyParameters) cipherParameters;
            this.key = rainbowKeyParameters2;
            this.version = rainbowKeyParameters2.getParameters().getVersion();
        }
        this.signableDocumentLength = this.key.getDocLength();
        this.hashAlgo = this.key.getParameters().getHash_algo();
    }

    @Override // org.bouncycastle.pqc.crypto.MessageSigner
    public boolean verifySignature(byte[] bArr, byte[] bArr2) {
        short[] sArrPublicMap;
        byte[] bArr3 = new byte[this.hashAlgo.getDigestSize()];
        this.hashAlgo.update(bArr, 0, bArr.length);
        this.hashAlgo.doFinal(bArr3, 0);
        int m3 = this.key.getParameters().getM();
        int n3 = this.key.getParameters().getN();
        RainbowPublicMap rainbowPublicMap = new RainbowPublicMap(this.key.getParameters());
        short[] sArrMakeMessageRepresentative = makeMessageRepresentative(RainbowUtil.hash(this.hashAlgo, bArr3, Arrays.copyOfRange(bArr2, n3, bArr2.length), new byte[m3]));
        short[] sArrConvertArray = RainbowUtil.convertArray(Arrays.copyOfRange(bArr2, 0, n3));
        int i = AnonymousClass1.$SwitchMap$org$bouncycastle$pqc$legacy$rainbow$Version[this.version.ordinal()];
        if (i == 1) {
            sArrPublicMap = rainbowPublicMap.publicMap((RainbowPublicKeyParameters) this.key, sArrConvertArray);
        } else {
            if (i != 2 && i != 3) {
                throw new IllegalArgumentException("No valid version. Please choose one of the following: classic, circumzenithal, compressed");
            }
            sArrPublicMap = rainbowPublicMap.publicMap_cyclic((RainbowPublicKeyParameters) this.key, sArrConvertArray);
        }
        return RainbowUtil.equals(sArrMakeMessageRepresentative, sArrPublicMap);
    }
}
