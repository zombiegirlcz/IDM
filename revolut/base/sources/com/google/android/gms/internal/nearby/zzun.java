package com.google.android.gms.internal.nearby;

import a0.d;
import com.google.common.primitives.UnsignedBytes;
import java.io.IOException;

/* JADX INFO: loaded from: classes16.dex */
final class zzun extends zzuq {
    public zzun(String str, String str2, Character ch5) {
        zzul zzulVar = new zzul(str, str2.toCharArray());
        super(zzulVar, ch5);
        zztq.zzd(zzulVar.f45761zzf.length == 64);
    }

    @Override // com.google.android.gms.internal.nearby.zzuq, com.google.android.gms.internal.nearby.zzur
    public final int zza(byte[] bArr, CharSequence charSequence) throws zzuo {
        CharSequence charSequenceZzf = zzf(charSequence);
        if (!this.f45768zzb.zzc(charSequenceZzf.length())) {
            throw new zzuo(d.n("Invalid input length ", charSequenceZzf.length()));
        }
        int i = 0;
        int i2 = 0;
        while (i < charSequenceZzf.length()) {
            int i3 = i2 + 1;
            int iZzb = (this.f45768zzb.zzb(charSequenceZzf.charAt(i)) << 18) | (this.f45768zzb.zzb(charSequenceZzf.charAt(i + 1)) << 12);
            bArr[i2] = (byte) (iZzb >>> 16);
            int i5 = i + 2;
            if (i5 < charSequenceZzf.length()) {
                int i6 = i + 3;
                int iZzb2 = iZzb | (this.f45768zzb.zzb(charSequenceZzf.charAt(i5)) << 6);
                int i21 = i2 + 2;
                bArr[i3] = (byte) ((iZzb2 >>> 8) & 255);
                if (i6 < charSequenceZzf.length()) {
                    i += 4;
                    i2 += 3;
                    bArr[i21] = (byte) ((iZzb2 | this.f45768zzb.zzb(charSequenceZzf.charAt(i6))) & 255);
                } else {
                    i2 = i21;
                    i = i6;
                }
            } else {
                i = i5;
                i2 = i3;
            }
        }
        return i2;
    }

    @Override // com.google.android.gms.internal.nearby.zzuq, com.google.android.gms.internal.nearby.zzur
    public final void zzb(Appendable appendable, byte[] bArr, int i, int i2) throws IOException {
        int i3 = 0;
        zztq.zzh(0, i2, bArr.length);
        for (int i5 = i2; i5 >= 3; i5 -= 3) {
            int i6 = bArr[i3] & UnsignedBytes.MAX_VALUE;
            int i21 = ((bArr[i3 + 1] & UnsignedBytes.MAX_VALUE) << 8) | (i6 << 16) | (bArr[i3 + 2] & UnsignedBytes.MAX_VALUE);
            appendable.append(this.f45768zzb.zza(i21 >>> 18));
            appendable.append(this.f45768zzb.zza((i21 >>> 12) & 63));
            appendable.append(this.f45768zzb.zza((i21 >>> 6) & 63));
            appendable.append(this.f45768zzb.zza(i21 & 63));
            i3 += 3;
        }
        if (i3 < i2) {
            zzg(appendable, bArr, i3, i2 - i3);
        }
    }
}
