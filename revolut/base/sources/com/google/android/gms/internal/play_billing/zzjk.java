package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes16.dex */
public enum zzjk implements zzfw {
    BROADCAST_ACTION_UNSPECIFIED(0),
    PURCHASES_UPDATED_ACTION(1),
    LOCAL_PURCHASES_UPDATED_ACTION(2),
    ALTERNATIVE_BILLING_ACTION(3);


    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    private final int f46206zzf;

    zzjk(int i) {
        this.f46206zzf = i;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f46206zzf);
    }

    @Override // com.google.android.gms.internal.play_billing.zzfw
    public final int zza() {
        return this.f46206zzf;
    }
}
