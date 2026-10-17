package org.bouncycastle.pqc.crypto.cmce;

import org.bouncycastle.math.raw.Interleave;

/* JADX INFO: loaded from: classes14.dex */
final class GF13 extends GF {
    private int gf_mul_ext_par(short s2, short s3, short s4, short s6) {
        int i = (s3 & 1) * s2;
        int i2 = (s6 & 1) * s4;
        for (int i3 = 1; i3 < 13; i3++) {
            int i5 = 1 << i3;
            i ^= (s3 & i5) * s2;
            i2 ^= (i5 & s6) * s4;
        }
        return i ^ i2;
    }

    private short gf_sq2(short s2) {
        return gf_reduce(Interleave.expand16to32(gf_reduce(Interleave.expand16to32(s2))));
    }

    private short gf_sq2mul(short s2, short s3) {
        long j2 = s2;
        long j3 = s3;
        long j5 = (j3 << 18) * (64 & j2);
        long j16 = j2 ^ (j2 << 21);
        long j22 = ((j3 << 15) * (j16 & 8589934624L)) ^ (((((j5 ^ ((268435457 & j16) * j3)) ^ ((j3 << 3) * (536870914 & j16))) ^ ((j3 << 6) * (1073741828 & j16))) ^ ((j3 << 9) * (2147483656L & j16))) ^ ((j3 << 12) * (4294967312L & j16)));
        long j42 = 2305834213120671744L & j22;
        long j46 = j22 ^ ((j42 >>> 26) ^ (((j42 >>> 18) ^ (j42 >>> 20)) ^ (j42 >>> 24)));
        long j47 = 8796025913344L & j46;
        return gf_reduce(((int) (j46 ^ ((j47 >>> 26) ^ (((j47 >>> 18) ^ (j47 >>> 20)) ^ (j47 >>> 24))))) & 67108863);
    }

    private short gf_sqmul(short s2, short s3) {
        long j2 = s2;
        long j3 = s3;
        long j5 = (j3 << 6) * (64 & j2);
        long j16 = j2 ^ (j2 << 7);
        long j22 = ((j3 << 5) * (j16 & 524320)) ^ (((((j5 ^ ((16385 & j16) * j3)) ^ ((j3 << 1) * (32770 & j16))) ^ ((j3 << 2) * (65540 & j16))) ^ ((j3 << 3) * (131080 & j16))) ^ ((j3 << 4) * (262160 & j16)));
        long j42 = 137371844608L & j22;
        return gf_reduce(((int) (j22 ^ ((j42 >>> 26) ^ (((j42 >>> 18) ^ (j42 >>> 20)) ^ (j42 >>> 24))))) & 67108863);
    }

    @Override // org.bouncycastle.pqc.crypto.cmce.GF
    public short gf_frac(short s2, short s3) {
        short sGf_sqmul = gf_sqmul(s2, s2);
        short sGf_sq2mul = gf_sq2mul(sGf_sqmul, sGf_sqmul);
        return gf_sqmul(gf_sq2mul(gf_sq2(gf_sq2mul(gf_sq2(sGf_sq2mul), sGf_sq2mul)), sGf_sq2mul), s3);
    }

    @Override // org.bouncycastle.pqc.crypto.cmce.GF
    public short gf_inv(short s2) {
        return gf_frac(s2, (short) 1);
    }

    @Override // org.bouncycastle.pqc.crypto.cmce.GF
    public short gf_mul(short s2, short s3) {
        int i = (s3 & 1) * s2;
        for (int i2 = 1; i2 < 13; i2++) {
            i ^= ((1 << i2) & s3) * s2;
        }
        return gf_reduce(i);
    }

    @Override // org.bouncycastle.pqc.crypto.cmce.GF
    public int gf_mul_ext(short s2, short s3) {
        int i = (s3 & 1) * s2;
        for (int i2 = 1; i2 < 13; i2++) {
            i ^= ((1 << i2) & s3) * s2;
        }
        return i;
    }

    @Override // org.bouncycastle.pqc.crypto.cmce.GF
    public void gf_mul_poly(int i, int[] iArr, short[] sArr, short[] sArr2, short[] sArr3, int[] iArr2) {
        iArr2[0] = gf_mul_ext(sArr2[0], sArr3[0]);
        for (int i2 = 1; i2 < i; i2++) {
            int i3 = i2 + i2;
            iArr2[i3 - 1] = 0;
            short s2 = sArr2[i2];
            short s3 = sArr3[i2];
            for (int i5 = 0; i5 < i2; i5++) {
                int i6 = i2 + i5;
                iArr2[i6] = iArr2[i6] ^ gf_mul_ext_par(s2, sArr3[i5], sArr2[i5], s3);
            }
            iArr2[i3] = gf_mul_ext(s2, s3);
        }
        for (int i21 = (i - 1) * 2; i21 >= i; i21--) {
            int i22 = iArr2[i21];
            for (int i32 : iArr) {
                int i33 = (i21 - i) + i32;
                iArr2[i33] = iArr2[i33] ^ i22;
            }
        }
        for (int i43 = 0; i43 < i; i43++) {
            sArr[i43] = gf_reduce(iArr2[i43]);
        }
    }

    @Override // org.bouncycastle.pqc.crypto.cmce.GF
    public short gf_reduce(int i) {
        int i2 = i & 8191;
        int i3 = i >>> 13;
        int i5 = ((i3 << 4) ^ (i3 << 3)) ^ (i3 << 1);
        int i6 = i5 >>> 13;
        return (short) ((((i3 ^ i2) ^ i6) ^ (i5 & 8191)) ^ (((i6 << 4) ^ (i6 << 3)) ^ (i6 << 1)));
    }

    @Override // org.bouncycastle.pqc.crypto.cmce.GF
    public short gf_sq(short s2) {
        return gf_reduce(Interleave.expand16to32(s2));
    }

    @Override // org.bouncycastle.pqc.crypto.cmce.GF
    public int gf_sq_ext(short s2) {
        return Interleave.expand16to32(s2);
    }

    @Override // org.bouncycastle.pqc.crypto.cmce.GF
    public void gf_sqr_poly(int i, int[] iArr, short[] sArr, short[] sArr2, int[] iArr2) {
        iArr2[0] = gf_sq_ext(sArr2[0]);
        for (int i2 = 1; i2 < i; i2++) {
            int i3 = i2 + i2;
            iArr2[i3 - 1] = 0;
            iArr2[i3] = gf_sq_ext(sArr2[i2]);
        }
        for (int i5 = (i - 1) * 2; i5 >= i; i5--) {
            int i6 = iArr2[i5];
            for (int i21 : iArr) {
                int i22 = (i5 - i) + i21;
                iArr2[i22] = iArr2[i22] ^ i6;
            }
        }
        for (int i32 = 0; i32 < i; i32++) {
            sArr[i32] = gf_reduce(iArr2[i32]);
        }
    }
}
