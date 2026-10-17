package org.bouncycastle.crypto.encodings;

import com.google.common.primitives.UnsignedBytes;
import ehe.n;
import java.math.BigInteger;
import org.bouncycastle.crypto.AsymmetricBlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.crypto.params.RSAKeyParameters;

/* JADX INFO: loaded from: classes14.dex */
public class ISO9796d1Encoding implements AsymmetricBlockCipher {
    private int bitSize;
    private AsymmetricBlockCipher engine;
    private boolean forEncryption;
    private BigInteger modulus;
    private int padBits = 0;
    private static final BigInteger SIXTEEN = BigInteger.valueOf(16);
    private static final BigInteger SIX = BigInteger.valueOf(6);
    private static byte[] shadows = {14, 3, 5, 8, 9, 4, 2, 15, 0, 13, 11, 6, 7, 10, 12, 1};
    private static byte[] inverse = {8, 15, 6, 1, 5, 2, 11, 12, 3, 4, 13, 10, 14, 9, 0, 7};

    public ISO9796d1Encoding(AsymmetricBlockCipher asymmetricBlockCipher) {
        this.engine = asymmetricBlockCipher;
    }

    private static byte[] convertOutputDecryptOnly(BigInteger bigInteger) {
        byte[] byteArray = bigInteger.toByteArray();
        if (byteArray[0] != 0) {
            return byteArray;
        }
        int length = byteArray.length - 1;
        byte[] bArr = new byte[length];
        System.arraycopy(byteArray, 1, bArr, 0, length);
        return bArr;
    }

    private byte[] decodeBlock(byte[] bArr, int i, int i2) throws InvalidCipherTextException {
        byte[] bArrProcessBlock = this.engine.processBlock(bArr, i, i2);
        int i3 = (this.bitSize + 13) / 16;
        BigInteger bigInteger = new BigInteger(1, bArrProcessBlock);
        BigInteger bigInteger2 = SIXTEEN;
        BigInteger bigIntegerMod = bigInteger.mod(bigInteger2);
        BigInteger bigInteger3 = SIX;
        if (!bigIntegerMod.equals(bigInteger3)) {
            if (!this.modulus.subtract(bigInteger).mod(bigInteger2).equals(bigInteger3)) {
                throw new InvalidCipherTextException("resulting integer iS or (modulus - iS) is not congruent to 6 mod 16");
            }
            bigInteger = this.modulus.subtract(bigInteger);
        }
        byte[] bArrConvertOutputDecryptOnly = convertOutputDecryptOnly(bigInteger);
        if ((bArrConvertOutputDecryptOnly[bArrConvertOutputDecryptOnly.length - 1] & 15) != 6) {
            throw new InvalidCipherTextException("invalid forcing byte in block");
        }
        bArrConvertOutputDecryptOnly[bArrConvertOutputDecryptOnly.length - 1] = (byte) (((bArrConvertOutputDecryptOnly[bArrConvertOutputDecryptOnly.length - 1] & UnsignedBytes.MAX_VALUE) >>> 4) | (inverse[(bArrConvertOutputDecryptOnly[bArrConvertOutputDecryptOnly.length - 2] & UnsignedBytes.MAX_VALUE) >> 4] << 4));
        byte[] bArr2 = shadows;
        byte b4 = bArrConvertOutputDecryptOnly[1];
        byte b5 = (byte) (bArr2[b4 & 15] | (bArr2[(b4 & UnsignedBytes.MAX_VALUE) >>> 4] << 4));
        bArrConvertOutputDecryptOnly[0] = b5;
        int i5 = 1;
        int i6 = 0;
        boolean z = false;
        for (int length = bArrConvertOutputDecryptOnly.length - 1; length >= bArrConvertOutputDecryptOnly.length - (i3 * 2); length -= 2) {
            byte[] bArr3 = shadows;
            byte b7 = bArrConvertOutputDecryptOnly[length];
            int i21 = bArr3[b7 & 15] | (bArr3[(b7 & UnsignedBytes.MAX_VALUE) >>> 4] << 4);
            int i22 = length - 1;
            byte b13 = bArrConvertOutputDecryptOnly[i22];
            if (((b13 ^ i21) & 255) != 0) {
                if (z) {
                    throw new InvalidCipherTextException("invalid tsums in block");
                }
                i5 = (b13 ^ i21) & 255;
                z = true;
                i6 = i22;
            }
        }
        bArrConvertOutputDecryptOnly[i6] = 0;
        int length2 = (bArrConvertOutputDecryptOnly.length - i6) / 2;
        byte[] bArr4 = new byte[length2];
        for (int i32 = 0; i32 < length2; i32++) {
            bArr4[i32] = bArrConvertOutputDecryptOnly[n.a(i32, 2, i6, 1)];
        }
        this.padBits = i5 - 1;
        return bArr4;
    }

    private byte[] encodeBlock(byte[] bArr, int i, int i2) throws InvalidCipherTextException {
        int i3 = this.bitSize;
        int i5 = (i3 + 7) / 8;
        byte[] bArr2 = new byte[i5];
        int i6 = 1;
        int i21 = this.padBits + 1;
        int i22 = (i3 + 13) / 16;
        int i32 = 0;
        while (i32 < i22) {
            if (i32 > i22 - i2) {
                int i33 = i22 - i32;
                System.arraycopy(bArr, (i + i2) - i33, bArr2, i5 - i22, i33);
            } else {
                System.arraycopy(bArr, i, bArr2, i5 - (i32 + i2), i2);
            }
            i32 += i2;
        }
        for (int i43 = i5 - (i22 * 2); i43 != i5; i43 += 2) {
            byte b4 = bArr2[(i43 / 2) + (i5 - i22)];
            byte[] bArr3 = shadows;
            bArr2[i43] = (byte) (bArr3[b4 & 15] | (bArr3[(b4 & UnsignedBytes.MAX_VALUE) >>> 4] << 4));
            bArr2[i43 + 1] = b4;
        }
        int i59 = i5 - (i2 * 2);
        bArr2[i59] = (byte) (bArr2[i59] ^ i21);
        int i66 = i5 - 1;
        bArr2[i66] = (byte) ((bArr2[i66] << 4) | 6);
        int i74 = 8 - ((this.bitSize - 1) % 8);
        if (i74 != 8) {
            byte b5 = (byte) (bArr2[0] & (255 >>> i74));
            bArr2[0] = b5;
            bArr2[0] = (byte) ((128 >>> i74) | b5);
            i6 = 0;
        } else {
            bArr2[0] = 0;
            bArr2[1] = (byte) (bArr2[1] | 128);
        }
        return this.engine.processBlock(bArr2, i6, i5 - i6);
    }

    @Override // org.bouncycastle.crypto.AsymmetricBlockCipher
    public int getInputBlockSize() {
        int inputBlockSize = this.engine.getInputBlockSize();
        return this.forEncryption ? (inputBlockSize + 1) / 2 : inputBlockSize;
    }

    @Override // org.bouncycastle.crypto.AsymmetricBlockCipher
    public int getOutputBlockSize() {
        int outputBlockSize = this.engine.getOutputBlockSize();
        return this.forEncryption ? outputBlockSize : (outputBlockSize + 1) / 2;
    }

    public int getPadBits() {
        return this.padBits;
    }

    public AsymmetricBlockCipher getUnderlyingCipher() {
        return this.engine;
    }

    @Override // org.bouncycastle.crypto.AsymmetricBlockCipher
    public void init(boolean z, CipherParameters cipherParameters) {
        RSAKeyParameters rSAKeyParameters = cipherParameters instanceof ParametersWithRandom ? (RSAKeyParameters) ((ParametersWithRandom) cipherParameters).getParameters() : (RSAKeyParameters) cipherParameters;
        this.engine.init(z, cipherParameters);
        BigInteger modulus = rSAKeyParameters.getModulus();
        this.modulus = modulus;
        this.bitSize = modulus.bitLength();
        this.forEncryption = z;
    }

    @Override // org.bouncycastle.crypto.AsymmetricBlockCipher
    public byte[] processBlock(byte[] bArr, int i, int i2) throws InvalidCipherTextException {
        return this.forEncryption ? encodeBlock(bArr, i, i2) : decodeBlock(bArr, i, i2);
    }

    public void setPadBits(int i) {
        if (i > 7) {
            throw new IllegalArgumentException("padBits > 7");
        }
        this.padBits = i;
    }
}
