package com.google.android.gms.internal.measurement;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;

/* JADX INFO: loaded from: classes16.dex */
public final class zzqi implements Supplier {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private static final zzqi f40640zza = new zzqi();

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final Supplier f40641zzb = Suppliers.ofInstance(new zzqk());

    public static boolean zzb() {
        return f40640zza.get().zza();
    }

    @Override // com.google.common.base.Supplier
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzqj get() {
        return (zzqj) this.f40641zzb.get();
    }
}
