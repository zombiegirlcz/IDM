package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes16.dex */
public final class zzox implements zzow {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    public static final zzki f40585zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    public static final zzki f40586zzb;

    static {
        zzkf zzkfVarZza = new zzkf(zzjx.zza("com.google.android.gms.measurement")).zzb().zza();
        f40585zza = zzkfVarZza.zzf("measurement.admob_plus_removal.client.dev", false);
        f40586zzb = zzkfVarZza.zzf("measurement.admob_plus_removal.service", false);
    }

    @Override // com.google.android.gms.internal.measurement.zzow
    public final boolean zza() {
        return ((Boolean) f40585zza.zzb()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzow
    public final boolean zzb() {
        return ((Boolean) f40586zzb.zzb()).booleanValue();
    }
}
