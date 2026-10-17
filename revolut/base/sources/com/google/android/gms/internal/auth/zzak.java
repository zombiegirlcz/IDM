package com.google.android.gms.internal.auth;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes16.dex */
final class zzak implements Result {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final Status f38878zza;

    public zzak(Status status) {
        this.f38878zza = status;
    }

    @Override // com.google.android.gms.common.api.Result
    public final Status getStatus() {
        return this.f38878zza;
    }
}
