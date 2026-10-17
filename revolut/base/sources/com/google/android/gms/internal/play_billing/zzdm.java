package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes16.dex */
public final class zzdm extends zzfu implements zzhc {

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private static final zzdm f45922zzb;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private int f45923zzd = 0;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    private Object f45924zze;

    static {
        zzdm zzdmVar = new zzdm();
        f45922zzb = zzdmVar;
        zzfu.zzB(zzdm.class, zzdmVar);
    }

    private zzdm() {
    }

    public static zzdm zzb(byte[] bArr) throws zzgc {
        return (zzdm) zzfu.zzt(f45922zzb, bArr);
    }

    public final zzdp zzc() {
        return this.f45923zzd == 2 ? (zzdp) this.f45924zze : zzdp.zzb();
    }

    @Override // com.google.android.gms.internal.play_billing.zzfu
    public final Object zzd(int i, Object obj2, Object obj3) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzfu.zzy(f45922zzb, "\u0004\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001;\u0000\u0002<\u0000", new Object[]{"zze", "zzd", zzdp.class});
        }
        if (i2 == 3) {
            return new zzdm();
        }
        zzdl zzdlVar = null;
        if (i2 == 4) {
            return new zzdk(zzdlVar);
        }
        if (i2 == 5) {
            return f45922zzb;
        }
        throw null;
    }
}
