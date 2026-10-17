package com.google.android.gms.internal.nearby;

import com.google.android.gms.nearby.uwb.RangingSessionCallback;
import com.google.android.gms.nearby.uwb.UwbDevice;

/* JADX INFO: loaded from: classes16.dex */
final class zzsz extends zznq {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ zzqf f45693zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final /* synthetic */ zztb f45694zzb;

    public zzsz(zztb zztbVar, zzqf zzqfVar) {
        this.f45694zzb = zztbVar;
        this.f45693zza = zzqfVar;
    }

    @Override // com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    public final /* bridge */ /* synthetic */ void notifyListener(Object obj2) {
        zzqf zzqfVar = this.f45693zza;
        zztb zztbVar = this.f45694zzb;
        ((RangingSessionCallback) obj2).onRangingResult(UwbDevice.createForAddress(zzqfVar.zzb().zza().zzb()), zztb.zzb(this.f45694zzb, this.f45693zza.zza()));
    }
}
