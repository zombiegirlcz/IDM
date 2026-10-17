package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes16.dex */
public final class zzkr extends zzfu implements zzhc {

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private static final zzkr f46263zzb;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private int f46264zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    private int f46265zze;

    static {
        zzkr zzkrVar = new zzkr();
        f46263zzb = zzkrVar;
        zzfu.zzB(zzkr.class, zzkrVar);
    }

    private zzkr() {
    }

    public static zzkr zzb() {
        return f46263zzb;
    }

    @Override // com.google.android.gms.internal.play_billing.zzfu
    public final Object zzd(int i, Object obj2, Object obj3) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzfu.zzy(f46263zzb, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"zzd", "zze", zzkp.f46262zza});
        }
        if (i2 == 3) {
            return new zzkr();
        }
        zzkq zzkqVar = null;
        if (i2 == 4) {
            return new zzko(zzkqVar);
        }
        if (i2 == 5) {
            return f46263zzb;
        }
        throw null;
    }
}
