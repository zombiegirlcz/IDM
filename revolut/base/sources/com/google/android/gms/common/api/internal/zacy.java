package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultTransform;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes16.dex */
final class zacy implements Runnable {
    final /* synthetic */ Result zaa;

    /* JADX INFO: renamed from: zab, reason: collision with root package name */
    final /* synthetic */ zada f37920zab;

    public zacy(zada zadaVar, Result result) {
        this.f37920zab = zadaVar;
        this.zaa = result;
    }

    @Override // java.lang.Runnable
    public final void run() {
        GoogleApiClient googleApiClient;
        try {
            try {
                ThreadLocal threadLocal = BasePendingResult.zaa;
                threadLocal.set(Boolean.TRUE);
                PendingResult pendingResultOnSuccess = ((ResultTransform) Preconditions.checkNotNull(this.f37920zab.zaa)).onSuccess(this.zaa);
                zada zadaVar = this.f37920zab;
                zadaVar.f37927zah.sendMessage(zadaVar.f37927zah.obtainMessage(0, pendingResultOnSuccess));
                threadLocal.set(Boolean.FALSE);
                zada zadaVar2 = this.f37920zab;
                zada.zan(this.zaa);
                googleApiClient = (GoogleApiClient) this.f37920zab.f37926zag.get();
                if (googleApiClient == null) {
                    return;
                }
            } catch (RuntimeException e) {
                zada zadaVar3 = this.f37920zab;
                zadaVar3.f37927zah.sendMessage(zadaVar3.f37927zah.obtainMessage(1, e));
                BasePendingResult.zaa.set(Boolean.FALSE);
                zada zadaVar4 = this.f37920zab;
                zada.zan(this.zaa);
                googleApiClient = (GoogleApiClient) this.f37920zab.f37926zag.get();
                if (googleApiClient == null) {
                    return;
                }
            }
            googleApiClient.zap(this.f37920zab);
        } catch (Throwable th10) {
            BasePendingResult.zaa.set(Boolean.FALSE);
            zada zadaVar5 = this.f37920zab;
            zada.zan(this.zaa);
            GoogleApiClient googleApiClient2 = (GoogleApiClient) this.f37920zab.f37926zag.get();
            if (googleApiClient2 != null) {
                googleApiClient2.zap(this.f37920zab);
            }
            throw th10;
        }
    }
}
