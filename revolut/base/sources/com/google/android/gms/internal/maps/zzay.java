package com.google.android.gms.internal.maps;

/* JADX INFO: loaded from: classes16.dex */
final class zzay extends zzaz {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final transient int f39786zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final transient int f39787zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    final /* synthetic */ zzaz f39788zzc;

    public zzay(zzaz zzazVar, int i, int i2) {
        this.f39788zzc = zzazVar;
        this.f39786zza = i;
        this.f39787zzb = i2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        zzas.zza(i, this.f39787zzb, "index");
        return this.f39788zzc.get(i + this.f39786zza);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f39787zzb;
    }

    @Override // com.google.android.gms.internal.maps.zzaw
    public final int zzb() {
        return this.f39788zzc.zzc() + this.f39786zza + this.f39787zzb;
    }

    @Override // com.google.android.gms.internal.maps.zzaw
    public final int zzc() {
        return this.f39788zzc.zzc() + this.f39786zza;
    }

    @Override // com.google.android.gms.internal.maps.zzaw
    public final Object[] zze() {
        return this.f39788zzc.zze();
    }

    @Override // com.google.android.gms.internal.maps.zzaz, java.util.List
    /* JADX INFO: renamed from: zzf, reason: merged with bridge method [inline-methods] */
    public final zzaz subList(int i, int i2) {
        zzas.zzc(i, i2, this.f39787zzb);
        int i3 = this.f39786zza;
        return this.f39788zzc.subList(i + i3, i2 + i3);
    }
}
