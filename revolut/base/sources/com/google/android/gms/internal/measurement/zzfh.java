package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public final class zzfh extends zzmd implements zzni {

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private static final zzfh f40045zzb;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private int f40046zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    private int f40047zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    private zzmj f40048zzf = zzmd.zzcn();

    /* JADX INFO: renamed from: zzg, reason: collision with root package name */
    private zzmj f40049zzg = zzmd.zzcn();

    /* JADX INFO: renamed from: zzh, reason: collision with root package name */
    private boolean f40050zzh;

    /* JADX INFO: renamed from: zzi, reason: collision with root package name */
    private boolean f40051zzi;

    static {
        zzfh zzfhVar = new zzfh();
        f40045zzb = zzfhVar;
        zzmd.zzct(zzfh.class, zzfhVar);
    }

    private zzfh() {
    }

    public static /* synthetic */ void zzi(zzfh zzfhVar, int i, zzfj zzfjVar) {
        zzfjVar.getClass();
        zzmj zzmjVar = zzfhVar.f40049zzg;
        if (!zzmjVar.zzc()) {
            zzfhVar.f40049zzg = zzmd.zzco(zzmjVar);
        }
        zzfhVar.f40049zzg.set(i, zzfjVar);
    }

    public static /* synthetic */ void zzj(zzfh zzfhVar, int i, zzfr zzfrVar) {
        zzfrVar.getClass();
        zzmj zzmjVar = zzfhVar.f40048zzf;
        if (!zzmjVar.zzc()) {
            zzfhVar.f40048zzf = zzmd.zzco(zzmjVar);
        }
        zzfhVar.f40048zzf.set(i, zzfrVar);
    }

    public final int zza() {
        return this.f40047zze;
    }

    public final int zzb() {
        return this.f40049zzg.size();
    }

    public final int zzc() {
        return this.f40048zzf.size();
    }

    public final zzfj zze(int i) {
        return (zzfj) this.f40049zzg.get(i);
    }

    public final zzfr zzf(int i) {
        return (zzfr) this.f40048zzf.get(i);
    }

    public final List zzg() {
        return this.f40049zzg;
    }

    public final List zzh() {
        return this.f40048zzf;
    }

    public final boolean zzk() {
        return (this.f40046zzd & 1) != 0;
    }

    @Override // com.google.android.gms.internal.measurement.zzmd
    public final Object zzl(int i, Object obj2, Object obj3) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzmd.zzcq(f40045zzb, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဇ\u0001\u0005ဇ\u0002", new Object[]{"zzd", "zze", "zzf", zzfr.class, "zzg", zzfj.class, "zzh", "zzi"});
        }
        if (i2 == 3) {
            return new zzfh();
        }
        zzfw zzfwVar = null;
        if (i2 == 4) {
            return new zzfg(zzfwVar);
        }
        if (i2 == 5) {
            return f40045zzb;
        }
        throw null;
    }
}
