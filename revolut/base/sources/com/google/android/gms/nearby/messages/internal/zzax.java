package com.google.android.gms.nearby.messages.internal;

import com.google.android.gms.common.api.internal.ListenerHolder;

/* JADX INFO: loaded from: classes16.dex */
final class zzax extends zzbg {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ ListenerHolder f48122zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final /* synthetic */ zzbh f48123zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzax(zzbh zzbhVar, ListenerHolder listenerHolder, ListenerHolder listenerHolder2) {
        super(listenerHolder);
        this.f48123zzb = zzbhVar;
        this.f48122zza = listenerHolder2;
    }

    @Override // com.google.android.gms.nearby.messages.internal.zzbg, com.google.android.gms.nearby.messages.internal.zzab
    public final void zzd() {
        ListenerHolder.ListenerKey<?> listenerKey = this.f48122zza.getListenerKey();
        if (listenerKey != null) {
            this.f48123zzb.doUnregisterEventListener(listenerKey);
        }
        super.zzd();
    }
}
