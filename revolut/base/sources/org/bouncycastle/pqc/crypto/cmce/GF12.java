package org.bouncycastle.pqc.crypto.cmce;

import org.bouncycastle.math.raw.Interleave;

/* JADX INFO: loaded from: classes14.dex */
final class GF12 extends GF {
    private int gf_mul_ext_par(short s2, short s3, short s4, short s6) {
        int i = (s3 & 1) * s2;
        int i2 = (s6 & 1) * s4;
        for (int i3 = 1; i3 < 12; i3++) {
            int i5 = 1 << i3;
            i ^= (s3 & i5) * s2;
            i2 ^= (i5 & s6) * s4;
        }
        return i ^ i2;
    }

    @Override // org.bouncycastle.pqc.crypto.cmce.GF
    public short gf_frac(short s2, short s3) {
        return gf_mul(gf_inv(s2), s3);
    }

    @Override // org.bouncycastle.pqc.crypto.cmce.GF
    public short gf_inv(short s2) {
        short sGf_mul = gf_mul(gf_sq(s2), s2);
        short sGf_mul2 = gf_mul(gf_sq(gf_sq(sGf_mul)), sGf_mul);
        return gf_sq(gf_mul(gf_sq(gf_mul(gf_sq(gf_sq(gf_mul(gf_sq(gf_sq(gf_sq(gf_sq(sGf_mul2)))), sGf_mul2))), sGf_mul)), s2));
    }

    @Override // org.bouncycastle.pqc.crypto.cmce.GF
    public short gf_mul(short s2, short s3) {
        int i = (s3 & 1) * s2;
        for (int i2 = 1; i2 < 12; i2++) {
            i ^= ((1 << i2) & s3) * s2;
        }
        return gf_reduce(i);
    }

    @Override // org.bouncycastle.pqc.crypto.cmce.GF
    public int gf_mul_ext(short s2, short s3) {
        int i = (s3 & 1) * s2;
        for (int i2 = 1; i2 < 12; i2++) {
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
            for (int i32 = 0; i32 < iArr.length - 1; i32++) {
                int i33 = (i21 - i) + iArr[i32];
                iArr2[i33] = iArr2[i33] ^ i22;
            }
            int i43 = i21 - i;
            iArr2[i43] = (i22 << 1) ^ iArr2[i43];
        }
        for (int i59 = 0; i59 < i; i59++) {
            sArr[i59] = gf_reduce(iArr2[i59]);
        }
    }

    @Override // org.bouncycastle.pqc.crypto.cmce.GF
    public short gf_reduce(int i) {
        return (short) ((i >>> 21) ^ ((((i & 4095) ^ (i >>> 12)) ^ ((2093056 & i) >>> 9)) ^ ((14680064 & i) >>> 18)));
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
            for (int i21 = 0; i21 < iArr.length - 1; i21++) {
                int i22 = (i5 - i) + iArr[i21];
                iArr2[i22] = iArr2[i22] ^ i6;
            }
            int i32 = i5 - i;
            iArr2[i32] = (i6 << 1) ^ iArr2[i32];
        }
        for (int i33 = 0; i33 < i; i33++) {
            sArr[i33] = gf_reduce(iArr2[i33]);
        }
    }
}
