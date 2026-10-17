package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes16.dex */
final class zzpt {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final zzpv f47680zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private int f47681zzb = 1;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private long f47682zzc = zzd();

    public zzpt(zzpv zzpvVar) {
        this.f47680zza = zzpvVar;
    }

    private final long zzd() {
        zzpv zzpvVar = this.f47680zza;
        Preconditions.checkNotNull(zzpvVar);
        long jLongValue = ((Long) zzgi.zzu.zza(null)).longValue();
        long jLongValue2 = ((Long) zzgi.zzv.zza(null)).longValue();
        for (int i = 1; i < this.f47681zzb; i++) {
            jLongValue += jLongValue;
            if (jLongValue >= jLongValue2) {
                break;
            }
        }
        return Math.min(jLongValue, jLongValue2) + zzpvVar.zzaU().currentTimeMillis();
    }

    public final void zzb() {
        this.f47681zzb++;
        this.f47682zzc = zzd();
    }

    public final boolean zzc() {
        return this.f47680zza.zzaU().currentTimeMillis() >= this.f47682zzc;
    }
}
