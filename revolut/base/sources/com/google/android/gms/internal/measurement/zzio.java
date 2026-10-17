package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes16.dex */
public final class zzio extends zzmd implements zzni {

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private static final zzio f40273zzb;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private int f40274zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    private long f40275zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    private String f40276zzf = "";

    /* JADX INFO: renamed from: zzg, reason: collision with root package name */
    private String f40277zzg = "";

    /* JADX INFO: renamed from: zzh, reason: collision with root package name */
    private long f40278zzh;

    /* JADX INFO: renamed from: zzi, reason: collision with root package name */
    private float f40279zzi;

    /* JADX INFO: renamed from: zzj, reason: collision with root package name */
    private double f40280zzj;

    static {
        zzio zzioVar = new zzio();
        f40273zzb = zzioVar;
        zzmd.zzct(zzio.class, zzioVar);
    }

    private zzio() {
    }

    public static zzin zze() {
        return (zzin) f40273zzb.zzcg();
    }

    public static /* synthetic */ void zzi(zzio zzioVar) {
        zzioVar.f40274zzd &= -33;
        zzioVar.f40280zzj = 0.0d;
    }

    public static /* synthetic */ void zzj(zzio zzioVar) {
        zzioVar.f40274zzd &= -9;
        zzioVar.f40278zzh = 0L;
    }

    public static /* synthetic */ void zzk(zzio zzioVar) {
        zzioVar.f40274zzd &= -5;
        zzioVar.f40277zzg = f40273zzb.f40277zzg;
    }

    public static /* synthetic */ void zzm(zzio zzioVar, double d) {
        zzioVar.f40274zzd |= 32;
        zzioVar.f40280zzj = d;
    }

    public static /* synthetic */ void zzn(zzio zzioVar, long j2) {
        zzioVar.f40274zzd |= 8;
        zzioVar.f40278zzh = j2;
    }

    public static /* synthetic */ void zzo(zzio zzioVar, String str) {
        str.getClass();
        zzioVar.f40274zzd |= 2;
        zzioVar.f40276zzf = str;
    }

    public static /* synthetic */ void zzp(zzio zzioVar, long j2) {
        zzioVar.f40274zzd |= 1;
        zzioVar.f40275zze = j2;
    }

    public static /* synthetic */ void zzq(zzio zzioVar, String str) {
        str.getClass();
        zzioVar.f40274zzd |= 4;
        zzioVar.f40277zzg = str;
    }

    public final double zza() {
        return this.f40280zzj;
    }

    public final float zzb() {
        return this.f40279zzi;
    }

    public final long zzc() {
        return this.f40278zzh;
    }

    public final long zzd() {
        return this.f40275zze;
    }

    public final String zzg() {
        return this.f40276zzf;
    }

    public final String zzh() {
        return this.f40277zzg;
    }

    @Override // com.google.android.gms.internal.measurement.zzmd
    public final Object zzl(int i, Object obj2, Object obj3) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzmd.zzcq(f40273zzb, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005ခ\u0004\u0006က\u0005", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        if (i2 == 3) {
            return new zzio();
        }
        zzip zzipVar = null;
        if (i2 == 4) {
            return new zzin(zzipVar);
        }
        if (i2 == 5) {
            return f40273zzb;
        }
        throw null;
    }

    public final boolean zzr() {
        return (this.f40274zzd & 32) != 0;
    }

    public final boolean zzs() {
        return (this.f40274zzd & 16) != 0;
    }

    public final boolean zzt() {
        return (this.f40274zzd & 8) != 0;
    }

    public final boolean zzu() {
        return (this.f40274zzd & 1) != 0;
    }

    public final boolean zzv() {
        return (this.f40274zzd & 4) != 0;
    }
}
