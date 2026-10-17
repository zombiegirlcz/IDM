package com.google.android.gms.internal.identity;

import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes16.dex */
final class zzdi implements zzdr {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ ListenerHolder f39691zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final /* synthetic */ TaskCompletionSource f39692zzb;

    public zzdi(zzdz zzdzVar, ListenerHolder listenerHolder, TaskCompletionSource taskCompletionSource) {
        this.f39691zza = listenerHolder;
        this.f39692zzb = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.identity.zzdr
    public final ListenerHolder zza() {
        return this.f39691zza;
    }

    @Override // com.google.android.gms.internal.identity.zzdr
    public final void zzb(ListenerHolder listenerHolder) {
        throw new IllegalStateException();
    }

    @Override // com.google.android.gms.internal.identity.zzdr
    public final void zzc() {
        this.f39692zzb.trySetResult(null);
    }
}
