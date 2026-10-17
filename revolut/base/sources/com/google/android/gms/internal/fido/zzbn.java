package com.google.android.gms.internal.fido;

import p.a;

/* JADX INFO: loaded from: classes16.dex */
final class zzbn extends zzbl {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final Object f39308zza;

    public zzbn(Object obj2) {
        this.f39308zza = obj2;
    }

    public final boolean equals(Object obj2) {
        if (obj2 instanceof zzbn) {
            return this.f39308zza.equals(((zzbn) obj2).f39308zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.f39308zza.hashCode() + 1502476572;
    }

    public final String toString() {
        return a.p("Optional.of(", this.f39308zza.toString(), ")");
    }

    @Override // com.google.android.gms.internal.fido.zzbl
    public final Object zza() {
        return this.f39308zza;
    }

    @Override // com.google.android.gms.internal.fido.zzbl
    public final boolean zzb() {
        return true;
    }
}
