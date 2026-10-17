package com.google.android.gms.internal.mlkit_vision_face;

import com.google.android.gms.common.internal.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class zzkd {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final zzka f44225zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final zzjy f44226zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private final zzkb f44227zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private final zzjz f44228zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    private final Boolean f44229zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    private final Float f44230zzf;

    public /* synthetic */ zzkd(zzjx zzjxVar, zzkc zzkcVar) {
        this.f44225zza = zzjxVar.f44199zza;
        this.f44226zzb = zzjxVar.f44200zzb;
        this.f44227zzc = zzjxVar.f44201zzc;
        this.f44228zzd = zzjxVar.f44202zzd;
        this.f44229zze = zzjxVar.f44203zze;
        this.f44230zzf = zzjxVar.f44204zzf;
    }

    public final boolean equals(Object obj2) {
        if (obj2 == this) {
            return true;
        }
        if (!(obj2 instanceof zzkd)) {
            return false;
        }
        zzkd zzkdVar = (zzkd) obj2;
        return Objects.equal(this.f44225zza, zzkdVar.f44225zza) && Objects.equal(this.f44226zzb, zzkdVar.f44226zzb) && Objects.equal(this.f44227zzc, zzkdVar.f44227zzc) && Objects.equal(this.f44228zzd, zzkdVar.f44228zzd) && Objects.equal(this.f44229zze, zzkdVar.f44229zze) && Objects.equal(this.f44230zzf, zzkdVar.f44230zzf);
    }

    public final int hashCode() {
        return Objects.hashCode(this.f44225zza, this.f44226zzb, this.f44227zzc, this.f44228zzd, this.f44229zze, this.f44230zzf);
    }

    @zzcu(zza = 2)
    public final zzjy zza() {
        return this.f44226zzb;
    }

    @zzcu(zza = 4)
    public final zzjz zzb() {
        return this.f44228zzd;
    }

    @zzcu(zza = 1)
    public final zzka zzc() {
        return this.f44225zza;
    }

    @zzcu(zza = 3)
    public final zzkb zzd() {
        return this.f44227zzc;
    }

    @zzcu(zza = 5)
    public final Boolean zze() {
        return this.f44229zze;
    }

    @zzcu(zza = 6)
    public final Float zzf() {
        return this.f44230zzf;
    }
}
