package com.google.android.gms.internal.auth;

import android.util.Base64;

/* JADX INFO: loaded from: classes16.dex */
public final class zzhz implements zzhx {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    public static final zzdc f39174zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    public static final zzdc f39175zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    public static final zzdc f39176zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    public static final zzdc f39177zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    public static final zzdc f39178zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    public static final zzdc f39179zzf;

    /* JADX INFO: renamed from: zzg, reason: collision with root package name */
    public static final zzdc f39180zzg;

    /* JADX INFO: renamed from: zzh, reason: collision with root package name */
    public static final zzdc f39181zzh;

    /* JADX INFO: renamed from: zzi, reason: collision with root package name */
    public static final zzdc f39182zzi;

    /* JADX INFO: renamed from: zzj, reason: collision with root package name */
    public static final zzdc f39183zzj;

    /* JADX INFO: renamed from: zzk, reason: collision with root package name */
    public static final zzdc f39184zzk;

    /* JADX INFO: renamed from: zzl, reason: collision with root package name */
    public static final zzdc f39185zzl;
    public static final zzdc zzm;

    static {
        zzcz zzczVarZza = new zzcz(zzcr.zza("com.google.android.gms.auth_account")).zzb().zza();
        f39174zza = zzczVarZza.zzc("getTokenRefactor__account_data_service_sample_percentage", 0.0d);
        f39175zzb = zzczVarZza.zze("getTokenRefactor__account_data_service_tokenAPI_usable", true);
        f39176zzc = zzczVarZza.zzd("getTokenRefactor__account_manager_timeout_seconds", 20L);
        f39177zzd = zzczVarZza.zzd("getTokenRefactor__android_id_shift", 0L);
        try {
            f39178zze = zzczVarZza.zzf("getTokenRefactor__blocked_packages", zzhs.zzp(Base64.decode("ChNjb20uYW5kcm9pZC52ZW5kaW5nCiBjb20uZ29vZ2xlLmFuZHJvaWQuYXBwcy5tZWV0aW5ncwohY29tLmdvb2dsZS5hbmRyb2lkLmFwcHMubWVzc2FnaW5n", 3)), zzhy.f39173zza);
            f39179zzf = zzczVarZza.zze("getTokenRefactor__chimera_get_token_evolved", true);
            f39180zzg = zzczVarZza.zzd("getTokenRefactor__clear_token_timeout_seconds", 20L);
            f39181zzh = zzczVarZza.zzd("getTokenRefactor__default_task_timeout_seconds", 20L);
            f39182zzi = zzczVarZza.zze("getTokenRefactor__gaul_accounts_api_evolved", false);
            f39183zzj = zzczVarZza.zze("getTokenRefactor__gaul_token_api_evolved", false);
            f39184zzk = zzczVarZza.zzd("getTokenRefactor__get_token_timeout_seconds", 120L);
            f39185zzl = zzczVarZza.zze("getTokenRefactor__gms_account_authenticator_evolved", true);
            zzm = zzczVarZza.zzc("getTokenRefactor__gms_account_authenticator_sample_percentage", 0.0d);
        } catch (Exception e) {
            throw new AssertionError(e);
        }
    }

    @Override // com.google.android.gms.internal.auth.zzhx
    public final zzhs zza() {
        return (zzhs) f39178zze.zzb();
    }

    @Override // com.google.android.gms.internal.auth.zzhx
    public final boolean zzb() {
        return ((Boolean) f39182zzi.zzb()).booleanValue();
    }

    @Override // com.google.android.gms.internal.auth.zzhx
    public final boolean zzc() {
        return ((Boolean) f39183zzj.zzb()).booleanValue();
    }
}
