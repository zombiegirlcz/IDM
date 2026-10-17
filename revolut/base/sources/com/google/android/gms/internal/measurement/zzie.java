package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public final class zzie extends zzmd implements zzni {

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private static final zzie f40249zzb;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private int f40250zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    private int f40251zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    private zzmi f40252zzf = zzmd.zzcl();

    static {
        zzie zzieVar = new zzie();
        f40249zzb = zzieVar;
        zzmd.zzct(zzie.class, zzieVar);
    }

    private zzie() {
    }

    public static zzid zzd() {
        return (zzid) f40249zzb.zzcg();
    }

    public static /* synthetic */ void zzg(zzie zzieVar, Iterable iterable) {
        zzmi zzmiVar = zzieVar.f40252zzf;
        if (!zzmiVar.zzc()) {
            zzieVar.f40252zzf = zzmd.zzcm(zzmiVar);
        }
        zzko.zzcc(iterable, zzieVar.f40252zzf);
    }

    public static /* synthetic */ void zzh(zzie zzieVar, int i) {
        zzieVar.f40250zzd |= 1;
        zzieVar.f40251zze = i;
    }

    public final int zza() {
        return this.f40252zzf.size();
    }

    public final int zzb() {
        return this.f40251zze;
    }

    public final long zzc(int i) {
        return this.f40252zzf.zza(i);
    }

    public final List zzf() {
        return this.f40252zzf;
    }

    public final boolean zzi() {
        return (this.f40250zzd & 1) != 0;
    }

    @Override // com.google.android.gms.internal.measurement.zzmd
    public final Object zzl(int i, Object obj2, Object obj3) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzmd.zzcq(f40249zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001င\u0000\u0002\u0014", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new zzie();
        }
        zzip zzipVar = null;
        if (i2 == 4) {
            return new zzid(zzipVar);
        }
        if (i2 == 5) {
            return f40249zzb;
        }
        throw null;
    }
}
