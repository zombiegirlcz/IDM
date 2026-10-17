package com.google.android.gms.nearby.messages.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.nearby.messages.SubscribeOptions;

/* JADX INFO: loaded from: classes16.dex */
public final /* synthetic */ class zzaq implements zzbc {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    public final /* synthetic */ zzbh f48109zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    public final /* synthetic */ ListenerHolder f48110zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    public final /* synthetic */ zzbg f48111zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    public final /* synthetic */ SubscribeOptions f48112zzd;

    public /* synthetic */ zzaq(zzbh zzbhVar, ListenerHolder listenerHolder, zzbg zzbgVar, SubscribeOptions subscribeOptions) {
        this.f48109zza = zzbhVar;
        this.f48110zzb = listenerHolder;
        this.f48111zzc = zzbgVar;
        this.f48112zzd = subscribeOptions;
    }

    @Override // com.google.android.gms.nearby.messages.internal.zzbc
    public final void zza(zzai zzaiVar, ListenerHolder listenerHolder) throws RemoteException {
        this.f48109zza.zze(this.f48110zzb, this.f48111zzc, this.f48112zzd, zzaiVar, listenerHolder);
    }
}
