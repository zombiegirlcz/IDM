package com.google.android.gms.internal.nearby;

import com.google.android.gms.nearby.connection.ConnectionLifecycleCallback;

/* JADX INFO: loaded from: classes16.dex */
final class zzft extends zzgq {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ zzlb f45176zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzft(zzfx zzfxVar, zzlb zzlbVar) {
        super(null);
        this.f45176zza = zzlbVar;
    }

    @Override // com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    public final /* bridge */ /* synthetic */ void notifyListener(Object obj2) {
        ((ConnectionLifecycleCallback) obj2).onDisconnected(this.f45176zza.zza());
    }
}
