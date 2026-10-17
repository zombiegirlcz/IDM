package com.google.android.gms.internal.nearby;

import p.a;

/* JADX INFO: loaded from: classes16.dex */
final class zztr extends zztm {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final Object f45724zza;

    public zztr(Object obj2) {
        this.f45724zza = obj2;
    }

    public final boolean equals(Object obj2) {
        if (obj2 instanceof zztr) {
            return this.f45724zza.equals(((zztr) obj2).f45724zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.f45724zza.hashCode() + 1502476572;
    }

    public final String toString() {
        return a.p("Optional.of(", this.f45724zza.toString(), ")");
    }

    @Override // com.google.android.gms.internal.nearby.zztm
    public final Object zza() {
        return this.f45724zza;
    }

    @Override // com.google.android.gms.internal.nearby.zztm
    public final boolean zzb() {
        return true;
    }
}
