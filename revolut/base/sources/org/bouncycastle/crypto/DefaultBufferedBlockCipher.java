package org.bouncycastle.crypto;

/* JADX INFO: loaded from: classes14.dex */
public class DefaultBufferedBlockCipher extends BufferedBlockCipher {

    /* JADX INFO: renamed from: buf, reason: collision with root package name */
    protected byte[] f228255buf;
    protected int bufOff;
    protected BlockCipher cipher;
    protected boolean forEncryption;
    protected MultiBlockCipher mbCipher;
    protected boolean partialBlockOkay;
    protected boolean pgpCFB;

    public DefaultBufferedBlockCipher() {
    }

    private int processBuffer(byte[] bArr, int i) {
        this.bufOff = 0;
        MultiBlockCipher multiBlockCipher = this.mbCipher;
        if (multiBlockCipher == null) {
            return this.cipher.processBlock(this.f228255buf, 0, bArr, i);
        }
        byte[] bArr2 = this.f228255buf;
        return multiBlockCipher.processBlocks(bArr2, 0, bArr2.length / multiBlockCipher.getBlockSize(), bArr, i);
    }

    @Override // org.bouncycastle.crypto.BufferedBlockCipher
    public int doFinal(byte[] bArr, int i) throws InvalidCipherTextException, IllegalStateException, DataLengthException {
        byte[] bArr2;
        int i2;
        int iProcessBlocks;
        int blockSize;
        try {
            int i3 = this.bufOff;
            if (i + i3 > bArr.length) {
                throw new OutputLengthException("output buffer too short for doFinal()");
            }
            int i5 = 0;
            if (i3 != 0) {
                MultiBlockCipher multiBlockCipher = this.mbCipher;
                if (multiBlockCipher != null) {
                    int blockSize2 = i3 / multiBlockCipher.getBlockSize();
                    bArr2 = bArr;
                    i2 = i;
                    iProcessBlocks = this.mbCipher.processBlocks(this.f228255buf, 0, blockSize2, bArr2, i2);
                    blockSize = blockSize2 * this.mbCipher.getBlockSize();
                } else {
                    bArr2 = bArr;
                    i2 = i;
                    iProcessBlocks = 0;
                    blockSize = 0;
                }
                if (this.bufOff == blockSize) {
                    i5 = iProcessBlocks;
                } else {
                    if (!this.partialBlockOkay) {
                        throw new DataLengthException("data not block size aligned");
                    }
                    BlockCipher blockCipher = this.cipher;
                    byte[] bArr3 = this.f228255buf;
                    blockCipher.processBlock(bArr3, blockSize, bArr3, blockSize);
                    System.arraycopy(this.f228255buf, blockSize, bArr2, i2 + iProcessBlocks, this.bufOff - blockSize);
                    int i6 = (this.bufOff - blockSize) + iProcessBlocks;
                    this.bufOff = 0;
                    i5 = i6;
                }
            }
            reset();
            return i5;
        } catch (Throwable th10) {
            reset();
            throw th10;
        }
    }

    @Override // org.bouncycastle.crypto.BufferedBlockCipher
    public int getBlockSize() {
        return this.cipher.getBlockSize();
    }

    @Override // org.bouncycastle.crypto.BufferedBlockCipher
    public int getOutputSize(int i) {
        if (!this.pgpCFB || !this.forEncryption) {
            return i + this.bufOff;
        }
        return this.cipher.getBlockSize() + 2 + i + this.bufOff;
    }

    @Override // org.bouncycastle.crypto.BufferedBlockCipher
    public BlockCipher getUnderlyingCipher() {
        return this.cipher;
    }

    @Override // org.bouncycastle.crypto.BufferedBlockCipher
    public int getUpdateOutputSize(int i) {
        int length;
        int i2 = i + this.bufOff;
        if (this.pgpCFB && this.forEncryption) {
            length = (i2 % this.f228255buf.length) - (this.cipher.getBlockSize() + 2);
            return i2 - length;
        }
        int length2 = this.f228255buf.length;
        length = i2 % length2;
        return i2 - length;
    }

    @Override // org.bouncycastle.crypto.BufferedBlockCipher
    public void init(boolean z, CipherParameters cipherParameters) throws IllegalArgumentException {
        this.forEncryption = z;
        reset();
        this.cipher.init(z, cipherParameters);
    }

    @Override // org.bouncycastle.crypto.BufferedBlockCipher
    public int processByte(byte b4, byte[] bArr, int i) throws IllegalStateException, DataLengthException {
        byte[] bArr2 = this.f228255buf;
        int i2 = this.bufOff;
        int i3 = i2 + 1;
        this.bufOff = i3;
        bArr2[i2] = b4;
        if (i3 == bArr2.length) {
            return processBuffer(bArr, i);
        }
        return 0;
    }

    @Override // org.bouncycastle.crypto.BufferedBlockCipher
    public int processBytes(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws IllegalStateException, DataLengthException {
        byte[] bArr3;
        int i5;
        int i6;
        int i21;
        if (i2 < 0) {
            throw new IllegalArgumentException("Can't have a negative input length!");
        }
        int blockSize = getBlockSize();
        int updateOutputSize = getUpdateOutputSize(i2);
        if (updateOutputSize > 0 && updateOutputSize + i3 > bArr2.length) {
            throw new OutputLengthException("output buffer too short");
        }
        byte[] bArr4 = this.f228255buf;
        int length = bArr4.length;
        int i22 = this.bufOff;
        int i32 = length - i22;
        if (i2 > i32) {
            if (i22 != 0) {
                System.arraycopy(bArr, i, bArr4, i22, i32);
                i21 = i + i32;
                i6 = i2 - i32;
            } else {
                i21 = i;
                i6 = i2;
            }
            if (bArr == bArr2) {
                byte[] bArr5 = new byte[i6];
                System.arraycopy(bArr2, i21, bArr5, 0, i6);
                bArr3 = bArr5;
                i5 = 0;
            } else {
                i5 = i21;
                bArr3 = bArr;
            }
            iProcessBuffer = this.bufOff != 0 ? processBuffer(bArr2, i3) : 0;
            MultiBlockCipher multiBlockCipher = this.mbCipher;
            if (multiBlockCipher != null) {
                int multiBlockSize = (this.mbCipher.getMultiBlockSize() / blockSize) * (i6 / multiBlockCipher.getMultiBlockSize());
                if (multiBlockSize > 0) {
                    iProcessBuffer += this.mbCipher.processBlocks(bArr3, i5, multiBlockSize, bArr2, i3 + iProcessBuffer);
                    int i33 = multiBlockSize * blockSize;
                    i6 -= i33;
                    i5 += i33;
                }
            } else {
                while (i6 > this.f228255buf.length) {
                    iProcessBuffer += this.cipher.processBlock(bArr3, i5, bArr2, i3 + iProcessBuffer);
                    i6 -= blockSize;
                    i5 += blockSize;
                }
            }
        } else {
            bArr3 = bArr;
            i5 = i;
            i6 = i2;
        }
        System.arraycopy(bArr3, i5, this.f228255buf, this.bufOff, i6);
        int i43 = this.bufOff + i6;
        this.bufOff = i43;
        return i43 == this.f228255buf.length ? iProcessBuffer + processBuffer(bArr2, i3 + iProcessBuffer) : iProcessBuffer;
    }

    @Override // org.bouncycastle.crypto.BufferedBlockCipher
    public void reset() {
        int i = 0;
        while (true) {
            byte[] bArr = this.f228255buf;
            if (i >= bArr.length) {
                this.bufOff = 0;
                this.cipher.reset();
                return;
            } else {
                bArr[i] = 0;
                i++;
            }
        }
    }

    public DefaultBufferedBlockCipher(BlockCipher blockCipher) {
        this.cipher = blockCipher;
        if (blockCipher instanceof MultiBlockCipher) {
            MultiBlockCipher multiBlockCipher = (MultiBlockCipher) blockCipher;
            this.mbCipher = multiBlockCipher;
            this.f228255buf = new byte[multiBlockCipher.getMultiBlockSize()];
        } else {
            this.mbCipher = null;
            this.f228255buf = new byte[blockCipher.getBlockSize()];
        }
        boolean z = false;
        this.bufOff = 0;
        String algorithmName = blockCipher.getAlgorithmName();
        int iIndexOf = algorithmName.indexOf(47) + 1;
        boolean z3 = iIndexOf > 0 && algorithmName.startsWith("PGP", iIndexOf);
        this.pgpCFB = z3;
        if (z3 || (blockCipher instanceof StreamCipher)) {
            this.partialBlockOkay = true;
            return;
        }
        if (iIndexOf > 0 && algorithmName.startsWith("OpenPGP", iIndexOf)) {
            z = true;
        }
        this.partialBlockOkay = z;
    }
}
