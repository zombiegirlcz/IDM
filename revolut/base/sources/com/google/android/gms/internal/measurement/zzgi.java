package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public final class zzgi extends zzmd implements zzni {

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private static final zzgi f40109zzb;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private int f40110zzd;

    /* JADX INFO: renamed from: zzh, reason: collision with root package name */
    private boolean f40114zzh;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    private zzmj f40111zze = zzmd.zzcn();

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    private zzmj f40112zzf = zzmd.zzcn();

    /* JADX INFO: renamed from: zzg, reason: collision with root package name */
    private zzmj f40113zzg = zzmd.zzcn();

    /* JADX INFO: renamed from: zzi, reason: collision with root package name */
    private zzmj f40115zzi = zzmd.zzcn();

    static {
        zzgi zzgiVar = new zzgi();
        f40109zzb = zzgiVar;
        zzmd.zzct(zzgi.class, zzgiVar);
    }

    private zzgi() {
    }

    public static zzgi zzb() {
        return f40109zzb;
    }

    public final List zzc() {
        return this.f40113zzg;
    }

    public final List zzd() {
        return this.f40111zze;
    }

    public final List zze() {
        return this.f40112zzf;
    }

    public final List zzf() {
        return this.f40115zzi;
    }

    public final boolean zzg() {
        return this.f40114zzh;
    }

    public final boolean zzh() {
        return (this.f40110zzd & 1) != 0;
    }

    @Override // com.google.android.gms.internal.measurement.zzmd
    public final Object zzl(int i, Object obj2, Object obj3) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzmd.zzcq(f40109zzb, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0004\u0000\u0001\u001b\u0002\u001b\u0003\u001b\u0004ဇ\u0000\u0005\u001b", new Object[]{"zzd", "zze", zzfz.class, "zzf", zzgb.class, "zzg", zzgh.class, "zzh", "zzi", zzfz.class});
        }
        if (i2 == 3) {
            return new zzgi();
        }
        zzgz zzgzVar = null;
        if (i2 == 4) {
            return new zzfx(zzgzVar);
        }
        if (i2 == 5) {
            return f40109zzb;
        }
        throw null;
    }
}
