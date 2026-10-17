package com.google.android.gms.internal.measurement;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;

/* JADX INFO: loaded from: classes16.dex */
public final class zzql implements Supplier {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private static final zzql f40643zza = new zzql();

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final Supplier f40644zzb = Suppliers.ofInstance(new zzqn());

    public static boolean zzb() {
        return f40643zza.get().zza();
    }

    @Override // com.google.common.base.Supplier
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzqm get() {
        return (zzqm) this.f40644zzb.get();
    }
}
