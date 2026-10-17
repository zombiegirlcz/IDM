package com.google.android.gms.internal.measurement;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;

/* JADX INFO: loaded from: classes16.dex */
public final class zzqu implements Supplier {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private static final zzqu f40664zza = new zzqu();

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final Supplier f40665zzb = Suppliers.ofInstance(new zzqw());

    public static boolean zzb() {
        return f40664zza.get().zza();
    }

    @Override // com.google.common.base.Supplier
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzqv get() {
        return (zzqv) this.f40665zzb.get();
    }
}
