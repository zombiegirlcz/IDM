package com.google.android.gms.internal.play_billing;

import a0.d;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.util.FileSize;
import java.io.Serializable;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes16.dex */
public abstract class zzbz implements Map, Serializable {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private transient zzca f45861zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private transient zzca f45862zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private transient zzbt f45863zzc;

    public static zzbz zzc(Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        zzbr.zza("com.android.vending.billing.PURCHASES_UPDATED", obj3);
        zzbr.zza("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED", obj5);
        zzbr.zza("com.android.vending.billing.ALTERNATIVE_BILLING", obj7);
        return zzci.zzg(3, new Object[]{"com.android.vending.billing.PURCHASES_UPDATED", obj3, "com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED", obj5, "com.android.vending.billing.ALTERNATIVE_BILLING", obj7}, null);
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
        return zzcj.zza(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Set keySet() {
        zzca zzcaVar = this.f45862zzb;
        if (zzcaVar != null) {
            return zzcaVar;
        }
        zzca zzcaVarZze = zze();
        this.f45862zzb = zzcaVarZze;
        return zzcaVarZze;
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

    public abstract zzbt zza();

    @Override // java.util.Map
    /* JADX INFO: renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final zzbt values() {
        zzbt zzbtVar = this.f45863zzc;
        if (zzbtVar != null) {
            return zzbtVar;
        }
        zzbt zzbtVarZza = zza();
        this.f45863zzc = zzbtVarZza;
        return zzbtVarZza;
    }

    public abstract zzca zzd();

    public abstract zzca zze();

    @Override // java.util.Map
    /* JADX INFO: renamed from: zzf, reason: merged with bridge method [inline-methods] */
    public final zzca entrySet() {
        zzca zzcaVar = this.f45861zza;
        if (zzcaVar != null) {
            return zzcaVar;
        }
        zzca zzcaVarZzd = zzd();
        this.f45861zza = zzcaVarZzd;
        return zzcaVarZzd;
    }
}
