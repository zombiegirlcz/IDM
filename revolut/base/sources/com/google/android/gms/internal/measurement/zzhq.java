package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public final class zzhq extends zzmd implements zzni {

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private static final zzhq f40209zzb;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private int f40210zzd;

    /* JADX INFO: renamed from: zzg, reason: collision with root package name */
    private long f40213zzg;

    /* JADX INFO: renamed from: zzh, reason: collision with root package name */
    private float f40214zzh;

    /* JADX INFO: renamed from: zzi, reason: collision with root package name */
    private double f40215zzi;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    private String f40211zze = "";

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    private String f40212zzf = "";

    /* JADX INFO: renamed from: zzj, reason: collision with root package name */
    private zzmj f40216zzj = zzmd.zzcn();

    static {
        zzhq zzhqVar = new zzhq();
        f40209zzb = zzhqVar;
        zzmd.zzct(zzhq.class, zzhqVar);
    }

    private zzhq() {
    }

    public static zzhp zze() {
        return (zzhp) f40209zzb.zzcg();
    }

    public static /* synthetic */ void zzj(zzhq zzhqVar, Iterable iterable) {
        zzhqVar.zzz();
        zzko.zzcc(iterable, zzhqVar.f40216zzj);
    }

    public static /* synthetic */ void zzk(zzhq zzhqVar, zzhq zzhqVar2) {
        zzhqVar2.getClass();
        zzhqVar.zzz();
        zzhqVar.f40216zzj.add(zzhqVar2);
    }

    public static /* synthetic */ void zzm(zzhq zzhqVar) {
        zzhqVar.f40210zzd &= -17;
        zzhqVar.f40215zzi = 0.0d;
    }

    public static /* synthetic */ void zzn(zzhq zzhqVar) {
        zzhqVar.f40210zzd &= -5;
        zzhqVar.f40213zzg = 0L;
    }

    public static /* synthetic */ void zzp(zzhq zzhqVar) {
        zzhqVar.f40210zzd &= -3;
        zzhqVar.f40212zzf = f40209zzb.f40212zzf;
    }

    public static /* synthetic */ void zzq(zzhq zzhqVar, double d) {
        zzhqVar.f40210zzd |= 16;
        zzhqVar.f40215zzi = d;
    }

    public static /* synthetic */ void zzr(zzhq zzhqVar, long j2) {
        zzhqVar.f40210zzd |= 4;
        zzhqVar.f40213zzg = j2;
    }

    public static /* synthetic */ void zzs(zzhq zzhqVar, String str) {
        str.getClass();
        zzhqVar.f40210zzd |= 1;
        zzhqVar.f40211zze = str;
    }

    public static /* synthetic */ void zzt(zzhq zzhqVar, String str) {
        str.getClass();
        zzhqVar.f40210zzd |= 2;
        zzhqVar.f40212zzf = str;
    }

    private final void zzz() {
        zzmj zzmjVar = this.f40216zzj;
        if (zzmjVar.zzc()) {
            return;
        }
        this.f40216zzj = zzmd.zzco(zzmjVar);
    }

    public final double zza() {
        return this.f40215zzi;
    }

    public final float zzb() {
        return this.f40214zzh;
    }

    public final int zzc() {
        return this.f40216zzj.size();
    }

    public final long zzd() {
        return this.f40213zzg;
    }

    public final String zzg() {
        return this.f40211zze;
    }

    public final String zzh() {
        return this.f40212zzf;
    }

    public final List zzi() {
        return this.f40216zzj;
    }

    @Override // com.google.android.gms.internal.measurement.zzmd
    public final Object zzl(int i, Object obj2, Object obj3) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzmd.zzcq(f40209zzb, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ခ\u0003\u0005က\u0004\u0006\u001b", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", zzhq.class});
        }
        if (i2 == 3) {
            return new zzhq();
        }
        zzip zzipVar = null;
        if (i2 == 4) {
            return new zzhp(zzipVar);
        }
        if (i2 == 5) {
            return f40209zzb;
        }
        throw null;
    }

    public final boolean zzu() {
        return (this.f40210zzd & 16) != 0;
    }

    public final boolean zzv() {
        return (this.f40210zzd & 8) != 0;
    }

    public final boolean zzw() {
        return (this.f40210zzd & 4) != 0;
    }

    public final boolean zzx() {
        return (this.f40210zzd & 1) != 0;
    }

    public final boolean zzy() {
        return (this.f40210zzd & 2) != 0;
    }
}
