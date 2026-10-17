package com.google.android.gms.auth.api.signin.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes16.dex */
final class zbj extends zba {

    /* JADX INFO: renamed from: zba, reason: collision with root package name */
    final /* synthetic */ zbk f37528zba;

    public zbj(zbk zbkVar) {
        this.f37528zba = zbkVar;
    }

    @Override // com.google.android.gms.auth.api.signin.internal.zba, com.google.android.gms.auth.api.signin.internal.zbr
    public final void zbb(Status status) throws RemoteException {
        this.f37528zba.setResult(status);
    }
}
