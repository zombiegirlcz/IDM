package com.google.android.gms.internal.mlkit_vision_common;

import ch.qos.logback.core.CoreConstants;

/* JADX INFO: loaded from: classes16.dex */
final class zzad implements zzai {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final int f42611zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final zzah f42612zzb;

    public zzad(int i, zzah zzahVar) {
        this.f42611zza = i;
        this.f42612zzb = zzahVar;
    }

    @Override // java.lang.annotation.Annotation
    public final Class annotationType() {
        return zzai.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof zzai)) {
            return false;
        }
        zzai zzaiVar = (zzai) obj2;
        return this.f42611zza == zzaiVar.zza() && this.f42612zzb.equals(zzaiVar.zzb());
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return (this.f42611zza ^ 14552422) + (this.f42612zzb.hashCode() ^ 2041407134);
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f42611zza + "intEncoding=" + this.f42612zzb + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzai
    public final int zza() {
        return this.f42611zza;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzai
    public final zzah zzb() {
        return this.f42612zzb;
    }
}
