package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes16.dex */
public final class zzdp extends zzfu implements zzhc {

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private static final zzdp f45925zzb;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private int f45926zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    private String f45927zze = "";

    static {
        zzdp zzdpVar = new zzdp();
        f45925zzb = zzdpVar;
        zzfu.zzB(zzdp.class, zzdpVar);
    }

    private zzdp() {
    }

    public static zzdp zzb() {
        return f45925zzb;
    }

    public final String zzc() {
        return this.f45927zze;
    }

    @Override // com.google.android.gms.internal.play_billing.zzfu
    public final Object zzd(int i, Object obj2, Object obj3) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzfu.zzy(f45925zzb, "\u0004\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဈ\u0000", new Object[]{"zzd", "zze"});
        }
        if (i2 == 3) {
            return new zzdp();
        }
        zzdo zzdoVar = null;
        if (i2 == 4) {
            return new zzdn(zzdoVar);
        }
        if (i2 == 5) {
            return f45925zzb;
        }
        throw null;
    }
}
