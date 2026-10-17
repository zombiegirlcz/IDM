package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public final class zzhv extends zzmd implements zzni {

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private static final zzhv f40223zzb;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private int f40224zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    private zzmj f40225zze = zzmd.zzcn();

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    private String f40226zzf = "";

    /* JADX INFO: renamed from: zzg, reason: collision with root package name */
    private String f40227zzg = "";

    /* JADX INFO: renamed from: zzh, reason: collision with root package name */
    private int f40228zzh;

    static {
        zzhv zzhvVar = new zzhv();
        f40223zzb = zzhvVar;
        zzmd.zzct(zzhv.class, zzhvVar);
    }

    private zzhv() {
    }

    public static zzht zzb() {
        return (zzht) f40223zzb.zzcg();
    }

    public static zzht zzc(zzhv zzhvVar) {
        zzlz zzlzVarZzcg = f40223zzb.zzcg();
        zzlzVarZzcg.zzaY(zzhvVar);
        return (zzht) zzlzVarZzcg;
    }

    public static /* synthetic */ void zzi(zzhv zzhvVar, Iterable iterable) {
        zzhvVar.zzr();
        zzko.zzcc(iterable, zzhvVar.f40225zze);
    }

    public static /* synthetic */ void zzj(zzhv zzhvVar, zzhx zzhxVar) {
        zzhxVar.getClass();
        zzhvVar.zzr();
        zzhvVar.f40225zze.add(zzhxVar);
    }

    public static /* synthetic */ void zzm(zzhv zzhvVar, int i, zzhx zzhxVar) {
        zzhxVar.getClass();
        zzhvVar.zzr();
        zzhvVar.f40225zze.set(i, zzhxVar);
    }

    public static /* synthetic */ void zzn(zzhv zzhvVar, String str) {
        str.getClass();
        zzhvVar.f40224zzd |= 1;
        zzhvVar.f40226zzf = str;
    }

    public static /* synthetic */ void zzo(zzhv zzhvVar, String str) {
        str.getClass();
        zzhvVar.f40224zzd |= 2;
        zzhvVar.f40227zzg = str;
    }

    private final void zzr() {
        zzmj zzmjVar = this.f40225zze;
        if (zzmjVar.zzc()) {
            return;
        }
        this.f40225zze = zzmd.zzco(zzmjVar);
    }

    public final int zza() {
        return this.f40225zze.size();
    }

    public final zzhx zze(int i) {
        return (zzhx) this.f40225zze.get(i);
    }

    public final String zzf() {
        return this.f40226zzf;
    }

    public final String zzg() {
        return this.f40227zzg;
    }

    public final List zzh() {
        return this.f40225zze;
    }

    @Override // com.google.android.gms.internal.measurement.zzmd
    public final Object zzl(int i, Object obj2, Object obj3) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzmd.zzcq(f40223zzb, "\u0004\u0004\u0000\u0001\u0001\t\u0004\u0000\u0001\u0000\u0001\u001b\u0007ဈ\u0000\bဈ\u0001\t᠌\u0002", new Object[]{"zzd", "zze", zzhx.class, "zzf", "zzg", "zzh", zzhu.f40222zza});
        }
        if (i2 == 3) {
            return new zzhv();
        }
        zzip zzipVar = null;
        if (i2 == 4) {
            return new zzht(zzipVar);
        }
        if (i2 == 5) {
            return f40223zzb;
        }
        throw null;
    }

    public final boolean zzp() {
        return (this.f40224zzd & 1) != 0;
    }

    public final boolean zzq() {
        return (this.f40224zzd & 2) != 0;
    }
}
