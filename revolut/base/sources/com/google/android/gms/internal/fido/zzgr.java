package com.google.android.gms.internal.fido;

import a0.d;

/* JADX INFO: loaded from: classes16.dex */
final class zzgr extends zzgu {

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private final int f39496zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private final int f39497zzd;

    public zzgr(byte[] bArr, int i, int i2) {
        super(bArr);
        zzgx.zzj(i, i + i2, bArr.length);
        this.f39496zzc = i;
        this.f39497zzd = i2;
    }

    @Override // com.google.android.gms.internal.fido.zzgu, com.google.android.gms.internal.fido.zzgx
    public final byte zza(int i) {
        int i2 = this.f39497zzd;
        if (((i2 - (i + 1)) | i) >= 0) {
            return this.f39498zza[this.f39496zzc + i];
        }
        if (i < 0) {
            throw new ArrayIndexOutOfBoundsException(d.n("Index < 0: ", i));
        }
        throw new ArrayIndexOutOfBoundsException(d.g(i, i2, "Index > length: ", ", "));
    }

    @Override // com.google.android.gms.internal.fido.zzgu, com.google.android.gms.internal.fido.zzgx
    public final byte zzb(int i) {
        return this.f39498zza[this.f39496zzc + i];
    }

    @Override // com.google.android.gms.internal.fido.zzgu
    public final int zzc() {
        return this.f39496zzc;
    }

    @Override // com.google.android.gms.internal.fido.zzgu, com.google.android.gms.internal.fido.zzgx
    public final int zzd() {
        return this.f39497zzd;
    }

    @Override // com.google.android.gms.internal.fido.zzgu, com.google.android.gms.internal.fido.zzgx
    public final void zze(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.f39498zza, this.f39496zzc, bArr, 0, i3);
    }
}
