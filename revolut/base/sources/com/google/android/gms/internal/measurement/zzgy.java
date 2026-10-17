package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes16.dex */
public final class zzgy extends zzmd implements zzni {

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private static final zzgy f40152zzb;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private int f40153zzd;

    /* JADX INFO: renamed from: zzh, reason: collision with root package name */
    private int f40157zzh;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    private String f40154zze = "";

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    private String f40155zzf = "";

    /* JADX INFO: renamed from: zzg, reason: collision with root package name */
    private String f40156zzg = "";

    /* JADX INFO: renamed from: zzi, reason: collision with root package name */
    private String f40158zzi = "";

    static {
        zzgy zzgyVar = new zzgy();
        f40152zzb = zzgyVar;
        zzmd.zzct(zzgy.class, zzgyVar);
    }

    private zzgy() {
    }

    public static zzgy zzc() {
        return f40152zzb;
    }

    public final int zza() {
        return this.f40157zzh;
    }

    public final String zzd() {
        return this.f40155zzf;
    }

    public final String zze() {
        return this.f40158zzi;
    }

    public final String zzf() {
        return this.f40154zze;
    }

    @Override // com.google.android.gms.internal.measurement.zzmd
    public final Object zzl(int i, Object obj2, Object obj3) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzmd.zzcq(f40152zzb, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004င\u0003\u0005ဈ\u0004", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (i2 == 3) {
            return new zzgy();
        }
        zzgz zzgzVar = null;
        if (i2 == 4) {
            return new zzgx(zzgzVar);
        }
        if (i2 == 5) {
            return f40152zzb;
        }
        throw null;
    }
}
