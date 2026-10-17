package com.google.android.gms.internal.nearby;

import com.google.android.gms.common.internal.Objects;

/* JADX INFO: loaded from: classes16.dex */
final class zzgu {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final String f45208zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final long f45209zzb;

    public zzgu(String str, long j2) {
        this.f45208zza = str;
        this.f45209zzb = j2;
    }

    public final boolean equals(Object obj2) {
        if (obj2 == null) {
            return false;
        }
        if (this == obj2) {
            return true;
        }
        if (obj2 instanceof zzgu) {
            zzgu zzguVar = (zzgu) obj2;
            if (Objects.equal(this.f45208zza, zzguVar.f45208zza)) {
                if (Objects.equal(Long.valueOf(this.f45209zzb), Long.valueOf(zzguVar.f45209zzb))) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f45208zza, Long.valueOf(this.f45209zzb));
    }

    public final String zza() {
        return this.f45208zza;
    }
}
