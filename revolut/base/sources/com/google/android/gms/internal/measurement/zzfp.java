package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes16.dex */
public final class zzfp extends zzmd implements zzni {

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private static final zzfp f40069zzb;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private int f40070zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    private int f40071zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    private boolean f40072zzf;

    /* JADX INFO: renamed from: zzg, reason: collision with root package name */
    private String f40073zzg = "";

    /* JADX INFO: renamed from: zzh, reason: collision with root package name */
    private String f40074zzh = "";

    /* JADX INFO: renamed from: zzi, reason: collision with root package name */
    private String f40075zzi = "";

    static {
        zzfp zzfpVar = new zzfp();
        f40069zzb = zzfpVar;
        zzmd.zzct(zzfp.class, zzfpVar);
    }

    private zzfp() {
    }

    public static zzfp zzb() {
        return f40069zzb;
    }

    public final String zzc() {
        return this.f40073zzg;
    }

    public final String zzd() {
        return this.f40075zzi;
    }

    public final String zze() {
        return this.f40074zzh;
    }

    public final boolean zzf() {
        return this.f40072zzf;
    }

    public final boolean zzg() {
        return (this.f40070zzd & 1) != 0;
    }

    public final boolean zzh() {
        return (this.f40070zzd & 4) != 0;
    }

    public final boolean zzi() {
        return (this.f40070zzd & 2) != 0;
    }

    public final boolean zzj() {
        return (this.f40070zzd & 16) != 0;
    }

    public final boolean zzk() {
        return (this.f40070zzd & 8) != 0;
    }

    @Override // com.google.android.gms.internal.measurement.zzmd
    public final Object zzl(int i, Object obj2, Object obj3) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzmd.zzcq(f40069zzb, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004", new Object[]{"zzd", "zze", zzfn.f40068zza, "zzf", "zzg", "zzh", "zzi"});
        }
        if (i2 == 3) {
            return new zzfp();
        }
        zzfw zzfwVar = null;
        if (i2 == 4) {
            return new zzfm(zzfwVar);
        }
        if (i2 == 5) {
            return f40069zzb;
        }
        throw null;
    }

    public final int zzm() {
        int iZza = zzfo.zza(this.f40071zze);
        if (iZza == 0) {
            return 1;
        }
        return iZza;
    }
}
