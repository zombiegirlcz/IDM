package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes16.dex */
public final class zzqk implements zzqj {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    public static final zzki f40642zza;

    static {
        zzkf zzkfVarZza = new zzkf(zzjx.zza("com.google.android.gms.measurement")).zzb().zza();
        zzkfVarZza.zzf("measurement.gmscore_feature_tracking", true);
        f40642zza = zzkfVarZza.zzf("measurement.gmscore_client_telemetry", false);
    }

    @Override // com.google.android.gms.internal.measurement.zzqj
    public final boolean zza() {
        return ((Boolean) f40642zza.zzb()).booleanValue();
    }
}
