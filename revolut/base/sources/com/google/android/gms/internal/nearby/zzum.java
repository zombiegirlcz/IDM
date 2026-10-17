package com.google.android.gms.internal.nearby;

import a0.d;
import com.google.common.primitives.UnsignedBytes;
import java.io.IOException;

/* JADX INFO: loaded from: classes16.dex */
final class zzum extends zzuq {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final char[] f45765zza;

    public zzum(String str, String str2) {
        zzul zzulVar = new zzul("base16()", "0123456789ABCDEF".toCharArray());
        super(zzulVar, null);
        this.f45765zza = new char[512];
        zztq.zzd(zzulVar.f45761zzf.length == 16);
        for (int i = 0; i < 256; i++) {
            this.f45765zza[i] = zzulVar.zza(i >>> 4);
            this.f45765zza[i | 256] = zzulVar.zza(i & 15);
        }
    }

    @Override // com.google.android.gms.internal.nearby.zzuq, com.google.android.gms.internal.nearby.zzur
    public final int zza(byte[] bArr, CharSequence charSequence) throws zzuo {
        if (charSequence.length() % 2 == 1) {
            throw new zzuo(d.n("Invalid input length ", charSequence.length()));
        }
        int i = 0;
        int i2 = 0;
        while (i < charSequence.length()) {
            bArr[i2] = (byte) ((this.f45768zzb.zzb(charSequence.charAt(i)) << 4) | this.f45768zzb.zzb(charSequence.charAt(i + 1)));
            i += 2;
            i2++;
        }
        return i2;
    }

    @Override // com.google.android.gms.internal.nearby.zzuq, com.google.android.gms.internal.nearby.zzur
    public final void zzb(Appendable appendable, byte[] bArr, int i, int i2) throws IOException {
        zztq.zzh(0, i2, bArr.length);
        for (int i3 = 0; i3 < i2; i3++) {
            int i5 = bArr[i3] & UnsignedBytes.MAX_VALUE;
            appendable.append(this.f45765zza[i5]);
            appendable.append(this.f45765zza[i5 | 256]);
        }
    }
}
