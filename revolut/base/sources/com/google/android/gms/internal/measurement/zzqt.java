package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes16.dex */
public final class zzqt implements zzqs {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    public static final zzki f40656zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    public static final zzki f40657zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    public static final zzki f40658zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    public static final zzki f40659zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    public static final zzki f40660zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    public static final zzki f40661zzf;

    /* JADX INFO: renamed from: zzg, reason: collision with root package name */
    public static final zzki f40662zzg;

    /* JADX INFO: renamed from: zzh, reason: collision with root package name */
    public static final zzki f40663zzh;

    static {
        zzkf zzkfVarZza = new zzkf(zzjx.zza("com.google.android.gms.measurement")).zzb().zza();
        zzkfVarZza.zzf("measurement.rb.attribution.ad_campaign_info", true);
        zzkfVarZza.zzf("measurement.rb.attribution.service.bundle_on_backgrounded", true);
        f40656zza = zzkfVarZza.zzf("measurement.rb.attribution.client2", true);
        zzkfVarZza.zzf("measurement.rb.attribution.dma_fix", true);
        f40657zzb = zzkfVarZza.zzf("measurement.rb.attribution.followup1.service", false);
        zzkfVarZza.zzf("measurement.rb.attribution.client.get_trigger_uris_async", true);
        f40658zzc = zzkfVarZza.zzf("measurement.rb.attribution.service.trigger_uris_high_priority", true);
        zzkfVarZza.zzf("measurement.rb.attribution.index_out_of_bounds_fix", true);
        f40659zzd = zzkfVarZza.zzf("measurement.rb.attribution.service.enable_max_trigger_uris_queried_at_once", true);
        f40660zze = zzkfVarZza.zzf("measurement.rb.attribution.retry_disposition", false);
        f40661zzf = zzkfVarZza.zzf("measurement.rb.attribution.service", true);
        f40662zzg = zzkfVarZza.zzf("measurement.rb.attribution.enable_trigger_redaction", true);
        f40663zzh = zzkfVarZza.zzf("measurement.rb.attribution.uuid_generation", true);
        zzkfVarZza.zzd("measurement.id.rb.attribution.retry_disposition", 0L);
        zzkfVarZza.zzf("measurement.rb.attribution.improved_retry", true);
    }

    @Override // com.google.android.gms.internal.measurement.zzqs
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zzqs
    public final boolean zzb() {
        return ((Boolean) f40656zza.zzb()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzqs
    public final boolean zzc() {
        return ((Boolean) f40657zzb.zzb()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzqs
    public final boolean zzd() {
        return ((Boolean) f40658zzc.zzb()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzqs
    public final boolean zze() {
        return ((Boolean) f40659zzd.zzb()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzqs
    public final boolean zzf() {
        return ((Boolean) f40660zze.zzb()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzqs
    public final boolean zzg() {
        return ((Boolean) f40661zzf.zzb()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzqs
    public final boolean zzh() {
        return ((Boolean) f40662zzg.zzb()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzqs
    public final boolean zzi() {
        return ((Boolean) f40663zzh.zzb()).booleanValue();
    }
}
