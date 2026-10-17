package org.bouncycastle.pqc.crypto.cmce;

import java.lang.reflect.Array;

/* JADX INFO: loaded from: classes14.dex */
class BENES13 extends BENES {
    public BENES13(int i, int i2, int i3) {
        super(i, i2, i3);
    }

    public static void layer_ex(long[] jArr, long[] jArr2, int i) {
        int i2 = 1 << i;
        int i3 = 0;
        for (int i5 = 0; i5 < 128; i5 += i2 * 2) {
            int i6 = i5;
            while (i6 < i5 + i2) {
                long j2 = jArr[i6];
                int i21 = i6 + i2;
                long j3 = (jArr[i21] ^ j2) & jArr2[i3];
                jArr[i6] = j2 ^ j3;
                jArr[i21] = jArr[i21] ^ j3;
                i6++;
                i3++;
            }
        }
    }

    public static void layer_in(long[] jArr, long[] jArr2, int i) {
        int i2 = 1 << i;
        int i3 = 0;
        for (int i5 = 0; i5 < 64; i5 += i2 * 2) {
            for (int i6 = i5; i6 < i5 + i2; i6++) {
                long j2 = jArr[i6];
                int i21 = i6 + i2;
                int i22 = i3 + 1;
                long j3 = (jArr[i21] ^ j2) & jArr2[i3];
                jArr[i6] = j2 ^ j3;
                jArr[i21] = jArr[i21] ^ j3;
                int i32 = i6 + 64;
                long j5 = jArr[i32];
                int i33 = i32 + i2;
                i3 += 2;
                long j16 = jArr2[i22] & (jArr[i33] ^ j5);
                jArr[i32] = j5 ^ j16;
                jArr[i33] = jArr[i33] ^ j16;
            }
        }
    }

    public void apply_benes(byte[] bArr, byte[] bArr2, int i) {
        int i2;
        int i3;
        int i5;
        long[] jArr = new long[128];
        long[] jArr2 = new long[128];
        long[] jArr3 = new long[64];
        long[] jArr4 = new long[64];
        if (i == 0) {
            i2 = (this.SYS_T * 2) + 40;
            i3 = 0;
        } else {
            i2 = (this.SYS_T * 2) + 12328;
            i3 = -1024;
        }
        for (int i6 = 0; i6 < 64; i6++) {
            int i21 = i6 * 16;
            jArr[i6] = Utils.load8(bArr, i21);
            jArr[i6 + 64] = Utils.load8(bArr, i21 + 8);
        }
        BENES.transpose_64x64(jArr2, jArr, 0);
        BENES.transpose_64x64(jArr2, jArr, 64);
        int i22 = 0;
        while (true) {
            if (i22 > 6) {
                break;
            }
            for (int i32 = 0; i32 < 64; i32++) {
                jArr3[i32] = Utils.load8(bArr2, i2);
                i2 += 8;
            }
            i2 += i3;
            BENES.transpose_64x64(jArr4, jArr3);
            layer_ex(jArr2, jArr4, i22);
            i22++;
        }
        BENES.transpose_64x64(jArr, jArr2, 0);
        BENES.transpose_64x64(jArr, jArr2, 64);
        for (int i33 = 0; i33 <= 5; i33++) {
            for (int i43 = 0; i43 < 64; i43++) {
                jArr3[i43] = Utils.load8(bArr2, i2);
                i2 += 8;
            }
            i2 += i3;
            layer_in(jArr, jArr3, i33);
        }
        for (int i59 = 4; i59 >= 0; i59--) {
            for (int i66 = 0; i66 < 64; i66++) {
                jArr3[i66] = Utils.load8(bArr2, i2);
                i2 += 8;
            }
            i2 += i3;
            layer_in(jArr, jArr3, i59);
        }
        BENES.transpose_64x64(jArr2, jArr, 0);
        BENES.transpose_64x64(jArr2, jArr, 64);
        for (i5 = 6; i5 >= 0; i5--) {
            for (int i74 = 0; i74 < 64; i74++) {
                jArr3[i74] = Utils.load8(bArr2, i2);
                i2 += 8;
            }
            i2 += i3;
            BENES.transpose_64x64(jArr4, jArr3);
            layer_ex(jArr2, jArr4, i5);
        }
        BENES.transpose_64x64(jArr, jArr2, 0);
        BENES.transpose_64x64(jArr, jArr2, 64);
        for (int i92 = 0; i92 < 64; i92++) {
            int i96 = i92 * 16;
            Utils.store8(bArr, i96, jArr[i92]);
            Utils.store8(bArr, i96 + 8, jArr[i92 + 64]);
        }
    }

    @Override // org.bouncycastle.pqc.crypto.cmce.BENES
    public void support_gen(short[] sArr, byte[] bArr) {
        int i = this.GFBITS;
        byte[][] bArr2 = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, i, (1 << i) / 8);
        for (int i2 = 0; i2 < this.GFBITS; i2++) {
            for (int i3 = 0; i3 < (1 << this.GFBITS) / 8; i3++) {
                bArr2[i2][i3] = 0;
            }
        }
        int i5 = 0;
        while (true) {
            int i6 = this.GFBITS;
            if (i5 >= (1 << i6)) {
                break;
            }
            short sBitrev = Utils.bitrev((short) i5, i6);
            for (int i21 = 0; i21 < this.GFBITS; i21++) {
                byte[] bArr3 = bArr2[i21];
                int i22 = i5 / 8;
                bArr3[i22] = (byte) (bArr3[i22] | (((sBitrev >> i21) & 1) << (i5 % 8)));
            }
            i5++;
        }
        for (int i32 = 0; i32 < this.GFBITS; i32++) {
            apply_benes(bArr2[i32], bArr, 0);
        }
        for (int i33 = 0; i33 < this.SYS_N; i33++) {
            sArr[i33] = 0;
            for (int i43 = this.GFBITS - 1; i43 >= 0; i43--) {
                short s2 = (short) (sArr[i33] << 1);
                sArr[i33] = s2;
                sArr[i33] = (short) (s2 | ((bArr2[i43][i33 / 8] >> (i33 % 8)) & 1));
            }
        }
    }
}
