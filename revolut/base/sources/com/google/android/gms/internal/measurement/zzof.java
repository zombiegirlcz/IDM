package com.google.android.gms.internal.measurement;

import a10.b;
import ch.qos.logback.core.util.a;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes16.dex */
public final class zzof {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private static final zzof f40542zza = new zzof(0, new int[0], new Object[0], false);

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private int f40543zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private int[] f40544zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private Object[] f40545zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    private int f40546zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    private boolean f40547zzf;

    private zzof(int i, int[] iArr, Object[] objArr, boolean z) {
        this.f40546zze = -1;
        this.f40543zzb = i;
        this.f40544zzc = iArr;
        this.f40545zzd = objArr;
        this.f40547zzf = z;
    }

    public static zzof zzc() {
        return f40542zza;
    }

    public static zzof zze(zzof zzofVar, zzof zzofVar2) {
        int i = zzofVar.f40543zzb + zzofVar2.f40543zzb;
        int[] iArrCopyOf = Arrays.copyOf(zzofVar.f40544zzc, i);
        System.arraycopy(zzofVar2.f40544zzc, 0, iArrCopyOf, zzofVar.f40543zzb, zzofVar2.f40543zzb);
        Object[] objArrCopyOf = Arrays.copyOf(zzofVar.f40545zzd, i);
        System.arraycopy(zzofVar2.f40545zzd, 0, objArrCopyOf, zzofVar.f40543zzb, zzofVar2.f40543zzb);
        return new zzof(i, iArrCopyOf, objArrCopyOf, true);
    }

    public static zzof zzf() {
        return new zzof(0, new int[8], new Object[8], true);
    }

    private final void zzm(int i) {
        int[] iArr = this.f40544zzc;
        if (i > iArr.length) {
            int i2 = this.f40543zzb;
            int i3 = (i2 / 2) + i2;
            if (i3 >= i) {
                i = i3;
            }
            if (i < 8) {
                i = 8;
            }
            this.f40544zzc = Arrays.copyOf(iArr, i);
            this.f40545zzd = Arrays.copyOf(this.f40545zzd, i);
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (obj2 == null || !(obj2 instanceof zzof)) {
            return false;
        }
        zzof zzofVar = (zzof) obj2;
        int i = this.f40543zzb;
        if (i == zzofVar.f40543zzb) {
            int[] iArr = this.f40544zzc;
            int[] iArr2 = zzofVar.f40544zzc;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    Object[] objArr = this.f40545zzd;
                    Object[] objArr2 = zzofVar.f40545zzd;
                    int i3 = this.f40543zzb;
                    for (int i5 = 0; i5 < i3; i5++) {
                        if (objArr[i5].equals(objArr2[i5])) {
                        }
                    }
                    return true;
                }
                if (iArr[i2] != iArr2[i2]) {
                    break;
                }
                i2++;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f40543zzb;
        int i2 = i + 527;
        int[] iArr = this.f40544zzc;
        int iHashCode = 17;
        int i3 = 17;
        for (int i5 = 0; i5 < i; i5++) {
            i3 = (i3 * 31) + iArr[i5];
        }
        int i6 = ((i2 * 31) + i3) * 31;
        Object[] objArr = this.f40545zzd;
        int i21 = this.f40543zzb;
        for (int i22 = 0; i22 < i21; i22++) {
            iHashCode = (iHashCode * 31) + objArr[i22].hashCode();
        }
        return i6 + iHashCode;
    }

    public final int zza() {
        int iZzz;
        int iZzA;
        int iZzz2;
        int i = this.f40546zze;
        if (i != -1) {
            return i;
        }
        int iZzz3 = 0;
        for (int i2 = 0; i2 < this.f40543zzb; i2++) {
            int i3 = this.f40544zzc[i2];
            int i5 = i3 >>> 3;
            int i6 = i3 & 7;
            if (i6 != 0) {
                if (i6 == 1) {
                    ((Long) this.f40545zzd[i2]).getClass();
                    iZzz2 = zzlk.zzz(i5 << 3) + 8;
                } else if (i6 == 2) {
                    int i21 = i5 << 3;
                    zzld zzldVar = (zzld) this.f40545zzd[i2];
                    int iZzz4 = zzlk.zzz(i21);
                    int iZzd = zzldVar.zzd();
                    iZzz3 = zzlk.zzz(iZzd) + iZzd + iZzz4 + iZzz3;
                } else if (i6 == 3) {
                    int iZzz5 = zzlk.zzz(i5 << 3);
                    iZzz = iZzz5 + iZzz5;
                    iZzA = ((zzof) this.f40545zzd[i2]).zza();
                } else {
                    if (i6 != 5) {
                        throw new IllegalStateException(new zzml("Protocol message tag had invalid wire type."));
                    }
                    ((Integer) this.f40545zzd[i2]).getClass();
                    iZzz2 = zzlk.zzz(i5 << 3) + 4;
                }
                iZzz3 = iZzz2 + iZzz3;
            } else {
                int i22 = i5 << 3;
                long jLongValue = ((Long) this.f40545zzd[i2]).longValue();
                iZzz = zzlk.zzz(i22);
                iZzA = zzlk.zzA(jLongValue);
            }
            iZzz3 = iZzA + iZzz + iZzz3;
        }
        this.f40546zze = iZzz3;
        return iZzz3;
    }

    public final int zzb() {
        int i = this.f40546zze;
        if (i != -1) {
            return i;
        }
        int iC = 0;
        for (int i2 = 0; i2 < this.f40543zzb; i2++) {
            int i3 = this.f40544zzc[i2] >>> 3;
            zzld zzldVar = (zzld) this.f40545zzd[i2];
            int iZzz = zzlk.zzz(8);
            int iZzz2 = zzlk.zzz(i3) + zzlk.zzz(16);
            int iZzz3 = zzlk.zzz(24);
            int iZzd = zzldVar.zzd();
            iC = b.C(iZzz + iZzz, iZzz2, a.a(iZzd, iZzd, iZzz3), iC);
        }
        this.f40546zze = iC;
        return iC;
    }

    public final zzof zzd(zzof zzofVar) {
        if (zzofVar.equals(f40542zza)) {
            return this;
        }
        zzg();
        int i = this.f40543zzb + zzofVar.f40543zzb;
        zzm(i);
        System.arraycopy(zzofVar.f40544zzc, 0, this.f40544zzc, this.f40543zzb, zzofVar.f40543zzb);
        System.arraycopy(zzofVar.f40545zzd, 0, this.f40545zzd, this.f40543zzb, zzofVar.f40543zzb);
        this.f40543zzb = i;
        return this;
    }

    public final void zzg() {
        if (!this.f40547zzf) {
            throw new UnsupportedOperationException();
        }
    }

    public final void zzh() {
        if (this.f40547zzf) {
            this.f40547zzf = false;
        }
    }

    public final void zzi(StringBuilder sb6, int i) {
        for (int i2 = 0; i2 < this.f40543zzb; i2++) {
            zznj.zzb(sb6, i, String.valueOf(this.f40544zzc[i2] >>> 3), this.f40545zzd[i2]);
        }
    }

    public final void zzj(int i, Object obj2) {
        zzg();
        zzm(this.f40543zzb + 1);
        int[] iArr = this.f40544zzc;
        int i2 = this.f40543zzb;
        iArr[i2] = i;
        this.f40545zzd[i2] = obj2;
        this.f40543zzb = i2 + 1;
    }

    public final void zzk(zzor zzorVar) throws IOException {
        for (int i = 0; i < this.f40543zzb; i++) {
            zzorVar.zzw(this.f40544zzc[i] >>> 3, this.f40545zzd[i]);
        }
    }

    public final void zzl(zzor zzorVar) throws IOException {
        if (this.f40543zzb != 0) {
            for (int i = 0; i < this.f40543zzb; i++) {
                int i2 = this.f40544zzc[i];
                Object obj2 = this.f40545zzd[i];
                int i3 = i2 & 7;
                int i5 = i2 >>> 3;
                if (i3 == 0) {
                    zzorVar.zzt(i5, ((Long) obj2).longValue());
                } else if (i3 == 1) {
                    zzorVar.zzm(i5, ((Long) obj2).longValue());
                } else if (i3 == 2) {
                    zzorVar.zzd(i5, (zzld) obj2);
                } else if (i3 == 3) {
                    zzorVar.zzF(i5);
                    ((zzof) obj2).zzl(zzorVar);
                    zzorVar.zzh(i5);
                } else {
                    if (i3 != 5) {
                        throw new RuntimeException(new zzml("Protocol message tag had invalid wire type."));
                    }
                    zzorVar.zzk(i5, ((Integer) obj2).intValue());
                }
            }
        }
    }

    private zzof() {
        this(0, new int[8], new Object[8], true);
    }
}
