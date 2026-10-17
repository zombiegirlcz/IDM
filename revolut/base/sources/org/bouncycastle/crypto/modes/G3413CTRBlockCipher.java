package org.bouncycastle.crypto.modes;

import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.StreamBlockCipher;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes14.dex */
public class G3413CTRBlockCipher extends StreamBlockCipher {
    private byte[] CTR;
    private byte[] IV;
    private final int blockSize;

    /* JADX INFO: renamed from: buf, reason: collision with root package name */
    private byte[] f228466buf;
    private int byteCount;
    private final BlockCipher cipher;
    private boolean initialized;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final int f228467s;

    public G3413CTRBlockCipher(BlockCipher blockCipher) {
        this(blockCipher, blockCipher.getBlockSize() * 8);
    }

    private byte[] generateBuf() {
        byte[] bArr = this.CTR;
        byte[] bArr2 = new byte[bArr.length];
        this.cipher.processBlock(bArr, 0, bArr2, 0);
        return GOST3413CipherUtil.MSB(bArr2, this.f228467s);
    }

    private void generateCTR() {
        int length = this.CTR.length - 1;
        do {
            byte[] bArr = this.CTR;
            byte b4 = (byte) (bArr[length] + 1);
            bArr[length] = b4;
            if (b4 != 0) {
                return;
            } else {
                length--;
            }
        } while (length != this.IV.length - 1);
        throw new IllegalStateException("attempt to process too many blocks");
    }

    private void initArrays() {
        int i = this.blockSize;
        this.IV = new byte[i / 2];
        this.CTR = new byte[i];
        this.f228466buf = new byte[this.f228467s];
    }

    @Override // org.bouncycastle.crypto.StreamBlockCipher
    public byte calculateByte(byte b4) {
        if (this.byteCount == 0) {
            this.f228466buf = generateBuf();
        }
        byte[] bArr = this.f228466buf;
        int i = this.byteCount;
        byte b5 = (byte) (b4 ^ bArr[i]);
        int i2 = i + 1;
        this.byteCount = i2;
        if (i2 == this.f228467s) {
            this.byteCount = 0;
            generateCTR();
        }
        return b5;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public String getAlgorithmName() {
        return this.cipher.getAlgorithmName() + "/GCTR";
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int getBlockSize() {
        return this.f228467s;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void init(boolean z, CipherParameters cipherParameters) throws IllegalArgumentException {
        BlockCipher blockCipher;
        if (cipherParameters instanceof ParametersWithIV) {
            ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
            initArrays();
            byte[] bArrClone = Arrays.clone(parametersWithIV.getIV());
            this.IV = bArrClone;
            if (bArrClone.length != this.blockSize / 2) {
                throw new IllegalArgumentException("Parameter IV length must be == blockSize/2");
            }
            System.arraycopy(bArrClone, 0, this.CTR, 0, bArrClone.length);
            for (int length = this.IV.length; length < this.blockSize; length++) {
                this.CTR[length] = 0;
            }
            if (parametersWithIV.getParameters() != null) {
                blockCipher = this.cipher;
                cipherParameters = parametersWithIV.getParameters();
                blockCipher.init(true, cipherParameters);
            }
        } else {
            initArrays();
            if (cipherParameters != null) {
                blockCipher = this.cipher;
                blockCipher.init(true, cipherParameters);
            }
        }
        this.initialized = true;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i, byte[] bArr2, int i2) throws IllegalStateException, DataLengthException {
        processBytes(bArr, i, this.f228467s, bArr2, i2);
        return this.f228467s;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void reset() {
        if (this.initialized) {
            byte[] bArr = this.IV;
            System.arraycopy(bArr, 0, this.CTR, 0, bArr.length);
            for (int length = this.IV.length; length < this.blockSize; length++) {
                this.CTR[length] = 0;
            }
            this.byteCount = 0;
            this.cipher.reset();
        }
    }

    public G3413CTRBlockCipher(BlockCipher blockCipher, int i) {
        super(blockCipher);
        this.byteCount = 0;
        if (i < 0 || i > blockCipher.getBlockSize() * 8) {
            throw new IllegalArgumentException("Parameter bitBlockSize must be in range 0 < bitBlockSize <= " + (blockCipher.getBlockSize() * 8));
        }
        this.cipher = blockCipher;
        int blockSize = blockCipher.getBlockSize();
        this.blockSize = blockSize;
        this.f228467s = i / 8;
        this.CTR = new byte[blockSize];
    }
}
