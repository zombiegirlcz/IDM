package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes16.dex */
public final class zzpj implements zzpi {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    public static final zzki f40609zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    public static final zzki f40610zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    public static final zzki f40611zzc;

    static {
        zzkf zzkfVarZza = new zzkf(zzjx.zza("com.google.android.gms.measurement")).zzb().zza();
        zzkfVarZza.zzf("measurement.set_default_event_parameters_with_backfill.client.dev", false);
        zzkfVarZza.zzf("measurement.set_default_event_parameters_with_backfill.service", true);
        zzkfVarZza.zzd("measurement.id.set_default_event_parameters.fix_service_request_ordering", 0L);
        f40609zza = zzkfVarZza.zzf("measurement.set_default_event_parameters.fix_app_update_logging", true);
        f40610zzb = zzkfVarZza.zzf("measurement.set_default_event_parameters.fix_deferred_analytics_collection", true);
        f40611zzc = zzkfVarZza.zzf("measurement.set_default_event_parameters.fix_service_request_ordering", false);
        zzkfVarZza.zzf("measurement.set_default_event_parameters.fix_subsequent_launches", true);
    }

    @Override // com.google.android.gms.internal.measurement.zzpi
    public final boolean zza() {
        return ((Boolean) f40609zza.zzb()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzpi
    public final boolean zzb() {
        return ((Boolean) f40610zzb.zzb()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzpi
    public final boolean zzc() {
        return ((Boolean) f40611zzc.zzb()).booleanValue();
    }
}
