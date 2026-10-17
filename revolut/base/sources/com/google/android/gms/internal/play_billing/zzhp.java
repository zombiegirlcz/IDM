package com.google.android.gms.internal.play_billing;

import com.google.android.gms.internal.mlkit_vision_face.a;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes16.dex */
final class zzhp implements Map.Entry, Comparable {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ zzht f46100zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final Comparable f46101zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private Object f46102zzc;

    public zzhp(zzht zzhtVar, Comparable comparable, Object obj2) {
        Objects.requireNonNull(zzhtVar);
        this.f46100zza = zzhtVar;
        this.f46101zzb = comparable;
        this.f46102zzc = obj2;
    }

    private static final boolean zzb(Object obj2, Object obj3) {
        return obj2 == null ? obj3 == null : obj2.equals(obj3);
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj2) {
        return this.f46101zzb.compareTo(((zzhp) obj2).f46101zzb);
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
        return zzb(this.f46101zzb, entry.getKey()) && zzb(this.f46102zzc, entry.getValue());
    }

    @Override // java.util.Map.Entry
    public final /* synthetic */ Object getKey() {
        return this.f46101zzb;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f46102zzc;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f46101zzb;
        int iHashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj2 = this.f46102zzc;
        return iHashCode ^ (obj2 != null ? obj2.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj2) {
        this.f46100zza.zzo();
        Object obj3 = this.f46102zzc;
        this.f46102zzc = obj2;
        return obj3;
    }

    public final String toString() {
        return a.o(String.valueOf(this.f46101zzb), "=", String.valueOf(this.f46102zzc));
    }

    public final Comparable zza() {
        return this.f46101zzb;
    }
}
