package com.google.android.gms.internal.fido;

import a0.d;
import j6.a;
import java.io.InputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: loaded from: classes16.dex */
public abstract class zzgx implements Iterable<Byte>, Serializable {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private static final Comparator f39499zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    public static final zzgx f39500zzb = new zzgu(zzhc.f39524zzd);

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private static final zzgw f39501zzd;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private int f39502zzc = 0;

    static {
        int i = zzgn.f39492zza;
        f39501zzd = new zzgw(null);
        f39499zza = new zzgp();
    }

    public static int zzj(int i, int i2, int i3) {
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

    public static zzgx zzl(byte[] bArr, int i, int i2) {
        zzj(0, i2, bArr.length);
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, 0, bArr2, 0, i2);
        return new zzgu(bArr2);
    }

    public abstract boolean equals(Object obj2);

    public final int hashCode() {
        int iZzf = this.f39502zzc;
        if (iZzf == 0) {
            int iZzd = zzd();
            iZzf = zzf(iZzd, 0, iZzd);
            if (iZzf == 0) {
                iZzf = 1;
            }
            this.f39502zzc = iZzf;
        }
        return iZzf;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator<Byte> iterator() {
        return new zzgo(this);
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        return v0.a.i(v0.a.k(zzd(), "<ByteString@", hexString, " size=", " contents=\""), zzd() <= 50 ? zzhe.zza(this) : zzhe.zza(zzg(0, 47)).concat("..."), "\">");
    }

    public abstract byte zza(int i);

    public abstract byte zzb(int i);

    public abstract int zzd();

    public abstract void zze(byte[] bArr, int i, int i2, int i3);

    public abstract int zzf(int i, int i2, int i3);

    public abstract zzgx zzg(int i, int i2);

    public abstract InputStream zzh();

    public abstract ByteBuffer zzi();

    public final int zzk() {
        return this.f39502zzc;
    }

    public final byte[] zzm() {
        int iZzd = zzd();
        if (iZzd == 0) {
            return zzhc.f39524zzd;
        }
        byte[] bArr = new byte[iZzd];
        zze(bArr, 0, 0, iZzd);
        return bArr;
    }
}
