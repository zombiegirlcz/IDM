package com.google.android.gms.auth.api.accounttransfer;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.internal.auth.zzap;
import com.google.android.gms.internal.auth.zzau;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes16.dex */
abstract class zzl extends TaskApiCall {

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    protected TaskCompletionSource f37325zzb;

    public /* synthetic */ zzl(int i, zzk zzkVar) {
        super(null, false, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.common.api.internal.TaskApiCall
    public final /* bridge */ /* synthetic */ void doExecute(Api.AnyClient anyClient, TaskCompletionSource taskCompletionSource) throws RemoteException {
        this.f37325zzb = taskCompletionSource;
        zza((zzau) ((zzap) anyClient).getService());
    }

    public abstract void zza(zzau zzauVar) throws RemoteException;
}
