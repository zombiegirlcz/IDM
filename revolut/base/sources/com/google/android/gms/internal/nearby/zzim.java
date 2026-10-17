package com.google.android.gms.internal.nearby;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.nearby.connection.Payload;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
final class zzim extends zzji {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ List f45307zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final /* synthetic */ Payload f45308zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzim(zzjj zzjjVar, GoogleApiClient googleApiClient, List list, Payload payload) {
        super(googleApiClient, null);
        this.f45307zza = list;
        this.f45308zzb = payload;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    public final /* bridge */ /* synthetic */ void doExecute(Api.AnyClient anyClient) throws Throwable {
        ((zzgz) anyClient).zzz(this, (String[]) this.f45307zza.toArray(new String[0]), this.f45308zzb, false);
    }
}
