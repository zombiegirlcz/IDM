package com.google.android.gms.internal.fido;

import com.google.common.primitives.UnsignedBytes;
import java.io.IOException;

/* JADX INFO: loaded from: classes16.dex */
final class zzgc extends zzge {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final char[] f39478zza;

    private zzgc(zzgb zzgbVar) {
        super(zzgbVar, null);
        this.f39478zza = new char[512];
        zzbm.zzc(zzgbVar.f39475zzf.length == 16);
        for (int i = 0; i < 256; i++) {
            this.f39478zza[i] = zzgbVar.zza(i >>> 4);
            this.f39478zza[i | 256] = zzgbVar.zza(i & 15);
        }
    }

    @Override // com.google.android.gms.internal.fido.zzge
    public final zzgf zza(zzgb zzgbVar, Character ch5) {
        return new zzgc(zzgbVar);
    }

    @Override // com.google.android.gms.internal.fido.zzge, com.google.android.gms.internal.fido.zzgf
    public final void zzb(Appendable appendable, byte[] bArr, int i, int i2) throws IOException {
        zzbm.zze(0, i2, bArr.length);
        for (int i3 = 0; i3 < i2; i3++) {
            int i5 = bArr[i3] & UnsignedBytes.MAX_VALUE;
            appendable.append(this.f39478zza[i5]);
            appendable.append(this.f39478zza[i5 | 256]);
        }
    }

    public zzgc(String str, String str2) {
        this(new zzgb("base16()", "0123456789ABCDEF".toCharArray()));
    }
}
