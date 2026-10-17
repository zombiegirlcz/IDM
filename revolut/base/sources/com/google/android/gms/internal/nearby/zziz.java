package com.google.android.gms.internal.nearby;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.nearby.connection.DiscoveryOptions;

/* JADX INFO: loaded from: classes16.dex */
final class zziz extends zzji {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ String f45331zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final /* synthetic */ ListenerHolder f45332zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    final /* synthetic */ DiscoveryOptions f45333zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zziz(zzjj zzjjVar, GoogleApiClient googleApiClient, String str, ListenerHolder listenerHolder, DiscoveryOptions discoveryOptions) {
        super(googleApiClient, null);
        this.f45331zza = str;
        this.f45332zzb = listenerHolder;
        this.f45333zzc = discoveryOptions;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    public final /* bridge */ /* synthetic */ void doExecute(Api.AnyClient anyClient) throws RemoteException {
        ((zzgz) anyClient).zzC(this, this.f45331zza, this.f45332zzb, this.f45333zzc);
    }
}
