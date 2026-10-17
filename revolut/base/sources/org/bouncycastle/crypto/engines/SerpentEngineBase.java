package org.bouncycastle.crypto.engines;

import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicePurpose;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.constraints.DefaultServiceProperties;
import org.bouncycastle.crypto.params.KeyParameter;

/* JADX INFO: loaded from: classes14.dex */
public abstract class SerpentEngineBase implements BlockCipher {
    protected static final int BLOCK_SIZE = 16;
    static final int PHI = -1640531527;
    static final int ROUNDS = 32;
    protected boolean encrypting;
    protected int keyBits;
    protected int[] wKey;

    public SerpentEngineBase() {
        CryptoServicesRegistrar.checkConstraints(new DefaultServiceProperties(getAlgorithmName(), 256));
    }

    private CryptoServicePurpose getPurpose() {
        return this.wKey == null ? CryptoServicePurpose.ANY : this.encrypting ? CryptoServicePurpose.ENCRYPTION : CryptoServicePurpose.DECRYPTION;
    }

    public static int rotateLeft(int i, int i2) {
        return (i >>> (-i2)) | (i << i2);
    }

    public static int rotateRight(int i, int i2) {
        return (i << (-i2)) | (i >>> i2);
    }

    public final void LT(int[] iArr) {
        int iRotateLeft = rotateLeft(iArr[0], 13);
        int iRotateLeft2 = rotateLeft(iArr[2], 3);
        int i = (iArr[1] ^ iRotateLeft) ^ iRotateLeft2;
        int i2 = (iArr[3] ^ iRotateLeft2) ^ (iRotateLeft << 3);
        iArr[1] = rotateLeft(i, 1);
        int iRotateLeft3 = rotateLeft(i2, 7);
        iArr[3] = iRotateLeft3;
        iArr[0] = rotateLeft((iRotateLeft ^ iArr[1]) ^ iRotateLeft3, 5);
        iArr[2] = rotateLeft((iArr[3] ^ iRotateLeft2) ^ (iArr[1] << 7), 22);
    }

    public abstract void decryptBlock(byte[] bArr, int i, byte[] bArr2, int i2);

    public abstract void encryptBlock(byte[] bArr, int i, byte[] bArr2, int i2);

    @Override // org.bouncycastle.crypto.BlockCipher
    public String getAlgorithmName() {
        return "Serpent";
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int getBlockSize() {
        return 16;
    }

    public final void ib0(int[] iArr, int i, int i2, int i3, int i5) {
        int i6 = ~i;
        int i21 = i2 ^ i;
        int i22 = (i6 | i21) ^ i5;
        int i32 = i3 ^ i22;
        int i33 = i21 ^ i32;
        iArr[2] = i33;
        int i43 = (i21 & i5) ^ i6;
        int i59 = (i33 & i43) ^ i22;
        iArr[1] = i59;
        int i66 = (i & i22) ^ (i59 | i32);
        iArr[3] = i66;
        iArr[0] = i66 ^ (i43 ^ i32);
    }

    public final void ib1(int[] iArr, int i, int i2, int i3, int i5) {
        int i6 = i5 ^ i2;
        int i21 = i ^ (i2 & i6);
        int i22 = i6 ^ i21;
        int i32 = i3 ^ i22;
        iArr[3] = i32;
        int i33 = i2 ^ (i6 & i21);
        int i43 = i21 ^ (i32 | i33);
        iArr[1] = i43;
        int i59 = ~i43;
        int i66 = i33 ^ i32;
        iArr[0] = i59 ^ i66;
        iArr[2] = (i59 | i66) ^ i22;
    }

    public final void ib2(int[] iArr, int i, int i2, int i3, int i5) {
        int i6 = i2 ^ i5;
        int i21 = ~i6;
        int i22 = i ^ i3;
        int i32 = i3 ^ i6;
        int i33 = (i2 & i32) ^ i22;
        iArr[0] = i33;
        int i43 = (((i | i21) ^ i5) | i22) ^ i6;
        iArr[3] = i43;
        int i59 = ~i32;
        int i66 = i43 | i33;
        iArr[1] = i59 ^ i66;
        iArr[2] = (i66 ^ i22) ^ (i5 & i59);
    }

    public final void ib3(int[] iArr, int i, int i2, int i3, int i5) {
        int i6 = i | i2;
        int i21 = i2 ^ i3;
        int i22 = i ^ (i2 & i21);
        int i32 = i3 ^ i22;
        int i33 = i5 | i22;
        int i43 = i21 ^ i33;
        iArr[0] = i43;
        int i59 = (i33 | i21) ^ i5;
        iArr[2] = i32 ^ i59;
        int i66 = i6 ^ i59;
        int i74 = i22 ^ (i43 & i66);
        iArr[3] = i74;
        iArr[1] = i74 ^ (i66 ^ i43);
    }

    public final void ib4(int[] iArr, int i, int i2, int i3, int i5) {
        int i6 = i2 ^ ((i3 | i5) & i);
        int i21 = i3 ^ (i & i6);
        int i22 = i5 ^ i21;
        iArr[1] = i22;
        int i32 = ~i;
        int i33 = (i21 & i22) ^ i6;
        iArr[3] = i33;
        int i43 = i5 ^ (i22 | i32);
        iArr[0] = i33 ^ i43;
        iArr[2] = (i32 ^ i22) ^ (i6 & i43);
    }

    public final void ib5(int[] iArr, int i, int i2, int i3, int i5) {
        int i6 = ~i3;
        int i21 = (i2 & i6) ^ i5;
        int i22 = i & i21;
        int i32 = (i2 ^ i6) ^ i22;
        iArr[3] = i32;
        int i33 = i32 | i2;
        iArr[1] = i21 ^ (i & i33);
        int i43 = i5 | i;
        iArr[0] = (i6 ^ i33) ^ i43;
        iArr[2] = ((i ^ i3) | i22) ^ (i2 & i43);
    }

    public final void ib6(int[] iArr, int i, int i2, int i3, int i5) {
        int i6 = ~i;
        int i21 = i ^ i2;
        int i22 = i3 ^ i21;
        int i32 = (i3 | i6) ^ i5;
        iArr[1] = i22 ^ i32;
        int i33 = i21 ^ (i22 & i32);
        int i43 = i32 ^ (i2 | i33);
        iArr[3] = i43;
        int i59 = i2 | i43;
        iArr[0] = i33 ^ i59;
        iArr[2] = (i5 & i6) ^ (i59 ^ i22);
    }

    public final void ib7(int[] iArr, int i, int i2, int i3, int i5) {
        int i6 = (i & i2) | i3;
        int i21 = (i | i2) & i5;
        int i22 = i6 ^ i21;
        iArr[3] = i22;
        int i32 = i2 ^ i21;
        int i33 = ((i22 ^ (~i5)) | i32) ^ i;
        iArr[1] = i33;
        int i43 = (i32 ^ i3) ^ (i5 | i33);
        iArr[0] = i43;
        iArr[2] = ((i & i22) ^ i43) ^ (i6 ^ i33);
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void init(boolean z, CipherParameters cipherParameters) {
        if (cipherParameters instanceof KeyParameter) {
            this.encrypting = z;
            byte[] key = ((KeyParameter) cipherParameters).getKey();
            this.wKey = makeWorkingKey(key);
            CryptoServicesRegistrar.checkConstraints(new DefaultServiceProperties(getAlgorithmName(), key.length * 8, cipherParameters, getPurpose()));
            return;
        }
        throw new IllegalArgumentException("invalid parameter passed to " + getAlgorithmName() + " init - " + cipherParameters.getClass().getName());
    }

    public final void inverseLT(int[] iArr) {
        int iRotateRight = (rotateRight(iArr[2], 22) ^ iArr[3]) ^ (iArr[1] << 7);
        int iRotateRight2 = rotateRight(iArr[0], 5) ^ iArr[1];
        int i = iArr[3];
        int i2 = iRotateRight2 ^ i;
        int iRotateRight3 = rotateRight(i, 7);
        int iRotateRight4 = rotateRight(iArr[1], 1);
        iArr[3] = (iRotateRight3 ^ iRotateRight) ^ (i2 << 3);
        iArr[1] = (iRotateRight4 ^ i2) ^ iRotateRight;
        iArr[2] = rotateRight(iRotateRight, 3);
        iArr[0] = rotateRight(i2, 13);
    }

    public abstract int[] makeWorkingKey(byte[] bArr);

    @Override // org.bouncycastle.crypto.BlockCipher
    public final int processBlock(byte[] bArr, int i, byte[] bArr2, int i2) {
        if (this.wKey == null) {
            throw new IllegalStateException(getAlgorithmName() + " not initialised");
        }
        if (i + 16 > bArr.length) {
            throw new DataLengthException("input buffer too short");
        }
        if (i2 + 16 > bArr2.length) {
            throw new OutputLengthException("output buffer too short");
        }
        if (this.encrypting) {
            encryptBlock(bArr, i, bArr2, i2);
            return 16;
        }
        decryptBlock(bArr, i, bArr2, i2);
        return 16;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void reset() {
    }

    public final void sb0(int[] iArr, int i, int i2, int i3, int i5) {
        int i6 = i ^ i5;
        int i21 = i3 ^ i6;
        int i22 = i2 ^ i21;
        int i32 = (i5 & i) ^ i22;
        iArr[3] = i32;
        int i33 = i ^ (i2 & i6);
        iArr[2] = (i3 | i33) ^ i22;
        int i43 = (i21 ^ i33) & i32;
        iArr[1] = (~i21) ^ i43;
        iArr[0] = (~i33) ^ i43;
    }

    public final void sb1(int[] iArr, int i, int i2, int i3, int i5) {
        int i6 = (~i) ^ i2;
        int i21 = (i | i6) ^ i3;
        int i22 = i5 ^ i21;
        iArr[2] = i22;
        int i32 = i2 ^ (i5 | i6);
        int i33 = i22 ^ i6;
        int i43 = (i21 & i32) ^ i33;
        iArr[3] = i43;
        int i59 = i32 ^ i21;
        iArr[1] = i43 ^ i59;
        iArr[0] = i21 ^ (i59 & i33);
    }

    public final void sb2(int[] iArr, int i, int i2, int i3, int i5) {
        int i6 = ~i;
        int i21 = i2 ^ i5;
        int i22 = (i3 & i6) ^ i21;
        iArr[0] = i22;
        int i32 = i3 ^ i6;
        int i33 = i2 & (i3 ^ i22);
        int i43 = i32 ^ i33;
        iArr[3] = i43;
        int i59 = i ^ ((i33 | i5) & (i22 | i32));
        iArr[2] = i59;
        iArr[1] = (i59 ^ (i5 | i6)) ^ (i21 ^ i43);
    }

    public final void sb3(int[] iArr, int i, int i2, int i3, int i5) {
        int i6 = i ^ i2;
        int i21 = i & i3;
        int i22 = i | i5;
        int i32 = i3 ^ i5;
        int i33 = i21 | (i6 & i22);
        int i43 = i32 ^ i33;
        iArr[2] = i43;
        int i59 = (i22 ^ i2) ^ i33;
        int i66 = i6 ^ (i32 & i59);
        iArr[0] = i66;
        int i74 = i66 & i43;
        iArr[1] = i59 ^ i74;
        iArr[3] = (i2 | i5) ^ (i32 ^ i74);
    }

    public final void sb4(int[] iArr, int i, int i2, int i3, int i5) {
        int i6 = i ^ i5;
        int i21 = i3 ^ (i5 & i6);
        int i22 = i2 | i21;
        iArr[3] = i6 ^ i22;
        int i32 = ~i2;
        int i33 = (i6 | i32) ^ i21;
        iArr[0] = i33;
        int i43 = i32 ^ i6;
        int i59 = (i22 & i43) ^ (i33 & i);
        iArr[2] = i59;
        iArr[1] = (i ^ i21) ^ (i43 & i59);
    }

    public final void sb5(int[] iArr, int i, int i2, int i3, int i5) {
        int i6 = ~i;
        int i21 = i ^ i2;
        int i22 = i ^ i5;
        int i32 = (i3 ^ i6) ^ (i21 | i22);
        iArr[0] = i32;
        int i33 = i5 & i32;
        int i43 = (i21 ^ i32) ^ i33;
        iArr[1] = i43;
        int i59 = i22 ^ (i32 | i6);
        iArr[2] = (i21 | i33) ^ i59;
        iArr[3] = (i59 & i43) ^ (i2 ^ i33);
    }

    public final void sb6(int[] iArr, int i, int i2, int i3, int i5) {
        int i6 = ~i;
        int i21 = i ^ i5;
        int i22 = i2 ^ i21;
        int i32 = i3 ^ (i6 | i21);
        int i33 = i2 ^ i32;
        iArr[1] = i33;
        int i43 = (i21 | i33) ^ i5;
        int i59 = (i32 & i43) ^ i22;
        iArr[2] = i59;
        int i66 = i43 ^ i32;
        iArr[0] = i59 ^ i66;
        iArr[3] = (i66 & i22) ^ (~i32);
    }

    public final void sb7(int[] iArr, int i, int i2, int i3, int i5) {
        int i6 = i2 ^ i3;
        int i21 = (i3 & i6) ^ i5;
        int i22 = i ^ i21;
        int i32 = i2 ^ ((i5 | i6) & i22);
        iArr[1] = i32;
        int i33 = (i & i22) ^ i6;
        iArr[3] = i33;
        int i43 = (i32 | i21) ^ i22;
        int i59 = i21 ^ (i33 & i43);
        iArr[2] = i59;
        iArr[0] = (i33 & i59) ^ (~i43);
    }
}
