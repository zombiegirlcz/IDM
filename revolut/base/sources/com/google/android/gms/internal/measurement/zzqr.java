package com.google.android.gms.internal.measurement;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;

/* JADX INFO: loaded from: classes16.dex */
public final class zzqr implements Supplier {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private static final zzqr f40654zza = new zzqr();

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final Supplier f40655zzb = Suppliers.ofInstance(new zzqt());

    public static boolean zzb() {
        f40654zza.get().zza();
        return true;
    }

    public static boolean zzc() {
        return f40654zza.get().zzb();
    }

    public static boolean zzd() {
        return f40654zza.get().zzc();
    }

    public static boolean zze() {
        return f40654zza.get().zzd();
    }

    public static boolean zzf() {
        return f40654zza.get().zze();
    }

    public static boolean zzg() {
        return f40654zza.get().zzf();
    }

    public static boolean zzh() {
        return f40654zza.get().zzg();
    }

    public static boolean zzi() {
        return f40654zza.get().zzh();
    }

    public static boolean zzj() {
        return f40654zza.get().zzi();
    }

    @Override // com.google.common.base.Supplier
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzqs get() {
        return (zzqs) this.f40655zzb.get();
    }
}
