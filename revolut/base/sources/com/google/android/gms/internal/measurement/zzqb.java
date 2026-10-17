package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes16.dex */
public final class zzqb implements zzqa {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    public static final zzki f40633zza;

    static {
        zzkf zzkfVarZza = new zzkf(zzjx.zza("com.google.android.gms.measurement")).zzb().zza();
        zzkfVarZza.zzd("measurement.id.upload_controller_wait_initialization", 0L);
        f40633zza = zzkfVarZza.zzf("measurement.upload_controller.wait_initialization", false);
    }

    @Override // com.google.android.gms.internal.measurement.zzqa
    public final boolean zza() {
        return ((Boolean) f40633zza.zzb()).booleanValue();
    }
}
