package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import java.util.Map;

/* JADX INFO: loaded from: classes16.dex */
public final class zzpz {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final long f47705zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final com.google.android.gms.internal.measurement.zzhv f47706zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private final String f47707zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private final Map f47708zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    private final zzmf f47709zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    private final long f47710zzf;

    /* JADX INFO: renamed from: zzg, reason: collision with root package name */
    private final long f47711zzg;

    /* JADX INFO: renamed from: zzh, reason: collision with root package name */
    private final int f47712zzh;

    public /* synthetic */ zzpz(long j2, com.google.android.gms.internal.measurement.zzhv zzhvVar, String str, Map map, zzmf zzmfVar, long j3, long j5, long j16, int i, zzpy zzpyVar) {
        this.f47705zza = j2;
        this.f47706zzb = zzhvVar;
        this.f47707zzc = str;
        this.f47708zzd = map;
        this.f47709zze = zzmfVar;
        this.f47710zzf = j5;
        this.f47711zzg = j16;
        this.f47712zzh = i;
    }

    public final int zza() {
        return this.f47712zzh;
    }

    public final long zzb() {
        return this.f47711zzg;
    }

    public final long zzc() {
        return this.f47705zza;
    }

    public final zzmf zzd() {
        return this.f47709zze;
    }

    public final zzpa zze() {
        Bundle bundle = new Bundle();
        for (Map.Entry entry : this.f47708zzd.entrySet()) {
            bundle.putString((String) entry.getKey(), (String) entry.getValue());
        }
        long j2 = this.f47705zza;
        com.google.android.gms.internal.measurement.zzhv zzhvVar = this.f47706zzb;
        String str = this.f47707zzc;
        zzmf zzmfVar = this.f47709zze;
        return new zzpa(j2, zzhvVar.zzcd(), str, bundle, zzmfVar.zza(), this.f47710zzf, "");
    }

    public final zzph zzf() {
        return new zzph(this.f47707zzc, this.f47708zzd, this.f47709zze, null);
    }

    public final com.google.android.gms.internal.measurement.zzhv zzg() {
        return this.f47706zzb;
    }

    public final String zzh() {
        return this.f47707zzc;
    }
}
