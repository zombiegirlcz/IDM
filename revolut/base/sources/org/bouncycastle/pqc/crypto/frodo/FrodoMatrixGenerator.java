package org.bouncycastle.pqc.crypto.frodo;

import ehe.n;
import org.bouncycastle.crypto.MultiBlockCipher;
import org.bouncycastle.crypto.digests.SHAKEDigest;
import org.bouncycastle.crypto.engines.AESEngine;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes14.dex */
abstract class FrodoMatrixGenerator {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final int f228804n;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    final int f228805q;

    public static class Aes128MatrixGenerator extends FrodoMatrixGenerator {
        public Aes128MatrixGenerator(int i, int i2) {
            super(i, i2);
        }

        @Override // org.bouncycastle.pqc.crypto.frodo.FrodoMatrixGenerator
        public short[] genMatrix(byte[] bArr, int i, int i2) {
            int i3 = this.f228804n;
            short[] sArr = new short[i3 * i3];
            byte[] bArr2 = new byte[16];
            byte[] bArr3 = new byte[16];
            MultiBlockCipher multiBlockCipherNewInstance = AESEngine.newInstance();
            multiBlockCipherNewInstance.init(true, new KeyParameter(bArr, i, i2));
            for (int i5 = 0; i5 < this.f228804n; i5++) {
                Pack.shortToLittleEndian((short) i5, bArr2, 0);
                for (int i6 = 0; i6 < this.f228804n; i6 += 8) {
                    Pack.shortToLittleEndian((short) i6, bArr2, 2);
                    multiBlockCipherNewInstance.processBlock(bArr2, 0, bArr3, 0);
                    for (int i21 = 0; i21 < 8; i21++) {
                        sArr[n.a(i5, this.f228804n, i6, i21)] = (short) (Pack.littleEndianToShort(bArr3, i21 * 2) & (this.f228805q - 1));
                    }
                }
            }
            return sArr;
        }
    }

    public static class Shake128MatrixGenerator extends FrodoMatrixGenerator {
        public Shake128MatrixGenerator(int i, int i2) {
            super(i, i2);
        }

        @Override // org.bouncycastle.pqc.crypto.frodo.FrodoMatrixGenerator
        public short[] genMatrix(byte[] bArr, int i, int i2) {
            int i3 = this.f228804n;
            short[] sArr = new short[i3 * i3];
            int i5 = (i3 * 16) / 8;
            byte[] bArr2 = new byte[i5];
            int i6 = i2 + 2;
            byte[] bArr3 = new byte[i6];
            System.arraycopy(bArr, i, bArr3, 2, i2);
            SHAKEDigest sHAKEDigest = new SHAKEDigest(128);
            for (int i21 = 0; i21 < this.f228804n; i21++) {
                Pack.shortToLittleEndian((short) i21, bArr3, 0);
                sHAKEDigest.update(bArr3, 0, i6);
                sHAKEDigest.doFinal(bArr2, 0, i5);
                int i22 = 0;
                while (true) {
                    int i32 = this.f228804n;
                    if (i22 < i32) {
                        sArr[(i32 * i21) + i22] = (short) (Pack.littleEndianToShort(bArr2, i22 * 2) & (this.f228805q - 1));
                        i22++;
                    }
                }
            }
            return sArr;
        }
    }

    public FrodoMatrixGenerator(int i, int i2) {
        this.f228804n = i;
        this.f228805q = i2;
    }

    public abstract short[] genMatrix(byte[] bArr, int i, int i2);
}
