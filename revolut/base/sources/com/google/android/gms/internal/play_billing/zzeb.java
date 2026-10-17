package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes16.dex */
public final class zzeb extends zzfu implements zzhc {

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private static final zzeb f45950zzb;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private int f45951zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    private String f45952zze = "";

    static {
        zzeb zzebVar = new zzeb();
        f45950zzb = zzebVar;
        zzfu.zzB(zzeb.class, zzebVar);
    }

    private zzeb() {
    }

    public static zzea zza() {
        return (zzea) f45950zzb.zzp();
    }

    public static /* synthetic */ void zzc(zzeb zzebVar, String str) {
        zzebVar.f45951zzd |= 1;
        zzebVar.f45952zze = str;
    }

    @Override // com.google.android.gms.internal.play_billing.zzfu
    public final Object zzd(int i, Object obj2, Object obj3) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzfu.zzy(f45950zzb, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"zzd", "zze"});
        }
        if (i2 == 3) {
            return new zzeb();
        }
        zzec zzecVar = null;
        if (i2 == 4) {
            return new zzea(zzecVar);
        }
        if (i2 == 5) {
            return f45950zzb;
        }
        throw null;
    }
}
