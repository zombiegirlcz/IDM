package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes16.dex */
public final class zzho extends zzmd implements zzni {

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private static final zzho f40205zzb;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private int f40206zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    private String f40207zze = "";

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    private long f40208zzf;

    static {
        zzho zzhoVar = new zzho();
        f40205zzb = zzhoVar;
        zzmd.zzct(zzho.class, zzhoVar);
    }

    private zzho() {
    }

    public static zzhn zza() {
        return (zzhn) f40205zzb.zzcg();
    }

    public static /* synthetic */ void zzc(zzho zzhoVar, long j2) {
        zzhoVar.f40206zzd |= 2;
        zzhoVar.f40208zzf = j2;
    }

    public static /* synthetic */ void zzd(zzho zzhoVar, String str) {
        str.getClass();
        zzhoVar.f40206zzd |= 1;
        zzhoVar.f40207zze = str;
    }

    @Override // com.google.android.gms.internal.measurement.zzmd
    public final Object zzl(int i, Object obj2, Object obj3) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzmd.zzcq(f40205zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new zzho();
        }
        zzip zzipVar = null;
        if (i2 == 4) {
            return new zzhn(zzipVar);
        }
        if (i2 == 5) {
            return f40205zzb;
        }
        throw null;
    }
}
