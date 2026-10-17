package com.google.android.gms.internal.auth;

import a0.d;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes16.dex */
final class zzew extends zzdr implements RandomAccess, zzez, zzge {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private static final zzew f39042zza = new zzew(new int[0], 0, false);

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private int[] f39043zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private int f39044zzc;

    public zzew() {
        this(new int[10], 0, true);
    }

    private final String zzf(int i) {
        return d.g(i, this.f39044zzc, "Index:", ", Size:");
    }

    private final void zzg(int i) {
        if (i < 0 || i >= this.f39044zzc) {
            throw new IndexOutOfBoundsException(zzf(i));
        }
    }

    @Override // com.google.android.gms.internal.auth.zzdr, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj2) {
        int i2;
        int iIntValue = ((Integer) obj2).intValue();
        zza();
        if (i < 0 || i > (i2 = this.f39044zzc)) {
            throw new IndexOutOfBoundsException(zzf(i));
        }
        int[] iArr = this.f39043zzb;
        if (i2 < iArr.length) {
            System.arraycopy(iArr, i, iArr, i + 1, i2 - i);
        } else {
            int[] iArr2 = new int[d.D(i2, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i);
            System.arraycopy(this.f39043zzb, i, iArr2, i + 1, this.f39044zzc - i);
            this.f39043zzb = iArr2;
        }
        this.f39043zzb[i] = iIntValue;
        this.f39044zzc++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.auth.zzdr, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        zza();
        byte[] bArr = zzfa.f39048zzd;
        collection.getClass();
        if (!(collection instanceof zzew)) {
            return super.addAll(collection);
        }
        zzew zzewVar = (zzew) collection;
        int i = zzewVar.f39044zzc;
        if (i == 0) {
            return false;
        }
        int i2 = this.f39044zzc;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        int[] iArr = this.f39043zzb;
        if (i3 > iArr.length) {
            this.f39043zzb = Arrays.copyOf(iArr, i3);
        }
        System.arraycopy(zzewVar.f39043zzb, 0, this.f39043zzb, this.f39044zzc, zzewVar.f39044zzc);
        this.f39044zzc = i3;
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
        if (!(obj2 instanceof zzew)) {
            return super.equals(obj2);
        }
        zzew zzewVar = (zzew) obj2;
        if (this.f39044zzc != zzewVar.f39044zzc) {
            return false;
        }
        int[] iArr = zzewVar.f39043zzb;
        for (int i = 0; i < this.f39044zzc; i++) {
            if (this.f39043zzb[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        zzg(i);
        return Integer.valueOf(this.f39043zzb[i]);
    }

    @Override // com.google.android.gms.internal.auth.zzdr, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f39044zzc; i2++) {
            i = (i * 31) + this.f39043zzb[i2];
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj2) {
        if (!(obj2 instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj2).intValue();
        int i = this.f39044zzc;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f39043zzb[i2] == iIntValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.auth.zzdr, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        zza();
        zzg(i);
        int[] iArr = this.f39043zzb;
        int i2 = iArr[i];
        if (i < this.f39044zzc - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (r2 - i) - 1);
        }
        this.f39044zzc--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i2);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        zza();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.f39043zzb;
        System.arraycopy(iArr, i2, iArr, i, this.f39044zzc - i2);
        this.f39044zzc -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.auth.zzdr, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj2) {
        int iIntValue = ((Integer) obj2).intValue();
        zza();
        zzg(i);
        int[] iArr = this.f39043zzb;
        int i2 = iArr[i];
        iArr[i] = iIntValue;
        return Integer.valueOf(i2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f39044zzc;
    }

    @Override // com.google.android.gms.internal.auth.zzez
    public final /* bridge */ /* synthetic */ zzez zzd(int i) {
        if (i >= this.f39044zzc) {
            return new zzew(Arrays.copyOf(this.f39043zzb, i), this.f39044zzc, true);
        }
        throw new IllegalArgumentException();
    }

    public final void zze(int i) {
        zza();
        int i2 = this.f39044zzc;
        int[] iArr = this.f39043zzb;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[d.D(i2, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            this.f39043zzb = iArr2;
        }
        int[] iArr3 = this.f39043zzb;
        int i3 = this.f39044zzc;
        this.f39044zzc = i3 + 1;
        iArr3[i3] = i;
    }

    private zzew(int[] iArr, int i, boolean z) {
        super(z);
        this.f39043zzb = iArr;
        this.f39044zzc = i;
    }

    @Override // com.google.android.gms.internal.auth.zzdr, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj2) {
        zze(((Integer) obj2).intValue());
        return true;
    }
}
