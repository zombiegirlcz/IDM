package com.google.android.gms.internal.play_billing;

import java.util.Map;

/* JADX INFO: loaded from: classes16.dex */
public final class zzhx extends zzfu implements zzhc {

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private static final zzhx f46115zzb;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private zzgv f46116zzd = zzgv.zza();

    static {
        zzhx zzhxVar = new zzhx();
        f46115zzb = zzhxVar;
        zzfu.zzB(zzhx.class, zzhxVar);
    }

    private zzhx() {
    }

    public static zzhu zza() {
        return (zzhu) f46115zzb.zzp();
    }

    public static /* synthetic */ Map zzc(zzhx zzhxVar) {
        if (!zzhxVar.f46116zzd.zze()) {
            zzhxVar.f46116zzd = zzhxVar.f46116zzd.zzb();
        }
        return zzhxVar.f46116zzd;
    }

    @Override // com.google.android.gms.internal.play_billing.zzfu
    public final Object zzd(int i, Object obj2, Object obj3) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new zzhk(f46115zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"zzd", zzhv.f46114zza});
        }
        if (i2 == 3) {
            return new zzhx();
        }
        zzhw zzhwVar = null;
        if (i2 == 4) {
            return new zzhu(zzhwVar);
        }
        if (i2 == 5) {
            return f46115zzb;
        }
        throw null;
    }
}
