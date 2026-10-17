package com.google.android.gms.internal.measurement;

import java.util.AbstractMap;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes16.dex */
class zzoa extends AbstractMap {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private Object[] f40535zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private int f40536zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private Map f40537zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private boolean f40538zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    private volatile zzny f40539zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    private Map f40540zzf;

    private zzoa() {
        Map map = Collections.EMPTY_MAP;
        this.f40537zzc = map;
        this.f40540zzf = map;
    }

    private final int zzl(Comparable comparable) {
        int i = this.f40536zzb;
        int i2 = i - 1;
        int i3 = 0;
        if (i2 >= 0) {
            int iCompareTo = comparable.compareTo(((zznw) this.f40535zza[i2]).zza());
            if (iCompareTo > 0) {
                return -(i + 1);
            }
            if (iCompareTo == 0) {
                return i2;
            }
        }
        while (i3 <= i2) {
            int i5 = (i3 + i2) / 2;
            int iCompareTo2 = comparable.compareTo(((zznw) this.f40535zza[i5]).zza());
            if (iCompareTo2 < 0) {
                i2 = i5 - 1;
            } else {
                if (iCompareTo2 <= 0) {
                    return i5;
                }
                i3 = i5 + 1;
            }
        }
        return -(i3 + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object zzm(int i) {
        zzo();
        Object value = ((zznw) this.f40535zza[i]).getValue();
        Object[] objArr = this.f40535zza;
        System.arraycopy(objArr, i + 1, objArr, i, (this.f40536zzb - i) - 1);
        this.f40536zzb--;
        if (!this.f40537zzc.isEmpty()) {
            Iterator it8 = zzn().entrySet().iterator();
            Object[] objArr2 = this.f40535zza;
            int i2 = this.f40536zzb;
            Map.Entry entry = (Map.Entry) it8.next();
            objArr2[i2] = new zznw(this, (Comparable) entry.getKey(), entry.getValue());
            this.f40536zzb++;
            it8.remove();
        }
        return value;
    }

    private final SortedMap zzn() {
        zzo();
        if (this.f40537zzc.isEmpty() && !(this.f40537zzc instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f40537zzc = treeMap;
            this.f40540zzf = treeMap.descendingMap();
        }
        return (SortedMap) this.f40537zzc;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzo() {
        if (this.f40538zzd) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        zzo();
        if (this.f40536zzb != 0) {
            this.f40535zza = null;
            this.f40536zzb = 0;
        }
        if (this.f40537zzc.isEmpty()) {
            return;
        }
        this.f40537zzc.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj2) {
        Comparable comparable = (Comparable) obj2;
        return zzl(comparable) >= 0 || this.f40537zzc.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.f40539zze == null) {
            this.f40539zze = new zzny(this, null);
        }
        return this.f40539zze;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof zzoa)) {
            return super.equals(obj2);
        }
        zzoa zzoaVar = (zzoa) obj2;
        int size = size();
        if (size != zzoaVar.size()) {
            return false;
        }
        int i = this.f40536zzb;
        if (i != zzoaVar.f40536zzb) {
            return entrySet().equals(zzoaVar.entrySet());
        }
        for (int i2 = 0; i2 < i; i2++) {
            if (!zzg(i2).equals(zzoaVar.zzg(i2))) {
                return false;
            }
        }
        if (i != size) {
            return this.f40537zzc.equals(zzoaVar.f40537zzc);
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj2) {
        Comparable comparable = (Comparable) obj2;
        int iZzl = zzl(comparable);
        return iZzl >= 0 ? ((zznw) this.f40535zza[iZzl]).getValue() : this.f40537zzc.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int i = this.f40536zzb;
        int iHashCode = 0;
        for (int i2 = 0; i2 < i; i2++) {
            iHashCode += this.f40535zza[i2].hashCode();
        }
        return this.f40537zzc.size() > 0 ? this.f40537zzc.hashCode() + iHashCode : iHashCode;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj2) {
        zzo();
        Comparable comparable = (Comparable) obj2;
        int iZzl = zzl(comparable);
        if (iZzl >= 0) {
            return zzm(iZzl);
        }
        if (this.f40537zzc.isEmpty()) {
            return null;
        }
        return this.f40537zzc.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f40537zzc.size() + this.f40536zzb;
    }

    public void zza() {
        if (this.f40538zzd) {
            return;
        }
        this.f40537zzc = this.f40537zzc.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.f40537zzc);
        this.f40540zzf = this.f40540zzf.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.f40540zzf);
        this.f40538zzd = true;
    }

    public final int zzc() {
        return this.f40536zzb;
    }

    public final Iterable zzd() {
        return this.f40537zzc.isEmpty() ? Collections.EMPTY_SET : this.f40537zzc.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: zzf, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj2) {
        zzo();
        int iZzl = zzl(comparable);
        if (iZzl >= 0) {
            return ((zznw) this.f40535zza[iZzl]).setValue(obj2);
        }
        zzo();
        if (this.f40535zza == null) {
            this.f40535zza = new Object[16];
        }
        int i = -(iZzl + 1);
        if (i >= 16) {
            return zzn().put(comparable, obj2);
        }
        if (this.f40536zzb == 16) {
            zznw zznwVar = (zznw) this.f40535zza[15];
            this.f40536zzb = 15;
            zzn().put(zznwVar.zza(), zznwVar.getValue());
        }
        Object[] objArr = this.f40535zza;
        int length = objArr.length;
        System.arraycopy(objArr, i, objArr, i + 1, 15 - i);
        this.f40535zza[i] = new zznw(this, comparable, obj2);
        this.f40536zzb++;
        return null;
    }

    public final Map.Entry zzg(int i) {
        if (i < this.f40536zzb) {
            return (zznw) this.f40535zza[i];
        }
        throw new ArrayIndexOutOfBoundsException(i);
    }

    public final boolean zzj() {
        return this.f40538zzd;
    }

    public /* synthetic */ zzoa(zznz zznzVar) {
        Map map = Collections.EMPTY_MAP;
        this.f40537zzc = map;
        this.f40540zzf = map;
    }
}
