package org.bouncycastle.crypto.modes;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.params.AEADParameters;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes14.dex */
public class KCCMBlockCipher implements AEADBlockCipher {
    private static final int BITS_IN_BYTE = 8;
    private static final int BYTES_IN_INT = 4;
    private static final int MAX_MAC_BIT_LENGTH = 512;
    private static final int MIN_MAC_BIT_LENGTH = 64;
    private byte[] G1;
    private int Nb_;
    private ExposedByteArrayOutputStream associatedText;
    private byte[] buffer;
    private byte[] counter;
    private ExposedByteArrayOutputStream data;
    private BlockCipher engine;
    private boolean forEncryption;
    private byte[] initialAssociatedText;
    private byte[] mac;
    private byte[] macBlock;
    private int macSize;
    private byte[] nonce;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private byte[] f228469s;

    public static class ExposedByteArrayOutputStream extends ByteArrayOutputStream {
        public byte[] getBuffer() {
            return ((ByteArrayOutputStream) this).buf;
        }
    }

    public KCCMBlockCipher(BlockCipher blockCipher) {
        this(blockCipher, 4);
    }

    private void CalculateMac(byte[] bArr, int i, int i2) {
        while (i2 > 0) {
            for (int i3 = 0; i3 < this.engine.getBlockSize(); i3++) {
                byte[] bArr2 = this.macBlock;
                bArr2[i3] = (byte) (bArr2[i3] ^ bArr[i + i3]);
            }
            BlockCipher blockCipher = this.engine;
            byte[] bArr3 = this.macBlock;
            blockCipher.processBlock(bArr3, 0, bArr3, 0);
            i2 -= this.engine.getBlockSize();
            i += this.engine.getBlockSize();
        }
    }

    private void ProcessBlock(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        int i5 = 0;
        while (true) {
            byte[] bArr3 = this.counter;
            if (i5 >= bArr3.length) {
                break;
            }
            byte[] bArr4 = this.f228469s;
            bArr4[i5] = (byte) (bArr4[i5] + bArr3[i5]);
            i5++;
        }
        this.engine.processBlock(this.f228469s, 0, this.buffer, 0);
        for (int i6 = 0; i6 < this.engine.getBlockSize(); i6++) {
            bArr2[i3 + i6] = (byte) (this.buffer[i6] ^ bArr[i + i6]);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0048 A[LOOP:0: B:24:0x0041->B:26:0x0048, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private byte getFlag(boolean r4, int r5) {
        /*
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "0"
            if (r4 == 0) goto Lf
            java.lang.String r4 = "1"
            r0.append(r4)
            goto L12
        Lf:
            r0.append(r1)
        L12:
            r4 = 8
            if (r5 == r4) goto L36
            r4 = 16
            if (r5 == r4) goto L33
            r4 = 32
            if (r5 == r4) goto L30
            r4 = 48
            if (r5 == r4) goto L2d
            r4 = 64
            if (r5 == r4) goto L27
            goto L39
        L27:
            java.lang.String r4 = "110"
        L29:
            r0.append(r4)
            goto L39
        L2d:
            java.lang.String r4 = "101"
            goto L29
        L30:
            java.lang.String r4 = "100"
            goto L29
        L33:
            java.lang.String r4 = "011"
            goto L29
        L36:
            java.lang.String r4 = "010"
            goto L29
        L39:
            int r4 = r3.Nb_
            int r4 = r4 + (-1)
            java.lang.String r4 = java.lang.Integer.toBinaryString(r4)
        L41:
            int r5 = r4.length()
            r2 = 4
            if (r5 >= r2) goto L57
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r4)
            r4 = 0
            java.lang.StringBuilder r4 = r5.insert(r4, r1)
            java.lang.String r4 = r4.toString()
            goto L41
        L57:
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            r5 = 2
            int r4 = java.lang.Integer.parseInt(r4, r5)
            byte r4 = (byte) r4
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.crypto.modes.KCCMBlockCipher.getFlag(boolean, int):byte");
    }

    private void intToBytes(int i, byte[] bArr, int i2) {
        bArr[i2 + 3] = (byte) (i >> 24);
        bArr[i2 + 2] = (byte) (i >> 16);
        bArr[i2 + 1] = (byte) (i >> 8);
        bArr[i2] = (byte) i;
    }

    private void processAAD(byte[] bArr, int i, int i2, int i3) {
        if (i2 - i < this.engine.getBlockSize()) {
            throw new IllegalArgumentException("authText buffer too short");
        }
        if (i2 % this.engine.getBlockSize() != 0) {
            throw new IllegalArgumentException("padding not supported");
        }
        byte[] bArr2 = this.nonce;
        System.arraycopy(bArr2, 0, this.G1, 0, (bArr2.length - this.Nb_) - 1);
        intToBytes(i3, this.buffer, 0);
        System.arraycopy(this.buffer, 0, this.G1, (this.nonce.length - this.Nb_) - 1, 4);
        byte[] bArr3 = this.G1;
        bArr3[bArr3.length - 1] = getFlag(true, this.macSize);
        this.engine.processBlock(this.G1, 0, this.macBlock, 0);
        intToBytes(i2, this.buffer, 0);
        if (i2 <= this.engine.getBlockSize() - this.Nb_) {
            for (int i5 = 0; i5 < i2; i5++) {
                byte[] bArr4 = this.buffer;
                int i6 = this.Nb_ + i5;
                bArr4[i6] = (byte) (bArr4[i6] ^ bArr[i + i5]);
            }
            for (int i21 = 0; i21 < this.engine.getBlockSize(); i21++) {
                byte[] bArr5 = this.macBlock;
                bArr5[i21] = (byte) (bArr5[i21] ^ this.buffer[i21]);
            }
            BlockCipher blockCipher = this.engine;
            byte[] bArr6 = this.macBlock;
            blockCipher.processBlock(bArr6, 0, bArr6, 0);
            return;
        }
        for (int i22 = 0; i22 < this.engine.getBlockSize(); i22++) {
            byte[] bArr7 = this.macBlock;
            bArr7[i22] = (byte) (bArr7[i22] ^ this.buffer[i22]);
        }
        BlockCipher blockCipher2 = this.engine;
        byte[] bArr8 = this.macBlock;
        blockCipher2.processBlock(bArr8, 0, bArr8, 0);
        while (i2 != 0) {
            for (int i32 = 0; i32 < this.engine.getBlockSize(); i32++) {
                byte[] bArr9 = this.macBlock;
                bArr9[i32] = (byte) (bArr9[i32] ^ bArr[i32 + i]);
            }
            BlockCipher blockCipher3 = this.engine;
            byte[] bArr10 = this.macBlock;
            blockCipher3.processBlock(bArr10, 0, bArr10, 0);
            i += this.engine.getBlockSize();
            i2 -= this.engine.getBlockSize();
        }
    }

    private void setNb(int i) {
        if (i != 4 && i != 6 && i != 8) {
            throw new IllegalArgumentException("Nb = 4 is recommended by DSTU7624 but can be changed to only 6 or 8 in this implementation");
        }
        this.Nb_ = i;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int doFinal(byte[] bArr, int i) throws InvalidCipherTextException, IllegalStateException, IOException {
        int iProcessPacket = processPacket(this.data.getBuffer(), 0, this.data.size(), bArr, i);
        reset();
        return iProcessPacket;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public String getAlgorithmName() {
        return this.engine.getAlgorithmName() + "/KCCM";
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public byte[] getMac() {
        return Arrays.clone(this.mac);
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int getOutputSize(int i) {
        return i + this.macSize;
    }

    @Override // org.bouncycastle.crypto.modes.AEADBlockCipher
    public BlockCipher getUnderlyingCipher() {
        return this.engine;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int getUpdateOutputSize(int i) {
        return i;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void init(boolean z, CipherParameters cipherParameters) throws IOException, IllegalArgumentException {
        CipherParameters parameters;
        if (cipherParameters instanceof AEADParameters) {
            AEADParameters aEADParameters = (AEADParameters) cipherParameters;
            if (aEADParameters.getMacSize() > 512 || aEADParameters.getMacSize() < 64 || aEADParameters.getMacSize() % 8 != 0) {
                throw new IllegalArgumentException("Invalid mac size specified");
            }
            this.nonce = aEADParameters.getNonce();
            this.macSize = aEADParameters.getMacSize() / 8;
            this.initialAssociatedText = aEADParameters.getAssociatedText();
            parameters = aEADParameters.getKey();
        } else {
            if (!(cipherParameters instanceof ParametersWithIV)) {
                throw new IllegalArgumentException("Invalid parameters specified");
            }
            ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
            this.nonce = parametersWithIV.getIV();
            this.macSize = this.engine.getBlockSize();
            this.initialAssociatedText = null;
            parameters = parametersWithIV.getParameters();
        }
        this.mac = new byte[this.macSize];
        this.forEncryption = z;
        this.engine.init(true, parameters);
        this.counter[0] = 1;
        byte[] bArr = this.initialAssociatedText;
        if (bArr != null) {
            processAADBytes(bArr, 0, bArr.length);
        }
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void processAADByte(byte b4) throws IOException {
        this.associatedText.write(b4);
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void processAADBytes(byte[] bArr, int i, int i2) throws IOException {
        this.associatedText.write(bArr, i, i2);
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int processByte(byte b4, byte[] bArr, int i) throws IllegalStateException, DataLengthException, IOException {
        this.data.write(b4);
        return 0;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int processBytes(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws IllegalStateException, DataLengthException, IOException {
        if (bArr.length < i + i2) {
            throw new DataLengthException("input buffer too short");
        }
        this.data.write(bArr, i, i2);
        return 0;
    }

    public int processPacket(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws InvalidCipherTextException, IllegalStateException, IOException {
        int i5;
        if (bArr.length - i < i2) {
            throw new DataLengthException("input buffer too short");
        }
        if (bArr2.length - i3 < i2) {
            throw new OutputLengthException("output buffer too short");
        }
        if (this.associatedText.size() > 0) {
            if (this.forEncryption) {
                processAAD(this.associatedText.getBuffer(), 0, this.associatedText.size(), this.data.size());
            } else {
                processAAD(this.associatedText.getBuffer(), 0, this.associatedText.size(), this.data.size() - this.macSize);
            }
        }
        if (!this.forEncryption) {
            if ((i2 - this.macSize) % this.engine.getBlockSize() != 0) {
                throw new DataLengthException("partial blocks not supported");
            }
            this.engine.processBlock(this.nonce, 0, this.f228469s, 0);
            int blockSize = i2 / this.engine.getBlockSize();
            int blockSize2 = i;
            int blockSize3 = i3;
            for (int i6 = 0; i6 < blockSize; i6++) {
                ProcessBlock(bArr, blockSize2, i2, bArr2, blockSize3);
                blockSize2 += this.engine.getBlockSize();
                blockSize3 += this.engine.getBlockSize();
            }
            if (i2 > blockSize2) {
                int i21 = 0;
                while (true) {
                    byte[] bArr3 = this.counter;
                    if (i21 >= bArr3.length) {
                        break;
                    }
                    byte[] bArr4 = this.f228469s;
                    bArr4[i21] = (byte) (bArr4[i21] + bArr3[i21]);
                    i21++;
                }
                this.engine.processBlock(this.f228469s, 0, this.buffer, 0);
                int i22 = 0;
                while (true) {
                    i5 = this.macSize;
                    if (i22 >= i5) {
                        break;
                    }
                    bArr2[blockSize3 + i22] = (byte) (this.buffer[i22] ^ bArr[blockSize2 + i22]);
                    i22++;
                }
                blockSize3 += i5;
            }
            int i32 = 0;
            while (true) {
                byte[] bArr5 = this.counter;
                if (i32 >= bArr5.length) {
                    break;
                }
                byte[] bArr6 = this.f228469s;
                bArr6[i32] = (byte) (bArr6[i32] + bArr5[i32]);
                i32++;
            }
            this.engine.processBlock(this.f228469s, 0, this.buffer, 0);
            int i33 = this.macSize;
            System.arraycopy(bArr2, blockSize3 - i33, this.buffer, 0, i33);
            CalculateMac(bArr2, 0, blockSize3 - this.macSize);
            System.arraycopy(this.macBlock, 0, this.mac, 0, this.macSize);
            int i43 = this.macSize;
            byte[] bArr7 = new byte[i43];
            System.arraycopy(this.buffer, 0, bArr7, 0, i43);
            if (!Arrays.constantTimeAreEqual(this.mac, bArr7)) {
                throw new InvalidCipherTextException("mac check failed");
            }
            reset();
            return i2 - this.macSize;
        }
        if (i2 % this.engine.getBlockSize() != 0) {
            throw new DataLengthException("partial blocks not supported");
        }
        CalculateMac(bArr, i, i2);
        this.engine.processBlock(this.nonce, 0, this.f228469s, 0);
        int blockSize4 = i;
        int blockSize5 = i2;
        int blockSize6 = i3;
        while (blockSize5 > 0) {
            ProcessBlock(bArr, blockSize4, i2, bArr2, blockSize6);
            blockSize5 -= this.engine.getBlockSize();
            blockSize4 += this.engine.getBlockSize();
            blockSize6 += this.engine.getBlockSize();
        }
        int i59 = 0;
        while (true) {
            byte[] bArr8 = this.counter;
            if (i59 >= bArr8.length) {
                break;
            }
            byte[] bArr9 = this.f228469s;
            bArr9[i59] = (byte) (bArr9[i59] + bArr8[i59]);
            i59++;
        }
        this.engine.processBlock(this.f228469s, 0, this.buffer, 0);
        int i66 = 0;
        while (true) {
            int i74 = this.macSize;
            if (i66 >= i74) {
                System.arraycopy(this.macBlock, 0, this.mac, 0, i74);
                reset();
                return this.macSize + i2;
            }
            bArr2[blockSize6 + i66] = (byte) (this.buffer[i66] ^ this.macBlock[i66]);
            i66++;
        }
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void reset() throws IOException {
        Arrays.fill(this.G1, (byte) 0);
        Arrays.fill(this.buffer, (byte) 0);
        Arrays.fill(this.counter, (byte) 0);
        Arrays.fill(this.macBlock, (byte) 0);
        this.counter[0] = 1;
        this.data.reset();
        this.associatedText.reset();
        byte[] bArr = this.initialAssociatedText;
        if (bArr != null) {
            processAADBytes(bArr, 0, bArr.length);
        }
    }

    public KCCMBlockCipher(BlockCipher blockCipher, int i) {
        this.associatedText = new ExposedByteArrayOutputStream();
        this.data = new ExposedByteArrayOutputStream();
        this.Nb_ = 4;
        this.engine = blockCipher;
        this.macSize = blockCipher.getBlockSize();
        this.nonce = new byte[blockCipher.getBlockSize()];
        this.initialAssociatedText = new byte[blockCipher.getBlockSize()];
        this.mac = new byte[blockCipher.getBlockSize()];
        this.macBlock = new byte[blockCipher.getBlockSize()];
        this.G1 = new byte[blockCipher.getBlockSize()];
        this.buffer = new byte[blockCipher.getBlockSize()];
        this.f228469s = new byte[blockCipher.getBlockSize()];
        this.counter = new byte[blockCipher.getBlockSize()];
        setNb(i);
    }
}
