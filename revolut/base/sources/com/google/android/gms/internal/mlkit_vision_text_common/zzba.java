package com.google.android.gms.internal.mlkit_vision_text_common;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes16.dex */
final class zzba extends AbstractMap implements Serializable {

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private static final Object f44465zzd = new Object();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    transient int[] f44466zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    transient Object[] f44467zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    transient Object[] f44468zzc;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    private transient Object f44469zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    private transient int f44470zzf;

    /* JADX INFO: renamed from: zzg, reason: collision with root package name */
    private transient int f44471zzg;

    /* JADX INFO: renamed from: zzh, reason: collision with root package name */
    private transient Set f44472zzh;

    /* JADX INFO: renamed from: zzi, reason: collision with root package name */
    private transient Set f44473zzi;

    /* JADX INFO: renamed from: zzj, reason: collision with root package name */
    private transient Collection f44474zzj;

    public zzba() {
        zzp(3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int[] zzA() {
        int[] iArr = this.f44466zza;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object[] zzB() {
        Object[] objArr = this.f44467zzb;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object[] zzC() {
        Object[] objArr = this.f44468zzc;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    public static /* synthetic */ Object zzg(zzba zzbaVar, int i) {
        return zzbaVar.zzB()[i];
    }

    public static /* synthetic */ Object zzi(zzba zzbaVar) {
        Object obj2 = zzbaVar.f44469zze;
        Objects.requireNonNull(obj2);
        return obj2;
    }

    public static /* synthetic */ Object zzj(zzba zzbaVar, int i) {
        return zzbaVar.zzC()[i];
    }

    public static /* synthetic */ void zzn(zzba zzbaVar, int i, Object obj2) {
        zzbaVar.zzC()[i] = obj2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int zzv() {
        return (1 << (this.f44470zzf & 31)) - 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int zzw(Object obj2) {
        if (zzr()) {
            return -1;
        }
        int iZza = zzbc.zza(obj2);
        int iZzv = zzv();
        Object obj3 = this.f44469zze;
        Objects.requireNonNull(obj3);
        int iZzc = zzbb.zzc(obj3, iZza & iZzv);
        if (iZzc != 0) {
            int i = ~iZzv;
            int i2 = iZza & i;
            do {
                int i3 = iZzc - 1;
                int i5 = zzA()[i3];
                if ((i5 & i) == i2 && zzw.zza(obj2, zzB()[i3])) {
                    return i3;
                }
                iZzc = i5 & iZzv;
            } while (iZzc != 0);
        }
        return -1;
    }

    private final int zzx(int i, int i2, int i3, int i5) {
        int i6 = i2 - 1;
        Object objZzd = zzbb.zzd(i2);
        if (i5 != 0) {
            zzbb.zze(objZzd, i3 & i6, i5 + 1);
        }
        Object obj2 = this.f44469zze;
        Objects.requireNonNull(obj2);
        int[] iArrZzA = zzA();
        for (int i21 = 0; i21 <= i; i21++) {
            int iZzc = zzbb.zzc(obj2, i21);
            while (iZzc != 0) {
                int i22 = iZzc - 1;
                int i32 = iArrZzA[i22];
                int i33 = ((~i) & i32) | i21;
                int i43 = i33 & i6;
                int iZzc2 = zzbb.zzc(objZzd, i43);
                zzbb.zze(objZzd, i43, iZzc);
                iArrZzA[i22] = ((~i6) & i33) | (iZzc2 & i6);
                iZzc = i32 & i;
            }
        }
        this.f44469zze = objZzd;
        zzz(i6);
        return i6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object zzy(Object obj2) {
        if (!zzr()) {
            int iZzv = zzv();
            Object obj3 = this.f44469zze;
            Objects.requireNonNull(obj3);
            int iZzb = zzbb.zzb(obj2, null, iZzv, obj3, zzA(), zzB(), null);
            if (iZzb != -1) {
                Object obj4 = zzC()[iZzb];
                zzq(iZzb, iZzv);
                this.f44471zzg--;
                zzo();
                return obj4;
            }
        }
        return f44465zzd;
    }

    private final void zzz(int i) {
        this.f44470zzf = ((32 - Integer.numberOfLeadingZeros(i)) & 31) | (this.f44470zzf & (-32));
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        if (zzr()) {
            return;
        }
        zzo();
        Map mapZzl = zzl();
        if (mapZzl != null) {
            this.f44470zzf = zzcq.zza(size(), 3, 1073741823);
            mapZzl.clear();
            this.f44469zze = null;
            this.f44471zzg = 0;
            return;
        }
        Arrays.fill(zzB(), 0, this.f44471zzg, (Object) null);
        Arrays.fill(zzC(), 0, this.f44471zzg, (Object) null);
        Object obj2 = this.f44469zze;
        Objects.requireNonNull(obj2);
        if (obj2 instanceof byte[]) {
            Arrays.fill((byte[]) obj2, (byte) 0);
        } else if (obj2 instanceof short[]) {
            Arrays.fill((short[]) obj2, (short) 0);
        } else {
            Arrays.fill((int[]) obj2, 0);
        }
        Arrays.fill(zzA(), 0, this.f44471zzg, 0);
        this.f44471zzg = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj2) {
        Map mapZzl = zzl();
        return mapZzl != null ? mapZzl.containsKey(obj2) : zzw(obj2) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj2) {
        Map mapZzl = zzl();
        if (mapZzl != null) {
            return mapZzl.containsValue(obj2);
        }
        for (int i = 0; i < this.f44471zzg; i++) {
            if (zzw.zza(obj2, zzC()[i])) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        Set set = this.f44473zzi;
        if (set != null) {
            return set;
        }
        zzau zzauVar = new zzau(this);
        this.f44473zzi = zzauVar;
        return zzauVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj2) {
        Map mapZzl = zzl();
        if (mapZzl != null) {
            return mapZzl.get(obj2);
        }
        int iZzw = zzw(obj2);
        if (iZzw == -1) {
            return null;
        }
        return zzC()[iZzw];
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        Set set = this.f44472zzh;
        if (set != null) {
            return set;
        }
        zzax zzaxVar = new zzax(this);
        this.f44472zzh = zzaxVar;
        return zzaxVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj2, Object obj3) {
        int i;
        if (zzr()) {
            zzx.zzd(zzr(), "Arrays already allocated");
            int i2 = this.f44470zzf;
            int iMax = Math.max(i2 + 1, 2);
            int iHighestOneBit = Integer.highestOneBit(iMax);
            if (iMax > iHighestOneBit && (iHighestOneBit = iHighestOneBit + iHighestOneBit) <= 0) {
                iHighestOneBit = 1073741824;
            }
            int iMax2 = Math.max(4, iHighestOneBit);
            this.f44469zze = zzbb.zzd(iMax2);
            zzz(iMax2 - 1);
            this.f44466zza = new int[i2];
            this.f44467zzb = new Object[i2];
            this.f44468zzc = new Object[i2];
        }
        Map mapZzl = zzl();
        if (mapZzl != null) {
            return mapZzl.put(obj2, obj3);
        }
        int[] iArrZzA = zzA();
        Object[] objArrZzB = zzB();
        Object[] objArrZzC = zzC();
        int i3 = this.f44471zzg;
        int i5 = i3 + 1;
        int iZza = zzbc.zza(obj2);
        int iZzv = zzv();
        int i6 = iZza & iZzv;
        Object obj4 = this.f44469zze;
        Objects.requireNonNull(obj4);
        int iZzc = zzbb.zzc(obj4, i6);
        if (iZzc == 0) {
            if (i5 > iZzv) {
                iZzv = zzx(iZzv, zzbb.zza(iZzv), iZza, i3);
            } else {
                Object obj5 = this.f44469zze;
                Objects.requireNonNull(obj5);
                zzbb.zze(obj5, i6, i5);
            }
            i = 1;
        } else {
            int i21 = ~iZzv;
            int i22 = iZza & i21;
            int i32 = 0;
            while (true) {
                int i33 = iZzc - 1;
                int i43 = iArrZzA[i33];
                i = 1;
                int i59 = i43 & i21;
                if (i59 == i22 && zzw.zza(obj2, objArrZzB[i33])) {
                    Object obj6 = objArrZzC[i33];
                    objArrZzC[i33] = obj3;
                    return obj6;
                }
                int i66 = i43 & iZzv;
                i32++;
                if (i66 != 0) {
                    iZzc = i66;
                } else {
                    if (i32 >= 9) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap(zzv() + 1, 1.0f);
                        int iZze = zze();
                        while (iZze >= 0) {
                            linkedHashMap.put(zzB()[iZze], zzC()[iZze]);
                            iZze = zzf(iZze);
                        }
                        this.f44469zze = linkedHashMap;
                        this.f44466zza = null;
                        this.f44467zzb = null;
                        this.f44468zzc = null;
                        zzo();
                        return linkedHashMap.put(obj2, obj3);
                    }
                    if (i5 > iZzv) {
                        iZzv = zzx(iZzv, zzbb.zza(iZzv), iZza, i3);
                    } else {
                        iArrZzA[i33] = (i5 & iZzv) | i59;
                    }
                }
            }
        }
        int length = zzA().length;
        if (i5 > length) {
            int i74 = i;
            int iMin = Math.min(1073741823, (Math.max(i74, length >>> 1) + length) | i74);
            if (iMin != length) {
                this.f44466zza = Arrays.copyOf(zzA(), iMin);
                this.f44467zzb = Arrays.copyOf(zzB(), iMin);
                this.f44468zzc = Arrays.copyOf(zzC(), iMin);
            }
        }
        zzA()[i3] = (~iZzv) & iZza;
        zzB()[i3] = obj2;
        zzC()[i3] = obj3;
        this.f44471zzg = i5;
        zzo();
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj2) {
        Map mapZzl = zzl();
        if (mapZzl != null) {
            return mapZzl.remove(obj2);
        }
        Object objZzy = zzy(obj2);
        if (objZzy == f44465zzd) {
            return null;
        }
        return objZzy;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        Map mapZzl = zzl();
        return mapZzl != null ? mapZzl.size() : this.f44471zzg;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        Collection collection = this.f44474zzj;
        if (collection != null) {
            return collection;
        }
        zzaz zzazVar = new zzaz(this);
        this.f44474zzj = zzazVar;
        return zzazVar;
    }

    public final int zze() {
        return isEmpty() ? -1 : 0;
    }

    public final int zzf(int i) {
        int i2 = i + 1;
        if (i2 < this.f44471zzg) {
            return i2;
        }
        return -1;
    }

    public final Map zzl() {
        Object obj2 = this.f44469zze;
        if (obj2 instanceof Map) {
            return (Map) obj2;
        }
        return null;
    }

    public final void zzo() {
        this.f44470zzf += 32;
    }

    public final void zzp(int i) {
        this.f44470zzf = zzcq.zza(i, 1, 1073741823);
    }

    public final void zzq(int i, int i2) {
        Object obj2 = this.f44469zze;
        Objects.requireNonNull(obj2);
        int[] iArrZzA = zzA();
        Object[] objArrZzB = zzB();
        Object[] objArrZzC = zzC();
        int size = size();
        int i3 = size - 1;
        if (i >= i3) {
            objArrZzB[i] = null;
            objArrZzC[i] = null;
            iArrZzA[i] = 0;
            return;
        }
        int i5 = i + 1;
        Object obj3 = objArrZzB[i3];
        objArrZzB[i] = obj3;
        objArrZzC[i] = objArrZzC[i3];
        objArrZzB[i3] = null;
        objArrZzC[i3] = null;
        iArrZzA[i] = iArrZzA[i3];
        iArrZzA[i3] = 0;
        int iZza = zzbc.zza(obj3) & i2;
        int iZzc = zzbb.zzc(obj2, iZza);
        if (iZzc == size) {
            zzbb.zze(obj2, iZza, i5);
            return;
        }
        while (true) {
            int i6 = iZzc - 1;
            int i21 = iArrZzA[i6];
            int i22 = i21 & i2;
            if (i22 == size) {
                iArrZzA[i6] = (i21 & (~i2)) | (i2 & i5);
                return;
            }
            iZzc = i22;
        }
    }

    public final boolean zzr() {
        return this.f44469zze == null;
    }

    public zzba(int i) {
        zzp(12);
    }
}
