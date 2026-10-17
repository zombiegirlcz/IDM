package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes16.dex */
public final class zzhi extends zzmd implements zzni {

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private static final zzhi f40188zzb;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private int f40189zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    private int f40190zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    private zzic f40191zzf;

    /* JADX INFO: renamed from: zzg, reason: collision with root package name */
    private zzic f40192zzg;

    /* JADX INFO: renamed from: zzh, reason: collision with root package name */
    private boolean f40193zzh;

    static {
        zzhi zzhiVar = new zzhi();
        f40188zzb = zzhiVar;
        zzmd.zzct(zzhi.class, zzhiVar);
    }

    private zzhi() {
    }

    public static zzhh zzb() {
        return (zzhh) f40188zzb.zzcg();
    }

    public static /* synthetic */ void zzf(zzhi zzhiVar, int i) {
        zzhiVar.f40189zzd |= 1;
        zzhiVar.f40190zze = i;
    }

    public static /* synthetic */ void zzg(zzhi zzhiVar, zzic zzicVar) {
        zzicVar.getClass();
        zzhiVar.f40191zzf = zzicVar;
        zzhiVar.f40189zzd |= 2;
    }

    public static /* synthetic */ void zzh(zzhi zzhiVar, boolean z) {
        zzhiVar.f40189zzd |= 8;
        zzhiVar.f40193zzh = z;
    }

    public static /* synthetic */ void zzi(zzhi zzhiVar, zzic zzicVar) {
        zzhiVar.f40192zzg = zzicVar;
        zzhiVar.f40189zzd |= 4;
    }

    public final int zza() {
        return this.f40190zze;
    }

    public final zzic zzd() {
        zzic zzicVar = this.f40191zzf;
        return zzicVar == null ? zzic.zzg() : zzicVar;
    }

    public final zzic zze() {
        zzic zzicVar = this.f40192zzg;
        return zzicVar == null ? zzic.zzg() : zzicVar;
    }

    public final boolean zzj() {
        return this.f40193zzh;
    }

    public final boolean zzk() {
        return (this.f40189zzd & 1) != 0;
    }

    @Override // com.google.android.gms.internal.measurement.zzmd
    public final Object zzl(int i, Object obj2, Object obj3) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzmd.zzcq(f40188zzb, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဇ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new zzhi();
        }
        zzip zzipVar = null;
        if (i2 == 4) {
            return new zzhh(zzipVar);
        }
        if (i2 == 5) {
            return f40188zzb;
        }
        throw null;
    }

    public final boolean zzm() {
        return (this.f40189zzd & 8) != 0;
    }

    public final boolean zzn() {
        return (this.f40189zzd & 4) != 0;
    }
}
