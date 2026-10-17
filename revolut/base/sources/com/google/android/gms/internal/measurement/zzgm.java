package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes16.dex */
public final class zzgm extends zzmd implements zzni {

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private static final zzgm f40121zzb;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private int f40122zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    private String f40123zze = "";

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    private boolean f40124zzf;

    /* JADX INFO: renamed from: zzg, reason: collision with root package name */
    private boolean f40125zzg;

    /* JADX INFO: renamed from: zzh, reason: collision with root package name */
    private int f40126zzh;

    static {
        zzgm zzgmVar = new zzgm();
        f40121zzb = zzgmVar;
        zzmd.zzct(zzgm.class, zzgmVar);
    }

    private zzgm() {
    }

    public static /* synthetic */ void zzd(zzgm zzgmVar, String str) {
        str.getClass();
        zzgmVar.f40122zzd |= 1;
        zzgmVar.f40123zze = str;
    }

    public final int zza() {
        return this.f40126zzh;
    }

    public final String zzc() {
        return this.f40123zze;
    }

    public final boolean zze() {
        return this.f40124zzf;
    }

    public final boolean zzf() {
        return this.f40125zzg;
    }

    public final boolean zzg() {
        return (this.f40122zzd & 2) != 0;
    }

    public final boolean zzh() {
        return (this.f40122zzd & 4) != 0;
    }

    public final boolean zzi() {
        return (this.f40122zzd & 8) != 0;
    }

    @Override // com.google.android.gms.internal.measurement.zzmd
    public final Object zzl(int i, Object obj2, Object obj3) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzmd.zzcq(f40121zzb, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004င\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new zzgm();
        }
        zzgz zzgzVar = null;
        if (i2 == 4) {
            return new zzgl(zzgzVar);
        }
        if (i2 == 5) {
            return f40121zzb;
        }
        throw null;
    }
}
