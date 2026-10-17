package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes16.dex */
public final class zzkh extends zzfu implements zzhc {

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private static final zzkh f46247zzb;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private int f46248zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    private int f46249zze = 0;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    private Object f46250zzf;

    /* JADX INFO: renamed from: zzg, reason: collision with root package name */
    private zzjr f46251zzg;

    /* JADX INFO: renamed from: zzh, reason: collision with root package name */
    private zzju f46252zzh;

    static {
        zzkh zzkhVar = new zzkh();
        f46247zzb = zzkhVar;
        zzfu.zzB(zzkh.class, zzkhVar);
    }

    private zzkh() {
    }

    public static /* synthetic */ void zzG(zzkh zzkhVar, zzkr zzkrVar) {
        zzkhVar.f46250zzf = zzkrVar;
        zzkhVar.f46249zze = 4;
    }

    public static zzkf zza() {
        return (zzkf) f46247zzb.zzp();
    }

    public static /* synthetic */ void zzc(zzkh zzkhVar, zziw zziwVar) {
        zzkhVar.f46250zzf = zziwVar;
        zzkhVar.f46249zze = 2;
    }

    public static /* synthetic */ void zze(zzkh zzkhVar, zzja zzjaVar) {
        zzkhVar.f46250zzf = zzjaVar;
        zzkhVar.f46249zze = 3;
    }

    public static /* synthetic */ void zzf(zzkh zzkhVar, zzji zzjiVar) {
        zzjiVar.getClass();
        zzkhVar.f46250zzf = zzjiVar;
        zzkhVar.f46249zze = 7;
    }

    public static /* synthetic */ void zzg(zzkh zzkhVar, zzjr zzjrVar) {
        zzjrVar.getClass();
        zzkhVar.f46251zzg = zzjrVar;
        zzkhVar.f46248zzd |= 1;
    }

    public static /* synthetic */ void zzh(zzkh zzkhVar, zzkn zzknVar) {
        zzknVar.getClass();
        zzkhVar.f46250zzf = zzknVar;
        zzkhVar.f46249zze = 8;
    }

    @Override // com.google.android.gms.internal.play_billing.zzfu
    public final Object zzd(int i, Object obj2, Object obj3) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzfu.zzy(f46247zzb, "\u0004\b\u0001\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဉ\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006ဉ\u0001\u0007<\u0000\b<\u0000", new Object[]{"zzf", "zze", "zzd", "zzg", zziw.class, zzja.class, zzkr.class, zzjo.class, "zzh", zzji.class, zzkn.class});
        }
        if (i2 == 3) {
            return new zzkh();
        }
        zzkg zzkgVar = null;
        if (i2 == 4) {
            return new zzkf(zzkgVar);
        }
        if (i2 == 5) {
            return f46247zzb;
        }
        throw null;
    }
}
