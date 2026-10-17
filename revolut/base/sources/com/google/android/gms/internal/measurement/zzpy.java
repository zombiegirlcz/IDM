package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes16.dex */
public final class zzpy implements zzpx {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    public static final zzki f40630zza;

    static {
        zzkf zzkfVarZza = new zzkf(zzjx.zza("com.google.android.gms.measurement")).zzb().zza();
        zzkfVarZza.zzd("measurement.id.prune_ees_config", 0L);
        f40630zza = zzkfVarZza.zzf("measurement.fix_high_memory.prune_ees_config", false);
    }

    @Override // com.google.android.gms.internal.measurement.zzpx
    public final boolean zza() {
        return ((Boolean) f40630zza.zzb()).booleanValue();
    }
}
