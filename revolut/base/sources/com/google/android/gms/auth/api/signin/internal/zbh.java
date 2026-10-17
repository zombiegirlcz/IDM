package com.google.android.gms.auth.api.signin.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes16.dex */
final class zbh extends zba {

    /* JADX INFO: renamed from: zba, reason: collision with root package name */
    final /* synthetic */ zbi f37527zba;

    public zbh(zbi zbiVar) {
        this.f37527zba = zbiVar;
    }

    @Override // com.google.android.gms.auth.api.signin.internal.zba, com.google.android.gms.auth.api.signin.internal.zbr
    public final void zbc(Status status) throws RemoteException {
        this.f37527zba.setResult(status);
    }
}
