package com.google.android.gms.internal.measurement;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;

/* JADX INFO: loaded from: classes16.dex */
public final class zzrm implements Supplier {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private static final zzrm f40689zza = new zzrm();

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final Supplier f40690zzb = Suppliers.ofInstance(new zzro());

    public static boolean zzb() {
        return f40689zza.get().zza();
    }

    @Override // com.google.common.base.Supplier
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzrn get() {
        return (zzrn) this.f40690zzb.get();
    }
}
