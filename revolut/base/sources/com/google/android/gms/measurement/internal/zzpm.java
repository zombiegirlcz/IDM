package com.google.android.gms.measurement.internal;

import java.util.Map;

/* JADX INFO: loaded from: classes16.dex */
final class zzpm implements zzhg {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ String f47662zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final /* synthetic */ zzpz f47663zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    final /* synthetic */ zzpv f47664zzc;

    public zzpm(zzpv zzpvVar, String str, zzpz zzpzVar) {
        this.f47662zza = str;
        this.f47663zzb = zzpzVar;
        this.f47664zzc = zzpvVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzhg
    public final void zza(String str, int i, Throwable th10, byte[] bArr, Map map) {
        this.f47664zzc.zzZ(this.f47662zza, i, th10, bArr, this.f47663zzb);
    }
}
