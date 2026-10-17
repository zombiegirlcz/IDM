package com.google.android.gms.internal.nearby;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.nearby.connection.Connections;

/* JADX INFO: loaded from: classes16.dex */
final class zzgx implements Connections.StartAdvertisingResult {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final Status f45215zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final String f45216zzb;

    public zzgx(Status status, String str) {
        this.f45215zza = status;
        this.f45216zzb = str;
    }

    @Override // com.google.android.gms.nearby.connection.Connections.StartAdvertisingResult
    public final String getLocalEndpointName() {
        return this.f45216zzb;
    }

    @Override // com.google.android.gms.common.api.Result
    public final Status getStatus() {
        return this.f45215zza;
    }
}
