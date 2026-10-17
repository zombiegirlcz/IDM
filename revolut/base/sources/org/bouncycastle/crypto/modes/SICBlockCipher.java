package org.bouncycastle.crypto.modes;

import com.google.common.primitives.UnsignedBytes;
import j6.a;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.StreamBlockCipher;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes14.dex */
public class SICBlockCipher extends StreamBlockCipher implements CTRModeCipher {
    private byte[] IV;
    private final int blockSize;
    private int byteCount;
    private final BlockCipher cipher;
    private byte[] counter;
    private byte[] counterOut;

    @Deprecated
    public SICBlockCipher(BlockCipher blockCipher) {
        super(blockCipher);
        this.cipher = blockCipher;
        int blockSize = blockCipher.getBlockSize();
        this.blockSize = blockSize;
        this.IV = new byte[blockSize];
        this.counter = new byte[blockSize];
        this.counterOut = new byte[blockSize];
        this.byteCount = 0;
    }

    private void adjustCounter(long j2) {
        int i = 5;
        if (j2 >= 0) {
            long j3 = (((long) this.byteCount) + j2) / ((long) this.blockSize);
            long j5 = j3;
            if (j3 > 255) {
                while (i >= 1) {
                    long j16 = 1 << (i * 8);
                    while (j5 >= j16) {
                        incrementCounterAt(i);
                        j5 -= j16;
                    }
                    i--;
                }
            }
            incrementCounter((int) j5);
            this.byteCount = (int) ((j2 + ((long) this.byteCount)) - (((long) this.blockSize) * j3));
            return;
        }
        long j22 = ((-j2) - ((long) this.byteCount)) / ((long) this.blockSize);
        long j42 = j22;
        if (j22 > 255) {
            while (i >= 1) {
                long j46 = 1 << (i * 8);
                while (j42 > j46) {
                    decrementCounterAt(i);
                    j42 -= j46;
                }
                i--;
            }
        }
        for (long j47 = 0; j47 != j42; j47++) {
            decrementCounterAt(0);
        }
        int i2 = (int) ((((long) this.blockSize) * j22) + ((long) this.byteCount) + j2);
        if (i2 >= 0) {
            this.byteCount = 0;
        } else {
            decrementCounterAt(0);
            this.byteCount = this.blockSize + i2;
        }
    }

    private void checkCounter() {
        byte[] bArr = this.IV;
        if (bArr.length < this.blockSize) {
            for (int length = bArr.length - 1; length >= 0; length--) {
                if (this.counter[length] != this.IV[length]) {
                    throw new IllegalStateException("Counter in CTR/SIC mode out of range.");
                }
            }
        }
    }

    private void checkLastIncrement() {
        byte[] bArr = this.IV;
        if (bArr.length < this.blockSize && this.counter[bArr.length - 1] != bArr[bArr.length - 1]) {
            throw new IllegalStateException("Counter in CTR/SIC mode out of range.");
        }
    }

    private void decrementCounterAt(int i) {
        byte b4;
        int length = this.counter.length - i;
        do {
            length--;
            if (length < 0) {
                return;
            }
            b4 = (byte) (r1[length] - 1);
            this.counter[length] = b4;
        } while (b4 == -1);
    }

    private void incrementCounter() {
        byte b4;
        int length = this.counter.length;
        do {
            length--;
            if (length < 0) {
                return;
            }
            byte[] bArr = this.counter;
            b4 = (byte) (bArr[length] + 1);
            bArr[length] = b4;
        } while (b4 == 0);
    }

    private void incrementCounterAt(int i) {
        byte b4;
        int length = this.counter.length - i;
        do {
            length--;
            if (length < 0) {
                return;
            }
            byte[] bArr = this.counter;
            b4 = (byte) (bArr[length] + 1);
            bArr[length] = b4;
        } while (b4 == 0);
    }

    public static CTRModeCipher newInstance(BlockCipher blockCipher) {
        return new SICBlockCipher(blockCipher);
    }

    @Override // org.bouncycastle.crypto.StreamBlockCipher
    public byte calculateByte(byte b4) throws IllegalStateException, DataLengthException {
        int i = this.byteCount;
        if (i == 0) {
            checkLastIncrement();
            this.cipher.processBlock(this.counter, 0, this.counterOut, 0);
            byte[] bArr = this.counterOut;
            int i2 = this.byteCount;
            this.byteCount = i2 + 1;
            return (byte) (b4 ^ bArr[i2]);
        }
        byte[] bArr2 = this.counterOut;
        int i3 = i + 1;
        this.byteCount = i3;
        byte b5 = (byte) (b4 ^ bArr2[i]);
        if (i3 == this.counter.length) {
            this.byteCount = 0;
            incrementCounter();
        }
        return b5;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public String getAlgorithmName() {
        return this.cipher.getAlgorithmName() + "/SIC";
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int getBlockSize() {
        return this.cipher.getBlockSize();
    }

    @Override // org.bouncycastle.crypto.SkippingCipher
    public long getPosition() {
        byte[] bArr = this.counter;
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        int i = length - 1;
        while (i >= 1) {
            byte[] bArr3 = this.IV;
            int i2 = i < bArr3.length ? (bArr2[i] & UnsignedBytes.MAX_VALUE) - (bArr3[i] & UnsignedBytes.MAX_VALUE) : bArr2[i] & UnsignedBytes.MAX_VALUE;
            if (i2 < 0) {
                int i3 = i - 1;
                bArr2[i3] = (byte) (bArr2[i3] - 1);
                i2 += 256;
            }
            bArr2[i] = (byte) i2;
            i--;
        }
        return (Pack.bigEndianToLong(bArr2, length - 8) * ((long) this.blockSize)) + ((long) this.byteCount);
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void init(boolean z, CipherParameters cipherParameters) throws IllegalArgumentException {
        if (!(cipherParameters instanceof ParametersWithIV)) {
            throw new IllegalArgumentException("CTR/SIC mode requires ParametersWithIV");
        }
        ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
        byte[] bArrClone = Arrays.clone(parametersWithIV.getIV());
        this.IV = bArrClone;
        int i = this.blockSize;
        if (i < bArrClone.length) {
            throw new IllegalArgumentException(a.v(new StringBuilder("CTR/SIC mode requires IV no greater than: "), " bytes.", this.blockSize));
        }
        int i2 = 8 > i / 2 ? i / 2 : 8;
        if (i - bArrClone.length <= i2) {
            if (parametersWithIV.getParameters() != null) {
                this.cipher.init(true, parametersWithIV.getParameters());
            }
            reset();
        } else {
            throw new IllegalArgumentException("CTR/SIC mode requires IV of at least: " + (this.blockSize - i2) + " bytes.");
        }
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i, byte[] bArr2, int i2) throws IllegalStateException, DataLengthException {
        SICBlockCipher sICBlockCipher;
        if (this.byteCount != 0) {
            sICBlockCipher = this;
            sICBlockCipher.processBytes(bArr, i, this.blockSize, bArr2, i2);
        } else {
            sICBlockCipher = this;
            int i3 = sICBlockCipher.blockSize;
            if (i + i3 > bArr.length) {
                throw new DataLengthException("input buffer too small");
            }
            if (i2 + i3 > bArr2.length) {
                throw new OutputLengthException("output buffer too short");
            }
            sICBlockCipher.cipher.processBlock(sICBlockCipher.counter, 0, sICBlockCipher.counterOut, 0);
            for (int i5 = 0; i5 < sICBlockCipher.blockSize; i5++) {
                bArr2[i2 + i5] = (byte) (bArr[i + i5] ^ sICBlockCipher.counterOut[i5]);
            }
            incrementCounter();
        }
        return sICBlockCipher.blockSize;
    }

    @Override // org.bouncycastle.crypto.StreamBlockCipher, org.bouncycastle.crypto.StreamCipher
    public int processBytes(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws DataLengthException {
        byte b4;
        if (i + i2 > bArr.length) {
            throw new DataLengthException("input buffer too small");
        }
        if (i3 + i2 > bArr2.length) {
            throw new OutputLengthException("output buffer too short");
        }
        for (int i5 = 0; i5 < i2; i5++) {
            int i6 = this.byteCount;
            if (i6 == 0) {
                checkLastIncrement();
                this.cipher.processBlock(this.counter, 0, this.counterOut, 0);
                byte b5 = bArr[i + i5];
                byte[] bArr3 = this.counterOut;
                int i21 = this.byteCount;
                this.byteCount = i21 + 1;
                b4 = (byte) (b5 ^ bArr3[i21]);
            } else {
                byte b7 = bArr[i + i5];
                byte[] bArr4 = this.counterOut;
                int i22 = i6 + 1;
                this.byteCount = i22;
                b4 = (byte) (bArr4[i6] ^ b7);
                if (i22 == this.counter.length) {
                    this.byteCount = 0;
                    incrementCounter();
                }
            }
            bArr2[i3 + i5] = b4;
        }
        return i2;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void reset() {
        Arrays.fill(this.counter, (byte) 0);
        byte[] bArr = this.IV;
        System.arraycopy(bArr, 0, this.counter, 0, bArr.length);
        this.cipher.reset();
        this.byteCount = 0;
    }

    @Override // org.bouncycastle.crypto.SkippingCipher
    public long seekTo(long j2) {
        reset();
        return skip(j2);
    }

    @Override // org.bouncycastle.crypto.SkippingCipher
    public long skip(long j2) {
        adjustCounter(j2);
        checkCounter();
        this.cipher.processBlock(this.counter, 0, this.counterOut, 0);
        return j2;
    }

    private void incrementCounter(int i) {
        byte[] bArr = this.counter;
        byte b4 = bArr[bArr.length - 1];
        int length = bArr.length - 1;
        bArr[length] = (byte) (bArr[length] + ((byte) i));
        if ((b4 & UnsignedBytes.MAX_VALUE) + i > 255) {
            incrementCounterAt(1);
        }
    }
}
