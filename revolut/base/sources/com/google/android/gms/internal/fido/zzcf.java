package com.google.android.gms.internal.fido;

import java.util.Arrays;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes16.dex */
public abstract class zzcf extends zzby implements Set {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private transient zzcc f39327zza;

    private static zzcf zzf(int i, Object... objArr) {
        if (i == 0) {
            return zzcu.f39344zza;
        }
        if (i == 1) {
            Object obj2 = objArr[0];
            Objects.requireNonNull(obj2);
            return new zzcz(obj2);
        }
        int iZzh = zzh(i);
        Object[] objArr2 = new Object[iZzh];
        int i2 = iZzh - 1;
        int i3 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < i; i6++) {
            Object obj3 = objArr[i6];
            zzcr.zza(obj3, i6);
            int iHashCode = obj3.hashCode();
            int iZza = zzbx.zza(iHashCode);
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
            Objects.requireNonNull(obj5);
            return new zzcz(obj5);
        }
        if (zzh(i5) < iZzh / 2) {
            return zzf(i5, objArr);
        }
        if (i5 <= 0) {
            objArr = Arrays.copyOf(objArr, i5);
        }
        return new zzcu(objArr, i3, objArr2, i2, i5);
    }

    public static int zzh(int i) {
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

    public static zzcf zzk() {
        return zzcu.f39344zza;
    }

    public static zzcf zzl(Object obj2) {
        return new zzcz("FIDO");
    }

    public static zzcf zzm(Object obj2, Object obj3) {
        return zzf(2, obj2, obj3);
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj2) {
        if (obj2 == this) {
            return true;
        }
        if ((obj2 instanceof zzcf) && zzg() && ((zzcf) obj2).zzg() && hashCode() != obj2.hashCode()) {
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
        return zzcy.zza(this);
    }

    @Override // com.google.android.gms.internal.fido.zzby, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* JADX INFO: renamed from: zzd */
    public abstract zzdc iterator();

    public boolean zzg() {
        return false;
    }

    public zzcc zzi() {
        zzcc zzccVar = this.f39327zza;
        if (zzccVar != null) {
            return zzccVar;
        }
        zzcc zzccVarZzj = zzj();
        this.f39327zza = zzccVarZzj;
        return zzccVarZzj;
    }

    public zzcc zzj() {
        Object[] array = toArray();
        int i = zzcc.f39324zzd;
        return zzcc.zzh(array, array.length);
    }
}
