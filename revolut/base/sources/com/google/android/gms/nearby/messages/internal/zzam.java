package com.google.android.gms.nearby.messages.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.nearby.messages.Message;
import com.google.android.gms.nearby.messages.PublishOptions;

/* JADX INFO: loaded from: classes16.dex */
public final /* synthetic */ class zzam implements zzbc {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    public final /* synthetic */ zzbh f48102zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    public final /* synthetic */ Message f48103zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    public final /* synthetic */ zzbe f48104zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    public final /* synthetic */ PublishOptions f48105zzd;

    public /* synthetic */ zzam(zzbh zzbhVar, Message message, zzbe zzbeVar, PublishOptions publishOptions) {
        this.f48102zza = zzbhVar;
        this.f48103zzb = message;
        this.f48104zzc = zzbeVar;
        this.f48105zzd = publishOptions;
    }

    @Override // com.google.android.gms.nearby.messages.internal.zzbc
    public final void zza(zzai zzaiVar, ListenerHolder listenerHolder) throws RemoteException {
        this.f48102zza.zzb(this.f48103zzb, this.f48104zzc, this.f48105zzd, zzaiVar, listenerHolder);
    }
}
