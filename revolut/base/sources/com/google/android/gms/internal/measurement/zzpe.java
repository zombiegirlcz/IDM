package com.google.android.gms.internal.measurement;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;

/* JADX INFO: loaded from: classes16.dex */
public final class zzpe implements Supplier {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private static final zzpe f40604zza = new zzpe();

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final Supplier f40605zzb = Suppliers.ofInstance(new zzpg());

    public static long zza() {
        return f40604zza.get().zza();
    }

    @Override // com.google.common.base.Supplier
    /* JADX INFO: renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final zzpf get() {
        return (zzpf) this.f40605zzb.get();
    }
}
