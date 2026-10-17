package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes16.dex */
public final class zzdy extends zzfu implements zzhc {

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private static final zzdy f45939zzb;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private int f45940zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    private int f45941zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    private int f45942zzf;

    /* JADX INFO: renamed from: zzg, reason: collision with root package name */
    private String f45943zzg = "";

    /* JADX INFO: renamed from: zzh, reason: collision with root package name */
    private String f45944zzh = "";

    /* JADX INFO: renamed from: zzi, reason: collision with root package name */
    private String f45945zzi = "";

    /* JADX INFO: renamed from: zzj, reason: collision with root package name */
    private String f45946zzj = "";

    static {
        zzdy zzdyVar = new zzdy();
        f45939zzb = zzdyVar;
        zzfu.zzB(zzdy.class, zzdyVar);
    }

    private zzdy() {
    }

    public static zzdx zza() {
        return (zzdx) f45939zzb.zzp();
    }

    public static /* synthetic */ void zzc(zzdy zzdyVar, String str) {
        zzdyVar.f45940zzd |= 4;
        zzdyVar.f45943zzg = str;
    }

    public static /* synthetic */ void zze(zzdy zzdyVar, String str) {
        str.getClass();
        zzdyVar.f45940zzd |= 16;
        zzdyVar.f45945zzi = str;
    }

    public static /* synthetic */ void zzf(zzdy zzdyVar, String str) {
        str.getClass();
        zzdyVar.f45940zzd |= 32;
        zzdyVar.f45946zzj = str;
    }

    public static /* synthetic */ void zzg(zzdy zzdyVar, String str) {
        str.getClass();
        zzdyVar.f45940zzd |= 8;
        zzdyVar.f45944zzh = str;
    }

    public static /* synthetic */ void zzh(zzdy zzdyVar, int i) {
        zzdyVar.f45940zzd |= 1;
        zzdyVar.f45941zze = 24;
    }

    @Override // com.google.android.gms.internal.play_billing.zzfu
    public final Object zzd(int i, Object obj2, Object obj3) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzfu.zzy(f45939zzb, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        if (i2 == 3) {
            return new zzdy();
        }
        zzdz zzdzVar = null;
        if (i2 == 4) {
            return new zzdx(zzdzVar);
        }
        if (i2 == 5) {
            return f45939zzb;
        }
        throw null;
    }
}
