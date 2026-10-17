package com.google.android.gms.internal.fido;

import java.util.Arrays;

/* JADX INFO: loaded from: classes16.dex */
public final class zzhk extends zzhp {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final long f39531zza;

    public zzhk(long j2) {
        this.f39531zza = j2;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj2) {
        zzhp zzhpVar = (zzhp) obj2;
        if (zza() != zzhpVar.zza()) {
            return zza() - zzhpVar.zza();
        }
        long jAbs = Math.abs(this.f39531zza);
        long jAbs2 = Math.abs(((zzhk) zzhpVar).f39531zza);
        if (jAbs < jAbs2) {
            return -1;
        }
        return jAbs > jAbs2 ? 1 : 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return obj2 != null && zzhk.class == obj2.getClass() && this.f39531zza == ((zzhk) obj2).f39531zza;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(zza()), Long.valueOf(this.f39531zza)});
    }

    public final String toString() {
        return Long.toString(this.f39531zza);
    }

    @Override // com.google.android.gms.internal.fido.zzhp
    public final int zza() {
        return zzhp.zzd(this.f39531zza >= 0 ? (byte) 0 : (byte) 32);
    }

    public final long zzc() {
        return this.f39531zza;
    }
}
