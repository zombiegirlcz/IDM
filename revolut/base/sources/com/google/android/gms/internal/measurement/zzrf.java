package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes16.dex */
public final class zzrf implements zzre {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    public static final zzki f40675zza;

    static {
        zzkf zzkfVarZza = new zzkf(zzjx.zza("com.google.android.gms.measurement")).zzb().zza();
        zzkfVarZza.zzf("measurement.collection.enable_session_stitching_token.client.dev", true);
        f40675zza = zzkfVarZza.zzf("measurement.session_stitching_token_enabled", false);
        zzkfVarZza.zzf("measurement.link_sst_to_sid", true);
    }

    @Override // com.google.android.gms.internal.measurement.zzre
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zzre
    public final boolean zzb() {
        return ((Boolean) f40675zza.zzb()).booleanValue();
    }
}
