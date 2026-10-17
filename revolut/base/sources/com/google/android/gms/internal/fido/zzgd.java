package com.google.android.gms.internal.fido;

import com.google.common.primitives.UnsignedBytes;
import java.io.IOException;

/* JADX INFO: loaded from: classes16.dex */
final class zzgd extends zzge {
    private zzgd(zzgb zzgbVar, Character ch5) {
        super(zzgbVar, ch5);
        zzbm.zzc(zzgbVar.f39475zzf.length == 64);
    }

    @Override // com.google.android.gms.internal.fido.zzge
    public final zzgf zza(zzgb zzgbVar, Character ch5) {
        return new zzgd(zzgbVar, ch5);
    }

    @Override // com.google.android.gms.internal.fido.zzge, com.google.android.gms.internal.fido.zzgf
    public final void zzb(Appendable appendable, byte[] bArr, int i, int i2) throws IOException {
        int i3 = 0;
        zzbm.zze(0, i2, bArr.length);
        for (int i5 = i2; i5 >= 3; i5 -= 3) {
            int i6 = bArr[i3] & UnsignedBytes.MAX_VALUE;
            int i21 = ((bArr[i3 + 1] & UnsignedBytes.MAX_VALUE) << 8) | (i6 << 16) | (bArr[i3 + 2] & UnsignedBytes.MAX_VALUE);
            appendable.append(this.f39480zzb.zza(i21 >>> 18));
            appendable.append(this.f39480zzb.zza((i21 >>> 12) & 63));
            appendable.append(this.f39480zzb.zza((i21 >>> 6) & 63));
            appendable.append(this.f39480zzb.zza(i21 & 63));
            i3 += 3;
        }
        if (i3 < i2) {
            zze(appendable, bArr, i3, i2 - i3);
        }
    }

    public zzgd(String str, String str2, Character ch5) {
        this(new zzgb(str, str2.toCharArray()), ch5);
    }
}
