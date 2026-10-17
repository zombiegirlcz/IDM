package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes16.dex */
public final class zzkc extends zzfu implements zzhc {

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private static final zzkc f46238zzb;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private int f46239zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    private int f46240zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    private String f46241zzf = "";

    static {
        zzkc zzkcVar = new zzkc();
        f46238zzb = zzkcVar;
        zzfu.zzB(zzkc.class, zzkcVar);
    }

    private zzkc() {
    }

    @Override // com.google.android.gms.internal.play_billing.zzfu
    public final Object zzd(int i, Object obj2, Object obj3) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzfu.zzy(f46238zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001", new Object[]{"zzd", "zze", zzkb.f46237zza, "zzf"});
        }
        if (i2 == 3) {
            return new zzkc();
        }
        zzkd zzkdVar = null;
        if (i2 == 4) {
            return new zzka(zzkdVar);
        }
        if (i2 == 5) {
            return f46238zzb;
        }
        throw null;
    }
}
