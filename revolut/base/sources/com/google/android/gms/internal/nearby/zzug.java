package com.google.android.gms.internal.nearby;

import java.util.Iterator;

/* JADX INFO: loaded from: classes16.dex */
final class zzug extends zzuc {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    static final zzug f45745zza;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private static final Object[] f45746zzd;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final transient Object[] f45747zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    final transient Object[] f45748zzc;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    private final transient int f45749zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    private final transient int f45750zzf;

    /* JADX INFO: renamed from: zzg, reason: collision with root package name */
    private final transient int f45751zzg;

    static {
        Object[] objArr = new Object[0];
        f45746zzd = objArr;
        f45745zza = new zzug(objArr, 0, objArr, 0, 0);
    }

    public zzug(Object[] objArr, int i, Object[] objArr2, int i2, int i3) {
        this.f45747zzb = objArr;
        this.f45749zze = i;
        this.f45748zzc = objArr2;
        this.f45750zzf = i2;
        this.f45751zzg = i3;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj2) {
        if (obj2 != null) {
            Object[] objArr = this.f45748zzc;
            if (objArr.length != 0) {
                int iZza = zztu.zza(obj2.hashCode());
                while (true) {
                    int i = iZza & this.f45750zzf;
                    Object obj3 = objArr[i];
                    if (obj3 == null) {
                        return false;
                    }
                    if (obj3.equals(obj2)) {
                        return true;
                    }
                    iZza = i + 1;
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.nearby.zzuc, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f45749zze;
    }

    @Override // com.google.android.gms.internal.nearby.zzuc, com.google.android.gms.internal.nearby.zztx, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return zzd().listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f45751zzg;
    }

    @Override // com.google.android.gms.internal.nearby.zztx
    public final int zza(Object[] objArr, int i) {
        System.arraycopy(this.f45747zzb, 0, objArr, 0, this.f45751zzg);
        return this.f45751zzg;
    }

    @Override // com.google.android.gms.internal.nearby.zztx
    public final int zzb() {
        return this.f45751zzg;
    }

    @Override // com.google.android.gms.internal.nearby.zztx
    public final int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.nearby.zzuc, com.google.android.gms.internal.nearby.zztx
    /* JADX INFO: renamed from: zze */
    public final zzui iterator() {
        return zzd().listIterator(0);
    }

    @Override // com.google.android.gms.internal.nearby.zztx
    public final boolean zzf() {
        throw null;
    }

    @Override // com.google.android.gms.internal.nearby.zztx
    public final Object[] zzg() {
        return this.f45747zzb;
    }

    @Override // com.google.android.gms.internal.nearby.zzuc
    public final zzua zzi() {
        return zzua.zzi(this.f45747zzb, this.f45751zzg);
    }

    @Override // com.google.android.gms.internal.nearby.zzuc
    public final boolean zzk() {
        return true;
    }
}
