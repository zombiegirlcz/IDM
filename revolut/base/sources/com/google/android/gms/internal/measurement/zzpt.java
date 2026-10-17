package com.google.android.gms.internal.measurement;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;

/* JADX INFO: loaded from: classes16.dex */
public final class zzpt implements Supplier {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private static final zzpt f40625zza = new zzpt();

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final Supplier f40626zzb = Suppliers.ofInstance(new zzpv());

    public static boolean zzb() {
        return f40625zza.get().zza();
    }

    @Override // com.google.common.base.Supplier
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzpu get() {
        return (zzpu) this.f40626zzb.get();
    }
}
