package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes16.dex */
public final class zzgh extends zzmd implements zzni {

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private static final zzgh f40105zzb;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private int f40106zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    private String f40107zze = "";

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    private String f40108zzf = "";

    static {
        zzgh zzghVar = new zzgh();
        f40105zzb = zzghVar;
        zzmd.zzct(zzgh.class, zzghVar);
    }

    private zzgh() {
    }

    public final String zzb() {
        return this.f40107zze;
    }

    @Override // com.google.android.gms.internal.measurement.zzmd
    public final Object zzl(int i, Object obj2, Object obj3) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzmd.zzcq(f40105zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new zzgh();
        }
        zzgz zzgzVar = null;
        if (i2 == 4) {
            return new zzgg(zzgzVar);
        }
        if (i2 == 5) {
            return f40105zzb;
        }
        throw null;
    }
}
