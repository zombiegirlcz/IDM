package com.google.android.gms.internal.measurement;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;

/* JADX INFO: loaded from: classes16.dex */
public final class zzpn implements Supplier {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private static final zzpn f40616zza = new zzpn();

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final Supplier f40617zzb = Suppliers.ofInstance(new zzpp());

    public static boolean zzb() {
        f40616zza.get().zza();
        return true;
    }

    public static boolean zzc() {
        return f40616zza.get().zzb();
    }

    public static boolean zzd() {
        return f40616zza.get().zzc();
    }

    @Override // com.google.common.base.Supplier
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzpo get() {
        return (zzpo) this.f40617zzb.get();
    }
}
