package com.google.android.gms.internal.nearby;

import com.google.android.gms.nearby.uwb.RangingSessionCallback;
import com.google.android.gms.nearby.uwb.UwbDevice;

/* JADX INFO: loaded from: classes16.dex */
final class zzta extends zznq {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ zzqh f45697zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final /* synthetic */ zztb f45698zzb;

    public zzta(zztb zztbVar, zzqh zzqhVar) {
        this.f45698zzb = zztbVar;
        this.f45697zza = zzqhVar;
    }

    @Override // com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    public final /* bridge */ /* synthetic */ void notifyListener(Object obj2) {
        zzqh zzqhVar = this.f45697zza;
        zztb zztbVar = this.f45698zzb;
        ((RangingSessionCallback) obj2).onRangingSuspended(UwbDevice.createForAddress(zzqhVar.zzb().zza().zzb()), this.f45697zza.zza());
    }

    @Override // com.google.android.gms.internal.nearby.zznq, com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    public final void onNotifyListenerFailed() {
        this.f45698zzb.f45701zzc.onRangingSuspended(UwbDevice.createForAddress(this.f45697zza.zzb().zza().zzb()), this.f45697zza.zza());
    }
}
