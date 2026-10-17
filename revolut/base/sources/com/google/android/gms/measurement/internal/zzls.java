package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes16.dex */
final class zzls implements Runnable {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ zzjx f47385zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final /* synthetic */ long f47386zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    final /* synthetic */ boolean f47387zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    final /* synthetic */ zzlw f47388zzd;

    public zzls(zzlw zzlwVar, zzjx zzjxVar, long j2, boolean z) {
        this.f47385zza = zzjxVar;
        this.f47386zzb = j2;
        this.f47387zzc = z;
        this.f47388zzd = zzlwVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzlw zzlwVar = this.f47388zzd;
        zzjx zzjxVar = this.f47385zza;
        zzlwVar.zzaj(zzjxVar);
        zzlw.zzD(zzlwVar, zzjxVar, this.f47386zzb, false, this.f47387zzc);
    }
}
