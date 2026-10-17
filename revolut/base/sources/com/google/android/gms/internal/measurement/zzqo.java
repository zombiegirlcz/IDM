package com.google.android.gms.internal.measurement;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;

/* JADX INFO: loaded from: classes16.dex */
public final class zzqo implements Supplier {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private static final zzqo f40646zza = new zzqo();

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final Supplier f40647zzb = Suppliers.ofInstance(new zzqq());

    public static double zza() {
        return f40646zza.get().zza();
    }

    public static long zzb() {
        return f40646zza.get().zzb();
    }

    public static long zzc() {
        return f40646zza.get().zzc();
    }

    public static long zzd() {
        return f40646zza.get().zzd();
    }

    public static String zzf() {
        return f40646zza.get().zze();
    }

    public static boolean zzg() {
        return f40646zza.get().zzf();
    }

    @Override // com.google.common.base.Supplier
    /* JADX INFO: renamed from: zze, reason: merged with bridge method [inline-methods] */
    public final zzqp get() {
        return (zzqp) this.f40647zzb.get();
    }
}
