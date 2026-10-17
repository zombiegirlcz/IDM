package com.google.android.gms.internal.nearby;

import com.google.android.gms.nearby.connection.Connections;

/* JADX INFO: loaded from: classes16.dex */
final class zzgi extends zzgq {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ zzlf f45195zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzgi(zzgk zzgkVar, zzlf zzlfVar) {
        super(null);
        this.f45195zza = zzlfVar;
    }

    @Override // com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    public final /* bridge */ /* synthetic */ void notifyListener(Object obj2) {
        zzlf zzlfVar = this.f45195zza;
        ((Connections.EndpointDiscoveryListener) obj2).onEndpointFound(zzlfVar.zzb(), zzlfVar.zzd(), zzlfVar.zzc());
    }
}
