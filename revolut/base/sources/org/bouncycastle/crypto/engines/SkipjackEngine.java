package org.bouncycastle.crypto.engines;

import com.google.common.primitives.UnsignedBytes;
import okl.m;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicePurpose;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.constraints.DefaultServiceProperties;
import org.bouncycastle.crypto.params.KeyParameter;

/* JADX INFO: loaded from: classes14.dex */
public class SkipjackEngine implements BlockCipher {
    static final int BLOCK_SIZE = 8;
    static short[] ftable = {163, 215, 9, 131, 248, 72, 246, 244, 179, 33, 21, 120, 153, 177, 175, 249, 231, 45, 77, 138, 206, 76, 202, 46, 82, 149, 217, 30, 78, 56, 68, 40, 10, 223, 2, 160, 23, 241, 96, 104, 18, 183, 122, 195, 233, 250, 61, 83, 150, 132, 107, 186, 242, 99, 154, 25, 124, 174, 229, 245, 247, 22, 106, 162, 57, 182, 123, 15, 193, 147, 129, 27, 238, 180, 26, 234, 208, 145, 47, 184, 85, 185, 218, 133, 63, 65, 191, 224, 90, 88, 128, 95, 102, 11, 216, 144, 53, 213, 192, 167, 51, 6, 101, 105, 69, 0, 148, 86, 109, 152, 155, 118, 151, 252, 178, 194, 176, 254, 219, 32, 225, 235, 214, 228, 221, 71, 74, 29, 66, 237, 158, 110, 73, 60, 205, 67, 39, 210, 7, 212, 222, 199, 103, 24, 137, 203, 48, 31, 141, 198, 143, 170, 200, 116, 220, 201, 93, 92, 49, 164, 112, 136, 97, 44, 159, 13, 43, 135, 80, 130, 84, 100, 38, 125, 3, 64, 52, 75, 28, 115, 209, 196, 253, 59, 204, 251, 127, 171, 230, 62, 91, 165, 173, 4, 35, 156, 20, 81, 34, 240, 41, 121, 113, 126, 255, 140, 14, 226, 12, 239, 188, 114, 117, 111, 55, 161, 236, 211, 142, 98, 139, 134, 16, 232, 8, 119, 17, 190, 146, 79, 36, 197, 50, 54, 157, 207, 243, 166, 187, 172, 94, 108, 169, 19, 87, 37, 181, 227, 189, 168, 58, 1, 5, 89, 42, 70};
    private boolean encrypting;
    private int[] key0;
    private int[] key1;
    private int[] key2;
    private int[] key3;

    public SkipjackEngine() {
        CryptoServicesRegistrar.checkConstraints(new DefaultServiceProperties(getAlgorithmName(), 80));
    }

    private int g(int i, int i2) {
        int i3 = (i2 >> 8) & 255;
        int i5 = i2 & 255;
        short[] sArr = ftable;
        int i6 = i3 ^ sArr[this.key0[i] ^ i5];
        int i21 = i5 ^ sArr[this.key1[i] ^ i6];
        int i22 = i6 ^ sArr[this.key2[i] ^ i21];
        return (i22 << 8) + (sArr[this.key3[i] ^ i22] ^ i21);
    }

    private CryptoServicePurpose getPurpose() {
        return this.key0 == null ? CryptoServicePurpose.ANY : this.encrypting ? CryptoServicePurpose.ENCRYPTION : CryptoServicePurpose.DECRYPTION;
    }

    private int h(int i, int i2) {
        int i3 = i2 & 255;
        int i5 = (i2 >> 8) & 255;
        short[] sArr = ftable;
        int i6 = i3 ^ sArr[this.key3[i] ^ i5];
        int i21 = i5 ^ sArr[this.key2[i] ^ i6];
        int i22 = i6 ^ sArr[this.key1[i] ^ i21];
        return ((sArr[this.key0[i] ^ i22] ^ i21) << 8) + i22;
    }

    public int decryptBlock(byte[] bArr, int i, byte[] bArr2, int i2) {
        int i3 = (bArr[i] << 8) + (bArr[i + 1] & UnsignedBytes.MAX_VALUE);
        int i5 = (bArr[i + 2] << 8) + (bArr[i + 3] & UnsignedBytes.MAX_VALUE);
        int i6 = (bArr[i + 4] << 8) + (bArr[i + 5] & UnsignedBytes.MAX_VALUE);
        int i21 = (bArr[i + 6] << 8) + (bArr[i + 7] & UnsignedBytes.MAX_VALUE);
        int i22 = 31;
        for (int i32 = 0; i32 < 2; i32++) {
            int i33 = 0;
            while (i33 < 8) {
                int iH = h(i22, i5);
                int i43 = (i6 ^ iH) ^ (i22 + 1);
                i22--;
                i33++;
                int i59 = i21;
                i21 = i3;
                i3 = iH;
                i5 = i43;
                i6 = i59;
            }
            int i66 = 0;
            while (i66 < 8) {
                int i74 = (i3 ^ i5) ^ (i22 + 1);
                int iH2 = h(i22, i5);
                i22--;
                i66++;
                int i92 = i21;
                i21 = i74;
                i3 = iH2;
                i5 = i6;
                i6 = i92;
            }
        }
        bArr2[i2] = (byte) (i3 >> 8);
        bArr2[i2 + 1] = (byte) i3;
        bArr2[i2 + 2] = (byte) (i5 >> 8);
        bArr2[i2 + 3] = (byte) i5;
        bArr2[i2 + 4] = (byte) (i6 >> 8);
        bArr2[i2 + 5] = (byte) i6;
        bArr2[i2 + 6] = (byte) (i21 >> 8);
        bArr2[i2 + 7] = (byte) i21;
        return 8;
    }

    public int encryptBlock(byte[] bArr, int i, byte[] bArr2, int i2) {
        int i3 = (bArr[i] << 8) + (bArr[i + 1] & UnsignedBytes.MAX_VALUE);
        int iG = (bArr[i + 2] << 8) + (bArr[i + 3] & UnsignedBytes.MAX_VALUE);
        int i5 = (bArr[i + 4] << 8) + (bArr[i + 5] & UnsignedBytes.MAX_VALUE);
        int i6 = (bArr[i + 6] << 8) + (bArr[i + 7] & UnsignedBytes.MAX_VALUE);
        int i21 = 0;
        for (int i22 = 0; i22 < 2; i22++) {
            int i32 = 0;
            while (i32 < 8) {
                int iG2 = g(i21, i3);
                i21++;
                i32++;
                int i33 = iG;
                iG = iG2;
                i3 = (i6 ^ iG2) ^ i21;
                i6 = i5;
                i5 = i33;
            }
            int i43 = 0;
            while (i43 < 8) {
                int i59 = i21 + 1;
                int i66 = (iG ^ i3) ^ i59;
                i43++;
                iG = g(i21, i3);
                i3 = i6;
                i6 = i5;
                i5 = i66;
                i21 = i59;
            }
        }
        bArr2[i2] = (byte) (i3 >> 8);
        bArr2[i2 + 1] = (byte) i3;
        bArr2[i2 + 2] = (byte) (iG >> 8);
        bArr2[i2 + 3] = (byte) iG;
        bArr2[i2 + 4] = (byte) (i5 >> 8);
        bArr2[i2 + 5] = (byte) i5;
        bArr2[i2 + 6] = (byte) (i6 >> 8);
        bArr2[i2 + 7] = (byte) i6;
        return 8;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public String getAlgorithmName() {
        return "SKIPJACK";
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int getBlockSize() {
        return 8;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void init(boolean z, CipherParameters cipherParameters) {
        if (!(cipherParameters instanceof KeyParameter)) {
            throw new IllegalArgumentException(m.l("invalid parameter passed to SKIPJACK init - ", cipherParameters));
        }
        byte[] key = ((KeyParameter) cipherParameters).getKey();
        this.encrypting = z;
        this.key0 = new int[32];
        this.key1 = new int[32];
        this.key2 = new int[32];
        this.key3 = new int[32];
        for (int i = 0; i < 32; i++) {
            int i2 = i * 4;
            this.key0[i] = key[i2 % 10] & UnsignedBytes.MAX_VALUE;
            this.key1[i] = key[(i2 + 1) % 10] & UnsignedBytes.MAX_VALUE;
            this.key2[i] = key[(i2 + 2) % 10] & UnsignedBytes.MAX_VALUE;
            this.key3[i] = key[(i2 + 3) % 10] & UnsignedBytes.MAX_VALUE;
        }
        CryptoServicesRegistrar.checkConstraints(new DefaultServiceProperties(getAlgorithmName(), 80, cipherParameters, getPurpose()));
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i, byte[] bArr2, int i2) {
        if (this.key1 == null) {
            throw new IllegalStateException("SKIPJACK engine not initialised");
        }
        if (i + 8 > bArr.length) {
            throw new DataLengthException("input buffer too short");
        }
        if (i2 + 8 > bArr2.length) {
            throw new OutputLengthException("output buffer too short");
        }
        if (this.encrypting) {
            encryptBlock(bArr, i, bArr2, i2);
            return 8;
        }
        decryptBlock(bArr, i, bArr2, i2);
        return 8;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void reset() {
    }
}
