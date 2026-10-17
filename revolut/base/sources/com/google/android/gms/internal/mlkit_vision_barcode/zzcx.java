package com.google.android.gms.internal.mlkit_vision_barcode;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.util.FileSize;
import java.io.Serializable;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzcx implements Map, Serializable {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private transient zzcy f41323zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private transient zzcy f41324zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private transient zzcq f41325zzc;

    public static zzcx zzc(Object obj2, Object obj3) {
        zzcb.zzb("optional-module-barcode", "com.google.android.gms.vision.barcode");
        return zzds.zzg(1, new Object[]{"optional-module-barcode", "com.google.android.gms.vision.barcode"}, null);
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
        return zzdv.zza(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Set keySet() {
        zzcy zzcyVar = this.f41324zzb;
        if (zzcyVar != null) {
            return zzcyVar;
        }
        zzcy zzcyVarZze = zze();
        this.f41324zzb = zzcyVarZze;
        return zzcyVarZze;
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
        zzcb.zza(size, "size");
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

    public abstract zzcq zza();

    @Override // java.util.Map
    /* JADX INFO: renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final zzcq values() {
        zzcq zzcqVar = this.f41325zzc;
        if (zzcqVar != null) {
            return zzcqVar;
        }
        zzcq zzcqVarZza = zza();
        this.f41325zzc = zzcqVarZza;
        return zzcqVarZza;
    }

    public abstract zzcy zzd();

    public abstract zzcy zze();

    @Override // java.util.Map
    /* JADX INFO: renamed from: zzf, reason: merged with bridge method [inline-methods] */
    public final zzcy entrySet() {
        zzcy zzcyVar = this.f41323zza;
        if (zzcyVar != null) {
            return zzcyVar;
        }
        zzcy zzcyVarZzd = zzd();
        this.f41323zza = zzcyVarZzd;
        return zzcyVarZzd;
    }
}
