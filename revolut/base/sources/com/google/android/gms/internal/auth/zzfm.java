package com.google.android.gms.internal.auth;

import a0.d;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes16.dex */
final class zzfm extends zzdr implements RandomAccess, zzez, zzge {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private static final zzfm f39059zza = new zzfm(new long[0], 0, false);

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private long[] f39060zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private int f39061zzc;

    public zzfm() {
        this(new long[10], 0, true);
    }

    private final String zzf(int i) {
        return d.g(i, this.f39061zzc, "Index:", ", Size:");
    }

    private final void zzg(int i) {
        if (i < 0 || i >= this.f39061zzc) {
            throw new IndexOutOfBoundsException(zzf(i));
        }
    }

    @Override // com.google.android.gms.internal.auth.zzdr, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj2) {
        int i2;
        long jLongValue = ((Long) obj2).longValue();
        zza();
        if (i < 0 || i > (i2 = this.f39061zzc)) {
            throw new IndexOutOfBoundsException(zzf(i));
        }
        long[] jArr = this.f39060zzb;
        if (i2 < jArr.length) {
            System.arraycopy(jArr, i, jArr, i + 1, i2 - i);
        } else {
            long[] jArr2 = new long[d.D(i2, 3, 2, 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            System.arraycopy(this.f39060zzb, i, jArr2, i + 1, this.f39061zzc - i);
            this.f39060zzb = jArr2;
        }
        this.f39060zzb[i] = jLongValue;
        this.f39061zzc++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.auth.zzdr, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        zza();
        byte[] bArr = zzfa.f39048zzd;
        collection.getClass();
        if (!(collection instanceof zzfm)) {
            return super.addAll(collection);
        }
        zzfm zzfmVar = (zzfm) collection;
        int i = zzfmVar.f39061zzc;
        if (i == 0) {
            return false;
        }
        int i2 = this.f39061zzc;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        long[] jArr = this.f39060zzb;
        if (i3 > jArr.length) {
            this.f39060zzb = Arrays.copyOf(jArr, i3);
        }
        System.arraycopy(zzfmVar.f39060zzb, 0, this.f39060zzb, this.f39061zzc, zzfmVar.f39061zzc);
        this.f39061zzc = i3;
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
        if (!(obj2 instanceof zzfm)) {
            return super.equals(obj2);
        }
        zzfm zzfmVar = (zzfm) obj2;
        if (this.f39061zzc != zzfmVar.f39061zzc) {
            return false;
        }
        long[] jArr = zzfmVar.f39060zzb;
        for (int i = 0; i < this.f39061zzc; i++) {
            if (this.f39060zzb[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        zzg(i);
        return Long.valueOf(this.f39060zzb[i]);
    }

    @Override // com.google.android.gms.internal.auth.zzdr, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f39061zzc; i2++) {
            long j2 = this.f39060zzb[i2];
            byte[] bArr = zzfa.f39048zzd;
            i = (i * 31) + ((int) (j2 ^ (j2 >>> 32)));
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj2) {
        if (!(obj2 instanceof Long)) {
            return -1;
        }
        long jLongValue = ((Long) obj2).longValue();
        int i = this.f39061zzc;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f39060zzb[i2] == jLongValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.auth.zzdr, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        zza();
        zzg(i);
        long[] jArr = this.f39060zzb;
        long j2 = jArr[i];
        if (i < this.f39061zzc - 1) {
            System.arraycopy(jArr, i + 1, jArr, i, (r3 - i) - 1);
        }
        this.f39061zzc--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j2);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        zza();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.f39060zzb;
        System.arraycopy(jArr, i2, jArr, i, this.f39061zzc - i2);
        this.f39061zzc -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.auth.zzdr, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj2) {
        long jLongValue = ((Long) obj2).longValue();
        zza();
        zzg(i);
        long[] jArr = this.f39060zzb;
        long j2 = jArr[i];
        jArr[i] = jLongValue;
        return Long.valueOf(j2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f39061zzc;
    }

    @Override // com.google.android.gms.internal.auth.zzez
    public final /* bridge */ /* synthetic */ zzez zzd(int i) {
        if (i >= this.f39061zzc) {
            return new zzfm(Arrays.copyOf(this.f39060zzb, i), this.f39061zzc, true);
        }
        throw new IllegalArgumentException();
    }

    public final void zze(long j2) {
        zza();
        int i = this.f39061zzc;
        long[] jArr = this.f39060zzb;
        if (i == jArr.length) {
            long[] jArr2 = new long[d.D(i, 3, 2, 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            this.f39060zzb = jArr2;
        }
        long[] jArr3 = this.f39060zzb;
        int i2 = this.f39061zzc;
        this.f39061zzc = i2 + 1;
        jArr3[i2] = j2;
    }

    private zzfm(long[] jArr, int i, boolean z) {
        super(z);
        this.f39060zzb = jArr;
        this.f39061zzc = i;
    }

    @Override // com.google.android.gms.internal.auth.zzdr, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj2) {
        zze(((Long) obj2).longValue());
        return true;
    }
}
