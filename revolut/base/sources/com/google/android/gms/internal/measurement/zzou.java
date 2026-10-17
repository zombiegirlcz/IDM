package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes16.dex */
public final class zzou implements zzot {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    public static final zzki f40582zza;

    static {
        zzkf zzkfVarZza = new zzkf(zzjx.zza("com.google.android.gms.measurement")).zzb().zza();
        f40582zza = zzkfVarZza.zzf("measurement.service.ad_impression.convert_value_to_double", true);
        zzkfVarZza.zzf("measurement.service.separate_public_internal_event_blacklisting", true);
        zzkfVarZza.zzf("measurement.service.ad_impression", true);
    }

    @Override // com.google.android.gms.internal.measurement.zzot
    public final boolean zza() {
        return ((Boolean) f40582zza.zzb()).booleanValue();
    }
}
