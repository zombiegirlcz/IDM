package com.google.android.gms.internal.mlkit_vision_text_common;

import com.google.android.gms.common.internal.Objects;

/* JADX INFO: loaded from: classes16.dex */
public final class zzsd {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final zzsb f44949zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final Boolean f44950zzb = null;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private final String f44951zzc = null;

    public /* synthetic */ zzsd(zzsa zzsaVar, zzsc zzscVar) {
        this.f44949zza = zzsaVar.f44937zza;
    }

    public final boolean equals(Object obj2) {
        if (obj2 == this) {
            return true;
        }
        return (obj2 instanceof zzsd) && Objects.equal(this.f44949zza, ((zzsd) obj2).f44949zza) && Objects.equal(null, null) && Objects.equal(null, null);
    }

    public final int hashCode() {
        return Objects.hashCode(this.f44949zza, null, null);
    }

    @zzcx(zza = 3)
    public final zzsb zza() {
        return this.f44949zza;
    }
}
