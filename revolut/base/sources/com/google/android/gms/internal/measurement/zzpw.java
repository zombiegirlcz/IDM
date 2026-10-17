package com.google.android.gms.internal.measurement;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;

/* JADX INFO: loaded from: classes16.dex */
public final class zzpw implements Supplier {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private static final zzpw f40628zza = new zzpw();

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final Supplier f40629zzb = Suppliers.ofInstance(new zzpy());

    public static boolean zzb() {
        return f40628zza.get().zza();
    }

    @Override // com.google.common.base.Supplier
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzpx get() {
        return (zzpx) this.f40629zzb.get();
    }
}
