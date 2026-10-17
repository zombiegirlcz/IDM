package org.bouncycastle.pqc.crypto.falcon;

import org.bouncycastle.crypto.digests.SHAKEDigest;
import org.bouncycastle.crypto.hpke.HPKE;

/* JADX INFO: loaded from: classes14.dex */
class FalconSign {
    public int do_sign_dyn(SamplerCtx samplerCtx, short[] sArr, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, short[] sArr2, int i, double[] dArr, int i2) {
        int i3 = 1 << i;
        int i5 = i2 + i3;
        int i6 = i5 + i3;
        int i21 = i6 + i3;
        smallints_to_fpr(dArr, i5, bArr, i);
        smallints_to_fpr(dArr, i2, bArr2, i);
        smallints_to_fpr(dArr, i21, bArr3, i);
        smallints_to_fpr(dArr, i6, bArr4, i);
        FalconFFT.FFT(dArr, i5, i);
        FalconFFT.FFT(dArr, i2, i);
        FalconFFT.FFT(dArr, i21, i);
        FalconFFT.FFT(dArr, i6, i);
        FalconFFT.poly_neg(dArr, i5, i);
        FalconFFT.poly_neg(dArr, i21, i);
        int i22 = i21 + i3;
        int i32 = i22 + i3;
        System.arraycopy(dArr, i5, dArr, i22, i3);
        FalconFFT.poly_mulselfadj_fft(dArr, i22, i);
        System.arraycopy(dArr, i2, dArr, i32, i3);
        FalconFFT.poly_muladj_fft(dArr, i32, dArr, i6, i);
        FalconFFT.poly_mulselfadj_fft(dArr, i2, i);
        FalconFFT.poly_add(dArr, i2, dArr, i22, i);
        System.arraycopy(dArr, i5, dArr, i22, i3);
        FalconFFT.poly_muladj_fft(dArr, i5, dArr, i21, i);
        FalconFFT.poly_add(dArr, i5, dArr, i32, i);
        FalconFFT.poly_mulselfadj_fft(dArr, i6, i);
        System.arraycopy(dArr, i21, dArr, i32, i3);
        FalconFFT.poly_mulselfadj_fft(dArr, i32, i);
        FalconFFT.poly_add(dArr, i6, dArr, i32, i);
        int i33 = i32 + i3;
        for (int i43 = 0; i43 < i3; i43++) {
            dArr[i32 + i43] = sArr2[i43];
        }
        FalconFFT.FFT(dArr, i32, i);
        System.arraycopy(dArr, i32, dArr, i33, i3);
        FalconFFT.poly_mul_fft(dArr, i33, dArr, i22, i);
        FalconFFT.poly_mulconst(dArr, i33, -8.137358613394092E-5d, i);
        FalconFFT.poly_mul_fft(dArr, i32, dArr, i21, i);
        FalconFFT.poly_mulconst(dArr, i32, 8.137358613394092E-5d, i);
        int i59 = i3 * 2;
        System.arraycopy(dArr, i32, dArr, i21, i59);
        ffSampling_fft_dyntree(samplerCtx, dArr, i21, dArr, i22, dArr, i2, dArr, i5, dArr, i6, i, i, dArr, i32);
        System.arraycopy(dArr, i21, dArr, i22, i59);
        smallints_to_fpr(dArr, i5, bArr, i);
        smallints_to_fpr(dArr, i2, bArr2, i);
        smallints_to_fpr(dArr, i21, bArr3, i);
        smallints_to_fpr(dArr, i6, bArr4, i);
        FalconFFT.FFT(dArr, i5, i);
        FalconFFT.FFT(dArr, i2, i);
        FalconFFT.FFT(dArr, i21, i);
        FalconFFT.FFT(dArr, i6, i);
        FalconFFT.poly_neg(dArr, i5, i);
        FalconFFT.poly_neg(dArr, i21, i);
        int i66 = i33 + i3;
        System.arraycopy(dArr, i22, dArr, i33, i3);
        System.arraycopy(dArr, i32, dArr, i66, i3);
        FalconFFT.poly_mul_fft(dArr, i33, dArr, i2, i);
        FalconFFT.poly_mul_fft(dArr, i66, dArr, i6, i);
        FalconFFT.poly_add(dArr, i33, dArr, i66, i);
        System.arraycopy(dArr, i22, dArr, i66, i3);
        FalconFFT.poly_mul_fft(dArr, i66, dArr, i5, i);
        System.arraycopy(dArr, i33, dArr, i22, i3);
        FalconFFT.poly_mul_fft(dArr, i32, dArr, i21, i);
        FalconFFT.poly_add(dArr, i32, dArr, i66, i);
        FalconFFT.iFFT(dArr, i22, i);
        FalconFFT.iFFT(dArr, i32, i);
        int i74 = 0;
        int i92 = 0;
        for (int i96 = 0; i96 < i3; i96++) {
            int iFpr_rint = (sArr2[i96] & HPKE.aead_EXPORT_ONLY) - ((int) FPREngine.fpr_rint(dArr[i22 + i96]));
            i74 += iFpr_rint * iFpr_rint;
            i92 |= i74;
        }
        int i99 = i74 | (-(i92 >>> 31));
        short[] sArr3 = new short[i3];
        for (int i100 = 0; i100 < i3; i100++) {
            sArr3[i100] = (short) (-FPREngine.fpr_rint(dArr[i32 + i100]));
        }
        if (FalconCommon.is_short_half(i99, sArr3, i) == 0) {
            return 0;
        }
        System.arraycopy(sArr3, 0, sArr, 0, i3);
        return 1;
    }

    public void ffSampling_fft_dyntree(SamplerCtx samplerCtx, double[] dArr, int i, double[] dArr2, int i2, double[] dArr3, int i3, double[] dArr4, int i5, double[] dArr5, int i6, int i21, int i22, double[] dArr6, int i32) {
        if (i22 == 0) {
            double dSqrt = Math.sqrt(dArr3[i3]) * FPREngine.fpr_inv_sigma[i21];
            dArr[i] = SamplerZ.sample(samplerCtx, dArr[i], dSqrt);
            dArr2[i2] = SamplerZ.sample(samplerCtx, dArr2[i2], dSqrt);
            return;
        }
        int i33 = 1 << i22;
        int i43 = i33 >> 1;
        FalconFFT.poly_LDL_fft(dArr3, i3, dArr4, i5, dArr5, i6, i22);
        int i59 = i32 + i43;
        FalconFFT.poly_split_fft(dArr6, i32, dArr6, i59, dArr3, i3, i22);
        System.arraycopy(dArr6, i32, dArr3, i3, i33);
        FalconFFT.poly_split_fft(dArr6, i32, dArr6, i59, dArr5, i6, i22);
        System.arraycopy(dArr6, i32, dArr5, i6, i33);
        System.arraycopy(dArr4, i5, dArr6, i32, i33);
        System.arraycopy(dArr3, i3, dArr4, i5, i43);
        int i66 = i5 + i43;
        System.arraycopy(dArr5, i6, dArr4, i66, i43);
        int i74 = i32 + i33;
        int i92 = i74 + i43;
        FalconFFT.poly_split_fft(dArr6, i74, dArr6, i92, dArr2, i2, i22);
        int i96 = i22 - 1;
        ffSampling_fft_dyntree(samplerCtx, dArr6, i74, dArr6, i92, dArr5, i6, dArr5, i6 + i43, dArr4, i66, i21, i96, dArr6, i74 + i33);
        int i99 = i32 + (i33 << 1);
        FalconFFT.poly_merge_fft(dArr6, i99, dArr6, i74, dArr6, i92, i22);
        System.arraycopy(dArr2, i2, dArr6, i74, i33);
        FalconFFT.poly_sub(dArr6, i74, dArr6, i99, i22);
        System.arraycopy(dArr6, i99, dArr2, i2, i33);
        FalconFFT.poly_mul_fft(dArr6, i32, dArr6, i74, i22);
        FalconFFT.poly_add(dArr, i, dArr6, i32, i22);
        FalconFFT.poly_split_fft(dArr6, i32, dArr6, i59, dArr, i, i22);
        ffSampling_fft_dyntree(samplerCtx, dArr6, i32, dArr6, i59, dArr3, i3, dArr3, i3 + i43, dArr4, i5, i21, i96, dArr6, i74);
        FalconFFT.poly_merge_fft(dArr, i, dArr6, i32, dArr6, i59, i22);
    }

    public void sign_dyn(short[] sArr, SHAKEDigest sHAKEDigest, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, short[] sArr2, int i, double[] dArr) {
        SamplerCtx samplerCtx;
        do {
            samplerCtx = new SamplerCtx();
            samplerCtx.sigma_min = FPREngine.fpr_sigma_min[i];
            samplerCtx.f228799p.prng_init(sHAKEDigest);
        } while (do_sign_dyn(samplerCtx, sArr, bArr, bArr2, bArr3, bArr4, sArr2, i, dArr, 0) == 0);
    }

    public void smallints_to_fpr(double[] dArr, int i, byte[] bArr, int i2) {
        int i3 = 1 << i2;
        for (int i5 = 0; i5 < i3; i5++) {
            dArr[i + i5] = bArr[i5];
        }
    }
}
