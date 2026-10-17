package com.google.android.gms.nearby.messages.internal;

import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.internal.nearby.zznq;

/* JADX INFO: loaded from: classes16.dex */
class zzbe extends zzu {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private static final zznq f48128zza = new zzbd();

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final ListenerHolder f48129zzb;

    public zzbe(ListenerHolder listenerHolder) {
        this.f48129zzb = listenerHolder;
    }

    public void zzd() {
        ListenerHolder listenerHolder = this.f48129zzb;
        if (listenerHolder != null) {
            listenerHolder.notifyListener(f48128zza);
        }
    }
}
