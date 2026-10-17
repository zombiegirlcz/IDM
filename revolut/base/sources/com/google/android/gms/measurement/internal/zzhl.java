package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes16.dex */
final class zzhl implements Runnable {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ boolean f47062zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final /* synthetic */ zzhm f47063zzb;

    public zzhl(zzhm zzhmVar, boolean z) {
        this.f47062zza = z;
        this.f47063zzb = zzhmVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f47063zzb.f47064zza.zzX(this.f47062zza);
    }
}
