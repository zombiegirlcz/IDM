package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes16.dex */
final class zzpp implements Runnable {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ String f47668zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final /* synthetic */ String f47669zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    final /* synthetic */ Bundle f47670zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    final /* synthetic */ zzpq f47671zzd;

    public zzpp(zzpq zzpqVar, String str, String str2, Bundle bundle) {
        this.f47668zza = str;
        this.f47669zzb = str2;
        this.f47670zzc = bundle;
        this.f47671zzd = zzpqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzpv zzpvVar = this.f47671zzd.f47672zza;
        zzqf zzqfVarZzB = zzpvVar.zzB();
        long jCurrentTimeMillis = zzpvVar.zzaU().currentTimeMillis();
        String str = this.f47668zza;
        zzpvVar.zzT((zzbh) Preconditions.checkNotNull(zzqfVarZzB.zzC(str, this.f47669zzb, this.f47670zzc, "auto", jCurrentTimeMillis, false, true)), str);
    }
}
