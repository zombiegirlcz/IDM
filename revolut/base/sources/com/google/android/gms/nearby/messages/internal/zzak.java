package com.google.android.gms.nearby.messages.internal;

import android.app.PendingIntent;
import android.os.RemoteException;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.nearby.messages.SubscribeOptions;

/* JADX INFO: loaded from: classes16.dex */
public final /* synthetic */ class zzak implements zzbc {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    public final /* synthetic */ zzbh f48098zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    public final /* synthetic */ PendingIntent f48099zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    public final /* synthetic */ zzbg f48100zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    public final /* synthetic */ SubscribeOptions f48101zzd;

    public /* synthetic */ zzak(zzbh zzbhVar, PendingIntent pendingIntent, zzbg zzbgVar, SubscribeOptions subscribeOptions) {
        this.f48098zza = zzbhVar;
        this.f48099zzb = pendingIntent;
        this.f48100zzc = zzbgVar;
        this.f48101zzd = subscribeOptions;
    }

    @Override // com.google.android.gms.nearby.messages.internal.zzbc
    public final void zza(zzai zzaiVar, ListenerHolder listenerHolder) throws RemoteException {
        this.f48098zza.zzf(this.f48099zzb, this.f48100zzc, this.f48101zzd, zzaiVar, listenerHolder);
    }
}
