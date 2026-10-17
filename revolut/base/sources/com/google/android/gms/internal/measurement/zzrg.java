package com.google.android.gms.internal.measurement;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;

/* JADX INFO: loaded from: classes16.dex */
public final class zzrg implements Supplier {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private static final zzrg f40676zza = new zzrg();

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final Supplier f40677zzb = Suppliers.ofInstance(new zzri());

    public static boolean zzb() {
        return f40676zza.get().zza();
    }

    @Override // com.google.common.base.Supplier
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzrh get() {
        return (zzrh) this.f40677zzb.get();
    }
}
