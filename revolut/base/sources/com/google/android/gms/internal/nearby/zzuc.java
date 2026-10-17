package com.google.android.gms.internal.nearby;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes16.dex */
public abstract class zzuc extends zztx implements Set {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private transient zzua f45739zza;

    public static int zzh(int i) {
        int iMax = Math.max(i, 2);
        if (iMax >= 751619276) {
            zztq.zze(iMax < 1073741824, "collection too large");
            return 1073741824;
        }
        int iHighestOneBit = Integer.highestOneBit(iMax - 1);
        do {
            iHighestOneBit += iHighestOneBit;
        } while (((double) iHighestOneBit) * 0.7d < iMax);
        return iHighestOneBit;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzuc zzl(int i, Object... objArr) {
        if (i == 0) {
            return zzug.f45745zza;
        }
        if (i == 1) {
            Object obj2 = objArr[0];
            obj2.getClass();
            return new zzuh(obj2);
        }
        int iZzh = zzh(i);
        Object[] objArr2 = new Object[iZzh];
        int i2 = iZzh - 1;
        int i3 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < i; i6++) {
            Object obj3 = objArr[i6];
            zzue.zza(obj3, i6);
            int iHashCode = obj3.hashCode();
            int iZza = zztu.zza(iHashCode);
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
            return new zzuh(obj5);
        }
        if (zzh(i5) < iZzh / 2) {
            return zzl(i5, objArr);
        }
        int length = objArr.length;
        if (i5 < (length >> 1) + (length >> 2)) {
            objArr = Arrays.copyOf(objArr, i5);
        }
        return new zzug(objArr, i3, objArr2, i2, i5);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj2) {
        if (obj2 == this) {
            return true;
        }
        if ((obj2 instanceof zzuc) && zzk() && ((zzuc) obj2).zzk() && hashCode() != obj2.hashCode()) {
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

    @Override // com.google.android.gms.internal.nearby.zztx
    public zzua zzd() {
        zzua zzuaVar = this.f45739zza;
        if (zzuaVar != null) {
            return zzuaVar;
        }
        zzua zzuaVarZzi = zzi();
        this.f45739zza = zzuaVarZzi;
        return zzuaVarZzi;
    }

    @Override // com.google.android.gms.internal.nearby.zztx, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* JADX INFO: renamed from: zze */
    public abstract zzui iterator();

    public zzua zzi() {
        Object[] array = toArray();
        int i = zzua.f45738zzd;
        return zzua.zzi(array, array.length);
    }

    public boolean zzk() {
        return false;
    }
}
