package com.google.android.gms.internal.nearby;

import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes16.dex */
final class zzgk extends zzkc {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final ListenerHolder f45197zza;

    public zzgk(ListenerHolder listenerHolder) {
        this.f45197zza = (ListenerHolder) Preconditions.checkNotNull(listenerHolder);
    }

    @Override // com.google.android.gms.internal.nearby.zzkd
    public final synchronized void zzb(zzld zzldVar) {
    }

    @Override // com.google.android.gms.internal.nearby.zzkd
    public final void zzc(zzlf zzlfVar) {
        this.f45197zza.notifyListener(new zzgi(this, zzlfVar));
    }

    @Override // com.google.android.gms.internal.nearby.zzkd
    public final void zzd(zzlh zzlhVar) {
        this.f45197zza.notifyListener(new zzgj(this, zzlhVar));
    }
}
