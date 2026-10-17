package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes16.dex */
public final class zzgb extends zzmd implements zzni {

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private static final zzgb f40099zzb;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private int f40100zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    private int f40101zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    private int f40102zzf;

    static {
        zzgb zzgbVar = new zzgb();
        f40099zzb = zzgbVar;
        zzmd.zzct(zzgb.class, zzgbVar);
    }

    private zzgb() {
    }

    public final int zzb() {
        int iZza = zzgf.zza(this.f40102zzf);
        if (iZza == 0) {
            return 1;
        }
        return iZza;
    }

    public final int zzc() {
        int iZza = zzgf.zza(this.f40101zze);
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
            zzmg zzmgVar = zzge.f40104zza;
            return zzmd.zzcq(f40099zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"zzd", "zze", zzmgVar, "zzf", zzmgVar});
        }
        if (i2 == 3) {
            return new zzgb();
        }
        zzgz zzgzVar = null;
        if (i2 == 4) {
            return new zzga(zzgzVar);
        }
        if (i2 == 5) {
            return f40099zzb;
        }
        throw null;
    }
}
