package com.google.android.gms.internal.fido;

import a0.d;
import java.math.RoundingMode;
import java.util.Arrays;

/* JADX INFO: loaded from: classes16.dex */
final class zzgb {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final int f39470zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final int f39471zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    final int f39472zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    final int f39473zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    private final String f39474zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    private final char[] f39475zzf;

    /* JADX INFO: renamed from: zzg, reason: collision with root package name */
    private final byte[] f39476zzg;

    /* JADX INFO: renamed from: zzh, reason: collision with root package name */
    private final boolean f39477zzh;

    /* JADX WARN: Illegal instructions before constructor call */
    public zzgb(String str, char[] cArr) {
        byte[] bArr = new byte[128];
        Arrays.fill(bArr, (byte) -1);
        for (int i = 0; i < cArr.length; i++) {
            char c2 = cArr[i];
            boolean z = true;
            zzbm.zzd(c2 < 128, "Non-ASCII character: %s", c2);
            if (bArr[c2] != -1) {
                z = false;
            }
            zzbm.zzd(z, "Duplicate character: %s", c2);
            bArr[c2] = (byte) i;
        }
        this(str, cArr, bArr, false);
    }

    public final boolean equals(Object obj2) {
        if (obj2 instanceof zzgb) {
            zzgb zzgbVar = (zzgb) obj2;
            if (this.f39477zzh == zzgbVar.f39477zzh && Arrays.equals(this.f39475zzf, zzgbVar.f39475zzf)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f39475zzf) + (true != this.f39477zzh ? 1237 : 1231);
    }

    public final String toString() {
        return this.f39474zze;
    }

    public final char zza(int i) {
        return this.f39475zzf[i];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10 */
    public final zzgb zzb() {
        int i;
        boolean z;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            char[] cArr = this.f39475zzf;
            if (i3 >= cArr.length) {
                return this;
            }
            if (zzba.zza(cArr[i3])) {
                int i5 = 0;
                while (true) {
                    if (i5 >= cArr.length) {
                        z = false;
                        break;
                    }
                    char c2 = cArr[i5];
                    if (c2 >= 'A' && c2 <= 'Z') {
                        z = true;
                        break;
                    }
                    i5++;
                }
                zzbm.zzf(!z, "Cannot call upperCase() on a mixed-case alphabet");
                char[] cArr2 = new char[this.f39475zzf.length];
                while (true) {
                    char[] cArr3 = this.f39475zzf;
                    if (i2 >= cArr3.length) {
                        break;
                    }
                    char c3 = cArr3[i2];
                    if (zzba.zza(c3)) {
                        c3 ^= 32;
                    }
                    cArr2[i2] = (char) c3;
                    i2++;
                }
                zzgb zzgbVar = new zzgb(this.f39474zze.concat(".upperCase()"), cArr2);
                if (!this.f39477zzh || zzgbVar.f39477zzh) {
                    return zzgbVar;
                }
                byte[] bArr = zzgbVar.f39476zzg;
                byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
                for (i = 65; i <= 90; i++) {
                    int i6 = i | 32;
                    byte[] bArr2 = zzgbVar.f39476zzg;
                    byte b4 = bArr2[i];
                    byte b5 = bArr2[i6];
                    if (b4 == -1) {
                        bArrCopyOf[i] = b5;
                    } else {
                        char c5 = (char) i;
                        char c6 = (char) i6;
                        if (b5 != -1) {
                            throw new IllegalStateException(zzbo.zza("Can't ignoreCase() since '%s' and '%s' encode different values", Character.valueOf(c5), Character.valueOf(c6)));
                        }
                        bArrCopyOf[i6] = b4;
                    }
                }
                return new zzgb(zzgbVar.f39474zze.concat(".ignoreCase()"), zzgbVar.f39475zzf, bArrCopyOf, true);
            }
            i3++;
        }
    }

    public final boolean zzc(char c2) {
        byte[] bArr = this.f39476zzg;
        return bArr.length > 61 && bArr[61] != -1;
    }

    private zzgb(String str, char[] cArr, byte[] bArr, boolean z) {
        this.f39474zze = str;
        cArr.getClass();
        this.f39475zzf = cArr;
        try {
            int length = cArr.length;
            int iZzb = zzgh.zzb(length, RoundingMode.UNNECESSARY);
            this.f39471zzb = iZzb;
            int iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(iZzb);
            int i = 1 << (3 - iNumberOfTrailingZeros);
            this.f39472zzc = i;
            this.f39473zzd = iZzb >> iNumberOfTrailingZeros;
            this.f39470zza = length - 1;
            this.f39476zzg = bArr;
            boolean[] zArr = new boolean[i];
            for (int i2 = 0; i2 < this.f39473zzd; i2++) {
                zArr[zzgh.zza(i2 * 8, this.f39471zzb, RoundingMode.CEILING)] = true;
            }
            this.f39477zzh = z;
        } catch (ArithmeticException e) {
            throw new IllegalArgumentException(d.n("Illegal alphabet length ", cArr.length), e);
        }
    }
}
