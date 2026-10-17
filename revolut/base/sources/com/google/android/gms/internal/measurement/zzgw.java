package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes16.dex */
public final class zzgw extends zzmd implements zzni {

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private static final zzgw f40148zzb;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private int f40149zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    private String f40150zze = "";

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    private String f40151zzf = "";

    static {
        zzgw zzgwVar = new zzgw();
        f40148zzb = zzgwVar;
        zzmd.zzct(zzgw.class, zzgwVar);
    }

    private zzgw() {
    }

    public final String zzb() {
        return this.f40150zze;
    }

    public final String zzc() {
        return this.f40151zzf;
    }

    @Override // com.google.android.gms.internal.measurement.zzmd
    public final Object zzl(int i, Object obj2, Object obj3) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzmd.zzcq(f40148zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new zzgw();
        }
        zzgz zzgzVar = null;
        if (i2 == 4) {
            return new zzgv(zzgzVar);
        }
        if (i2 == 5) {
            return f40148zzb;
        }
        throw null;
    }
}
