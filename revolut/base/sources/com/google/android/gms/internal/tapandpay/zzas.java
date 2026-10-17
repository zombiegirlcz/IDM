package com.google.android.gms.internal.tapandpay;

/* JADX INFO: loaded from: classes16.dex */
final class zzas extends zzat {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final transient int f46310zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final transient int f46311zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    final /* synthetic */ zzat f46312zzc;

    public zzas(zzat zzatVar, int i, int i2) {
        this.f46312zzc = zzatVar;
        this.f46310zza = i;
        this.f46311zzb = i2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        zzam.zza(i, this.f46311zzb, "index");
        return this.f46312zzc.get(i + this.f46310zza);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f46311zzb;
    }

    @Override // com.google.android.gms.internal.tapandpay.zzaq
    public final int zzb() {
        return this.f46312zzc.zzc() + this.f46310zza + this.f46311zzb;
    }

    @Override // com.google.android.gms.internal.tapandpay.zzaq
    public final int zzc() {
        return this.f46312zzc.zzc() + this.f46310zza;
    }

    @Override // com.google.android.gms.internal.tapandpay.zzaq
    public final Object[] zze() {
        return this.f46312zzc.zze();
    }

    @Override // com.google.android.gms.internal.tapandpay.zzat, java.util.List
    /* JADX INFO: renamed from: zzf, reason: merged with bridge method [inline-methods] */
    public final zzat subList(int i, int i2) {
        zzam.zzc(i, i2, this.f46311zzb);
        zzat zzatVar = this.f46312zzc;
        int i3 = this.f46310zza;
        return zzatVar.subList(i + i3, i2 + i3);
    }
}
