package com.google.android.gms.nearby.messages.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.internal.ListenerHolder;

/* JADX INFO: loaded from: classes16.dex */
public final /* synthetic */ class zzar implements zzbc {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    public final /* synthetic */ ListenerHolder f48113zza;

    public /* synthetic */ zzar(ListenerHolder listenerHolder) {
        this.f48113zza = listenerHolder;
    }

    @Override // com.google.android.gms.nearby.messages.internal.zzbc
    public final void zza(zzai zzaiVar, ListenerHolder listenerHolder) throws RemoteException {
        int i = zzbh.f48132zza;
        zzaiVar.zzC(listenerHolder, this.f48113zza);
    }
}
