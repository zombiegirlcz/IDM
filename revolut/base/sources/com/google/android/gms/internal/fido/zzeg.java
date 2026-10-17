package com.google.android.gms.internal.fido;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes16.dex */
public abstract class zzeg {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private static String f39394zza = "com.google.android.gms.internal.fido.zzel";

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private static String f39396zzc = "com.google.common.flogger.backend.system.DefaultPlatform";

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private static String f39395zzb = "com.google.common.flogger.backend.google.GooglePlatform";

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private static final String[] f39397zzd = {"com.google.android.gms.internal.fido.zzel", "com.google.common.flogger.backend.google.GooglePlatform", "com.google.common.flogger.backend.system.DefaultPlatform"};

    public static int zza() {
        return zzfm.zza();
    }

    public static long zzb() {
        return zzee.f39393zza.zzc();
    }

    public static zzdp zzd(String str) {
        return zzee.f39393zza.zze(str);
    }

    public static zzdr zzf() {
        return zzi().zza();
    }

    public static zzef zzg() {
        return zzee.f39393zza.zzh();
    }

    public static zzev zzi() {
        return zzee.f39393zza.zzj();
    }

    public static zzfi zzk() {
        return zzi().zzc();
    }

    public static String zzl() {
        return zzee.f39393zza.zzm();
    }

    public static boolean zzn(String str, Level level, boolean z) {
        zzi().zzd(str, level, z);
        return false;
    }

    public long zzc() {
        return TimeUnit.MILLISECONDS.toNanos(System.currentTimeMillis());
    }

    public abstract zzdp zze(String str);

    public abstract zzef zzh();

    public zzev zzj() {
        return zzev.zze();
    }

    public abstract String zzm();
}
