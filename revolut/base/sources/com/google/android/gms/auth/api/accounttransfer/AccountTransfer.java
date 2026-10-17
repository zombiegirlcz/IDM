package com.google.android.gms.auth.api.accounttransfer;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.internal.auth.zzao;

/* JADX INFO: loaded from: classes16.dex */
public final class AccountTransfer {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @NonNull
    public static final Api f37304zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    @Deprecated
    public static final zzao f37305zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    @Deprecated
    public static final zzao f37306zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private static final Api.ClientKey f37307zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    private static final Api.AbstractClientBuilder f37308zze;

    @NonNull
    public static final String ACTION_ACCOUNT_IMPORT_DATA_AVAILABLE = "com.google.android.gms.auth.ACCOUNT_IMPORT_DATA_AVAILABLE";

    @NonNull
    public static final String ACTION_ACCOUNT_EXPORT_DATA_AVAILABLE = "com.google.android.gms.auth.ACCOUNT_EXPORT_DATA_AVAILABLE";

    @NonNull
    public static final String ACTION_START_ACCOUNT_EXPORT = "com.google.android.gms.auth.START_ACCOUNT_EXPORT";

    @NonNull
    public static final String KEY_EXTRA_ACCOUNT_TYPE = "key_extra_account_type";

    static {
        Api.ClientKey clientKey = new Api.ClientKey();
        f37307zzd = clientKey;
        zza zzaVar = new zza();
        f37308zze = zzaVar;
        f37304zza = new Api("AccountTransfer.ACCOUNT_TRANSFER_API", zzaVar, clientKey);
        f37305zzb = new zzao();
        f37306zzc = new zzao();
    }

    private AccountTransfer() {
    }

    @NonNull
    public static AccountTransferClient getAccountTransferClient(@NonNull Activity activity) {
        return new AccountTransferClient(activity, (zzr) null);
    }

    @NonNull
    public static AccountTransferClient getAccountTransferClient(@NonNull Context context) {
        return new AccountTransferClient(context, (zzr) null);
    }
}
