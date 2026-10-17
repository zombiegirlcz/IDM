package org.bouncycastle.crypto.engines;

import com.google.common.base.Ascii;
import com.google.common.primitives.UnsignedBytes;
import net.sf.scuba.smartcards.ISO7816;
import net.sf.scuba.smartcards.ISOFileInfo;
import okl.m;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.constraints.DefaultServiceProperties;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.signers.PSSSigner;
import org.bouncycastle.util.Integers;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes14.dex */
public class NoekeonEngine implements BlockCipher {
    private static final int SIZE = 16;
    private static final byte[] roundConstants = {-128, Ascii.ESC, 54, 108, ISO7816.INS_LOAD_KEY_FILE, ISOFileInfo.AB, 77, -102, 47, 94, PSSSigner.TRAILER_IMPLICIT, 99, -58, -105, 53, 106, -44};
    private boolean _forEncryption;
    private final int[] k = new int[4];
    private boolean _initialised = false;

    private int decryptBlock(byte[] bArr, int i, byte[] bArr2, int i2) {
        int iBigEndianToInt = Pack.bigEndianToInt(bArr, i);
        int iBigEndianToInt2 = Pack.bigEndianToInt(bArr, i + 4);
        int iBigEndianToInt3 = Pack.bigEndianToInt(bArr, i + 8);
        int iBigEndianToInt4 = Pack.bigEndianToInt(bArr, i + 12);
        int[] iArr = this.k;
        int i3 = iArr[0];
        int i5 = iArr[1];
        int i6 = iArr[2];
        int i21 = iArr[3];
        int i22 = 16;
        while (true) {
            int i32 = iBigEndianToInt ^ iBigEndianToInt3;
            int iRotateLeft = i32 ^ (Integers.rotateLeft(i32, 8) ^ Integers.rotateLeft(i32, 24));
            int i33 = iBigEndianToInt2 ^ i5;
            int i43 = iBigEndianToInt4 ^ i21;
            int i59 = i33 ^ i43;
            int iRotateLeft2 = i59 ^ (Integers.rotateLeft(i59, 24) ^ Integers.rotateLeft(i59, 8));
            int i66 = i33 ^ iRotateLeft;
            int i74 = (iBigEndianToInt3 ^ i6) ^ iRotateLeft2;
            int i92 = i43 ^ iRotateLeft;
            int i96 = ((iBigEndianToInt ^ i3) ^ iRotateLeft2) ^ (roundConstants[i22] & UnsignedBytes.MAX_VALUE);
            i22--;
            if (i22 < 0) {
                Pack.intToBigEndian(i96, bArr2, i2);
                Pack.intToBigEndian(i66, bArr2, i2 + 4);
                Pack.intToBigEndian(i74, bArr2, i2 + 8);
                Pack.intToBigEndian(i92, bArr2, i2 + 12);
                return 16;
            }
            int iRotateLeft3 = Integers.rotateLeft(i66, 1);
            int iRotateLeft4 = Integers.rotateLeft(i74, 5);
            int iRotateLeft5 = Integers.rotateLeft(i92, 2);
            int i99 = iRotateLeft3 ^ (iRotateLeft5 | iRotateLeft4);
            int i100 = ~i99;
            int i101 = i96 ^ (iRotateLeft4 & i100);
            int i102 = (iRotateLeft4 ^ (i100 ^ iRotateLeft5)) ^ i101;
            int i103 = i99 ^ (i101 | i102);
            int i104 = iRotateLeft5 ^ (i102 & i103);
            iBigEndianToInt2 = Integers.rotateLeft(i103, 31);
            iBigEndianToInt3 = Integers.rotateLeft(i102, 27);
            int iRotateLeft6 = Integers.rotateLeft(i101, 30);
            iBigEndianToInt = i104;
            iBigEndianToInt4 = iRotateLeft6;
        }
    }

    private int encryptBlock(byte[] bArr, int i, byte[] bArr2, int i2) {
        int iBigEndianToInt = Pack.bigEndianToInt(bArr, i);
        int iBigEndianToInt2 = Pack.bigEndianToInt(bArr, i + 4);
        int iBigEndianToInt3 = Pack.bigEndianToInt(bArr, i + 8);
        int iBigEndianToInt4 = Pack.bigEndianToInt(bArr, i + 12);
        int[] iArr = this.k;
        int i3 = 0;
        int i5 = iArr[0];
        int i6 = 1;
        int i21 = iArr[1];
        int i22 = iArr[2];
        int i32 = iArr[3];
        while (true) {
            int i33 = iBigEndianToInt ^ (roundConstants[i3] & UnsignedBytes.MAX_VALUE);
            int i43 = i33 ^ iBigEndianToInt3;
            int iRotateLeft = i43 ^ (Integers.rotateLeft(i43, 8) ^ Integers.rotateLeft(i43, 24));
            int i59 = iBigEndianToInt2 ^ i21;
            int i66 = iBigEndianToInt4 ^ i32;
            int i74 = i6;
            int i92 = i59 ^ i66;
            int iRotateLeft2 = i92 ^ (Integers.rotateLeft(i92, 24) ^ Integers.rotateLeft(i92, 8));
            int i96 = (i33 ^ i5) ^ iRotateLeft2;
            int i99 = i59 ^ iRotateLeft;
            int i100 = (iBigEndianToInt3 ^ i22) ^ iRotateLeft2;
            int i101 = i66 ^ iRotateLeft;
            i3++;
            if (i3 > 16) {
                Pack.intToBigEndian(i96, bArr2, i2);
                Pack.intToBigEndian(i99, bArr2, i2 + 4);
                Pack.intToBigEndian(i100, bArr2, i2 + 8);
                Pack.intToBigEndian(i101, bArr2, i2 + 12);
                return 16;
            }
            i6 = i74;
            int iRotateLeft3 = Integers.rotateLeft(i99, i6);
            int iRotateLeft4 = Integers.rotateLeft(i100, 5);
            int iRotateLeft5 = Integers.rotateLeft(i101, 2);
            int i102 = iRotateLeft3 ^ (iRotateLeft5 | iRotateLeft4);
            int i103 = ~i102;
            int i104 = i96 ^ (iRotateLeft4 & i103);
            int i105 = (iRotateLeft4 ^ (i103 ^ iRotateLeft5)) ^ i104;
            int i106 = i102 ^ (i104 | i105);
            int i107 = iRotateLeft5 ^ (i105 & i106);
            iBigEndianToInt2 = Integers.rotateLeft(i106, 31);
            iBigEndianToInt3 = Integers.rotateLeft(i105, 27);
            int iRotateLeft6 = Integers.rotateLeft(i104, 30);
            iBigEndianToInt = i107;
            iBigEndianToInt4 = iRotateLeft6;
        }
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public String getAlgorithmName() {
        return "Noekeon";
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int getBlockSize() {
        return 16;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void init(boolean z, CipherParameters cipherParameters) {
        if (!(cipherParameters instanceof KeyParameter)) {
            throw new IllegalArgumentException(m.l("invalid parameter passed to Noekeon init - ", cipherParameters));
        }
        byte[] key = ((KeyParameter) cipherParameters).getKey();
        if (key.length != 16) {
            throw new IllegalArgumentException("Key length not 128 bits.");
        }
        Pack.bigEndianToInt(key, 0, this.k, 0, 4);
        if (!z) {
            int[] iArr = this.k;
            int i = iArr[0];
            int i2 = iArr[1];
            int i3 = iArr[2];
            int i5 = iArr[3];
            int i6 = i ^ i3;
            int iRotateLeft = i6 ^ (Integers.rotateLeft(i6, 8) ^ Integers.rotateLeft(i6, 24));
            int i21 = i2 ^ i5;
            int iRotateLeft2 = (Integers.rotateLeft(i21, 8) ^ Integers.rotateLeft(i21, 24)) ^ i21;
            int i22 = i2 ^ iRotateLeft;
            int i32 = i5 ^ iRotateLeft;
            int[] iArr2 = this.k;
            iArr2[0] = i ^ iRotateLeft2;
            iArr2[1] = i22;
            iArr2[2] = i3 ^ iRotateLeft2;
            iArr2[3] = i32;
        }
        this._forEncryption = z;
        this._initialised = true;
        CryptoServicesRegistrar.checkConstraints(new DefaultServiceProperties(getAlgorithmName(), 128, cipherParameters, Utils.getPurpose(z)));
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i, byte[] bArr2, int i2) {
        if (!this._initialised) {
            throw new IllegalStateException(getAlgorithmName() + " not initialised");
        }
        if (i > bArr.length - 16) {
            throw new DataLengthException("input buffer too short");
        }
        if (i2 <= bArr2.length - 16) {
            return this._forEncryption ? encryptBlock(bArr, i, bArr2, i2) : decryptBlock(bArr, i, bArr2, i2);
        }
        throw new OutputLengthException("output buffer too short");
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void reset() {
    }
}
