package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public final class zzic extends zzmd implements zzni {

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private static final zzic f40244zzb;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private zzmi f40245zzd = zzmd.zzcl();

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    private zzmi f40246zze = zzmd.zzcl();

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    private zzmj f40247zzf = zzmd.zzcn();

    /* JADX INFO: renamed from: zzg, reason: collision with root package name */
    private zzmj f40248zzg = zzmd.zzcn();

    static {
        zzic zzicVar = new zzic();
        f40244zzb = zzicVar;
        zzmd.zzct(zzic.class, zzicVar);
    }

    private zzic() {
    }

    public static zzib zze() {
        return (zzib) f40244zzb.zzcg();
    }

    public static zzic zzg() {
        return f40244zzb;
    }

    public static /* synthetic */ void zzm(zzic zzicVar, Iterable iterable) {
        zzmj zzmjVar = zzicVar.f40247zzf;
        if (!zzmjVar.zzc()) {
            zzicVar.f40247zzf = zzmd.zzco(zzmjVar);
        }
        zzko.zzcc(iterable, zzicVar.f40247zzf);
    }

    public static /* synthetic */ void zzn(zzic zzicVar, Iterable iterable) {
        zzmi zzmiVar = zzicVar.f40246zze;
        if (!zzmiVar.zzc()) {
            zzicVar.f40246zze = zzmd.zzcm(zzmiVar);
        }
        zzko.zzcc(iterable, zzicVar.f40246zze);
    }

    public static /* synthetic */ void zzo(zzic zzicVar, Iterable iterable) {
        zzmj zzmjVar = zzicVar.f40248zzg;
        if (!zzmjVar.zzc()) {
            zzicVar.f40248zzg = zzmd.zzco(zzmjVar);
        }
        zzko.zzcc(iterable, zzicVar.f40248zzg);
    }

    public static /* synthetic */ void zzp(zzic zzicVar, Iterable iterable) {
        zzmi zzmiVar = zzicVar.f40245zzd;
        if (!zzmiVar.zzc()) {
            zzicVar.f40245zzd = zzmd.zzcm(zzmiVar);
        }
        zzko.zzcc(iterable, zzicVar.f40245zzd);
    }

    public final int zza() {
        return this.f40247zzf.size();
    }

    public final int zzb() {
        return this.f40246zze.size();
    }

    public final int zzc() {
        return this.f40248zzg.size();
    }

    public final int zzd() {
        return this.f40245zzd.size();
    }

    public final List zzh() {
        return this.f40247zzf;
    }

    public final List zzi() {
        return this.f40246zze;
    }

    public final List zzj() {
        return this.f40248zzg;
    }

    public final List zzk() {
        return this.f40245zzd;
    }

    @Override // com.google.android.gms.internal.measurement.zzmd
    public final Object zzl(int i, Object obj2, Object obj3) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzmd.zzcq(f40244zzb, "\u0004\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0004\u0000\u0001\u0015\u0002\u0015\u0003\u001b\u0004\u001b", new Object[]{"zzd", "zze", "zzf", zzhk.class, "zzg", zzie.class});
        }
        if (i2 == 3) {
            return new zzic();
        }
        zzip zzipVar = null;
        if (i2 == 4) {
            return new zzib(zzipVar);
        }
        if (i2 == 5) {
            return f40244zzb;
        }
        throw null;
    }
}
