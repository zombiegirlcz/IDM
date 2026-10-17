package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes16.dex */
public final class zzps implements zzpr {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    public static final zzki f40622zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    public static final zzki f40623zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    public static final zzki f40624zzc;

    static {
        zzkf zzkfVarZza = new zzkf(zzjx.zza("com.google.android.gms.measurement")).zzb().zza();
        zzkfVarZza.zzf("measurement.service.audience.fix_skip_audience_with_failed_filters", true);
        f40622zza = zzkfVarZza.zzf("measurement.audience.refresh_event_count_filters_timestamp", false);
        f40623zzb = zzkfVarZza.zzf("measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters", false);
        f40624zzc = zzkfVarZza.zzf("measurement.audience.use_bundle_timestamp_for_event_count_filters", false);
    }

    @Override // com.google.android.gms.internal.measurement.zzpr
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zzpr
    public final boolean zzb() {
        return ((Boolean) f40622zza.zzb()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzpr
    public final boolean zzc() {
        return ((Boolean) f40623zzb.zzb()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzpr
    public final boolean zzd() {
        return ((Boolean) f40624zzc.zzb()).booleanValue();
    }
}
