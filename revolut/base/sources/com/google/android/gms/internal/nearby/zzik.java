package com.google.android.gms.internal.nearby;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;

/* JADX INFO: loaded from: classes16.dex */
final class zzik extends zzji {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ String f45304zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzik(zzjj zzjjVar, GoogleApiClient googleApiClient, String str) {
        super(googleApiClient, null);
        this.f45304zza = str;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    public final /* synthetic */ void doExecute(Api.AnyClient anyClient) throws RemoteException {
        ((zzgz) anyClient).zzu(this, this.f45304zza);
    }
}
