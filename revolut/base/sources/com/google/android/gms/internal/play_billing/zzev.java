package com.google.android.gms.internal.play_billing;

import a0.d;
import j6.a;
import java.io.IOException;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: loaded from: classes16.dex */
public abstract class zzev implements Iterable, Serializable {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    public static final zzev f45974zza = new zzet(zzga.f46030zzb);

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private int f45975zzb = 0;

    static {
        int i = zzei.f45956zza;
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

    public static zzev zzk(byte[] bArr, int i, int i2) {
        try {
            zzj(i, i + i2, bArr.length);
            byte[] bArr2 = new byte[i2];
            System.arraycopy(bArr, i, bArr2, 0, i2);
            return new zzet(bArr2);
        } catch (zzgc e) {
            throw new AssertionError("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e);
        }
    }

    public static /* bridge */ /* synthetic */ boolean zzl(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        int i5 = i + i3;
        zzj(i, i5, bArr.length);
        zzj(i2, i3 + i2, bArr2.length);
        while (i < i5) {
            if (bArr[i] != bArr2[i2]) {
                return false;
            }
            i++;
            i2++;
        }
        return true;
    }

    public final boolean equals(Object obj2) {
        if (obj2 == this) {
            return true;
        }
        if (!(obj2 instanceof zzev)) {
            return false;
        }
        zzev zzevVar = (zzev) obj2;
        int iZze = zze();
        if (iZze != zzevVar.zze()) {
            return false;
        }
        if (iZze == 0) {
            return true;
        }
        int i = this.f45975zzb;
        int i2 = zzevVar.f45975zzb;
        if (i == 0 || i2 == 0 || i == i2) {
            return zzh(zzevVar);
        }
        return false;
    }

    public final int hashCode() {
        int iZzd = this.f45975zzb;
        if (iZzd == 0) {
            int iZze = zze();
            iZzd = zzd(iZze, 0, iZze);
            if (iZzd == 0) {
                iZzd = 1;
            }
            this.f45975zzb = iZzd;
        }
        return iZzd;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new zzen(this);
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        return v0.a.i(v0.a.k(zze(), "<ByteString@", hexString, " size=", " contents=\""), zze() <= 50 ? zzhz.zza(this) : zzhz.zza(zzf(0, 47)).concat("..."), "\">");
    }

    public abstract byte zza(int i);

    public abstract byte zzb(int i);

    public abstract int zzd(int i, int i2, int i3);

    public abstract int zze();

    public abstract zzev zzf(int i, int i2);

    public abstract void zzg(zzem zzemVar) throws IOException;

    public abstract boolean zzh(zzev zzevVar);
}
