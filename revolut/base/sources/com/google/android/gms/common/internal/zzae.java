package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.google.android.gms.common.wrappers.Wrappers;

/* JADX INFO: loaded from: classes16.dex */
public final class zzae {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private static final Object f38138zza = new Object();

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private static boolean f38139zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private static String f38140zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private static int f38141zzd;

    public static String zza(Context context) {
        zzc(context);
        return f38140zzc;
    }

    public static int zzb(Context context) {
        zzc(context);
        return f38141zzd;
    }

    private static void zzc(Context context) {
        synchronized (f38138zza) {
            try {
                if (f38139zzb) {
                    return;
                }
                f38139zzb = true;
                try {
                    Bundle bundle = Wrappers.packageManager(context).getApplicationInfo(context.getPackageName(), 128).metaData;
                    if (bundle == null) {
                        return;
                    }
                    f38140zzc = bundle.getString("com.google.app.id");
                    f38141zzd = bundle.getInt("com.google.android.gms.version");
                } catch (PackageManager.NameNotFoundException e) {
                }
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }
}
