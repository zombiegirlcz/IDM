package com.google.android.gms.internal.identity;

import android.location.Location;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.location.zzy;

/* JADX INFO: loaded from: classes16.dex */
final class zzdy extends zzy {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final zzdr f39710zza;

    public zzdy(zzdr zzdrVar) {
        this.f39710zza = zzdrVar;
    }

    public final zzdy zzc(ListenerHolder listenerHolder) {
        this.f39710zza.zzb(listenerHolder);
        return this;
    }

    @Override // com.google.android.gms.location.zzz
    public final void zzd(Location location) {
        this.f39710zza.zza().notifyListener(new zzdw(this, location));
    }

    @Override // com.google.android.gms.location.zzz
    public final void zze() {
        this.f39710zza.zza().notifyListener(new zzdx(this));
    }

    public final void zzf() {
        this.f39710zza.zza().clear();
    }

    public final /* synthetic */ zzdr zzg() {
        return this.f39710zza;
    }
}
