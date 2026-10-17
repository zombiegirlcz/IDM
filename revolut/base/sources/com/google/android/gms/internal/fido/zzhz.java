package com.google.android.gms.internal.fido;

/* JADX INFO: loaded from: classes16.dex */
public final class zzhz implements zzhy {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    public static final zzaq f39556zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    public static final zzaq f39557zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    public static final zzaq f39558zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    public static final zzaq f39559zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    public static final zzaq f39560zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    public static final zzaq f39561zzf;

    /* JADX INFO: renamed from: zzg, reason: collision with root package name */
    public static final zzaq f39562zzg;

    static {
        zzay zzayVarZzd = new zzay("com.google.android.gms.fido").zze(zzcf.zzl("FIDO")).zzd();
        f39556zza = zzayVarZzd.zzc("Hybrid__client_enabled", false);
        f39557zzb = zzayVarZzd.zzc("Hybrid__disavow_location_permissions", true);
        f39558zzc = zzayVarZzd.zza("Hybrid__number_of_seconds_to_wait_for_bt_scanning_radio_to_be_ready", 3L);
        f39559zzd = zzayVarZzd.zza("Hybrid__number_of_seconds_to_wait_for_bt_scanning_turning_on", 3L);
        f39560zze = zzayVarZzd.zzc("Hybrid__prf_eval_during_create", true);
        f39561zzf = zzayVarZzd.zzc("Hybrid__use_hybrid_for_server_link", false);
        f39562zzg = zzayVarZzd.zzc("Hybrid__websocket_close_socket", true);
    }

    @Override // com.google.android.gms.internal.fido.zzhy
    public final boolean zza() {
        return ((Boolean) f39556zza.zza()).booleanValue();
    }
}
