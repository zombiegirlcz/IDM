package com.google.android.gms.nearby.messages.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.internal.nearby.zznp;

/* JADX INFO: loaded from: classes16.dex */
final class zzbq extends zzbu {
    public zzbq(zzbx zzbxVar, GoogleApiClient googleApiClient) {
        super(googleApiClient);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    public final /* synthetic */ void doExecute(Api.AnyClient anyClient) throws RemoteException {
        ((zzs) ((zzai) anyClient).getService()).zzd(new zzh(1, new zznp(zza()), null, null));
    }
}
