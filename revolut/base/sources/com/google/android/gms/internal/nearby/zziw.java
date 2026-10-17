package com.google.android.gms.internal.nearby;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.nearby.connection.AdvertisingOptions;

/* JADX INFO: loaded from: classes16.dex */
final class zziw extends zzjg {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ String f45324zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final /* synthetic */ String f45325zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    final /* synthetic */ ListenerHolder f45326zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    final /* synthetic */ AdvertisingOptions f45327zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zziw(zzjj zzjjVar, GoogleApiClient googleApiClient, String str, String str2, ListenerHolder listenerHolder, AdvertisingOptions advertisingOptions) {
        super(googleApiClient, null);
        this.f45324zza = str;
        this.f45325zzb = str2;
        this.f45326zzc = listenerHolder;
        this.f45327zzd = advertisingOptions;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    public final /* bridge */ /* synthetic */ void doExecute(Api.AnyClient anyClient) throws RemoteException {
        ((zzgz) anyClient).zzA(this, this.f45324zza, this.f45325zzb, this.f45326zzc, this.f45327zzd);
    }
}
