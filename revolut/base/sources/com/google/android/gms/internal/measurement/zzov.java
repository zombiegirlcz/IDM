package com.google.android.gms.internal.measurement;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;

/* JADX INFO: loaded from: classes16.dex */
public final class zzov implements Supplier {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private static final zzov f40583zza = new zzov();

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final Supplier f40584zzb = Suppliers.ofInstance(new zzox());

    public static boolean zzb() {
        return f40583zza.get().zza();
    }

    public static boolean zzc() {
        return f40583zza.get().zzb();
    }

    @Override // com.google.common.base.Supplier
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzow get() {
        return (zzow) this.f40584zzb.get();
    }
}
