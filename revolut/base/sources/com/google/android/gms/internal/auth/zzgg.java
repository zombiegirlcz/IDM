package com.google.android.gms.internal.auth;

import a0.d;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes16.dex */
final class zzgg extends zzdr implements RandomAccess {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private static final zzgg f39090zza = new zzgg(new Object[0], 0, false);

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private Object[] f39091zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private int f39092zzc;

    public zzgg() {
        this(new Object[10], 0, true);
    }

    public static zzgg zze() {
        return f39090zza;
    }

    private final String zzf(int i) {
        return d.g(i, this.f39092zzc, "Index:", ", Size:");
    }

    private final void zzg(int i) {
        if (i < 0 || i >= this.f39092zzc) {
            throw new IndexOutOfBoundsException(zzf(i));
        }
    }

    @Override // com.google.android.gms.internal.auth.zzdr, java.util.AbstractList, java.util.List
    public final void add(int i, Object obj2) {
        int i2;
        zza();
        if (i < 0 || i > (i2 = this.f39092zzc)) {
            throw new IndexOutOfBoundsException(zzf(i));
        }
        Object[] objArr = this.f39091zzb;
        if (i2 < objArr.length) {
            System.arraycopy(objArr, i, objArr, i + 1, i2 - i);
        } else {
            Object[] objArr2 = new Object[d.D(i2, 3, 2, 1)];
            System.arraycopy(objArr, 0, objArr2, 0, i);
            System.arraycopy(this.f39091zzb, i, objArr2, i + 1, this.f39092zzc - i);
            this.f39091zzb = objArr2;
        }
        this.f39091zzb[i] = obj2;
        this.f39092zzc++;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        zzg(i);
        return this.f39091zzb[i];
    }

    @Override // com.google.android.gms.internal.auth.zzdr, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        zza();
        zzg(i);
        Object[] objArr = this.f39091zzb;
        Object obj2 = objArr[i];
        if (i < this.f39092zzc - 1) {
            System.arraycopy(objArr, i + 1, objArr, i, (r2 - i) - 1);
        }
        this.f39092zzc--;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // com.google.android.gms.internal.auth.zzdr, java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj2) {
        zza();
        zzg(i);
        Object[] objArr = this.f39091zzb;
        Object obj3 = objArr[i];
        objArr[i] = obj2;
        ((AbstractList) this).modCount++;
        return obj3;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f39092zzc;
    }

    @Override // com.google.android.gms.internal.auth.zzez
    public final /* bridge */ /* synthetic */ zzez zzd(int i) {
        if (i >= this.f39092zzc) {
            return new zzgg(Arrays.copyOf(this.f39091zzb, i), this.f39092zzc, true);
        }
        throw new IllegalArgumentException();
    }

    private zzgg(Object[] objArr, int i, boolean z) {
        super(z);
        this.f39091zzb = objArr;
        this.f39092zzc = i;
    }

    @Override // com.google.android.gms.internal.auth.zzdr, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj2) {
        zza();
        int i = this.f39092zzc;
        Object[] objArr = this.f39091zzb;
        if (i == objArr.length) {
            this.f39091zzb = Arrays.copyOf(objArr, ((i * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f39091zzb;
        int i2 = this.f39092zzc;
        this.f39092zzc = i2 + 1;
        objArr2[i2] = obj2;
        ((AbstractList) this).modCount++;
        return true;
    }
}
