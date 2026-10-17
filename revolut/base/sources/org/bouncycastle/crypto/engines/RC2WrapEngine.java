package org.bouncycastle.crypto.engines;

import com.youTransactor.uCube.rpc.Constants;
import java.security.SecureRandom;
import net.sf.scuba.smartcards.ISO7816;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.Wrapper;
import org.bouncycastle.crypto.modes.CBCBlockCipher;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.crypto.util.DigestFactory;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes14.dex */
public class RC2WrapEngine implements Wrapper {
    private static final byte[] IV2 = {74, -35, -94, ISO7816.INS_UNBLOCK_CHV, 121, -24, Constants.NFC_READER, 5};
    private CBCBlockCipher engine;
    private boolean forWrapping;

    /* JADX INFO: renamed from: iv, reason: collision with root package name */
    private byte[] f228373iv;
    private CipherParameters param;
    private ParametersWithIV paramPlusIV;

    /* JADX INFO: renamed from: sr, reason: collision with root package name */
    private SecureRandom f228374sr;
    Digest sha1 = DigestFactory.createSHA1();
    byte[] digest = new byte[20];

    private byte[] calculateCMSKeyChecksum(byte[] bArr) {
        byte[] bArr2 = new byte[8];
        this.sha1.update(bArr, 0, bArr.length);
        this.sha1.doFinal(this.digest, 0);
        System.arraycopy(this.digest, 0, bArr2, 0, 8);
        return bArr2;
    }

    private boolean checkCMSKeyChecksum(byte[] bArr, byte[] bArr2) {
        return Arrays.constantTimeAreEqual(calculateCMSKeyChecksum(bArr), bArr2);
    }

    @Override // org.bouncycastle.crypto.Wrapper
    public String getAlgorithmName() {
        return "RC2";
    }

    @Override // org.bouncycastle.crypto.Wrapper
    public void init(boolean z, CipherParameters cipherParameters) {
        this.forWrapping = z;
        this.engine = new CBCBlockCipher(new RC2Engine());
        if (cipherParameters instanceof ParametersWithRandom) {
            ParametersWithRandom parametersWithRandom = (ParametersWithRandom) cipherParameters;
            this.f228374sr = parametersWithRandom.getRandom();
            cipherParameters = parametersWithRandom.getParameters();
        } else {
            this.f228374sr = CryptoServicesRegistrar.getSecureRandom();
        }
        if (!(cipherParameters instanceof ParametersWithIV)) {
            this.param = cipherParameters;
            if (this.forWrapping) {
                byte[] bArr = new byte[8];
                this.f228373iv = bArr;
                this.f228374sr.nextBytes(bArr);
                this.paramPlusIV = new ParametersWithIV(this.param, this.f228373iv);
                return;
            }
            return;
        }
        ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
        this.paramPlusIV = parametersWithIV;
        this.f228373iv = parametersWithIV.getIV();
        this.param = this.paramPlusIV.getParameters();
        if (!this.forWrapping) {
            throw new IllegalArgumentException("You should not supply an IV for unwrapping");
        }
        byte[] bArr2 = this.f228373iv;
        if (bArr2 == null || bArr2.length != 8) {
            throw new IllegalArgumentException("IV is not 8 octets");
        }
    }

    @Override // org.bouncycastle.crypto.Wrapper
    public byte[] unwrap(byte[] bArr, int i, int i2) throws InvalidCipherTextException {
        if (this.forWrapping) {
            throw new IllegalStateException("Not set for unwrapping");
        }
        if (bArr == null) {
            throw new InvalidCipherTextException("Null pointer as ciphertext");
        }
        if (i2 % this.engine.getBlockSize() != 0) {
            throw new InvalidCipherTextException("Ciphertext not multiple of " + this.engine.getBlockSize());
        }
        this.engine.init(false, new ParametersWithIV(this.param, IV2));
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        for (int i3 = 0; i3 < i2 / this.engine.getBlockSize(); i3++) {
            int blockSize = this.engine.getBlockSize() * i3;
            this.engine.processBlock(bArr2, blockSize, bArr2, blockSize);
        }
        byte[] bArr3 = new byte[i2];
        int i5 = 0;
        while (i5 < i2) {
            int i6 = i5 + 1;
            bArr3[i5] = bArr2[i2 - i6];
            i5 = i6;
        }
        byte[] bArr4 = new byte[8];
        this.f228373iv = bArr4;
        int i21 = i2 - 8;
        byte[] bArr5 = new byte[i21];
        System.arraycopy(bArr3, 0, bArr4, 0, 8);
        System.arraycopy(bArr3, 8, bArr5, 0, i21);
        ParametersWithIV parametersWithIV = new ParametersWithIV(this.param, this.f228373iv);
        this.paramPlusIV = parametersWithIV;
        this.engine.init(false, parametersWithIV);
        byte[] bArr6 = new byte[i21];
        System.arraycopy(bArr5, 0, bArr6, 0, i21);
        for (int i22 = 0; i22 < i21 / this.engine.getBlockSize(); i22++) {
            int blockSize2 = this.engine.getBlockSize() * i22;
            this.engine.processBlock(bArr6, blockSize2, bArr6, blockSize2);
        }
        int i32 = i2 - 16;
        byte[] bArr7 = new byte[i32];
        byte[] bArr8 = new byte[8];
        System.arraycopy(bArr6, 0, bArr7, 0, i32);
        System.arraycopy(bArr6, i32, bArr8, 0, 8);
        if (!checkCMSKeyChecksum(bArr7, bArr8)) {
            throw new InvalidCipherTextException("Checksum inside ciphertext is corrupted");
        }
        int i33 = bArr7[0];
        if (i32 - ((i33 & 255) + 1) <= 7) {
            byte[] bArr9 = new byte[i33];
            System.arraycopy(bArr7, 1, bArr9, 0, i33);
            return bArr9;
        }
        throw new InvalidCipherTextException("too many pad bytes (" + (i32 - ((bArr7[0] & 255) + 1)) + ")");
    }

    @Override // org.bouncycastle.crypto.Wrapper
    public byte[] wrap(byte[] bArr, int i, int i2) {
        if (!this.forWrapping) {
            throw new IllegalStateException("Not initialized for wrapping");
        }
        int i3 = i2 + 1;
        int i5 = i3 % 8;
        int i6 = i5 != 0 ? (8 - i5) + i3 : i3;
        byte[] bArr2 = new byte[i6];
        bArr2[0] = (byte) i2;
        System.arraycopy(bArr, i, bArr2, 1, i2);
        int i21 = (i6 - i2) - 1;
        byte[] bArr3 = new byte[i21];
        if (i21 > 0) {
            this.f228374sr.nextBytes(bArr3);
            System.arraycopy(bArr3, 0, bArr2, i3, i21);
        }
        byte[] bArrCalculateCMSKeyChecksum = calculateCMSKeyChecksum(bArr2);
        int length = bArrCalculateCMSKeyChecksum.length + i6;
        byte[] bArr4 = new byte[length];
        System.arraycopy(bArr2, 0, bArr4, 0, i6);
        System.arraycopy(bArrCalculateCMSKeyChecksum, 0, bArr4, i6, bArrCalculateCMSKeyChecksum.length);
        byte[] bArr5 = new byte[length];
        System.arraycopy(bArr4, 0, bArr5, 0, length);
        int blockSize = length / this.engine.getBlockSize();
        if (length % this.engine.getBlockSize() != 0) {
            throw new IllegalStateException("Not multiple of block length");
        }
        this.engine.init(true, this.paramPlusIV);
        for (int i22 = 0; i22 < blockSize; i22++) {
            int blockSize2 = this.engine.getBlockSize() * i22;
            this.engine.processBlock(bArr5, blockSize2, bArr5, blockSize2);
        }
        byte[] bArr6 = this.f228373iv;
        int length2 = bArr6.length + length;
        byte[] bArr7 = new byte[length2];
        System.arraycopy(bArr6, 0, bArr7, 0, bArr6.length);
        System.arraycopy(bArr5, 0, bArr7, this.f228373iv.length, length);
        byte[] bArr8 = new byte[length2];
        int i32 = 0;
        while (i32 < length2) {
            int i33 = i32 + 1;
            bArr8[i32] = bArr7[length2 - i33];
            i32 = i33;
        }
        this.engine.init(true, new ParametersWithIV(this.param, IV2));
        for (int i43 = 0; i43 < blockSize + 1; i43++) {
            int blockSize3 = this.engine.getBlockSize() * i43;
            this.engine.processBlock(bArr8, blockSize3, bArr8, blockSize3);
        }
        return bArr8;
    }
}
