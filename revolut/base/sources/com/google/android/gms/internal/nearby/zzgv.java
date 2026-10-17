package com.google.android.gms.internal.nearby;

import android.content.Context;
import androidx.collection.ArrayMap;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.nearby.connection.Payload;
import com.google.android.gms.nearby.connection.PayloadTransferUpdate;
import java.util.Map;

/* JADX INFO: loaded from: classes16.dex */
final class zzgv extends zzkg implements zzgl {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final Context f45210zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final ListenerHolder f45211zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private final Map f45212zzc = new ArrayMap();

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private final zzlu f45213zzd;

    public zzgv(Context context, ListenerHolder listenerHolder, zzlu zzluVar) {
        this.f45210zza = (Context) Preconditions.checkNotNull(context);
        this.f45211zzb = (ListenerHolder) Preconditions.checkNotNull(listenerHolder);
        this.f45213zzd = zzluVar;
    }

    @Override // com.google.android.gms.internal.nearby.zzkh
    public final synchronized void zzb(zzlj zzljVar) {
        Payload payloadZza = zzme.zza(this.f45210zza, zzljVar.zza());
        if (payloadZza == null) {
            String.format("Failed to convert incoming ParcelablePayload %d to Payload.", Long.valueOf(zzljVar.zza().zzb()));
            return;
        }
        Map map = this.f45212zzc;
        zzgu zzguVar = new zzgu(zzljVar.zzb(), zzljVar.zza().zzb());
        PayloadTransferUpdate.Builder builder = new PayloadTransferUpdate.Builder();
        builder.setPayloadId(zzljVar.zza().zzb());
        map.put(zzguVar, builder.build());
        this.f45211zzb.notifyListener(new zzgr(this, zzljVar, payloadZza));
    }

    @Override // com.google.android.gms.internal.nearby.zzkh
    public final synchronized void zzc(zzll zzllVar) {
        try {
            if (zzllVar.zza().getStatus() == 3) {
                this.f45212zzc.put(new zzgu(zzllVar.zzb(), zzllVar.zza().getPayloadId()), zzllVar.zza());
            } else {
                this.f45212zzc.remove(new zzgu(zzllVar.zzb(), zzllVar.zza().getPayloadId()));
                zzlu zzluVar = this.f45213zzd;
                if (zzluVar != null) {
                    zzluVar.zzb(zzllVar.zza().getPayloadId());
                }
            }
            this.f45211zzb.notifyListener(new zzgs(this, zzllVar));
        } catch (Throwable th10) {
            throw th10;
        }
    }

    @Override // com.google.android.gms.internal.nearby.zzgl
    public final synchronized void zzf() {
        try {
            for (Map.Entry entry : this.f45212zzc.entrySet()) {
                this.f45211zzb.notifyListener(new zzgt(this, ((zzgu) entry.getKey()).zza(), (PayloadTransferUpdate) entry.getValue()));
            }
            this.f45212zzc.clear();
        } catch (Throwable th10) {
            throw th10;
        }
    }
}
