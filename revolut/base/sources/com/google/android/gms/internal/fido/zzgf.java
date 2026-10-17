package com.google.android.gms.internal.fido;

import java.io.IOException;

/* JADX INFO: loaded from: classes16.dex */
public abstract class zzgf {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private static final zzgf f39482zza = new zzgd("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", '=');

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private static final zzgf f39483zzb = new zzgd("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_", '=');

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private static final zzgf f39484zzc = new zzge("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567", '=');

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private static final zzgf f39485zzd = new zzge("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV", '=');

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    private static final zzgf f39486zze = new zzgc("base16()", "0123456789ABCDEF");

    public static zzgf zzf() {
        return f39486zze;
    }

    public abstract void zzb(Appendable appendable, byte[] bArr, int i, int i2) throws IOException;

    public abstract int zzc(int i);

    public abstract zzgf zzd();

    public final String zzg(byte[] bArr, int i, int i2) {
        zzbm.zze(0, i2, bArr.length);
        StringBuilder sb6 = new StringBuilder(zzc(i2));
        try {
            zzb(sb6, bArr, 0, i2);
            return sb6.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}
