package com.google.android.gms.internal.nearby;

import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes16.dex */
@Deprecated
final class zzfz extends zzjp {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final ListenerHolder f45184zza;

    public zzfz(ListenerHolder listenerHolder) {
        this.f45184zza = (ListenerHolder) Preconditions.checkNotNull(listenerHolder);
    }

    @Override // com.google.android.gms.internal.nearby.zzjq
    public final void zzb(zzkv zzkvVar) {
        this.f45184zza.notifyListener(new zzfy(this, zzkvVar));
    }
}
