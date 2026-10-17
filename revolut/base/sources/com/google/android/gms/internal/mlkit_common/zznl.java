package com.google.android.gms.internal.mlkit_common;

import com.google.android.gms.common.internal.Objects;

/* JADX INFO: loaded from: classes16.dex */
public final class zznl {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final zznh f41144zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final zznj f41145zzb = null;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private final zznj f41146zzc = null;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private final Boolean f41147zzd = null;

    public /* synthetic */ zznl(zzni zzniVar, zznk zznkVar) {
        this.f41144zza = zzniVar.f41143zza;
    }

    public final boolean equals(Object obj2) {
        if (obj2 == this) {
            return true;
        }
        return (obj2 instanceof zznl) && Objects.equal(this.f41144zza, ((zznl) obj2).f41144zza) && Objects.equal(null, null) && Objects.equal(null, null) && Objects.equal(null, null);
    }

    public final int hashCode() {
        return Objects.hashCode(this.f41144zza, null, null, null);
    }

    @zzbc(zza = 1)
    public final zznh zza() {
        return this.f41144zza;
    }
}
