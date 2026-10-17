package com.google.android.gms.internal.mlkit_vision_text_common;

import ch.qos.logback.core.CoreConstants;

/* JADX INFO: loaded from: classes.dex */
final class zzcs implements zzcx {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final int f44516zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final zzcw f44517zzb;

    public zzcs(int i, zzcw zzcwVar) {
        this.f44516zza = i;
        this.f44517zzb = zzcwVar;
    }

    @Override // java.lang.annotation.Annotation
    public final Class annotationType() {
        return zzcx.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof zzcx)) {
            return false;
        }
        zzcx zzcxVar = (zzcx) obj2;
        return this.f44516zza == zzcxVar.zza() && this.f44517zzb.equals(zzcxVar.zzb());
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return (this.f44516zza ^ 14552422) + (this.f44517zzb.hashCode() ^ 2041407134);
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f44516zza + "intEncoding=" + this.f44517zzb + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzcx
    public final int zza() {
        return this.f44516zza;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzcx
    public final zzcw zzb() {
        return this.f44517zzb;
    }
}
