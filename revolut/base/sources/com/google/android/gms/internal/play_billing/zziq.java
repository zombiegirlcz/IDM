package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes16.dex */
public final class zziq extends zzfu implements zzhc {

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private static final zziq f46134zzb;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private int f46135zzd = 0;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    private Object f46136zze;

    static {
        zziq zziqVar = new zziq();
        f46134zzb = zziqVar;
        zzfu.zzB(zziq.class, zziqVar);
    }

    private zziq() {
    }

    public static zzio zza() {
        return (zzio) f46134zzb.zzp();
    }

    public static zziq zzc() {
        return f46134zzb;
    }

    public static /* synthetic */ void zze(zziq zziqVar, String str) {
        str.getClass();
        zziqVar.f46135zzd = 3;
        zziqVar.f46136zze = str;
    }

    @Override // com.google.android.gms.internal.play_billing.zzfu
    public final Object zzd(int i, Object obj2, Object obj3) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new zzhk(f46134zzb, "\u0000\u0006\u0001\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001?\u0000\u00023\u0000\u0003Ȼ\u0000\u0004:\u0000\u0005<\u0000\u0006<\u0000", new Object[]{"zze", "zzd", zzhx.class, zzgo.class});
        }
        if (i2 == 3) {
            return new zziq();
        }
        zzip zzipVar = null;
        if (i2 == 4) {
            return new zzio(zzipVar);
        }
        if (i2 == 5) {
            return f46134zzb;
        }
        throw null;
    }
}
