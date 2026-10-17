package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes16.dex */
final class zzbd {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final String f46937zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final String f46938zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    final long f46939zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    final long f46940zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    final long f46941zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    final long f46942zzf;

    /* JADX INFO: renamed from: zzg, reason: collision with root package name */
    final long f46943zzg;

    /* JADX INFO: renamed from: zzh, reason: collision with root package name */
    final Long f46944zzh;

    /* JADX INFO: renamed from: zzi, reason: collision with root package name */
    final Long f46945zzi;

    /* JADX INFO: renamed from: zzj, reason: collision with root package name */
    final Long f46946zzj;

    /* JADX INFO: renamed from: zzk, reason: collision with root package name */
    final Boolean f46947zzk;

    public zzbd(String str, String str2, long j2, long j3, long j5, long j16, long j22, Long l2, Long l3, Long l4, Boolean bool) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        Preconditions.checkArgument(j2 >= 0);
        Preconditions.checkArgument(j3 >= 0);
        Preconditions.checkArgument(j5 >= 0);
        Preconditions.checkArgument(j22 >= 0);
        this.f46937zza = str;
        this.f46938zzb = str2;
        this.f46939zzc = j2;
        this.f46940zzd = j3;
        this.f46941zze = j5;
        this.f46942zzf = j16;
        this.f46943zzg = j22;
        this.f46944zzh = l2;
        this.f46945zzi = l3;
        this.f46946zzj = l4;
        this.f46947zzk = bool;
    }

    public final zzbd zza(Long l2, Long l3, Boolean bool) {
        return new zzbd(this.f46937zza, this.f46938zzb, this.f46939zzc, this.f46940zzd, this.f46941zze, this.f46942zzf, this.f46943zzg, this.f46944zzh, l2, l3, bool);
    }

    public final zzbd zzb(long j2, long j3) {
        return new zzbd(this.f46937zza, this.f46938zzb, this.f46939zzc, this.f46940zzd, this.f46941zze, this.f46942zzf, j2, Long.valueOf(j3), this.f46945zzi, this.f46946zzj, this.f46947zzk);
    }

    public final zzbd zzc(long j2) {
        return new zzbd(this.f46937zza, this.f46938zzb, this.f46939zzc, this.f46940zzd, this.f46941zze, j2, this.f46943zzg, this.f46944zzh, this.f46945zzi, this.f46946zzj, this.f46947zzk);
    }
}
