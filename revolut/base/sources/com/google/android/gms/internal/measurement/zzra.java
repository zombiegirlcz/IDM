package com.google.android.gms.internal.measurement;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;

/* JADX INFO: loaded from: classes16.dex */
public final class zzra implements Supplier {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private static final zzra f40670zza = new zzra();

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final Supplier f40671zzb = Suppliers.ofInstance(new zzrc());

    public static boolean zzb() {
        f40670zza.get().zza();
        return true;
    }

    public static boolean zzc() {
        return f40670zza.get().zzb();
    }

    @Override // com.google.common.base.Supplier
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzrb get() {
        return (zzrb) this.f40671zzb.get();
    }
}
