package com.google.android.gms.internal.mlkit_vision_common;

import a0.d;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.util.FileSize;
import java.io.Serializable;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes16.dex */
public abstract class zzr implements Map, Serializable {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private transient zzs f43428zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private transient zzs f43429zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private transient zzl f43430zzc;

    public static zzr zzc(Object obj2, Object obj3) {
        zzi.zza("optional-module-barcode", "com.google.android.gms.vision.barcode");
        return zzz.zzg(1, new Object[]{"optional-module-barcode", "com.google.android.gms.vision.barcode"}, null);
    }

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
        return zzaa.zza(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Set keySet() {
        zzs zzsVar = this.f43429zzb;
        if (zzsVar != null) {
            return zzsVar;
        }
        zzs zzsVarZze = zze();
        this.f43429zzb = zzsVarZze;
        return zzsVarZze;
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

    public abstract zzl zza();

    @Override // java.util.Map
    /* JADX INFO: renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final zzl values() {
        zzl zzlVar = this.f43430zzc;
        if (zzlVar != null) {
            return zzlVar;
        }
        zzl zzlVarZza = zza();
        this.f43430zzc = zzlVarZza;
        return zzlVarZza;
    }

    public abstract zzs zzd();

    public abstract zzs zze();

    @Override // java.util.Map
    /* JADX INFO: renamed from: zzf, reason: merged with bridge method [inline-methods] */
    public final zzs entrySet() {
        zzs zzsVar = this.f43428zza;
        if (zzsVar != null) {
            return zzsVar;
        }
        zzs zzsVarZzd = zzd();
        this.f43428zza = zzsVarZzd;
        return zzsVarZzd;
    }
}
