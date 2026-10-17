package com.google.android.gms.internal.measurement;

import a0.d;

/* JADX INFO: loaded from: classes16.dex */
final class zzky extends zzlb {

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private final int f40405zzc;

    public zzky(byte[] bArr, int i, int i2) {
        super(bArr);
        zzld.zzh(0, i2, bArr.length);
        this.f40405zzc = i2;
    }

    @Override // com.google.android.gms.internal.measurement.zzlb, com.google.android.gms.internal.measurement.zzld
    public final byte zza(int i) {
        int i2 = this.f40405zzc;
        if (((i2 - (i + 1)) | i) >= 0) {
            return ((zzlb) this).f40407zza[i];
        }
        if (i < 0) {
            throw new ArrayIndexOutOfBoundsException(d.n("Index < 0: ", i));
        }
        throw new ArrayIndexOutOfBoundsException(d.g(i, i2, "Index > length: ", ", "));
    }

    @Override // com.google.android.gms.internal.measurement.zzlb, com.google.android.gms.internal.measurement.zzld
    public final byte zzb(int i) {
        return ((zzlb) this).f40407zza[i];
    }

    @Override // com.google.android.gms.internal.measurement.zzlb
    public final int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.measurement.zzlb, com.google.android.gms.internal.measurement.zzld
    public final int zzd() {
        return this.f40405zzc;
    }
}
