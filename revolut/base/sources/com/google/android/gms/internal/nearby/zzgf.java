package com.google.android.gms.internal.nearby;

import com.google.android.gms.nearby.connection.EndpointDiscoveryCallback;

/* JADX INFO: loaded from: classes16.dex */
final class zzgf extends zzgq {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ zzlh f45191zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzgf(zzgh zzghVar, zzlh zzlhVar) {
        super(null);
        this.f45191zza = zzlhVar;
    }

    @Override // com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    public final /* bridge */ /* synthetic */ void notifyListener(Object obj2) {
        ((EndpointDiscoveryCallback) obj2).onEndpointLost(this.f45191zza.zza());
    }
}
