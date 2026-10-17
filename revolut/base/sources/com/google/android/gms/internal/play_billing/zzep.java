package com.google.android.gms.internal.play_billing;

import a0.d;
import java.io.IOException;

/* JADX INFO: loaded from: classes16.dex */
final class zzep extends zzes {

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final byte[] f45970zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private final int f45971zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private final int f45972zzd;

    public zzep(byte[] bArr, int i, int i2) {
        super(null);
        zzev.zzj(i, i + i2, bArr.length);
        this.f45970zzb = bArr;
        this.f45971zzc = i;
        this.f45972zzd = i2;
    }

    @Override // com.google.android.gms.internal.play_billing.zzev
    public final byte zza(int i) {
        int i2 = this.f45972zzd;
        if (((i2 - (i + 1)) | i) >= 0) {
            return this.f45970zzb[this.f45971zzc + i];
        }
        if (i < 0) {
            throw new ArrayIndexOutOfBoundsException(d.n("Index < 0: ", i));
        }
        throw new ArrayIndexOutOfBoundsException(d.g(i, i2, "Index > length: ", ", "));
    }

    @Override // com.google.android.gms.internal.play_billing.zzev
    public final byte zzb(int i) {
        return this.f45970zzb[this.f45971zzc + i];
    }

    @Override // com.google.android.gms.internal.play_billing.zzev
    public final int zzd(int i, int i2, int i3) {
        return zzga.zzb(i, this.f45970zzb, this.f45971zzc, i3);
    }

    @Override // com.google.android.gms.internal.play_billing.zzev
    public final int zze() {
        return this.f45972zzd;
    }

    @Override // com.google.android.gms.internal.play_billing.zzev
    public final zzev zzf(int i, int i2) {
        int iZzj = zzev.zzj(i, i2, this.f45972zzd);
        return iZzj == 0 ? zzev.f45974zza : new zzep(this.f45970zzb, this.f45971zzc + i, iZzj);
    }

    @Override // com.google.android.gms.internal.play_billing.zzev
    public final void zzg(zzem zzemVar) throws IOException {
        ((zzez) zzemVar).zzc(this.f45970zzb, this.f45971zzc, this.f45972zzd);
    }

    @Override // com.google.android.gms.internal.play_billing.zzev
    public final boolean zzh(zzev zzevVar) {
        boolean z = zzevVar instanceof zzet;
        if (!z && !(zzevVar instanceof zzep)) {
            return zzevVar.zzh(this);
        }
        int i = this.f45972zzd;
        if (i > zzevVar.zze()) {
            throw new IllegalArgumentException("Length too large: " + i + i);
        }
        if (i > zzevVar.zze()) {
            throw new IllegalArgumentException(d.g(i, zzevVar.zze(), "Ran off end of other: 0, ", ", "));
        }
        if (z) {
            return zzev.zzl(this.f45970zzb, this.f45971zzc, ((zzet) zzevVar).f45973zzb, 0, i);
        }
        if (zzevVar instanceof zzep) {
            zzep zzepVar = (zzep) zzevVar;
            return zzev.zzl(this.f45970zzb, this.f45971zzc, zzepVar.f45970zzb, zzepVar.f45971zzc, i);
        }
        zzev zzevVarZzf = zzevVar.zzf(0, i);
        int i2 = this.f45971zzc;
        return zzevVarZzf.equals(zzf(i2, i + i2));
    }
}
