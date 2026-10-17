package com.google.android.gms.internal.mlkit_common;

import com.google.android.gms.common.internal.Objects;

/* JADX INFO: loaded from: classes16.dex */
public final class zznh {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final String f41134zza;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private final zznf f41136zzc;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    private final String f41138zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    private final zzne f41139zzf;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final String f41135zzb = null;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private final String f41137zzd = null;

    /* JADX INFO: renamed from: zzg, reason: collision with root package name */
    private final Long f41140zzg = null;

    /* JADX INFO: renamed from: zzh, reason: collision with root package name */
    private final Boolean f41141zzh = null;

    /* JADX INFO: renamed from: zzi, reason: collision with root package name */
    private final Boolean f41142zzi = null;

    public /* synthetic */ zznh(zznd zzndVar, zzng zzngVar) {
        this.f41134zza = zzndVar.f41110zza;
        this.f41136zzc = zzndVar.f41111zzb;
        this.f41138zze = zzndVar.f41112zzc;
        this.f41139zzf = zzndVar.f41113zzd;
    }

    public final boolean equals(Object obj2) {
        if (obj2 == this) {
            return true;
        }
        if (!(obj2 instanceof zznh)) {
            return false;
        }
        zznh zznhVar = (zznh) obj2;
        return Objects.equal(this.f41134zza, zznhVar.f41134zza) && Objects.equal(null, null) && Objects.equal(this.f41136zzc, zznhVar.f41136zzc) && Objects.equal(null, null) && Objects.equal(this.f41138zze, zznhVar.f41138zze) && Objects.equal(this.f41139zzf, zznhVar.f41139zzf) && Objects.equal(null, null) && Objects.equal(null, null) && Objects.equal(null, null);
    }

    public final int hashCode() {
        return Objects.hashCode(this.f41134zza, null, this.f41136zzc, null, this.f41138zze, this.f41139zzf, null, null, null);
    }

    @zzbc(zza = 6)
    public final zzne zza() {
        return this.f41139zzf;
    }

    @zzbc(zza = 3)
    public final zznf zzb() {
        return this.f41136zzc;
    }

    @zzbc(zza = 5)
    public final String zzc() {
        return this.f41138zze;
    }

    @zzbc(zza = 1)
    public final String zzd() {
        return this.f41134zza;
    }
}
