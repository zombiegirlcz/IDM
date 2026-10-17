package com.google.android.gms.internal.identity;

import android.os.RemoteException;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.location.LastLocationRequest;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes16.dex */
final /* synthetic */ class zzby implements RemoteCall {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    static final /* synthetic */ zzby f39652zza = new zzby();

    private /* synthetic */ zzby() {
    }

    @Override // com.google.android.gms.common.api.internal.RemoteCall
    public final /* synthetic */ void accept(Object obj2, Object obj3) throws RemoteException {
        ((zzdz) obj2).zzq(new LastLocationRequest.Builder().build(), (TaskCompletionSource) obj3);
    }
}
