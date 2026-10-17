package org.bouncycastle.pqc.crypto.sphincs;

import v0.a;

/* JADX INFO: loaded from: classes14.dex */
class Tree {

    public static class leafaddr {
        int level;
        long subleaf;
        long subtree;

        public leafaddr() {
        }

        public leafaddr(leafaddr leafaddrVar) {
            this.level = leafaddrVar.level;
            this.subtree = leafaddrVar.subtree;
            this.subleaf = leafaddrVar.subleaf;
        }
    }

    public static void gen_leaf_wots(HashFunctions hashFunctions, byte[] bArr, int i, byte[] bArr2, int i2, byte[] bArr3, leafaddr leafaddrVar) {
        byte[] bArr4 = new byte[32];
        byte[] bArr5 = new byte[2144];
        Wots wots = new Wots();
        Seed.get_seed(hashFunctions, bArr4, 0, bArr3, leafaddrVar);
        wots.wots_pkgen(hashFunctions, bArr5, 0, bArr4, 0, bArr2, i2);
        l_tree(hashFunctions, bArr, i, bArr5, 0, bArr2, i2);
    }

    public static void l_tree(HashFunctions hashFunctions, byte[] bArr, int i, byte[] bArr2, int i2, byte[] bArr3, int i3) {
        int i5;
        int i6 = 67;
        for (int i21 = 0; i21 < 7; i21++) {
            int i22 = 0;
            while (true) {
                i5 = i6 >>> 1;
                if (i22 >= i5) {
                    break;
                }
                hashFunctions.hash_2n_n_mask(bArr2, (i22 * 32) + i2, bArr2, (i22 * 64) + i2, bArr3, (i21 * 64) + i3);
                i22++;
            }
            if ((i6 & 1) != 0) {
                System.arraycopy(bArr2, a.a(i6, 1, 32, i2), bArr2, (i5 * 32) + i2, 32);
                i5++;
            }
            i6 = i5;
        }
        System.arraycopy(bArr2, i2, bArr, i, 32);
    }

    public static void treehash(HashFunctions hashFunctions, byte[] bArr, int i, int i2, byte[] bArr2, leafaddr leafaddrVar, byte[] bArr3, int i3) {
        leafaddr leafaddrVar2 = new leafaddr(leafaddrVar);
        int i5 = i2 + 1;
        byte[] bArr4 = new byte[i5 * 32];
        int[] iArr = new int[i5];
        int i6 = (int) (leafaddrVar2.subleaf + ((long) (1 << i2)));
        int i21 = 0;
        while (leafaddrVar2.subleaf < i6) {
            gen_leaf_wots(hashFunctions, bArr4, i21 * 32, bArr3, i3, bArr2, leafaddrVar2);
            iArr[i21] = 0;
            int i22 = i21 + 1;
            while (i22 > 1) {
                int i32 = iArr[i22 - 1];
                int i33 = i22 - 2;
                if (i32 == iArr[i33]) {
                    int i43 = i33 * 32;
                    hashFunctions.hash_2n_n_mask(bArr4, i43, bArr4, i43, bArr3, i3 + ((i32 + 7) * 64));
                    iArr[i33] = iArr[i33] + 1;
                    i22--;
                    i6 = i6;
                }
            }
            leafaddrVar2.subleaf++;
            i21 = i22;
            i6 = i6;
        }
        for (int i59 = 0; i59 < 32; i59++) {
            bArr[i + i59] = bArr4[i59];
        }
    }
}
