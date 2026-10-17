package org.bouncycastle.jce.provider;

import com.google.common.primitives.UnsignedBytes;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.PBEParametersGenerator;
import org.bouncycastle.crypto.digests.MD5Digest;
import org.bouncycastle.crypto.digests.RIPEMD160Digest;
import org.bouncycastle.crypto.digests.SHA1Digest;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;

/* JADX INFO: loaded from: classes14.dex */
class OldPKCS12ParametersGenerator extends PBEParametersGenerator {
    public static final int IV_MATERIAL = 2;
    public static final int KEY_MATERIAL = 1;
    public static final int MAC_MATERIAL = 3;
    private Digest digest;
    private int u;
    private int v;

    public OldPKCS12ParametersGenerator(Digest digest) {
        this.digest = digest;
        if (digest instanceof MD5Digest) {
            this.u = 16;
        } else {
            if (!(digest instanceof SHA1Digest) && !(digest instanceof RIPEMD160Digest)) {
                throw new IllegalArgumentException("Digest " + digest.getAlgorithmName() + " unsupported");
            }
            this.u = 20;
        }
        this.v = 64;
    }

    private void adjust(byte[] bArr, int i, byte[] bArr2) {
        int i2 = (bArr2[bArr2.length - 1] & UnsignedBytes.MAX_VALUE) + (bArr[(bArr2.length + i) - 1] & UnsignedBytes.MAX_VALUE) + 1;
        bArr[(bArr2.length + i) - 1] = (byte) i2;
        int i3 = i2 >>> 8;
        for (int length = bArr2.length - 2; length >= 0; length--) {
            int i5 = i + length;
            int i6 = (bArr2[length] & UnsignedBytes.MAX_VALUE) + (bArr[i5] & UnsignedBytes.MAX_VALUE) + i3;
            bArr[i5] = (byte) i6;
            i3 = i6 >>> 8;
        }
    }

    private byte[] generateDerivedKey(int i, int i2) {
        byte[] bArr;
        byte[] bArr2;
        int i3;
        int i5 = this.v;
        byte[] bArr3 = new byte[i5];
        byte[] bArr4 = new byte[i2];
        int i6 = 0;
        for (int i21 = 0; i21 != i5; i21++) {
            bArr3[i21] = (byte) i;
        }
        byte[] bArr5 = this.salt;
        int i22 = 1;
        if (bArr5 == null || bArr5.length == 0) {
            bArr = new byte[0];
        } else {
            int i32 = this.v;
            int length = (((bArr5.length + i32) - 1) / i32) * i32;
            bArr = new byte[length];
            for (int i33 = 0; i33 != length; i33++) {
                byte[] bArr6 = this.salt;
                bArr[i33] = bArr6[i33 % bArr6.length];
            }
        }
        byte[] bArr7 = this.password;
        if (bArr7 == null || bArr7.length == 0) {
            bArr2 = new byte[0];
        } else {
            int i43 = this.v;
            int length2 = (((bArr7.length + i43) - 1) / i43) * i43;
            bArr2 = new byte[length2];
            for (int i59 = 0; i59 != length2; i59++) {
                byte[] bArr8 = this.password;
                bArr2[i59] = bArr8[i59 % bArr8.length];
            }
        }
        int length3 = bArr.length + bArr2.length;
        byte[] bArr9 = new byte[length3];
        System.arraycopy(bArr, 0, bArr9, 0, bArr.length);
        System.arraycopy(bArr2, 0, bArr9, bArr.length, bArr2.length);
        int i66 = this.v;
        byte[] bArr10 = new byte[i66];
        int i74 = this.u;
        int i92 = ((i2 + i74) - 1) / i74;
        int i96 = 1;
        while (i96 <= i92) {
            int i99 = this.u;
            byte[] bArr11 = new byte[i99];
            this.digest.update(bArr3, i6, i5);
            this.digest.update(bArr9, i6, length3);
            this.digest.doFinal(bArr11, i6);
            for (int i100 = i22; i100 < this.iterationCount; i100++) {
                this.digest.update(bArr11, i6, i99);
                this.digest.doFinal(bArr11, i6);
            }
            for (int i101 = i6; i101 != i66; i101++) {
                bArr10[i96] = bArr11[i101 % i99];
            }
            int i102 = i6;
            while (true) {
                int i103 = this.v;
                if (i102 == length3 / i103) {
                    break;
                }
                adjust(bArr9, i103 * i102, bArr10);
                i102++;
            }
            if (i96 == i92) {
                int i104 = i96 - 1;
                int i105 = this.u;
                int i106 = i104 * i105;
                int i107 = i2 - (i104 * i105);
                i3 = 0;
                System.arraycopy(bArr11, 0, bArr4, i106, i107);
            } else {
                i3 = 0;
                System.arraycopy(bArr11, 0, bArr4, (i96 - 1) * this.u, i99);
            }
            i96++;
            i6 = i3;
            i22 = 1;
        }
        return bArr4;
    }

    @Override // org.bouncycastle.crypto.PBEParametersGenerator
    public CipherParameters generateDerivedMacParameters(int i) {
        int i2 = i / 8;
        return new KeyParameter(generateDerivedKey(3, i2), 0, i2);
    }

    @Override // org.bouncycastle.crypto.PBEParametersGenerator
    public CipherParameters generateDerivedParameters(int i) {
        int i2 = i / 8;
        return new KeyParameter(generateDerivedKey(1, i2), 0, i2);
    }

    @Override // org.bouncycastle.crypto.PBEParametersGenerator
    public CipherParameters generateDerivedParameters(int i, int i2) {
        int i3 = i / 8;
        int i5 = i2 / 8;
        byte[] bArrGenerateDerivedKey = generateDerivedKey(1, i3);
        return new ParametersWithIV(new KeyParameter(bArrGenerateDerivedKey, 0, i3), generateDerivedKey(2, i5), 0, i5);
    }
}
