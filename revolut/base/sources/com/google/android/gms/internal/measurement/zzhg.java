package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes16.dex */
public final class zzhg extends zzmd implements zzni {

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private static final zzhg f40179zzb;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private int f40180zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    private boolean f40181zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    private boolean f40182zzf;

    /* JADX INFO: renamed from: zzg, reason: collision with root package name */
    private boolean f40183zzg;

    /* JADX INFO: renamed from: zzh, reason: collision with root package name */
    private boolean f40184zzh;

    /* JADX INFO: renamed from: zzi, reason: collision with root package name */
    private boolean f40185zzi;

    /* JADX INFO: renamed from: zzj, reason: collision with root package name */
    private boolean f40186zzj;

    /* JADX INFO: renamed from: zzk, reason: collision with root package name */
    private boolean f40187zzk;

    static {
        zzhg zzhgVar = new zzhg();
        f40179zzb = zzhgVar;
        zzmd.zzct(zzhg.class, zzhgVar);
    }

    private zzhg() {
    }

    public static zzhf zza() {
        return (zzhf) f40179zzb.zzcg();
    }

    public static zzhg zzc() {
        return f40179zzb;
    }

    public static /* synthetic */ void zzd(zzhg zzhgVar, boolean z) {
        zzhgVar.f40180zzd |= 32;
        zzhgVar.f40186zzj = z;
    }

    public static /* synthetic */ void zze(zzhg zzhgVar, boolean z) {
        zzhgVar.f40180zzd |= 16;
        zzhgVar.f40185zzi = z;
    }

    public static /* synthetic */ void zzf(zzhg zzhgVar, boolean z) {
        zzhgVar.f40180zzd |= 1;
        zzhgVar.f40181zze = z;
    }

    public static /* synthetic */ void zzg(zzhg zzhgVar, boolean z) {
        zzhgVar.f40180zzd |= 64;
        zzhgVar.f40187zzk = z;
    }

    public static /* synthetic */ void zzh(zzhg zzhgVar, boolean z) {
        zzhgVar.f40180zzd |= 2;
        zzhgVar.f40182zzf = z;
    }

    public static /* synthetic */ void zzi(zzhg zzhgVar, boolean z) {
        zzhgVar.f40180zzd |= 4;
        zzhgVar.f40183zzg = z;
    }

    public static /* synthetic */ void zzj(zzhg zzhgVar, boolean z) {
        zzhgVar.f40180zzd |= 8;
        zzhgVar.f40184zzh = z;
    }

    public final boolean zzk() {
        return this.f40186zzj;
    }

    @Override // com.google.android.gms.internal.measurement.zzmd
    public final Object zzl(int i, Object obj2, Object obj3) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzmd.zzcq(f40179zzb, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005\u0007ဇ\u0006", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        }
        if (i2 == 3) {
            return new zzhg();
        }
        zzip zzipVar = null;
        if (i2 == 4) {
            return new zzhf(zzipVar);
        }
        if (i2 == 5) {
            return f40179zzb;
        }
        throw null;
    }

    public final boolean zzm() {
        return this.f40185zzi;
    }

    public final boolean zzn() {
        return this.f40181zze;
    }

    public final boolean zzo() {
        return this.f40187zzk;
    }

    public final boolean zzp() {
        return this.f40182zzf;
    }

    public final boolean zzq() {
        return this.f40183zzg;
    }

    public final boolean zzr() {
        return this.f40184zzh;
    }
}
