package com.google.android.gms.internal.auth;

import com.google.android.gms.internal.auth.zzet;
import com.google.android.gms.internal.auth.zzev;

/* JADX INFO: loaded from: classes16.dex */
public class zzet<MessageType extends zzev<MessageType, BuilderType>, BuilderType extends zzet<MessageType, BuilderType>> extends zzdp<MessageType, BuilderType> {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    protected zzev f39036zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final zzev f39037zzb;

    public zzet(MessageType messagetype) {
        this.f39037zzb = messagetype;
        if (messagetype.zzm()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.f39036zza = messagetype.zzc();
    }

    @Override // com.google.android.gms.internal.auth.zzdp
    /* JADX INFO: renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final zzet clone() {
        zzet zzetVar = (zzet) this.f39037zzb.zzn(5, null, null);
        zzetVar.f39036zza = zzd();
        return zzetVar;
    }

    @Override // com.google.android.gms.internal.auth.zzfw
    /* JADX INFO: renamed from: zzc, reason: merged with bridge method [inline-methods] */
    public MessageType zzd() {
        if (!this.f39036zza.zzm()) {
            return (MessageType) this.f39036zza;
        }
        this.f39036zza.zzi();
        return (MessageType) this.f39036zza;
    }

    @Override // com.google.android.gms.internal.auth.zzfy
    public final /* bridge */ /* synthetic */ zzfx zze() {
        throw null;
    }
}
