package org.bouncycastle.pqc.crypto.hqc;

import org.bouncycastle.math.raw.Nat;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes14.dex */
class GF2x {
    private final int bits;
    private final int size;
    private final int sizeExt;

    public GF2x(int i) {
        if (((-65535) & i) != 1) {
            throw new IllegalArgumentException();
        }
        this.bits = i;
        int byte64SizeFromBitSize = Utils.getByte64SizeFromBitSize(i);
        this.size = byte64SizeFromBitSize;
        this.sizeExt = byte64SizeFromBitSize * 2;
    }

    private static void baseMul(int i, long[] jArr, int i2, long[] jArr2, int i3, long[] jArr3, int i5) {
        long[] jArr4 = jArr3;
        Arrays.fill(jArr4, i5, (i * 2) + i5, 0L);
        long[] jArr5 = new long[16];
        int i6 = 0;
        while (i6 < i) {
            implMulwAcc(jArr5, jArr[i2 + i6], jArr2[i3 + i6], jArr4, (i6 << 1) + i5);
            i6++;
            jArr4 = jArr3;
        }
        long j2 = jArr3[i5];
        long j3 = jArr3[i5 + 1];
        for (int i21 = 1; i21 < i; i21++) {
            int i22 = (i21 << 1) + i5;
            j2 ^= jArr3[i22];
            jArr3[i5 + i21] = j2 ^ j3;
            j3 ^= jArr3[i22 + 1];
        }
        Nat.xor64(i, jArr3, i5, j2 ^ j3, jArr3, i5 + i);
        int i32 = i - 1;
        for (int i33 = 1; i33 < i32 * 2; i33++) {
            int iMin = Math.min(i32, i33);
            int i43 = i33 - iMin;
            for (int i59 = iMin; i43 < i59; i59--) {
                implMulwAcc(jArr5, jArr[i2 + i43] ^ jArr[i2 + i59], jArr2[i3 + i43] ^ jArr2[i3 + i59], jArr3, i5 + i33);
                i43++;
            }
        }
    }

    private static void implMulwAcc(long[] jArr, long j2, long j3, long[] jArr2, int i) {
        jArr[1] = j3;
        long j5 = 0;
        long j16 = j3;
        long j22 = j2;
        for (int i2 = 2; i2 < 16; i2 += 2) {
            long j42 = jArr[i2 >>> 1] << 1;
            jArr[i2] = j42;
            jArr[i2 + 1] = j42 ^ j3;
            j22 = (j22 & (-72340172838076674L)) >>> 1;
            j5 ^= (j16 >> 63) & j22;
            j16 <<= 1;
        }
        int i3 = (int) j2;
        long j46 = jArr[i3 & 15] ^ (jArr[(i3 >>> 4) & 15] << 4);
        int i5 = 56;
        do {
            int i6 = (int) (j2 >>> i5);
            long j47 = jArr[i6 & 15] ^ (jArr[(i6 >>> 4) & 15] << 4);
            j46 ^= j47 << i5;
            j5 ^= j47 >>> (-i5);
            i5 -= 8;
        } while (i5 > 0);
        jArr2[i] = jArr2[i] ^ j46;
        int i21 = i + 1;
        jArr2[i21] = jArr2[i21] ^ j5;
    }

    private void karatsuba(int i, long[] jArr, int i2, long[] jArr2, int i3, long[] jArr3, int i5, long[] jArr4, int i6) {
        if (i < 12) {
            baseMul(i, jArr, i2, jArr2, i3, jArr3, i5);
            return;
        }
        int i21 = i >> 1;
        int i22 = i - i21;
        int i32 = i << 1;
        int i33 = i21 << 1;
        int i43 = i22 << 1;
        int i59 = i6 + i32;
        int i66 = i59 + i32;
        int i74 = i66 + i32;
        int i92 = i74 + i;
        int i96 = i6 + (i << 3);
        karatsuba(i21, jArr, i2, jArr2, i3, jArr4, i6, jArr4, i96);
        int i99 = i2 + i21;
        int i100 = i3 + i21;
        karatsuba(i22, jArr, i99, jArr2, i100, jArr4, i59, jArr4, i96);
        int i101 = 0;
        while (true) {
            long j2 = 0;
            if (i101 >= i22) {
                break;
            }
            long j3 = i101 < i21 ? jArr[i2 + i101] : 0L;
            if (i101 < i21) {
                j2 = jArr2[i3 + i101];
            }
            jArr4[i74 + i101] = j3 ^ jArr[i99 + i101];
            jArr4[i92 + i101] = j2 ^ jArr2[i100 + i101];
            i101++;
        }
        karatsuba(i22, jArr4, i74, jArr4, i92, jArr4, i66, jArr4, i96);
        System.arraycopy(jArr4, i6, jArr3, i5, i33);
        System.arraycopy(jArr4, i59, jArr3, i5 + i33, i43);
        int i102 = 0;
        while (i102 < i22 * 2) {
            int i103 = i5 + i21 + i102;
            jArr3[i103] = jArr3[i103] ^ ((jArr4[i66 + i102] ^ (i102 < i33 ? jArr4[i6 + i102] : 0L)) ^ (i102 < i43 ? jArr4[i59 + i102] : 0L));
            i102++;
        }
    }

    private void reduce(long[] jArr, long[] jArr2) {
        int i = 64 - (this.bits & 63);
        int i2 = this.size;
        Nat.shiftUpBits64(i2, jArr, i2, i, jArr[i2 - 1], jArr2, 0);
        addTo(jArr, jArr2);
        int i3 = this.size - 1;
        jArr2[i3] = jArr2[i3] & ((-1) >>> i);
    }

    public void addTo(long[] jArr, long[] jArr2) {
        Nat.xorTo64(this.size, jArr, jArr2);
    }

    public void clear(long[] jArr) {
        Nat.zero64(this.size, jArr);
    }

    public long[] create() {
        return new long[this.size];
    }

    public long[] createExt() {
        return new long[this.sizeExt];
    }

    public long equalTo(long[] jArr, long[] jArr2) {
        return Nat.equalTo64(this.size, jArr, jArr2);
    }

    public void mul(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArrCreateExt = createExt();
        int i = this.size;
        karatsuba(i, jArr, 0, jArr2, 0, jArrCreateExt, 0, new long[i << 4], 0);
        reduce(jArrCreateExt, jArr3);
    }

    public void random(Shake256RandomGenerator shake256RandomGenerator, long[] jArr) {
        byte[] bArr = new byte[this.size << 3];
        shake256RandomGenerator.xofGetBytes(bArr, Utils.getByteSizeFromBitSize(this.bits));
        Pack.littleEndianToLong(bArr, 0, jArr);
        int i = this.size - 1;
        jArr[i] = jArr[i] & ((1 << (this.bits & 63)) - 1);
    }
}
