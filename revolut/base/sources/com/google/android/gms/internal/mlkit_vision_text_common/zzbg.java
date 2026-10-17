package com.google.android.gms.internal.mlkit_vision_text_common;

import java.io.Serializable;

/* JADX INFO: loaded from: classes16.dex */
final class zzbg extends zzam implements Serializable {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final Object f44479zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final Object f44480zzb;

    public zzbg(Object obj2, Object obj3) {
        this.f44479zza = obj2;
        this.f44480zzb = obj3;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzam, java.util.Map.Entry
    public final Object getKey() {
        return this.f44479zza;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzam, java.util.Map.Entry
    public final Object getValue() {
        return this.f44480zzb;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzam, java.util.Map.Entry
    public final Object setValue(Object obj2) {
        throw new UnsupportedOperationException();
    }
}
