package com.google.android.gms.internal.maps;

/* JADX INFO: loaded from: classes16.dex */
final class zzbc extends zzaz {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    static final zzaz f39794zza = new zzbc(new Object[0], 0);

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final transient Object[] f39795zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private final transient int f39796zzc;

    public zzbc(Object[] objArr, int i) {
        this.f39795zzb = objArr;
        this.f39796zzc = i;
    }

    @Override // java.util.List
    public final Object get(int i) {
        zzas.zza(i, this.f39796zzc, "index");
        Object obj2 = this.f39795zzb[i];
        obj2.getClass();
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f39796zzc;
    }

    @Override // com.google.android.gms.internal.maps.zzaz, com.google.android.gms.internal.maps.zzaw
    public final int zza(Object[] objArr, int i) {
        System.arraycopy(this.f39795zzb, 0, objArr, 0, this.f39796zzc);
        return this.f39796zzc;
    }

    @Override // com.google.android.gms.internal.maps.zzaw
    public final int zzb() {
        return this.f39796zzc;
    }

    @Override // com.google.android.gms.internal.maps.zzaw
    public final int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.maps.zzaw
    public final Object[] zze() {
        return this.f39795zzb;
    }
}
