package com.google.android.gms.internal.nearby;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.internal.ListenerHolder;

/* JADX INFO: loaded from: classes16.dex */
final class zziq extends zzji {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ String f45311zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final /* synthetic */ String f45312zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    final /* synthetic */ byte[] f45313zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    final /* synthetic */ ListenerHolder f45314zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    final /* synthetic */ ListenerHolder f45315zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zziq(zzjj zzjjVar, GoogleApiClient googleApiClient, String str, String str2, byte[] bArr, ListenerHolder listenerHolder, ListenerHolder listenerHolder2) {
        super(googleApiClient, null);
        this.f45311zza = str;
        this.f45312zzb = str2;
        this.f45313zzc = bArr;
        this.f45314zzd = listenerHolder;
        this.f45315zze = listenerHolder2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    public final /* bridge */ /* synthetic */ void doExecute(Api.AnyClient anyClient) throws RemoteException {
        zzgz zzgzVar = (zzgz) anyClient;
        zzke zzkeVar = (zzke) zzgzVar.getService();
        zzmj zzmjVar = new zzmj();
        zzmjVar.zzi(new zzgw(this));
        zzmjVar.zzf(this.f45311zza);
        zzmjVar.zzh(this.f45312zzb);
        zzmjVar.zze(this.f45313zzc);
        zzmjVar.zza(new zzgo(zzgzVar.getContext(), this.f45315zze));
        zzmjVar.zzc(new zzgb(this.f45314zzd));
        zzkeVar.zzi(zzmjVar.zzj());
    }
}
