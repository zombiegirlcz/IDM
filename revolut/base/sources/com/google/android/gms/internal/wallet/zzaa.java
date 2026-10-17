package com.google.android.gms.internal.wallet;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wallet.CreateWalletObjectsRequest;
import com.google.android.gms.wallet.zzas;

/* JADX INFO: loaded from: classes16.dex */
final class zzaa extends zzas {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ CreateWalletObjectsRequest f46375zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final /* synthetic */ int f46376zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzaa(zzab zzabVar, GoogleApiClient googleApiClient, CreateWalletObjectsRequest createWalletObjectsRequest, int i) {
        super(googleApiClient);
        this.f46375zza = createWalletObjectsRequest;
        this.f46376zzb = i;
    }

    @Override // com.google.android.gms.wallet.zzaq, com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    /* JADX INFO: renamed from: zza */
    public final void doExecute(zzy zzyVar) {
        zzyVar.zzp(this.f46375zza, this.f46376zzb);
        setResult(Status.RESULT_SUCCESS);
    }
}
