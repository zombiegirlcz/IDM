package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public final class zziv extends zzmd implements zzni {

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private static final zziv f40287zzb;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private int f40288zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    private zzmj f40289zze = zzmd.zzcn();

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    private zzir f40290zzf;

    static {
        zziv zzivVar = new zziv();
        f40287zzb = zzivVar;
        zzmd.zzct(zziv.class, zzivVar);
    }

    private zziv() {
    }

    public final zzir zza() {
        zzir zzirVar = this.f40290zzf;
        return zzirVar == null ? zzir.zzc() : zzirVar;
    }

    public final List zzc() {
        return this.f40289zze;
    }

    @Override // com.google.android.gms.internal.measurement.zzmd
    public final Object zzl(int i, Object obj2, Object obj3) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzmd.zzcq(f40287zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"zzd", "zze", zziz.class, "zzf"});
        }
        if (i2 == 3) {
            return new zziv();
        }
        zzja zzjaVar = null;
        if (i2 == 4) {
            return new zziu(zzjaVar);
        }
        if (i2 == 5) {
            return f40287zzb;
        }
        throw null;
    }
}
