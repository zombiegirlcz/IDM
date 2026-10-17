package com.google.android.gms.internal.nearby;

import java.io.IOException;
import java.math.RoundingMode;
import v0.a;

/* JADX INFO: loaded from: classes16.dex */
final class zzup extends zzur {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final zzur f45766zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final String f45767zzb = ":";

    public zzup(zzur zzurVar, String str, int i) {
        this.f45766zza = zzurVar;
    }

    public final String toString() {
        return a.i(a.l(this.f45766zza.toString(), ".withSeparator(\""), this.f45767zzb, "\", 2)");
    }

    @Override // com.google.android.gms.internal.nearby.zzur
    public final int zza(byte[] bArr, CharSequence charSequence) throws zzuo {
        StringBuilder sb6 = new StringBuilder(charSequence.length());
        for (int i = 0; i < charSequence.length(); i++) {
            char cCharAt = charSequence.charAt(i);
            if (this.f45767zzb.indexOf(cCharAt) < 0) {
                sb6.append(cCharAt);
            }
        }
        return this.f45766zza.zza(bArr, sb6);
    }

    @Override // com.google.android.gms.internal.nearby.zzur
    public final void zzb(Appendable appendable, byte[] bArr, int i, int i2) throws IOException {
        this.f45766zza.zzb(new zzuk(2, appendable, this.f45767zzb), bArr, 0, i2);
    }

    @Override // com.google.android.gms.internal.nearby.zzur
    public final int zzc(int i) {
        return this.f45766zza.zzc(i);
    }

    @Override // com.google.android.gms.internal.nearby.zzur
    public final int zzd(int i) {
        int iZzd = this.f45766zza.zzd(i);
        return (this.f45767zzb.length() * zzut.zza(Math.max(0, iZzd - 1), 2, RoundingMode.FLOOR)) + iZzd;
    }

    @Override // com.google.android.gms.internal.nearby.zzur
    public final zzur zze(String str, int i) {
        throw null;
    }

    @Override // com.google.android.gms.internal.nearby.zzur
    public final CharSequence zzf(CharSequence charSequence) {
        return this.f45766zza.zzf(charSequence);
    }
}
