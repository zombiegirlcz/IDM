package com.google.android.gms.internal.fido;

/* JADX INFO: loaded from: classes16.dex */
public final class zzic implements zzib {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    public static final zzaq f39566zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    public static final zzaq f39567zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    public static final zzaq f39568zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    public static final zzaq f39569zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    public static final zzaq f39570zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    public static final zzaq f39571zzf;

    /* JADX INFO: renamed from: zzg, reason: collision with root package name */
    public static final zzaq f39572zzg;

    /* JADX INFO: renamed from: zzh, reason: collision with root package name */
    public static final zzaq f39573zzh;

    /* JADX INFO: renamed from: zzi, reason: collision with root package name */
    public static final zzaq f39574zzi;

    /* JADX INFO: renamed from: zzj, reason: collision with root package name */
    public static final zzaq f39575zzj;

    /* JADX INFO: renamed from: zzk, reason: collision with root package name */
    public static final zzaq f39576zzk;

    /* JADX INFO: renamed from: zzl, reason: collision with root package name */
    public static final zzaq f39577zzl;
    public static final zzaq zzm;
    public static final zzaq zzn;
    public static final zzaq zzo;
    public static final zzaq zzp;
    public static final zzaq zzq;
    public static final zzaq zzr;
    public static final zzaq zzs;

    static {
        zzay zzayVarZzd = new zzay("com.google.android.gms.fido").zze(zzcf.zzl("FIDO")).zzd();
        f39566zza = zzayVarZzd.zzc("Passkeys__check_all_keys", false);
        f39567zzb = zzayVarZzd.zzc("Passkeys__check_sync_status", true);
        f39568zzc = zzayVarZzd.zzc("Passkeys__client_data_hash_override_for_security_keys", false);
        f39569zzd = zzayVarZzd.zzc("Passkeys__direct_assetlinks", false);
        f39570zze = zzayVarZzd.zza("Passkeys__direct_assetlinks_cache_seconds", 604800L);
        f39571zzf = zzayVarZzd.zzb("Passkeys__direct_assetlinks_rpids", "*");
        f39572zzg = zzayVarZzd.zzc("Passkeys__dispatch_prf_via_credman", true);
        f39573zzh = zzayVarZzd.zzb("Passkeys__help_center_url", "https://support.google.com/accounts/answer/6208650");
        f39574zzi = zzayVarZzd.zzc("Passkeys__hide_consent_page_in_registration_enabled", false);
        f39575zzj = zzayVarZzd.zzc("Passkeys__ignore_stop_during_hybrid_request", false);
        f39576zzk = zzayVarZzd.zzc("Passkeys__json_for_parcelables", false);
        f39577zzl = zzayVarZzd.zzc("Passkeys__passkey_entries_use_gpm_icon", false);
        zzm = zzayVarZzd.zzc("Passkeys__reencrypt_passkey", false);
        zzn = zzayVarZzd.zzc("Passkeys__return_cryptauth_status", false);
        zzo = zzayVarZzd.zzc("Passkeys__set_key_version", true);
        zzp = zzayVarZzd.zza("Passkeys__should_show_welcome_fragment", -1L);
        zzq = zzayVarZzd.zzc("Passkeys__skip_consent_after_retrieval", false);
        zzr = zzayVarZzd.zzc("Passkeys__skip_consent_screen", false);
        zzs = zzayVarZzd.zzc("Passkeys__use_result_receiver", false);
    }

    @Override // com.google.android.gms.internal.fido.zzib
    public final boolean zza() {
        return ((Boolean) f39576zzk.zza()).booleanValue();
    }

    @Override // com.google.android.gms.internal.fido.zzib
    public final boolean zzb() {
        return ((Boolean) zzs.zza()).booleanValue();
    }
}
