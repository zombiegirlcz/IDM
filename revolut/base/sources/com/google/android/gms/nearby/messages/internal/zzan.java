package com.google.android.gms.nearby.messages.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.nearby.messages.Message;

/* JADX INFO: loaded from: classes16.dex */
public final /* synthetic */ class zzan implements zzbc {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    public final /* synthetic */ Message f48106zza;

    public /* synthetic */ zzan(Message message) {
        this.f48106zza = message;
    }

    @Override // com.google.android.gms.nearby.messages.internal.zzbc
    public final void zza(zzai zzaiVar, ListenerHolder listenerHolder) throws RemoteException {
        int i = zzbh.f48132zza;
        zzaiVar.zzz(listenerHolder, zzae.zza(this.f48106zza));
    }
}
