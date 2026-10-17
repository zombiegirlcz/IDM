package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes16.dex */
public final class zzku extends zzfu implements zzhc {

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private static final zzku f46266zzb;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private int f46267zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    private int f46268zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    private boolean f46269zzf;

    /* JADX INFO: renamed from: zzg, reason: collision with root package name */
    private long f46270zzg;

    /* JADX INFO: renamed from: zzh, reason: collision with root package name */
    private boolean f46271zzh;

    /* JADX INFO: renamed from: zzi, reason: collision with root package name */
    private int f46272zzi;

    /* JADX INFO: renamed from: zzj, reason: collision with root package name */
    private int f46273zzj;

    static {
        zzku zzkuVar = new zzku();
        f46266zzb = zzkuVar;
        zzfu.zzB(zzku.class, zzkuVar);
    }

    private zzku() {
    }

    public static zzks zza() {
        return (zzks) f46266zzb.zzp();
    }

    public static /* synthetic */ void zzc(zzku zzkuVar, boolean z) {
        zzkuVar.f46267zzd |= 8;
        zzkuVar.f46271zzh = z;
    }

    public static /* synthetic */ void zze(zzku zzkuVar, int i) {
        zzkuVar.f46267zzd |= 16;
        zzkuVar.f46272zzi = i;
    }

    public static /* synthetic */ void zzf(zzku zzkuVar, long j2) {
        zzkuVar.f46267zzd |= 4;
        zzkuVar.f46270zzg = j2;
    }

    public static /* synthetic */ void zzg(zzku zzkuVar, int i) {
        zzkuVar.f46267zzd |= 32;
        zzkuVar.f46273zzj = 0;
    }

    public static /* synthetic */ void zzh(zzku zzkuVar, boolean z) {
        zzkuVar.f46267zzd |= 2;
        zzkuVar.f46269zzf = true;
    }

    @Override // com.google.android.gms.internal.play_billing.zzfu
    public final Object zzd(int i, Object obj2, Object obj3) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzfu.zzy(f46266zzb, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002ဇ\u0001\u0003ဂ\u0002\u0004ဇ\u0003\u0005င\u0004\u0006င\u0005", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        if (i2 == 3) {
            return new zzku();
        }
        zzkt zzktVar = null;
        if (i2 == 4) {
            return new zzks(zzktVar);
        }
        if (i2 == 5) {
            return f46266zzb;
        }
        throw null;
    }
}
