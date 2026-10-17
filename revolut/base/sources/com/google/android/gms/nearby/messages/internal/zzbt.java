package com.google.android.gms.nearby.messages.internal;

import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.internal.nearby.zznq;

/* JADX INFO: loaded from: classes16.dex */
final class zzbt extends zzu {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private static final zznq f48151zza = new zzbs();

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final ListenerHolder f48152zzb;

    public zzbt(ListenerHolder listenerHolder) {
        this.f48152zzb = listenerHolder;
    }

    @Override // com.google.android.gms.nearby.messages.internal.zzv
    public final void zzd() {
        this.f48152zzb.notifyListener(f48151zza);
    }
}
