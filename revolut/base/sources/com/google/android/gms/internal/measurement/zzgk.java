package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes16.dex */
public final class zzgk extends zzmd implements zzni {

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private static final zzgk f40116zzb;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private int f40117zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    private String f40118zze = "";

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    private zzmj f40119zzf = zzmd.zzcn();

    /* JADX INFO: renamed from: zzg, reason: collision with root package name */
    private boolean f40120zzg;

    static {
        zzgk zzgkVar = new zzgk();
        f40116zzb = zzgkVar;
        zzmd.zzct(zzgk.class, zzgkVar);
    }

    private zzgk() {
    }

    public final String zzb() {
        return this.f40118zze;
    }

    @Override // com.google.android.gms.internal.measurement.zzmd
    public final Object zzl(int i, Object obj2, Object obj3) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzmd.zzcq(f40116zzb, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဇ\u0001", new Object[]{"zzd", "zze", "zzf", zzgu.class, "zzg"});
        }
        if (i2 == 3) {
            return new zzgk();
        }
        zzgz zzgzVar = null;
        if (i2 == 4) {
            return new zzgj(zzgzVar);
        }
        if (i2 == 5) {
            return f40116zzb;
        }
        throw null;
    }
}
