package com.google.android.gms.internal.auth;

import a0.d;
import j6.a;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: loaded from: classes16.dex */
public abstract class zzef implements Iterable, Serializable {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private static final Comparator f39009zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    public static final zzef f39010zzb = new zzec(zzfa.f39048zzd);

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private static final zzee f39011zzd;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private int f39012zzc = 0;

    static {
        int i = zzds.f38996zza;
        f39011zzd = new zzee(null);
        f39009zza = new zzdx();
    }

    public static int zzi(int i, int i2, int i3) {
        int i5 = i2 - i;
        if ((i | i2 | i5 | (i3 - i2)) >= 0) {
            return i5;
        }
        if (i < 0) {
            throw new IndexOutOfBoundsException(a.l(i, "Beginning index: ", " < 0"));
        }
        if (i2 < i) {
            throw new IndexOutOfBoundsException(d.g(i, i2, "Beginning index larger than ending index: ", ", "));
        }
        throw new IndexOutOfBoundsException(d.g(i2, i3, "End index: ", " >= "));
    }

    public static zzef zzk(byte[] bArr, int i, int i2) {
        zzi(i, i + i2, bArr.length);
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return new zzec(bArr2);
    }

    public abstract boolean equals(Object obj2);

    public final int hashCode() {
        int iZze = this.f39012zzc;
        if (iZze == 0) {
            int iZzd = zzd();
            iZze = zze(iZzd, 0, iZzd);
            if (iZze == 0) {
                iZze = 1;
            }
            this.f39012zzc = iZze;
        }
        return iZze;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new zzdw(this);
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        return v0.a.i(v0.a.k(zzd(), "<ByteString@", hexString, " size=", " contents=\""), zzd() <= 50 ? zzgx.zza(this) : zzgx.zza(zzf(0, 47)).concat("..."), "\">");
    }

    public abstract byte zza(int i);

    public abstract byte zzb(int i);

    public abstract int zzd();

    public abstract int zze(int i, int i2, int i3);

    public abstract zzef zzf(int i, int i2);

    public abstract String zzg(Charset charset);

    public abstract boolean zzh();

    public final int zzj() {
        return this.f39012zzc;
    }

    public final String zzl(Charset charset) {
        return zzd() == 0 ? "" : zzg(charset);
    }
}
