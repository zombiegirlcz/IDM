package com.google.android.gms.internal.nearby;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.nearby.connection.Connections;

/* JADX INFO: loaded from: classes16.dex */
final class zzfy extends zzgq {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ zzkv f45183zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfy(zzfz zzfzVar, zzkv zzkvVar) {
        super(null);
        this.f45183zza = zzkvVar;
    }

    @Override // com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    public final /* bridge */ /* synthetic */ void notifyListener(Object obj2) {
        zzkv zzkvVar = this.f45183zza;
        ((Connections.ConnectionRequestListener) obj2).onConnectionRequest(zzkvVar.zza(), zzkvVar.zzb(), (byte[]) Preconditions.checkNotNull(zzkvVar.zzc()));
    }
}
