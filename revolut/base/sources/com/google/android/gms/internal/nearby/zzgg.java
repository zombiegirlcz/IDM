package com.google.android.gms.internal.nearby;

import com.google.android.gms.nearby.connection.EndpointDiscoveryCallback;

/* JADX INFO: loaded from: classes16.dex */
final class zzgg extends zzgq {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ String f45192zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzgg(zzgh zzghVar, String str) {
        super(null);
        this.f45192zza = str;
    }

    @Override // com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    public final /* synthetic */ void notifyListener(Object obj2) {
        ((EndpointDiscoveryCallback) obj2).onEndpointLost(this.f45192zza);
    }
}
