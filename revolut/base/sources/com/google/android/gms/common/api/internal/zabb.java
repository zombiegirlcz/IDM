package com.google.android.gms.common.api.internal;

import androidx.annotation.NonNull;
import com.google.android.gms.auth.api.signin.internal.Storage;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes16.dex */
final class zabb implements ResultCallback {
    final /* synthetic */ StatusPendingResult zaa;

    /* JADX INFO: renamed from: zab, reason: collision with root package name */
    final /* synthetic */ boolean f37853zab;

    /* JADX INFO: renamed from: zac, reason: collision with root package name */
    final /* synthetic */ GoogleApiClient f37854zac;

    /* JADX INFO: renamed from: zad, reason: collision with root package name */
    final /* synthetic */ zabe f37855zad;

    public zabb(zabe zabeVar, StatusPendingResult statusPendingResult, boolean z, GoogleApiClient googleApiClient) {
        this.f37855zad = zabeVar;
        this.zaa = statusPendingResult;
        this.f37853zab = z;
        this.f37854zac = googleApiClient;
    }

    @Override // com.google.android.gms.common.api.ResultCallback
    public final /* bridge */ /* synthetic */ void onResult(@NonNull Result result) {
        Status status = (Status) result;
        Storage.getInstance(this.f37855zad.zan).zac();
        if (status.isSuccess() && this.f37855zad.isConnected()) {
            zabe zabeVar = this.f37855zad;
            zabeVar.disconnect();
            zabeVar.connect();
        }
        this.zaa.setResult(status);
        if (this.f37853zab) {
            this.f37854zac.disconnect();
        }
    }
}
