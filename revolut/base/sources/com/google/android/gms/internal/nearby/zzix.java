package com.google.android.gms.internal.nearby;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.nearby.connection.AdvertisingOptions;
import com.google.android.gms.nearby.connection.Strategy;

/* JADX INFO: loaded from: classes16.dex */
final class zzix extends zzjg {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ String f45328zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final /* synthetic */ long f45329zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    final /* synthetic */ ListenerHolder f45330zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzix(zzjj zzjjVar, GoogleApiClient googleApiClient, String str, long j2, ListenerHolder listenerHolder) {
        super(googleApiClient, null);
        this.f45328zza = str;
        this.f45329zzb = j2;
        this.f45330zzc = listenerHolder;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    public final /* bridge */ /* synthetic */ void doExecute(Api.AnyClient anyClient) throws RemoteException {
        AdvertisingOptions.Builder builder = new AdvertisingOptions.Builder();
        builder.setStrategy(Strategy.P2P_CLUSTER);
        AdvertisingOptions advertisingOptionsBuild = builder.build();
        zzke zzkeVar = (zzke) ((zzgz) anyClient).getService();
        zzmr zzmrVar = new zzmr();
        zzmrVar.zzg(new zzgy(this));
        zzmrVar.zze(this.f45328zza);
        zzmrVar.zzh("__LEGACY_SERVICE_ID__");
        zzmrVar.zzc(this.f45329zzb);
        zzmrVar.zza(new zzfz(this.f45330zzc));
        zzmrVar.zzf(advertisingOptionsBuild);
        zzkeVar.zzk(zzmrVar.zzi());
    }
}
