package com.google.android.gms.internal.nearby;

import com.google.android.gms.nearby.connection.Connections;
import com.google.android.gms.nearby.connection.Payload;

/* JADX INFO: loaded from: classes16.dex */
final class zzgm extends zzgq {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ zzlj f45198zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final /* synthetic */ zzgo f45199zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzgm(zzgo zzgoVar, zzlj zzljVar) {
        super(null);
        this.f45199zzb = zzgoVar;
        this.f45198zza = zzljVar;
    }

    @Override // com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    public final /* bridge */ /* synthetic */ void notifyListener(Object obj2) {
        byte[] bArrAsBytes;
        Connections.MessageListener messageListener = (Connections.MessageListener) obj2;
        Payload payloadZza = zzme.zza(this.f45199zzb.f45201zza, this.f45198zza.zza());
        if (payloadZza == null) {
            String.format("Failed to convert incoming ParcelablePayload %d to Payload.", Long.valueOf(this.f45198zza.zza().zzb()));
        } else if (payloadZza.getType() == 1 && (bArrAsBytes = payloadZza.asBytes()) != null) {
            zzlj zzljVar = this.f45198zza;
            messageListener.onMessageReceived(zzljVar.zzb(), bArrAsBytes, zzljVar.zzc());
        }
    }
}
