package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes16.dex */
public final class zzji extends zzfu implements zzhc {

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private static final zzji f46199zzb;

    static {
        zzji zzjiVar = new zzji();
        f46199zzb = zzjiVar;
        zzfu.zzB(zzji.class, zzjiVar);
    }

    private zzji() {
    }

    public static zzji zzb() {
        return f46199zzb;
    }

    @Override // com.google.android.gms.internal.play_billing.zzfu
    public final Object zzd(int i, Object obj2, Object obj3) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        zzjh zzjhVar = null;
        if (i2 == 2) {
            return zzfu.zzy(f46199zzb, "\u0004\u0000", null);
        }
        if (i2 == 3) {
            return new zzji();
        }
        if (i2 == 4) {
            return new zzjg(zzjhVar);
        }
        if (i2 == 5) {
            return f46199zzb;
        }
        throw null;
    }
}
