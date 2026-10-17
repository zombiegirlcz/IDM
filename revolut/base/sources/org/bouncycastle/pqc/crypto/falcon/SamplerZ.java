package org.bouncycastle.pqc.crypto.falcon;

import com.google.common.primitives.UnsignedBytes;
import com.youTransactor.uCube.rpc.Constants;
import v0.a;

/* JADX INFO: loaded from: classes14.dex */
class SamplerZ {
    private static int BerExp(FalconRNG falconRNG, double d, double d5) {
        int iPrng_get_u8;
        int i = (int) (1.4426950408889634d * d);
        long jFpr_expm_p63 = ((FPREngine.fpr_expm_p63(d - (((double) i) * 0.6931471805599453d), d5) << 1) - 1) >>> (i ^ ((i ^ 63) & (-((63 - i) >>> 31))));
        int i2 = 64;
        do {
            i2 -= 8;
            iPrng_get_u8 = (falconRNG.prng_get_u8() & UnsignedBytes.MAX_VALUE) - (((int) (jFpr_expm_p63 >>> i2)) & 255);
            if (iPrng_get_u8 != 0) {
                break;
            }
        } while (i2 > 0);
        return iPrng_get_u8 >>> 31;
    }

    public static int gaussian0_sampler(FalconRNG falconRNG) {
        int[] iArr = {10745844, 3068844, 3741698, 5559083, 1580863, 8248194, 2260429, 13669192, 2736639, 708981, 4421575, 10046180, 169348, 7122675, 4136815, 30538, 13063405, 7650655, 4132, 14505003, 7826148, 417, 16768101, 11363290, 31, 8444042, 8086568, 1, 12844466, 265321, 0, 1232676, 13644283, 0, 38047, 9111839, 0, 870, 6138264, 0, 14, 12545723, 0, 0, 3104126, 0, 0, 28824, 0, 0, Constants.TAG_POWER_OFF_TIMEOUT, 0, 0, 1};
        long jPrng_get_u64 = falconRNG.prng_get_u64();
        int i = ((int) jPrng_get_u64) & 16777215;
        int i2 = 16777215 & ((int) (jPrng_get_u64 >>> 24));
        int iPrng_get_u8 = ((falconRNG.prng_get_u8() & UnsignedBytes.MAX_VALUE) << 16) | ((int) (jPrng_get_u64 >>> 48));
        int i3 = 0;
        for (int i5 = 0; i5 < 54; i5 += 3) {
            i3 += ((iPrng_get_u8 - iArr[i5]) - (((i2 - iArr[i5 + 1]) - ((i - iArr[i5 + 2]) >>> 31)) >>> 31)) >>> 31;
        }
        return i3;
    }

    public static int sample(SamplerCtx samplerCtx, double d, double d5) {
        return sampler(samplerCtx, d, d5);
    }

    private static int sampler(SamplerCtx samplerCtx, double d, double d5) {
        int iGaussian0_sampler;
        int iA;
        double d6;
        int iFpr_floor = (int) FPREngine.fpr_floor(d);
        double d10 = d - ((double) iFpr_floor);
        double d15 = d5 * d5 * 0.5d;
        double d41 = d5 * samplerCtx.sigma_min;
        do {
            iGaussian0_sampler = gaussian0_sampler(samplerCtx.f228799p);
            int iPrng_get_u8 = samplerCtx.f228799p.prng_get_u8() & 1;
            iA = a.a(iPrng_get_u8 << 1, 1, iGaussian0_sampler, iPrng_get_u8);
            d6 = ((double) iA) - d10;
        } while (BerExp(samplerCtx.f228799p, ((d6 * d6) * d15) - (((double) (iGaussian0_sampler * iGaussian0_sampler)) * 0.15086504887537272d), d41) == 0);
        return iFpr_floor + iA;
    }
}
