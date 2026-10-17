package com.google.android.gms.internal.measurement;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;

/* JADX INFO: loaded from: classes16.dex */
public final class zzrp implements Supplier {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private static final zzrp f40692zza = new zzrp();

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final Supplier f40693zzb = Suppliers.ofInstance(new zzrr());

    public static boolean zzb() {
        f40692zza.get().zza();
        return true;
    }

    public static boolean zzc() {
        return f40692zza.get().zzb();
    }

    @Override // com.google.common.base.Supplier
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzrq get() {
        return (zzrq) this.f40693zzb.get();
    }
}
