package com.google.android.gms.internal.mlkit_vision_text_common;

import com.google.android.gms.common.internal.Objects;

/* JADX INFO: loaded from: classes16.dex */
public final class zzes {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final zzou f44557zza;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private final Boolean f44559zzc;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    private final zzsd f44561zze;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final Boolean f44558zzb = null;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private final zzod f44560zzd = null;

    public /* synthetic */ zzes(zzeq zzeqVar, zzer zzerVar) {
        this.f44557zza = zzeqVar.f44554zza;
        this.f44559zzc = zzeqVar.f44555zzb;
        this.f44561zze = zzeqVar.f44556zzc;
    }

    public final boolean equals(Object obj2) {
        if (obj2 == this) {
            return true;
        }
        if (!(obj2 instanceof zzes)) {
            return false;
        }
        zzes zzesVar = (zzes) obj2;
        return Objects.equal(this.f44557zza, zzesVar.f44557zza) && Objects.equal(null, null) && Objects.equal(this.f44559zzc, zzesVar.f44559zzc) && Objects.equal(null, null) && Objects.equal(this.f44561zze, zzesVar.f44561zze);
    }

    public final int hashCode() {
        return Objects.hashCode(this.f44557zza, null, this.f44559zzc, null, this.f44561zze);
    }

    @zzcx(zza = 1)
    public final zzou zza() {
        return this.f44557zza;
    }

    @zzcx(zza = 5)
    public final zzsd zzb() {
        return this.f44561zze;
    }

    @zzcx(zza = 3)
    public final Boolean zzc() {
        return this.f44559zzc;
    }
}
