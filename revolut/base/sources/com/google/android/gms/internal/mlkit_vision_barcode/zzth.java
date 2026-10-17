package com.google.android.gms.internal.mlkit_vision_barcode;

import com.google.android.gms.common.internal.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class zzth {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final zzcv f42423zza;

    public /* synthetic */ zzth(zztf zztfVar, zztg zztgVar) {
        this.f42423zza = zztfVar.f42422zza;
    }

    public final boolean equals(Object obj2) {
        if (obj2 == this) {
            return true;
        }
        if (obj2 instanceof zzth) {
            return Objects.equal(this.f42423zza, ((zzth) obj2).f42423zza);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f42423zza);
    }

    @zzfg(zza = 1)
    public final zzcv zza() {
        return this.f42423zza;
    }
}
