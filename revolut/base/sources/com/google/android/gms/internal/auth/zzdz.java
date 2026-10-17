package com.google.android.gms.internal.auth;

import a0.d;

/* JADX INFO: loaded from: classes16.dex */
final class zzdz extends zzec {

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private final int f39007zzc;

    public zzdz(byte[] bArr, int i, int i2) {
        super(bArr);
        zzef.zzi(0, i2, bArr.length);
        this.f39007zzc = i2;
    }

    @Override // com.google.android.gms.internal.auth.zzec, com.google.android.gms.internal.auth.zzef
    public final byte zza(int i) {
        int i2 = this.f39007zzc;
        if (((i2 - (i + 1)) | i) >= 0) {
            return this.f39008zza[i];
        }
        if (i < 0) {
            throw new ArrayIndexOutOfBoundsException(d.n("Index < 0: ", i));
        }
        throw new ArrayIndexOutOfBoundsException(d.g(i, i2, "Index > length: ", ", "));
    }

    @Override // com.google.android.gms.internal.auth.zzec, com.google.android.gms.internal.auth.zzef
    public final byte zzb(int i) {
        return this.f39008zza[i];
    }

    @Override // com.google.android.gms.internal.auth.zzec
    public final int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.auth.zzec, com.google.android.gms.internal.auth.zzef
    public final int zzd() {
        return this.f39007zzc;
    }
}
