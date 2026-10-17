package org.bouncycastle.crypto.hash2curve;

import java.math.BigInteger;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes14.dex */
public class H2cUtils {
    public static BigInteger cmov(BigInteger bigInteger, BigInteger bigInteger2, boolean z) {
        return z ? bigInteger2 : bigInteger;
    }

    private static BigInteger getFirstNonSquare(BigInteger bigInteger) {
        BigInteger bigInteger2 = new BigInteger("1000");
        BigInteger bigIntegerAdd = BigInteger.ONE;
        while (isSquare(bigIntegerAdd, bigInteger)) {
            bigIntegerAdd = bigIntegerAdd.add(BigInteger.ONE);
            if (bigIntegerAdd.compareTo(bigInteger2) > 0) {
                throw new RuntimeException("Illegal Field. No non square value can be found");
            }
        }
        return bigIntegerAdd;
    }

    public static byte[] i2osp(int i, int i2) {
        byte[] bArrConcatenate = (byte[]) new BigInteger(String.valueOf(i)).toByteArray().clone();
        if (bArrConcatenate.length > 1 && bArrConcatenate[0] == 0) {
            bArrConcatenate = Arrays.copyOfRange(bArrConcatenate, 1, bArrConcatenate.length);
        }
        if (bArrConcatenate.length > i2) {
            throw new IllegalArgumentException("Value require more bytes than the assigned length size");
        }
        if (bArrConcatenate.length < i2) {
            for (int length = bArrConcatenate.length; length < i2; length++) {
                bArrConcatenate = Arrays.concatenate(new byte[]{0}, bArrConcatenate);
            }
        }
        return bArrConcatenate;
    }

    public static BigInteger inv0(BigInteger bigInteger, BigInteger bigInteger2) {
        return bigInteger.modInverse(bigInteger2);
    }

    public static boolean isSquare(BigInteger bigInteger, BigInteger bigInteger2) {
        BigInteger bigInteger3 = BigInteger.ONE;
        BigInteger bigIntegerModPow = bigInteger.modPow(bigInteger2.subtract(bigInteger3).divide(BigInteger.valueOf(2L)), bigInteger2);
        return bigIntegerModPow.equals(bigInteger3) || bigIntegerModPow.equals(BigInteger.ZERO);
    }

    public static BigInteger os2ip(byte[] bArr) {
        return new BigInteger(Arrays.concatenate(new byte[]{0}, bArr));
    }

    private static void requireNonNull(Object obj2, String str) {
        if (obj2 == null) {
            throw new NullPointerException(str);
        }
    }

    public static int sgn0(BigInteger bigInteger, ECCurve eCCurve) {
        if (eCCurve.getField().getDimension() == 1) {
            return bigInteger.intValue() & 1;
        }
        throw new IllegalArgumentException("Extension fields must be 1 for supported elliptic curves");
    }

    public static BigInteger sqrt(BigInteger bigInteger, BigInteger bigInteger2) {
        BigInteger bigInteger3 = BigInteger.ONE;
        int lowestSetBit = bigInteger2.subtract(bigInteger3).getLowestSetBit();
        BigInteger bigIntegerDivide = bigInteger2.subtract(bigInteger3).divide(BigInteger.valueOf(2L).pow(lowestSetBit));
        BigInteger bigIntegerDivide2 = bigIntegerDivide.subtract(bigInteger3).divide(BigInteger.valueOf(2L));
        BigInteger bigIntegerModPow = getFirstNonSquare(bigInteger2).modPow(bigIntegerDivide, bigInteger2);
        BigInteger bigIntegerModPow2 = bigInteger.modPow(bigIntegerDivide2, bigInteger2);
        BigInteger bigIntegerMod = bigIntegerModPow2.multiply(bigIntegerModPow2).multiply(bigInteger).mod(bigInteger2);
        BigInteger bigIntegerMod2 = bigIntegerModPow2.multiply(bigInteger).mod(bigInteger2);
        while (lowestSetBit >= 2) {
            BigInteger bigIntegerMod3 = bigIntegerMod;
            for (int i = 1; i <= lowestSetBit - 2; i++) {
                bigIntegerMod3 = bigIntegerMod3.multiply(bigIntegerMod3).mod(bigInteger2);
            }
            boolean zEquals = bigIntegerMod3.equals(BigInteger.ONE);
            bigIntegerMod2 = cmov(bigIntegerMod2.multiply(bigIntegerModPow).mod(bigInteger2), bigIntegerMod2, zEquals);
            bigIntegerModPow = bigIntegerModPow.multiply(bigIntegerModPow).mod(bigInteger2);
            bigIntegerMod = cmov(bigIntegerMod.multiply(bigIntegerModPow).mod(bigInteger2), bigIntegerMod, zEquals);
            lowestSetBit--;
        }
        return bigIntegerMod2;
    }

    public static byte[] xor(byte[] bArr, byte[] bArr2) {
        requireNonNull(bArr, "XOR argument must not be null");
        requireNonNull(bArr2, "XOR argument must not be null");
        if (bArr.length != bArr2.length) {
            throw new IllegalArgumentException("XOR operation on parameters of different lengths");
        }
        byte[] bArr3 = new byte[bArr.length];
        for (int i = 0; i < bArr.length; i++) {
            bArr3[i] = (byte) (bArr[i] ^ bArr2[i]);
        }
        return bArr3;
    }
}
