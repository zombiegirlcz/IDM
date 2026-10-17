package org.bouncycastle.crypto.modes;

import a10.b;
import ehe.n;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.params.ParametersWithIV;

/* JADX INFO: loaded from: classes14.dex */
public class PGPCFBBlockCipher implements BlockCipher {
    private byte[] FR;
    private byte[] FRE;
    private byte[] IV;
    private int blockSize;
    private BlockCipher cipher;
    private int count;
    private boolean forEncryption;
    private boolean inlineIv;
    private byte[] tmp;

    public PGPCFBBlockCipher(BlockCipher blockCipher, boolean z) {
        this.cipher = blockCipher;
        this.inlineIv = z;
        int blockSize = blockCipher.getBlockSize();
        this.blockSize = blockSize;
        this.IV = new byte[blockSize];
        this.FR = new byte[blockSize];
        this.FRE = new byte[blockSize];
        this.tmp = new byte[blockSize];
    }

    private int decryptBlock(byte[] bArr, int i, byte[] bArr2, int i2) throws IllegalStateException, DataLengthException {
        int i3 = this.blockSize;
        if (i + i3 > bArr.length) {
            throw new DataLengthException("input buffer too short");
        }
        if (i3 + i2 > bArr2.length) {
            throw new OutputLengthException("output buffer too short");
        }
        int i5 = 0;
        this.cipher.processBlock(this.FR, 0, this.FRE, 0);
        for (int i6 = 0; i6 < this.blockSize; i6++) {
            bArr2[i2 + i6] = encryptByte(bArr[i + i6], i6);
        }
        while (true) {
            int i21 = this.blockSize;
            if (i5 >= i21) {
                return i21;
            }
            this.FR[i5] = bArr[i + i5];
            i5++;
        }
    }

    private int decryptBlockWithIV(byte[] bArr, int i, byte[] bArr2, int i2) throws IllegalStateException, DataLengthException {
        int i3;
        int i5 = this.blockSize;
        if (i + i5 > bArr.length) {
            throw new DataLengthException("input buffer too short");
        }
        if (i2 + i5 > bArr2.length) {
            throw new OutputLengthException("output buffer too short");
        }
        int i6 = this.count;
        if (i6 == 0) {
            for (int i21 = 0; i21 < this.blockSize; i21++) {
                this.FR[i21] = bArr[i + i21];
            }
            this.cipher.processBlock(this.FR, 0, this.FRE, 0);
            this.count += this.blockSize;
            return 0;
        }
        if (i6 != i5) {
            if (i6 >= i5 + 2) {
                System.arraycopy(bArr, i, this.tmp, 0, i5);
                bArr2[i2] = encryptByte(this.tmp[0], this.blockSize - 2);
                bArr2[i2 + 1] = encryptByte(this.tmp[1], this.blockSize - 1);
                System.arraycopy(this.tmp, 0, this.FR, this.blockSize - 2, 2);
                this.cipher.processBlock(this.FR, 0, this.FRE, 0);
                int i22 = 0;
                while (true) {
                    i3 = this.blockSize;
                    if (i22 >= i3 - 2) {
                        break;
                    }
                    bArr2[i2 + i22 + 2] = encryptByte(this.tmp[i22 + 2], i22);
                    i22++;
                }
                System.arraycopy(this.tmp, 2, this.FR, 0, i3 - 2);
            }
            return this.blockSize;
        }
        System.arraycopy(bArr, i, this.tmp, 0, i5);
        byte[] bArr3 = this.FR;
        System.arraycopy(bArr3, 2, bArr3, 0, this.blockSize - 2);
        byte[] bArr4 = this.FR;
        int i32 = this.blockSize;
        byte[] bArr5 = this.tmp;
        bArr4[i32 - 2] = bArr5[0];
        bArr4[i32 - 1] = bArr5[1];
        this.cipher.processBlock(bArr4, 0, this.FRE, 0);
        int i33 = 0;
        while (true) {
            int i43 = this.blockSize;
            if (i33 >= i43 - 2) {
                System.arraycopy(this.tmp, 2, this.FR, 0, i43 - 2);
                this.count += 2;
                return this.blockSize - 2;
            }
            bArr2[i2 + i33] = encryptByte(this.tmp[i33 + 2], i33);
            i33++;
        }
    }

    private int encryptBlock(byte[] bArr, int i, byte[] bArr2, int i2) throws IllegalStateException, DataLengthException {
        int i3 = this.blockSize;
        if (i + i3 > bArr.length) {
            throw new DataLengthException("input buffer too short");
        }
        if (i3 + i2 > bArr2.length) {
            throw new OutputLengthException("output buffer too short");
        }
        int i5 = 0;
        this.cipher.processBlock(this.FR, 0, this.FRE, 0);
        for (int i6 = 0; i6 < this.blockSize; i6++) {
            bArr2[i2 + i6] = encryptByte(bArr[i + i6], i6);
        }
        while (true) {
            int i21 = this.blockSize;
            if (i5 >= i21) {
                return i21;
            }
            this.FR[i5] = bArr2[i2 + i5];
            i5++;
        }
    }

    private int encryptBlockWithIV(byte[] bArr, int i, byte[] bArr2, int i2) throws IllegalStateException, DataLengthException {
        int i3;
        int i5;
        int i6 = this.blockSize;
        if (i + i6 > bArr.length) {
            throw new DataLengthException("input buffer too short");
        }
        int i21 = this.count;
        if (i21 != 0) {
            if (i21 >= i6 + 2) {
                if (i6 + i2 > bArr2.length) {
                    throw new OutputLengthException("output buffer too short");
                }
                this.cipher.processBlock(this.FR, 0, this.FRE, 0);
                int i22 = 0;
                while (true) {
                    i3 = this.blockSize;
                    if (i22 >= i3) {
                        break;
                    }
                    bArr2[i2 + i22] = encryptByte(bArr[i + i22], i22);
                    i22++;
                }
                System.arraycopy(bArr2, i2, this.FR, 0, i3);
            }
            return this.blockSize;
        }
        if (n.a(i6, 2, i2, 2) > bArr2.length) {
            throw new OutputLengthException("output buffer too short");
        }
        this.cipher.processBlock(this.FR, 0, this.FRE, 0);
        int i32 = 0;
        while (true) {
            i5 = this.blockSize;
            if (i32 >= i5) {
                break;
            }
            bArr2[i2 + i32] = encryptByte(this.IV[i32], i32);
            i32++;
        }
        System.arraycopy(bArr2, i2, this.FR, 0, i5);
        this.cipher.processBlock(this.FR, 0, this.FRE, 0);
        int i33 = this.blockSize;
        bArr2[i2 + i33] = encryptByte(this.IV[i33 - 2], 0);
        int i43 = this.blockSize;
        bArr2[i2 + i43 + 1] = encryptByte(this.IV[i43 - 1], 1);
        System.arraycopy(bArr2, i2 + 2, this.FR, 0, this.blockSize);
        this.cipher.processBlock(this.FR, 0, this.FRE, 0);
        int i59 = 0;
        while (true) {
            int i66 = this.blockSize;
            if (i59 >= i66) {
                System.arraycopy(bArr2, i2 + i66 + 2, this.FR, 0, i66);
                int i74 = this.count;
                int i92 = this.blockSize;
                this.count = n.a(i92, 2, 2, i74);
                return (i92 * 2) + 2;
            }
            bArr2[b.C(i2, i66, 2, i59)] = encryptByte(bArr[i + i59], i59);
            i59++;
        }
    }

    private byte encryptByte(byte b4, int i) {
        return (byte) (b4 ^ this.FRE[i]);
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public String getAlgorithmName() {
        StringBuilder sb6;
        String str;
        if (this.inlineIv) {
            sb6 = new StringBuilder();
            sb6.append(this.cipher.getAlgorithmName());
            str = "/PGPCFBwithIV";
        } else {
            sb6 = new StringBuilder();
            sb6.append(this.cipher.getAlgorithmName());
            str = "/PGPCFB";
        }
        sb6.append(str);
        return sb6.toString();
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
        BlockCipher blockCipher;
        this.forEncryption = z;
        if (cipherParameters instanceof ParametersWithIV) {
            ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
            byte[] iv2 = parametersWithIV.getIV();
            int length = iv2.length;
            byte[] bArr = this.IV;
            if (length < bArr.length) {
                System.arraycopy(iv2, 0, bArr, bArr.length - iv2.length, iv2.length);
                int i = 0;
                while (true) {
                    byte[] bArr2 = this.IV;
                    if (i >= bArr2.length - iv2.length) {
                        break;
                    }
                    bArr2[i] = 0;
                    i++;
                }
            } else {
                System.arraycopy(iv2, 0, bArr, 0, bArr.length);
            }
            reset();
            blockCipher = this.cipher;
            cipherParameters = parametersWithIV.getParameters();
        } else {
            reset();
            blockCipher = this.cipher;
        }
        blockCipher.init(true, cipherParameters);
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i, byte[] bArr2, int i2) throws IllegalStateException, DataLengthException {
        return this.inlineIv ? this.forEncryption ? encryptBlockWithIV(bArr, i, bArr2, i2) : decryptBlockWithIV(bArr, i, bArr2, i2) : this.forEncryption ? encryptBlock(bArr, i, bArr2, i2) : decryptBlock(bArr, i, bArr2, i2);
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void reset() {
        this.count = 0;
        int i = 0;
        while (true) {
            byte[] bArr = this.FR;
            if (i == bArr.length) {
                this.cipher.reset();
                return;
            }
            if (this.inlineIv) {
                bArr[i] = 0;
            } else {
                bArr[i] = this.IV[i];
            }
            i++;
        }
    }
}
