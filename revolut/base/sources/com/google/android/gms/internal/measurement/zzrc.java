package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes16.dex */
public final class zzrc implements zzrb {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    public static final zzki f40672zza;

    static {
        zzkf zzkfVarZza = new zzkf(zzjx.zza("com.google.android.gms.measurement")).zzb().zza();
        f40672zza = zzkfVarZza.zzf("measurement.backfill_session_ids.service", false);
        zzkfVarZza.zzd("measurement.id.backfill_session_ids.service", 0L);
    }

    @Override // com.google.android.gms.internal.measurement.zzrb
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zzrb
    public final boolean zzb() {
        return ((Boolean) f40672zza.zzb()).booleanValue();
    }
}
