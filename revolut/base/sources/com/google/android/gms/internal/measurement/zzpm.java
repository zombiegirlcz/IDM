package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes16.dex */
public final class zzpm implements zzpl {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    public static final zzki f40614zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    public static final zzki f40615zzb;

    static {
        zzkf zzkfVarZza = new zzkf(zzjx.zza("com.google.android.gms.measurement")).zzb().zza();
        f40614zza = zzkfVarZza.zzf("measurement.set_default_event_parameters_propagate_clear.client.dev", false);
        f40615zzb = zzkfVarZza.zzf("measurement.set_default_event_parameters_propagate_clear.service", false);
        zzkfVarZza.zzd("measurement.id.set_default_event_parameters_propagate_clear.experiment_id", 0L);
    }

    @Override // com.google.android.gms.internal.measurement.zzpl
    public final boolean zza() {
        return ((Boolean) f40614zza.zzb()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzpl
    public final boolean zzb() {
        return ((Boolean) f40615zzb.zzb()).booleanValue();
    }
}
