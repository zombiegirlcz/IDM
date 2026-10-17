package com.google.android.gms.internal.nearby;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;

/* JADX INFO: loaded from: classes16.dex */
final class zzin extends zzji {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ long f45309zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzin(zzjj zzjjVar, GoogleApiClient googleApiClient, long j2) {
        super(googleApiClient, null);
        this.f45309zza = j2;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    public final /* synthetic */ void doExecute(Api.AnyClient anyClient) throws RemoteException {
        ((zzgz) anyClient).zzs(this, this.f45309zza);
    }
}
