package com.google.android.gms.internal.auth;

import com.google.android.gms.auth.api.proxy.ProxyApi;
import com.google.android.gms.auth.api.proxy.ProxyResponse;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes16.dex */
final class zzbu implements ProxyApi.ProxyResult {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final Status f38903zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private ProxyResponse f38904zzb;

    public zzbu(Status status) {
        this.f38903zza = status;
    }

    @Override // com.google.android.gms.auth.api.proxy.ProxyApi.ProxyResult
    public final ProxyResponse getResponse() {
        return this.f38904zzb;
    }

    @Override // com.google.android.gms.common.api.Result
    public final Status getStatus() {
        return this.f38903zza;
    }

    public zzbu(ProxyResponse proxyResponse) {
        this.f38904zzb = proxyResponse;
        this.f38903zza = Status.RESULT_SUCCESS;
    }
}
