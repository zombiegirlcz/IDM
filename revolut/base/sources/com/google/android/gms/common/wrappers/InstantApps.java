package com.google.android.gms.common.wrappers;

import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.util.PlatformVersion;

/* JADX INFO: loaded from: classes16.dex */
@KeepForSdk
public class InstantApps {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private static Context f38331zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private static Boolean f38332zzb;

    @KeepForSdk
    public static synchronized boolean isInstantApp(@NonNull Context context) {
        Boolean bool;
        Context applicationContext = context.getApplicationContext();
        Context context2 = f38331zza;
        if (context2 != null && (bool = f38332zzb) != null && context2 == applicationContext) {
            return bool.booleanValue();
        }
        f38332zzb = null;
        if (PlatformVersion.isAtLeastO()) {
            f38332zzb = Boolean.valueOf(applicationContext.getPackageManager().isInstantApp());
        } else {
            try {
                context.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
                f38332zzb = Boolean.TRUE;
            } catch (ClassNotFoundException unused) {
                f38332zzb = Boolean.FALSE;
            }
        }
        f38331zza = applicationContext;
        return f38332zzb.booleanValue();
    }
}
