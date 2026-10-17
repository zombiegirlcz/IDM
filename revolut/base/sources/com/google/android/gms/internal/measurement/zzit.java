package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public final class zzit extends zzmd implements zzni {

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private static final zzit f40283zzb;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private int f40284zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    private String f40285zze = "";

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    private zzmj f40286zzf = zzmd.zzcn();

    static {
        zzit zzitVar = new zzit();
        f40283zzb = zzitVar;
        zzmd.zzct(zzit.class, zzitVar);
    }

    private zzit() {
    }

    public final String zzb() {
        return this.f40285zze;
    }

    public final List zzc() {
        return this.f40286zzf;
    }

    @Override // com.google.android.gms.internal.measurement.zzmd
    public final Object zzl(int i, Object obj2, Object obj3) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzmd.zzcq(f40283zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b", new Object[]{"zzd", "zze", "zzf", zziz.class});
        }
        if (i2 == 3) {
            return new zzit();
        }
        zzja zzjaVar = null;
        if (i2 == 4) {
            return new zzis(zzjaVar);
        }
        if (i2 == 5) {
            return f40283zzb;
        }
        throw null;
    }
}
