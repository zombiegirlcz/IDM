package com.google.android.gms.nearby.messages.internal;

import com.google.android.gms.common.api.internal.ListenerHolder;

/* JADX INFO: loaded from: classes16.dex */
final class zzaw extends zzbe {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ ListenerHolder f48120zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final /* synthetic */ zzbh f48121zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzaw(zzbh zzbhVar, ListenerHolder listenerHolder, ListenerHolder listenerHolder2) {
        super(listenerHolder);
        this.f48121zzb = zzbhVar;
        this.f48120zza = listenerHolder2;
    }

    @Override // com.google.android.gms.nearby.messages.internal.zzbe, com.google.android.gms.nearby.messages.internal.zzv
    public final void zzd() {
        ListenerHolder.ListenerKey<?> listenerKey = this.f48120zza.getListenerKey();
        if (listenerKey != null) {
            this.f48121zzb.doUnregisterEventListener(listenerKey);
        }
        super.zzd();
    }
}
