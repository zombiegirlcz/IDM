package com.google.android.gms.internal.nearby;

import com.google.android.gms.nearby.connection.PayloadCallback;
import com.google.android.gms.nearby.connection.PayloadTransferUpdate;

/* JADX INFO: loaded from: classes16.dex */
final class zzgt extends zzgq {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ String f45206zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final /* synthetic */ PayloadTransferUpdate f45207zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzgt(zzgv zzgvVar, String str, PayloadTransferUpdate payloadTransferUpdate) {
        super(null);
        this.f45206zza = str;
        this.f45207zzb = payloadTransferUpdate;
    }

    @Override // com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    public final /* bridge */ /* synthetic */ void notifyListener(Object obj2) {
        PayloadTransferUpdate.Builder builder = new PayloadTransferUpdate.Builder(this.f45207zzb);
        builder.setStatus(2);
        ((PayloadCallback) obj2).onPayloadTransferUpdate(this.f45206zza, builder.build());
    }
}
