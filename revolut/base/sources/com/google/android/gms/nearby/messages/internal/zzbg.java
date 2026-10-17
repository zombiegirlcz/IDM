package com.google.android.gms.nearby.messages.internal;

import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.internal.nearby.zznq;

/* JADX INFO: loaded from: classes16.dex */
class zzbg extends zzaa {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private static final zznq f48130zza = new zzbf();

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final ListenerHolder f48131zzb;

    public zzbg(ListenerHolder listenerHolder) {
        this.f48131zzb = listenerHolder;
    }

    public void zzd() {
        ListenerHolder listenerHolder = this.f48131zzb;
        if (listenerHolder != null) {
            listenerHolder.notifyListener(f48130zza);
        }
    }
}
