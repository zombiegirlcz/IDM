package com.google.android.gms.internal.mlkit_common;

import ch.qos.logback.core.CoreConstants;

/* JADX INFO: loaded from: classes.dex */
final class zzax implements zzbc {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final int f40743zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final zzbb f40744zzb;

    public zzax(int i, zzbb zzbbVar) {
        this.f40743zza = i;
        this.f40744zzb = zzbbVar;
    }

    @Override // java.lang.annotation.Annotation
    public final Class annotationType() {
        return zzbc.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof zzbc)) {
            return false;
        }
        zzbc zzbcVar = (zzbc) obj2;
        return this.f40743zza == zzbcVar.zza() && this.f40744zzb.equals(zzbcVar.zzb());
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return (this.f40743zza ^ 14552422) + (this.f40744zzb.hashCode() ^ 2041407134);
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f40743zza + "intEncoding=" + this.f40744zzb + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzbc
    public final int zza() {
        return this.f40743zza;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzbc
    public final zzbb zzb() {
        return this.f40744zzb;
    }
}
