package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes16.dex */
public final class zzri implements zzrh {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    public static final zzki f40678zza;

    static {
        zzkf zzkfVarZza = new zzkf(zzjx.zza("com.google.android.gms.measurement")).zzb().zza();
        zzkfVarZza.zzf("measurement.client.sessions.background_sessions_enabled", true);
        f40678zza = zzkfVarZza.zzf("measurement.client.sessions.enable_fix_background_engagement", false);
        zzkfVarZza.zzf("measurement.client.sessions.immediate_start_enabled_foreground", true);
        zzkfVarZza.zzf("measurement.client.sessions.enable_pause_engagement_in_background", true);
        zzkfVarZza.zzf("measurement.client.sessions.session_id_enabled", true);
        zzkfVarZza.zzd("measurement.id.client.sessions.enable_fix_background_engagement", 0L);
    }

    @Override // com.google.android.gms.internal.measurement.zzrh
    public final boolean zza() {
        return ((Boolean) f40678zza.zzb()).booleanValue();
    }
}
