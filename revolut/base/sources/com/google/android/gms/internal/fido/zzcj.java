package com.google.android.gms.internal.fido;

import a0.d;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Objects;
import java.util.Set;
import java.util.SortedMap;

/* JADX INFO: loaded from: classes16.dex */
public final class zzcj extends zzcd implements NavigableMap {

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private static final Comparator f39331zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private static final zzcj f39332zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private final transient zzcv f39333zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    private final transient zzcc f39334zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    private final transient zzcj f39335zzf;

    static {
        zzcq zzcqVar = zzcq.f39340zza;
        f39331zzb = zzcqVar;
        zzcv zzcvVarZzs = zzck.zzs(zzcqVar);
        int i = zzcc.f39324zzd;
        f39332zzc = new zzcj(zzcvVarZzs, zzct.f39341zza, null);
    }

    public zzcj(zzcv zzcvVar, zzcc zzccVar, zzcj zzcjVar) {
        this.f39333zzd = zzcvVar;
        this.f39334zze = zzccVar;
        this.f39335zzf = zzcjVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static zzcj zzf(Map map) {
        final Comparator comparator = f39331zzb;
        Comparator comparator2 = map.comparator();
        int i = 1;
        boolean zEquals = comparator2 == null ? true : comparator.equals(comparator2);
        Collection collectionEntrySet = map.entrySet();
        Map.Entry[] entryArr = zzcd.f39325zza;
        if (!(collectionEntrySet instanceof Collection)) {
            Iterator it8 = collectionEntrySet.iterator();
            ArrayList arrayList = new ArrayList();
            it8.getClass();
            while (it8.hasNext()) {
                arrayList.add(it8.next());
            }
            collectionEntrySet = arrayList;
        }
        Map.Entry[] entryArr2 = (Map.Entry[]) collectionEntrySet.toArray(entryArr);
        int length = entryArr2.length;
        if (length == 0) {
            return zzg(comparator);
        }
        if (length == 1) {
            Map.Entry entry = entryArr2[0];
            Objects.requireNonNull(entry);
            Map.Entry entry2 = entry;
            return new zzcj(new zzcv(zzcc.zzj(entry2.getKey()), comparator), zzcc.zzj(entry2.getValue()), null);
        }
        Object[] objArr = new Object[length];
        Object[] objArr2 = new Object[length];
        if (zEquals) {
            for (int i2 = 0; i2 < length; i2++) {
                Map.Entry entry3 = entryArr2[i2];
                Objects.requireNonNull(entry3);
                Map.Entry entry4 = entry3;
                Object key = entry4.getKey();
                Object value = entry4.getValue();
                zzbv.zza(key, value);
                objArr[i2] = key;
                objArr2[i2] = value;
            }
        } else {
            Arrays.sort(entryArr2, 0, length, new Comparator() { // from class: com.google.android.gms.internal.fido.zzcg
                @Override // java.util.Comparator
                public final int compare(Object obj2, Object obj3) {
                    Map.Entry entry5 = (Map.Entry) obj2;
                    Map.Entry entry6 = (Map.Entry) obj3;
                    Objects.requireNonNull(entry5);
                    Objects.requireNonNull(entry6);
                    return comparator.compare(entry5.getKey(), entry6.getKey());
                }
            });
            Map.Entry entry5 = entryArr2[0];
            Objects.requireNonNull(entry5);
            Map.Entry entry6 = entry5;
            Object key2 = entry6.getKey();
            objArr[0] = key2;
            Object value2 = entry6.getValue();
            objArr2[0] = value2;
            zzbv.zza(objArr[0], value2);
            while (i < length) {
                Map.Entry entry7 = entryArr2[i - 1];
                Objects.requireNonNull(entry7);
                Map.Entry entry8 = entry7;
                Map.Entry entry9 = entryArr2[i];
                Objects.requireNonNull(entry9);
                Map.Entry entry10 = entry9;
                Object key3 = entry10.getKey();
                Object value3 = entry10.getValue();
                zzbv.zza(key3, value3);
                objArr[i] = key3;
                objArr2[i] = value3;
                if (comparator.compare(key2, key3) == 0) {
                    throw new IllegalArgumentException(d.s("Multiple entries with same key: ", String.valueOf(entry8), " and ", String.valueOf(entry10)));
                }
                i++;
                key2 = key3;
            }
        }
        return new zzcj(new zzcv(zzcc.zzh(objArr, length), comparator), zzcc.zzh(objArr2, length), null);
    }

    public static zzcj zzg(Comparator comparator) {
        if (zzcq.f39340zza.equals(comparator)) {
            return f39332zzc;
        }
        zzcv zzcvVarZzs = zzck.zzs(comparator);
        int i = zzcc.f39324zzd;
        return new zzcj(zzcvVarZzs, zzct.f39341zza, null);
    }

    private final zzcj zzl(int i, int i2) {
        if (i == 0) {
            if (i2 == this.f39334zze.size()) {
                return this;
            }
            i = 0;
        }
        if (i == i2) {
            return zzg(((zzck) this.f39333zzd).f39336zza);
        }
        return new zzcj(this.f39333zzd.zzw(i, i2), this.f39334zze.subList(i, i2), null);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry ceilingEntry(Object obj2) {
        return tailMap(obj2, true).firstEntry();
    }

    @Override // java.util.NavigableMap
    public final Object ceilingKey(Object obj2) {
        return zzco.zza(ceilingEntry(obj2));
    }

    @Override // java.util.SortedMap
    public final Comparator comparator() {
        return ((zzck) this.f39333zzd).f39336zza;
    }

    @Override // java.util.NavigableMap
    public final /* synthetic */ NavigableSet descendingKeySet() {
        return this.f39333zzd.descendingSet();
    }

    @Override // java.util.NavigableMap
    public final /* bridge */ /* synthetic */ NavigableMap descendingMap() {
        zzcj zzcjVar = this.f39335zzf;
        if (zzcjVar != null) {
            return zzcjVar;
        }
        if (!isEmpty()) {
            return new zzcj((zzcv) this.f39333zzd.descendingSet(), this.f39334zze.zzf(), this);
        }
        Comparator comparator = ((zzck) this.f39333zzd).f39336zza;
        return zzg((comparator instanceof zzcs ? (zzcs) comparator : new zzbw(comparator)).zza());
    }

    @Override // com.google.android.gms.internal.fido.zzcd, java.util.Map
    public final /* bridge */ /* synthetic */ Set entrySet() {
        return entrySet();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry firstEntry() {
        if (isEmpty()) {
            return null;
        }
        return (Map.Entry) entrySet().zzi().get(0);
    }

    @Override // java.util.SortedMap
    public final Object firstKey() {
        return this.f39333zzd.first();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry floorEntry(Object obj2) {
        return headMap(obj2, true).lastEntry();
    }

    @Override // java.util.NavigableMap
    public final Object floorKey(Object obj2) {
        return zzco.zza(floorEntry(obj2));
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0005  */
    @Override // com.google.android.gms.internal.fido.zzcd, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object get(java.lang.Object r4) {
        /*
            r3 = this;
            com.google.android.gms.internal.fido.zzcv r0 = r3.f39333zzd
            r1 = -1
            if (r4 != 0) goto L7
        L5:
            r4 = r1
            goto L12
        L7:
            com.google.android.gms.internal.fido.zzcc r2 = r0.f39352zzd     // Catch: java.lang.ClassCastException -> L5
            java.util.Comparator r0 = r0.f39336zza     // Catch: java.lang.ClassCastException -> L5
            int r4 = java.util.Collections.binarySearch(r2, r4, r0)     // Catch: java.lang.ClassCastException -> L5
            if (r4 >= 0) goto L12
            goto L5
        L12:
            if (r4 != r1) goto L16
            r4 = 0
            return r4
        L16:
            com.google.android.gms.internal.fido.zzcc r0 = r3.f39334zze
            java.lang.Object r4 = r0.get(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.fido.zzcj.get(java.lang.Object):java.lang.Object");
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public final /* synthetic */ SortedMap headMap(Object obj2) {
        return headMap(obj2, false);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry higherEntry(Object obj2) {
        return tailMap(obj2, false).firstEntry();
    }

    @Override // java.util.NavigableMap
    public final Object higherKey(Object obj2) {
        return zzco.zza(higherEntry(obj2));
    }

    @Override // com.google.android.gms.internal.fido.zzcd, java.util.Map
    public final /* synthetic */ Set keySet() {
        return this.f39333zzd;
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lastEntry() {
        if (isEmpty()) {
            return null;
        }
        return (Map.Entry) entrySet().zzi().get(this.f39334zze.size() - 1);
    }

    @Override // java.util.SortedMap
    public final Object lastKey() {
        return this.f39333zzd.last();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lowerEntry(Object obj2) {
        return headMap(obj2, false).lastEntry();
    }

    @Override // java.util.NavigableMap
    public final Object lowerKey(Object obj2) {
        return zzco.zza(lowerEntry(obj2));
    }

    @Override // java.util.NavigableMap
    public final /* synthetic */ NavigableSet navigableKeySet() {
        return this.f39333zzd;
    }

    @Override // java.util.NavigableMap
    @Deprecated
    public final Map.Entry pollFirstEntry() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableMap
    @Deprecated
    public final Map.Entry pollLastEntry() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final int size() {
        return this.f39334zze.size();
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public final /* bridge */ /* synthetic */ SortedMap subMap(Object obj2, Object obj3) {
        return subMap(obj2, true, obj3, false);
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public final /* synthetic */ SortedMap tailMap(Object obj2) {
        return tailMap(obj2, true);
    }

    @Override // com.google.android.gms.internal.fido.zzcd, java.util.Map
    public final /* synthetic */ Collection values() {
        return this.f39334zze;
    }

    @Override // com.google.android.gms.internal.fido.zzcd
    /* JADX INFO: renamed from: zza */
    public final zzby values() {
        return this.f39334zze;
    }

    @Override // com.google.android.gms.internal.fido.zzcd
    public final zzcf zzb() {
        return isEmpty() ? zzcu.f39344zza : new zzci(this);
    }

    @Override // com.google.android.gms.internal.fido.zzcd
    /* JADX INFO: renamed from: zzd */
    public final /* synthetic */ zzcf keySet() {
        return this.f39333zzd;
    }

    @Override // java.util.NavigableMap
    /* JADX INFO: renamed from: zzh, reason: merged with bridge method [inline-methods] */
    public final zzcj headMap(Object obj2, boolean z) {
        obj2.getClass();
        return zzl(0, this.f39333zzd.zzu(obj2, z));
    }

    @Override // java.util.NavigableMap
    /* JADX INFO: renamed from: zzi, reason: merged with bridge method [inline-methods] */
    public final zzcj subMap(Object obj2, boolean z, Object obj3, boolean z3) {
        obj2.getClass();
        obj3.getClass();
        if (((zzck) this.f39333zzd).f39336zza.compare(obj2, obj3) <= 0) {
            return headMap(obj3, z3).tailMap(obj2, z);
        }
        throw new IllegalArgumentException(zzbo.zza("expected fromKey <= toKey but %s > %s", obj2, obj3));
    }

    @Override // java.util.NavigableMap
    /* JADX INFO: renamed from: zzj, reason: merged with bridge method [inline-methods] */
    public final zzcj tailMap(Object obj2, boolean z) {
        obj2.getClass();
        return zzl(this.f39333zzd.zzv(obj2, z), this.f39334zze.size());
    }
}
