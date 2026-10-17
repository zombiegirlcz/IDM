package com.google.android.gms.internal.measurement;

import org.bouncycastle.crypto.digests.Blake2xsDigest;

/* JADX INFO: loaded from: classes16.dex */
final class zzlo {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final Object f40426zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final int f40427zzb;

    public zzlo(Object obj2, int i) {
        this.f40426zza = obj2;
        this.f40427zzb = i;
    }

    public final boolean equals(Object obj2) {
        if (!(obj2 instanceof zzlo)) {
            return false;
        }
        zzlo zzloVar = (zzlo) obj2;
        return this.f40426zza == zzloVar.f40426zza && this.f40427zzb == zzloVar.f40427zzb;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.f40426zza) * Blake2xsDigest.UNKNOWN_DIGEST_LENGTH) + this.f40427zzb;
    }
}
