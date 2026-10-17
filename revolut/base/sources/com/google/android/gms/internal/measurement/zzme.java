package com.google.android.gms.internal.measurement;

import a0.d;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes16.dex */
final class zzme extends zzkq implements RandomAccess, zzmh, zzno {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private static final int[] f40461zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private static final zzme f40462zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private int[] f40463zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private int f40464zzd;

    static {
        int[] iArr = new int[0];
        f40461zza = iArr;
        f40462zzb = new zzme(iArr, 0, false);
    }

    public zzme() {
        this(f40461zza, 0, true);
    }

    public static zzme zzf() {
        return f40462zzb;
    }

    private static int zzj(int i) {
        return Math.max(((i * 3) / 2) + 1, 10);
    }

    private final String zzk(int i) {
        return d.g(i, this.f40464zzd, "Index:", ", Size:");
    }

    private final void zzl(int i) {
        if (i < 0 || i >= this.f40464zzd) {
            throw new IndexOutOfBoundsException(zzk(i));
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzkq, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj2) {
        int i2;
        int iIntValue = ((Integer) obj2).intValue();
        zzcE();
        if (i < 0 || i > (i2 = this.f40464zzd)) {
            throw new IndexOutOfBoundsException(zzk(i));
        }
        int i3 = i + 1;
        int[] iArr = this.f40463zzc;
        int length = iArr.length;
        if (i2 < length) {
            System.arraycopy(iArr, i, iArr, i3, i2 - i);
        } else {
            int[] iArr2 = new int[zzj(length)];
            System.arraycopy(this.f40463zzc, 0, iArr2, 0, i);
            System.arraycopy(this.f40463zzc, i, iArr2, i3, this.f40464zzd - i);
            this.f40463zzc = iArr2;
        }
        this.f40463zzc[i] = iIntValue;
        this.f40464zzd++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.zzkq, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        zzcE();
        byte[] bArr = zzmk.f40466zzb;
        collection.getClass();
        if (!(collection instanceof zzme)) {
            return super.addAll(collection);
        }
        zzme zzmeVar = (zzme) collection;
        int i = zzmeVar.f40464zzd;
        if (i == 0) {
            return false;
        }
        int i2 = this.f40464zzd;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        int[] iArr = this.f40463zzc;
        if (i3 > iArr.length) {
            this.f40463zzc = Arrays.copyOf(iArr, i3);
        }
        System.arraycopy(zzmeVar.f40463zzc, 0, this.f40463zzc, this.f40464zzd, zzmeVar.f40464zzd);
        this.f40464zzd = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj2) {
        return indexOf(obj2) != -1;
    }

    @Override // com.google.android.gms.internal.measurement.zzkq, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof zzme)) {
            return super.equals(obj2);
        }
        zzme zzmeVar = (zzme) obj2;
        if (this.f40464zzd != zzmeVar.f40464zzd) {
            return false;
        }
        int[] iArr = zzmeVar.f40463zzc;
        for (int i = 0; i < this.f40464zzd; i++) {
            if (this.f40463zzc[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        zzl(i);
        return Integer.valueOf(this.f40463zzc[i]);
    }

    @Override // com.google.android.gms.internal.measurement.zzkq, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f40464zzd; i2++) {
            i = (i * 31) + this.f40463zzc[i2];
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj2) {
        if (!(obj2 instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj2).intValue();
        int i = this.f40464zzd;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f40463zzc[i2] == iIntValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.measurement.zzkq, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        zzcE();
        zzl(i);
        int[] iArr = this.f40463zzc;
        int i2 = iArr[i];
        if (i < this.f40464zzd - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (r2 - i) - 1);
        }
        this.f40464zzd--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i2);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        zzcE();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.f40463zzc;
        System.arraycopy(iArr, i2, iArr, i, this.f40464zzd - i2);
        this.f40464zzd -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.zzkq, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj2) {
        int iIntValue = ((Integer) obj2).intValue();
        zzcE();
        zzl(i);
        int[] iArr = this.f40463zzc;
        int i2 = iArr[i];
        iArr[i] = iIntValue;
        return Integer.valueOf(i2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f40464zzd;
    }

    public final int zze(int i) {
        zzl(i);
        return this.f40463zzc[i];
    }

    @Override // com.google.android.gms.internal.measurement.zzmj
    /* JADX INFO: renamed from: zzg, reason: merged with bridge method [inline-methods] */
    public final zzmh zzd(int i) {
        if (i >= this.f40464zzd) {
            return new zzme(i == 0 ? f40461zza : Arrays.copyOf(this.f40463zzc, i), this.f40464zzd, true);
        }
        throw new IllegalArgumentException();
    }

    public final void zzh(int i) {
        zzcE();
        int i2 = this.f40464zzd;
        int length = this.f40463zzc.length;
        if (i2 == length) {
            int[] iArr = new int[zzj(length)];
            System.arraycopy(this.f40463zzc, 0, iArr, 0, this.f40464zzd);
            this.f40463zzc = iArr;
        }
        int[] iArr2 = this.f40463zzc;
        int i3 = this.f40464zzd;
        this.f40464zzd = i3 + 1;
        iArr2[i3] = i;
    }

    public final void zzi(int i) {
        int length = this.f40463zzc.length;
        if (i <= length) {
            return;
        }
        if (length == 0) {
            this.f40463zzc = new int[Math.max(i, 10)];
            return;
        }
        while (length < i) {
            length = zzj(length);
        }
        this.f40463zzc = Arrays.copyOf(this.f40463zzc, length);
    }

    private zzme(int[] iArr, int i, boolean z) {
        super(z);
        this.f40463zzc = iArr;
        this.f40464zzd = i;
    }

    @Override // com.google.android.gms.internal.measurement.zzkq, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj2) {
        zzh(((Integer) obj2).intValue());
        return true;
    }
}
