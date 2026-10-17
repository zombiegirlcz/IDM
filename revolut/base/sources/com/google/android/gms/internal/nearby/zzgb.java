package com.google.android.gms.internal.nearby;

import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes16.dex */
@Deprecated
final class zzgb extends zzjy {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final ListenerHolder f45188zza;

    public zzgb(ListenerHolder listenerHolder) {
        this.f45188zza = (ListenerHolder) Preconditions.checkNotNull(listenerHolder);
    }

    @Override // com.google.android.gms.internal.nearby.zzjz
    public final void zzb(zzkx zzkxVar) {
        this.f45188zza.notifyListener(new zzga(this, zzkxVar));
    }
}
