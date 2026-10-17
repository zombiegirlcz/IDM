package com.google.android.gms.internal.nearby;

import a0.d;
import com.google.common.primitives.UnsignedBytes;
import java.io.IOException;
import java.math.RoundingMode;

/* JADX INFO: loaded from: classes16.dex */
class zzuq extends zzur {

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final zzul f45768zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    final Character f45769zzc;

    public zzuq(zzul zzulVar, Character ch5) {
        this.f45768zzb = zzulVar;
        boolean z = true;
        if (ch5 != null && zzulVar.zzd('=')) {
            z = false;
        }
        zztq.zzg(z, "Padding character %s was already in alphabet", ch5);
        this.f45769zzc = ch5;
    }

    public final boolean equals(Object obj2) {
        if (obj2 instanceof zzuq) {
            zzuq zzuqVar = (zzuq) obj2;
            if (this.f45768zzb.equals(zzuqVar.f45768zzb)) {
                Character ch5 = this.f45769zzc;
                Character ch9 = zzuqVar.f45769zzc;
                if (ch5 == ch9) {
                    return true;
                }
                if (ch5 != null && ch5.equals(ch9)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        Character ch5 = this.f45769zzc;
        return (ch5 == null ? 0 : ch5.hashCode()) ^ this.f45768zzb.hashCode();
    }

    public final String toString() {
        StringBuilder sb6 = new StringBuilder("BaseEncoding.");
        sb6.append(this.f45768zzb);
        if (8 % this.f45768zzb.f45757zzb != 0) {
            if (this.f45769zzc == null) {
                sb6.append(".omitPadding()");
            } else {
                sb6.append(".withPadChar('");
                sb6.append(this.f45769zzc);
                sb6.append("')");
            }
        }
        return sb6.toString();
    }

    @Override // com.google.android.gms.internal.nearby.zzur
    public int zza(byte[] bArr, CharSequence charSequence) throws zzuo {
        zzul zzulVar;
        CharSequence charSequenceZzf = zzf(charSequence);
        if (!this.f45768zzb.zzc(charSequenceZzf.length())) {
            throw new zzuo(d.n("Invalid input length ", charSequenceZzf.length()));
        }
        int i = 0;
        int i2 = 0;
        while (i < charSequenceZzf.length()) {
            long jZzb = 0;
            int i3 = 0;
            int i5 = 0;
            while (true) {
                zzulVar = this.f45768zzb;
                if (i3 >= zzulVar.f45758zzc) {
                    break;
                }
                jZzb <<= zzulVar.f45757zzb;
                if (i + i3 < charSequenceZzf.length()) {
                    jZzb |= (long) this.f45768zzb.zzb(charSequenceZzf.charAt(i5 + i));
                    i5++;
                }
                i3++;
            }
            int i6 = zzulVar.f45759zzd;
            int i21 = i5 * zzulVar.f45757zzb;
            int i22 = (i6 - 1) * 8;
            while (i22 >= (i6 * 8) - i21) {
                bArr[i2] = (byte) ((jZzb >>> i22) & 255);
                i22 -= 8;
                i2++;
            }
            i += this.f45768zzb.f45758zzc;
        }
        return i2;
    }

    @Override // com.google.android.gms.internal.nearby.zzur
    public void zzb(Appendable appendable, byte[] bArr, int i, int i2) throws IOException {
        int i3 = 0;
        zztq.zzh(0, i2, bArr.length);
        while (i3 < i2) {
            zzg(appendable, bArr, i3, Math.min(this.f45768zzb.f45759zzd, i2 - i3));
            i3 += this.f45768zzb.f45759zzd;
        }
    }

    @Override // com.google.android.gms.internal.nearby.zzur
    public final int zzc(int i) {
        return (int) (((((long) this.f45768zzb.f45757zzb) * ((long) i)) + 7) / 8);
    }

    @Override // com.google.android.gms.internal.nearby.zzur
    public final int zzd(int i) {
        zzul zzulVar = this.f45768zzb;
        return zzulVar.f45758zzc * zzut.zza(i, zzulVar.f45759zzd, RoundingMode.CEILING);
    }

    @Override // com.google.android.gms.internal.nearby.zzur
    public final zzur zze(String str, int i) {
        for (int i2 = 0; i2 <= 0; i2++) {
            zztq.zzg(true ^ this.f45768zzb.zzd(":".charAt(i2)), "Separator (%s) cannot contain alphabet characters", ":");
        }
        if (this.f45769zzc != null) {
            zztq.zzg(true, "Separator (%s) cannot contain padding character", ":");
        }
        return new zzup(this, ":", 2);
    }

    @Override // com.google.android.gms.internal.nearby.zzur
    public final CharSequence zzf(CharSequence charSequence) {
        charSequence.getClass();
        if (this.f45769zzc == null) {
            return charSequence;
        }
        int length = charSequence.length();
        do {
            length--;
            if (length < 0) {
                break;
            }
        } while (charSequence.charAt(length) == '=');
        return charSequence.subSequence(0, length + 1);
    }

    public final void zzg(Appendable appendable, byte[] bArr, int i, int i2) throws IOException {
        zztq.zzh(i, i + i2, bArr.length);
        int i3 = 0;
        zztq.zzd(i2 <= this.f45768zzb.f45759zzd);
        long j2 = 0;
        for (int i5 = 0; i5 < i2; i5++) {
            j2 = (j2 | ((long) (bArr[i + i5] & UnsignedBytes.MAX_VALUE))) << 8;
        }
        int i6 = (i2 + 1) * 8;
        zzul zzulVar = this.f45768zzb;
        while (i3 < i2 * 8) {
            long j3 = j2 >>> ((i6 - zzulVar.f45757zzb) - i3);
            zzul zzulVar2 = this.f45768zzb;
            appendable.append(zzulVar2.zza(((int) j3) & zzulVar2.f45756zza));
            i3 += this.f45768zzb.f45757zzb;
        }
        if (this.f45769zzc != null) {
            while (i3 < this.f45768zzb.f45759zzd * 8) {
                this.f45769zzc.getClass();
                appendable.append('=');
                i3 += this.f45768zzb.f45757zzb;
            }
        }
    }

    public zzuq(String str, String str2, Character ch5) {
        this(new zzul(str, str2.toCharArray()), ch5);
    }
}
