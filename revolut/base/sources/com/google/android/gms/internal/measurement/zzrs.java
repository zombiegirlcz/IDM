package com.google.android.gms.internal.measurement;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;

/* JADX INFO: loaded from: classes16.dex */
public final class zzrs implements Supplier {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private static final zzrs f40695zza = new zzrs();

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final Supplier f40696zzb = Suppliers.ofInstance(new zzru());

    public static boolean zzb() {
        return f40695zza.get().zza();
    }

    @Override // com.google.common.base.Supplier
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzrt get() {
        return (zzrt) this.f40696zzb.get();
    }
}
