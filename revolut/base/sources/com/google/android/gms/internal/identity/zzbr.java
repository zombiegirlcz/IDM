package com.google.android.gms.internal.identity;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.location.zzac;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes16.dex */
final /* synthetic */ class zzbr implements RemoteCall {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    static final /* synthetic */ zzbr f39642zza = new zzbr();

    private /* synthetic */ zzbr() {
    }

    @Override // com.google.android.gms.common.api.internal.RemoteCall
    public final /* synthetic */ void accept(Object obj2, Object obj3) throws RemoteException {
        Api api2 = zzbi.f39629zzb;
        ((zzdz) obj2).zzp(zzac.zza(), (TaskCompletionSource) obj3);
    }
}
