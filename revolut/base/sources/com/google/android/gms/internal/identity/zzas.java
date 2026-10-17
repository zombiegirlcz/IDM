package com.google.android.gms.internal.identity;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.location.LocationRequest;

/* JADX INFO: loaded from: classes16.dex */
final class zzas extends zzba {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ ListenerHolder f39609zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final /* synthetic */ LocationRequest f39610zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzas(zzbb zzbbVar, GoogleApiClient googleApiClient, ListenerHolder listenerHolder, LocationRequest locationRequest) {
        super(googleApiClient);
        this.f39609zza = listenerHolder;
        this.f39610zzb = locationRequest;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    public final /* bridge */ /* synthetic */ void doExecute(Api.AnyClient anyClient) throws RemoteException {
        ((zzdz) anyClient).zzt(new zzaz(this.f39609zza), this.f39610zzb, zzbb.zza(this));
    }
}
