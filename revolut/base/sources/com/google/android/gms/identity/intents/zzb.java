package com.google.android.gms.identity.intents;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes16.dex */
final class zzb extends zzc {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ UserAddressRequest f38783zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final /* synthetic */ int f38784zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzb(GoogleApiClient googleApiClient, UserAddressRequest userAddressRequest, int i) {
        super(googleApiClient);
        this.f38783zza = userAddressRequest;
        this.f38784zzb = i;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    public final /* bridge */ /* synthetic */ void doExecute(Api.AnyClient anyClient) throws RemoteException {
        ((com.google.android.gms.internal.identity.zze) anyClient).zzp(this.f38783zza, this.f38784zzb);
        setResult(Status.RESULT_SUCCESS);
    }
}
