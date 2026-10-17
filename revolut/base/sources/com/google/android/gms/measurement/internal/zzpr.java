package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
final class zzpr {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    com.google.android.gms.internal.measurement.zzhx f47673zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    List f47674zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    List f47675zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    long f47676zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    final /* synthetic */ zzpv f47677zze;

    public /* synthetic */ zzpr(zzpv zzpvVar, zzpu zzpuVar) {
        this.f47677zze = zzpvVar;
    }

    private static final long zzb(com.google.android.gms.internal.measurement.zzhm zzhmVar) {
        return ((zzhmVar.zzd() / 1000) / 60) / 60;
    }

    public final boolean zza(long j2, com.google.android.gms.internal.measurement.zzhm zzhmVar) {
        Preconditions.checkNotNull(zzhmVar);
        if (this.f47675zzc == null) {
            this.f47675zzc = new ArrayList();
        }
        if (this.f47674zzb == null) {
            this.f47674zzb = new ArrayList();
        }
        if (!this.f47675zzc.isEmpty() && zzb((com.google.android.gms.internal.measurement.zzhm) this.f47675zzc.get(0)) != zzb(zzhmVar)) {
            return false;
        }
        long jZzcf = this.f47676zzd + ((long) zzhmVar.zzcf());
        zzpv zzpvVar = this.f47677zze;
        if (!zzpvVar.zzi().zzx(null, zzgi.zzbq)) {
            zzpvVar.zzi();
            if (jZzcf >= zzam.zzG()) {
                return false;
            }
        } else if (!this.f47675zzc.isEmpty()) {
            zzpvVar.zzi();
            if (jZzcf >= zzam.zzG()) {
                return false;
            }
        }
        this.f47676zzd = jZzcf;
        this.f47675zzc.add(zzhmVar);
        this.f47674zzb.add(Long.valueOf(j2));
        int size = this.f47675zzc.size();
        zzpvVar.zzi();
        return size < Math.max(1, ((Integer) zzgi.f46979zzj.zza(null)).intValue());
    }
}
