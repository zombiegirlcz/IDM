package org.bouncycastle.pqc.crypto.ntruprime;

import a10.b;
import com.google.common.primitives.UnsignedBytes;
import ehe.n;
import java.security.SecureRandom;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.crypto.digests.SHA512Digest;
import org.bouncycastle.crypto.engines.AESEngine;
import org.bouncycastle.crypto.hpke.HPKE;
import org.bouncycastle.crypto.modes.CTRModeCipher;
import org.bouncycastle.crypto.modes.SICBlockCipher;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;

/* JADX INFO: loaded from: classes14.dex */
class Utils {
    public static int bToUnsignedInt(byte b4) {
        return b4 & UnsignedBytes.MAX_VALUE;
    }

    public static void checkForSmallPolynomial(byte[] bArr, byte[] bArr2, int i, int i2) {
        int i3 = 0;
        for (int i5 = 0; i5 != bArr2.length; i5++) {
            i3 += bArr2[i5] & 1;
        }
        int iCheckNotEqualToZero = checkNotEqualToZero(i3 - i2);
        for (int i6 = 0; i6 < i2; i6++) {
            bArr[i6] = (byte) (((bArr2[i6] ^ 1) & (~iCheckNotEqualToZero)) ^ 1);
        }
        while (i2 < i) {
            bArr[i2] = (byte) (bArr2[i2] & (~iCheckNotEqualToZero));
            i2++;
        }
    }

    private static int checkLessThanZero(int i) {
        return -(i >>> 31);
    }

    private static int checkNotEqualToZero(int i) {
        return -((int) ((-iToUnsignedLong(i)) >>> 63));
    }

    public static void cryptoSort(int[] iArr, int i) {
        if (i < 2) {
            return;
        }
        int i2 = 1;
        while (i2 < i - i2) {
            i2 += i2;
        }
        for (int i3 = i2; i3 > 0; i3 >>>= 1) {
            for (int i5 = 0; i5 < i - i3; i5++) {
                if ((i5 & i3) == 0) {
                    minmax(iArr, i5, i5 + i3);
                }
            }
            for (int i6 = i2; i6 > i3; i6 >>>= 1) {
                for (int i21 = 0; i21 < i - i6; i21++) {
                    if ((i21 & i3) == 0) {
                        minmax(iArr, i21 + i3, i21 + i6);
                    }
                }
            }
        }
    }

    private static void decode(short[] sArr, byte[] bArr, short[] sArr2, int i, int i2, int i3) {
        int i5;
        if (i == 1) {
            short s2 = sArr2[0];
            if (s2 == 1) {
                sArr[i2] = 0;
            } else if (s2 <= 256) {
                sArr[i2] = (short) getUnsignedMod(bToUnsignedInt(bArr[i3]), sArr2[0]);
            } else {
                sArr[i2] = (short) getUnsignedMod(bToUnsignedInt(bArr[i3]) + (bArr[i3 + 1] << 8), sArr2[0]);
            }
        }
        if (i > 1) {
            int i6 = (i + 1) / 2;
            short[] sArr3 = new short[i6];
            short[] sArr4 = new short[i6];
            int i21 = i / 2;
            short[] sArr5 = new short[i21];
            int[] iArr = new int[i21];
            int i22 = i3;
            int i32 = 0;
            while (true) {
                i5 = i - 1;
                if (i32 >= i5) {
                    break;
                }
                int i33 = sArr2[i32] * sArr2[i32 + 1];
                if (i33 > 4194048) {
                    int i43 = i32 / 2;
                    iArr[i43] = 65536;
                    sArr5[i43] = (short) ((bToUnsignedInt(bArr[i22 + 1]) * 256) + bToUnsignedInt(bArr[i22]));
                    i22 += 2;
                    sArr4[i43] = (short) ((((i33 + 255) >>> 8) + 255) >>> 8);
                } else if (i33 >= 16384) {
                    int i59 = i32 / 2;
                    iArr[i59] = 256;
                    sArr5[i59] = (short) bToUnsignedInt(bArr[i22]);
                    i22++;
                    sArr4[i59] = (short) ((i33 + 255) >>> 8);
                } else {
                    int i66 = i32 / 2;
                    iArr[i66] = 1;
                    sArr5[i66] = 0;
                    sArr4[i66] = (short) i33;
                }
                i32 += 2;
            }
            if (i32 < i) {
                sArr4[i32 / 2] = sArr2[i32];
            }
            decode(sArr3, bArr, sArr4, i6, i2, i22);
            int i74 = i2;
            int i92 = 0;
            while (i92 < i5) {
                int i96 = i92 / 2;
                int[] unsignedDivMod = getUnsignedDivMod((iArr[i96] * sToUnsignedInt(sArr3[i96])) + sToUnsignedInt(sArr5[i96]), sArr2[i92]);
                int i99 = i74 + 1;
                sArr[i74] = (short) unsignedDivMod[1];
                i74 += 2;
                sArr[i99] = (short) getUnsignedMod(unsignedDivMod[0], sArr2[i92 + 1]);
                i92 += 2;
            }
            if (i92 < i) {
                sArr[i74] = sArr3[i92 / 2];
            }
        }
    }

    private static void encode(byte[] bArr, short[] sArr, short[] sArr2, int i, int i2) {
        int i3 = 0;
        if (i == 1) {
            short s2 = sArr[0];
            short s3 = sArr2[0];
            while (s3 > 1) {
                bArr[i2] = (byte) s2;
                s2 = (short) (s2 >>> 8);
                s3 = (short) ((s3 + 255) >>> 8);
                i2++;
            }
        }
        if (i > 1) {
            int i5 = (i + 1) / 2;
            short[] sArr3 = new short[i5];
            short[] sArr4 = new short[i5];
            while (i3 < i - 1) {
                short s4 = sArr2[i3];
                int i6 = i3 + 1;
                int i21 = (sArr[i6] * s4) + sArr[i3];
                int i22 = sArr2[i6] * s4;
                while (i22 >= 16384) {
                    bArr[i2] = (byte) i21;
                    i21 >>>= 8;
                    i22 = (i22 + 255) >>> 8;
                    i2++;
                }
                int i32 = i3 / 2;
                sArr3[i32] = (short) i21;
                sArr4[i32] = (short) i22;
                i3 += 2;
            }
            if (i3 < i) {
                int i33 = i3 / 2;
                sArr3[i33] = sArr[i3];
                sArr4[i33] = sArr2[i3];
            }
            encode(bArr, sArr3, sArr4, i5, i2);
        }
    }

    public static void expand(int[] iArr, byte[] bArr) {
        byte[] bArr2 = new byte[iArr.length * 4];
        byte[] bArr3 = new byte[iArr.length * 4];
        generateAES256CTRStream(bArr2, bArr3, new byte[16], bArr);
        for (int i = 0; i < iArr.length; i++) {
            int i2 = i * 4;
            iArr[i] = bToUnsignedInt(bArr3[i2]) + (bToUnsignedInt(bArr3[i2 + 1]) << 8) + (bToUnsignedInt(bArr3[i2 + 2]) << 16) + (bToUnsignedInt(bArr3[i2 + 3]) << 24);
        }
    }

    private static void generateAES256CTRStream(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        CTRModeCipher cTRModeCipherNewInstance = SICBlockCipher.newInstance(AESEngine.newInstance());
        cTRModeCipherNewInstance.init(true, new ParametersWithIV(new KeyParameter(bArr4), bArr3));
        cTRModeCipherNewInstance.processBytes(bArr, 0, bArr2.length, bArr2, 0);
    }

    public static void generatePolynomialInRQFromSeed(short[] sArr, byte[] bArr, int i, int i2) {
        int[] iArr = new int[i];
        expand(iArr, bArr);
        for (int i3 = 0; i3 < i; i3++) {
            sArr[i3] = (short) (getUnsignedMod(iArr[i3], i2) - ((i2 - 1) / 2));
        }
    }

    public static void getDecodedPolynomial(short[] sArr, byte[] bArr, int i, int i2) {
        short[] sArr2 = new short[i];
        short[] sArr3 = new short[i];
        for (int i3 = 0; i3 < i; i3++) {
            sArr3[i3] = (short) i2;
        }
        decode(sArr2, bArr, sArr3, i, 0, 0);
        for (int i5 = 0; i5 < i; i5++) {
            sArr[i5] = (short) (sArr2[i5] - ((i2 - 1) / 2));
        }
    }

    public static void getDecodedSmallPolynomial(byte[] bArr, byte[] bArr2, int i) {
        int i2 = 0;
        int i3 = 0;
        int i5 = 0;
        while (i2 < i / 4) {
            int i6 = i3 + 1;
            byte b4 = bArr2[i3];
            bArr[i5] = (byte) ((bToUnsignedInt(b4) & 3) - 1);
            bArr[i5 + 1] = (byte) ((bToUnsignedInt(r1) & 3) - 1);
            byte b5 = (byte) (((byte) (b4 >>> 2)) >>> 2);
            int i21 = i5 + 3;
            bArr[i5 + 2] = (byte) ((bToUnsignedInt(b5) & 3) - 1);
            i5 += 4;
            bArr[i21] = (byte) ((bToUnsignedInt((byte) (b5 >>> 2)) & 3) - 1);
            i2++;
            i3 = i6;
        }
        bArr[i5] = (byte) ((bToUnsignedInt(bArr2[i3]) & 3) - 1);
    }

    public static void getEncodedInputs(byte[] bArr, byte[] bArr2) {
        for (int i = 0; i < bArr2.length; i++) {
            int i2 = i >>> 3;
            bArr[i2] = (byte) (bArr[i2] | (bArr2[i] << (i & 7)));
        }
    }

    public static void getEncodedPolynomial(byte[] bArr, short[] sArr, int i, int i2) {
        short[] sArr2 = new short[i];
        short[] sArr3 = new short[i];
        for (int i3 = 0; i3 < i; i3++) {
            sArr2[i3] = (short) b.a(i2, 1, 2, sArr[i3]);
        }
        for (int i5 = 0; i5 < i; i5++) {
            sArr3[i5] = (short) i2;
        }
        encode(bArr, sArr2, sArr3, i, 0);
    }

    public static void getEncodedSmallPolynomial(byte[] bArr, byte[] bArr2, int i) {
        int i2 = 0;
        int i3 = 0;
        int i5 = 0;
        while (i2 < i / 4) {
            int i6 = i5 + 3;
            byte b4 = (byte) (((byte) (((byte) (bArr2[i5] + 1)) + (((byte) (bArr2[i5 + 1] + 1)) << 2))) + (((byte) (bArr2[i5 + 2] + 1)) << 4));
            i5 += 4;
            bArr[i3] = (byte) (b4 + (((byte) (bArr2[i6] + 1)) << 6));
            i2++;
            i3++;
        }
        bArr[i3] = (byte) (bArr2[i5] + 1);
    }

    public static byte[] getHashWithPrefix(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[64];
        int length = bArr.length + bArr2.length;
        byte[] bArr4 = new byte[length];
        System.arraycopy(bArr, 0, bArr4, 0, bArr.length);
        System.arraycopy(bArr2, 0, bArr4, bArr.length, bArr2.length);
        SHA512Digest sHA512Digest = new SHA512Digest();
        sHA512Digest.update(bArr4, 0, length);
        sHA512Digest.doFinal(bArr3, 0);
        return bArr3;
    }

    public static int getInverseInRQ(int i, int i2) {
        int modFreeze = i;
        for (int i3 = 1; i3 < i2 - 2; i3++) {
            modFreeze = getModFreeze(modFreeze * i, i2);
        }
        return modFreeze;
    }

    public static int getModFreeze(int i, int i2) {
        int i3 = (i2 - 1) / 2;
        return getSignedDivMod(i + i3, i2)[1] - i3;
    }

    public static void getOneThirdInverseInRQ(short[] sArr, byte[] bArr, int i, int i2) {
        int i3 = i + 1;
        short[] sArr2 = new short[i3];
        short[] sArr3 = new short[i3];
        short[] sArr4 = new short[i3];
        short[] sArr5 = new short[i3];
        sArr4[0] = (short) getInverseInRQ(3, i2);
        sArr2[0] = 1;
        int i5 = i - 1;
        sArr2[i5] = -1;
        sArr2[i] = -1;
        for (int i6 = 0; i6 < i; i6++) {
            sArr3[i5 - i6] = bArr[i6];
        }
        sArr3[i] = 0;
        int i21 = 1;
        for (int i22 = 0; i22 < (i * 2) - 1; i22++) {
            System.arraycopy(sArr5, 0, sArr5, 1, i);
            sArr5[0] = 0;
            int i32 = -i21;
            int iCheckLessThanZero = checkLessThanZero(i32) & checkNotEqualToZero(sArr3[0]);
            i21 = (i21 ^ ((i32 ^ i21) & iCheckLessThanZero)) + 1;
            for (int i33 = 0; i33 < i3; i33++) {
                short s2 = sArr2[i33];
                int i43 = (sArr3[i33] ^ s2) & iCheckLessThanZero;
                sArr2[i33] = (short) (s2 ^ i43);
                sArr3[i33] = (short) (sArr3[i33] ^ i43);
                short s3 = sArr5[i33];
                int i59 = (sArr4[i33] ^ s3) & iCheckLessThanZero;
                sArr5[i33] = (short) (s3 ^ i59);
                sArr4[i33] = (short) (sArr4[i33] ^ i59);
            }
            short s4 = sArr2[0];
            short s6 = sArr3[0];
            for (int i66 = 0; i66 < i3; i66++) {
                sArr3[i66] = (short) getModFreeze((sArr3[i66] * s4) - (sArr2[i66] * s6), i2);
            }
            for (int i74 = 0; i74 < i3; i74++) {
                sArr4[i74] = (short) getModFreeze((sArr4[i74] * s4) - (sArr5[i74] * s6), i2);
            }
            int i92 = 0;
            while (i92 < i) {
                int i96 = i92 + 1;
                sArr3[i92] = sArr3[i96];
                i92 = i96;
            }
            sArr3[i] = 0;
        }
        int inverseInRQ = getInverseInRQ(sArr2[0], i2);
        for (int i99 = 0; i99 < i; i99++) {
            sArr[i99] = (short) getModFreeze(sArr5[i5 - i99] * inverseInRQ, i2);
        }
    }

    public static void getRandomInputs(SecureRandom secureRandom, byte[] bArr) {
        byte[] bArr2 = new byte[bArr.length / 8];
        secureRandom.nextBytes(bArr2);
        for (int i = 0; i < bArr.length; i++) {
            bArr[i] = (byte) ((bArr2[i >>> 3] >>> (i & 7)) & 1);
        }
    }

    public static void getRandomShortPolynomial(SecureRandom secureRandom, byte[] bArr, int i, int i2) {
        int[] iArr = new int[i];
        for (int i3 = 0; i3 < i; i3++) {
            iArr[i3] = getRandomUnsignedInteger(secureRandom);
        }
        sortGenerateShortPolynomial(bArr, iArr, i, i2);
    }

    public static void getRandomSmallPolynomial(SecureRandom secureRandom, byte[] bArr) {
        for (int i = 0; i < bArr.length; i++) {
            bArr[i] = (byte) ((((getRandomUnsignedInteger(secureRandom) & 1073741823) * 3) >>> 30) - 1);
        }
    }

    public static int getRandomUnsignedInteger(SecureRandom secureRandom) {
        byte[] bArr = new byte[4];
        secureRandom.nextBytes(bArr);
        return bToUnsignedInt(bArr[0]) + (bToUnsignedInt(bArr[1]) << 8) + (bToUnsignedInt(bArr[2]) << 16) + (bToUnsignedInt(bArr[3]) << 24);
    }

    public static void getRoundedDecodedPolynomial(short[] sArr, byte[] bArr, int i, int i2) {
        short[] sArr2 = new short[i];
        short[] sArr3 = new short[i];
        for (int i3 = 0; i3 < i; i3++) {
            sArr3[i3] = (short) ((i2 + 2) / 3);
        }
        decode(sArr2, bArr, sArr3, i, 0, 0);
        for (int i5 = 0; i5 < i; i5++) {
            sArr[i5] = (short) ((sArr2[i5] * 3) - ((i2 - 1) / 2));
        }
    }

    public static void getRoundedEncodedPolynomial(byte[] bArr, short[] sArr, int i, int i2) {
        short[] sArr2 = new short[i];
        short[] sArr3 = new short[i];
        for (int i3 = 0; i3 < i; i3++) {
            sArr2[i3] = (short) (((((i2 - 1) / 2) + sArr[i3]) * 10923) >>> 15);
            sArr3[i3] = (short) ((i2 + 2) / 3);
        }
        encode(bArr, sArr2, sArr3, i, 0);
    }

    private static int[] getSignedDivMod(int i, int i2) {
        int[] unsignedDivMod = getUnsignedDivMod(toIntExact(iToUnsignedLong(i) - 2147483648L), i2);
        int[] unsignedDivMod2 = getUnsignedDivMod(Integer.MIN_VALUE, i2);
        int intExact = toIntExact(iToUnsignedLong(unsignedDivMod[0]) - iToUnsignedLong(unsignedDivMod2[0]));
        int intExact2 = toIntExact(iToUnsignedLong(unsignedDivMod[1]) - iToUnsignedLong(unsignedDivMod2[1]));
        int i3 = -(intExact2 >>> 31);
        return new int[]{intExact + i3, intExact2 + (i2 & i3)};
    }

    public static void getTopDecodedPolynomial(byte[] bArr, byte[] bArr2) {
        for (int i = 0; i < bArr2.length; i++) {
            int i2 = i * 2;
            bArr[i2] = (byte) (bArr2[i] & 15);
            bArr[i2 + 1] = (byte) (bArr2[i] >>> 4);
        }
    }

    public static void getTopEncodedPolynomial(byte[] bArr, byte[] bArr2) {
        for (int i = 0; i < bArr.length; i++) {
            int i2 = i * 2;
            bArr[i] = (byte) (bArr2[i2] + (bArr2[i2 + 1] << 4));
        }
    }

    private static int[] getUnsignedDivMod(int i, int i2) {
        long jIToUnsignedLong = iToUnsignedLong(i);
        long j2 = i2;
        long jIToUnsignedLong2 = iToUnsignedLong(Integer.MIN_VALUE) / j2;
        long j3 = (jIToUnsignedLong * jIToUnsignedLong2) >>> 31;
        long j5 = jIToUnsignedLong - (j3 * j2);
        long j16 = (jIToUnsignedLong2 * j5) >>> 31;
        long j22 = (j5 - (j16 * j2)) - j2;
        long j42 = j3 + j16 + 1;
        long j46 = -(j22 >>> 63);
        return new int[]{toIntExact(j42 + j46), toIntExact(j22 + (j2 & j46))};
    }

    private static int getUnsignedMod(int i, int i2) {
        return getUnsignedDivMod(i, i2)[1];
    }

    public static long iToUnsignedLong(int i) {
        return ((long) i) & BodyPartID.bodyIdMax;
    }

    public static boolean isInvertiblePolynomialInR3(byte[] bArr, byte[] bArr2, int i) {
        int i2 = i + 1;
        byte[] bArr3 = new byte[i2];
        byte[] bArr4 = new byte[i2];
        byte[] bArr5 = new byte[i2];
        byte[] bArr6 = new byte[i2];
        bArr5[0] = 1;
        bArr3[0] = 1;
        int i3 = i - 1;
        bArr3[i3] = -1;
        bArr3[i] = -1;
        for (int i5 = 0; i5 < i; i5++) {
            bArr4[i3 - i5] = bArr[i5];
        }
        bArr4[i] = 0;
        int i6 = 1;
        for (int i21 = 0; i21 < (i * 2) - 1; i21++) {
            System.arraycopy(bArr6, 0, bArr6, 1, i);
            bArr6[0] = 0;
            int i22 = (-bArr4[0]) * bArr3[0];
            int i32 = -i6;
            int iCheckLessThanZero = checkLessThanZero(i32) & checkNotEqualToZero(bArr4[0]);
            i6 = (i6 ^ ((i32 ^ i6) & iCheckLessThanZero)) + 1;
            for (int i33 = 0; i33 < i2; i33++) {
                byte b4 = bArr3[i33];
                int i43 = (bArr4[i33] ^ b4) & iCheckLessThanZero;
                bArr3[i33] = (byte) (b4 ^ i43);
                bArr4[i33] = (byte) (bArr4[i33] ^ i43);
                byte b5 = bArr6[i33];
                int i59 = (bArr5[i33] ^ b5) & iCheckLessThanZero;
                bArr6[i33] = (byte) (b5 ^ i59);
                bArr5[i33] = (byte) (bArr5[i33] ^ i59);
            }
            for (int i66 = 0; i66 < i2; i66++) {
                bArr4[i66] = (byte) getModFreeze((bArr3[i66] * i22) + bArr4[i66], 3);
            }
            for (int i74 = 0; i74 < i2; i74++) {
                bArr5[i74] = (byte) getModFreeze((bArr6[i74] * i22) + bArr5[i74], 3);
            }
            int i92 = 0;
            while (i92 < i) {
                int i96 = i92 + 1;
                bArr4[i92] = bArr4[i96];
                i92 = i96;
            }
            bArr4[i] = 0;
        }
        byte b7 = bArr3[0];
        for (int i99 = 0; i99 < i; i99++) {
            bArr2[i99] = (byte) (bArr6[i3 - i99] * b7);
        }
        return i6 == 0;
    }

    public static void minmax(int[] iArr, int i, int i2) {
        int i3 = iArr[i];
        int i5 = iArr[i2];
        int i6 = i3 ^ i5;
        int i21 = i5 - i3;
        int i22 = i6 & (-((i21 ^ (((i21 ^ i5) ^ Integer.MIN_VALUE) & i6)) >>> 31));
        iArr[i] = i3 ^ i22;
        iArr[i2] = i5 ^ i22;
    }

    public static void multiplicationInR3(byte[] bArr, byte[] bArr2, byte[] bArr3, int i) {
        int i2 = i + i;
        int i3 = i2 - 1;
        byte[] bArr4 = new byte[i3];
        for (int i5 = 0; i5 < i; i5++) {
            byte modFreeze = 0;
            for (int i6 = 0; i6 <= i5; i6++) {
                modFreeze = (byte) getModFreeze((bArr2[i6] * bArr3[i5 - i6]) + modFreeze, 3);
            }
            bArr4[i5] = modFreeze;
        }
        for (int i21 = i; i21 < i3; i21++) {
            byte modFreeze2 = 0;
            for (int i22 = (i21 - i) + 1; i22 < i; i22++) {
                modFreeze2 = (byte) getModFreeze((bArr2[i22] * bArr3[i21 - i22]) + modFreeze2, 3);
            }
            bArr4[i21] = modFreeze2;
        }
        for (int i32 = i2 - 2; i32 >= i; i32--) {
            int i33 = i32 - i;
            bArr4[i33] = (byte) getModFreeze(bArr4[i33] + bArr4[i32], 3);
            int i43 = i33 + 1;
            bArr4[i43] = (byte) getModFreeze(bArr4[i43] + bArr4[i32], 3);
        }
        for (int i59 = 0; i59 < i; i59++) {
            bArr[i59] = bArr4[i59];
        }
    }

    public static void multiplicationInRQ(short[] sArr, short[] sArr2, byte[] bArr, int i, int i2) {
        int i3 = i + i;
        int i5 = i3 - 1;
        short[] sArr3 = new short[i5];
        for (int i6 = 0; i6 < i; i6++) {
            short modFreeze = 0;
            for (int i21 = 0; i21 <= i6; i21++) {
                modFreeze = (short) getModFreeze((sArr2[i21] * bArr[i6 - i21]) + modFreeze, i2);
            }
            sArr3[i6] = modFreeze;
        }
        for (int i22 = i; i22 < i5; i22++) {
            short modFreeze2 = 0;
            for (int i32 = (i22 - i) + 1; i32 < i; i32++) {
                modFreeze2 = (short) getModFreeze((sArr2[i32] * bArr[i22 - i32]) + modFreeze2, i2);
            }
            sArr3[i22] = modFreeze2;
        }
        for (int i33 = i3 - 2; i33 >= i; i33--) {
            int i43 = i33 - i;
            sArr3[i43] = (short) getModFreeze(sArr3[i43] + sArr3[i33], i2);
            int i59 = i43 + 1;
            sArr3[i59] = (short) getModFreeze(sArr3[i59] + sArr3[i33], i2);
        }
        for (int i66 = 0; i66 < i; i66++) {
            sArr[i66] = sArr3[i66];
        }
    }

    public static void right(byte[] bArr, short[] sArr, byte[] bArr2, int i, int i2, int i3, int i5) {
        for (int i6 = 0; i6 < bArr.length; i6++) {
            bArr[i6] = (byte) (-checkLessThanZero(getModFreeze(n.a(i2, 4, getModFreeze((bArr2[i6] * i5) - i3, i) - sArr[i6], 1), i)));
        }
    }

    public static void roundPolynomial(short[] sArr, short[] sArr2) {
        for (int i = 0; i < sArr.length; i++) {
            short s2 = sArr2[i];
            sArr[i] = (short) (s2 - getModFreeze(s2, 3));
        }
    }

    public static int sToUnsignedInt(short s2) {
        return s2 & HPKE.aead_EXPORT_ONLY;
    }

    public static void scalarMultiplicationInRQ(short[] sArr, short[] sArr2, int i, int i2) {
        for (int i3 = 0; i3 < sArr2.length; i3++) {
            sArr[i3] = (short) getModFreeze(sArr2[i3] * i, i2);
        }
    }

    public static void sortGenerateShortPolynomial(byte[] bArr, int[] iArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            iArr[i3] = iArr[i3] & (-2);
        }
        while (i2 < i) {
            iArr[i2] = (iArr[i2] & (-3)) | 1;
            i2++;
        }
        cryptoSort(iArr, i);
        for (int i5 = 0; i5 < i; i5++) {
            bArr[i5] = (byte) ((iArr[i5] & 3) - 1);
        }
    }

    public static int toIntExact(long j2) {
        int i = (int) j2;
        if (i == j2) {
            return i;
        }
        throw new IllegalStateException("value out of integer range");
    }

    public static void top(byte[] bArr, short[] sArr, byte[] bArr2, int i, int i2, int i3) {
        for (int i5 = 0; i5 < bArr.length; i5++) {
            bArr[i5] = (byte) ((((getModFreeze((((i - 1) / 2) * bArr2[i5]) + sArr[i5], i) + i2) * i3) + 16384) >>> 15);
        }
    }

    public static void transformRQToR3(byte[] bArr, short[] sArr) {
        for (int i = 0; i < sArr.length; i++) {
            bArr[i] = (byte) getModFreeze(sArr[i], 3);
        }
    }

    public static void updateDiffMask(byte[] bArr, byte[] bArr2, int i) {
        for (int i2 = 0; i2 < bArr.length; i2++) {
            int i3 = bArr[i2];
            bArr[i2] = (byte) (i3 ^ ((bArr2[i2] ^ i3) & i));
        }
    }
}
