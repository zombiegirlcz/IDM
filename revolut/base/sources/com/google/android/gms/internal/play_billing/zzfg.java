package com.google.android.gms.internal.play_billing;

import org.bouncycastle.crypto.digests.Blake2xsDigest;

/* JADX INFO: loaded from: classes16.dex */
final class zzfg {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final Object f45991zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final int f45992zzb;

    public zzfg(Object obj2, int i) {
        this.f45991zza = obj2;
        this.f45992zzb = i;
    }

    public final boolean equals(Object obj2) {
        if (!(obj2 instanceof zzfg)) {
            return false;
        }
        zzfg zzfgVar = (zzfg) obj2;
        return this.f45991zza == zzfgVar.f45991zza && this.f45992zzb == zzfgVar.f45992zzb;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.f45991zza) * Blake2xsDigest.UNKNOWN_DIGEST_LENGTH) + this.f45992zzb;
    }
}
