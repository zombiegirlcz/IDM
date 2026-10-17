package com.google.android.gms.internal.mlkit_vision_barcode;

import ch.qos.logback.core.CoreConstants;

/* JADX INFO: loaded from: classes.dex */
final class zzfb implements zzfg {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final int f41390zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final zzff f41391zzb;

    public zzfb(int i, zzff zzffVar) {
        this.f41390zza = i;
        this.f41391zzb = zzffVar;
    }

    @Override // java.lang.annotation.Annotation
    public final Class annotationType() {
        return zzfg.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof zzfg)) {
            return false;
        }
        zzfg zzfgVar = (zzfg) obj2;
        return this.f41390zza == zzfgVar.zza() && this.f41391zzb.equals(zzfgVar.zzb());
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return (this.f41390zza ^ 14552422) + (this.f41391zzb.hashCode() ^ 2041407134);
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f41390zza + "intEncoding=" + this.f41391zzb + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzfg
    public final int zza() {
        return this.f41390zza;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzfg
    public final zzff zzb() {
        return this.f41391zzb;
    }
}
