package org.bouncycastle.pqc.crypto.sphincs;

import com.google.android.material.internal.ViewUtils;
import com.google.common.primitives.UnsignedBytes;
import ehe.n;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.crypto.digests.Blake2xsDigest;

/* JADX INFO: loaded from: classes14.dex */
class Horst {
    static final int HORST_K = 32;
    static final int HORST_LOGT = 16;
    static final int HORST_SIGBYTES = 13312;
    static final int HORST_SKBYTES = 32;
    static final int HORST_T = 65536;
    static final int N_MASKS = 32;

    public static void expand_seed(byte[] bArr, byte[] bArr2) {
        Seed.prg(bArr, 0, 2097152L, bArr2, 0);
    }

    public static int horst_sign(HashFunctions hashFunctions, byte[] bArr, int i, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        byte[] bArr6 = new byte[PKIFailureInfo.badSenderNonce];
        byte[] bArr7 = new byte[4194272];
        expand_seed(bArr6, bArr3);
        for (int i2 = 0; i2 < 65536; i2++) {
            hashFunctions.hash_n_n(bArr7, (Blake2xsDigest.UNKNOWN_DIGEST_LENGTH + i2) * 32, bArr6, i2 * 32);
        }
        for (int i3 = 0; i3 < 16; i3++) {
            long j2 = (1 << (16 - i3)) - 1;
            int i5 = 1 << (15 - i3);
            long j3 = i5 - 1;
            int i6 = 0;
            while (i6 < i5) {
                hashFunctions.hash_2n_n_mask(bArr7, (int) ((((long) i6) + j3) * 32), bArr7, (int) ((((long) (i6 * 2)) + j2) * 32), bArr4, i3 * 64);
                i6++;
                j3 = j3;
            }
        }
        int i21 = 2016;
        int i22 = i;
        while (i21 < 4064) {
            bArr[i22] = bArr7[i21];
            i21++;
            i22++;
        }
        for (int i32 = 0; i32 < 32; i32++) {
            int i33 = i32 * 2;
            int i43 = (bArr5[i33] & UnsignedBytes.MAX_VALUE) + ((bArr5[i33 + 1] & UnsignedBytes.MAX_VALUE) << 8);
            int i59 = 0;
            while (i59 < 32) {
                bArr[i22] = bArr6[(i43 * 32) + i59];
                i59++;
                i22++;
            }
            int i66 = i43 + Blake2xsDigest.UNKNOWN_DIGEST_LENGTH;
            for (int i74 = 0; i74 < 10; i74++) {
                int i92 = (i66 & 1) != 0 ? i66 + 1 : i66 - 1;
                int i96 = 0;
                while (i96 < 32) {
                    bArr[i22] = bArr7[(i92 * 32) + i96];
                    i96++;
                    i22++;
                }
                i66 = (i92 - 1) / 2;
            }
        }
        for (int i99 = 0; i99 < 32; i99++) {
            bArr2[i99] = bArr7[i99];
        }
        return HORST_SIGBYTES;
    }

    public static int horst_verify(HashFunctions hashFunctions, byte[] bArr, byte[] bArr2, int i, byte[] bArr3, byte[] bArr4) {
        byte[] bArr5 = bArr2;
        byte[] bArr6 = new byte[1024];
        int i2 = i + 2048;
        int i3 = 0;
        while (i3 < 32) {
            int i5 = i3 * 2;
            int i6 = (bArr4[i5] & UnsignedBytes.MAX_VALUE) + ((bArr4[i5 + 1] & UnsignedBytes.MAX_VALUE) << 8);
            if ((i6 & 1) == 0) {
                hashFunctions.hash_n_n(bArr6, 0, bArr5, i2);
                for (int i21 = 0; i21 < 32; i21++) {
                    bArr6[i21 + 32] = bArr5[i2 + 32 + i21];
                }
            } else {
                hashFunctions.hash_n_n(bArr6, 32, bArr5, i2);
                for (int i22 = 0; i22 < 32; i22++) {
                    bArr6[i22] = bArr5[i2 + 32 + i22];
                }
            }
            int i32 = i2 + 64;
            int i33 = 1;
            while (i33 < 10) {
                int i43 = i6 >>> 1;
                if ((i43 & 1) == 0) {
                    hashFunctions.hash_2n_n_mask(bArr6, 0, bArr6, 0, bArr3, (i33 - 1) * 64);
                    for (int i59 = 0; i59 < 32; i59++) {
                        bArr6[i59 + 32] = bArr5[i32 + i59];
                    }
                } else {
                    hashFunctions.hash_2n_n_mask(bArr6, 32, bArr6, 0, bArr3, (i33 - 1) * 64);
                    for (int i66 = 0; i66 < 32; i66++) {
                        bArr6[i66] = bArr5[i32 + i66];
                    }
                }
                i32 += 32;
                i33++;
                i6 = i43;
            }
            int i74 = i6 >>> 1;
            hashFunctions.hash_2n_n_mask(bArr6, 0, bArr6, 0, bArr3, 576);
            for (int i92 = 0; i92 < 32; i92++) {
                if (bArr5[n.a(i74, 32, i, i92)] != bArr6[i92]) {
                    for (int i96 = 0; i96 < 32; i96++) {
                        bArr[i96] = 0;
                    }
                    return -1;
                }
            }
            i3++;
            i2 = i32;
        }
        int i99 = 0;
        while (i99 < 32) {
            hashFunctions.hash_2n_n_mask(bArr6, i99 * 32, bArr5, (i99 * 64) + i, bArr3, 640);
            i99++;
            bArr5 = bArr2;
        }
        for (int i100 = 0; i100 < 16; i100++) {
            hashFunctions.hash_2n_n_mask(bArr6, i100 * 32, bArr6, i100 * 64, bArr3, 704);
        }
        for (int i101 = 0; i101 < 8; i101++) {
            hashFunctions.hash_2n_n_mask(bArr6, i101 * 32, bArr6, i101 * 64, bArr3, ViewUtils.EDGE_TO_EDGE_FLAGS);
        }
        for (int i102 = 0; i102 < 4; i102++) {
            hashFunctions.hash_2n_n_mask(bArr6, i102 * 32, bArr6, i102 * 64, bArr3, 832);
        }
        for (int i103 = 0; i103 < 2; i103++) {
            hashFunctions.hash_2n_n_mask(bArr6, i103 * 32, bArr6, i103 * 64, bArr3, 896);
        }
        hashFunctions.hash_2n_n_mask(bArr, 0, bArr6, 0, bArr3, 960);
        return 0;
    }
}
