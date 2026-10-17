package com.google.android.gms.internal.nearby;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.nearby.connection.Connections;

/* JADX INFO: loaded from: classes16.dex */
final class zzje implements Connections.StartAdvertisingResult {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ Status f45340zza;

    public zzje(zzjg zzjgVar, Status status) {
        this.f45340zza = status;
    }

    @Override // com.google.android.gms.nearby.connection.Connections.StartAdvertisingResult
    public final String getLocalEndpointName() {
        return null;
    }

    @Override // com.google.android.gms.common.api.Result
    public final Status getStatus() {
        return this.f45340zza;
    }
}
