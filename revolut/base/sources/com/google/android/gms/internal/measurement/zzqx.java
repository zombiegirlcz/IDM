package com.google.android.gms.internal.measurement;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;

/* JADX INFO: loaded from: classes16.dex */
public final class zzqx implements Supplier {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private static final zzqx f40667zza = new zzqx();

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final Supplier f40668zzb = Suppliers.ofInstance(new zzqz());

    public static boolean zzb() {
        return f40667zza.get().zza();
    }

    @Override // com.google.common.base.Supplier
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzqy get() {
        return (zzqy) this.f40668zzb.get();
    }
}
