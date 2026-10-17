package com.google.android.gms.internal.mlkit_vision_barcode;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes16.dex */
final class zzcl extends AbstractMap implements Serializable {

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private static final Object f41301zzd = new Object();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    transient int[] f41302zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    transient Object[] f41303zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    transient Object[] f41304zzc;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    private transient Object f41305zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    private transient int f41306zzf;

    /* JADX INFO: renamed from: zzg, reason: collision with root package name */
    private transient int f41307zzg;

    /* JADX INFO: renamed from: zzh, reason: collision with root package name */
    private transient Set f41308zzh;

    /* JADX INFO: renamed from: zzi, reason: collision with root package name */
    private transient Set f41309zzi;

    /* JADX INFO: renamed from: zzj, reason: collision with root package name */
    private transient Collection f41310zzj;

    public zzcl() {
        zzm(3);
    }

    public static /* synthetic */ Object zzh(zzcl zzclVar) {
        Object obj2 = zzclVar.f41305zze;
        obj2.getClass();
        return obj2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int zzp() {
        return (1 << (this.f41306zzf & 31)) - 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int zzq(Object obj2) {
        if (zzo()) {
            return -1;
        }
        int iZza = zzcn.zza(obj2);
        int iZzp = zzp();
        Object obj3 = this.f41305zze;
        obj3.getClass();
        int iZzc = zzcm.zzc(obj3, iZza & iZzp);
        if (iZzc != 0) {
            int i = ~iZzp;
            int i2 = iZza & i;
            do {
                int i3 = iZzc - 1;
                int[] iArr = this.f41302zza;
                iArr.getClass();
                int i5 = iArr[i3];
                if ((i5 & i) == i2) {
                    Object[] objArr = this.f41303zzb;
                    objArr.getClass();
                    if (zzay.zza(obj2, objArr[i3])) {
                        return i3;
                    }
                }
                iZzc = i5 & iZzp;
            } while (iZzc != 0);
        }
        return -1;
    }

    private final int zzr(int i, int i2, int i3, int i5) {
        int i6 = i2 - 1;
        Object objZzd = zzcm.zzd(i2);
        if (i5 != 0) {
            zzcm.zze(objZzd, i3 & i6, i5 + 1);
        }
        Object obj2 = this.f41305zze;
        obj2.getClass();
        int[] iArr = this.f41302zza;
        iArr.getClass();
        for (int i21 = 0; i21 <= i; i21++) {
            int iZzc = zzcm.zzc(obj2, i21);
            while (iZzc != 0) {
                int i22 = iZzc - 1;
                int i32 = iArr[i22];
                int i33 = ((~i) & i32) | i21;
                int i43 = i33 & i6;
                int iZzc2 = zzcm.zzc(objZzd, i43);
                zzcm.zze(objZzd, i43, iZzc);
                iArr[i22] = ((~i6) & i33) | (iZzc2 & i6);
                iZzc = i32 & i;
            }
        }
        this.f41305zze = objZzd;
        zzt(i6);
        return i6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object zzs(Object obj2) {
        if (zzo()) {
            return f41301zzd;
        }
        int iZzp = zzp();
        Object obj3 = this.f41305zze;
        obj3.getClass();
        int[] iArr = this.f41302zza;
        iArr.getClass();
        Object[] objArr = this.f41303zzb;
        objArr.getClass();
        int iZzb = zzcm.zzb(obj2, null, iZzp, obj3, iArr, objArr, null);
        if (iZzb == -1) {
            return f41301zzd;
        }
        Object[] objArr2 = this.f41304zzc;
        objArr2.getClass();
        Object obj4 = objArr2[iZzb];
        zzn(iZzb, iZzp);
        this.f41307zzg--;
        zzl();
        return obj4;
    }

    private final void zzt(int i) {
        this.f41306zzf = ((32 - Integer.numberOfLeadingZeros(i)) & 31) | (this.f41306zzf & (-32));
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        if (zzo()) {
            return;
        }
        zzl();
        Map mapZzj = zzj();
        if (mapZzj != null) {
            this.f41306zzf = zzdz.zza(size(), 3, 1073741823);
            mapZzj.clear();
            this.f41305zze = null;
            this.f41307zzg = 0;
            return;
        }
        Object[] objArr = this.f41303zzb;
        objArr.getClass();
        Arrays.fill(objArr, 0, this.f41307zzg, (Object) null);
        Object[] objArr2 = this.f41304zzc;
        objArr2.getClass();
        Arrays.fill(objArr2, 0, this.f41307zzg, (Object) null);
        Object obj2 = this.f41305zze;
        obj2.getClass();
        if (obj2 instanceof byte[]) {
            Arrays.fill((byte[]) obj2, (byte) 0);
        } else if (obj2 instanceof short[]) {
            Arrays.fill((short[]) obj2, (short) 0);
        } else {
            Arrays.fill((int[]) obj2, 0);
        }
        int[] iArr = this.f41302zza;
        iArr.getClass();
        Arrays.fill(iArr, 0, this.f41307zzg, 0);
        this.f41307zzg = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj2) {
        Map mapZzj = zzj();
        return mapZzj != null ? mapZzj.containsKey(obj2) : zzq(obj2) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj2) {
        Map mapZzj = zzj();
        if (mapZzj != null) {
            return mapZzj.containsValue(obj2);
        }
        for (int i = 0; i < this.f41307zzg; i++) {
            Object[] objArr = this.f41304zzc;
            objArr.getClass();
            if (zzay.zza(obj2, objArr[i])) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        Set set = this.f41309zzi;
        if (set != null) {
            return set;
        }
        zzcf zzcfVar = new zzcf(this);
        this.f41309zzi = zzcfVar;
        return zzcfVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj2) {
        Map mapZzj = zzj();
        if (mapZzj != null) {
            return mapZzj.get(obj2);
        }
        int iZzq = zzq(obj2);
        if (iZzq == -1) {
            return null;
        }
        Object[] objArr = this.f41304zzc;
        objArr.getClass();
        return objArr[iZzq];
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        Set set = this.f41308zzh;
        if (set != null) {
            return set;
        }
        zzci zzciVar = new zzci(this);
        this.f41308zzh = zzciVar;
        return zzciVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj2, Object obj3) {
        int i;
        if (zzo()) {
            zzbc.zze(zzo(), "Arrays already allocated");
            int i2 = this.f41306zzf;
            int iMax = Math.max(i2 + 1, 2);
            int iHighestOneBit = Integer.highestOneBit(iMax);
            if (iMax > iHighestOneBit && (iHighestOneBit = iHighestOneBit + iHighestOneBit) <= 0) {
                iHighestOneBit = 1073741824;
            }
            int iMax2 = Math.max(4, iHighestOneBit);
            this.f41305zze = zzcm.zzd(iMax2);
            zzt(iMax2 - 1);
            this.f41302zza = new int[i2];
            this.f41303zzb = new Object[i2];
            this.f41304zzc = new Object[i2];
        }
        Map mapZzj = zzj();
        if (mapZzj != null) {
            return mapZzj.put(obj2, obj3);
        }
        int[] iArr = this.f41302zza;
        iArr.getClass();
        Object[] objArr = this.f41303zzb;
        objArr.getClass();
        Object[] objArr2 = this.f41304zzc;
        objArr2.getClass();
        int i3 = this.f41307zzg;
        int i5 = i3 + 1;
        int iZza = zzcn.zza(obj2);
        int iZzp = zzp();
        int i6 = iZza & iZzp;
        Object obj4 = this.f41305zze;
        obj4.getClass();
        int iZzc = zzcm.zzc(obj4, i6);
        if (iZzc == 0) {
            if (i5 > iZzp) {
                iZzp = zzr(iZzp, zzcm.zza(iZzp), iZza, i3);
            } else {
                Object obj5 = this.f41305zze;
                obj5.getClass();
                zzcm.zze(obj5, i6, i5);
            }
            i = 1;
        } else {
            int i21 = ~iZzp;
            int i22 = iZza & i21;
            int i32 = 0;
            while (true) {
                int i33 = iZzc - 1;
                int i43 = iArr[i33];
                i = 1;
                int i59 = i43 & i21;
                if (i59 == i22 && zzay.zza(obj2, objArr[i33])) {
                    Object obj6 = objArr2[i33];
                    objArr2[i33] = obj3;
                    return obj6;
                }
                int i66 = i43 & iZzp;
                i32++;
                if (i66 != 0) {
                    iZzc = i66;
                } else {
                    if (i32 >= 9) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap(zzp() + 1, 1.0f);
                        int iZze = zze();
                        while (iZze >= 0) {
                            Object[] objArr3 = this.f41303zzb;
                            objArr3.getClass();
                            Object obj7 = objArr3[iZze];
                            Object[] objArr4 = this.f41304zzc;
                            objArr4.getClass();
                            linkedHashMap.put(obj7, objArr4[iZze]);
                            iZze = zzf(iZze);
                        }
                        this.f41305zze = linkedHashMap;
                        this.f41302zza = null;
                        this.f41303zzb = null;
                        this.f41304zzc = null;
                        zzl();
                        return linkedHashMap.put(obj2, obj3);
                    }
                    if (i5 > iZzp) {
                        iZzp = zzr(iZzp, zzcm.zza(iZzp), iZza, i3);
                    } else {
                        iArr[i33] = (i5 & iZzp) | i59;
                    }
                }
            }
        }
        int[] iArr2 = this.f41302zza;
        iArr2.getClass();
        int length = iArr2.length;
        if (i5 > length) {
            int i74 = i;
            int iMin = Math.min(1073741823, (Math.max(i74, length >>> 1) + length) | i74);
            if (iMin != length) {
                int[] iArr3 = this.f41302zza;
                iArr3.getClass();
                this.f41302zza = Arrays.copyOf(iArr3, iMin);
                Object[] objArr5 = this.f41303zzb;
                objArr5.getClass();
                this.f41303zzb = Arrays.copyOf(objArr5, iMin);
                Object[] objArr6 = this.f41304zzc;
                objArr6.getClass();
                this.f41304zzc = Arrays.copyOf(objArr6, iMin);
            }
        }
        int i92 = (~iZzp) & iZza;
        int[] iArr4 = this.f41302zza;
        iArr4.getClass();
        iArr4[i3] = i92;
        Object[] objArr7 = this.f41303zzb;
        objArr7.getClass();
        objArr7[i3] = obj2;
        Object[] objArr8 = this.f41304zzc;
        objArr8.getClass();
        objArr8[i3] = obj3;
        this.f41307zzg = i5;
        zzl();
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj2) {
        Map mapZzj = zzj();
        if (mapZzj != null) {
            return mapZzj.remove(obj2);
        }
        Object objZzs = zzs(obj2);
        if (objZzs == f41301zzd) {
            return null;
        }
        return objZzs;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        Map mapZzj = zzj();
        return mapZzj != null ? mapZzj.size() : this.f41307zzg;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        Collection collection = this.f41310zzj;
        if (collection != null) {
            return collection;
        }
        zzck zzckVar = new zzck(this);
        this.f41310zzj = zzckVar;
        return zzckVar;
    }

    public final int zze() {
        return isEmpty() ? -1 : 0;
    }

    public final int zzf(int i) {
        int i2 = i + 1;
        if (i2 < this.f41307zzg) {
            return i2;
        }
        return -1;
    }

    public final Map zzj() {
        Object obj2 = this.f41305zze;
        if (obj2 instanceof Map) {
            return (Map) obj2;
        }
        return null;
    }

    public final void zzl() {
        this.f41306zzf += 32;
    }

    public final void zzm(int i) {
        this.f41306zzf = zzdz.zza(12, 1, 1073741823);
    }

    public final void zzn(int i, int i2) {
        Object obj2 = this.f41305zze;
        obj2.getClass();
        int[] iArr = this.f41302zza;
        iArr.getClass();
        Object[] objArr = this.f41303zzb;
        objArr.getClass();
        Object[] objArr2 = this.f41304zzc;
        objArr2.getClass();
        int size = size();
        int i3 = size - 1;
        if (i >= i3) {
            objArr[i] = null;
            objArr2[i] = null;
            iArr[i] = 0;
            return;
        }
        Object obj3 = objArr[i3];
        objArr[i] = obj3;
        objArr2[i] = objArr2[i3];
        objArr[i3] = null;
        objArr2[i3] = null;
        iArr[i] = iArr[i3];
        iArr[i3] = 0;
        int iZza = zzcn.zza(obj3) & i2;
        int iZzc = zzcm.zzc(obj2, iZza);
        if (iZzc == size) {
            zzcm.zze(obj2, iZza, i + 1);
            return;
        }
        while (true) {
            int i5 = iZzc - 1;
            int i6 = iArr[i5];
            int i21 = i6 & i2;
            if (i21 == size) {
                iArr[i5] = ((i + 1) & i2) | (i6 & (~i2));
                return;
            }
            iZzc = i21;
        }
    }

    public final boolean zzo() {
        return this.f41305zze == null;
    }

    public zzcl(int i) {
        zzm(12);
    }
}
