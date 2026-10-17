package com.google.android.gms.internal.mlkit_vision_barcode;

import com.google.android.gms.common.internal.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class zzos {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final zzoq f42256zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final Integer f42257zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private final Integer f42258zzc = null;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private final Boolean f42259zzd = null;

    public /* synthetic */ zzos(zzop zzopVar, zzor zzorVar) {
        this.f42256zza = zzopVar.f42242zza;
        this.f42257zzb = zzopVar.f42243zzb;
    }

    public final boolean equals(Object obj2) {
        if (obj2 == this) {
            return true;
        }
        if (!(obj2 instanceof zzos)) {
            return false;
        }
        zzos zzosVar = (zzos) obj2;
        return Objects.equal(this.f42256zza, zzosVar.f42256zza) && Objects.equal(this.f42257zzb, zzosVar.f42257zzb) && Objects.equal(null, null) && Objects.equal(null, null);
    }

    public final int hashCode() {
        return Objects.hashCode(this.f42256zza, this.f42257zzb, null, null);
    }

    @zzfg(zza = 1)
    public final zzoq zza() {
        return this.f42256zza;
    }

    @zzfg(zza = 2)
    public final Integer zzb() {
        return this.f42257zzb;
    }
}
