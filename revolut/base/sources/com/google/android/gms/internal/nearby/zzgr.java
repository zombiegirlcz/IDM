package com.google.android.gms.internal.nearby;

import com.google.android.gms.nearby.connection.Payload;
import com.google.android.gms.nearby.connection.PayloadCallback;

/* JADX INFO: loaded from: classes16.dex */
final class zzgr extends zzgq {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ zzlj f45203zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final /* synthetic */ Payload f45204zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzgr(zzgv zzgvVar, zzlj zzljVar, Payload payload) {
        super(null);
        this.f45203zza = zzljVar;
        this.f45204zzb = payload;
    }

    @Override // com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    public final /* bridge */ /* synthetic */ void notifyListener(Object obj2) {
        ((PayloadCallback) obj2).onPayloadReceived(this.f45203zza.zzb(), this.f45204zzb);
    }
}
