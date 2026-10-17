package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes16.dex */
public final class zzhe extends zzmd implements zzni {

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private static final zzhe f40170zzb;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private int f40171zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    private String f40172zze = "";

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    private String f40173zzf = "";

    /* JADX INFO: renamed from: zzg, reason: collision with root package name */
    private String f40174zzg = "";

    /* JADX INFO: renamed from: zzh, reason: collision with root package name */
    private String f40175zzh = "";

    /* JADX INFO: renamed from: zzi, reason: collision with root package name */
    private String f40176zzi = "";

    /* JADX INFO: renamed from: zzj, reason: collision with root package name */
    private String f40177zzj = "";

    /* JADX INFO: renamed from: zzk, reason: collision with root package name */
    private String f40178zzk = "";

    static {
        zzhe zzheVar = new zzhe();
        f40170zzb = zzheVar;
        zzmd.zzct(zzhe.class, zzheVar);
    }

    private zzhe() {
    }

    @Override // com.google.android.gms.internal.measurement.zzmd
    public final Object zzl(int i, Object obj2, Object obj3) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzmd.zzcq(f40170zzb, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        }
        if (i2 == 3) {
            return new zzhe();
        }
        zzip zzipVar = null;
        if (i2 == 4) {
            return new zzhd(zzipVar);
        }
        if (i2 == 5) {
            return f40170zzb;
        }
        throw null;
    }
}
