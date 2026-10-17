package org.bouncycastle.pqc.crypto.cmce;

import java.lang.reflect.Array;

/* JADX INFO: loaded from: classes14.dex */
class BENES12 extends BENES {
    public BENES12(int i, int i2, int i3) {
        super(i, i2, i3);
    }

    private void apply_benes(byte[] bArr, byte[] bArr2, int i) {
        int i2;
        int i3;
        long[] jArr = new long[64];
        long[] jArr2 = new long[64];
        for (int i5 = 0; i5 < 64; i5++) {
            jArr[i5] = Utils.load8(bArr, i5 * 8);
        }
        int i6 = 256;
        if (i == 0) {
            i2 = (this.SYS_T * 2) + 40;
        } else {
            i2 = (this.SYS_T * 2) + 40 + (((this.GFBITS * 2) - 2) * 256);
            i6 = -256;
        }
        BENES.transpose_64x64(jArr, jArr);
        int i21 = 0;
        while (true) {
            if (i21 > 5) {
                break;
            }
            for (int i22 = 0; i22 < 64; i22++) {
                jArr2[i22] = Utils.load4(bArr2, (i22 * 4) + i2);
            }
            BENES.transpose_64x64(jArr2, jArr2);
            layerBenes(jArr, jArr2, i21);
            i2 += i6;
            i21++;
        }
        BENES.transpose_64x64(jArr, jArr);
        for (int i32 = 0; i32 <= 5; i32++) {
            for (int i33 = 0; i33 < 32; i33++) {
                jArr2[i33] = Utils.load8(bArr2, (i33 * 8) + i2);
            }
            layerBenes(jArr, jArr2, i32);
            i2 += i6;
        }
        for (int i43 = 4; i43 >= 0; i43--) {
            for (int i59 = 0; i59 < 32; i59++) {
                jArr2[i59] = Utils.load8(bArr2, (i59 * 8) + i2);
            }
            layerBenes(jArr, jArr2, i43);
            i2 += i6;
        }
        BENES.transpose_64x64(jArr, jArr);
        for (i3 = 5; i3 >= 0; i3--) {
            for (int i66 = 0; i66 < 64; i66++) {
                jArr2[i66] = Utils.load4(bArr2, (i66 * 4) + i2);
            }
            BENES.transpose_64x64(jArr2, jArr2);
            layerBenes(jArr, jArr2, i3);
            i2 += i6;
        }
        BENES.transpose_64x64(jArr, jArr);
        for (int i74 = 0; i74 < 64; i74++) {
            Utils.store8(bArr, i74 * 8, jArr[i74]);
        }
    }

    public static void layerBenes(long[] jArr, long[] jArr2, int i) {
        int i2 = 1 << i;
        int i3 = 0;
        for (int i5 = 0; i5 < 64; i5 += i2 * 2) {
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
