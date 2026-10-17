package com.google.android.gms.nearby.messages.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.nearby.messages.SubscribeOptions;

/* JADX INFO: loaded from: classes16.dex */
final class zzbm extends zzbu {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ ListenerHolder f48142zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final /* synthetic */ zzbw f48143zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    final /* synthetic */ SubscribeOptions f48144zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzbm(zzbx zzbxVar, GoogleApiClient googleApiClient, ListenerHolder listenerHolder, zzbw zzbwVar, SubscribeOptions subscribeOptions) {
        super(googleApiClient);
        this.f48142zza = listenerHolder;
        this.f48143zzb = zzbwVar;
        this.f48144zzc = subscribeOptions;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    public final /* bridge */ /* synthetic */ void doExecute(Api.AnyClient anyClient) throws RemoteException {
        ((zzai) anyClient).zzx(zza(), this.f48142zza, this.f48143zzb, this.f48144zzc, null);
    }
}
