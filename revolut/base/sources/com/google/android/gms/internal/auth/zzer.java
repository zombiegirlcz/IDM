package com.google.android.gms.internal.auth;

import a0.d;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes16.dex */
final class zzer extends zzdr implements RandomAccess, zzez, zzge {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private static final zzer f39032zza = new zzer(new float[0], 0, false);

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private float[] f39033zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private int f39034zzc;

    public zzer() {
        this(new float[10], 0, true);
    }

    private final String zzf(int i) {
        return d.g(i, this.f39034zzc, "Index:", ", Size:");
    }

    private final void zzg(int i) {
        if (i < 0 || i >= this.f39034zzc) {
            throw new IndexOutOfBoundsException(zzf(i));
        }
    }

    @Override // com.google.android.gms.internal.auth.zzdr, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj2) {
        int i2;
        float fFloatValue = ((Float) obj2).floatValue();
        zza();
        if (i < 0 || i > (i2 = this.f39034zzc)) {
            throw new IndexOutOfBoundsException(zzf(i));
        }
        float[] fArr = this.f39033zzb;
        if (i2 < fArr.length) {
            System.arraycopy(fArr, i, fArr, i + 1, i2 - i);
        } else {
            float[] fArr2 = new float[d.D(i2, 3, 2, 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            System.arraycopy(this.f39033zzb, i, fArr2, i + 1, this.f39034zzc - i);
            this.f39033zzb = fArr2;
        }
        this.f39033zzb[i] = fFloatValue;
        this.f39034zzc++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.auth.zzdr, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        zza();
        byte[] bArr = zzfa.f39048zzd;
        collection.getClass();
        if (!(collection instanceof zzer)) {
            return super.addAll(collection);
        }
        zzer zzerVar = (zzer) collection;
        int i = zzerVar.f39034zzc;
        if (i == 0) {
            return false;
        }
        int i2 = this.f39034zzc;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        float[] fArr = this.f39033zzb;
        if (i3 > fArr.length) {
            this.f39033zzb = Arrays.copyOf(fArr, i3);
        }
        System.arraycopy(zzerVar.f39033zzb, 0, this.f39033zzb, this.f39034zzc, zzerVar.f39034zzc);
        this.f39034zzc = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj2) {
        return indexOf(obj2) != -1;
    }

    @Override // com.google.android.gms.internal.auth.zzdr, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof zzer)) {
            return super.equals(obj2);
        }
        zzer zzerVar = (zzer) obj2;
        if (this.f39034zzc != zzerVar.f39034zzc) {
            return false;
        }
        float[] fArr = zzerVar.f39033zzb;
        for (int i = 0; i < this.f39034zzc; i++) {
            if (Float.floatToIntBits(this.f39033zzb[i]) != Float.floatToIntBits(fArr[i])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        zzg(i);
        return Float.valueOf(this.f39033zzb[i]);
    }

    @Override // com.google.android.gms.internal.auth.zzdr, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iFloatToIntBits = 1;
        for (int i = 0; i < this.f39034zzc; i++) {
            iFloatToIntBits = (iFloatToIntBits * 31) + Float.floatToIntBits(this.f39033zzb[i]);
        }
        return iFloatToIntBits;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj2) {
        if (!(obj2 instanceof Float)) {
            return -1;
        }
        float fFloatValue = ((Float) obj2).floatValue();
        int i = this.f39034zzc;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f39033zzb[i2] == fFloatValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.auth.zzdr, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        zza();
        zzg(i);
        float[] fArr = this.f39033zzb;
        float f = fArr[i];
        if (i < this.f39034zzc - 1) {
            System.arraycopy(fArr, i + 1, fArr, i, (r2 - i) - 1);
        }
        this.f39034zzc--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        zza();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        float[] fArr = this.f39033zzb;
        System.arraycopy(fArr, i2, fArr, i, this.f39034zzc - i2);
        this.f39034zzc -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.auth.zzdr, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj2) {
        float fFloatValue = ((Float) obj2).floatValue();
        zza();
        zzg(i);
        float[] fArr = this.f39033zzb;
        float f = fArr[i];
        fArr[i] = fFloatValue;
        return Float.valueOf(f);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f39034zzc;
    }

    @Override // com.google.android.gms.internal.auth.zzez
    public final /* bridge */ /* synthetic */ zzez zzd(int i) {
        if (i >= this.f39034zzc) {
            return new zzer(Arrays.copyOf(this.f39033zzb, i), this.f39034zzc, true);
        }
        throw new IllegalArgumentException();
    }

    public final void zze(float f) {
        zza();
        int i = this.f39034zzc;
        float[] fArr = this.f39033zzb;
        if (i == fArr.length) {
            float[] fArr2 = new float[d.D(i, 3, 2, 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            this.f39033zzb = fArr2;
        }
        float[] fArr3 = this.f39033zzb;
        int i2 = this.f39034zzc;
        this.f39034zzc = i2 + 1;
        fArr3[i2] = f;
    }

    private zzer(float[] fArr, int i, boolean z) {
        super(z);
        this.f39033zzb = fArr;
        this.f39034zzc = i;
    }

    @Override // com.google.android.gms.internal.auth.zzdr, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj2) {
        zze(((Float) obj2).floatValue());
        return true;
    }
}
