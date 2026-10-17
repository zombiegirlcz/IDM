package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes16.dex */
public final class zzkk extends zzfu implements zzhc {

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private static final zzkk f46253zzb;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private int f46254zzd;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    private int f46256zzf;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    private zzfz f46255zze = zzfu.zzv();

    /* JADX INFO: renamed from: zzg, reason: collision with root package name */
    private String f46257zzg = "";

    static {
        zzkk zzkkVar = new zzkk();
        f46253zzb = zzkkVar;
        zzfu.zzB(zzkk.class, zzkkVar);
    }

    private zzkk() {
    }

    @Override // com.google.android.gms.internal.play_billing.zzfu
    public final Object zzd(int i, Object obj2, Object obj3) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzfu.zzy(f46253zzb, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001a\u0002င\u0000\u0003ဈ\u0001", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new zzkk();
        }
        zzkj zzkjVar = null;
        if (i2 == 4) {
            return new zzki(zzkjVar);
        }
        if (i2 == 5) {
            return f46253zzb;
        }
        throw null;
    }
}
