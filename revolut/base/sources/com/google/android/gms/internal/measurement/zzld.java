package com.google.android.gms.internal.measurement;

import a0.d;
import j6.a;
import java.io.IOException;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: loaded from: classes16.dex */
public abstract class zzld implements Iterable, Serializable {

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    public static final zzld f40408zzb = new zzlb(zzmk.f40466zzb);

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private int f40409zza = 0;

    static {
        int i = zzkr.f40391zza;
    }

    public static int zzh(int i, int i2, int i3) {
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

    public static zzld zzj(byte[] bArr, int i, int i2) {
        zzh(i, i + i2, bArr.length);
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return new zzlb(bArr2);
    }

    public abstract boolean equals(Object obj2);

    public final int hashCode() {
        int iZze = this.f40409zza;
        if (iZze == 0) {
            int iZzd = zzd();
            iZze = zze(iZzd, 0, iZzd);
            if (iZze == 0) {
                iZze = 1;
            }
            this.f40409zza = iZze;
        }
        return iZze;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new zzkw(this);
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        return v0.a.i(v0.a.k(zzd(), "<ByteString@", hexString, " size=", " contents=\""), zzd() <= 50 ? zzoc.zza(this) : zzoc.zza(zzf(0, 47)).concat("..."), "\">");
    }

    public abstract byte zza(int i);

    public abstract byte zzb(int i);

    public abstract int zzd();

    public abstract int zze(int i, int i2, int i3);

    public abstract zzld zzf(int i, int i2);

    public abstract void zzg(zzkv zzkvVar) throws IOException;

    public final int zzi() {
        return this.f40409zza;
    }
}
