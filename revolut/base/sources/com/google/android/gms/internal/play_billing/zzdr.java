package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes16.dex */
public final class zzdr extends zzfu implements zzhc {

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private static final zzdr f45928zzb;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private int f45929zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    private zzeb f45930zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    private zzeb f45931zzf;

    /* JADX INFO: renamed from: zzg, reason: collision with root package name */
    private int f45932zzg;

    static {
        zzdr zzdrVar = new zzdr();
        f45928zzb = zzdrVar;
        zzfu.zzB(zzdr.class, zzdrVar);
    }

    private zzdr() {
    }

    public static zzdq zza() {
        return (zzdq) f45928zzb.zzp();
    }

    public static /* synthetic */ void zzc(zzdr zzdrVar, zzeb zzebVar) {
        zzebVar.getClass();
        zzdrVar.f45930zze = zzebVar;
        zzdrVar.f45929zzd |= 1;
    }

    public static /* synthetic */ void zze(zzdr zzdrVar, zzeb zzebVar) {
        zzebVar.getClass();
        zzdrVar.f45931zzf = zzebVar;
        zzdrVar.f45929zzd |= 2;
    }

    public static /* synthetic */ void zzf(zzdr zzdrVar, int i) {
        zzdrVar.f45932zzg = i - 1;
        zzdrVar.f45929zzd |= 4;
    }

    @Override // com.google.android.gms.internal.play_billing.zzfu
    public final Object zzd(int i, Object obj2, Object obj3) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzfu.zzy(f45928zzb, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003᠌\u0002", new Object[]{"zzd", "zze", "zzf", "zzg", zzee.zza()});
        }
        if (i2 == 3) {
            return new zzdr();
        }
        zzdu zzduVar = null;
        if (i2 == 4) {
            return new zzdq(zzduVar);
        }
        if (i2 == 5) {
            return f45928zzb;
        }
        throw null;
    }
}
