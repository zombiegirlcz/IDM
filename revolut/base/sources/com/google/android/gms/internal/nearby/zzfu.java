package com.google.android.gms.internal.nearby;

import com.google.android.gms.nearby.connection.ConnectionLifecycleCallback;

/* JADX INFO: loaded from: classes16.dex */
final class zzfu extends zzgq {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ zzkr f45177zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfu(zzfx zzfxVar, zzkr zzkrVar) {
        super(null);
        this.f45177zza = zzkrVar;
    }

    @Override // com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    public final /* bridge */ /* synthetic */ void notifyListener(Object obj2) {
        String strZzc = this.f45177zza.zzc();
        com.google.android.gms.nearby.connection.zze zzeVar = new com.google.android.gms.nearby.connection.zze();
        zzeVar.zzb(this.f45177zza.zzb());
        zzeVar.zza(this.f45177zza.zza());
        ((ConnectionLifecycleCallback) obj2).onBandwidthChanged(strZzc, zzeVar.zzc());
    }
}
