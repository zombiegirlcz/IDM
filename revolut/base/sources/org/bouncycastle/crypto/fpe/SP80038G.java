package org.bouncycastle.crypto.fpe;

import a0.d;
import com.google.common.primitives.UnsignedBytes;
import java.math.BigInteger;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.hpke.HPKE;
import org.bouncycastle.crypto.util.RadixConverter;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.BigIntegers;
import org.bouncycastle.util.Bytes;
import org.bouncycastle.util.Integers;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes14.dex */
class SP80038G {
    protected static final int BLOCK_SIZE = 16;
    static final String FF1_DISABLED = "org.bouncycastle.fpe.disable_ff1";
    static final String FPE_DISABLED = "org.bouncycastle.fpe.disable";
    protected static final double LOG2 = Math.log(2.0d);
    protected static final double TWO_TO_96 = Math.pow(2.0d, 96.0d);

    public static int calculateB_FF1(int i, int i2) {
        int iNumberOfTrailingZeros = Integers.numberOfTrailingZeros(i);
        int iBitLength = iNumberOfTrailingZeros * i2;
        int i3 = i >>> iNumberOfTrailingZeros;
        if (i3 != 1) {
            iBitLength += BigInteger.valueOf(i3).pow(i2).bitLength();
        }
        return (iBitLength + 7) / 8;
    }

    public static BigInteger[] calculateModUV(BigInteger bigInteger, int i, int i2) {
        BigInteger bigIntegerPow = bigInteger.pow(i);
        BigInteger[] bigIntegerArr = {bigIntegerPow, bigIntegerPow};
        if (i2 != i) {
            bigIntegerArr[1] = bigIntegerPow.multiply(bigInteger);
        }
        return bigIntegerArr;
    }

    public static byte[] calculateP_FF1(int i, byte b4, int i2, int i3) {
        byte[] bArr = {1, 2, 1, 0, (byte) (i >> 8), (byte) i, 10, b4, 0, 0, 0, 0, 0, 0, 0, 0};
        Pack.intToBigEndian(i2, bArr, 8);
        Pack.intToBigEndian(i3, bArr, 12);
        return bArr;
    }

    public static byte[] calculateTweak64_FF3_1(byte[] bArr) {
        byte b4 = bArr[0];
        byte b5 = bArr[1];
        byte b7 = bArr[2];
        byte b13 = bArr[3];
        return new byte[]{b4, b5, b7, (byte) (b13 & 240), bArr[4], bArr[5], bArr[6], (byte) (b13 << 4)};
    }

    public static BigInteger calculateY_FF1(BlockCipher blockCipher, byte[] bArr, int i, int i2, int i3, byte[] bArr2, short[] sArr, RadixConverter radixConverter) {
        int length = bArr.length;
        byte[] bArrAsUnsignedByteArray = BigIntegers.asUnsignedByteArray(radixConverter.fromEncoding(sArr));
        int i5 = ((-(length + i + 1)) & 15) + length;
        int i6 = i5 + 1 + i;
        byte[] bArr3 = new byte[i6];
        System.arraycopy(bArr, 0, bArr3, 0, length);
        bArr3[i5] = (byte) i3;
        System.arraycopy(bArrAsUnsignedByteArray, 0, bArr3, i6 - bArrAsUnsignedByteArray.length, bArrAsUnsignedByteArray.length);
        byte[] bArrPrf = prf(blockCipher, Arrays.concatenate(bArr2, bArr3));
        if (i2 > 16) {
            int i21 = (i2 + 15) / 16;
            byte[] bArr4 = new byte[i21 * 16];
            int iBigEndianToInt = Pack.bigEndianToInt(bArrPrf, 12);
            System.arraycopy(bArrPrf, 0, bArr4, 0, 16);
            for (int i22 = 1; i22 < i21; i22++) {
                int i32 = i22 * 16;
                System.arraycopy(bArrPrf, 0, bArr4, i32, 12);
                Pack.intToBigEndian(iBigEndianToInt ^ i22, bArr4, i32 + 12);
                blockCipher.processBlock(bArr4, i32, bArr4, i32);
            }
            bArrPrf = bArr4;
        }
        return num(bArrPrf, 0, i2);
    }

    public static BigInteger calculateY_FF3(BlockCipher blockCipher, byte[] bArr, int i, int i2, short[] sArr, RadixConverter radixConverter) {
        byte[] bArr2 = new byte[16];
        Pack.intToBigEndian(Pack.bigEndianToInt(bArr, i) ^ i2, bArr2, 0);
        BigIntegers.asUnsignedByteArray(radixConverter.fromEncoding(sArr), bArr2, 4, 12);
        Arrays.reverseInPlace(bArr2);
        blockCipher.processBlock(bArr2, 0, bArr2, 0);
        Arrays.reverseInPlace(bArr2);
        return num(bArr2, 0, 16);
    }

    public static void checkArgs(BlockCipher blockCipher, boolean z, int i, byte[] bArr, int i2, int i3) {
        checkCipher(blockCipher);
        if (i < 2 || i > 256) {
            throw new IllegalArgumentException();
        }
        checkData(z, i, bArr, i2, i3);
    }

    public static void checkCipher(BlockCipher blockCipher) {
        if (16 != blockCipher.getBlockSize()) {
            throw new IllegalArgumentException();
        }
    }

    public static void checkData(boolean z, int i, byte[] bArr, int i2, int i3) {
        checkLength(z, i, i3);
        for (int i5 = 0; i5 < i3; i5++) {
            if ((bArr[i2 + i5] & UnsignedBytes.MAX_VALUE) >= i) {
                throw new IllegalArgumentException("input data outside of radix");
            }
        }
    }

    private static void checkLength(boolean z, int i, int i2) {
        int iFloor;
        if (i2 >= 2) {
            double d = i;
            if (Math.pow(d, i2) >= 1000000.0d) {
                if (!z && i2 > (iFloor = ((int) Math.floor(Math.log(TWO_TO_96) / Math.log(d))) * 2)) {
                    throw new IllegalArgumentException(d.n("maximum input length is ", iFloor));
                }
                return;
            }
        }
        throw new IllegalArgumentException("input too short");
    }

    public static short[] decFF1(BlockCipher blockCipher, RadixConverter radixConverter, byte[] bArr, int i, int i2, int i3, short[] sArr, short[] sArr2) {
        int radix = radixConverter.getRadix();
        int length = bArr.length;
        int iCalculateB_FF1 = calculateB_FF1(radix, i3);
        int i5 = (iCalculateB_FF1 + 7) & (-4);
        byte[] bArrCalculateP_FF1 = calculateP_FF1(radix, (byte) i2, i, length);
        BigInteger[] bigIntegerArrCalculateModUV = calculateModUV(BigInteger.valueOf(radix), i2, i3);
        int i6 = 9;
        short[] sArr3 = sArr2;
        int i21 = i2;
        short[] sArr4 = sArr;
        while (i6 >= 0) {
            int i22 = iCalculateB_FF1;
            byte[] bArr2 = bArrCalculateP_FF1;
            int i32 = i6;
            i21 = i - i21;
            radixConverter.toEncoding(radixConverter.fromEncoding(sArr3).subtract(calculateY_FF1(blockCipher, bArr, i22, i5, i32, bArr2, sArr4, radixConverter)).mod(bigIntegerArrCalculateModUV[i32 & 1]), i21, sArr3);
            i6 = i32 - 1;
            short[] sArr5 = sArr3;
            sArr3 = sArr4;
            sArr4 = sArr5;
            bArrCalculateP_FF1 = bArr2;
            iCalculateB_FF1 = i22;
        }
        return Arrays.concatenate(sArr4, sArr3);
    }

    private static short[] decFF3_1(BlockCipher blockCipher, RadixConverter radixConverter, byte[] bArr, int i, int i2, int i3, short[] sArr, short[] sArr2) {
        BigInteger[] bigIntegerArrCalculateModUV = calculateModUV(BigInteger.valueOf(radixConverter.getRadix()), i2, i3);
        Arrays.reverseInPlace(sArr);
        Arrays.reverseInPlace(sArr2);
        short[] sArr3 = sArr;
        short[] sArr4 = sArr2;
        int i5 = 7;
        while (i5 >= 0) {
            i3 = i - i3;
            int i6 = i5 & 1;
            BlockCipher blockCipher2 = blockCipher;
            RadixConverter radixConverter2 = radixConverter;
            radixConverter2.toEncoding(radixConverter2.fromEncoding(sArr4).subtract(calculateY_FF3(blockCipher2, bArr, 4 - (i6 * 4), i5, sArr3, radixConverter2)).mod(bigIntegerArrCalculateModUV[1 - i6]), i3, sArr4);
            i5--;
            short[] sArr5 = sArr3;
            sArr3 = sArr4;
            sArr4 = sArr5;
            blockCipher = blockCipher2;
            radixConverter = radixConverter2;
        }
        Arrays.reverseInPlace(sArr3);
        Arrays.reverseInPlace(sArr4);
        return Arrays.concatenate(sArr3, sArr4);
    }

    public static byte[] decryptFF1(BlockCipher blockCipher, RadixConverter radixConverter, byte[] bArr, byte[] bArr2, int i, int i2) {
        checkArgs(blockCipher, true, radixConverter.getRadix(), bArr2, i, i2);
        int i3 = i2 / 2;
        int i5 = i2 - i3;
        return toByte(decFF1(blockCipher, radixConverter, bArr, i2, i3, i5, toShort(bArr2, i, i3), toShort(bArr2, i + i3, i5)));
    }

    public static short[] decryptFF1w(BlockCipher blockCipher, RadixConverter radixConverter, byte[] bArr, short[] sArr, int i, int i2) {
        checkArgs(blockCipher, true, radixConverter.getRadix(), sArr, i, i2);
        int i3 = i2 / 2;
        int i5 = i2 - i3;
        short[] sArr2 = new short[i3];
        short[] sArr3 = new short[i5];
        System.arraycopy(sArr, i, sArr2, 0, i3);
        System.arraycopy(sArr, i + i3, sArr3, 0, i5);
        return decFF1(blockCipher, radixConverter, bArr, i2, i3, i5, sArr2, sArr3);
    }

    public static byte[] decryptFF3(BlockCipher blockCipher, RadixConverter radixConverter, byte[] bArr, byte[] bArr2, int i, int i2) {
        checkArgs(blockCipher, false, radixConverter.getRadix(), bArr2, i, i2);
        if (bArr.length == 8) {
            return implDecryptFF3(blockCipher, radixConverter, bArr, bArr2, i, i2);
        }
        throw new IllegalArgumentException();
    }

    public static byte[] decryptFF3_1(BlockCipher blockCipher, RadixConverter radixConverter, byte[] bArr, byte[] bArr2, int i, int i2) {
        checkArgs(blockCipher, false, radixConverter.getRadix(), bArr2, i, i2);
        if (bArr.length == 7) {
            return implDecryptFF3(blockCipher, radixConverter, calculateTweak64_FF3_1(bArr), bArr2, i, i2);
        }
        throw new IllegalArgumentException("tweak should be 56 bits");
    }

    public static short[] decryptFF3_1w(BlockCipher blockCipher, RadixConverter radixConverter, byte[] bArr, short[] sArr, int i, int i2) {
        checkArgs(blockCipher, false, radixConverter.getRadix(), sArr, i, i2);
        if (bArr.length == 7) {
            return implDecryptFF3w(blockCipher, radixConverter, calculateTweak64_FF3_1(bArr), sArr, i, i2);
        }
        throw new IllegalArgumentException("tweak should be 56 bits");
    }

    private static short[] encFF1(BlockCipher blockCipher, RadixConverter radixConverter, byte[] bArr, int i, int i2, int i3, short[] sArr, short[] sArr2) {
        int radix = radixConverter.getRadix();
        int length = bArr.length;
        int iCalculateB_FF1 = calculateB_FF1(radix, i3);
        int i5 = (iCalculateB_FF1 + 7) & (-4);
        byte[] bArrCalculateP_FF1 = calculateP_FF1(radix, (byte) i2, i, length);
        BigInteger[] bigIntegerArrCalculateModUV = calculateModUV(BigInteger.valueOf(radix), i2, i3);
        int i6 = 0;
        short[] sArr3 = sArr;
        int i21 = i3;
        short[] sArr4 = sArr2;
        while (i6 < 10) {
            int i22 = iCalculateB_FF1;
            byte[] bArr2 = bArrCalculateP_FF1;
            int i32 = i6;
            i21 = i - i21;
            radixConverter.toEncoding(radixConverter.fromEncoding(sArr3).add(calculateY_FF1(blockCipher, bArr, i22, i5, i32, bArr2, sArr4, radixConverter)).mod(bigIntegerArrCalculateModUV[i32 & 1]), i21, sArr3);
            i6 = i32 + 1;
            short[] sArr5 = sArr3;
            sArr3 = sArr4;
            sArr4 = sArr5;
            bArrCalculateP_FF1 = bArr2;
            iCalculateB_FF1 = i22;
        }
        return Arrays.concatenate(sArr3, sArr4);
    }

    private static short[] encFF3_1(BlockCipher blockCipher, RadixConverter radixConverter, byte[] bArr, int i, int i2, int i3, short[] sArr, short[] sArr2) {
        BigInteger[] bigIntegerArrCalculateModUV = calculateModUV(BigInteger.valueOf(radixConverter.getRadix()), i2, i3);
        Arrays.reverseInPlace(sArr);
        Arrays.reverseInPlace(sArr2);
        short[] sArr3 = sArr2;
        int i5 = 0;
        while (i5 < 8) {
            i2 = i - i2;
            int i6 = i5 & 1;
            BlockCipher blockCipher2 = blockCipher;
            RadixConverter radixConverter2 = radixConverter;
            radixConverter2.toEncoding(radixConverter2.fromEncoding(sArr).add(calculateY_FF3(blockCipher2, bArr, 4 - (i6 * 4), i5, sArr3, radixConverter2)).mod(bigIntegerArrCalculateModUV[1 - i6]), i2, sArr);
            i5++;
            short[] sArr4 = sArr3;
            sArr3 = sArr;
            sArr = sArr4;
            blockCipher = blockCipher2;
            radixConverter = radixConverter2;
        }
        Arrays.reverseInPlace(sArr);
        Arrays.reverseInPlace(sArr3);
        return Arrays.concatenate(sArr, sArr3);
    }

    public static byte[] encryptFF1(BlockCipher blockCipher, RadixConverter radixConverter, byte[] bArr, byte[] bArr2, int i, int i2) {
        checkArgs(blockCipher, true, radixConverter.getRadix(), bArr2, i, i2);
        int i3 = i2 / 2;
        int i5 = i2 - i3;
        return toByte(encFF1(blockCipher, radixConverter, bArr, i2, i3, i5, toShort(bArr2, i, i3), toShort(bArr2, i + i3, i5)));
    }

    public static short[] encryptFF1w(BlockCipher blockCipher, RadixConverter radixConverter, byte[] bArr, short[] sArr, int i, int i2) {
        checkArgs(blockCipher, true, radixConverter.getRadix(), sArr, i, i2);
        int i3 = i2 / 2;
        int i5 = i2 - i3;
        short[] sArr2 = new short[i3];
        short[] sArr3 = new short[i5];
        System.arraycopy(sArr, i, sArr2, 0, i3);
        System.arraycopy(sArr, i + i3, sArr3, 0, i5);
        return encFF1(blockCipher, radixConverter, bArr, i2, i3, i5, sArr2, sArr3);
    }

    public static byte[] encryptFF3(BlockCipher blockCipher, RadixConverter radixConverter, byte[] bArr, byte[] bArr2, int i, int i2) {
        checkArgs(blockCipher, false, radixConverter.getRadix(), bArr2, i, i2);
        if (bArr.length == 8) {
            return implEncryptFF3(blockCipher, radixConverter, bArr, bArr2, i, i2);
        }
        throw new IllegalArgumentException();
    }

    public static byte[] encryptFF3_1(BlockCipher blockCipher, RadixConverter radixConverter, byte[] bArr, byte[] bArr2, int i, int i2) {
        checkArgs(blockCipher, false, radixConverter.getRadix(), bArr2, i, i2);
        if (bArr.length == 7) {
            return encryptFF3(blockCipher, radixConverter, calculateTweak64_FF3_1(bArr), bArr2, i, i2);
        }
        throw new IllegalArgumentException("tweak should be 56 bits");
    }

    public static short[] encryptFF3_1w(BlockCipher blockCipher, RadixConverter radixConverter, byte[] bArr, short[] sArr, int i, int i2) {
        checkArgs(blockCipher, false, radixConverter.getRadix(), sArr, i, i2);
        if (bArr.length == 7) {
            return encryptFF3w(blockCipher, radixConverter, calculateTweak64_FF3_1(bArr), sArr, i, i2);
        }
        throw new IllegalArgumentException("tweak should be 56 bits");
    }

    public static short[] encryptFF3w(BlockCipher blockCipher, RadixConverter radixConverter, byte[] bArr, short[] sArr, int i, int i2) {
        checkArgs(blockCipher, false, radixConverter.getRadix(), sArr, i, i2);
        if (bArr.length == 8) {
            return implEncryptFF3w(blockCipher, radixConverter, bArr, sArr, i, i2);
        }
        throw new IllegalArgumentException();
    }

    public static byte[] implDecryptFF3(BlockCipher blockCipher, RadixConverter radixConverter, byte[] bArr, byte[] bArr2, int i, int i2) {
        int i3 = i2 / 2;
        int i5 = i2 - i3;
        return toByte(decFF3_1(blockCipher, radixConverter, bArr, i2, i3, i5, toShort(bArr2, i, i5), toShort(bArr2, i + i5, i3)));
    }

    public static short[] implDecryptFF3w(BlockCipher blockCipher, RadixConverter radixConverter, byte[] bArr, short[] sArr, int i, int i2) {
        int i3 = i2 / 2;
        int i5 = i2 - i3;
        short[] sArr2 = new short[i5];
        short[] sArr3 = new short[i3];
        System.arraycopy(sArr, i, sArr2, 0, i5);
        System.arraycopy(sArr, i + i5, sArr3, 0, i3);
        return decFF3_1(blockCipher, radixConverter, bArr, i2, i3, i5, sArr2, sArr3);
    }

    public static byte[] implEncryptFF3(BlockCipher blockCipher, RadixConverter radixConverter, byte[] bArr, byte[] bArr2, int i, int i2) {
        int i3 = i2 / 2;
        int i5 = i2 - i3;
        return toByte(encFF3_1(blockCipher, radixConverter, bArr, i2, i3, i5, toShort(bArr2, i, i5), toShort(bArr2, i + i5, i3)));
    }

    public static short[] implEncryptFF3w(BlockCipher blockCipher, RadixConverter radixConverter, byte[] bArr, short[] sArr, int i, int i2) {
        int i3 = i2 / 2;
        int i5 = i2 - i3;
        short[] sArr2 = new short[i5];
        short[] sArr3 = new short[i3];
        System.arraycopy(sArr, i, sArr2, 0, i5);
        System.arraycopy(sArr, i + i5, sArr3, 0, i3);
        return encFF3_1(blockCipher, radixConverter, bArr, i2, i3, i5, sArr2, sArr3);
    }

    public static BigInteger num(byte[] bArr, int i, int i2) {
        return new BigInteger(1, Arrays.copyOfRange(bArr, i, i2 + i));
    }

    public static byte[] prf(BlockCipher blockCipher, byte[] bArr) {
        if (bArr.length % 16 != 0) {
            throw new IllegalArgumentException();
        }
        int length = bArr.length / 16;
        byte[] bArr2 = new byte[16];
        for (int i = 0; i < length; i++) {
            Bytes.xorTo(16, bArr, i * 16, bArr2, 0);
            blockCipher.processBlock(bArr2, 0, bArr2, 0);
        }
        return bArr2;
    }

    private static byte[] toByte(short[] sArr) {
        int length = sArr.length;
        byte[] bArr = new byte[length];
        for (int i = 0; i != length; i++) {
            bArr[i] = (byte) sArr[i];
        }
        return bArr;
    }

    private static short[] toShort(byte[] bArr, int i, int i2) {
        short[] sArr = new short[i2];
        for (int i3 = 0; i3 != i2; i3++) {
            sArr[i3] = (short) (bArr[i + i3] & UnsignedBytes.MAX_VALUE);
        }
        return sArr;
    }

    public static void checkArgs(BlockCipher blockCipher, boolean z, int i, short[] sArr, int i2, int i3) {
        checkCipher(blockCipher);
        if (i < 2 || i > 65536) {
            throw new IllegalArgumentException();
        }
        checkData(z, i, sArr, i2, i3);
    }

    public static void checkData(boolean z, int i, short[] sArr, int i2, int i3) {
        checkLength(z, i, i3);
        for (int i5 = 0; i5 < i3; i5++) {
            if ((sArr[i2 + i5] & HPKE.aead_EXPORT_ONLY) >= i) {
                throw new IllegalArgumentException("input data outside of radix");
            }
        }
    }
}
