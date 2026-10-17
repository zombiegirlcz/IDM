package com.google.android.gms.internal.measurement;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;

/* JADX INFO: loaded from: classes16.dex */
public final class zzph implements Supplier {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private static final zzph f40607zza = new zzph();

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final Supplier f40608zzb = Suppliers.ofInstance(new zzpj());

    public static boolean zzb() {
        return f40607zza.get().zza();
    }

    public static boolean zzc() {
        return f40607zza.get().zzb();
    }

    public static boolean zzd() {
        return f40607zza.get().zzc();
    }

    @Override // com.google.common.base.Supplier
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzpi get() {
        return (zzpi) this.f40608zzb.get();
    }
}
