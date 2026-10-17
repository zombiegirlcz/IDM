package com.google.android.gms.nearby.messages.internal;

import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.internal.nearby.zznq;

/* JADX INFO: loaded from: classes16.dex */
final class zzbw extends zzaa {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private static final zznq f48154zza = new zzbv();

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final ListenerHolder f48155zzb;

    public zzbw(ListenerHolder listenerHolder) {
        this.f48155zzb = listenerHolder;
    }

    @Override // com.google.android.gms.nearby.messages.internal.zzab
    public final void zzd() {
        this.f48155zzb.notifyListener(f48154zza);
    }
}
