package com.google.android.gms.internal.tapandpay;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes16.dex */
public abstract class zzau extends zzaq implements Set {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private transient zzat f46315zza;

    public static int zzf(int i) {
        int iMax = Math.max(i, 2);
        if (iMax >= 751619276) {
            if (iMax < 1073741824) {
                return 1073741824;
            }
            throw new IllegalArgumentException("collection too large");
        }
        int iHighestOneBit = Integer.highestOneBit(iMax - 1);
        do {
            iHighestOneBit += iHighestOneBit;
        } while (((double) iHighestOneBit) * 0.7d < iMax);
        return iHighestOneBit;
    }

    public static zzau zzi(Object obj2, Object obj3) {
        return zzk(2, obj2, obj3);
    }

    private static zzau zzk(int i, Object... objArr) {
        if (i == 0) {
            return zzay.f46321zza;
        }
        if (i == 1) {
            Object obj2 = objArr[0];
            obj2.getClass();
            return new zzaz(obj2);
        }
        int iZzf = zzf(i);
        Object[] objArr2 = new Object[iZzf];
        int i2 = iZzf - 1;
        int i3 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < i; i6++) {
            Object obj3 = objArr[i6];
            zzaw.zza(obj3, i6);
            int iHashCode = obj3.hashCode();
            int iZza = zzap.zza(iHashCode);
            while (true) {
                int i21 = iZza & i2;
                Object obj4 = objArr2[i21];
                if (obj4 == null) {
                    objArr[i5] = obj3;
                    objArr2[i21] = obj3;
                    i3 += iHashCode;
                    i5++;
                    break;
                }
                if (!obj4.equals(obj3)) {
                    iZza++;
                }
            }
        }
        Arrays.fill(objArr, i5, i, (Object) null);
        if (i5 == 1) {
            Object obj5 = objArr[0];
            obj5.getClass();
            return new zzaz(obj5);
        }
        if (zzf(i5) < iZzf / 2) {
            return zzk(i5, objArr);
        }
        if (i5 <= 0) {
            objArr = Arrays.copyOf(objArr, i5);
        }
        return new zzay(objArr, i3, objArr2, i2, i5);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj2) {
        if (obj2 == this) {
            return true;
        }
        if ((obj2 instanceof zzau) && zzj() && ((zzau) obj2).zzj() && hashCode() != obj2.hashCode()) {
            return false;
        }
        if (obj2 == this) {
            return true;
        }
        if (obj2 instanceof Set) {
            Set set = (Set) obj2;
            try {
                if (size() == set.size()) {
                    return containsAll(set);
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        Iterator it8 = iterator();
        int iHashCode = 0;
        while (it8.hasNext()) {
            Object next = it8.next();
            iHashCode += next != null ? next.hashCode() : 0;
        }
        return iHashCode;
    }

    @Override // com.google.android.gms.internal.tapandpay.zzaq, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* JADX INFO: renamed from: zzd */
    public abstract zzba iterator();

    public final zzat zzg() {
        zzat zzatVar = this.f46315zza;
        if (zzatVar != null) {
            return zzatVar;
        }
        zzat zzatVarZzh = zzh();
        this.f46315zza = zzatVarZzh;
        return zzatVarZzh;
    }

    public zzat zzh() {
        Object[] array = toArray();
        int i = zzat.f46314zzd;
        return zzat.zzg(array, array.length);
    }

    public boolean zzj() {
        return false;
    }
}
