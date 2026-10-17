package com.google.android.gms.internal.nearby;

import com.google.android.gms.nearby.uwb.RangingSessionCallback;
import com.google.android.gms.nearby.uwb.UwbDevice;

/* JADX INFO: loaded from: classes16.dex */
final class zzsy extends zznq {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ zzqd f45691zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final /* synthetic */ zztb f45692zzb;

    public zzsy(zztb zztbVar, zzqd zzqdVar) {
        this.f45692zzb = zztbVar;
        this.f45691zza = zzqdVar;
    }

    @Override // com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    public final /* bridge */ /* synthetic */ void notifyListener(Object obj2) {
        zzqd zzqdVar = this.f45691zza;
        zztb zztbVar = this.f45692zzb;
        ((RangingSessionCallback) obj2).onRangingInitialized(UwbDevice.createForAddress(zzqdVar.zza().zza().zzb()));
    }
}
