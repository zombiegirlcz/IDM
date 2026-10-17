package org.bouncycastle.crypto.modes;

import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;

/* JADX INFO: loaded from: classes14.dex */
public class OpenPGPCFBBlockCipher implements BlockCipher {
    private byte[] FR;
    private byte[] FRE;
    private byte[] IV;
    private int blockSize;
    private BlockCipher cipher;
    private int count;
    private boolean forEncryption;

    public OpenPGPCFBBlockCipher(BlockCipher blockCipher) {
        this.cipher = blockCipher;
        int blockSize = blockCipher.getBlockSize();
        this.blockSize = blockSize;
        this.IV = new byte[blockSize];
        this.FR = new byte[blockSize];
        this.FRE = new byte[blockSize];
    }

    private int decryptBlock(byte[] bArr, int i, byte[] bArr2, int i2) throws IllegalStateException, DataLengthException {
        int i3;
        int i5 = this.blockSize;
        if (i + i5 > bArr.length) {
            throw new DataLengthException("input buffer too short");
        }
        if (i2 + i5 > bArr2.length) {
            throw new OutputLengthException("output buffer too short");
        }
        int i6 = this.count;
        int i21 = 2;
        int i22 = 0;
        if (i6 > i5) {
            byte b4 = bArr[i];
            this.FR[i5 - 2] = b4;
            bArr2[i2] = encryptByte(b4, i5 - 2);
            byte b5 = bArr[i + 1];
            byte[] bArr3 = this.FR;
            int i32 = this.blockSize;
            bArr3[i32 - 1] = b5;
            bArr2[i2 + 1] = encryptByte(b5, i32 - 1);
            this.cipher.processBlock(this.FR, 0, this.FRE, 0);
            while (i21 < this.blockSize) {
                byte b7 = bArr[i + i21];
                int i33 = i21 - 2;
                this.FR[i33] = b7;
                bArr2[i2 + i21] = encryptByte(b7, i33);
                i21++;
            }
        } else {
            if (i6 != 0) {
                if (i6 == i5) {
                    this.cipher.processBlock(this.FR, 0, this.FRE, 0);
                    byte b13 = bArr[i];
                    byte b15 = bArr[i + 1];
                    bArr2[i2] = encryptByte(b13, 0);
                    bArr2[i2 + 1] = encryptByte(b15, 1);
                    byte[] bArr4 = this.FR;
                    System.arraycopy(bArr4, 2, bArr4, 0, this.blockSize - 2);
                    byte[] bArr5 = this.FR;
                    int i43 = this.blockSize;
                    bArr5[i43 - 2] = b13;
                    bArr5[i43 - 1] = b15;
                    this.cipher.processBlock(bArr5, 0, this.FRE, 0);
                    while (true) {
                        i3 = this.blockSize;
                        if (i21 >= i3) {
                            break;
                        }
                        byte b17 = bArr[i + i21];
                        int i59 = i21 - 2;
                        this.FR[i59] = b17;
                        bArr2[i2 + i21] = encryptByte(b17, i59);
                        i21++;
                    }
                }
            } else {
                this.cipher.processBlock(this.FR, 0, this.FRE, 0);
                while (true) {
                    i3 = this.blockSize;
                    if (i22 >= i3) {
                        break;
                    }
                    int i66 = i + i22;
                    this.FR[i22] = bArr[i66];
                    bArr2[i2 + i22] = encryptByte(bArr[i66], i22);
                    i22++;
                }
            }
            this.count += i3;
        }
        return this.blockSize;
    }

    private int encryptBlock(byte[] bArr, int i, byte[] bArr2, int i2) throws IllegalStateException, DataLengthException {
        int i3;
        int i5 = this.blockSize;
        if (i + i5 > bArr.length) {
            throw new DataLengthException("input buffer too short");
        }
        if (i2 + i5 > bArr2.length) {
            throw new OutputLengthException("output buffer too short");
        }
        int i6 = this.count;
        int i21 = 2;
        int i22 = 0;
        if (i6 > i5) {
            byte[] bArr3 = this.FR;
            int i32 = i5 - 2;
            byte bEncryptByte = encryptByte(bArr[i], i5 - 2);
            bArr2[i2] = bEncryptByte;
            bArr3[i32] = bEncryptByte;
            byte[] bArr4 = this.FR;
            int i33 = this.blockSize;
            int i43 = i33 - 1;
            byte bEncryptByte2 = encryptByte(bArr[i + 1], i33 - 1);
            bArr2[i2 + 1] = bEncryptByte2;
            bArr4[i43] = bEncryptByte2;
            this.cipher.processBlock(this.FR, 0, this.FRE, 0);
            while (i21 < this.blockSize) {
                byte[] bArr5 = this.FR;
                int i59 = i21 - 2;
                byte bEncryptByte3 = encryptByte(bArr[i + i21], i59);
                bArr2[i2 + i21] = bEncryptByte3;
                bArr5[i59] = bEncryptByte3;
                i21++;
            }
        } else {
            if (i6 != 0) {
                if (i6 == i5) {
                    this.cipher.processBlock(this.FR, 0, this.FRE, 0);
                    bArr2[i2] = encryptByte(bArr[i], 0);
                    bArr2[i2 + 1] = encryptByte(bArr[i + 1], 1);
                    byte[] bArr6 = this.FR;
                    System.arraycopy(bArr6, 2, bArr6, 0, this.blockSize - 2);
                    System.arraycopy(bArr2, i2, this.FR, this.blockSize - 2, 2);
                    this.cipher.processBlock(this.FR, 0, this.FRE, 0);
                    while (true) {
                        i3 = this.blockSize;
                        if (i21 >= i3) {
                            break;
                        }
                        byte[] bArr7 = this.FR;
                        int i66 = i21 - 2;
                        byte bEncryptByte4 = encryptByte(bArr[i + i21], i66);
                        bArr2[i2 + i21] = bEncryptByte4;
                        bArr7[i66] = bEncryptByte4;
                        i21++;
                    }
                }
            } else {
                this.cipher.processBlock(this.FR, 0, this.FRE, 0);
                while (true) {
                    i3 = this.blockSize;
                    if (i22 >= i3) {
                        break;
                    }
                    byte[] bArr8 = this.FR;
                    byte bEncryptByte5 = encryptByte(bArr[i + i22], i22);
                    bArr2[i2 + i22] = bEncryptByte5;
                    bArr8[i22] = bEncryptByte5;
                    i22++;
                }
            }
            this.count += i3;
        }
        return this.blockSize;
    }

    private byte encryptByte(byte b4, int i) {
        return (byte) (b4 ^ this.FRE[i]);
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public String getAlgorithmName() {
        return this.cipher.getAlgorithmName() + "/OpenPGPCFB";
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int getBlockSize() {
        return this.cipher.getBlockSize();
    }

    public BlockCipher getUnderlyingCipher() {
        return this.cipher;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void init(boolean z, CipherParameters cipherParameters) throws IllegalArgumentException {
        this.forEncryption = z;
        reset();
        this.cipher.init(true, cipherParameters);
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i, byte[] bArr2, int i2) throws IllegalStateException, DataLengthException {
        return this.forEncryption ? encryptBlock(bArr, i, bArr2, i2) : decryptBlock(bArr, i, bArr2, i2);
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void reset() {
        this.count = 0;
        byte[] bArr = this.IV;
        byte[] bArr2 = this.FR;
        System.arraycopy(bArr, 0, bArr2, 0, bArr2.length);
        this.cipher.reset();
    }
}
