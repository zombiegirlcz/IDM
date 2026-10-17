package com.google.android.gms.internal.auth;

import com.google.android.gms.auth.api.proxy.ProxyApi;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes16.dex */
public final class zzbv implements ProxyApi.SpatulaHeaderResult {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final Status f38905zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final String f38906zzb;

    public zzbv(Status status) {
        this.f38905zza = (Status) Preconditions.checkNotNull(status);
        this.f38906zzb = "";
    }

    @Override // com.google.android.gms.auth.api.proxy.ProxyApi.SpatulaHeaderResult
    public final String getSpatulaHeader() {
        return this.f38906zzb;
    }

    @Override // com.google.android.gms.common.api.Result
    public final Status getStatus() {
        return this.f38905zza;
    }

    public zzbv(String str) {
        this.f38906zzb = (String) Preconditions.checkNotNull(str);
        this.f38905zza = Status.RESULT_SUCCESS;
    }
}
