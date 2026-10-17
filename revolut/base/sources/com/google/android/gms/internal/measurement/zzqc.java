package com.google.android.gms.internal.measurement;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;

/* JADX INFO: loaded from: classes16.dex */
public final class zzqc implements Supplier {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private static final zzqc f40634zza = new zzqc();

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final Supplier f40635zzb = Suppliers.ofInstance(new zzqe());

    public static boolean zzb() {
        return f40634zza.get().zza();
    }

    @Override // com.google.common.base.Supplier
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzqd get() {
        return (zzqd) this.f40635zzb.get();
    }
}
