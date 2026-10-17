package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes16.dex */
public final class zzgs extends zzmd implements zzni {

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private static final zzgs f40139zzb;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private int f40140zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    private int f40141zze = 14;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    private int f40142zzf = 11;

    /* JADX INFO: renamed from: zzg, reason: collision with root package name */
    private int f40143zzg = 60;

    static {
        zzgs zzgsVar = new zzgs();
        f40139zzb = zzgsVar;
        zzmd.zzct(zzgs.class, zzgsVar);
    }

    private zzgs() {
    }

    @Override // com.google.android.gms.internal.measurement.zzmd
    public final Object zzl(int i, Object obj2, Object obj3) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzmd.zzcq(f40139zzb, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new zzgs();
        }
        zzgz zzgzVar = null;
        if (i2 == 4) {
            return new zzgr(zzgzVar);
        }
        if (i2 == 5) {
            return f40139zzb;
        }
        throw null;
    }
}
