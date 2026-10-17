package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes16.dex */
public final class zzfz extends zzmd implements zzni {

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private static final zzfz f40091zzb;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private int f40092zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    private int f40093zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    private int f40094zzf;

    static {
        zzfz zzfzVar = new zzfz();
        f40091zzb = zzfzVar;
        zzmd.zzct(zzfz.class, zzfzVar);
    }

    private zzfz() {
    }

    public final int zzb() {
        int iZza = zzgd.zza(this.f40094zzf);
        if (iZza == 0) {
            return 1;
        }
        return iZza;
    }

    public final int zzc() {
        int iZza = zzgf.zza(this.f40093zze);
        if (iZza == 0) {
            return 1;
        }
        return iZza;
    }

    @Override // com.google.android.gms.internal.measurement.zzmd
    public final Object zzl(int i, Object obj2, Object obj3) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzmd.zzcq(f40091zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"zzd", "zze", zzge.f40104zza, "zzf", zzgc.f40103zza});
        }
        if (i2 == 3) {
            return new zzfz();
        }
        zzgz zzgzVar = null;
        if (i2 == 4) {
            return new zzfy(zzgzVar);
        }
        if (i2 == 5) {
            return f40091zzb;
        }
        throw null;
    }
}
