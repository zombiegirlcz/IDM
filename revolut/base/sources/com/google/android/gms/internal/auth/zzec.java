package com.google.android.gms.internal.auth;

import a0.d;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes16.dex */
class zzec extends zzeb {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    protected final byte[] f39008zza;

    public zzec(byte[] bArr) {
        bArr.getClass();
        this.f39008zza = bArr;
    }

    @Override // com.google.android.gms.internal.auth.zzef
    public final boolean equals(Object obj2) {
        if (obj2 == this) {
            return true;
        }
        if (!(obj2 instanceof zzef) || zzd() != ((zzef) obj2).zzd()) {
            return false;
        }
        if (zzd() == 0) {
            return true;
        }
        if (!(obj2 instanceof zzec)) {
            return obj2.equals(this);
        }
        zzec zzecVar = (zzec) obj2;
        int iZzj = zzj();
        int iZzj2 = zzecVar.zzj();
        if (iZzj != 0 && iZzj2 != 0 && iZzj != iZzj2) {
            return false;
        }
        int iZzd = zzd();
        if (iZzd > zzecVar.zzd()) {
            throw new IllegalArgumentException("Length too large: " + iZzd + zzd());
        }
        if (iZzd > zzecVar.zzd()) {
            throw new IllegalArgumentException(d.g(iZzd, zzecVar.zzd(), "Ran off end of other: 0, ", ", "));
        }
        byte[] bArr = this.f39008zza;
        byte[] bArr2 = zzecVar.f39008zza;
        zzecVar.zzc();
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

    @Override // com.google.android.gms.internal.auth.zzef
    public byte zza(int i) {
        return this.f39008zza[i];
    }

    @Override // com.google.android.gms.internal.auth.zzef
    public byte zzb(int i) {
        return this.f39008zza[i];
    }

    public int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.auth.zzef
    public int zzd() {
        return this.f39008zza.length;
    }

    @Override // com.google.android.gms.internal.auth.zzef
    public final int zze(int i, int i2, int i3) {
        return zzfa.zzb(i, this.f39008zza, 0, i3);
    }

    @Override // com.google.android.gms.internal.auth.zzef
    public final zzef zzf(int i, int i2) {
        int iZzi = zzef.zzi(0, i2, zzd());
        return iZzi == 0 ? zzef.f39010zzb : new zzdz(this.f39008zza, 0, iZzi);
    }

    @Override // com.google.android.gms.internal.auth.zzef
    public final String zzg(Charset charset) {
        return new String(this.f39008zza, 0, zzd(), charset);
    }

    @Override // com.google.android.gms.internal.auth.zzef
    public final boolean zzh() {
        return zzhn.zzc(this.f39008zza, 0, zzd());
    }
}
