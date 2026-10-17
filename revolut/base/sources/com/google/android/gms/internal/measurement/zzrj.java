package com.google.android.gms.internal.measurement;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;

/* JADX INFO: loaded from: classes16.dex */
public final class zzrj implements Supplier {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private static final zzrj f40679zza = new zzrj();

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final Supplier f40680zzb = Suppliers.ofInstance(new zzrl());

    public static boolean zzb() {
        return f40679zza.get().zza();
    }

    public static boolean zzc() {
        return f40679zza.get().zzb();
    }

    public static boolean zzd() {
        return f40679zza.get().zzc();
    }

    public static boolean zze() {
        return f40679zza.get().zzd();
    }

    public static boolean zzf() {
        return f40679zza.get().zze();
    }

    public static boolean zzg() {
        return f40679zza.get().zzf();
    }

    public static boolean zzh() {
        return f40679zza.get().zzg();
    }

    public static boolean zzi() {
        return f40679zza.get().zzh();
    }

    @Override // com.google.common.base.Supplier
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzrk get() {
        return (zzrk) this.f40680zzb.get();
    }
}
