package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import java.util.Map;

/* JADX INFO: loaded from: classes16.dex */
final class zzhh implements Runnable {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final zzhg f47050zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final int f47051zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private final Throwable f47052zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private final byte[] f47053zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    private final String f47054zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    private final Map f47055zzf;

    public /* synthetic */ zzhh(String str, zzhg zzhgVar, int i, Throwable th10, byte[] bArr, Map map, zzhj zzhjVar) {
        Preconditions.checkNotNull(zzhgVar);
        this.f47050zza = zzhgVar;
        this.f47051zzb = i;
        this.f47052zzc = th10;
        this.f47053zzd = bArr;
        this.f47054zze = str;
        this.f47055zzf = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f47050zza.zza(this.f47054zze, this.f47051zzb, this.f47052zzc, this.f47053zzd, this.f47055zzf);
    }
}
