package com.google.android.gms.internal.identity;

import android.app.PendingIntent;
import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.GeofencingRequest;

/* JADX INFO: loaded from: classes16.dex */
final class zzcn extends zzcq {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ GeofencingRequest f39670zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final /* synthetic */ PendingIntent f39671zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzcn(zzcr zzcrVar, GoogleApiClient googleApiClient, GeofencingRequest geofencingRequest, PendingIntent pendingIntent) {
        super(googleApiClient);
        this.f39670zza = geofencingRequest;
        this.f39671zzb = pendingIntent;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    public final /* bridge */ /* synthetic */ void doExecute(Api.AnyClient anyClient) throws RemoteException {
        ((zzdz) anyClient).zzE(this.f39670zza, this.f39671zzb, zzcr.zza(this));
    }
}
