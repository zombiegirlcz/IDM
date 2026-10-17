package com.google.android.gms.internal.measurement;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;

/* JADX INFO: loaded from: classes16.dex */
public final class zzqf implements Supplier {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private static final zzqf f40637zza = new zzqf();

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final Supplier f40638zzb = Suppliers.ofInstance(new zzqh());

    public static boolean zzb() {
        return f40637zza.get().zza();
    }

    @Override // com.google.common.base.Supplier
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzqg get() {
        return (zzqg) this.f40638zzb.get();
    }
}
