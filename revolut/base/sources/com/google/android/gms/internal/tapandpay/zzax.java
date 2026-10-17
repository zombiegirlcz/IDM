package com.google.android.gms.internal.tapandpay;

/* JADX INFO: loaded from: classes16.dex */
final class zzax extends zzat {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    static final zzat f46318zza = new zzax(new Object[0], 0);

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final transient Object[] f46319zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private final transient int f46320zzc;

    public zzax(Object[] objArr, int i) {
        this.f46319zzb = objArr;
        this.f46320zzc = i;
    }

    @Override // java.util.List
    public final Object get(int i) {
        zzam.zza(i, this.f46320zzc, "index");
        Object obj2 = this.f46319zzb[i];
        obj2.getClass();
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f46320zzc;
    }

    @Override // com.google.android.gms.internal.tapandpay.zzat, com.google.android.gms.internal.tapandpay.zzaq
    public final int zza(Object[] objArr, int i) {
        System.arraycopy(this.f46319zzb, 0, objArr, 0, this.f46320zzc);
        return this.f46320zzc;
    }

    @Override // com.google.android.gms.internal.tapandpay.zzaq
    public final int zzb() {
        return this.f46320zzc;
    }

    @Override // com.google.android.gms.internal.tapandpay.zzaq
    public final int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.tapandpay.zzaq
    public final Object[] zze() {
        return this.f46319zzb;
    }
}
