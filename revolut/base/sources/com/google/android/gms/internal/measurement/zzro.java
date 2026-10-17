package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes16.dex */
public final class zzro implements zzrn {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    public static final zzki f40691zza;

    static {
        zzkf zzkfVarZza = new zzkf(zzjx.zza("com.google.android.gms.measurement")).zzb().zza();
        f40691zza = zzkfVarZza.zzf("measurement.tcf.consent_fix", false);
        zzkfVarZza.zzf("measurement.tcf.client", true);
        zzkfVarZza.zzd("measurement.id.tcf", 0L);
    }

    @Override // com.google.android.gms.internal.measurement.zzrn
    public final boolean zza() {
        return ((Boolean) f40691zza.zzb()).booleanValue();
    }
}
