package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes16.dex */
public final class zzjy extends zzfu implements zzhc {

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private static final zzjy f46232zzb;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private int f46233zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    private int f46234zze;

    static {
        zzjy zzjyVar = new zzjy();
        f46232zzb = zzjyVar;
        zzfu.zzB(zzjy.class, zzjyVar);
    }

    private zzjy() {
    }

    public static zzjv zza() {
        return (zzjv) f46232zzb.zzp();
    }

    public static /* synthetic */ void zzc(zzjy zzjyVar, int i) {
        zzjyVar.f46234zze = i - 1;
        zzjyVar.f46233zzd |= 1;
    }

    @Override // com.google.android.gms.internal.play_billing.zzfu
    public final Object zzd(int i, Object obj2, Object obj3) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzfu.zzy(f46232zzb, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"zzd", "zze", zzjw.f46231zza});
        }
        if (i2 == 3) {
            return new zzjy();
        }
        zzjx zzjxVar = null;
        if (i2 == 4) {
            return new zzjv(zzjxVar);
        }
        if (i2 == 5) {
            return f46232zzb;
        }
        throw null;
    }
}
