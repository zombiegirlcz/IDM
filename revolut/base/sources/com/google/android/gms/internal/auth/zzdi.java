package com.google.android.gms.internal.auth;

import p.a;

/* JADX INFO: loaded from: classes16.dex */
final class zzdi extends zzdh {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final Object f38985zza;

    public zzdi(Object obj2) {
        this.f38985zza = obj2;
    }

    public final boolean equals(Object obj2) {
        if (obj2 instanceof zzdi) {
            return this.f38985zza.equals(((zzdi) obj2).f38985zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.f38985zza.hashCode() + 1502476572;
    }

    public final String toString() {
        return a.p("Optional.of(", this.f38985zza.toString(), ")");
    }

    @Override // com.google.android.gms.internal.auth.zzdh
    public final Object zza() {
        return this.f38985zza;
    }

    @Override // com.google.android.gms.internal.auth.zzdh
    public final boolean zzb() {
        return true;
    }
}
