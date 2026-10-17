package com.google.android.gms.internal.play_billing;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes16.dex */
final class zzj extends zzd {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final AtomicReferenceFieldUpdater f46167zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final AtomicReferenceFieldUpdater f46168zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    final AtomicReferenceFieldUpdater f46169zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    final AtomicReferenceFieldUpdater f46170zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    final AtomicReferenceFieldUpdater f46171zze;

    public zzj(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        super(null);
        this.f46167zza = atomicReferenceFieldUpdater;
        this.f46168zzb = atomicReferenceFieldUpdater2;
        this.f46169zzc = atomicReferenceFieldUpdater3;
        this.f46170zzd = atomicReferenceFieldUpdater4;
        this.f46171zze = atomicReferenceFieldUpdater5;
    }

    @Override // com.google.android.gms.internal.play_billing.zzd
    public final void zza(zzm zzmVar, zzm zzmVar2) {
        this.f46168zzb.lazySet(zzmVar, zzmVar2);
    }

    @Override // com.google.android.gms.internal.play_billing.zzd
    public final void zzb(zzm zzmVar, Thread thread) {
        this.f46167zza.lazySet(zzmVar, thread);
    }

    @Override // com.google.android.gms.internal.play_billing.zzd
    public final boolean zzc(zzo zzoVar, zzh zzhVar, zzh zzhVar2) {
        return zzi.zza(this.f46170zzd, zzoVar, zzhVar, zzhVar2);
    }

    @Override // com.google.android.gms.internal.play_billing.zzd
    public final boolean zzd(zzo zzoVar, Object obj2, Object obj3) {
        return zzi.zza(this.f46171zze, zzoVar, obj2, obj3);
    }

    @Override // com.google.android.gms.internal.play_billing.zzd
    public final boolean zze(zzo zzoVar, zzm zzmVar, zzm zzmVar2) {
        return zzi.zza(this.f46169zzc, zzoVar, zzmVar, zzmVar2);
    }
}
