package com.google.android.gms.internal.nearby;

import java.io.IOException;

/* JADX INFO: loaded from: classes16.dex */
public abstract class zzur {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private static final zzur f45770zza = new zzun("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", '=');

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private static final zzur f45771zzb = new zzun("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_", '=');

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private static final zzur f45772zzc = new zzuq("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567", '=');

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private static final zzur f45773zzd = new zzuq("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV", '=');

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    private static final zzur f45774zze = new zzum("base16()", "0123456789ABCDEF");

    public static zzur zzh() {
        return f45774zze;
    }

    public abstract int zza(byte[] bArr, CharSequence charSequence) throws zzuo;

    public abstract void zzb(Appendable appendable, byte[] bArr, int i, int i2) throws IOException;

    public abstract int zzc(int i);

    public abstract int zzd(int i);

    public abstract zzur zze(String str, int i);

    public CharSequence zzf(CharSequence charSequence) {
        throw null;
    }

    public final String zzi(byte[] bArr, int i, int i2) {
        zztq.zzh(0, i2, bArr.length);
        StringBuilder sb6 = new StringBuilder(zzd(i2));
        try {
            zzb(sb6, bArr, 0, i2);
            return sb6.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    public final byte[] zzj(CharSequence charSequence) {
        try {
            CharSequence charSequenceZzf = zzf(charSequence);
            int iZzc = zzc(charSequenceZzf.length());
            byte[] bArr = new byte[iZzc];
            int iZza = zza(bArr, charSequenceZzf);
            if (iZza == iZzc) {
                return bArr;
            }
            byte[] bArr2 = new byte[iZza];
            System.arraycopy(bArr, 0, bArr2, 0, iZza);
            return bArr2;
        } catch (zzuo e) {
            throw new IllegalArgumentException(e);
        }
    }
}
