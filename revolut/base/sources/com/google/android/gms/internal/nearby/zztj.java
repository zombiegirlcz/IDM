package com.google.android.gms.internal.nearby;

/* JADX INFO: loaded from: classes16.dex */
final class zztj extends zztm {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    static final zztj f45720zza = new zztj();

    private zztj() {
    }

    public final boolean equals(Object obj2) {
        return obj2 == this;
    }

    public final int hashCode() {
        return 2040732332;
    }

    public final String toString() {
        return "Optional.absent()";
    }

    @Override // com.google.android.gms.internal.nearby.zztm
    public final Object zza() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    @Override // com.google.android.gms.internal.nearby.zztm
    public final boolean zzb() {
        return false;
    }
}
