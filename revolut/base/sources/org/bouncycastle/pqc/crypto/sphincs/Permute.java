package org.bouncycastle.pqc.crypto.sphincs;

import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes14.dex */
class Permute {
    private static final int CHACHA_ROUNDS = 12;

    public static void permute(int i, int[] iArr) {
        int i2 = 16;
        if (iArr.length != 16) {
            throw new IllegalArgumentException();
        }
        if (i % 2 != 0) {
            throw new IllegalArgumentException("Number of rounds must be even");
        }
        int i3 = iArr[0];
        int i5 = iArr[1];
        int i6 = iArr[2];
        char c2 = 3;
        int i21 = iArr[3];
        char c3 = 4;
        int i22 = iArr[4];
        char c5 = 5;
        int i32 = iArr[5];
        char c6 = 6;
        int i33 = iArr[6];
        int i43 = 7;
        int i59 = iArr[7];
        int i66 = 8;
        int i74 = iArr[8];
        int i92 = iArr[9];
        int i96 = iArr[10];
        int i99 = iArr[11];
        int i100 = iArr[12];
        int i101 = iArr[13];
        int i102 = iArr[14];
        int iRotl = iArr[15];
        int iRotl2 = i102;
        int iRotl3 = i101;
        int iRotl4 = i100;
        int i103 = i99;
        int i104 = i96;
        int i105 = i92;
        int i106 = i74;
        int iRotl5 = i59;
        int iRotl6 = i33;
        int iRotl7 = i32;
        int iRotl8 = i22;
        int i107 = i21;
        int i108 = i6;
        int i109 = i5;
        int i110 = i3;
        int i111 = i;
        while (i111 > 0) {
            int i112 = i110 + iRotl8;
            char c7 = c2;
            int iRotl9 = rotl(iRotl4 ^ i112, i2);
            int i113 = i106 + iRotl9;
            int iRotl10 = rotl(iRotl8 ^ i113, 12);
            int i114 = i112 + iRotl10;
            int iRotl11 = rotl(iRotl9 ^ i114, i66);
            int i115 = i113 + iRotl11;
            int iRotl12 = rotl(iRotl10 ^ i115, i43);
            int i116 = i109 + iRotl7;
            char c16 = c3;
            int iRotl13 = rotl(iRotl3 ^ i116, i2);
            int i117 = i105 + iRotl13;
            int iRotl14 = rotl(iRotl7 ^ i117, 12);
            int i118 = i116 + iRotl14;
            int iRotl15 = rotl(iRotl13 ^ i118, i66);
            int i119 = i117 + iRotl15;
            int iRotl16 = rotl(iRotl14 ^ i119, i43);
            int i120 = i108 + iRotl6;
            char c26 = c5;
            int iRotl17 = rotl(iRotl2 ^ i120, i2);
            int i121 = i104 + iRotl17;
            char c28 = c6;
            int iRotl18 = rotl(iRotl6 ^ i121, 12);
            int i122 = i120 + iRotl18;
            int iRotl19 = rotl(iRotl17 ^ i122, i66);
            int i123 = i121 + iRotl19;
            int iRotl20 = rotl(iRotl18 ^ i123, i43);
            int i124 = i107 + iRotl5;
            int iRotl21 = rotl(iRotl ^ i124, i2);
            int i125 = i103 + iRotl21;
            int iRotl22 = rotl(iRotl5 ^ i125, 12);
            int i126 = i124 + iRotl22;
            int iRotl23 = rotl(iRotl21 ^ i126, i66);
            int i127 = i125 + iRotl23;
            int iRotl24 = rotl(iRotl22 ^ i127, 7);
            int i128 = i114 + iRotl16;
            int iRotl25 = rotl(iRotl23 ^ i128, 16);
            int i129 = i123 + iRotl25;
            int iRotl26 = rotl(iRotl16 ^ i129, 12);
            i110 = i128 + iRotl26;
            iRotl = rotl(iRotl25 ^ i110, 8);
            i104 = i129 + iRotl;
            iRotl7 = rotl(iRotl26 ^ i104, 7);
            int i130 = i118 + iRotl20;
            int iRotl27 = rotl(iRotl11 ^ i130, 16);
            int i131 = i127 + iRotl27;
            int iRotl28 = rotl(iRotl20 ^ i131, 12);
            i109 = i130 + iRotl28;
            iRotl4 = rotl(iRotl27 ^ i109, 8);
            i103 = i131 + iRotl4;
            iRotl6 = rotl(iRotl28 ^ i103, 7);
            int i132 = i122 + iRotl24;
            int iRotl29 = rotl(iRotl15 ^ i132, 16);
            int i133 = i115 + iRotl29;
            int iRotl30 = rotl(iRotl24 ^ i133, 12);
            i108 = i132 + iRotl30;
            iRotl3 = rotl(iRotl29 ^ i108, 8);
            i106 = i133 + iRotl3;
            iRotl5 = rotl(iRotl30 ^ i106, 7);
            int i134 = i126 + iRotl12;
            int iRotl31 = rotl(iRotl19 ^ i134, 16);
            int i135 = i119 + iRotl31;
            int iRotl32 = rotl(iRotl12 ^ i135, 12);
            i107 = i134 + iRotl32;
            iRotl2 = rotl(iRotl31 ^ i107, 8);
            i105 = i135 + iRotl2;
            iRotl8 = rotl(iRotl32 ^ i105, 7);
            i111 -= 2;
            i43 = 7;
            i2 = 16;
            c2 = c7;
            c3 = c16;
            c5 = c26;
            c6 = c28;
            i66 = 8;
        }
        iArr[0] = i110;
        iArr[1] = i109;
        iArr[2] = i108;
        iArr[c2] = i107;
        iArr[c3] = iRotl8;
        iArr[c5] = iRotl7;
        iArr[c6] = iRotl6;
        iArr[i43] = iRotl5;
        iArr[8] = i106;
        iArr[9] = i105;
        iArr[10] = i104;
        iArr[11] = i103;
        iArr[12] = iRotl4;
        iArr[13] = iRotl3;
        iArr[14] = iRotl2;
        iArr[15] = iRotl;
    }

    public static int rotl(int i, int i2) {
        return (i >>> (-i2)) | (i << i2);
    }

    public void chacha_permute(byte[] bArr, byte[] bArr2) {
        int[] iArr = new int[16];
        for (int i = 0; i < 16; i++) {
            iArr[i] = Pack.littleEndianToInt(bArr2, i * 4);
        }
        permute(12, iArr);
        for (int i2 = 0; i2 < 16; i2++) {
            Pack.intToLittleEndian(iArr[i2], bArr, i2 * 4);
        }
    }
}
