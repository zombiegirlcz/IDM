package com.google.android.gms.internal.nearby;

import com.google.android.gms.nearby.connection.PayloadCallback;

/* JADX INFO: loaded from: classes16.dex */
final class zzgs extends zzgq {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ zzll f45205zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzgs(zzgv zzgvVar, zzll zzllVar) {
        super(null);
        this.f45205zza = zzllVar;
    }

    @Override // com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    public final /* bridge */ /* synthetic */ void notifyListener(Object obj2) {
        zzll zzllVar = this.f45205zza;
        ((PayloadCallback) obj2).onPayloadTransferUpdate(zzllVar.zzb(), zzllVar.zza());
    }
}
