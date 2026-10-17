package com.google.android.gms.internal.measurement;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;

/* JADX INFO: loaded from: classes16.dex */
public final class zzpq implements Supplier {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private static final zzpq f40620zza = new zzpq();

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final Supplier f40621zzb = Suppliers.ofInstance(new zzps());

    public static boolean zzb() {
        f40620zza.get().zza();
        return true;
    }

    public static boolean zzc() {
        return f40620zza.get().zzb();
    }

    public static boolean zzd() {
        return f40620zza.get().zzc();
    }

    public static boolean zze() {
        return f40620zza.get().zzd();
    }

    @Override // com.google.common.base.Supplier
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzpr get() {
        return (zzpr) this.f40621zzb.get();
    }
}
