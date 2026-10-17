package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes16.dex */
final class zzpl implements zzhg {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ String f47659zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final /* synthetic */ List f47660zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    final /* synthetic */ zzpv f47661zzc;

    public zzpl(zzpv zzpvVar, String str, List list) {
        this.f47659zza = str;
        this.f47660zzb = list;
        this.f47661zzc = zzpvVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzhg
    public final void zza(String str, int i, Throwable th10, byte[] bArr, Map map) {
        this.f47661zzc.zzY(true, i, th10, bArr, this.f47659zza, this.f47660zzb);
    }
}
