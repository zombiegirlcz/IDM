package com.google.android.gms.common.api.internal;

import androidx.annotation.NonNull;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;

/* JADX INFO: loaded from: classes16.dex */
final class zaj implements GoogleApiClient.OnConnectionFailedListener {
    public final int zaa;

    /* JADX INFO: renamed from: zab, reason: collision with root package name */
    public final GoogleApiClient f37936zab;

    /* JADX INFO: renamed from: zac, reason: collision with root package name */
    public final GoogleApiClient.OnConnectionFailedListener f37937zac;

    /* JADX INFO: renamed from: zad, reason: collision with root package name */
    final /* synthetic */ zak f37938zad;

    public zaj(zak zakVar, int i, GoogleApiClient googleApiClient, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        this.f37938zad = zakVar;
        this.zaa = i;
        this.f37936zab = googleApiClient;
        this.f37937zac = onConnectionFailedListener;
    }

    @Override // com.google.android.gms.common.api.internal.OnConnectionFailedListener
    public final void onConnectionFailed(@NonNull ConnectionResult connectionResult) {
        "beginFailureResolution for ".concat(String.valueOf(connectionResult));
        this.f37938zad.zah(connectionResult, this.zaa);
    }
}
