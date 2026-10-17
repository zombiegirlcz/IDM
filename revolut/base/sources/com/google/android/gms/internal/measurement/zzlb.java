package com.google.android.gms.internal.measurement;

import a0.d;
import java.io.IOException;

/* JADX INFO: loaded from: classes16.dex */
class zzlb extends zzla {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    protected final byte[] f40407zza;

    public zzlb(byte[] bArr) {
        super(null);
        bArr.getClass();
        this.f40407zza = bArr;
    }

    @Override // com.google.android.gms.internal.measurement.zzld
    public final boolean equals(Object obj2) {
        if (obj2 == this) {
            return true;
        }
        if (!(obj2 instanceof zzld) || zzd() != ((zzld) obj2).zzd()) {
            return false;
        }
        if (zzd() == 0) {
            return true;
        }
        if (!(obj2 instanceof zzlb)) {
            return obj2.equals(this);
        }
        zzlb zzlbVar = (zzlb) obj2;
        int iZzi = zzi();
        int iZzi2 = zzlbVar.zzi();
        if (iZzi != 0 && iZzi2 != 0 && iZzi != iZzi2) {
            return false;
        }
        int iZzd = zzd();
        if (iZzd > zzlbVar.zzd()) {
            throw new IllegalArgumentException("Length too large: " + iZzd + zzd());
        }
        if (iZzd > zzlbVar.zzd()) {
            throw new IllegalArgumentException(d.g(iZzd, zzlbVar.zzd(), "Ran off end of other: 0, ", ", "));
        }
        byte[] bArr = this.f40407zza;
        byte[] bArr2 = zzlbVar.f40407zza;
        zzlbVar.zzc();
        int i = 0;
        int i2 = 0;
        while (i < iZzd) {
            if (bArr[i] != bArr2[i2]) {
                return false;
            }
            i++;
            i2++;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zzld
    public byte zza(int i) {
        return this.f40407zza[i];
    }

    @Override // com.google.android.gms.internal.measurement.zzld
    public byte zzb(int i) {
        return this.f40407zza[i];
    }

    public int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.measurement.zzld
    public int zzd() {
        return this.f40407zza.length;
    }

    @Override // com.google.android.gms.internal.measurement.zzld
    public final int zze(int i, int i2, int i3) {
        return zzmk.zzb(i, this.f40407zza, 0, i3);
    }

    @Override // com.google.android.gms.internal.measurement.zzld
    public final zzld zzf(int i, int i2) {
        int iZzh = zzld.zzh(0, i2, zzd());
        return iZzh == 0 ? zzld.f40408zzb : new zzky(this.f40407zza, 0, iZzh);
    }

    @Override // com.google.android.gms.internal.measurement.zzld
    public final void zzg(zzkv zzkvVar) throws IOException {
        ((zzlh) zzkvVar).zzc(this.f40407zza, 0, zzd());
    }
}
