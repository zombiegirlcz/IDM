package com.google.android.gms.internal.measurement;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;

/* JADX INFO: loaded from: classes16.dex */
public final class zzoy implements Supplier {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private static final zzoy f40587zza = new zzoy();

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final Supplier f40588zzb = Suppliers.ofInstance(new zzpa());

    public static boolean zzb() {
        f40587zza.get().zza();
        return true;
    }

    public static boolean zzc() {
        return f40587zza.get().zzb();
    }

    @Override // com.google.common.base.Supplier
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzoz get() {
        return (zzoz) this.f40588zzb.get();
    }
}
