package com.google.android.gms.internal.mlkit_vision_face;

import com.google.android.gms.common.internal.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class zzdn {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final zzks f43579zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final Boolean f43580zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private final zzkh f43581zzc = null;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private final zzkd f43582zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    private final Integer f43583zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    private final Integer f43584zzf;

    public /* synthetic */ zzdn(zzdl zzdlVar, zzdm zzdmVar) {
        this.f43579zza = zzdlVar.f43574zza;
        this.f43580zzb = zzdlVar.f43575zzb;
        this.f43582zzd = zzdlVar.f43576zzc;
        this.f43583zze = zzdlVar.f43577zzd;
        this.f43584zzf = zzdlVar.f43578zze;
    }

    public final boolean equals(Object obj2) {
        if (obj2 == this) {
            return true;
        }
        if (!(obj2 instanceof zzdn)) {
            return false;
        }
        zzdn zzdnVar = (zzdn) obj2;
        return Objects.equal(this.f43579zza, zzdnVar.f43579zza) && Objects.equal(this.f43580zzb, zzdnVar.f43580zzb) && Objects.equal(null, null) && Objects.equal(this.f43582zzd, zzdnVar.f43582zzd) && Objects.equal(this.f43583zze, zzdnVar.f43583zze) && Objects.equal(this.f43584zzf, zzdnVar.f43584zzf);
    }

    public final int hashCode() {
        return Objects.hashCode(this.f43579zza, this.f43580zzb, null, this.f43582zzd, this.f43583zze, this.f43584zzf);
    }

    @zzcu(zza = 4)
    public final zzkd zza() {
        return this.f43582zzd;
    }

    @zzcu(zza = 1)
    public final zzks zzb() {
        return this.f43579zza;
    }

    @zzcu(zza = 2)
    public final Boolean zzc() {
        return this.f43580zzb;
    }

    @zzcu(zza = 5)
    public final Integer zzd() {
        return this.f43583zze;
    }

    @zzcu(zza = 6)
    public final Integer zze() {
        return this.f43584zzf;
    }
}
