package com.google.android.gms.internal.measurement;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;

/* JADX INFO: loaded from: classes16.dex */
public final class zzpz implements Supplier {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private static final zzpz f40631zza = new zzpz();

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final Supplier f40632zzb = Suppliers.ofInstance(new zzqb());

    public static boolean zzb() {
        return f40631zza.get().zza();
    }

    @Override // com.google.common.base.Supplier
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzqa get() {
        return (zzqa) this.f40632zzb.get();
    }
}
