package com.google.android.gms.internal.nearby;

/* JADX INFO: loaded from: classes16.dex */
final class zzuf extends zzua {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    static final zzua f45742zza = new zzuf(new Object[0], 0);

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final transient Object[] f45743zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private final transient int f45744zzc;

    public zzuf(Object[] objArr, int i) {
        this.f45743zzb = objArr;
        this.f45744zzc = i;
    }

    @Override // java.util.List
    public final Object get(int i) {
        zztq.zza(i, this.f45744zzc, "index");
        Object obj2 = this.f45743zzb[i];
        obj2.getClass();
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f45744zzc;
    }

    @Override // com.google.android.gms.internal.nearby.zzua, com.google.android.gms.internal.nearby.zztx
    public final int zza(Object[] objArr, int i) {
        System.arraycopy(this.f45743zzb, 0, objArr, 0, this.f45744zzc);
        return this.f45744zzc;
    }

    @Override // com.google.android.gms.internal.nearby.zztx
    public final int zzb() {
        return this.f45744zzc;
    }

    @Override // com.google.android.gms.internal.nearby.zztx
    public final int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.nearby.zztx
    public final boolean zzf() {
        return false;
    }

    @Override // com.google.android.gms.internal.nearby.zztx
    public final Object[] zzg() {
        return this.f45743zzb;
    }
}
