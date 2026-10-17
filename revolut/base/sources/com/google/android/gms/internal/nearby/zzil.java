package com.google.android.gms.internal.nearby;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.nearby.connection.Payload;

/* JADX INFO: loaded from: classes16.dex */
final class zzil extends zzji {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ String f45305zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final /* synthetic */ Payload f45306zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzil(zzjj zzjjVar, GoogleApiClient googleApiClient, String str, Payload payload) {
        super(googleApiClient, null);
        this.f45305zza = str;
        this.f45306zzb = payload;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    public final /* bridge */ /* synthetic */ void doExecute(Api.AnyClient anyClient) throws Throwable {
        ((zzgz) anyClient).zzz(this, new String[]{this.f45305zza}, this.f45306zzb, false);
    }
}
