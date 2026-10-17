package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes16.dex */
public final class zzhc extends zzmd implements zzni {

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private static final zzhc f40160zzb;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private int f40161zzd;

    /* JADX INFO: renamed from: zzh, reason: collision with root package name */
    private long f40165zzh;

    /* JADX INFO: renamed from: zzl, reason: collision with root package name */
    private long f40169zzl;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    private String f40162zze = "";

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    private String f40163zzf = "";

    /* JADX INFO: renamed from: zzg, reason: collision with root package name */
    private String f40164zzg = "";

    /* JADX INFO: renamed from: zzi, reason: collision with root package name */
    private String f40166zzi = "";

    /* JADX INFO: renamed from: zzj, reason: collision with root package name */
    private String f40167zzj = "";

    /* JADX INFO: renamed from: zzk, reason: collision with root package name */
    private String f40168zzk = "";

    static {
        zzhc zzhcVar = new zzhc();
        f40160zzb = zzhcVar;
        zzmd.zzct(zzhc.class, zzhcVar);
    }

    private zzhc() {
    }

    public static zzhb zzc() {
        return (zzhb) f40160zzb.zzcg();
    }

    public static zzhc zze() {
        return f40160zzb;
    }

    public static /* synthetic */ void zzm(zzhc zzhcVar) {
        zzhcVar.f40161zzd &= -5;
        zzhcVar.f40164zzg = f40160zzb.f40164zzg;
    }

    public static /* synthetic */ void zzn(zzhc zzhcVar) {
        zzhcVar.f40161zzd &= -3;
        zzhcVar.f40163zzf = f40160zzb.f40163zzf;
    }

    public static /* synthetic */ void zzo(zzhc zzhcVar) {
        zzhcVar.f40161zzd &= -2;
        zzhcVar.f40162zze = f40160zzb.f40162zze;
    }

    public static /* synthetic */ void zzp(zzhc zzhcVar) {
        zzhcVar.f40161zzd &= -65;
        zzhcVar.f40168zzk = f40160zzb.f40168zzk;
    }

    public static /* synthetic */ void zzq(zzhc zzhcVar) {
        zzhcVar.f40161zzd &= -33;
        zzhcVar.f40167zzj = f40160zzb.f40167zzj;
    }

    public static /* synthetic */ void zzr(zzhc zzhcVar) {
        zzhcVar.f40161zzd &= -17;
        zzhcVar.f40166zzi = f40160zzb.f40166zzi;
    }

    public static /* synthetic */ void zzs(zzhc zzhcVar, String str) {
        zzhcVar.f40161zzd |= 4;
        zzhcVar.f40164zzg = str;
    }

    public static /* synthetic */ void zzt(zzhc zzhcVar, String str) {
        zzhcVar.f40161zzd |= 2;
        zzhcVar.f40163zzf = str;
    }

    public static /* synthetic */ void zzu(zzhc zzhcVar, String str) {
        zzhcVar.f40161zzd |= 1;
        zzhcVar.f40162zze = str;
    }

    public static /* synthetic */ void zzv(zzhc zzhcVar, long j2) {
        zzhcVar.f40161zzd |= 8;
        zzhcVar.f40165zzh = j2;
    }

    public static /* synthetic */ void zzw(zzhc zzhcVar, long j2) {
        zzhcVar.f40161zzd |= 128;
        zzhcVar.f40169zzl = j2;
    }

    public static /* synthetic */ void zzx(zzhc zzhcVar, String str) {
        zzhcVar.f40161zzd |= 64;
        zzhcVar.f40168zzk = str;
    }

    public static /* synthetic */ void zzy(zzhc zzhcVar, String str) {
        zzhcVar.f40161zzd |= 32;
        zzhcVar.f40167zzj = str;
    }

    public static /* synthetic */ void zzz(zzhc zzhcVar, String str) {
        zzhcVar.f40161zzd |= 16;
        zzhcVar.f40166zzi = str;
    }

    public final boolean zzA() {
        return (this.f40161zzd & 4) != 0;
    }

    public final boolean zzB() {
        return (this.f40161zzd & 2) != 0;
    }

    public final boolean zzC() {
        return (this.f40161zzd & 1) != 0;
    }

    public final boolean zzD() {
        return (this.f40161zzd & 8) != 0;
    }

    public final boolean zzE() {
        return (this.f40161zzd & 128) != 0;
    }

    public final boolean zzF() {
        return (this.f40161zzd & 64) != 0;
    }

    public final boolean zzG() {
        return (this.f40161zzd & 32) != 0;
    }

    public final boolean zzH() {
        return (this.f40161zzd & 16) != 0;
    }

    public final long zza() {
        return this.f40165zzh;
    }

    public final long zzb() {
        return this.f40169zzl;
    }

    public final String zzf() {
        return this.f40164zzg;
    }

    public final String zzg() {
        return this.f40163zzf;
    }

    public final String zzh() {
        return this.f40162zze;
    }

    public final String zzi() {
        return this.f40168zzk;
    }

    public final String zzj() {
        return this.f40167zzj;
    }

    public final String zzk() {
        return this.f40166zzi;
    }

    @Override // com.google.android.gms.internal.measurement.zzmd
    public final Object zzl(int i, Object obj2, Object obj3) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzmd.zzcq(f40160zzb, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006\bဂ\u0007", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl"});
        }
        if (i2 == 3) {
            return new zzhc();
        }
        zzip zzipVar = null;
        if (i2 == 4) {
            return new zzhb(zzipVar);
        }
        if (i2 == 5) {
            return f40160zzb;
        }
        throw null;
    }
}
