package com.google.android.gms.internal.nearby;

import android.content.Context;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes16.dex */
@Deprecated
final class zzgo extends zzjs {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final Context f45201zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final ListenerHolder f45202zzb;

    public zzgo(Context context, ListenerHolder listenerHolder) {
        this.f45201zza = (Context) Preconditions.checkNotNull(context);
        this.f45202zzb = (ListenerHolder) Preconditions.checkNotNull(listenerHolder);
    }

    @Override // com.google.android.gms.internal.nearby.zzjt
    public final void zzc(zzlb zzlbVar) {
        this.f45202zzb.notifyListener(new zzgn(this, zzlbVar));
    }

    @Override // com.google.android.gms.internal.nearby.zzjt
    public final void zzd(zzlj zzljVar) {
        this.f45202zzb.notifyListener(new zzgm(this, zzljVar));
    }
}
