package com.google.android.gms.auth.api.signin;

import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes16.dex */
@Deprecated
public class GoogleSignInResult implements Result {

    /* JADX INFO: renamed from: zba, reason: collision with root package name */
    private final Status f37503zba;

    /* JADX INFO: renamed from: zbb, reason: collision with root package name */
    private final GoogleSignInAccount f37504zbb;

    public GoogleSignInResult(GoogleSignInAccount googleSignInAccount, @NonNull Status status) {
        this.f37504zbb = googleSignInAccount;
        this.f37503zba = status;
    }

    public GoogleSignInAccount getSignInAccount() {
        return this.f37504zbb;
    }

    @Override // com.google.android.gms.common.api.Result
    @NonNull
    public Status getStatus() {
        return this.f37503zba;
    }

    public boolean isSuccess() {
        return this.f37503zba.isSuccess();
    }
}
