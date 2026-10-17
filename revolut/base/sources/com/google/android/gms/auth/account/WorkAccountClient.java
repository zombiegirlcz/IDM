package com.google.android.gms.auth.account;

import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.internal.PendingResultUtil;
import com.google.android.gms.internal.auth.zzal;
import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: classes16.dex */
public class WorkAccountClient extends GoogleApi<Api.ApiOptions.NoOptions> {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final WorkAccountApi f37292zza;

    public WorkAccountClient(@NonNull Activity activity) {
        super(activity, WorkAccount.API, Api.ApiOptions.NO_OPTIONS, GoogleApi.Settings.DEFAULT_SETTINGS);
        this.f37292zza = new zzal();
    }

    @NonNull
    public Task<Account> addWorkAccount(@NonNull String str) {
        return PendingResultUtil.toTask(this.f37292zza.addWorkAccount(asGoogleApiClient(), str), new zzg(this));
    }

    @NonNull
    public Task<Void> removeWorkAccount(@NonNull Account account) {
        return PendingResultUtil.toVoidTask(this.f37292zza.removeWorkAccount(asGoogleApiClient(), account));
    }

    @NonNull
    public Task<Void> setWorkAuthenticatorEnabled(boolean z) {
        return PendingResultUtil.toVoidTask(this.f37292zza.setWorkAuthenticatorEnabledWithResult(asGoogleApiClient(), z));
    }

    public WorkAccountClient(@NonNull Context context) {
        super(context, WorkAccount.API, Api.ApiOptions.NO_OPTIONS, GoogleApi.Settings.DEFAULT_SETTINGS);
        this.f37292zza = new zzal();
    }
}
