package com.google.android.gms.internal.mlkit_vision_face;

import ch.qos.logback.core.CoreConstants;

/* JADX INFO: loaded from: classes.dex */
final class zzcp implements zzcu {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final int f43537zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final zzct f43538zzb;

    public zzcp(int i, zzct zzctVar) {
        this.f43537zza = i;
        this.f43538zzb = zzctVar;
    }

    @Override // java.lang.annotation.Annotation
    public final Class annotationType() {
        return zzcu.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof zzcu)) {
            return false;
        }
        zzcu zzcuVar = (zzcu) obj2;
        return this.f43537zza == zzcuVar.zza() && this.f43538zzb.equals(zzcuVar.zzb());
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return (this.f43537zza ^ 14552422) + (this.f43538zzb.hashCode() ^ 2041407134);
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f43537zza + "intEncoding=" + this.f43538zzb + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face.zzcu
    public final int zza() {
        return this.f43537zza;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face.zzcu
    public final zzct zzb() {
        return this.f43538zzb;
    }
}
