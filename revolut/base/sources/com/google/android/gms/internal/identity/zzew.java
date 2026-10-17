package com.google.android.gms.internal.identity;

/* JADX INFO: loaded from: classes16.dex */
final class zzew extends zzex {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final transient int f39760zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final transient int f39761zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    final /* synthetic */ zzex f39762zzc;

    public zzew(zzex zzexVar, int i, int i2) {
        this.f39762zzc = zzexVar;
        this.f39760zza = i;
        this.f39761zzb = i2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        zzer.zzc(i, this.f39761zzb, "index");
        return this.f39762zzc.get(i + this.f39760zza);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f39761zzb;
    }

    @Override // com.google.android.gms.internal.identity.zzeu
    public final Object[] zzb() {
        return this.f39762zzc.zzb();
    }

    @Override // com.google.android.gms.internal.identity.zzeu
    public final int zzc() {
        return this.f39762zzc.zzc() + this.f39760zza;
    }

    @Override // com.google.android.gms.internal.identity.zzeu
    public final int zzd() {
        return this.f39762zzc.zzc() + this.f39760zza + this.f39761zzb;
    }

    @Override // com.google.android.gms.internal.identity.zzeu
    public final boolean zzf() {
        return true;
    }

    @Override // com.google.android.gms.internal.identity.zzex, java.util.List
    /* JADX INFO: renamed from: zzh, reason: merged with bridge method [inline-methods] */
    public final zzex subList(int i, int i2) {
        zzer.zze(i, i2, this.f39761zzb);
        int i3 = this.f39760zza;
        return this.f39762zzc.subList(i + i3, i2 + i3);
    }
}
