package com.google.android.gms.internal.nearby;

import com.google.android.gms.nearby.connection.Connections;

/* JADX INFO: loaded from: classes16.dex */
final class zzgn extends zzgq {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ zzlb f45200zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzgn(zzgo zzgoVar, zzlb zzlbVar) {
        super(null);
        this.f45200zza = zzlbVar;
    }

    @Override // com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    public final /* bridge */ /* synthetic */ void notifyListener(Object obj2) {
        ((Connections.MessageListener) obj2).onDisconnected(this.f45200zza.zza());
    }
}
