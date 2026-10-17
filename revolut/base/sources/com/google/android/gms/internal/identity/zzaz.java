package com.google.android.gms.internal.identity;

import com.google.android.gms.common.api.internal.ListenerHolder;

/* JADX INFO: loaded from: classes16.dex */
final class zzaz implements zzdr {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private ListenerHolder f39618zza;

    public zzaz(ListenerHolder listenerHolder) {
        this.f39618zza = listenerHolder;
    }

    @Override // com.google.android.gms.internal.identity.zzdr
    public final synchronized ListenerHolder zza() {
        return this.f39618zza;
    }

    @Override // com.google.android.gms.internal.identity.zzdr
    public final synchronized void zzb(ListenerHolder listenerHolder) {
        ListenerHolder listenerHolder2 = this.f39618zza;
        if (listenerHolder2 != listenerHolder) {
            listenerHolder2.clear();
            this.f39618zza = listenerHolder;
        }
    }

    @Override // com.google.android.gms.internal.identity.zzdr
    public final void zzc() {
    }
}
