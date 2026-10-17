package com.google.android.gms.internal.identity;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.location.CurrentLocationRequest;
import com.google.android.gms.tasks.CancellationToken;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes16.dex */
final /* synthetic */ class zzbp implements RemoteCall {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final /* synthetic */ CurrentLocationRequest f39639zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final /* synthetic */ CancellationToken f39640zzb;

    public /* synthetic */ zzbp(CurrentLocationRequest currentLocationRequest, CancellationToken cancellationToken) {
        this.f39639zza = currentLocationRequest;
        this.f39640zzb = cancellationToken;
    }

    @Override // com.google.android.gms.common.api.internal.RemoteCall
    public final /* synthetic */ void accept(Object obj2, Object obj3) throws RemoteException {
        Api api2 = zzbi.f39629zzb;
        ((zzdz) obj2).zzr(this.f39639zza, this.f39640zzb, (TaskCompletionSource) obj3);
    }
}
