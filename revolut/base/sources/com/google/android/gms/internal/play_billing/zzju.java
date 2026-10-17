package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes16.dex */
public final class zzju extends zzfu implements zzhc {

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private static final zzju f46227zzb;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private int f46228zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    private boolean f46229zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    private boolean f46230zzf;

    static {
        zzju zzjuVar = new zzju();
        f46227zzb = zzjuVar;
        zzfu.zzB(zzju.class, zzjuVar);
    }

    private zzju() {
    }

    @Override // com.google.android.gms.internal.play_billing.zzfu
    public final Object zzd(int i, Object obj2, Object obj3) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzfu.zzy(f46227zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new zzju();
        }
        zzjt zzjtVar = null;
        if (i2 == 4) {
            return new zzjs(zzjtVar);
        }
        if (i2 == 5) {
            return f46227zzb;
        }
        throw null;
    }
}
