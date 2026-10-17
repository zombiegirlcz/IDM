package org.bouncycastle.pqc.crypto.sphincs;

import ch.qos.logback.core.util.FileSize;
import com.google.common.primitives.UnsignedBytes;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.pqc.crypto.MessageSigner;
import org.bouncycastle.pqc.crypto.sphincs.Tree;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes14.dex */
public class SPHINCS256Signer implements MessageSigner {
    private final HashFunctions hashFunctions;
    private byte[] keyData;

    public SPHINCS256Signer(Digest digest, Digest digest2) {
        if (digest.getDigestSize() != 32) {
            throw new IllegalArgumentException("n-digest needs to produce 32 bytes of output");
        }
        if (digest2.getDigestSize() != 64) {
            throw new IllegalArgumentException("2n-digest needs to produce 64 bytes of output");
        }
        this.hashFunctions = new HashFunctions(digest, digest2);
    }

    public static void compute_authpath_wots(HashFunctions hashFunctions, byte[] bArr, byte[] bArr2, int i, Tree.leafaddr leafaddrVar, byte[] bArr3, byte[] bArr4, int i2) {
        long j2;
        long j3;
        Tree.leafaddr leafaddrVar2 = new Tree.leafaddr(leafaddrVar);
        byte[] bArr5 = new byte[2048];
        byte[] bArr6 = new byte[1024];
        byte[] bArr7 = new byte[68608];
        long j5 = 0;
        leafaddrVar2.subleaf = 0L;
        while (true) {
            long j16 = leafaddrVar2.subleaf;
            j2 = 32;
            if (j16 >= 32) {
                break;
            }
            Seed.get_seed(hashFunctions, bArr6, (int) (j16 * 32), bArr3, leafaddrVar2);
            leafaddrVar2.subleaf++;
        }
        HashFunctions hashFunctions2 = hashFunctions;
        Wots wots = new Wots();
        leafaddrVar2.subleaf = 0L;
        while (true) {
            long j22 = leafaddrVar2.subleaf;
            j3 = j2;
            if (j22 >= j2) {
                break;
            }
            HashFunctions hashFunctions3 = hashFunctions2;
            byte[] bArr8 = bArr7;
            wots.wots_pkgen(hashFunctions3, bArr8, (int) (j22 * 2144), bArr6, (int) (j22 * j3), bArr4, 0);
            bArr7 = bArr8;
            leafaddrVar2.subleaf++;
            hashFunctions2 = hashFunctions;
            j2 = j3;
        }
        while (true) {
            leafaddrVar2.subleaf = j5;
            long j42 = leafaddrVar2.subleaf;
            if (j42 >= j3) {
                break;
            }
            Tree.l_tree(hashFunctions, bArr5, (int) ((j42 * j3) + FileSize.KB_COEFFICIENT), bArr7, (int) (j42 * 2144), bArr4, 0);
            j5 = leafaddrVar2.subleaf + 1;
        }
        int i3 = 0;
        for (int i5 = 32; i5 > 0; i5 >>>= 1) {
            for (int i6 = 0; i6 < i5; i6 += 2) {
                hashFunctions.hash_2n_n_mask(bArr5, ((i6 >>> 1) * 32) + ((i5 >>> 1) * 32), bArr5, (i6 * 32) + (i5 * 32), bArr4, (i3 + 7) * 64);
            }
            i3++;
        }
        int i21 = (int) leafaddrVar.subleaf;
        for (int i22 = 0; i22 < i2; i22++) {
            System.arraycopy(bArr5, (((i21 >>> i22) ^ 1) * 32) + ((32 >>> i22) * 32), bArr2, (i22 * 32) + i, 32);
        }
        System.arraycopy(bArr5, 32, bArr, 0, 32);
    }

    public static void validate_authpath(HashFunctions hashFunctions, byte[] bArr, byte[] bArr2, int i, byte[] bArr3, int i2, byte[] bArr4, int i3) {
        byte[] bArr5 = new byte[64];
        if ((i & 1) != 0) {
            for (int i5 = 0; i5 < 32; i5++) {
                bArr5[i5 + 32] = bArr2[i5];
            }
            for (int i6 = 0; i6 < 32; i6++) {
                bArr5[i6] = bArr3[i2 + i6];
            }
        } else {
            for (int i21 = 0; i21 < 32; i21++) {
                bArr5[i21] = bArr2[i21];
            }
            for (int i22 = 0; i22 < 32; i22++) {
                bArr5[i22 + 32] = bArr3[i2 + i22];
            }
        }
        int i32 = i2 + 32;
        int i33 = i;
        int i43 = 0;
        while (i43 < i3 - 1) {
            int i59 = i33 >>> 1;
            if ((i59 & 1) != 0) {
                hashFunctions.hash_2n_n_mask(bArr5, 32, bArr5, 0, bArr4, (i43 + 7) * 64);
                for (int i66 = 0; i66 < 32; i66++) {
                    bArr5[i66] = bArr3[i32 + i66];
                }
            } else {
                hashFunctions.hash_2n_n_mask(bArr5, 0, bArr5, 0, bArr4, (i43 + 7) * 64);
                for (int i74 = 0; i74 < 32; i74++) {
                    bArr5[i74 + 32] = bArr3[i32 + i74];
                }
            }
            i32 += 32;
            i43++;
            i33 = i59;
        }
        hashFunctions.hash_2n_n_mask(bArr, 0, bArr5, 0, bArr4, (i3 + 6) * 64);
    }

    private void zerobytes(byte[] bArr, int i, int i2) {
        for (int i3 = 0; i3 != i2; i3++) {
            bArr[i + i3] = 0;
        }
    }

    public byte[] crypto_sign(HashFunctions hashFunctions, byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[41000];
        byte[] bArr4 = new byte[32];
        byte[] bArr5 = new byte[64];
        long[] jArr = new long[8];
        byte[] bArr6 = new byte[32];
        byte[] bArr7 = new byte[32];
        byte[] bArr8 = new byte[1024];
        byte[] bArr9 = new byte[1088];
        for (int i = 0; i < 1088; i++) {
            bArr9[i] = bArr2[i];
        }
        System.arraycopy(bArr9, 1056, bArr3, 40968, 32);
        Digest messageHash = hashFunctions.getMessageHash();
        byte[] bArr10 = new byte[messageHash.getDigestSize()];
        messageHash.update(bArr3, 40968, 32);
        messageHash.update(bArr, 0, bArr.length);
        messageHash.doFinal(bArr10, 0);
        zerobytes(bArr3, 40968, 32);
        for (int i2 = 0; i2 != 8; i2++) {
            jArr[i2] = Pack.littleEndianToLong(bArr10, i2 * 8);
        }
        long j2 = jArr[0] & 1152921504606846975L;
        System.arraycopy(bArr10, 16, bArr4, 0, 32);
        System.arraycopy(bArr4, 0, bArr3, 39912, 32);
        Tree.leafaddr leafaddrVar = new Tree.leafaddr();
        leafaddrVar.level = 11;
        leafaddrVar.subtree = 0L;
        leafaddrVar.subleaf = 0L;
        System.arraycopy(bArr9, 32, bArr3, 39944, 1024);
        HashFunctions hashFunctions2 = hashFunctions;
        Tree.treehash(hashFunctions2, bArr3, 40968, 5, bArr9, leafaddrVar, bArr3, 39944);
        byte[] bArr11 = bArr9;
        Digest messageHash2 = hashFunctions2.getMessageHash();
        messageHash2.update(bArr3, 39912, 1088);
        messageHash2.update(bArr, 0, bArr.length);
        messageHash2.doFinal(bArr5, 0);
        Tree.leafaddr leafaddrVar2 = new Tree.leafaddr();
        int i3 = 12;
        leafaddrVar2.level = 12;
        leafaddrVar2.subleaf = (int) (r19 & 31);
        leafaddrVar2.subtree = j2 >>> 5;
        int i5 = 32;
        for (int i6 = 0; i6 < 32; i6++) {
            bArr3[i6] = bArr4[i6];
        }
        System.arraycopy(bArr11, 32, bArr8, 0, 1024);
        int i21 = 0;
        while (i21 < 8) {
            bArr3[i5 + i21] = (byte) ((j2 >>> (i21 * 8)) & 255);
            i21++;
            i5 = 32;
        }
        Seed.get_seed(hashFunctions2, bArr7, 0, bArr11, leafaddrVar2);
        new Horst();
        byte[] bArr12 = bArr8;
        byte[] bArr13 = bArr6;
        byte[] bArr14 = bArr7;
        int i22 = 0;
        int iHorst_sign = 40 + Horst.horst_sign(hashFunctions2, bArr3, 40, bArr13, bArr14, bArr12, bArr5);
        Wots wots = new Wots();
        int i32 = 0;
        while (i32 < i3) {
            leafaddrVar2.level = i32;
            Seed.get_seed(hashFunctions2, bArr14, i22, bArr11, leafaddrVar2);
            byte[] bArr15 = bArr3;
            HashFunctions hashFunctions3 = hashFunctions2;
            Wots wots2 = wots;
            byte[] bArr16 = bArr12;
            byte[] bArr17 = bArr14;
            byte[] bArr18 = bArr13;
            int i33 = iHorst_sign;
            wots2.wots_sign(hashFunctions3, bArr15, i33, bArr18, bArr17, bArr16);
            byte[] bArr19 = bArr11;
            Tree.leafaddr leafaddrVar3 = leafaddrVar2;
            compute_authpath_wots(hashFunctions, bArr18, bArr15, i33 + 2144, leafaddrVar3, bArr19, bArr16, 5);
            bArr13 = bArr18;
            bArr3 = bArr15;
            iHorst_sign = i33 + 2304;
            long j3 = leafaddrVar3.subtree;
            leafaddrVar3.subleaf = (int) (j3 & 31);
            leafaddrVar3.subtree = j3 >>> 5;
            i32++;
            leafaddrVar2 = leafaddrVar3;
            bArr11 = bArr19;
            bArr12 = bArr16;
            bArr14 = bArr17;
            i22 = 0;
            i3 = 12;
            hashFunctions2 = hashFunctions;
            wots = wots2;
        }
        zerobytes(bArr11, i22, 1088);
        return bArr3;
    }

    @Override // org.bouncycastle.pqc.crypto.MessageSigner
    public byte[] generateSignature(byte[] bArr) {
        return crypto_sign(this.hashFunctions, bArr, this.keyData);
    }

    @Override // org.bouncycastle.pqc.crypto.MessageSigner
    public void init(boolean z, CipherParameters cipherParameters) {
        if (!z) {
            this.keyData = ((SPHINCSPublicKeyParameters) cipherParameters).getKeyData();
        } else if (cipherParameters instanceof ParametersWithRandom) {
            this.keyData = ((SPHINCSPrivateKeyParameters) ((ParametersWithRandom) cipherParameters).getParameters()).getKeyData();
        } else {
            this.keyData = ((SPHINCSPrivateKeyParameters) cipherParameters).getKeyData();
        }
    }

    public boolean verify(HashFunctions hashFunctions, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        byte[] bArr4 = new byte[2144];
        byte[] bArr5 = new byte[32];
        byte[] bArr6 = new byte[32];
        byte[] bArr7 = new byte[41000];
        byte[] bArr8 = new byte[1056];
        if (bArr2.length != 41000) {
            throw new IllegalArgumentException("signature wrong size");
        }
        byte[] bArr9 = new byte[64];
        for (int i = 0; i < 1056; i++) {
            bArr8[i] = bArr3[i];
        }
        byte[] bArr10 = new byte[32];
        for (int i2 = 0; i2 < 32; i2++) {
            bArr10[i2] = bArr2[i2];
        }
        System.arraycopy(bArr2, 0, bArr7, 0, 41000);
        Digest messageHash = hashFunctions.getMessageHash();
        messageHash.update(bArr10, 0, 32);
        messageHash.update(bArr8, 0, 1056);
        messageHash.update(bArr, 0, bArr.length);
        messageHash.doFinal(bArr9, 0);
        long j2 = 0;
        for (int i3 = 0; i3 < 8; i3++) {
            j2 ^= ((long) (bArr7[32 + i3] & UnsignedBytes.MAX_VALUE)) << (i3 * 8);
        }
        new Horst();
        Horst.horst_verify(hashFunctions, bArr6, bArr7, 40, bArr8, bArr9);
        Wots wots = new Wots();
        int i5 = 13352;
        int i6 = 0;
        while (i6 < 12) {
            wots.wots_verify(hashFunctions, bArr4, bArr7, i5, bArr6, bArr8);
            int i21 = i5;
            byte[] bArr11 = bArr4;
            byte[] bArr12 = bArr5;
            Tree.l_tree(hashFunctions, bArr12, 0, bArr11, 0, bArr8, 0);
            bArr4 = bArr11;
            byte[] bArr13 = bArr7;
            byte[] bArr14 = bArr6;
            validate_authpath(hashFunctions, bArr14, bArr12, (int) (31 & j2), bArr13, i21 + 2144, bArr8, 5);
            bArr7 = bArr13;
            bArr6 = bArr14;
            j2 >>= 5;
            i5 = i21 + 2304;
            i6++;
            bArr5 = bArr12;
            wots = wots;
        }
        boolean z = true;
        for (int i22 = 0; i22 < 32; i22++) {
            z &= bArr6[i22] == bArr8[i22 + 1024];
        }
        return z;
    }

    @Override // org.bouncycastle.pqc.crypto.MessageSigner
    public boolean verifySignature(byte[] bArr, byte[] bArr2) {
        return verify(this.hashFunctions, bArr, bArr2, this.keyData);
    }
}
