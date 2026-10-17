package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes16.dex */
public final class zziw extends zzfu implements zzhc {

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private static final zziw f46159zzb;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private int f46160zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    private int f46161zze = 0;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    private Object f46162zzf;

    /* JADX INFO: renamed from: zzg, reason: collision with root package name */
    private int f46163zzg;

    /* JADX INFO: renamed from: zzh, reason: collision with root package name */
    private zzjf f46164zzh;

    /* JADX INFO: renamed from: zzi, reason: collision with root package name */
    private int f46165zzi;

    static {
        zziw zziwVar = new zziw();
        f46159zzb = zziwVar;
        zzfu.zzB(zziw.class, zziwVar);
    }

    private zziw() {
    }

    public static /* synthetic */ void zzG(zziw zziwVar, zzke zzkeVar) {
        zzkeVar.getClass();
        zziwVar.f46162zzf = zzkeVar;
        zziwVar.f46161zze = 7;
    }

    public static /* synthetic */ void zzH(zziw zziwVar, zzku zzkuVar) {
        zzkuVar.getClass();
        zziwVar.f46162zzf = zzkuVar;
        zziwVar.f46161zze = 6;
    }

    public static /* synthetic */ void zzI(zziw zziwVar, int i) {
        zziwVar.f46163zzg = i - 1;
        zziwVar.f46160zzd |= 1;
    }

    public static zziu zza() {
        return (zziu) f46159zzb.zzp();
    }

    public static zziw zzc(byte[] bArr) throws zzgc {
        return (zziw) zzfu.zzt(f46159zzb, bArr);
    }

    public static /* synthetic */ void zzf(zziw zziwVar, zzjk zzjkVar) {
        zziwVar.f46165zzi = zzjkVar.zza();
        zziwVar.f46160zzd |= 4;
    }

    public static /* synthetic */ void zzg(zziw zziwVar, zzjf zzjfVar) {
        zzjfVar.getClass();
        zziwVar.f46164zzh = zzjfVar;
        zziwVar.f46160zzd |= 2;
    }

    public static /* synthetic */ void zzh(zziw zziwVar, zzjy zzjyVar) {
        zzjyVar.getClass();
        zziwVar.f46162zzf = zzjyVar;
        zziwVar.f46161zze = 4;
    }

    @Override // com.google.android.gms.internal.play_billing.zzfu
    public final Object zzd(int i, Object obj2, Object obj3) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzfu.zzy(f46159zzb, "\u0004\u0006\u0001\u0001\u0001\u0007\u0006\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0004<\u0000\u0005᠌\u0002\u0006<\u0000\u0007<\u0000", new Object[]{"zzf", "zze", "zzd", "zzg", zzix.f46166zza, "zzh", zzjy.class, "zzi", zzjj.f46200zza, zzku.class, zzke.class});
        }
        if (i2 == 3) {
            return new zziw();
        }
        zziv zzivVar = null;
        if (i2 == 4) {
            return new zziu(zzivVar);
        }
        if (i2 == 5) {
            return f46159zzb;
        }
        throw null;
    }

    public final zzke zze() {
        return this.f46161zze == 7 ? (zzke) this.f46162zzf : zzke.zzb();
    }
}
