package com.google.android.gms.common.util;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import androidx.annotation.NonNull;
import com.google.android.apps.common.proguard.SideEffectFree;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects;

/* JADX INFO: loaded from: classes.dex */
@KeepForSdk
public final class DeviceProperties {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private static Boolean f38289zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private static Boolean f38290zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private static Boolean f38291zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private static Boolean f38292zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    private static Boolean f38293zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    private static Boolean f38294zzf;

    /* JADX INFO: renamed from: zzg, reason: collision with root package name */
    private static Boolean f38295zzg;

    /* JADX INFO: renamed from: zzh, reason: collision with root package name */
    private static Boolean f38296zzh;

    /* JADX INFO: renamed from: zzi, reason: collision with root package name */
    private static Boolean f38297zzi;

    /* JADX INFO: renamed from: zzj, reason: collision with root package name */
    private static Boolean f38298zzj;

    /* JADX INFO: renamed from: zzk, reason: collision with root package name */
    private static Boolean f38299zzk;

    /* JADX INFO: renamed from: zzl, reason: collision with root package name */
    private static Boolean f38300zzl;
    private static Boolean zzm;
    private static Boolean zzn;
    private static Boolean zzo;
    private static Boolean zzp;
    private static Boolean zzq;
    private static Boolean zzr;

    private DeviceProperties() {
    }

    @SideEffectFree
    @KeepForSdk
    public static boolean isAuto(@NonNull Context context) {
        return zze(context.getPackageManager());
    }

    @SideEffectFree
    @KeepForSdk
    public static boolean isBstar(@NonNull Context context) {
        if (zzo == null) {
            boolean z = false;
            if (PlatformVersion.isAtLeastR() && context.getPackageManager().hasSystemFeature("com.google.android.play.feature.HPE_EXPERIENCE")) {
                z = true;
            }
            zzo = Boolean.valueOf(z);
        }
        return zzo.booleanValue();
    }

    @KeepForSdk
    public static boolean isFoldable(@NonNull Context context) {
        if (f38292zzd == null) {
            boolean z = false;
            if (PlatformVersion.isAtLeastR() && context.getPackageManager().hasSystemFeature("android.hardware.sensor.hinge_angle")) {
                z = true;
            }
            f38292zzd = Boolean.valueOf(z);
        }
        return f38292zzd.booleanValue();
    }

    @KeepForSdk
    public static boolean isLatchsky(@NonNull Context context) {
        if (f38296zzh == null) {
            PackageManager packageManager = context.getPackageManager();
            boolean z = false;
            if (packageManager.hasSystemFeature("com.google.android.feature.services_updater") && packageManager.hasSystemFeature("cn.google.services")) {
                z = true;
            }
            f38296zzh = Boolean.valueOf(z);
        }
        return f38296zzh.booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00cd  */
    @com.google.android.gms.common.annotation.KeepForSdk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean isPhone(@androidx.annotation.NonNull android.content.Context r5) {
        /*
            Method dump skipped, instruction units count: 219
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.util.DeviceProperties.isPhone(android.content.Context):boolean");
    }

    @KeepForSdk
    public static boolean isPhoneGo(@NonNull Context context) {
        ActivityManager activityManager;
        boolean z = false;
        if (context == null) {
            return false;
        }
        if (f38290zzb == null) {
            if (isPhone(context)) {
                if (f38297zzi == null && (activityManager = (ActivityManager) context.getSystemService("activity")) != null) {
                    f38297zzi = Boolean.valueOf(activityManager.isLowRamDevice());
                }
                if (Objects.equal(f38297zzi, Boolean.TRUE)) {
                    z = true;
                }
            }
            f38290zzb = Boolean.valueOf(z);
        }
        return f38290zzb.booleanValue();
    }

    @KeepForSdk
    public static boolean isSevenInchTablet(@NonNull Context context) {
        return zza(context.getResources());
    }

    @KeepForSdk
    public static boolean isSidewinder(@NonNull Context context) {
        return zzc(context);
    }

    @KeepForSdk
    public static boolean isTablet(@NonNull Context context) {
        return isTablet(context.getResources());
    }

    @SideEffectFree
    @KeepForSdk
    public static boolean isTv(@NonNull Context context) {
        return zzf(context.getPackageManager());
    }

    @KeepForSdk
    public static boolean isUserBuild() {
        int i = GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE;
        return "user".equals(Build.TYPE);
    }

    @SideEffectFree
    @KeepForSdk
    public static boolean isWearable(@NonNull Context context) {
        return zzb(context.getPackageManager());
    }

    @KeepForSdk
    public static boolean isWearableWithoutPlayStore(@NonNull Context context) {
        if (isWearable(context) && !PlatformVersion.isAtLeastN()) {
            return true;
        }
        if (zzc(context)) {
            return !PlatformVersion.isAtLeastO() || PlatformVersion.isAtLeastR();
        }
        return false;
    }

    @SideEffectFree
    @KeepForSdk
    public static boolean isXr(@NonNull Context context) {
        return zzg(context.getPackageManager());
    }

    public static boolean zza(@NonNull Resources resources) {
        boolean z = false;
        if (resources == null) {
            return false;
        }
        if (f38293zze == null) {
            Configuration configuration = resources.getConfiguration();
            if ((configuration.screenLayout & 15) <= 3 && configuration.smallestScreenWidthDp >= 600) {
                z = true;
            }
            f38293zze = Boolean.valueOf(z);
        }
        return f38293zze.booleanValue();
    }

    @SideEffectFree
    public static boolean zzb(@NonNull PackageManager packageManager) {
        if (f38294zzf == null) {
            f38294zzf = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        return f38294zzf.booleanValue();
    }

    public static boolean zzc(@NonNull Context context) {
        if (f38295zzg == null) {
            f38295zzg = Boolean.valueOf(context.getPackageManager().hasSystemFeature("cn.google"));
        }
        return f38295zzg.booleanValue();
    }

    public static boolean zzd(@NonNull Context context) {
        if (f38298zzj == null) {
            f38298zzj = Boolean.valueOf(PlatformVersion.isAtLeastO() ? context.getPackageManager().hasSystemFeature("android.hardware.type.embedded") : context.getPackageManager().hasSystemFeature("android.hardware.type.iot"));
        }
        return f38298zzj.booleanValue();
    }

    @SideEffectFree
    public static boolean zze(@NonNull PackageManager packageManager) {
        if (f38300zzl == null) {
            boolean z = false;
            if (PlatformVersion.isAtLeastO() && packageManager.hasSystemFeature("android.hardware.type.automotive")) {
                z = true;
            }
            f38300zzl = Boolean.valueOf(z);
        }
        return f38300zzl.booleanValue();
    }

    @SideEffectFree
    public static boolean zzf(@NonNull PackageManager packageManager) {
        if (zzm == null) {
            boolean z = true;
            if (!packageManager.hasSystemFeature("com.google.android.tv") && !packageManager.hasSystemFeature("android.hardware.type.television") && !packageManager.hasSystemFeature("android.software.leanback") && !packageManager.hasSystemFeature("com.google.android.feature.AMATI_EXPERIENCE")) {
                z = false;
            }
            zzm = Boolean.valueOf(z);
        }
        return zzm.booleanValue();
    }

    @SideEffectFree
    public static boolean zzg(@NonNull PackageManager packageManager) {
        if (zzp == null) {
            zzp = Boolean.valueOf(packageManager.hasSystemFeature("android.software.xr.api.spatial"));
        }
        return zzp.booleanValue();
    }

    @KeepForSdk
    public static boolean isTablet(@NonNull Resources resources) {
        if (resources == null) {
            return false;
        }
        if (f38291zzc == null) {
            f38291zzc = Boolean.valueOf((resources.getConfiguration().screenLayout & 15) > 3 || zza(resources));
        }
        return f38291zzc.booleanValue();
    }
}
