package com.google.android.gms.internal.mlkit_vision_text_common;

import com.google.android.gms.common.internal.Objects;

/* JADX INFO: loaded from: classes16.dex */
public final class zzod {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final zzob f44865zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final Integer f44866zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private final Integer f44867zzc = null;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private final Boolean f44868zzd = null;

    public /* synthetic */ zzod(zzoa zzoaVar, zzoc zzocVar) {
        this.f44865zza = zzoaVar.f44851zza;
        this.f44866zzb = zzoaVar.f44852zzb;
    }

    public final boolean equals(Object obj2) {
        if (obj2 == this) {
            return true;
        }
        if (!(obj2 instanceof zzod)) {
            return false;
        }
        zzod zzodVar = (zzod) obj2;
        return Objects.equal(this.f44865zza, zzodVar.f44865zza) && Objects.equal(this.f44866zzb, zzodVar.f44866zzb) && Objects.equal(null, null) && Objects.equal(null, null);
    }

    public final int hashCode() {
        return Objects.hashCode(this.f44865zza, this.f44866zzb, null, null);
    }

    @zzcx(zza = 1)
    public final zzob zza() {
        return this.f44865zza;
    }

    @zzcx(zza = 2)
    public final Integer zzb() {
        return this.f44866zzb;
    }
}
