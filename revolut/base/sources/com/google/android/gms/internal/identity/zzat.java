package com.google.android.gms.internal.identity;

import android.app.PendingIntent;
import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.LocationRequest;

/* JADX INFO: loaded from: classes16.dex */
final class zzat extends zzba {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ PendingIntent f39611zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final /* synthetic */ LocationRequest f39612zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzat(zzbb zzbbVar, GoogleApiClient googleApiClient, PendingIntent pendingIntent, LocationRequest locationRequest) {
        super(googleApiClient);
        this.f39611zza = pendingIntent;
        this.f39612zzb = locationRequest;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    public final /* bridge */ /* synthetic */ void doExecute(Api.AnyClient anyClient) throws RemoteException {
        ((zzdz) anyClient).zzu(this.f39611zza, this.f39612zzb, zzbb.zza(this));
    }
}
