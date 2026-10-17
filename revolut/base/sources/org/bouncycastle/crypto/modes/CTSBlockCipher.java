package org.bouncycastle.crypto.modes;

import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.DefaultBufferedBlockCipher;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.StreamBlockCipher;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes14.dex */
public class CTSBlockCipher extends DefaultBufferedBlockCipher {
    private int blockSize;

    public CTSBlockCipher(BlockCipher blockCipher) {
        if (blockCipher instanceof StreamBlockCipher) {
            throw new IllegalArgumentException("CTSBlockCipher can only accept ECB, or CBC ciphers");
        }
        ((DefaultBufferedBlockCipher) this).cipher = blockCipher;
        int blockSize = blockCipher.getBlockSize();
        this.blockSize = blockSize;
        ((DefaultBufferedBlockCipher) this).f228255buf = new byte[blockSize * 2];
        ((DefaultBufferedBlockCipher) this).bufOff = 0;
    }

    @Override // org.bouncycastle.crypto.DefaultBufferedBlockCipher, org.bouncycastle.crypto.BufferedBlockCipher
    public int doFinal(byte[] bArr, int i) throws InvalidCipherTextException, IllegalStateException, DataLengthException {
        if (((DefaultBufferedBlockCipher) this).bufOff + i > bArr.length) {
            throw new OutputLengthException("output buffer to small in doFinal");
        }
        int blockSize = ((DefaultBufferedBlockCipher) this).cipher.getBlockSize();
        int i2 = ((DefaultBufferedBlockCipher) this).bufOff;
        int i3 = i2 - blockSize;
        byte[] bArr2 = new byte[blockSize];
        if (((DefaultBufferedBlockCipher) this).forEncryption) {
            if (i2 < blockSize) {
                throw new DataLengthException("need at least one block of input for CTS");
            }
            ((DefaultBufferedBlockCipher) this).cipher.processBlock(((DefaultBufferedBlockCipher) this).f228255buf, 0, bArr2, 0);
            int i5 = ((DefaultBufferedBlockCipher) this).bufOff;
            if (i5 > blockSize) {
                while (true) {
                    byte[] bArr3 = ((DefaultBufferedBlockCipher) this).f228255buf;
                    if (i5 == bArr3.length) {
                        break;
                    }
                    bArr3[i5] = bArr2[i5 - blockSize];
                    i5++;
                }
                for (int i6 = blockSize; i6 != ((DefaultBufferedBlockCipher) this).bufOff; i6++) {
                    byte[] bArr4 = ((DefaultBufferedBlockCipher) this).f228255buf;
                    bArr4[i6] = (byte) (bArr4[i6] ^ bArr2[i6 - blockSize]);
                }
                BlockCipher blockCipher = ((DefaultBufferedBlockCipher) this).cipher;
                if (blockCipher instanceof CBCModeCipher) {
                    ((CBCModeCipher) blockCipher).getUnderlyingCipher().processBlock(((DefaultBufferedBlockCipher) this).f228255buf, blockSize, bArr, i);
                } else {
                    blockCipher.processBlock(((DefaultBufferedBlockCipher) this).f228255buf, blockSize, bArr, i);
                }
                System.arraycopy(bArr2, 0, bArr, i + blockSize, i3);
            } else {
                System.arraycopy(bArr2, 0, bArr, i, blockSize);
            }
        } else {
            if (i2 < blockSize) {
                throw new DataLengthException("need at least one block of input for CTS");
            }
            byte[] bArr5 = new byte[blockSize];
            if (i2 > blockSize) {
                BlockCipher blockCipher2 = ((DefaultBufferedBlockCipher) this).cipher;
                if (blockCipher2 instanceof CBCModeCipher) {
                    ((CBCModeCipher) blockCipher2).getUnderlyingCipher().processBlock(((DefaultBufferedBlockCipher) this).f228255buf, 0, bArr2, 0);
                } else {
                    blockCipher2.processBlock(((DefaultBufferedBlockCipher) this).f228255buf, 0, bArr2, 0);
                }
                for (int i21 = blockSize; i21 != ((DefaultBufferedBlockCipher) this).bufOff; i21++) {
                    int i22 = i21 - blockSize;
                    bArr5[i22] = (byte) (bArr2[i22] ^ ((DefaultBufferedBlockCipher) this).f228255buf[i21]);
                }
                System.arraycopy(((DefaultBufferedBlockCipher) this).f228255buf, blockSize, bArr2, 0, i3);
                ((DefaultBufferedBlockCipher) this).cipher.processBlock(bArr2, 0, bArr, i);
                System.arraycopy(bArr5, 0, bArr, i + blockSize, i3);
            } else {
                ((DefaultBufferedBlockCipher) this).cipher.processBlock(((DefaultBufferedBlockCipher) this).f228255buf, 0, bArr2, 0);
                System.arraycopy(bArr2, 0, bArr, i, blockSize);
            }
        }
        int i32 = ((DefaultBufferedBlockCipher) this).bufOff;
        reset();
        return i32;
    }

    @Override // org.bouncycastle.crypto.DefaultBufferedBlockCipher, org.bouncycastle.crypto.BufferedBlockCipher
    public int getOutputSize(int i) {
        return i + ((DefaultBufferedBlockCipher) this).bufOff;
    }

    @Override // org.bouncycastle.crypto.DefaultBufferedBlockCipher, org.bouncycastle.crypto.BufferedBlockCipher
    public int getUpdateOutputSize(int i) {
        int i2 = i + ((DefaultBufferedBlockCipher) this).bufOff;
        byte[] bArr = ((DefaultBufferedBlockCipher) this).f228255buf;
        int length = i2 % bArr.length;
        return length == 0 ? i2 - bArr.length : i2 - length;
    }

    @Override // org.bouncycastle.crypto.DefaultBufferedBlockCipher, org.bouncycastle.crypto.BufferedBlockCipher
    public int processByte(byte b4, byte[] bArr, int i) throws IllegalStateException, DataLengthException {
        int i2 = ((DefaultBufferedBlockCipher) this).bufOff;
        byte[] bArr2 = ((DefaultBufferedBlockCipher) this).f228255buf;
        int i3 = 0;
        if (i2 == bArr2.length) {
            int iProcessBlock = ((DefaultBufferedBlockCipher) this).cipher.processBlock(bArr2, 0, bArr, i);
            byte[] bArr3 = ((DefaultBufferedBlockCipher) this).f228255buf;
            int i5 = this.blockSize;
            System.arraycopy(bArr3, i5, bArr3, 0, i5);
            ((DefaultBufferedBlockCipher) this).bufOff = this.blockSize;
            i3 = iProcessBlock;
        }
        byte[] bArr4 = ((DefaultBufferedBlockCipher) this).f228255buf;
        int i6 = ((DefaultBufferedBlockCipher) this).bufOff;
        ((DefaultBufferedBlockCipher) this).bufOff = i6 + 1;
        bArr4[i6] = b4;
        return i3;
    }

    @Override // org.bouncycastle.crypto.DefaultBufferedBlockCipher, org.bouncycastle.crypto.BufferedBlockCipher
    public int processBytes(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws IllegalStateException, DataLengthException {
        if (i2 < 0) {
            throw new IllegalArgumentException("Can't have a negative input length!");
        }
        int blockSize = getBlockSize();
        int updateOutputSize = getUpdateOutputSize(i2);
        if (updateOutputSize > 0 && i3 + updateOutputSize > bArr2.length) {
            throw new OutputLengthException("output buffer too short");
        }
        byte[] bArr3 = ((DefaultBufferedBlockCipher) this).f228255buf;
        int length = bArr3.length;
        int i5 = ((DefaultBufferedBlockCipher) this).bufOff;
        int i6 = length - i5;
        int i21 = 0;
        if (i2 > i6) {
            System.arraycopy(bArr, i, bArr3, i5, i6);
            i += i6;
            i2 -= i6;
            if (bArr == bArr2 && Arrays.segmentsOverlap(i, i2, i3, updateOutputSize)) {
                bArr = new byte[i2];
                System.arraycopy(bArr2, i, bArr, 0, i2);
                i = 0;
            }
            int iProcessBlock = ((DefaultBufferedBlockCipher) this).cipher.processBlock(((DefaultBufferedBlockCipher) this).f228255buf, 0, bArr2, i3);
            byte[] bArr4 = ((DefaultBufferedBlockCipher) this).f228255buf;
            System.arraycopy(bArr4, blockSize, bArr4, 0, blockSize);
            ((DefaultBufferedBlockCipher) this).bufOff = blockSize;
            while (i2 > blockSize) {
                System.arraycopy(bArr, i, ((DefaultBufferedBlockCipher) this).f228255buf, ((DefaultBufferedBlockCipher) this).bufOff, blockSize);
                iProcessBlock += ((DefaultBufferedBlockCipher) this).cipher.processBlock(((DefaultBufferedBlockCipher) this).f228255buf, 0, bArr2, i3 + iProcessBlock);
                byte[] bArr5 = ((DefaultBufferedBlockCipher) this).f228255buf;
                System.arraycopy(bArr5, blockSize, bArr5, 0, blockSize);
                i2 -= blockSize;
                i += blockSize;
            }
            i21 = iProcessBlock;
        }
        System.arraycopy(bArr, i, ((DefaultBufferedBlockCipher) this).f228255buf, ((DefaultBufferedBlockCipher) this).bufOff, i2);
        ((DefaultBufferedBlockCipher) this).bufOff += i2;
        return i21;
    }
}
