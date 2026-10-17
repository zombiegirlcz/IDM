package com.google.android.gms.internal.measurement;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;

/* JADX INFO: loaded from: classes16.dex */
public final class zzrd implements Supplier {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private static final zzrd f40673zza = new zzrd();

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final Supplier f40674zzb = Suppliers.ofInstance(new zzrf());

    public static boolean zzb() {
        f40673zza.get().zza();
        return true;
    }

    public static boolean zzc() {
        return f40673zza.get().zzb();
    }

    @Override // com.google.common.base.Supplier
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzre get() {
        return (zzre) this.f40674zzb.get();
    }
}
