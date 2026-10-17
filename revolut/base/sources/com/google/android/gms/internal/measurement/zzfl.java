package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes16.dex */
public final class zzfl extends zzmd implements zzni {

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private static final zzfl f40062zzb;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private int f40063zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    private zzfv f40064zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    private zzfp f40065zzf;

    /* JADX INFO: renamed from: zzg, reason: collision with root package name */
    private boolean f40066zzg;

    /* JADX INFO: renamed from: zzh, reason: collision with root package name */
    private String f40067zzh = "";

    static {
        zzfl zzflVar = new zzfl();
        f40062zzb = zzflVar;
        zzmd.zzct(zzfl.class, zzflVar);
    }

    private zzfl() {
    }

    public static zzfl zzb() {
        return f40062zzb;
    }

    public static /* synthetic */ void zzf(zzfl zzflVar, String str) {
        zzflVar.f40063zzd |= 8;
        zzflVar.f40067zzh = str;
    }

    public final zzfp zzc() {
        zzfp zzfpVar = this.f40065zzf;
        return zzfpVar == null ? zzfp.zzb() : zzfpVar;
    }

    public final zzfv zzd() {
        zzfv zzfvVar = this.f40064zze;
        return zzfvVar == null ? zzfv.zzc() : zzfvVar;
    }

    public final String zze() {
        return this.f40067zzh;
    }

    public final boolean zzg() {
        return this.f40066zzg;
    }

    public final boolean zzh() {
        return (this.f40063zzd & 4) != 0;
    }

    public final boolean zzi() {
        return (this.f40063zzd & 2) != 0;
    }

    public final boolean zzj() {
        return (this.f40063zzd & 8) != 0;
    }

    public final boolean zzk() {
        return (this.f40063zzd & 1) != 0;
    }

    @Override // com.google.android.gms.internal.measurement.zzmd
    public final Object zzl(int i, Object obj2, Object obj3) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzmd.zzcq(f40062zzb, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဇ\u0002\u0004ဈ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new zzfl();
        }
        zzfw zzfwVar = null;
        if (i2 == 4) {
            return new zzfk(zzfwVar);
        }
        if (i2 == 5) {
            return f40062zzb;
        }
        throw null;
    }
}
