package com.google.android.gms.internal.fido;

import com.google.common.primitives.UnsignedBytes;
import java.io.IOException;
import java.math.RoundingMode;
import java.util.Objects;

/* JADX INFO: loaded from: classes16.dex */
class zzge extends zzgf {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private volatile zzgf f39479zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final zzgb f39480zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    final Character f39481zzc;

    public zzge(zzgb zzgbVar, Character ch5) {
        this.f39480zzb = zzgbVar;
        if (ch5 != null && zzgbVar.zzc('=')) {
            throw new IllegalArgumentException(zzbo.zza("Padding character %s was already in alphabet", ch5));
        }
        this.f39481zzc = ch5;
    }

    public final boolean equals(Object obj2) {
        if (obj2 instanceof zzge) {
            zzge zzgeVar = (zzge) obj2;
            if (this.f39480zzb.equals(zzgeVar.f39480zzb) && Objects.equals(this.f39481zzc, zzgeVar.f39481zzc)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Character ch5 = this.f39481zzc;
        return Objects.hashCode(ch5) ^ this.f39480zzb.hashCode();
    }

    public final String toString() {
        StringBuilder sb6 = new StringBuilder("BaseEncoding.");
        sb6.append(this.f39480zzb);
        if (8 % this.f39480zzb.f39471zzb != 0) {
            if (this.f39481zzc == null) {
                sb6.append(".omitPadding()");
            } else {
                sb6.append(".withPadChar('");
                sb6.append(this.f39481zzc);
                sb6.append("')");
            }
        }
        return sb6.toString();
    }

    public zzgf zza(zzgb zzgbVar, Character ch5) {
        return new zzge(zzgbVar, ch5);
    }

    @Override // com.google.android.gms.internal.fido.zzgf
    public void zzb(Appendable appendable, byte[] bArr, int i, int i2) throws IOException {
        int i3 = 0;
        zzbm.zze(0, i2, bArr.length);
        while (i3 < i2) {
            zze(appendable, bArr, i3, Math.min(this.f39480zzb.f39473zzd, i2 - i3));
            i3 += this.f39480zzb.f39473zzd;
        }
    }

    @Override // com.google.android.gms.internal.fido.zzgf
    public final int zzc(int i) {
        zzgb zzgbVar = this.f39480zzb;
        return zzgbVar.f39472zzc * zzgh.zza(i, zzgbVar.f39473zzd, RoundingMode.CEILING);
    }

    @Override // com.google.android.gms.internal.fido.zzgf
    public final zzgf zzd() {
        zzgf zzgfVarZza = this.f39479zza;
        if (zzgfVarZza == null) {
            zzgb zzgbVar = this.f39480zzb;
            zzgb zzgbVarZzb = zzgbVar.zzb();
            zzgfVarZza = zzgbVarZzb == zzgbVar ? this : zza(zzgbVarZzb, this.f39481zzc);
            this.f39479zza = zzgfVarZza;
        }
        return zzgfVarZza;
    }

    public final void zze(Appendable appendable, byte[] bArr, int i, int i2) throws IOException {
        zzbm.zze(i, i + i2, bArr.length);
        int i3 = 0;
        zzbm.zzc(i2 <= this.f39480zzb.f39473zzd);
        long j2 = 0;
        for (int i5 = 0; i5 < i2; i5++) {
            j2 = (j2 | ((long) (bArr[i + i5] & UnsignedBytes.MAX_VALUE))) << 8;
        }
        int i6 = (i2 + 1) * 8;
        zzgb zzgbVar = this.f39480zzb;
        while (i3 < i2 * 8) {
            long j3 = j2 >>> ((i6 - zzgbVar.f39471zzb) - i3);
            zzgb zzgbVar2 = this.f39480zzb;
            appendable.append(zzgbVar2.zza(((int) j3) & zzgbVar2.f39470zza));
            i3 += this.f39480zzb.f39471zzb;
        }
        if (this.f39481zzc != null) {
            while (i3 < this.f39480zzb.f39473zzd * 8) {
                this.f39481zzc.getClass();
                appendable.append('=');
                i3 += this.f39480zzb.f39471zzb;
            }
        }
    }

    public zzge(String str, String str2, Character ch5) {
        this(new zzgb(str, str2.toCharArray()), ch5);
    }
}
