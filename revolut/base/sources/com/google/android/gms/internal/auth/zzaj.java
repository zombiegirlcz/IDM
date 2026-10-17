package com.google.android.gms.internal.auth;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes16.dex */
final class zzaj implements Result {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final Status f38877zza;

    public zzaj(Status status) {
        this.f38877zza = status;
    }

    @Override // com.google.android.gms.common.api.Result
    public final Status getStatus() {
        return this.f38877zza;
    }
}
