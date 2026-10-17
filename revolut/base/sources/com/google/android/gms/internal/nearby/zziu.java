package com.google.android.gms.internal.nearby;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.nearby.connection.Payload;

/* JADX INFO: loaded from: classes16.dex */
final class zziu extends zzji {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ String f45320zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final /* synthetic */ byte[] f45321zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zziu(zzjj zzjjVar, GoogleApiClient googleApiClient, String str, byte[] bArr) {
        super(googleApiClient, null);
        this.f45320zza = str;
        this.f45321zzb = bArr;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    public final /* bridge */ /* synthetic */ void doExecute(Api.AnyClient anyClient) throws Throwable {
        ((zzgz) anyClient).zzz(this, new String[]{this.f45320zza}, Payload.fromBytes(this.f45321zzb), true);
    }
}
