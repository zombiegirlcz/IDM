package com.google.android.gms.internal.nearby;

import android.os.RemoteException;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes16.dex */
public final /* synthetic */ class zzaa implements RemoteCall {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    public final /* synthetic */ zzax f45065zza;

    public /* synthetic */ zzaa(zzax zzaxVar) {
        this.f45065zza = zzaxVar;
    }

    @Override // com.google.android.gms.common.api.internal.RemoteCall
    public final void accept(Object obj2, Object obj3) throws RemoteException {
        zzai zzaiVar = new zzai(this.f45065zza, (TaskCompletionSource) obj3);
        zzdr zzdrVar = (zzdr) ((zzn) obj2).getService();
        zzci zzciVar = new zzci();
        zzciVar.zza(zzaiVar);
        zzdrVar.zzm(zzciVar.zzb());
    }
}
