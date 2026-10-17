package com.google.android.gms.internal.measurement;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;

/* JADX INFO: loaded from: classes16.dex */
public final class zzpk implements Supplier {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private static final zzpk f40612zza = new zzpk();

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final Supplier f40613zzb = Suppliers.ofInstance(new zzpm());

    public static boolean zzb() {
        return f40612zza.get().zza();
    }

    public static boolean zzc() {
        return f40612zza.get().zzb();
    }

    @Override // com.google.common.base.Supplier
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzpl get() {
        return (zzpl) this.f40613zzb.get();
    }
}
