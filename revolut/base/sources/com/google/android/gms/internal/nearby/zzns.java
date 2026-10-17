package com.google.android.gms.internal.nearby;

import com.google.android.gms.common.api.internal.ListenerHolder;

/* JADX INFO: loaded from: classes16.dex */
public final class zzns extends com.google.android.gms.nearby.messages.internal.zzx {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final ListenerHolder f45525zza;

    public zzns(ListenerHolder listenerHolder) {
        this.f45525zza = listenerHolder;
    }

    @Override // com.google.android.gms.nearby.messages.internal.zzy
    public final void zzd(boolean z) {
        this.f45525zza.notifyListener(new zznr(this, z));
    }
}
