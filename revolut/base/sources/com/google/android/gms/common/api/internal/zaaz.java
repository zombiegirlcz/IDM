package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes16.dex */
final class zaaz implements GoogleApiClient.ConnectionCallbacks {
    final /* synthetic */ AtomicReference zaa;

    /* JADX INFO: renamed from: zab, reason: collision with root package name */
    final /* synthetic */ StatusPendingResult f37851zab;

    /* JADX INFO: renamed from: zac, reason: collision with root package name */
    final /* synthetic */ zabe f37852zac;

    public zaaz(zabe zabeVar, AtomicReference atomicReference, StatusPendingResult statusPendingResult) {
        this.f37852zac = zabeVar;
        this.zaa = atomicReference;
        this.f37851zab = statusPendingResult;
    }

    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        this.f37852zac.zam((GoogleApiClient) Preconditions.checkNotNull((GoogleApiClient) this.zaa.get()), this.f37851zab, true);
    }

    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    public final void onConnectionSuspended(int i) {
    }
}
