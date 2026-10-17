package com.google.android.gms.internal.auth;

import com.google.android.gms.internal.mlkit_vision_face.a;
import java.util.Map;

/* JADX INFO: loaded from: classes16.dex */
final class zzgp implements Map.Entry, Comparable {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ zzgv f39103zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final Comparable f39104zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private Object f39105zzc;

    public zzgp(zzgv zzgvVar, Comparable comparable, Object obj2) {
        this.f39103zza = zzgvVar;
        this.f39104zzb = comparable;
        this.f39105zzc = obj2;
    }

    private static final boolean zzb(Object obj2, Object obj3) {
        return obj2 == null ? obj3 == null : obj2.equals(obj3);
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj2) {
        return this.f39104zzb.compareTo(((zzgp) obj2).f39104zzb);
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
        return zzb(this.f39104zzb, entry.getKey()) && zzb(this.f39105zzc, entry.getValue());
    }

    @Override // java.util.Map.Entry
    public final /* synthetic */ Object getKey() {
        return this.f39104zzb;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f39105zzc;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f39104zzb;
        int iHashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj2 = this.f39105zzc;
        return iHashCode ^ (obj2 != null ? obj2.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj2) {
        this.f39103zza.zzn();
        Object obj3 = this.f39105zzc;
        this.f39105zzc = obj2;
        return obj3;
    }

    public final String toString() {
        return a.o(String.valueOf(this.f39104zzb), "=", String.valueOf(this.f39105zzc));
    }

    public final Comparable zza() {
        return this.f39104zzb;
    }
}
