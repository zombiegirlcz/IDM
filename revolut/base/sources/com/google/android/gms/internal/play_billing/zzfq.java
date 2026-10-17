package com.google.android.gms.internal.play_billing;

import com.google.android.gms.internal.play_billing.zzfq;
import com.google.android.gms.internal.play_billing.zzfu;

/* JADX INFO: loaded from: classes16.dex */
public class zzfq<MessageType extends zzfu<MessageType, BuilderType>, BuilderType extends zzfq<MessageType, BuilderType>> extends zzef<MessageType, BuilderType> {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    protected zzfu f46018zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final zzfu f46019zzb;

    public zzfq(MessageType messagetype) {
        this.f46019zzb = messagetype;
        if (messagetype.zzF()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.f46018zza = messagetype.zzs();
    }

    private static void zza(Object obj2, Object obj3) {
        zzhi.zza().zzb(obj2.getClass()).zzg(obj2, obj3);
    }

    @Override // com.google.android.gms.internal.play_billing.zzef
    /* JADX INFO: renamed from: zzg, reason: merged with bridge method [inline-methods] */
    public final zzfq clone() {
        zzfq zzfqVar = (zzfq) this.f46019zzb.zzd(5, null, null);
        zzfqVar.f46018zza = zzk();
        return zzfqVar;
    }

    public final zzfq zzh(zzfu zzfuVar) {
        if (!this.f46019zzb.equals(zzfuVar)) {
            if (!this.f46018zza.zzF()) {
                zzn();
            }
            zza(this.f46018zza, zzfuVar);
        }
        return this;
    }

    public final MessageType zzi() {
        MessageType messagetype = (MessageType) zzk();
        if (messagetype.zzo()) {
            return messagetype;
        }
        throw new zzia(messagetype);
    }

    @Override // com.google.android.gms.internal.play_billing.zzha
    /* JADX INFO: renamed from: zzj, reason: merged with bridge method [inline-methods] */
    public MessageType zzk() {
        if (!this.f46018zza.zzF()) {
            return (MessageType) this.f46018zza;
        }
        this.f46018zza.zzz();
        return (MessageType) this.f46018zza;
    }

    @Override // com.google.android.gms.internal.play_billing.zzhc
    public final /* bridge */ /* synthetic */ zzhb zzl() {
        throw null;
    }

    public final void zzm() {
        if (this.f46018zza.zzF()) {
            return;
        }
        zzn();
    }

    public void zzn() {
        zzfu zzfuVarZzs = this.f46019zzb.zzs();
        zza(zzfuVarZzs, this.f46018zza);
        this.f46018zza = zzfuVarZzs;
    }

    @Override // com.google.android.gms.internal.play_billing.zzhc
    public final boolean zzo() {
        return zzfu.zzc(this.f46018zza, false);
    }
}
