package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes16.dex */
public final class zzke extends zzfu implements zzhc {

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private static final zzke f46242zzb;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private int f46243zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    private zzfz f46244zze = zzfu.zzv();

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    private String f46245zzf = "";

    /* JADX INFO: renamed from: zzg, reason: collision with root package name */
    private boolean f46246zzg;

    static {
        zzke zzkeVar = new zzke();
        f46242zzb = zzkeVar;
        zzfu.zzB(zzke.class, zzkeVar);
    }

    private zzke() {
    }

    public static zzke zzb() {
        return f46242zzb;
    }

    public static /* synthetic */ void zzc(zzke zzkeVar, boolean z) {
        zzkeVar.f46243zzd |= 2;
        zzkeVar.f46246zzg = z;
    }

    @Override // com.google.android.gms.internal.play_billing.zzfu
    public final Object zzd(int i, Object obj2, Object obj3) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzfu.zzy(f46242zzb, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0003ဇ\u0001", new Object[]{"zzd", "zze", zzkc.class, "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new zzke();
        }
        zzkd zzkdVar = null;
        if (i2 == 4) {
            return new zzjz(zzkdVar);
        }
        if (i2 == 5) {
            return f46242zzb;
        }
        throw null;
    }
}
