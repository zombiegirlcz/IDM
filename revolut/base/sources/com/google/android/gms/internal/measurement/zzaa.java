package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.mlkit_vision_face.a;
import com.google.common.collect.ImmutableSet;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes16.dex */
public final class zzaa {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private static final ImmutableSet f39809zza = ImmutableSet.of("_syn", "_err", "_el");

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private String f39810zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private final long f39811zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private final Map f39812zzd;

    public zzaa(String str, long j2, Map map) {
        this.f39810zzb = str;
        this.f39811zzc = j2;
        HashMap map2 = new HashMap();
        this.f39812zzd = map2;
        if (map != null) {
            map2.putAll(map);
        }
    }

    public static Object zzd(String str, Object obj2, Object obj3) {
        if (f39809zza.contains(str) && (obj3 instanceof Double)) {
            return Long.valueOf(Math.round(((Double) obj3).doubleValue()));
        }
        if (str.startsWith("_")) {
            if (!(obj2 instanceof String) && obj2 != null) {
                return obj2;
            }
        } else if (!(obj2 instanceof Double)) {
            if (obj2 instanceof Long) {
                return Long.valueOf(Math.round(((Double) obj3).doubleValue()));
            }
            if (obj2 instanceof String) {
                return obj3.toString();
            }
        }
        return obj3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof zzaa)) {
            return false;
        }
        zzaa zzaaVar = (zzaa) obj2;
        if (this.f39811zzc == zzaaVar.f39811zzc && this.f39810zzb.equals(zzaaVar.f39810zzb)) {
            return this.f39812zzd.equals(zzaaVar.f39812zzd);
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f39810zzb.hashCode() * 31;
        long j2 = this.f39811zzc;
        return this.f39812zzd.hashCode() + ((iHashCode + ((int) (j2 ^ (j2 >>> 32)))) * 31);
    }

    public final String toString() {
        String str = this.f39810zzb;
        String string = this.f39812zzd.toString();
        StringBuilder sbX = a.x("Event{name='", str, "', timestamp=");
        sbX.append(this.f39811zzc);
        sbX.append(", params=");
        sbX.append(string);
        sbX.append("}");
        return sbX.toString();
    }

    public final long zza() {
        return this.f39811zzc;
    }

    /* JADX INFO: renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final zzaa clone() {
        return new zzaa(this.f39810zzb, this.f39811zzc, new HashMap(this.f39812zzd));
    }

    public final Object zzc(String str) {
        Map map = this.f39812zzd;
        if (map.containsKey(str)) {
            return map.get(str);
        }
        return null;
    }

    public final String zze() {
        return this.f39810zzb;
    }

    public final Map zzf() {
        return this.f39812zzd;
    }

    public final void zzg(String str) {
        this.f39810zzb = str;
    }

    public final void zzh(String str, Object obj2) {
        if (obj2 == null) {
            this.f39812zzd.remove(str);
        } else {
            Map map = this.f39812zzd;
            map.put(str, zzd(str, map.get(str), obj2));
        }
    }
}
