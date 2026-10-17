package com.google.android.gms.internal.auth;

import java.util.Arrays;

/* JADX INFO: loaded from: classes16.dex */
public final class zzha {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private static final zzha f39117zza = new zzha(0, new int[0], new Object[0], false);

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private int f39118zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private int[] f39119zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private Object[] f39120zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    private boolean f39121zze;

    private zzha(int i, int[] iArr, Object[] objArr, boolean z) {
        this.f39118zzb = i;
        this.f39119zzc = iArr;
        this.f39120zzd = objArr;
        this.f39121zze = z;
    }

    public static zzha zza() {
        return f39117zza;
    }

    public static zzha zzc(zzha zzhaVar, zzha zzhaVar2) {
        int i = zzhaVar.f39118zzb + zzhaVar2.f39118zzb;
        int[] iArrCopyOf = Arrays.copyOf(zzhaVar.f39119zzc, i);
        System.arraycopy(zzhaVar2.f39119zzc, 0, iArrCopyOf, zzhaVar.f39118zzb, zzhaVar2.f39118zzb);
        Object[] objArrCopyOf = Arrays.copyOf(zzhaVar.f39120zzd, i);
        System.arraycopy(zzhaVar2.f39120zzd, 0, objArrCopyOf, zzhaVar.f39118zzb, zzhaVar2.f39118zzb);
        return new zzha(i, iArrCopyOf, objArrCopyOf, true);
    }

    public static zzha zzd() {
        return new zzha(0, new int[8], new Object[8], true);
    }

    private final void zzi(int i) {
        int[] iArr = this.f39119zzc;
        if (i > iArr.length) {
            int i2 = this.f39118zzb;
            int i3 = (i2 / 2) + i2;
            if (i3 >= i) {
                i = i3;
            }
            if (i < 8) {
                i = 8;
            }
            this.f39119zzc = Arrays.copyOf(iArr, i);
            this.f39120zzd = Arrays.copyOf(this.f39120zzd, i);
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (obj2 == null || !(obj2 instanceof zzha)) {
            return false;
        }
        zzha zzhaVar = (zzha) obj2;
        int i = this.f39118zzb;
        if (i == zzhaVar.f39118zzb) {
            int[] iArr = this.f39119zzc;
            int[] iArr2 = zzhaVar.f39119zzc;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    Object[] objArr = this.f39120zzd;
                    Object[] objArr2 = zzhaVar.f39120zzd;
                    int i3 = this.f39118zzb;
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
        int i = this.f39118zzb;
        int i2 = i + 527;
        int[] iArr = this.f39119zzc;
        int iHashCode = 17;
        int i3 = 17;
        for (int i5 = 0; i5 < i; i5++) {
            i3 = (i3 * 31) + iArr[i5];
        }
        int i6 = (i2 * 31) + i3;
        Object[] objArr = this.f39120zzd;
        int i21 = this.f39118zzb;
        for (int i22 = 0; i22 < i21; i22++) {
            iHashCode = (iHashCode * 31) + objArr[i22].hashCode();
        }
        return (i6 * 31) + iHashCode;
    }

    public final zzha zzb(zzha zzhaVar) {
        if (zzhaVar.equals(f39117zza)) {
            return this;
        }
        zze();
        int i = this.f39118zzb + zzhaVar.f39118zzb;
        zzi(i);
        System.arraycopy(zzhaVar.f39119zzc, 0, this.f39119zzc, this.f39118zzb, zzhaVar.f39118zzb);
        System.arraycopy(zzhaVar.f39120zzd, 0, this.f39120zzd, this.f39118zzb, zzhaVar.f39118zzb);
        this.f39118zzb = i;
        return this;
    }

    public final void zze() {
        if (!this.f39121zze) {
            throw new UnsupportedOperationException();
        }
    }

    public final void zzf() {
        if (this.f39121zze) {
            this.f39121zze = false;
        }
    }

    public final void zzg(StringBuilder sb6, int i) {
        for (int i2 = 0; i2 < this.f39118zzb; i2++) {
            zzfz.zzb(sb6, i, String.valueOf(this.f39119zzc[i2] >>> 3), this.f39120zzd[i2]);
        }
    }

    public final void zzh(int i, Object obj2) {
        zze();
        zzi(this.f39118zzb + 1);
        int[] iArr = this.f39119zzc;
        int i2 = this.f39118zzb;
        iArr[i2] = i;
        this.f39120zzd[i2] = obj2;
        this.f39118zzb = i2 + 1;
    }

    private zzha() {
        this(0, new int[8], new Object[8], true);
    }
}
