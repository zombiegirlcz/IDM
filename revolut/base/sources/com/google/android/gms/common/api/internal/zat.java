package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import androidx.annotation.NonNull;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes16.dex */
public final class zat implements GoogleApiClient.ConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener {
    public final Api zaa;

    /* JADX INFO: renamed from: zab, reason: collision with root package name */
    private final boolean f37950zab;

    /* JADX INFO: renamed from: zac, reason: collision with root package name */
    private zau f37951zac;

    public zat(Api api2, boolean z) {
        this.zaa = api2;
        this.f37950zab = z;
    }

    private final zau zab() {
        Preconditions.checkNotNull(this.f37951zac, "Callbacks must be attached to a ClientConnectionHelper instance before connecting the client.");
        return this.f37951zac;
    }

    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        zab().onConnected(bundle);
    }

    @Override // com.google.android.gms.common.api.internal.OnConnectionFailedListener
    public final void onConnectionFailed(@NonNull ConnectionResult connectionResult) {
        zab().zaa(connectionResult, this.zaa, this.f37950zab);
    }

    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    public final void onConnectionSuspended(int i) {
        zab().onConnectionSuspended(i);
    }

    public final void zaa(zau zauVar) {
        this.f37951zac = zauVar;
    }
}
