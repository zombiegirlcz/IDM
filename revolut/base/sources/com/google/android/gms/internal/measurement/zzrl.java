package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes16.dex */
public final class zzrl implements zzrk {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    public static final zzki f40681zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    public static final zzki f40682zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    public static final zzki f40683zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    public static final zzki f40684zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    public static final zzki f40685zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    public static final zzki f40686zzf;

    /* JADX INFO: renamed from: zzg, reason: collision with root package name */
    public static final zzki f40687zzg;

    /* JADX INFO: renamed from: zzh, reason: collision with root package name */
    public static final zzki f40688zzh;

    static {
        zzkf zzkfVarZza = new zzkf(zzjx.zza("com.google.android.gms.measurement")).zzb().zza();
        f40681zza = zzkfVarZza.zzf("measurement.sgtm.client.scion_upload_action", true);
        f40682zzb = zzkfVarZza.zzf("measurement.sgtm.client.upload_on_backgrounded.dev", false);
        f40683zzc = zzkfVarZza.zzf("measurement.sgtm.google_signal.enable", true);
        zzkfVarZza.zzf("measurement.sgtm.no_proxy.client", true);
        f40684zzd = zzkfVarZza.zzf("measurement.sgtm.no_proxy.client2", false);
        f40685zze = zzkfVarZza.zzf("measurement.sgtm.no_proxy.service", false);
        zzkfVarZza.zzf("measurement.sgtm.preview_mode_enabled", true);
        zzkfVarZza.zzf("measurement.sgtm.rollout_percentage_fix", true);
        zzkfVarZza.zzf("measurement.sgtm.service", true);
        f40686zzf = zzkfVarZza.zzf("measurement.sgtm.service.batching_on_backgrounded", false);
        f40687zzg = zzkfVarZza.zzf("measurement.sgtm.upload_queue", true);
        f40688zzh = zzkfVarZza.zzf("measurement.sgtm.upload_on_uninstall", true);
        zzkfVarZza.zzd("measurement.id.sgtm", 0L);
        zzkfVarZza.zzd("measurement.id.sgtm_noproxy", 0L);
    }

    @Override // com.google.android.gms.internal.measurement.zzrk
    public final boolean zza() {
        return ((Boolean) f40681zza.zzb()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzrk
    public final boolean zzb() {
        return ((Boolean) f40682zzb.zzb()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzrk
    public final boolean zzc() {
        return ((Boolean) f40683zzc.zzb()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzrk
    public final boolean zzd() {
        return ((Boolean) f40684zzd.zzb()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzrk
    public final boolean zze() {
        return ((Boolean) f40685zze.zzb()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzrk
    public final boolean zzf() {
        return ((Boolean) f40686zzf.zzb()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzrk
    public final boolean zzg() {
        return ((Boolean) f40687zzg.zzb()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzrk
    public final boolean zzh() {
        return ((Boolean) f40688zzh.zzb()).booleanValue();
    }
}
