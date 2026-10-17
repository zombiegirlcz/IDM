package com.google.android.gms.internal.play_billing;

import a10.b;
import ch.qos.logback.core.util.a;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes16.dex */
public final class zzic {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private static final zzic f46118zza = new zzic(0, new int[0], new Object[0], false);

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private int f46119zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private int[] f46120zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private Object[] f46121zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    private int f46122zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    private boolean f46123zzf;

    private zzic(int i, int[] iArr, Object[] objArr, boolean z) {
        this.f46122zze = -1;
        this.f46119zzb = i;
        this.f46120zzc = iArr;
        this.f46121zzd = objArr;
        this.f46123zzf = z;
    }

    public static zzic zzc() {
        return f46118zza;
    }

    public static zzic zze(zzic zzicVar, zzic zzicVar2) {
        int i = zzicVar.f46119zzb + zzicVar2.f46119zzb;
        int[] iArrCopyOf = Arrays.copyOf(zzicVar.f46120zzc, i);
        System.arraycopy(zzicVar2.f46120zzc, 0, iArrCopyOf, zzicVar.f46119zzb, zzicVar2.f46119zzb);
        Object[] objArrCopyOf = Arrays.copyOf(zzicVar.f46121zzd, i);
        System.arraycopy(zzicVar2.f46121zzd, 0, objArrCopyOf, zzicVar.f46119zzb, zzicVar2.f46119zzb);
        return new zzic(i, iArrCopyOf, objArrCopyOf, true);
    }

    public static zzic zzf() {
        return new zzic(0, new int[8], new Object[8], true);
    }

    private final void zzm(int i) {
        int[] iArr = this.f46120zzc;
        if (i > iArr.length) {
            int i2 = this.f46119zzb;
            int i3 = (i2 / 2) + i2;
            if (i3 >= i) {
                i = i3;
            }
            if (i < 8) {
                i = 8;
            }
            this.f46120zzc = Arrays.copyOf(iArr, i);
            this.f46121zzd = Arrays.copyOf(this.f46121zzd, i);
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (obj2 == null || !(obj2 instanceof zzic)) {
            return false;
        }
        zzic zzicVar = (zzic) obj2;
        int i = this.f46119zzb;
        if (i == zzicVar.f46119zzb) {
            int[] iArr = this.f46120zzc;
            int[] iArr2 = zzicVar.f46120zzc;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    Object[] objArr = this.f46121zzd;
                    Object[] objArr2 = zzicVar.f46121zzd;
                    int i3 = this.f46119zzb;
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
        int i = this.f46119zzb;
        int i2 = i + 527;
        int[] iArr = this.f46120zzc;
        int iHashCode = 17;
        int i3 = 17;
        for (int i5 = 0; i5 < i; i5++) {
            i3 = (i3 * 31) + iArr[i5];
        }
        int i6 = ((i2 * 31) + i3) * 31;
        Object[] objArr = this.f46121zzd;
        int i21 = this.f46119zzb;
        for (int i22 = 0; i22 < i21; i22++) {
            iHashCode = (iHashCode * 31) + objArr[i22].hashCode();
        }
        return i6 + iHashCode;
    }

    public final int zza() {
        int iZzy;
        int iZzz;
        int iZzy2;
        int i = this.f46122zze;
        if (i != -1) {
            return i;
        }
        int iB = 0;
        for (int i2 = 0; i2 < this.f46119zzb; i2++) {
            int i3 = this.f46120zzc[i2];
            int i5 = i3 >>> 3;
            int i6 = i3 & 7;
            if (i6 != 0) {
                if (i6 == 1) {
                    ((Long) this.f46121zzd[i2]).getClass();
                    iZzy2 = zzfc.zzy(i5 << 3) + 8;
                } else if (i6 == 2) {
                    int i21 = i5 << 3;
                    zzev zzevVar = (zzev) this.f46121zzd[i2];
                    int iZzy3 = zzfc.zzy(i21);
                    int iZze = zzevVar.zze();
                    iB = a.b(iZze, iZze, iZzy3, iB);
                } else if (i6 == 3) {
                    int iZzy4 = zzfc.zzy(i5 << 3);
                    iZzy = iZzy4 + iZzy4;
                    iZzz = ((zzic) this.f46121zzd[i2]).zza();
                } else {
                    if (i6 != 5) {
                        throw new IllegalStateException(new zzgb("Protocol message tag had invalid wire type."));
                    }
                    ((Integer) this.f46121zzd[i2]).getClass();
                    iZzy2 = zzfc.zzy(i5 << 3) + 4;
                }
                iB = iZzy2 + iB;
            } else {
                int i22 = i5 << 3;
                long jLongValue = ((Long) this.f46121zzd[i2]).longValue();
                iZzy = zzfc.zzy(i22);
                iZzz = zzfc.zzz(jLongValue);
            }
            iB = iZzz + iZzy + iB;
        }
        this.f46122zze = iB;
        return iB;
    }

    public final int zzb() {
        int i = this.f46122zze;
        if (i != -1) {
            return i;
        }
        int iC = 0;
        for (int i2 = 0; i2 < this.f46119zzb; i2++) {
            int i3 = this.f46120zzc[i2] >>> 3;
            zzev zzevVar = (zzev) this.f46121zzd[i2];
            int iZzy = zzfc.zzy(8);
            int iZzy2 = zzfc.zzy(i3) + zzfc.zzy(16);
            int iZzy3 = zzfc.zzy(24);
            int iZze = zzevVar.zze();
            iC = b.C(iZzy + iZzy, iZzy2, a.z(iZze, iZze, iZzy3), iC);
        }
        this.f46122zze = iC;
        return iC;
    }

    public final zzic zzd(zzic zzicVar) {
        if (zzicVar.equals(f46118zza)) {
            return this;
        }
        zzg();
        int i = this.f46119zzb + zzicVar.f46119zzb;
        zzm(i);
        System.arraycopy(zzicVar.f46120zzc, 0, this.f46120zzc, this.f46119zzb, zzicVar.f46119zzb);
        System.arraycopy(zzicVar.f46121zzd, 0, this.f46121zzd, this.f46119zzb, zzicVar.f46119zzb);
        this.f46119zzb = i;
        return this;
    }

    public final void zzg() {
        if (!this.f46123zzf) {
            throw new UnsupportedOperationException();
        }
    }

    public final void zzh() {
        if (this.f46123zzf) {
            this.f46123zzf = false;
        }
    }

    public final void zzi(StringBuilder sb6, int i) {
        for (int i2 = 0; i2 < this.f46119zzb; i2++) {
            zzhd.zzb(sb6, i, String.valueOf(this.f46120zzc[i2] >>> 3), this.f46121zzd[i2]);
        }
    }

    public final void zzj(int i, Object obj2) {
        zzg();
        zzm(this.f46119zzb + 1);
        int[] iArr = this.f46120zzc;
        int i2 = this.f46119zzb;
        iArr[i2] = i;
        this.f46121zzd[i2] = obj2;
        this.f46119zzb = i2 + 1;
    }

    public final void zzk(zzit zzitVar) throws IOException {
        for (int i = 0; i < this.f46119zzb; i++) {
            zzitVar.zzx(this.f46120zzc[i] >>> 3, this.f46121zzd[i]);
        }
    }

    public final void zzl(zzit zzitVar) throws IOException {
        if (this.f46119zzb != 0) {
            for (int i = 0; i < this.f46119zzb; i++) {
                int i2 = this.f46120zzc[i];
                Object obj2 = this.f46121zzd[i];
                int i3 = i2 & 7;
                int i5 = i2 >>> 3;
                if (i3 == 0) {
                    zzitVar.zzt(i5, ((Long) obj2).longValue());
                } else if (i3 == 1) {
                    zzitVar.zzm(i5, ((Long) obj2).longValue());
                } else if (i3 == 2) {
                    zzitVar.zzd(i5, (zzev) obj2);
                } else if (i3 == 3) {
                    zzitVar.zzG(i5);
                    ((zzic) obj2).zzl(zzitVar);
                    zzitVar.zzh(i5);
                } else {
                    if (i3 != 5) {
                        throw new RuntimeException(new zzgb("Protocol message tag had invalid wire type."));
                    }
                    zzitVar.zzk(i5, ((Integer) obj2).intValue());
                }
            }
        }
    }

    private zzic() {
        this(0, new int[8], new Object[8], true);
    }
}
