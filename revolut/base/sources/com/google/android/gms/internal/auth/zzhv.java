package com.google.android.gms.internal.auth;

/* JADX INFO: loaded from: classes16.dex */
public final class zzhv implements zzhu {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    public static final zzdc f39166zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    public static final zzdc f39167zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    public static final zzdc f39168zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    public static final zzdc f39169zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    public static final zzdc f39170zze;

    static {
        zzcz zzczVarZza = new zzcz(zzcr.zza("com.google.android.gms.auth_account")).zzb().zza();
        f39166zza = zzczVarZza.zze("Aang__create_auth_exception_with_pending_intent", false);
        f39167zzb = zzczVarZza.zze("Aang__enable_add_account_restrictions", false);
        f39168zzc = zzczVarZza.zze("Aang__log_missing_gaia_id_event", true);
        f39169zzd = zzczVarZza.zze("Aang__log_obfuscated_gaiaid_status", true);
        f39170zze = zzczVarZza.zze("Aang__switch_clear_token_to_aang", false);
    }

    @Override // com.google.android.gms.internal.auth.zzhu
    public final boolean zza() {
        return ((Boolean) f39166zza.zzb()).booleanValue();
    }
}
