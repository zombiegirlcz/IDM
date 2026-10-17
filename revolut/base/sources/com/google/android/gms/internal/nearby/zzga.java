package com.google.android.gms.internal.nearby;

import com.google.android.gms.nearby.connection.Connections;

/* JADX INFO: loaded from: classes16.dex */
final class zzga extends zzgq {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ zzkx f45187zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzga(zzgb zzgbVar, zzkx zzkxVar) {
        super(null);
        this.f45187zza = zzkxVar;
    }

    @Override // com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    public final /* bridge */ /* synthetic */ void notifyListener(Object obj2) {
        Connections.ConnectionResponseCallback connectionResponseCallback = (Connections.ConnectionResponseCallback) obj2;
        byte[] bArrZzc = this.f45187zza.zzc();
        if (bArrZzc != null) {
            zzkx zzkxVar = this.f45187zza;
            connectionResponseCallback.onConnectionResponse(zzkxVar.zzb(), zzgz.zzG(zzkxVar.zza()), bArrZzc);
        }
    }
}
