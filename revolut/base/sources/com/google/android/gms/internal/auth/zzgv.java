package com.google.android.gms.internal.auth;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes16.dex */
class zzgv extends AbstractMap {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final int f39111zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private List f39112zzb = Collections.EMPTY_LIST;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private Map f39113zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private boolean f39114zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    private volatile zzgt f39115zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    private Map f39116zzf;

    public /* synthetic */ zzgv(int i, zzgu zzguVar) {
        this.f39111zza = i;
        Map map = Collections.EMPTY_MAP;
        this.f39113zzc = map;
        this.f39116zzf = map;
    }

    private final int zzk(Comparable comparable) {
        int size = this.f39112zzb.size();
        int i = size - 1;
        int i2 = 0;
        if (i >= 0) {
            int iCompareTo = comparable.compareTo(((zzgp) this.f39112zzb.get(i)).zza());
            if (iCompareTo > 0) {
                return -(size + 1);
            }
            if (iCompareTo == 0) {
                return i;
            }
        }
        while (i2 <= i) {
            int i3 = (i2 + i) / 2;
            int iCompareTo2 = comparable.compareTo(((zzgp) this.f39112zzb.get(i3)).zza());
            if (iCompareTo2 < 0) {
                i = i3 - 1;
            } else {
                if (iCompareTo2 <= 0) {
                    return i3;
                }
                i2 = i3 + 1;
            }
        }
        return -(i2 + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object zzl(int i) {
        zzn();
        Object value = ((zzgp) this.f39112zzb.remove(i)).getValue();
        if (!this.f39113zzc.isEmpty()) {
            Iterator it8 = zzm().entrySet().iterator();
            List list = this.f39112zzb;
            Map.Entry entry = (Map.Entry) it8.next();
            list.add(new zzgp(this, (Comparable) entry.getKey(), entry.getValue()));
            it8.remove();
        }
        return value;
    }

    private final SortedMap zzm() {
        zzn();
        if (this.f39113zzc.isEmpty() && !(this.f39113zzc instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f39113zzc = treeMap;
            this.f39116zzf = treeMap.descendingMap();
        }
        return (SortedMap) this.f39113zzc;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzn() {
        if (this.f39114zzd) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        zzn();
        if (!this.f39112zzb.isEmpty()) {
            this.f39112zzb.clear();
        }
        if (this.f39113zzc.isEmpty()) {
            return;
        }
        this.f39113zzc.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj2) {
        Comparable comparable = (Comparable) obj2;
        return zzk(comparable) >= 0 || this.f39113zzc.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.f39115zze == null) {
            this.f39115zze = new zzgt(this, null);
        }
        return this.f39115zze;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof zzgv)) {
            return super.equals(obj2);
        }
        zzgv zzgvVar = (zzgv) obj2;
        int size = size();
        if (size != zzgvVar.size()) {
            return false;
        }
        int iZzb = zzb();
        if (iZzb != zzgvVar.zzb()) {
            return entrySet().equals(zzgvVar.entrySet());
        }
        for (int i = 0; i < iZzb; i++) {
            if (!zzg(i).equals(zzgvVar.zzg(i))) {
                return false;
            }
        }
        if (iZzb != size) {
            return this.f39113zzc.equals(zzgvVar.f39113zzc);
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj2) {
        Comparable comparable = (Comparable) obj2;
        int iZzk = zzk(comparable);
        return iZzk >= 0 ? ((zzgp) this.f39112zzb.get(iZzk)).getValue() : this.f39113zzc.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int iZzb = zzb();
        int iHashCode = 0;
        for (int i = 0; i < iZzb; i++) {
            iHashCode += ((zzgp) this.f39112zzb.get(i)).hashCode();
        }
        return this.f39113zzc.size() > 0 ? this.f39113zzc.hashCode() + iHashCode : iHashCode;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj2) {
        zzn();
        Comparable comparable = (Comparable) obj2;
        int iZzk = zzk(comparable);
        if (iZzk >= 0) {
            return zzl(iZzk);
        }
        if (this.f39113zzc.isEmpty()) {
            return null;
        }
        return this.f39113zzc.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f39113zzc.size() + this.f39112zzb.size();
    }

    public void zza() {
        if (this.f39114zzd) {
            return;
        }
        this.f39113zzc = this.f39113zzc.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.f39113zzc);
        this.f39116zzf = this.f39116zzf.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.f39116zzf);
        this.f39114zzd = true;
    }

    public final int zzb() {
        return this.f39112zzb.size();
    }

    public final Iterable zzc() {
        return this.f39113zzc.isEmpty() ? zzgo.zza() : this.f39113zzc.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: zze, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj2) {
        zzn();
        int iZzk = zzk(comparable);
        if (iZzk >= 0) {
            return ((zzgp) this.f39112zzb.get(iZzk)).setValue(obj2);
        }
        zzn();
        if (this.f39112zzb.isEmpty() && !(this.f39112zzb instanceof ArrayList)) {
            this.f39112zzb = new ArrayList(this.f39111zza);
        }
        int i = -(iZzk + 1);
        if (i >= this.f39111zza) {
            return zzm().put(comparable, obj2);
        }
        int size = this.f39112zzb.size();
        int i2 = this.f39111zza;
        if (size == i2) {
            zzgp zzgpVar = (zzgp) this.f39112zzb.remove(i2 - 1);
            zzm().put(zzgpVar.zza(), zzgpVar.getValue());
        }
        this.f39112zzb.add(i, new zzgp(this, comparable, obj2));
        return null;
    }

    public final Map.Entry zzg(int i) {
        return (Map.Entry) this.f39112zzb.get(i);
    }

    public final boolean zzj() {
        return this.f39114zzd;
    }
}
