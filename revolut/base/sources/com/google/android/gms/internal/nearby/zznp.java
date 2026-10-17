package com.google.android.gms.internal.nearby;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.ListenerHolder;

/* JADX INFO: loaded from: classes16.dex */
public final class zznp extends com.google.android.gms.nearby.messages.internal.zzq {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final ListenerHolder f45522zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private boolean f45523zzb = false;

    public zznp(ListenerHolder listenerHolder) {
        this.f45522zza = listenerHolder;
    }

    @Override // com.google.android.gms.nearby.messages.internal.zzr
    public final synchronized void zzd(Status status) throws RemoteException {
        if (!this.f45523zzb) {
            this.f45522zza.notifyListener(new zzno(this, status));
            this.f45523zzb = true;
        } else {
            String strValueOf = String.valueOf(status);
            new Exception();
            "Received multiple statuses: ".concat(strValueOf);
        }
    }
}
