package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes16.dex */
final class zznr implements zzne {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final zznh f40521zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final String f40522zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private final Object[] f40523zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private final int f40524zzd;

    public zznr(zznh zznhVar, String str, Object[] objArr) {
        this.f40521zza = zznhVar;
        this.f40522zzb = str;
        this.f40523zzc = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f40524zzd = cCharAt;
            return;
        }
        int i = cCharAt & 8191;
        int i2 = 1;
        int i3 = 13;
        while (true) {
            int i5 = i2 + 1;
            char cCharAt2 = str.charAt(i2);
            if (cCharAt2 < 55296) {
                this.f40524zzd = i | (cCharAt2 << i3);
                return;
            } else {
                i |= (cCharAt2 & 8191) << i3;
                i3 += 13;
                i2 = i5;
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzne
    public final zznh zza() {
        return this.f40521zza;
    }

    @Override // com.google.android.gms.internal.measurement.zzne
    public final boolean zzb() {
        return (this.f40524zzd & 2) == 2;
    }

    @Override // com.google.android.gms.internal.measurement.zzne
    public final int zzc() {
        int i = this.f40524zzd;
        if ((i & 1) != 0) {
            return 1;
        }
        return (i & 4) == 4 ? 3 : 2;
    }

    public final String zzd() {
        return this.f40522zzb;
    }

    public final Object[] zze() {
        return this.f40523zzc;
    }
}
