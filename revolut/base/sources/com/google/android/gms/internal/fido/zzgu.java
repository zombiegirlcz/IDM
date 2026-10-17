package com.google.android.gms.internal.fido;

import a0.d;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes16.dex */
class zzgu extends zzgt {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    protected final byte[] f39498zza;

    public zzgu(byte[] bArr) {
        bArr.getClass();
        this.f39498zza = bArr;
    }

    @Override // com.google.android.gms.internal.fido.zzgx
    public final boolean equals(Object obj2) {
        if (obj2 == this) {
            return true;
        }
        if (!(obj2 instanceof zzgx) || zzd() != ((zzgx) obj2).zzd()) {
            return false;
        }
        if (zzd() == 0) {
            return true;
        }
        if (!(obj2 instanceof zzgu)) {
            return obj2.equals(this);
        }
        zzgu zzguVar = (zzgu) obj2;
        int iZzk = zzk();
        int iZzk2 = zzguVar.zzk();
        if (iZzk != 0 && iZzk2 != 0 && iZzk != iZzk2) {
            return false;
        }
        int iZzd = zzd();
        if (iZzd > zzguVar.zzd()) {
            throw new IllegalArgumentException("Length too large: " + iZzd + zzd());
        }
        if (iZzd > zzguVar.zzd()) {
            throw new IllegalArgumentException(d.g(iZzd, zzguVar.zzd(), "Ran off end of other: 0, ", ", "));
        }
        byte[] bArr = this.f39498zza;
        byte[] bArr2 = zzguVar.f39498zza;
        int iZzc = zzc() + iZzd;
        int iZzc2 = zzc();
        int iZzc3 = zzguVar.zzc();
        while (iZzc2 < iZzc) {
            if (bArr[iZzc2] != bArr2[iZzc3]) {
                return false;
            }
            iZzc2++;
            iZzc3++;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.fido.zzgx
    public byte zza(int i) {
        return this.f39498zza[i];
    }

    @Override // com.google.android.gms.internal.fido.zzgx
    public byte zzb(int i) {
        return this.f39498zza[i];
    }

    public int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.fido.zzgx
    public int zzd() {
        return this.f39498zza.length;
    }

    @Override // com.google.android.gms.internal.fido.zzgx
    public void zze(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.f39498zza, 0, bArr, 0, i3);
    }

    @Override // com.google.android.gms.internal.fido.zzgx
    public final int zzf(int i, int i2, int i3) {
        int iZzc = zzc();
        byte[] bArr = zzhc.f39524zzd;
        for (int i5 = iZzc; i5 < iZzc + i3; i5++) {
            i = (i * 31) + this.f39498zza[i5];
        }
        return i;
    }

    @Override // com.google.android.gms.internal.fido.zzgx
    public final zzgx zzg(int i, int i2) {
        int iZzj = zzgx.zzj(i, i2, zzd());
        return iZzj == 0 ? zzgx.f39500zzb : new zzgr(this.f39498zza, zzc() + i, iZzj);
    }

    @Override // com.google.android.gms.internal.fido.zzgx
    public final InputStream zzh() {
        return new ByteArrayInputStream(this.f39498zza, zzc(), zzd());
    }

    @Override // com.google.android.gms.internal.fido.zzgx
    public final ByteBuffer zzi() {
        return ByteBuffer.wrap(this.f39498zza, zzc(), zzd()).asReadOnlyBuffer();
    }
}
