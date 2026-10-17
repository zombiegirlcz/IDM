package org.bouncycastle.pqc.crypto.sphincs;

import org.bouncycastle.crypto.Digest;
import org.bouncycastle.util.Strings;

/* JADX INFO: loaded from: classes14.dex */
class HashFunctions {
    private static final byte[] hashc = Strings.toByteArray("expand 32-byte to 64-byte state!");
    private final Digest dig256;
    private final Digest dig512;
    private final Permute perm;

    public HashFunctions(Digest digest) {
        this(digest, null);
    }

    public Digest getMessageHash() {
        return this.dig512;
    }

    public int hash_2n_n(byte[] bArr, int i, byte[] bArr2, int i2) {
        byte[] bArr3 = new byte[64];
        for (int i3 = 0; i3 < 32; i3++) {
            bArr3[i3] = bArr2[i2 + i3];
            bArr3[i3 + 32] = hashc[i3];
        }
        this.perm.chacha_permute(bArr3, bArr3);
        for (int i5 = 0; i5 < 32; i5++) {
            bArr3[i5] = (byte) (bArr3[i5] ^ bArr2[(i2 + i5) + 32]);
        }
        this.perm.chacha_permute(bArr3, bArr3);
        for (int i6 = 0; i6 < 32; i6++) {
            bArr[i + i6] = bArr3[i6];
        }
        return 0;
    }

    public int hash_2n_n_mask(byte[] bArr, int i, byte[] bArr2, int i2, byte[] bArr3, int i3) {
        byte[] bArr4 = new byte[64];
        for (int i5 = 0; i5 < 64; i5++) {
            bArr4[i5] = (byte) (bArr2[i2 + i5] ^ bArr3[i3 + i5]);
        }
        return hash_2n_n(bArr, i, bArr4, 0);
    }

    public int hash_n_n(byte[] bArr, int i, byte[] bArr2, int i2) {
        byte[] bArr3 = new byte[64];
        for (int i3 = 0; i3 < 32; i3++) {
            bArr3[i3] = bArr2[i2 + i3];
            bArr3[i3 + 32] = hashc[i3];
        }
        this.perm.chacha_permute(bArr3, bArr3);
        for (int i5 = 0; i5 < 32; i5++) {
            bArr[i + i5] = bArr3[i5];
        }
        return 0;
    }

    public int hash_n_n_mask(byte[] bArr, int i, byte[] bArr2, int i2, byte[] bArr3, int i3) {
        byte[] bArr4 = new byte[32];
        for (int i5 = 0; i5 < 32; i5++) {
            bArr4[i5] = (byte) (bArr2[i2 + i5] ^ bArr3[i3 + i5]);
        }
        return hash_n_n(bArr, i, bArr4, 0);
    }

    public int varlen_hash(byte[] bArr, int i, byte[] bArr2, int i2) {
        this.dig256.update(bArr2, 0, i2);
        this.dig256.doFinal(bArr, i);
        return 0;
    }

    public HashFunctions(Digest digest, Digest digest2) {
        this.perm = new Permute();
        this.dig256 = digest;
        this.dig512 = digest2;
    }
}
