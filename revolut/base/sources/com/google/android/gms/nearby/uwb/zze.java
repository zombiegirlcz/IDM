package com.google.android.gms.nearby.uwb;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ShowFirstParty;

/* JADX INFO: loaded from: classes16.dex */
@ShowFirstParty
public final class zze implements Api.ApiOptions.HasOptions {

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final int f48261zzb;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private final int f48263zzd;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private final boolean f48262zzc = false;

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final String f48260zza = null;

    public /* synthetic */ zze(int i, boolean z, String str, int i2, zzd zzdVar) {
        this.f48261zzb = i;
        this.f48263zzd = i2;
    }

    public final boolean equals(Object obj2) {
        if (obj2 == this) {
            return true;
        }
        if (!(obj2 instanceof zze)) {
            return false;
        }
        zze zzeVar = (zze) obj2;
        return Objects.equal(Integer.valueOf(this.f48261zzb), Integer.valueOf(zzeVar.f48261zzb)) && Objects.equal(null, null) && Objects.equal(Integer.valueOf(this.f48263zzd), Integer.valueOf(zzeVar.f48263zzd));
    }

    public final int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.f48261zzb), Boolean.FALSE, null, Integer.valueOf(this.f48263zzd));
    }

    public final int zza() {
        return this.f48261zzb;
    }
}
