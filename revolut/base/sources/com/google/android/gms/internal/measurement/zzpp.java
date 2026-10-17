package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes16.dex */
public final class zzpp implements zzpo {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    public static final zzki f40618zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    public static final zzki f40619zzb;

    static {
        zzkf zzkfVarZza = new zzkf(zzjx.zza("com.google.android.gms.measurement")).zzb().zza();
        zzkfVarZza.zzf("measurement.collection.event_safelist", true);
        f40618zza = zzkfVarZza.zzf("measurement.service.store_null_safelist", true);
        f40619zzb = zzkfVarZza.zzf("measurement.service.store_safelist", true);
    }

    @Override // com.google.android.gms.internal.measurement.zzpo
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zzpo
    public final boolean zzb() {
        return ((Boolean) f40618zza.zzb()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzpo
    public final boolean zzc() {
        return ((Boolean) f40619zzb.zzb()).booleanValue();
    }
}
