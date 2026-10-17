package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes16.dex */
final class zzlr implements Runnable {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ zzjx f47381zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final /* synthetic */ long f47382zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    final /* synthetic */ boolean f47383zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    final /* synthetic */ zzlw f47384zzd;

    public zzlr(zzlw zzlwVar, zzjx zzjxVar, long j2, boolean z) {
        this.f47381zza = zzjxVar;
        this.f47382zzb = j2;
        this.f47383zzc = z;
        this.f47384zzd = zzlwVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzlw zzlwVar = this.f47384zzd;
        zzjx zzjxVar = this.f47381zza;
        zzlwVar.zzaj(zzjxVar);
        zzlw.zzD(zzlwVar, zzjxVar, this.f47382zzb, true, this.f47383zzc);
    }
}
