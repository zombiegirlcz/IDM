package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes16.dex */
public final class zzkn extends zzfu implements zzhc {

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private static final zzkn f46258zzb;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private int f46259zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    private zzjf f46260zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    private long f46261zzf;

    static {
        zzkn zzknVar = new zzkn();
        f46258zzb = zzknVar;
        zzfu.zzB(zzkn.class, zzknVar);
    }

    private zzkn() {
    }

    public static zzkl zza() {
        return (zzkl) f46258zzb.zzp();
    }

    public static /* synthetic */ void zzc(zzkn zzknVar, zzjf zzjfVar) {
        zzjfVar.getClass();
        zzknVar.f46260zze = zzjfVar;
        zzknVar.f46259zzd |= 1;
    }

    public static /* synthetic */ void zze(zzkn zzknVar, long j2) {
        zzknVar.f46259zzd |= 2;
        zzknVar.f46261zzf = j2;
    }

    @Override // com.google.android.gms.internal.play_billing.zzfu
    public final Object zzd(int i, Object obj2, Object obj3) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzfu.zzy(f46258zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဂ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new zzkn();
        }
        zzkm zzkmVar = null;
        if (i2 == 4) {
            return new zzkl(zzkmVar);
        }
        if (i2 == 5) {
            return f46258zzb;
        }
        throw null;
    }
}
