package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes16.dex */
public final class zzfr extends zzmd implements zzni {

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private static final zzfr f40076zzb;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private int f40077zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    private int f40078zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    private String f40079zzf = "";

    /* JADX INFO: renamed from: zzg, reason: collision with root package name */
    private zzfl f40080zzg;

    /* JADX INFO: renamed from: zzh, reason: collision with root package name */
    private boolean f40081zzh;

    /* JADX INFO: renamed from: zzi, reason: collision with root package name */
    private boolean f40082zzi;

    /* JADX INFO: renamed from: zzj, reason: collision with root package name */
    private boolean f40083zzj;

    static {
        zzfr zzfrVar = new zzfr();
        f40076zzb = zzfrVar;
        zzmd.zzct(zzfr.class, zzfrVar);
    }

    private zzfr() {
    }

    public static zzfq zzc() {
        return (zzfq) f40076zzb.zzcg();
    }

    public static /* synthetic */ void zzf(zzfr zzfrVar, String str) {
        zzfrVar.f40077zzd |= 2;
        zzfrVar.f40079zzf = str;
    }

    public final int zza() {
        return this.f40078zze;
    }

    public final zzfl zzb() {
        zzfl zzflVar = this.f40080zzg;
        return zzflVar == null ? zzfl.zzb() : zzflVar;
    }

    public final String zze() {
        return this.f40079zzf;
    }

    public final boolean zzg() {
        return this.f40081zzh;
    }

    public final boolean zzh() {
        return this.f40082zzi;
    }

    public final boolean zzi() {
        return this.f40083zzj;
    }

    public final boolean zzj() {
        return (this.f40077zzd & 1) != 0;
    }

    public final boolean zzk() {
        return (this.f40077zzd & 32) != 0;
    }

    @Override // com.google.android.gms.internal.measurement.zzmd
    public final Object zzl(int i, Object obj2, Object obj3) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzmd.zzcq(f40076zzb, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        if (i2 == 3) {
            return new zzfr();
        }
        zzfw zzfwVar = null;
        if (i2 == 4) {
            return new zzfq(zzfwVar);
        }
        if (i2 == 5) {
            return f40076zzb;
        }
        throw null;
    }
}
