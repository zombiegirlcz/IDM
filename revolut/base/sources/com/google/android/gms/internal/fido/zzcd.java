package com.google.android.gms.internal.fido;

import a0.d;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.util.FileSize;
import java.io.Serializable;
import java.util.Map;

/* JADX INFO: loaded from: classes16.dex */
public abstract class zzcd implements Map, Serializable {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    static final Map.Entry[] f39325zza = new Map.Entry[0];

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private transient zzcf f39326zzb;

    @Override // java.util.Map
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj2) {
        return get(obj2) != null;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj2) {
        return values().contains(obj2);
    }

    @Override // java.util.Map
    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (obj2 instanceof Map) {
            return entrySet().equals(((Map) obj2).entrySet());
        }
        return false;
    }

    @Override // java.util.Map
    public abstract Object get(Object obj2);

    @Override // java.util.Map
    public final Object getOrDefault(Object obj2, Object obj3) {
        Object obj4 = get(obj2);
        return obj4 != null ? obj4 : obj3;
    }

    @Override // java.util.Map
    public final int hashCode() {
        return zzcy.zza(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    @Deprecated
    public final Object put(Object obj2, Object obj3) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final Object remove(Object obj2) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        int size = size();
        if (size < 0) {
            throw new IllegalArgumentException(d.n("size cannot be negative but was: ", size));
        }
        StringBuilder sb6 = new StringBuilder((int) Math.min(((long) size) * 8, FileSize.GB_COEFFICIENT));
        sb6.append(CoreConstants.CURLY_LEFT);
        boolean z = true;
        for (Map.Entry entry : entrySet()) {
            if (!z) {
                sb6.append(", ");
            }
            sb6.append(entry.getKey());
            sb6.append('=');
            sb6.append(entry.getValue());
            z = false;
        }
        sb6.append(CoreConstants.CURLY_RIGHT);
        return sb6.toString();
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public zzby values() {
        throw null;
    }

    public abstract zzcf zzb();

    @Override // java.util.Map
    /* JADX INFO: renamed from: zzc, reason: merged with bridge method [inline-methods] */
    public final zzcf entrySet() {
        zzcf zzcfVar = this.f39326zzb;
        if (zzcfVar != null) {
            return zzcfVar;
        }
        zzcf zzcfVarZzb = zzb();
        this.f39326zzb = zzcfVarZzb;
        return zzcfVarZzb;
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: zzd, reason: merged with bridge method [inline-methods] */
    public zzcf keySet() {
        throw null;
    }
}
