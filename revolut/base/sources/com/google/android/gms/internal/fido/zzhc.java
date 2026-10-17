package com.google.android.gms.internal.fido;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes16.dex */
public final class zzhc {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    static final Charset f39521zza = Charset.forName("US-ASCII");

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    static final Charset f39522zzb = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    static final Charset f39523zzc = Charset.forName("ISO-8859-1");

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    public static final byte[] f39524zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    public static final ByteBuffer f39525zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    public static final zzhb f39526zzf;

    static {
        byte[] bArr = new byte[0];
        f39524zzd = bArr;
        f39525zze = ByteBuffer.wrap(bArr);
        zzgz zzgzVar = new zzgz(bArr, 0, 0, false, null);
        try {
            zzgzVar.zza(0);
            f39526zzf = zzgzVar;
        } catch (zzhd e) {
            throw new IllegalArgumentException(e);
        }
    }
}
