package com.google.android.gms.internal.identity;

import android.location.Location;
import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;

/* JADX INFO: loaded from: classes16.dex */
final class zzay extends zzba {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ Location f39617zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzay(zzbb zzbbVar, GoogleApiClient googleApiClient, Location location) {
        super(googleApiClient);
        this.f39617zza = location;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    public final /* bridge */ /* synthetic */ void doExecute(Api.AnyClient anyClient) throws RemoteException {
        ((zzdz) anyClient).zzA(this.f39617zza, zzbb.zza(this));
    }
}
