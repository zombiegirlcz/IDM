package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes16.dex */
public final class zzhs extends zzmd implements zzni {

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private static final zzhs f40217zzb;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private int f40218zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    private String f40219zze = "";

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    private String f40220zzf = "";

    /* JADX INFO: renamed from: zzg, reason: collision with root package name */
    private zzhe f40221zzg;

    static {
        zzhs zzhsVar = new zzhs();
        f40217zzb = zzhsVar;
        zzmd.zzct(zzhs.class, zzhsVar);
    }

    private zzhs() {
    }

    @Override // com.google.android.gms.internal.measurement.zzmd
    public final Object zzl(int i, Object obj2, Object obj3) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzmd.zzcq(f40217zzb, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new zzhs();
        }
        zzip zzipVar = null;
        if (i2 == 4) {
            return new zzhr(zzipVar);
        }
        if (i2 == 5) {
            return f40217zzb;
        }
        throw null;
    }
}
