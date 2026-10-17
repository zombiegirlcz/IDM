package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes16.dex */
public final class zzdw extends zzfu implements zzhc {

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private static final zzdw f45935zzb;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private int f45936zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    private int f45937zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    private String f45938zzf = "";

    static {
        zzdw zzdwVar = new zzdw();
        f45935zzb = zzdwVar;
        zzfu.zzB(zzdw.class, zzdwVar);
    }

    private zzdw() {
    }

    public static zzdw zzc(byte[] bArr) throws zzgc {
        return (zzdw) zzfu.zzt(f45935zzb, bArr);
    }

    public final int zza() {
        return this.f45937zze;
    }

    @Override // com.google.android.gms.internal.play_billing.zzfu
    public final Object zzd(int i, Object obj2, Object obj3) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzfu.zzy(f45935zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new zzdw();
        }
        zzdz zzdzVar = null;
        if (i2 == 4) {
            return new zzdv(zzdzVar);
        }
        if (i2 == 5) {
            return f45935zzb;
        }
        throw null;
    }

    public final String zze() {
        return this.f45938zzf;
    }
}
