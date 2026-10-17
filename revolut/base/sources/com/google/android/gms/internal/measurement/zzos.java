package com.google.android.gms.internal.measurement;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;

/* JADX INFO: loaded from: classes16.dex */
public final class zzos implements Supplier {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private static final zzos f40580zza = new zzos();

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final Supplier f40581zzb = Suppliers.ofInstance(new zzou());

    public static boolean zzb() {
        return f40580zza.get().zza();
    }

    @Override // com.google.common.base.Supplier
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzot get() {
        return (zzot) this.f40581zzb.get();
    }
}
