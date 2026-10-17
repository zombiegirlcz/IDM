package org.bouncycastle.crypto;

/* JADX INFO: loaded from: classes14.dex */
public abstract class DefaultMultiBlockCipher implements MultiBlockCipher {
    @Override // org.bouncycastle.crypto.MultiBlockCipher
    public int getMultiBlockSize() {
        return getBlockSize();
    }

    @Override // org.bouncycastle.crypto.MultiBlockCipher
    public int processBlocks(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws IllegalStateException, DataLengthException {
        int blockSize = getBlockSize();
        int i5 = i2 * blockSize;
        if (bArr == bArr2) {
            bArr = new byte[i5];
            System.arraycopy(bArr2, i, bArr, 0, i5);
            i = 0;
        }
        int iProcessBlock = 0;
        for (int i6 = 0; i6 != i2; i6++) {
            iProcessBlock += processBlock(bArr, i, bArr2, i3 + iProcessBlock);
            i += blockSize;
        }
        return iProcessBlock;
    }
}
