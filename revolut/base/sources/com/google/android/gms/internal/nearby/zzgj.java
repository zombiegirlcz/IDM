package com.google.android.gms.internal.nearby;

import com.google.android.gms.nearby.connection.Connections;

/* JADX INFO: loaded from: classes16.dex */
final class zzgj extends zzgq {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ zzlh f45196zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzgj(zzgk zzgkVar, zzlh zzlhVar) {
        super(null);
        this.f45196zza = zzlhVar;
    }

    @Override // com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    public final /* bridge */ /* synthetic */ void notifyListener(Object obj2) {
        ((Connections.EndpointDiscoveryListener) obj2).onEndpointLost(this.f45196zza.zza());
    }
}
