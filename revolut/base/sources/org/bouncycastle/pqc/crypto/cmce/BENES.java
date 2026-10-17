package org.bouncycastle.pqc.crypto.cmce;

import org.bouncycastle.asn1.cmc.BodyPartID;

/* JADX INFO: loaded from: classes14.dex */
abstract class BENES {
    private static final long[] TRANSPOSE_MASKS = {6148914691236517205L, 3689348814741910323L, 1085102592571150095L, 71777214294589695L, 281470681808895L, BodyPartID.bodyIdMax};
    protected final int GFBITS;
    protected final int SYS_N;
    protected final int SYS_T;

    public BENES(int i, int i2, int i3) {
        this.SYS_N = i;
        this.SYS_T = i2;
        this.GFBITS = i3;
    }

    public static void transpose_64x64(long[] jArr, long[] jArr2) {
        transpose_64x64(jArr, jArr2, 0);
    }

    public abstract void support_gen(short[] sArr, byte[] bArr);

    public static void transpose_64x64(long[] jArr, long[] jArr2, int i) {
        int i2;
        System.arraycopy(jArr2, i, jArr, i, 64);
        int i3 = 5;
        do {
            long j2 = TRANSPOSE_MASKS[i3];
            int i5 = 1 << i3;
            int i6 = i;
            while (true) {
                i2 = i + 64;
                if (i6 >= i2) {
                    break;
                }
                for (int i21 = i6; i21 < i6 + i5; i21 += 4) {
                    long j3 = jArr[i21];
                    int i22 = i21 + 1;
                    long j5 = jArr[i22];
                    int i32 = i21 + 2;
                    long j16 = jArr[i32];
                    int i33 = i21 + 3;
                    long j22 = jArr[i33];
                    int i43 = i21 + i5;
                    long j42 = jArr[i43];
                    int i59 = i43 + 1;
                    long j46 = jArr[i59];
                    int i66 = i43 + 2;
                    long j47 = jArr[i66];
                    int i74 = i43 + 3;
                    long j57 = jArr[i74];
                    long j58 = ((j3 >>> i5) ^ j42) & j2;
                    long j65 = ((j5 >>> i5) ^ j46) & j2;
                    long j69 = ((j16 >>> i5) ^ j47) & j2;
                    long j76 = ((j22 >>> i5) ^ j57) & j2;
                    jArr[i21] = j3 ^ (j58 << i5);
                    jArr[i22] = (j65 << i5) ^ j5;
                    jArr[i32] = (j69 << i5) ^ j16;
                    jArr[i33] = j22 ^ (j76 << i5);
                    jArr[i43] = j42 ^ j58;
                    jArr[i59] = j46 ^ j65;
                    jArr[i66] = j47 ^ j69;
                    jArr[i74] = j57 ^ j76;
                }
                i6 += i5 * 2;
            }
            i3--;
        } while (i3 >= 2);
        do {
            long j85 = TRANSPOSE_MASKS[i3];
            int i92 = 1 << i3;
            for (int i96 = i; i96 < i2; i96 += i92 * 2) {
                for (int i99 = i96; i99 < i96 + i92; i99++) {
                    long j100 = jArr[i99];
                    int i100 = i99 + i92;
                    long j101 = jArr[i100];
                    long j102 = ((j100 >>> i92) ^ j101) & j85;
                    jArr[i99] = j100 ^ (j102 << i92);
                    jArr[i100] = j101 ^ j102;
                }
            }
            i3--;
        } while (i3 >= 0);
    }
}
