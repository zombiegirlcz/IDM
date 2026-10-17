package com.google.android.gms.internal.play_billing;

import a0.d;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes16.dex */
final class zzet extends zzes {

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final byte[] f45973zzb;

    public zzet(byte[] bArr) {
        super(null);
        bArr.getClass();
        this.f45973zzb = bArr;
    }

    @Override // com.google.android.gms.internal.play_billing.zzev
    public final byte zza(int i) {
        return this.f45973zzb[i];
    }

    @Override // com.google.android.gms.internal.play_billing.zzev
    public final byte zzb(int i) {
        return this.f45973zzb[i];
    }

    @Override // com.google.android.gms.internal.play_billing.zzev
    public final int zzd(int i, int i2, int i3) {
        return zzga.zzb(i, this.f45973zzb, 0, i3);
    }

    @Override // com.google.android.gms.internal.play_billing.zzev
    public final int zze() {
        return this.f45973zzb.length;
    }

    @Override // com.google.android.gms.internal.play_billing.zzev
    public final zzev zzf(int i, int i2) {
        byte[] bArr = this.f45973zzb;
        int iZzj = zzev.zzj(0, i2, bArr.length);
        return iZzj == 0 ? zzev.f45974zza : new zzep(bArr, 0, iZzj);
    }

    @Override // com.google.android.gms.internal.play_billing.zzev
    public final void zzg(zzem zzemVar) throws IOException {
        byte[] bArr = this.f45973zzb;
        ((zzez) zzemVar).zzc(bArr, 0, bArr.length);
    }

    @Override // com.google.android.gms.internal.play_billing.zzev
    public final boolean zzh(zzev zzevVar) {
        boolean z = zzevVar instanceof zzet;
        if (z) {
            return Arrays.equals(this.f45973zzb, ((zzet) zzevVar).f45973zzb);
        }
        boolean z3 = zzevVar instanceof zzep;
        if (!z3) {
            return zzevVar.zzh(this);
        }
        byte[] bArr = this.f45973zzb;
        int iZze = zzevVar.zze();
        int length = bArr.length;
        if (length > iZze) {
            throw new IllegalArgumentException("Length too large: " + length + length);
        }
        if (length > zzevVar.zze()) {
            throw new IllegalArgumentException(d.g(length, zzevVar.zze(), "Ran off end of other: 0, ", ", "));
        }
        if (z) {
            return zzev.zzl(bArr, 0, ((zzet) zzevVar).f45973zzb, 0, length);
        }
        if (!z3) {
            return zzevVar.zzf(0, length).equals(zzf(0, length));
        }
        zzep zzepVar = (zzep) zzevVar;
        return zzev.zzl(bArr, 0, zzepVar.f45970zzb, zzepVar.f45971zzc, length);
    }
}
