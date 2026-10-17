package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes16.dex */
public final class zzim extends zzmd implements zzni {

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private static final zzim f40268zzb;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private int f40269zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    private int f40270zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    private int f40271zzf;

    /* JADX INFO: renamed from: zzg, reason: collision with root package name */
    private int f40272zzg;

    static {
        zzim zzimVar = new zzim();
        f40268zzb = zzimVar;
        zzmd.zzct(zzim.class, zzimVar);
    }

    private zzim() {
    }

    public static zzif zza() {
        return (zzif) f40268zzb.zzcg();
    }

    public static zzim zzd() {
        return f40268zzb;
    }

    public static /* synthetic */ void zze(zzim zzimVar, zzih zzihVar) {
        zzimVar.f40271zzf = zzihVar.zza();
        zzimVar.f40269zzd |= 2;
    }

    public static /* synthetic */ void zzh(zzim zzimVar, int i) {
        zzimVar.f40272zzg = i - 1;
        zzimVar.f40269zzd |= 4;
    }

    public static /* synthetic */ void zzi(zzim zzimVar, int i) {
        zzimVar.f40270zze = i - 1;
        zzimVar.f40269zzd |= 1;
    }

    public final zzih zzb() {
        zzih zzihVarZzb = zzih.zzb(this.f40271zzf);
        return zzihVarZzb == null ? zzih.CLIENT_UPLOAD_ELIGIBILITY_UNKNOWN : zzihVarZzb;
    }

    public final int zzf() {
        int iZza = zzij.zza(this.f40272zzg);
        if (iZza == 0) {
            return 1;
        }
        return iZza;
    }

    public final int zzg() {
        int iZza = zzil.zza(this.f40270zze);
        if (iZza == 0) {
            return 1;
        }
        return iZza;
    }

    @Override // com.google.android.gms.internal.measurement.zzmd
    public final Object zzl(int i, Object obj2, Object obj3) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzmd.zzcq(f40268zzb, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0002", new Object[]{"zzd", "zze", zzik.f40267zza, "zzf", zzig.f40253zza, "zzg", zzii.f40266zza});
        }
        if (i2 == 3) {
            return new zzim();
        }
        zzip zzipVar = null;
        if (i2 == 4) {
            return new zzif(zzipVar);
        }
        if (i2 == 5) {
            return f40268zzb;
        }
        throw null;
    }
}
