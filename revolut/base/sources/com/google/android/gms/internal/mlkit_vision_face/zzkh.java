package com.google.android.gms.internal.mlkit_vision_face;

import com.google.android.gms.common.internal.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class zzkh {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final zzkf f44245zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final Integer f44246zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private final Integer f44247zzc = null;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private final Boolean f44248zzd = null;

    public /* synthetic */ zzkh(zzke zzkeVar, zzkg zzkgVar) {
        this.f44245zza = zzkeVar.f44231zza;
        this.f44246zzb = zzkeVar.f44232zzb;
    }

    public final boolean equals(Object obj2) {
        if (obj2 == this) {
            return true;
        }
        if (!(obj2 instanceof zzkh)) {
            return false;
        }
        zzkh zzkhVar = (zzkh) obj2;
        return Objects.equal(this.f44245zza, zzkhVar.f44245zza) && Objects.equal(this.f44246zzb, zzkhVar.f44246zzb) && Objects.equal(null, null) && Objects.equal(null, null);
    }

    public final int hashCode() {
        return Objects.hashCode(this.f44245zza, this.f44246zzb, null, null);
    }

    @zzcu(zza = 1)
    public final zzkf zza() {
        return this.f44245zza;
    }

    @zzcu(zza = 2)
    public final Integer zzb() {
        return this.f44246zzb;
    }
}
