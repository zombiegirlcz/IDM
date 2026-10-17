package com.google.android.gms.internal.play_billing;

import java.util.AbstractMap;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes16.dex */
class zzht extends AbstractMap {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private Object[] f46108zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private int f46109zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private Map f46110zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private boolean f46111zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    private volatile zzhr f46112zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    private Map f46113zzf;

    private zzht() {
        Map map = Collections.EMPTY_MAP;
        this.f46110zzc = map;
        this.f46113zzf = map;
    }

    private final int zzl(Comparable comparable) {
        int i = this.f46109zzb;
        int i2 = i - 1;
        int i3 = 0;
        if (i2 >= 0) {
            int iCompareTo = comparable.compareTo(((zzhp) this.f46108zza[i2]).zza());
            if (iCompareTo > 0) {
                return -(i + 1);
            }
            if (iCompareTo == 0) {
                return i2;
            }
        }
        while (i3 <= i2) {
            int i5 = (i3 + i2) / 2;
            int iCompareTo2 = comparable.compareTo(((zzhp) this.f46108zza[i5]).zza());
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
        Object value = ((zzhp) this.f46108zza[i]).getValue();
        Object[] objArr = this.f46108zza;
        System.arraycopy(objArr, i + 1, objArr, i, (this.f46109zzb - i) - 1);
        this.f46109zzb--;
        if (!this.f46110zzc.isEmpty()) {
            Iterator it8 = zzn().entrySet().iterator();
            Object[] objArr2 = this.f46108zza;
            int i2 = this.f46109zzb;
            Map.Entry entry = (Map.Entry) it8.next();
            objArr2[i2] = new zzhp(this, (Comparable) entry.getKey(), entry.getValue());
            this.f46109zzb++;
            it8.remove();
        }
        return value;
    }

    private final SortedMap zzn() {
        zzo();
        if (this.f46110zzc.isEmpty() && !(this.f46110zzc instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f46110zzc = treeMap;
            this.f46113zzf = treeMap.descendingMap();
        }
        return (SortedMap) this.f46110zzc;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzo() {
        if (this.f46111zzd) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        zzo();
        if (this.f46109zzb != 0) {
            this.f46108zza = null;
            this.f46109zzb = 0;
        }
        if (this.f46110zzc.isEmpty()) {
            return;
        }
        this.f46110zzc.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj2) {
        Comparable comparable = (Comparable) obj2;
        return zzl(comparable) >= 0 || this.f46110zzc.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.f46112zze == null) {
            this.f46112zze = new zzhr(this, null);
        }
        return this.f46112zze;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof zzht)) {
            return super.equals(obj2);
        }
        zzht zzhtVar = (zzht) obj2;
        int size = size();
        if (size != zzhtVar.size()) {
            return false;
        }
        int i = this.f46109zzb;
        if (i != zzhtVar.f46109zzb) {
            return entrySet().equals(zzhtVar.entrySet());
        }
        for (int i2 = 0; i2 < i; i2++) {
            if (!zzg(i2).equals(zzhtVar.zzg(i2))) {
                return false;
            }
        }
        if (i != size) {
            return this.f46110zzc.equals(zzhtVar.f46110zzc);
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj2) {
        Comparable comparable = (Comparable) obj2;
        int iZzl = zzl(comparable);
        return iZzl >= 0 ? ((zzhp) this.f46108zza[iZzl]).getValue() : this.f46110zzc.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int i = this.f46109zzb;
        int iHashCode = 0;
        for (int i2 = 0; i2 < i; i2++) {
            iHashCode += this.f46108zza[i2].hashCode();
        }
        return this.f46110zzc.size() > 0 ? this.f46110zzc.hashCode() + iHashCode : iHashCode;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj2) {
        zzo();
        Comparable comparable = (Comparable) obj2;
        int iZzl = zzl(comparable);
        if (iZzl >= 0) {
            return zzm(iZzl);
        }
        if (this.f46110zzc.isEmpty()) {
            return null;
        }
        return this.f46110zzc.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f46110zzc.size() + this.f46109zzb;
    }

    public void zza() {
        if (this.f46111zzd) {
            return;
        }
        this.f46110zzc = this.f46110zzc.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.f46110zzc);
        this.f46113zzf = this.f46113zzf.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.f46113zzf);
        this.f46111zzd = true;
    }

    public final int zzc() {
        return this.f46109zzb;
    }

    public final Iterable zzd() {
        return this.f46110zzc.isEmpty() ? Collections.EMPTY_SET : this.f46110zzc.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: zzf, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj2) {
        zzo();
        int iZzl = zzl(comparable);
        if (iZzl >= 0) {
            return ((zzhp) this.f46108zza[iZzl]).setValue(obj2);
        }
        zzo();
        if (this.f46108zza == null) {
            this.f46108zza = new Object[16];
        }
        int i = -(iZzl + 1);
        if (i >= 16) {
            return zzn().put(comparable, obj2);
        }
        if (this.f46109zzb == 16) {
            zzhp zzhpVar = (zzhp) this.f46108zza[15];
            this.f46109zzb = 15;
            zzn().put(zzhpVar.zza(), zzhpVar.getValue());
        }
        Object[] objArr = this.f46108zza;
        int length = objArr.length;
        System.arraycopy(objArr, i, objArr, i + 1, 15 - i);
        this.f46108zza[i] = new zzhp(this, comparable, obj2);
        this.f46109zzb++;
        return null;
    }

    public final Map.Entry zzg(int i) {
        if (i < this.f46109zzb) {
            return (zzhp) this.f46108zza[i];
        }
        throw new ArrayIndexOutOfBoundsException(i);
    }

    public final boolean zzj() {
        return this.f46111zzd;
    }

    public /* synthetic */ zzht(zzhs zzhsVar) {
        Map map = Collections.EMPTY_MAP;
        this.f46110zzc = map;
        this.f46113zzf = map;
    }
}
