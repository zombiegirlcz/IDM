package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;

/* JADX INFO: loaded from: classes.dex */
final class zabt implements Runnable {
    final /* synthetic */ ConnectionResult zaa;

    /* JADX INFO: renamed from: zab, reason: collision with root package name */
    final /* synthetic */ zabu f37891zab;

    public zabt(zabu zabuVar, ConnectionResult connectionResult) {
        this.f37891zab = zabuVar;
        this.zaa = connectionResult;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zabu zabuVar = this.f37891zab;
        zabq zabqVar = (zabq) zabuVar.zaa.zan.get(zabuVar.f37893zac);
        if (zabqVar == null) {
            return;
        }
        if (!this.zaa.isSuccess()) {
            zabqVar.zar(this.zaa, null);
            return;
        }
        this.f37891zab.f37896zaf = true;
        if (this.f37891zab.f37892zab.requiresSignIn()) {
            this.f37891zab.zah();
            return;
        }
        try {
            zabu zabuVar2 = this.f37891zab;
            zabuVar2.f37892zab.getRemoteService(null, zabuVar2.f37892zab.getScopesForConnectionlessNonSignIn());
        } catch (SecurityException e) {
            this.f37891zab.f37892zab.disconnect("Failed to get service from broker.");
            zabqVar.zar(new ConnectionResult(10), null);
        }
    }
}
