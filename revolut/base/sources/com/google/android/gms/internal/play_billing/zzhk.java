package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes16.dex */
final class zzhk implements zzgy {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final zzhb f46094zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final String f46095zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private final Object[] f46096zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private final int f46097zzd;

    public zzhk(zzhb zzhbVar, String str, Object[] objArr) {
        this.f46094zza = zzhbVar;
        this.f46095zzb = str;
        this.f46096zzc = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f46097zzd = cCharAt;
            return;
        }
        int i = cCharAt & 8191;
        int i2 = 1;
        int i3 = 13;
        while (true) {
            int i5 = i2 + 1;
            char cCharAt2 = str.charAt(i2);
            if (cCharAt2 < 55296) {
                this.f46097zzd = i | (cCharAt2 << i3);
                return;
            } else {
                i |= (cCharAt2 & 8191) << i3;
                i3 += 13;
                i2 = i5;
            }
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzgy
    public final zzhb zza() {
        return this.f46094zza;
    }

    @Override // com.google.android.gms.internal.play_billing.zzgy
    public final boolean zzb() {
        return (this.f46097zzd & 2) == 2;
    }

    @Override // com.google.android.gms.internal.play_billing.zzgy
    public final int zzc() {
        int i = this.f46097zzd;
        if ((i & 1) != 0) {
            return 1;
        }
        return (i & 4) == 4 ? 3 : 2;
    }

    public final String zzd() {
        return this.f46095zzb;
    }

    public final Object[] zze() {
        return this.f46096zzc;
    }
}
