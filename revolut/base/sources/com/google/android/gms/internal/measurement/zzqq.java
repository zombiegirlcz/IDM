package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes16.dex */
public final class zzqq implements zzqp {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    public static final zzki f40648zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    public static final zzki f40649zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    public static final zzki f40650zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    public static final zzki f40651zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    public static final zzki f40652zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    public static final zzki f40653zzf;

    static {
        zzkf zzkfVarZza = new zzkf(zzjx.zza("com.google.android.gms.measurement")).zzb().zza();
        f40648zza = zzkfVarZza.zzf("measurement.test.boolean_flag", false);
        f40649zzb = zzkfVarZza.zzd("measurement.test.cached_long_flag", -1L);
        f40650zzc = zzkfVarZza.zzc("measurement.test.double_flag", -3.0d);
        f40651zzd = zzkfVarZza.zzd("measurement.test.int_flag", -2L);
        f40652zze = zzkfVarZza.zzd("measurement.test.long_flag", -1L);
        f40653zzf = zzkfVarZza.zze("measurement.test.string_flag", "---");
    }

    @Override // com.google.android.gms.internal.measurement.zzqp
    public final double zza() {
        return ((Double) f40650zzc.zzb()).doubleValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzqp
    public final long zzb() {
        return ((Long) f40649zzb.zzb()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzqp
    public final long zzc() {
        return ((Long) f40651zzd.zzb()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzqp
    public final long zzd() {
        return ((Long) f40652zze.zzb()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzqp
    public final String zze() {
        return (String) f40653zzf.zzb();
    }

    @Override // com.google.android.gms.internal.measurement.zzqp
    public final boolean zzf() {
        return ((Boolean) f40648zza.zzb()).booleanValue();
    }
}
