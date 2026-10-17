package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes16.dex */
public final class zzhk extends zzmd implements zzni {

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private static final zzhk f40194zzb;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private int f40195zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    private int f40196zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    private long f40197zzf;

    static {
        zzhk zzhkVar = new zzhk();
        f40194zzb = zzhkVar;
        zzmd.zzct(zzhk.class, zzhkVar);
    }

    private zzhk() {
    }

    public static zzhj zzc() {
        return (zzhj) f40194zzb.zzcg();
    }

    public static /* synthetic */ void zze(zzhk zzhkVar, long j2) {
        zzhkVar.f40195zzd |= 2;
        zzhkVar.f40197zzf = j2;
    }

    public static /* synthetic */ void zzf(zzhk zzhkVar, int i) {
        zzhkVar.f40195zzd |= 1;
        zzhkVar.f40196zze = i;
    }

    public final int zza() {
        return this.f40196zze;
    }

    public final long zzb() {
        return this.f40197zzf;
    }

    public final boolean zzg() {
        return (this.f40195zzd & 2) != 0;
    }

    public final boolean zzh() {
        return (this.f40195zzd & 1) != 0;
    }

    @Override // com.google.android.gms.internal.measurement.zzmd
    public final Object zzl(int i, Object obj2, Object obj3) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzmd.zzcq(f40194zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဂ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new zzhk();
        }
        zzip zzipVar = null;
        if (i2 == 4) {
            return new zzhj(zzipVar);
        }
        if (i2 == 5) {
            return f40194zzb;
        }
        throw null;
    }
}
