package com.google.android.gms.internal.auth;

import android.accounts.Account;
import com.google.android.gms.auth.account.WorkAccountApi;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes16.dex */
final class zzai implements WorkAccountApi.AddAccountResult {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private static final Account f38874zza = new Account("DUMMY_NAME", "com.google");

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final Status f38875zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private final Account f38876zzc;

    public zzai(Status status, Account account) {
        this.f38875zzb = status;
        this.f38876zzc = account == null ? f38874zza : account;
    }

    @Override // com.google.android.gms.auth.account.WorkAccountApi.AddAccountResult
    public final Account getAccount() {
        return this.f38876zzc;
    }

    @Override // com.google.android.gms.common.api.Result
    public final Status getStatus() {
        return this.f38875zzb;
    }
}
