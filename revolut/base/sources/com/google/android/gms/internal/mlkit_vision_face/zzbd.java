package com.google.android.gms.internal.mlkit_vision_face;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes16.dex */
final class zzbd extends AbstractMap implements Serializable {

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private static final Object f43490zzd = new Object();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    transient int[] f43491zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    transient Object[] f43492zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    transient Object[] f43493zzc;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    private transient Object f43494zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    private transient int f43495zzf;

    /* JADX INFO: renamed from: zzg, reason: collision with root package name */
    private transient int f43496zzg;

    /* JADX INFO: renamed from: zzh, reason: collision with root package name */
    private transient Set f43497zzh;

    /* JADX INFO: renamed from: zzi, reason: collision with root package name */
    private transient Set f43498zzi;

    /* JADX INFO: renamed from: zzj, reason: collision with root package name */
    private transient Collection f43499zzj;

    public zzbd() {
        zzo(3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object[] zzA() {
        Object[] objArr = this.f43492zzb;
        objArr.getClass();
        return objArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object[] zzB() {
        Object[] objArr = this.f43493zzc;
        objArr.getClass();
        return objArr;
    }

    public static /* synthetic */ int zzb(zzbd zzbdVar) {
        int i = zzbdVar.f43496zzg;
        zzbdVar.f43496zzg = i - 1;
        return i;
    }

    public static /* synthetic */ Object zzg(zzbd zzbdVar, int i) {
        return zzbdVar.zzA()[i];
    }

    public static /* synthetic */ Object zzj(zzbd zzbdVar, int i) {
        return zzbdVar.zzB()[i];
    }

    public static /* synthetic */ Object zzk(zzbd zzbdVar) {
        Object obj2 = zzbdVar.f43494zze;
        obj2.getClass();
        return obj2;
    }

    public static /* synthetic */ void zzm(zzbd zzbdVar, int i, Object obj2) {
        zzbdVar.zzB()[i] = obj2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int zzu() {
        return (1 << (this.f43495zzf & 31)) - 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int zzv(Object obj2) {
        if (zzq()) {
            return -1;
        }
        int iZza = zzbf.zza(obj2);
        int iZzu = zzu();
        Object obj3 = this.f43494zze;
        obj3.getClass();
        int iZzc = zzbe.zzc(obj3, iZza & iZzu);
        if (iZzc != 0) {
            int i = ~iZzu;
            int i2 = iZza & i;
            do {
                int i3 = iZzc - 1;
                int i5 = zzz()[i3];
                if ((i5 & i) == i2 && zzx.zza(obj2, zzA()[i3])) {
                    return i3;
                }
                iZzc = i5 & iZzu;
            } while (iZzc != 0);
        }
        return -1;
    }

    private final int zzw(int i, int i2, int i3, int i5) {
        Object objZzd = zzbe.zzd(i2);
        int i6 = i2 - 1;
        if (i5 != 0) {
            zzbe.zze(objZzd, i3 & i6, i5 + 1);
        }
        Object obj2 = this.f43494zze;
        obj2.getClass();
        int[] iArrZzz = zzz();
        for (int i21 = 0; i21 <= i; i21++) {
            int iZzc = zzbe.zzc(obj2, i21);
            while (iZzc != 0) {
                int i22 = iZzc - 1;
                int i32 = iArrZzz[i22];
                int i33 = ((~i) & i32) | i21;
                int i43 = i33 & i6;
                int iZzc2 = zzbe.zzc(objZzd, i43);
                zzbe.zze(objZzd, i43, iZzc);
                iArrZzz[i22] = ((~i6) & i33) | (iZzc2 & i6);
                iZzc = i32 & i;
            }
        }
        this.f43494zze = objZzd;
        zzy(i6);
        return i6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object zzx(Object obj2) {
        if (zzq()) {
            return f43490zzd;
        }
        int iZzu = zzu();
        Object obj3 = this.f43494zze;
        obj3.getClass();
        int iZzb = zzbe.zzb(obj2, null, iZzu, obj3, zzz(), zzA(), null);
        if (iZzb == -1) {
            return f43490zzd;
        }
        Object obj4 = zzB()[iZzb];
        zzp(iZzb, iZzu);
        this.f43496zzg--;
        zzn();
        return obj4;
    }

    private final void zzy(int i) {
        this.f43495zzf = ((32 - Integer.numberOfLeadingZeros(i)) & 31) | (this.f43495zzf & (-32));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int[] zzz() {
        int[] iArr = this.f43491zza;
        iArr.getClass();
        return iArr;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        if (zzq()) {
            return;
        }
        zzn();
        Map mapZzl = zzl();
        if (mapZzl != null) {
            this.f43495zzf = zzcn.zza(size(), 3, 1073741823);
            mapZzl.clear();
            this.f43494zze = null;
            this.f43496zzg = 0;
            return;
        }
        Arrays.fill(zzA(), 0, this.f43496zzg, (Object) null);
        Arrays.fill(zzB(), 0, this.f43496zzg, (Object) null);
        Object obj2 = this.f43494zze;
        obj2.getClass();
        if (obj2 instanceof byte[]) {
            Arrays.fill((byte[]) obj2, (byte) 0);
        } else if (obj2 instanceof short[]) {
            Arrays.fill((short[]) obj2, (short) 0);
        } else {
            Arrays.fill((int[]) obj2, 0);
        }
        Arrays.fill(zzz(), 0, this.f43496zzg, 0);
        this.f43496zzg = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj2) {
        Map mapZzl = zzl();
        return mapZzl != null ? mapZzl.containsKey(obj2) : zzv(obj2) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj2) {
        Map mapZzl = zzl();
        if (mapZzl != null) {
            return mapZzl.containsValue(obj2);
        }
        for (int i = 0; i < this.f43496zzg; i++) {
            if (zzx.zza(obj2, zzB()[i])) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        Set set = this.f43498zzi;
        if (set != null) {
            return set;
        }
        zzay zzayVar = new zzay(this);
        this.f43498zzi = zzayVar;
        return zzayVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj2) {
        Map mapZzl = zzl();
        if (mapZzl != null) {
            return mapZzl.get(obj2);
        }
        int iZzv = zzv(obj2);
        if (iZzv == -1) {
            return null;
        }
        return zzB()[iZzv];
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        Set set = this.f43497zzh;
        if (set != null) {
            return set;
        }
        zzba zzbaVar = new zzba(this);
        this.f43497zzh = zzbaVar;
        return zzbaVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj2, Object obj3) {
        int i;
        if (zzq()) {
            zzab.zzd(zzq(), "Arrays already allocated");
            int i2 = this.f43495zzf;
            int iMax = Math.max(i2 + 1, 2);
            int iHighestOneBit = Integer.highestOneBit(iMax);
            if (iMax > iHighestOneBit && (iHighestOneBit = iHighestOneBit + iHighestOneBit) <= 0) {
                iHighestOneBit = 1073741824;
            }
            int iMax2 = Math.max(4, iHighestOneBit);
            this.f43494zze = zzbe.zzd(iMax2);
            zzy(iMax2 - 1);
            this.f43491zza = new int[i2];
            this.f43492zzb = new Object[i2];
            this.f43493zzc = new Object[i2];
        }
        Map mapZzl = zzl();
        if (mapZzl != null) {
            return mapZzl.put(obj2, obj3);
        }
        int[] iArrZzz = zzz();
        Object[] objArrZzA = zzA();
        Object[] objArrZzB = zzB();
        int i3 = this.f43496zzg;
        int i5 = i3 + 1;
        int iZza = zzbf.zza(obj2);
        int iZzu = zzu();
        int i6 = iZza & iZzu;
        Object obj4 = this.f43494zze;
        obj4.getClass();
        int iZzc = zzbe.zzc(obj4, i6);
        if (iZzc == 0) {
            if (i5 > iZzu) {
                iZzu = zzw(iZzu, zzbe.zza(iZzu), iZza, i3);
            } else {
                Object obj5 = this.f43494zze;
                obj5.getClass();
                zzbe.zze(obj5, i6, i5);
            }
            i = 1;
        } else {
            int i21 = ~iZzu;
            int i22 = iZza & i21;
            int i32 = 0;
            while (true) {
                int i33 = iZzc - 1;
                int i43 = iArrZzz[i33];
                i = 1;
                int i59 = i43 & i21;
                if (i59 == i22 && zzx.zza(obj2, objArrZzA[i33])) {
                    Object obj6 = objArrZzB[i33];
                    objArrZzB[i33] = obj3;
                    return obj6;
                }
                int i66 = i43 & iZzu;
                i32++;
                if (i66 != 0) {
                    iZzc = i66;
                } else {
                    if (i32 >= 9) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap(zzu() + 1, 1.0f);
                        int iZze = zze();
                        while (iZze >= 0) {
                            linkedHashMap.put(zzA()[iZze], zzB()[iZze]);
                            iZze = zzf(iZze);
                        }
                        this.f43494zze = linkedHashMap;
                        this.f43491zza = null;
                        this.f43492zzb = null;
                        this.f43493zzc = null;
                        zzn();
                        return linkedHashMap.put(obj2, obj3);
                    }
                    if (i5 > iZzu) {
                        iZzu = zzw(iZzu, zzbe.zza(iZzu), iZza, i3);
                    } else {
                        iArrZzz[i33] = (i5 & iZzu) | i59;
                    }
                }
            }
        }
        int length = zzz().length;
        if (i5 > length) {
            int i74 = i;
            int iMin = Math.min(1073741823, (Math.max(i74, length >>> 1) + length) | i74);
            if (iMin != length) {
                this.f43491zza = Arrays.copyOf(zzz(), iMin);
                this.f43492zzb = Arrays.copyOf(zzA(), iMin);
                this.f43493zzc = Arrays.copyOf(zzB(), iMin);
            }
        }
        zzz()[i3] = (~iZzu) & iZza;
        zzA()[i3] = obj2;
        zzB()[i3] = obj3;
        this.f43496zzg = i5;
        zzn();
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj2) {
        Map mapZzl = zzl();
        if (mapZzl != null) {
            return mapZzl.remove(obj2);
        }
        Object objZzx = zzx(obj2);
        if (objZzx == f43490zzd) {
            return null;
        }
        return objZzx;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        Map mapZzl = zzl();
        return mapZzl != null ? mapZzl.size() : this.f43496zzg;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        Collection collection = this.f43499zzj;
        if (collection != null) {
            return collection;
        }
        zzbc zzbcVar = new zzbc(this);
        this.f43499zzj = zzbcVar;
        return zzbcVar;
    }

    public final int zze() {
        return isEmpty() ? -1 : 0;
    }

    public final int zzf(int i) {
        int i2 = i + 1;
        if (i2 < this.f43496zzg) {
            return i2;
        }
        return -1;
    }

    public final Map zzl() {
        Object obj2 = this.f43494zze;
        if (obj2 instanceof Map) {
            return (Map) obj2;
        }
        return null;
    }

    public final void zzn() {
        this.f43495zzf += 32;
    }

    public final void zzo(int i) {
        this.f43495zzf = zzcn.zza(12, 1, 1073741823);
    }

    public final void zzp(int i, int i2) {
        Object obj2 = this.f43494zze;
        obj2.getClass();
        int[] iArrZzz = zzz();
        Object[] objArrZzA = zzA();
        Object[] objArrZzB = zzB();
        int size = size();
        int i3 = size - 1;
        if (i >= i3) {
            objArrZzA[i] = null;
            objArrZzB[i] = null;
            iArrZzz[i] = 0;
            return;
        }
        Object obj3 = objArrZzA[i3];
        objArrZzA[i] = obj3;
        objArrZzB[i] = objArrZzB[i3];
        objArrZzA[i3] = null;
        objArrZzB[i3] = null;
        iArrZzz[i] = iArrZzz[i3];
        iArrZzz[i3] = 0;
        int iZza = zzbf.zza(obj3) & i2;
        int iZzc = zzbe.zzc(obj2, iZza);
        if (iZzc == size) {
            zzbe.zze(obj2, iZza, i + 1);
            return;
        }
        while (true) {
            int i5 = iZzc - 1;
            int i6 = iArrZzz[i5];
            int i21 = i6 & i2;
            if (i21 == size) {
                iArrZzz[i5] = ((i + 1) & i2) | (i6 & (~i2));
                return;
            }
            iZzc = i21;
        }
    }

    public final boolean zzq() {
        return this.f43494zze == null;
    }

    public zzbd(int i) {
        zzo(12);
    }
}
