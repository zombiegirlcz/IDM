package com.google.android.gms.internal.nearby;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.nearby.connection.DiscoveryOptions;
import com.google.android.gms.nearby.connection.Strategy;

/* JADX INFO: loaded from: classes16.dex */
final class zzja extends zzji {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ String f45334zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final /* synthetic */ long f45335zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    final /* synthetic */ ListenerHolder f45336zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzja(zzjj zzjjVar, GoogleApiClient googleApiClient, String str, long j2, ListenerHolder listenerHolder) {
        super(googleApiClient, null);
        this.f45334zza = str;
        this.f45335zzb = j2;
        this.f45336zzc = listenerHolder;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    public final /* bridge */ /* synthetic */ void doExecute(Api.AnyClient anyClient) throws RemoteException {
        DiscoveryOptions.Builder builder = new DiscoveryOptions.Builder();
        builder.setStrategy(Strategy.P2P_CLUSTER);
        DiscoveryOptions discoveryOptionsBuild = builder.build();
        zzke zzkeVar = (zzke) ((zzgz) anyClient).getService();
        zzmv zzmvVar = new zzmv();
        zzmvVar.zzd(new zzgw(this));
        zzmvVar.zze(this.f45334zza);
        zzmvVar.zzb(this.f45335zzb);
        zzmvVar.zza(new zzgk(this.f45336zzc));
        zzmvVar.zzc(discoveryOptionsBuild);
        zzkeVar.zzl(zzmvVar.zzf());
    }
}
