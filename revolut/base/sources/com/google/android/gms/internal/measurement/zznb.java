package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes16.dex */
public final class zznb extends LinkedHashMap {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private static final zznb f40492zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private boolean f40493zzb;

    static {
        zznb zznbVar = new zznb();
        f40492zza = zznbVar;
        zznbVar.f40493zzb = false;
    }

    private zznb() {
        this.f40493zzb = true;
    }

    public static zznb zza() {
        return f40492zza;
    }

    private static int zzf(Object obj2) {
        if (!(obj2 instanceof byte[])) {
            if (obj2 instanceof zzmf) {
                throw new UnsupportedOperationException();
            }
            return obj2.hashCode();
        }
        byte[] bArr = (byte[]) obj2;
        int length = bArr.length;
        int iZzb = zzmk.zzb(length, bArr, 0, length);
        if (iZzb == 0) {
            return 1;
        }
        return iZzb;
    }

    private final void zzg() {
        if (!this.f40493zzb) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        zzg();
        super.clear();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return isEmpty() ? Collections.EMPTY_SET : super.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj2) {
        if (!(obj2 instanceof Map)) {
            return false;
        }
        Map map = (Map) obj2;
        if (this == map) {
            return true;
        }
        if (size() != map.size()) {
            return false;
        }
        Iterator it8 = entrySet().iterator();
        while (it8.hasNext()) {
            Map.Entry entry = (Map.Entry) it8.next();
            if (!map.containsKey(entry.getKey())) {
                return false;
            }
            Object value = entry.getValue();
            Object obj3 = map.get(entry.getKey());
            if (!(((value instanceof byte[]) && (obj3 instanceof byte[])) ? Arrays.equals((byte[]) value, (byte[]) obj3) : value.equals(obj3))) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        Iterator it8 = entrySet().iterator();
        int iZzf = 0;
        while (it8.hasNext()) {
            Map.Entry entry = (Map.Entry) it8.next();
            iZzf += zzf(entry.getValue()) ^ zzf(entry.getKey());
        }
        return iZzf;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object put(Object obj2, Object obj3) {
        zzg();
        byte[] bArr = zzmk.f40466zzb;
        obj2.getClass();
        obj3.getClass();
        return super.put(obj2, obj3);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        zzg();
        for (Object obj2 : map.keySet()) {
            byte[] bArr = zzmk.f40466zzb;
            obj2.getClass();
            map.get(obj2).getClass();
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj2) {
        zzg();
        return super.remove(obj2);
    }

    public final zznb zzb() {
        return isEmpty() ? new zznb() : new zznb(this);
    }

    public final void zzc() {
        this.f40493zzb = false;
    }

    public final void zzd(zznb zznbVar) {
        zzg();
        if (zznbVar.isEmpty()) {
            return;
        }
        putAll(zznbVar);
    }

    public final boolean zze() {
        return this.f40493zzb;
    }

    private zznb(Map map) {
        super(map);
        this.f40493zzb = true;
    }
}
