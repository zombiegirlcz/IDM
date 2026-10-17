package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes16.dex */
public final class zzjf extends zzfu implements zzhc {

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private static final zzjf f46191zzb;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private int f46192zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    private int f46193zze;

    /* JADX INFO: renamed from: zzg, reason: collision with root package name */
    private int f46195zzg;

    /* JADX INFO: renamed from: zzi, reason: collision with root package name */
    private int f46197zzi;

    /* JADX INFO: renamed from: zzj, reason: collision with root package name */
    private int f46198zzj;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    private String f46194zzf = "";

    /* JADX INFO: renamed from: zzh, reason: collision with root package name */
    private String f46196zzh = "";

    static {
        zzjf zzjfVar = new zzjf();
        f46191zzb = zzjfVar;
        zzfu.zzB(zzjf.class, zzjfVar);
    }

    private zzjf() {
    }

    public static /* synthetic */ void zzG(zzjf zzjfVar, int i) {
        zzjfVar.f46192zzd |= 1;
        zzjfVar.f46193zze = i;
    }

    public static zzjb zza() {
        return (zzjb) f46191zzb.zzp();
    }

    public static /* synthetic */ void zzc(zzjf zzjfVar, String str) {
        zzjfVar.f46192zzd |= 8;
        zzjfVar.f46196zzh = str;
    }

    public static /* synthetic */ void zze(zzjf zzjfVar, String str) {
        str.getClass();
        zzjfVar.f46192zzd |= 2;
        zzjfVar.f46194zzf = str;
    }

    public static /* synthetic */ void zzf(zzjf zzjfVar, int i) {
        zzjfVar.f46192zzd |= 32;
        zzjfVar.f46198zzj = 0;
    }

    public static /* synthetic */ void zzg(zzjf zzjfVar, int i) {
        zzjfVar.f46192zzd |= 16;
        zzjfVar.f46197zzi = i;
    }

    public static /* synthetic */ void zzh(zzjf zzjfVar, zzjd zzjdVar) {
        zzjfVar.f46195zzg = zzjdVar.zza();
        zzjfVar.f46192zzd |= 4;
    }

    @Override // com.google.android.gms.internal.play_billing.zzfu
    public final Object zzd(int i, Object obj2, Object obj3) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzfu.zzy(f46191zzb, "\u0004\u0006\u0000\u0001\u0001\b\u0006\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0004᠌\u0002\u0005ဈ\u0003\u0007င\u0004\bင\u0005", new Object[]{"zzd", "zze", "zzf", "zzg", zzjc.f46178zza, "zzh", "zzi", "zzj"});
        }
        if (i2 == 3) {
            return new zzjf();
        }
        zzje zzjeVar = null;
        if (i2 == 4) {
            return new zzjb(zzjeVar);
        }
        if (i2 == 5) {
            return f46191zzb;
        }
        throw null;
    }
}
