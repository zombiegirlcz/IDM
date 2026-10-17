package com.google.android.gms.internal.nearby;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.nearby.connection.Payload;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
final class zziv extends zzji {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ List f45322zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final /* synthetic */ byte[] f45323zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zziv(zzjj zzjjVar, GoogleApiClient googleApiClient, List list, byte[] bArr) {
        super(googleApiClient, null);
        this.f45322zza = list;
        this.f45323zzb = bArr;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    public final /* bridge */ /* synthetic */ void doExecute(Api.AnyClient anyClient) throws Throwable {
        ((zzgz) anyClient).zzz(this, (String[]) this.f45322zza.toArray(new String[0]), Payload.fromBytes(this.f45323zzb), true);
    }
}
