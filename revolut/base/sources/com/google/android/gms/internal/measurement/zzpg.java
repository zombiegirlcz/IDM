package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes16.dex */
public final class zzpg implements zzpf {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    public static final zzki f40606zza;

    static {
        zzkf zzkfVarZza = new zzkf(zzjx.zza("com.google.android.gms.measurement")).zzb().zza();
        zzkfVarZza.zzf("measurement.client.3p_consent_state_v1", true);
        zzkfVarZza.zzf("measurement.service.consent_state_v1_W36", true);
        f40606zza = zzkfVarZza.zzd("measurement.service.storage_consent_support_version", 203600L);
    }

    @Override // com.google.android.gms.internal.measurement.zzpf
    public final long zza() {
        return ((Long) f40606zza.zzb()).longValue();
    }
}
