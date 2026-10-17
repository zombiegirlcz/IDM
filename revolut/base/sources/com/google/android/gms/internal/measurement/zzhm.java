package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public final class zzhm extends zzmd implements zzni {

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private static final zzhm f40198zzb;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private int f40199zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    private zzmj f40200zze = zzmd.zzcn();

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    private String f40201zzf = "";

    /* JADX INFO: renamed from: zzg, reason: collision with root package name */
    private long f40202zzg;

    /* JADX INFO: renamed from: zzh, reason: collision with root package name */
    private long f40203zzh;

    /* JADX INFO: renamed from: zzi, reason: collision with root package name */
    private int f40204zzi;

    static {
        zzhm zzhmVar = new zzhm();
        f40198zzb = zzhmVar;
        zzmd.zzct(zzhm.class, zzhmVar);
    }

    private zzhm() {
    }

    public static zzhl zze() {
        return (zzhl) f40198zzb.zzcg();
    }

    public static /* synthetic */ void zzj(zzhm zzhmVar, Iterable iterable) {
        zzhmVar.zzv();
        zzko.zzcc(iterable, zzhmVar.f40200zze);
    }

    public static /* synthetic */ void zzk(zzhm zzhmVar, zzhq zzhqVar) {
        zzhqVar.getClass();
        zzhmVar.zzv();
        zzhmVar.f40200zze.add(zzhqVar);
    }

    public static /* synthetic */ void zzn(zzhm zzhmVar, int i) {
        zzhmVar.zzv();
        zzhmVar.f40200zze.remove(i);
    }

    public static /* synthetic */ void zzo(zzhm zzhmVar, String str) {
        str.getClass();
        zzhmVar.f40199zzd |= 1;
        zzhmVar.f40201zzf = str;
    }

    public static /* synthetic */ void zzp(zzhm zzhmVar, int i, zzhq zzhqVar) {
        zzhqVar.getClass();
        zzhmVar.zzv();
        zzhmVar.f40200zze.set(i, zzhqVar);
    }

    public static /* synthetic */ void zzq(zzhm zzhmVar, long j2) {
        zzhmVar.f40199zzd |= 4;
        zzhmVar.f40203zzh = j2;
    }

    public static /* synthetic */ void zzr(zzhm zzhmVar, long j2) {
        zzhmVar.f40199zzd |= 2;
        zzhmVar.f40202zzg = j2;
    }

    private final void zzv() {
        zzmj zzmjVar = this.f40200zze;
        if (zzmjVar.zzc()) {
            return;
        }
        this.f40200zze = zzmd.zzco(zzmjVar);
    }

    public final int zza() {
        return this.f40204zzi;
    }

    public final int zzb() {
        return this.f40200zze.size();
    }

    public final long zzc() {
        return this.f40203zzh;
    }

    public final long zzd() {
        return this.f40202zzg;
    }

    public final zzhq zzg(int i) {
        return (zzhq) this.f40200zze.get(i);
    }

    public final String zzh() {
        return this.f40201zzf;
    }

    public final List zzi() {
        return this.f40200zze;
    }

    @Override // com.google.android.gms.internal.measurement.zzmd
    public final Object zzl(int i, Object obj2, Object obj3) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzmd.zzcq(f40198zzb, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0003ဂ\u0001\u0004ဂ\u0002\u0005င\u0003", new Object[]{"zzd", "zze", zzhq.class, "zzf", "zzg", "zzh", "zzi"});
        }
        if (i2 == 3) {
            return new zzhm();
        }
        zzip zzipVar = null;
        if (i2 == 4) {
            return new zzhl(zzipVar);
        }
        if (i2 == 5) {
            return f40198zzb;
        }
        throw null;
    }

    public final boolean zzs() {
        return (this.f40199zzd & 8) != 0;
    }

    public final boolean zzt() {
        return (this.f40199zzd & 4) != 0;
    }

    public final boolean zzu() {
        return (this.f40199zzd & 2) != 0;
    }
}
