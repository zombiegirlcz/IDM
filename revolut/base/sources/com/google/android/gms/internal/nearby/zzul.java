package com.google.android.gms.internal.nearby;

import a0.d;
import com.google.android.gms.internal.mlkit_vision_face.a;
import java.math.RoundingMode;
import java.util.Arrays;

/* JADX INFO: loaded from: classes16.dex */
final class zzul {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final int f45756zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final int f45757zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    final int f45758zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    final int f45759zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    private final String f45760zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    private final char[] f45761zzf;

    /* JADX INFO: renamed from: zzg, reason: collision with root package name */
    private final byte[] f45762zzg;

    /* JADX INFO: renamed from: zzh, reason: collision with root package name */
    private final boolean[] f45763zzh;

    /* JADX INFO: renamed from: zzi, reason: collision with root package name */
    private final boolean f45764zzi;

    /* JADX WARN: Illegal instructions before constructor call */
    public zzul(String str, char[] cArr) {
        byte[] bArr = new byte[128];
        Arrays.fill(bArr, (byte) -1);
        for (int i = 0; i < cArr.length; i++) {
            char c2 = cArr[i];
            boolean z = true;
            zztq.zzf(c2 < 128, "Non-ASCII character: %s", c2);
            if (bArr[c2] != -1) {
                z = false;
            }
            zztq.zzf(z, "Duplicate character: %s", c2);
            bArr[c2] = (byte) i;
        }
        this(str, cArr, bArr, false);
    }

    public final boolean equals(Object obj2) {
        return (obj2 instanceof zzul) && Arrays.equals(this.f45761zzf, ((zzul) obj2).f45761zzf);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f45761zzf) + 1237;
    }

    public final String toString() {
        return this.f45760zze;
    }

    public final char zza(int i) {
        return this.f45761zzf[i];
    }

    public final int zzb(char c2) throws zzuo {
        if (c2 > 127) {
            throw new zzuo("Unrecognized character: 0x".concat(String.valueOf(Integer.toHexString(c2))));
        }
        byte b4 = this.f45762zzg[c2];
        if (b4 != -1) {
            return b4;
        }
        if (c2 <= ' ' || c2 == 127) {
            throw new zzuo("Unrecognized character: 0x".concat(String.valueOf(Integer.toHexString(c2))));
        }
        throw new zzuo(a.j(c2, "Unrecognized character: "));
    }

    public final boolean zzc(int i) {
        return this.f45763zzh[i % this.f45758zzc];
    }

    public final boolean zzd(char c2) {
        return c2 < 128 && this.f45762zzg[c2] != -1;
    }

    private zzul(String str, char[] cArr, byte[] bArr, boolean z) {
        this.f45760zze = str;
        cArr.getClass();
        this.f45761zzf = cArr;
        try {
            int length = cArr.length;
            int iZzb = zzut.zzb(length, RoundingMode.UNNECESSARY);
            this.f45757zzb = iZzb;
            int iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(iZzb);
            int i = 1 << (3 - iNumberOfTrailingZeros);
            this.f45758zzc = i;
            this.f45759zzd = iZzb >> iNumberOfTrailingZeros;
            this.f45756zza = length - 1;
            this.f45762zzg = bArr;
            boolean[] zArr = new boolean[i];
            for (int i2 = 0; i2 < this.f45759zzd; i2++) {
                zArr[zzut.zza(i2 * 8, this.f45757zzb, RoundingMode.CEILING)] = true;
            }
            this.f45763zzh = zArr;
            this.f45764zzi = false;
        } catch (ArithmeticException e) {
            throw new IllegalArgumentException(d.n("Illegal alphabet length ", cArr.length), e);
        }
    }
}
