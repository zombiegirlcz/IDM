package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public final class zzir extends zzmd implements zzni {

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private static final zzir f40281zzb;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private zzmj f40282zzd = zzmd.zzcn();

    static {
        zzir zzirVar = new zzir();
        f40281zzb = zzirVar;
        zzmd.zzct(zzir.class, zzirVar);
    }

    private zzir() {
    }

    public static zzir zzc() {
        return f40281zzb;
    }

    public final int zza() {
        return this.f40282zzd.size();
    }

    public final List zzd() {
        return this.f40282zzd;
    }

    @Override // com.google.android.gms.internal.measurement.zzmd
    public final Object zzl(int i, Object obj2, Object obj3) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzmd.zzcq(f40281zzb, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", zzit.class});
        }
        if (i2 == 3) {
            return new zzir();
        }
        zzja zzjaVar = null;
        if (i2 == 4) {
            return new zziq(zzjaVar);
        }
        if (i2 == 5) {
            return f40281zzb;
        }
        throw null;
    }
}
