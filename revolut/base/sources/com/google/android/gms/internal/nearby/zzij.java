package com.google.android.gms.internal.nearby;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.internal.ListenerHolder;

/* JADX INFO: loaded from: classes16.dex */
final class zzij extends zzji {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ String f45302zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final /* synthetic */ ListenerHolder f45303zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzij(zzjj zzjjVar, GoogleApiClient googleApiClient, String str, ListenerHolder listenerHolder) {
        super(googleApiClient, null);
        this.f45302zza = str;
        this.f45303zzb = listenerHolder;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    public final /* bridge */ /* synthetic */ void doExecute(Api.AnyClient anyClient) throws RemoteException {
        ((zzgz) anyClient).zzr(this, this.f45302zza, this.f45303zzb);
    }
}
