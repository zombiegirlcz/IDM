package com.google.android.gms.internal.nearby;

import com.google.android.gms.nearby.connection.ConnectionLifecycleCallback;
import com.google.android.gms.nearby.connection.ConnectionResolution;

/* JADX INFO: loaded from: classes16.dex */
final class zzfv extends zzgq {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ String f45178zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfv(zzfx zzfxVar, String str) {
        super(null);
        this.f45178zza = str;
    }

    @Override // com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    public final /* bridge */ /* synthetic */ void notifyListener(Object obj2) {
        ((ConnectionLifecycleCallback) obj2).onConnectionResult(this.f45178zza, new ConnectionResolution(zzgz.zzG(13)));
    }
}
