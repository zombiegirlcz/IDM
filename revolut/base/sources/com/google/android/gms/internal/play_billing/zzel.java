package com.google.android.gms.internal.play_billing;

import a0.d;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes16.dex */
final class zzel extends zzeh implements RandomAccess, zzfz {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private static final boolean[] f45964zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private boolean[] f45965zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private int f45966zzc;

    static {
        boolean[] zArr = new boolean[0];
        f45964zza = zArr;
        new zzel(zArr, 0, false);
    }

    public zzel() {
        this(f45964zza, 0, true);
    }

    private static int zzg(int i) {
        return Math.max(((i * 3) / 2) + 1, 10);
    }

    private final String zzh(int i) {
        return d.g(i, this.f45966zzc, "Index:", ", Size:");
    }

    private final void zzi(int i) {
        if (i < 0 || i >= this.f45966zzc) {
            throw new IndexOutOfBoundsException(zzh(i));
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzeh, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj2) {
        int i2;
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        zza();
        if (i < 0 || i > (i2 = this.f45966zzc)) {
            throw new IndexOutOfBoundsException(zzh(i));
        }
        int i3 = i + 1;
        boolean[] zArr = this.f45965zzb;
        int length = zArr.length;
        if (i2 < length) {
            System.arraycopy(zArr, i, zArr, i3, i2 - i);
        } else {
            boolean[] zArr2 = new boolean[zzg(length)];
            System.arraycopy(this.f45965zzb, 0, zArr2, 0, i);
            System.arraycopy(this.f45965zzb, i, zArr2, i3, this.f45966zzc - i);
            this.f45965zzb = zArr2;
        }
        this.f45965zzb[i] = zBooleanValue;
        this.f45966zzc++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.play_billing.zzeh, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        zza();
        byte[] bArr = zzga.f46030zzb;
        collection.getClass();
        if (!(collection instanceof zzel)) {
            return super.addAll(collection);
        }
        zzel zzelVar = (zzel) collection;
        int i = zzelVar.f45966zzc;
        if (i == 0) {
            return false;
        }
        int i2 = this.f45966zzc;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        boolean[] zArr = this.f45965zzb;
        if (i3 > zArr.length) {
            this.f45965zzb = Arrays.copyOf(zArr, i3);
        }
        System.arraycopy(zzelVar.f45965zzb, 0, this.f45965zzb, this.f45966zzc, zzelVar.f45966zzc);
        this.f45966zzc = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj2) {
        return indexOf(obj2) != -1;
    }

    @Override // com.google.android.gms.internal.play_billing.zzeh, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof zzel)) {
            return super.equals(obj2);
        }
        zzel zzelVar = (zzel) obj2;
        if (this.f45966zzc != zzelVar.f45966zzc) {
            return false;
        }
        boolean[] zArr = zzelVar.f45965zzb;
        for (int i = 0; i < this.f45966zzc; i++) {
            if (this.f45965zzb[i] != zArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        zzi(i);
        return Boolean.valueOf(this.f45965zzb[i]);
    }

    @Override // com.google.android.gms.internal.play_billing.zzeh, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iZza = 1;
        for (int i = 0; i < this.f45966zzc; i++) {
            iZza = (iZza * 31) + zzga.zza(this.f45965zzb[i]);
        }
        return iZza;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj2) {
        if (!(obj2 instanceof Boolean)) {
            return -1;
        }
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        int i = this.f45966zzc;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f45965zzb[i2] == zBooleanValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.play_billing.zzeh, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        zza();
        zzi(i);
        boolean[] zArr = this.f45965zzb;
        boolean z = zArr[i];
        if (i < this.f45966zzc - 1) {
            System.arraycopy(zArr, i + 1, zArr, i, (r2 - i) - 1);
        }
        this.f45966zzc--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        zza();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        boolean[] zArr = this.f45965zzb;
        System.arraycopy(zArr, i2, zArr, i, this.f45966zzc - i2);
        this.f45966zzc -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.play_billing.zzeh, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj2) {
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        zza();
        zzi(i);
        boolean[] zArr = this.f45965zzb;
        boolean z = zArr[i];
        zArr[i] = zBooleanValue;
        return Boolean.valueOf(z);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f45966zzc;
    }

    @Override // com.google.android.gms.internal.play_billing.zzfz
    public final /* bridge */ /* synthetic */ zzfz zzd(int i) {
        if (i >= this.f45966zzc) {
            return new zzel(i == 0 ? f45964zza : Arrays.copyOf(this.f45965zzb, i), this.f45966zzc, true);
        }
        throw new IllegalArgumentException();
    }

    public final void zze(boolean z) {
        zza();
        int i = this.f45966zzc;
        int length = this.f45965zzb.length;
        if (i == length) {
            boolean[] zArr = new boolean[zzg(length)];
            System.arraycopy(this.f45965zzb, 0, zArr, 0, this.f45966zzc);
            this.f45965zzb = zArr;
        }
        boolean[] zArr2 = this.f45965zzb;
        int i2 = this.f45966zzc;
        this.f45966zzc = i2 + 1;
        zArr2[i2] = z;
    }

    public final boolean zzf(int i) {
        zzi(i);
        return this.f45965zzb[i];
    }

    private zzel(boolean[] zArr, int i, boolean z) {
        super(z);
        this.f45965zzb = zArr;
        this.f45966zzc = i;
    }

    @Override // com.google.android.gms.internal.play_billing.zzeh, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj2) {
        zze(((Boolean) obj2).booleanValue());
        return true;
    }
}
