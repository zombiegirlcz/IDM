package org.bouncycastle.crypto.engines;

import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.Wrapper;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes14.dex */
public class RFC3394WrapEngine implements Wrapper {
    private static final byte[] DEFAULT_IV = {-90, -90, -90, -90, -90, -90, -90, -90};
    private final BlockCipher engine;
    private boolean forWrapping;

    /* JADX INFO: renamed from: iv, reason: collision with root package name */
    private final byte[] f228377iv;
    private KeyParameter param;
    private final boolean wrapCipherMode;

    public RFC3394WrapEngine(BlockCipher blockCipher) {
        this(blockCipher, false);
    }

    @Override // org.bouncycastle.crypto.Wrapper
    public String getAlgorithmName() {
        return this.engine.getAlgorithmName();
    }

    @Override // org.bouncycastle.crypto.Wrapper
    public void init(boolean z, CipherParameters cipherParameters) {
        this.forWrapping = z;
        if (cipherParameters instanceof ParametersWithRandom) {
            cipherParameters = ((ParametersWithRandom) cipherParameters).getParameters();
        }
        if (cipherParameters instanceof KeyParameter) {
            this.param = (KeyParameter) cipherParameters;
            System.arraycopy(DEFAULT_IV, 0, this.f228377iv, 0, 8);
        } else if (cipherParameters instanceof ParametersWithIV) {
            ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
            byte[] iv2 = parametersWithIV.getIV();
            if (iv2.length != 8) {
                throw new IllegalArgumentException("IV not equal to 8");
            }
            this.param = (KeyParameter) parametersWithIV.getParameters();
            System.arraycopy(iv2, 0, this.f228377iv, 0, 8);
        }
    }

    @Override // org.bouncycastle.crypto.Wrapper
    public byte[] unwrap(byte[] bArr, int i, int i2) throws InvalidCipherTextException {
        byte[] bArr2;
        if (this.forWrapping) {
            throw new IllegalStateException("not set for unwrapping");
        }
        if (i2 < 16) {
            throw new InvalidCipherTextException("unwrap data too short");
        }
        int i3 = i2 / 8;
        if (i3 * 8 != i2) {
            throw new InvalidCipherTextException("unwrap data must be a multiple of 8 bytes");
        }
        int i5 = 1;
        this.engine.init(!this.wrapCipherMode, this.param);
        byte[] bArr3 = this.f228377iv;
        byte[] bArr4 = new byte[i2 - bArr3.length];
        byte[] bArr5 = new byte[bArr3.length];
        byte[] bArr6 = new byte[bArr3.length + 8];
        int i6 = i3 - 1;
        if (i6 == 1) {
            this.engine.processBlock(bArr, i, bArr6, 0);
            System.arraycopy(bArr6, 0, bArr5, 0, this.f228377iv.length);
            System.arraycopy(bArr6, this.f228377iv.length, bArr4, 0, 8);
        } else {
            System.arraycopy(bArr, i, bArr5, 0, bArr3.length);
            byte[] bArr7 = this.f228377iv;
            System.arraycopy(bArr, bArr7.length + i, bArr4, 0, i2 - bArr7.length);
            for (int i21 = 5; i21 >= 0; i21--) {
                int i22 = i6;
                while (i22 >= i5) {
                    System.arraycopy(bArr5, 0, bArr6, 0, this.f228377iv.length);
                    int i32 = (i22 - 1) * 8;
                    System.arraycopy(bArr4, i32, bArr6, this.f228377iv.length, 8);
                    int i33 = (i6 * i21) + i22;
                    int i43 = i5;
                    while (i33 != 0) {
                        int i59 = i5;
                        int length = this.f228377iv.length - i43;
                        bArr6[length] = (byte) (bArr6[length] ^ ((byte) i33));
                        i33 >>>= 8;
                        i43++;
                        i5 = i59;
                    }
                    this.engine.processBlock(bArr6, 0, bArr6, 0);
                    System.arraycopy(bArr6, 0, bArr5, 0, 8);
                    System.arraycopy(bArr6, 8, bArr4, i32, 8);
                    i22--;
                    i5 = i5;
                }
            }
        }
        if (i6 != i5) {
            if (!Arrays.constantTimeAreEqual(bArr5, this.f228377iv)) {
                throw new InvalidCipherTextException("checksum failed");
            }
        } else if (!Arrays.constantTimeAreEqual(bArr5, this.f228377iv)) {
            System.arraycopy(bArr, i, bArr5, 0, this.f228377iv.length);
            byte[] bArr8 = this.f228377iv;
            System.arraycopy(bArr, i + bArr8.length, bArr4, 0, i2 - bArr8.length);
            int i66 = 5;
            while (true) {
                bArr2 = this.f228377iv;
                if (i66 < 0) {
                    break;
                }
                System.arraycopy(bArr5, 0, bArr6, 0, bArr2.length);
                System.arraycopy(bArr4, 0, bArr6, this.f228377iv.length, 8);
                int i74 = (i6 * i66) + 1;
                int i92 = 1;
                while (i74 != 0) {
                    int length2 = this.f228377iv.length - i92;
                    bArr6[length2] = (byte) (((byte) i74) ^ bArr6[length2]);
                    i74 >>>= 8;
                    i92++;
                }
                this.engine.processBlock(bArr6, 0, bArr6, 0);
                System.arraycopy(bArr6, 0, bArr5, 0, 8);
                System.arraycopy(bArr6, 8, bArr4, 0, 8);
                i66--;
            }
            if (!Arrays.constantTimeAreEqual(bArr5, bArr2)) {
                throw new InvalidCipherTextException("checksum failed");
            }
        }
        return bArr4;
    }

    @Override // org.bouncycastle.crypto.Wrapper
    public byte[] wrap(byte[] bArr, int i, int i2) {
        if (!this.forWrapping) {
            throw new IllegalStateException("not set for wrapping");
        }
        if (i2 < 8) {
            throw new DataLengthException("wrap data must be at least 8 bytes");
        }
        int i3 = i2 / 8;
        if (i3 * 8 != i2) {
            throw new DataLengthException("wrap data must be a multiple of 8 bytes");
        }
        this.engine.init(this.wrapCipherMode, this.param);
        byte[] bArr2 = this.f228377iv;
        byte[] bArr3 = new byte[bArr2.length + i2];
        System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
        System.arraycopy(bArr, i, bArr3, this.f228377iv.length, i2);
        if (i3 == 1) {
            this.engine.processBlock(bArr3, 0, bArr3, 0);
            return bArr3;
        }
        byte[] bArr4 = new byte[this.f228377iv.length + 8];
        for (int i5 = 0; i5 != 6; i5++) {
            for (int i6 = 1; i6 <= i3; i6++) {
                System.arraycopy(bArr3, 0, bArr4, 0, this.f228377iv.length);
                int i21 = i6 * 8;
                System.arraycopy(bArr3, i21, bArr4, this.f228377iv.length, 8);
                this.engine.processBlock(bArr4, 0, bArr4, 0);
                int i22 = (i3 * i5) + i6;
                int i32 = 1;
                while (i22 != 0) {
                    int length = this.f228377iv.length - i32;
                    bArr4[length] = (byte) (((byte) i22) ^ bArr4[length]);
                    i22 >>>= 8;
                    i32++;
                }
                System.arraycopy(bArr4, 0, bArr3, 0, 8);
                System.arraycopy(bArr4, 8, bArr3, i21, 8);
            }
        }
        return bArr3;
    }

    public RFC3394WrapEngine(BlockCipher blockCipher, boolean z) {
        this.f228377iv = new byte[8];
        this.param = null;
        this.forWrapping = true;
        this.engine = blockCipher;
        this.wrapCipherMode = !z;
    }
}
