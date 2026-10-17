package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes16.dex */
public final class zzja extends zzfu implements zzhc {

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private static final zzja f46172zzb;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private int f46173zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    private int f46174zze = 0;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    private Object f46175zzf;

    /* JADX INFO: renamed from: zzg, reason: collision with root package name */
    private int f46176zzg;

    /* JADX INFO: renamed from: zzh, reason: collision with root package name */
    private int f46177zzh;

    static {
        zzja zzjaVar = new zzja();
        f46172zzb = zzjaVar;
        zzfu.zzB(zzja.class, zzjaVar);
    }

    private zzja() {
    }

    public static /* synthetic */ void zzG(zzja zzjaVar, int i) {
        zzjaVar.f46176zzg = i - 1;
        zzjaVar.f46173zzd |= 1;
    }

    public static zziy zza() {
        return (zziy) f46172zzb.zzp();
    }

    public static /* synthetic */ void zze(zzja zzjaVar, zzjk zzjkVar) {
        zzjaVar.f46177zzh = zzjkVar.zza();
        zzjaVar.f46173zzd |= 2;
    }

    public static /* synthetic */ void zzf(zzja zzjaVar, zzjy zzjyVar) {
        zzjyVar.getClass();
        zzjaVar.f46175zzf = zzjyVar;
        zzjaVar.f46174zze = 2;
    }

    public static /* synthetic */ void zzg(zzja zzjaVar, zzke zzkeVar) {
        zzkeVar.getClass();
        zzjaVar.f46175zzf = zzkeVar;
        zzjaVar.f46174zze = 4;
    }

    public static /* synthetic */ void zzh(zzja zzjaVar, zzku zzkuVar) {
        zzkuVar.getClass();
        zzjaVar.f46175zzf = zzkuVar;
        zzjaVar.f46174zze = 3;
    }

    public final zzke zzc() {
        return this.f46174zze == 4 ? (zzke) this.f46175zzf : zzke.zzb();
    }

    @Override // com.google.android.gms.internal.play_billing.zzfu
    public final Object zzd(int i, Object obj2, Object obj3) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzfu.zzy(f46172zzb, "\u0004\u0005\u0001\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005᠌\u0001", new Object[]{"zzf", "zze", "zzd", "zzg", zzix.f46166zza, zzjy.class, zzku.class, zzke.class, "zzh", zzjj.f46200zza});
        }
        if (i2 == 3) {
            return new zzja();
        }
        zziz zzizVar = null;
        if (i2 == 4) {
            return new zziy(zzizVar);
        }
        if (i2 == 5) {
            return f46172zzb;
        }
        throw null;
    }
}
