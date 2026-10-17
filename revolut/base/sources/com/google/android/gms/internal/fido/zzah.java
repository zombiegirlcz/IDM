package com.google.android.gms.internal.fido;

/* JADX INFO: loaded from: classes16.dex */
final class zzah {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private static final Object f39273zza = new Object();

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private static volatile boolean f39274zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private static volatile zzag f39275zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private static volatile boolean f39276zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    private static volatile zzag f39277zze;

    public static void zza() {
        f39276zzd = true;
    }

    public static void zzb() {
        if (f39277zze == null) {
            f39277zze = new zzag(null);
        }
    }

    public static void zzc() {
        if (f39275zzc == null) {
            f39275zzc = new zzag(null);
        }
    }

    public static boolean zzd() {
        synchronized (f39273zza) {
        }
        return false;
    }
}
