package com.google.android.gms.internal.fido;

import org.bouncycastle.asn1.BERTags;

/* JADX INFO: loaded from: classes16.dex */
public final class zzhr {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final byte f39537zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final byte f39538zzb;

    public zzhr(int i) {
        this.f39537zza = (byte) (i & BERTags.FLAGS);
        this.f39538zzb = (byte) (i & 31);
    }

    public final byte zza() {
        return this.f39538zzb;
    }

    public final byte zzb() {
        return this.f39537zza;
    }

    public final int zzc() {
        return (this.f39537zza >> 5) & 7;
    }
}
