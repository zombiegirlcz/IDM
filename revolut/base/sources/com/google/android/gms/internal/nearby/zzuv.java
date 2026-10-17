package com.google.android.gms.internal.nearby;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes16.dex */
final class zzuv extends AbstractList implements RandomAccess, Serializable {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final int[] f45776zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final int f45777zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    final int f45778zzc;

    public zzuv(int[] iArr, int i, int i2) {
        this.f45776zza = iArr;
        this.f45777zzb = i;
        this.f45778zzc = i2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj2) {
        return (obj2 instanceof Integer) && zzuw.zza(this.f45776zza, ((Integer) obj2).intValue(), this.f45777zzb, this.f45778zzc) != -1;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj2) {
        if (obj2 == this) {
            return true;
        }
        if (!(obj2 instanceof zzuv)) {
            return super.equals(obj2);
        }
        zzuv zzuvVar = (zzuv) obj2;
        int i = this.f45778zzc - this.f45777zzb;
        if (zzuvVar.f45778zzc - zzuvVar.f45777zzb != i) {
            return false;
        }
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f45776zza[this.f45777zzb + i2] != zzuvVar.f45776zza[zzuvVar.f45777zzb + i2]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        zztq.zza(i, this.f45778zzc - this.f45777zzb, "index");
        return Integer.valueOf(this.f45776zza[this.f45777zzb + i]);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = this.f45777zzb; i2 < this.f45778zzc; i2++) {
            i = (i * 31) + this.f45776zza[i2];
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj2) {
        int iZza;
        if (!(obj2 instanceof Integer) || (iZza = zzuw.zza(this.f45776zza, ((Integer) obj2).intValue(), this.f45777zzb, this.f45778zzc)) < 0) {
            return -1;
        }
        return iZza - this.f45777zzb;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj2) {
        if (obj2 instanceof Integer) {
            int[] iArr = this.f45776zza;
            int iIntValue = ((Integer) obj2).intValue();
            int i = this.f45777zzb;
            int i2 = this.f45778zzc - 1;
            while (true) {
                if (i2 < i) {
                    i2 = -1;
                    break;
                }
                if (iArr[i2] == iIntValue) {
                    break;
                }
                i2--;
            }
            if (i2 >= 0) {
                return i2 - this.f45777zzb;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj2) {
        Integer num = (Integer) obj2;
        zztq.zza(i, this.f45778zzc - this.f45777zzb, "index");
        int[] iArr = this.f45776zza;
        int i2 = this.f45777zzb + i;
        int i3 = iArr[i2];
        num.getClass();
        iArr[i2] = num.intValue();
        return Integer.valueOf(i3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f45778zzc - this.f45777zzb;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i, int i2) {
        zztq.zzh(i, i2, this.f45778zzc - this.f45777zzb);
        if (i == i2) {
            return Collections.EMPTY_LIST;
        }
        int[] iArr = this.f45776zza;
        int i3 = this.f45777zzb;
        return new zzuv(iArr, i3 + i, i2 + i3);
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        StringBuilder sb6 = new StringBuilder((this.f45778zzc - this.f45777zzb) * 5);
        sb6.append('[');
        sb6.append(this.f45776zza[this.f45777zzb]);
        int i = this.f45777zzb;
        while (true) {
            i++;
            if (i >= this.f45778zzc) {
                sb6.append(']');
                return sb6.toString();
            }
            sb6.append(", ");
            sb6.append(this.f45776zza[i]);
        }
    }
}
