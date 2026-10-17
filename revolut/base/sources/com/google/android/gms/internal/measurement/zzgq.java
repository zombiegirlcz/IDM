package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes16.dex */
public final class zzgq extends zzmd implements zzni {

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private static final zzgq f40137zzb;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private zzmj f40138zzd = zzmd.zzcn();

    static {
        zzgq zzgqVar = new zzgq();
        f40137zzb = zzgqVar;
        zzmd.zzct(zzgq.class, zzgqVar);
    }

    private zzgq() {
    }

    @Override // com.google.android.gms.internal.measurement.zzmd
    public final Object zzl(int i, Object obj2, Object obj3) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzmd.zzcq(f40137zzb, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"zzd"});
        }
        if (i2 == 3) {
            return new zzgq();
        }
        zzgz zzgzVar = null;
        if (i2 == 4) {
            return new zzgp(zzgzVar);
        }
        if (i2 == 5) {
            return f40137zzb;
        }
        throw null;
    }
}
