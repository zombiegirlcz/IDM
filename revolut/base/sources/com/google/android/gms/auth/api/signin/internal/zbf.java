package com.google.android.gms.auth.api.signin.internal;

import android.os.RemoteException;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInResult;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes16.dex */
final class zbf extends zba {

    /* JADX INFO: renamed from: zba, reason: collision with root package name */
    final /* synthetic */ zbg f37524zba;

    public zbf(zbg zbgVar) {
        this.f37524zba = zbgVar;
    }

    @Override // com.google.android.gms.auth.api.signin.internal.zba, com.google.android.gms.auth.api.signin.internal.zbr
    public final void zbd(GoogleSignInAccount googleSignInAccount, Status status) throws RemoteException {
        if (googleSignInAccount != null) {
            zbg zbgVar = this.f37524zba;
            zbn.zbc(zbgVar.f37525zba).zbe(zbgVar.f37526zbb, googleSignInAccount);
        }
        this.f37524zba.setResult(new GoogleSignInResult(googleSignInAccount, status));
    }
}
