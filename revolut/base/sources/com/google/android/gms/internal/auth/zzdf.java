package com.google.android.gms.internal.auth;

/* JADX INFO: loaded from: classes16.dex */
final class zzdf extends zzdh {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    static final zzdf f38984zza = new zzdf();

    private zzdf() {
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

    @Override // com.google.android.gms.internal.auth.zzdh
    public final Object zza() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    @Override // com.google.android.gms.internal.auth.zzdh
    public final boolean zzb() {
        return false;
    }
}
