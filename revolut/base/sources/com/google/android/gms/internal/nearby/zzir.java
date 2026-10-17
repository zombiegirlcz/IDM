package com.google.android.gms.internal.nearby;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.internal.ListenerHolder;

/* JADX INFO: loaded from: classes16.dex */
final class zzir extends zzji {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ String f45316zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final /* synthetic */ byte[] f45317zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    final /* synthetic */ ListenerHolder f45318zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzir(zzjj zzjjVar, GoogleApiClient googleApiClient, String str, byte[] bArr, ListenerHolder listenerHolder) {
        super(googleApiClient, null);
        this.f45316zza = str;
        this.f45317zzb = bArr;
        this.f45318zzc = listenerHolder;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    public final /* bridge */ /* synthetic */ void doExecute(Api.AnyClient anyClient) throws RemoteException {
        zzgz zzgzVar = (zzgz) anyClient;
        zzke zzkeVar = (zzke) zzgzVar.getService();
        zzfh zzfhVar = new zzfh();
        zzfhVar.zze(new zzgw(this));
        zzfhVar.zzd(this.f45316zza);
        zzfhVar.zzb(this.f45317zzb);
        zzfhVar.zza(new zzgo(zzgzVar.getContext(), this.f45318zzc));
        zzkeVar.zzd(zzfhVar.zzf());
    }
}
