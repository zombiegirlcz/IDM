package com.google.android.gms.internal.nearby;

import com.google.android.gms.nearby.connection.EndpointDiscoveryCallback;

/* JADX INFO: loaded from: classes16.dex */
final class zzge extends zzgq {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ zzlf f45190zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzge(zzgh zzghVar, zzlf zzlfVar) {
        super(null);
        this.f45190zza = zzlfVar;
    }

    @Override // com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    public final /* bridge */ /* synthetic */ void notifyListener(Object obj2) {
        EndpointDiscoveryCallback endpointDiscoveryCallback = (EndpointDiscoveryCallback) obj2;
        if (zzgh.zzg(this.f45190zza)) {
            com.google.android.gms.nearby.connection.zzs zzsVar = new com.google.android.gms.nearby.connection.zzs();
            zzsVar.zzd(this.f45190zza.zzd());
            zzsVar.zza(this.f45190zza.zza());
            endpointDiscoveryCallback.onEndpointFound("__UNRECOGNIZED_BLUETOOTH_DEVICE__", zzsVar.zze());
            return;
        }
        String strZzb = this.f45190zza.zzb();
        com.google.android.gms.nearby.connection.zzs zzsVar2 = new com.google.android.gms.nearby.connection.zzs();
        zzsVar2.zzd(this.f45190zza.zzd());
        zzsVar2.zzc(this.f45190zza.zzc());
        zzsVar2.zzb(this.f45190zza.zze());
        endpointDiscoveryCallback.onEndpointFound(strZzb, zzsVar2.zze());
    }
}
