package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.mlkit_vision_face.a;
import java.util.Map;

/* JADX INFO: loaded from: classes16.dex */
final class zznw implements Map.Entry, Comparable {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ zzoa f40527zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final Comparable f40528zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private Object f40529zzc;

    public zznw(zzoa zzoaVar, Comparable comparable, Object obj2) {
        this.f40527zza = zzoaVar;
        this.f40528zzb = comparable;
        this.f40529zzc = obj2;
    }

    private static final boolean zzb(Object obj2, Object obj3) {
        return obj2 == null ? obj3 == null : obj2.equals(obj3);
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj2) {
        return this.f40528zzb.compareTo(((zznw) obj2).f40528zzb);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj2) {
        if (obj2 == this) {
            return true;
        }
        if (!(obj2 instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj2;
        return zzb(this.f40528zzb, entry.getKey()) && zzb(this.f40529zzc, entry.getValue());
    }

    @Override // java.util.Map.Entry
    public final /* synthetic */ Object getKey() {
        return this.f40528zzb;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f40529zzc;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f40528zzb;
        int iHashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj2 = this.f40529zzc;
        return iHashCode ^ (obj2 != null ? obj2.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj2) {
        this.f40527zza.zzo();
        Object obj3 = this.f40529zzc;
        this.f40529zzc = obj2;
        return obj3;
    }

    public final String toString() {
        return a.o(String.valueOf(this.f40528zzb), "=", String.valueOf(this.f40529zzc));
    }

    public final Comparable zza() {
        return this.f40528zzb;
    }
}
