package com.google.android.gms.internal.nearby;

import com.google.android.gms.nearby.connection.ConnectionLifecycleCallback;

/* JADX INFO: loaded from: classes16.dex */
final class zzfw extends zzgq {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ String f45179zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfw(zzfx zzfxVar, String str) {
        super(null);
        this.f45179zza = str;
    }

    @Override // com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    public final /* synthetic */ void notifyListener(Object obj2) {
        ((ConnectionLifecycleCallback) obj2).onDisconnected(this.f45179zza);
    }
}
