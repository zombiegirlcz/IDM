package com.google.android.gms.internal.fido;

/* JADX INFO: loaded from: classes16.dex */
public final class zzhw implements zzhv {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    public static final zzaq f39546zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    public static final zzaq f39547zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    public static final zzaq f39548zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    public static final zzaq f39549zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    public static final zzaq f39550zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    public static final zzaq f39551zzf;

    /* JADX INFO: renamed from: zzg, reason: collision with root package name */
    public static final zzaq f39552zzg;

    /* JADX INFO: renamed from: zzh, reason: collision with root package name */
    public static final zzaq f39553zzh;

    static {
        zzay zzayVarZzd = new zzay("com.google.android.gms.fido").zze(zzcf.zzl("FIDO")).zzd();
        f39546zza = zzayVarZzd.zzc("Fido2Ctap2Support__disable_transport_comparator", true);
        f39547zzb = zzayVarZzd.zzc("Fido2Ctap2Support__enable_cancelling_requests", true);
        f39548zzc = zzayVarZzd.zzc("Fido2Ctap2Support__enable_flow_separation_refactor", false);
        f39549zzd = zzayVarZzd.zzc("Fido2Ctap2Support__nfc_activity_destroyed_check", true);
        f39550zze = zzayVarZzd.zzc("Fido2Ctap2Support__remove_this_device_for_assertions", false);
        f39551zzf = zzayVarZzd.zzc("Fido2Ctap2Support__skip_usb_permission_dialog", false);
        f39552zzg = zzayVarZzd.zzc("Fido2Ctap2Support__transport_controller_refactor", false);
        f39553zzh = zzayVarZzd.zzc("Fido2Ctap2Support__update_user_cancel_response", false);
    }

    @Override // com.google.android.gms.internal.fido.zzhv
    public final boolean zza() {
        return ((Boolean) f39548zzc.zza()).booleanValue();
    }
}
