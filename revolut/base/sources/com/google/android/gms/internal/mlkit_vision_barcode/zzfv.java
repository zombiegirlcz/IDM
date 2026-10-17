package com.google.android.gms.internal.mlkit_vision_barcode;

import com.google.android.gms.common.internal.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class zzfv {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final zzpj f41430zza;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private final Boolean f41432zzc;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    private final zzth f41434zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    private final zzcv f41435zzf;

    /* JADX INFO: renamed from: zzg, reason: collision with root package name */
    private final zzcv f41436zzg;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final Boolean f41431zzb = null;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private final zzos f41433zzd = null;

    public /* synthetic */ zzfv(zzft zzftVar, zzfu zzfuVar) {
        this.f41430zza = zzftVar.f41425zza;
        this.f41432zzc = zzftVar.f41426zzb;
        this.f41434zze = zzftVar.f41427zzc;
        this.f41435zzf = zzftVar.f41428zzd;
        this.f41436zzg = zzftVar.f41429zze;
    }

    public final boolean equals(Object obj2) {
        if (obj2 == this) {
            return true;
        }
        if (!(obj2 instanceof zzfv)) {
            return false;
        }
        zzfv zzfvVar = (zzfv) obj2;
        return Objects.equal(this.f41430zza, zzfvVar.f41430zza) && Objects.equal(null, null) && Objects.equal(this.f41432zzc, zzfvVar.f41432zzc) && Objects.equal(null, null) && Objects.equal(this.f41434zze, zzfvVar.f41434zze) && Objects.equal(this.f41435zzf, zzfvVar.f41435zzf) && Objects.equal(this.f41436zzg, zzfvVar.f41436zzg);
    }

    public final int hashCode() {
        return Objects.hashCode(this.f41430zza, null, this.f41432zzc, null, this.f41434zze, this.f41435zzf, this.f41436zzg);
    }

    @zzfg(zza = 6)
    public final zzcv zza() {
        return this.f41435zzf;
    }

    @zzfg(zza = 7)
    public final zzcv zzb() {
        return this.f41436zzg;
    }

    @zzfg(zza = 1)
    public final zzpj zzc() {
        return this.f41430zza;
    }

    @zzfg(zza = 5)
    public final zzth zzd() {
        return this.f41434zze;
    }

    @zzfg(zza = 3)
    public final Boolean zze() {
        return this.f41432zzc;
    }
}
