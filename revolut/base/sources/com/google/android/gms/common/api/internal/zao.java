package com.google.android.gms.common.api.internal;

import android.app.Dialog;
import android.app.PendingIntent;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes16.dex */
final class zao implements Runnable {
    final /* synthetic */ zap zaa;

    /* JADX INFO: renamed from: zab, reason: collision with root package name */
    private final zam f37946zab;

    public zao(zap zapVar, zam zamVar) {
        this.zaa = zapVar;
        this.f37946zab = zamVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.zaa.zaa) {
            ConnectionResult connectionResultZab = this.f37946zab.zab();
            if (connectionResultZab.hasResolution()) {
                zap zapVar = this.zaa;
                zapVar.mLifecycleFragment.startActivityForResult(GoogleApiActivity.zaa(zapVar.getActivity(), (PendingIntent) Preconditions.checkNotNull(connectionResultZab.getResolution()), this.f37946zab.zaa(), false), 1);
                return;
            }
            zap zapVar2 = this.zaa;
            if (zapVar2.f37948zac.getErrorResolutionIntent(zapVar2.getActivity(), connectionResultZab.getErrorCode(), null) != null) {
                zap zapVar3 = this.zaa;
                zapVar3.f37948zac.zag(zapVar3.getActivity(), zapVar3.mLifecycleFragment, connectionResultZab.getErrorCode(), 2, this.zaa);
                return;
            }
            if (connectionResultZab.getErrorCode() != 18) {
                this.zaa.zaa(connectionResultZab, this.f37946zab.zaa());
                return;
            }
            zap zapVar4 = this.zaa;
            Dialog dialogZab = zapVar4.f37948zac.zab(zapVar4.getActivity(), zapVar4);
            zap zapVar5 = this.zaa;
            zapVar5.f37948zac.zac(zapVar5.getActivity().getApplicationContext(), new zan(this, dialogZab));
        }
    }
}
