package com.google.android.gms.internal.identity;

import android.os.RemoteException;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes16.dex */
final /* synthetic */ class zzcd implements zzbg {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    static final /* synthetic */ zzcd f39659zza = new zzcd();

    private /* synthetic */ zzcd() {
    }

    @Override // com.google.android.gms.internal.identity.zzbg
    public final /* synthetic */ void zza(zzdz zzdzVar, ListenerHolder.ListenerKey listenerKey, boolean z, TaskCompletionSource taskCompletionSource) throws RemoteException {
        zzdzVar.zzv(listenerKey, z, taskCompletionSource);
    }
}
