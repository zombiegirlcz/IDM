package com.google.android.gms.common.util;

import android.app.Application;
import android.os.Process;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.internal.common.zzi;
import com.google.android.gms.internal.common.zzj;
import com.google.android.gms.internal.common.zzx;
import com.google.android.gms.internal.common.zzy;

/* JADX INFO: loaded from: classes16.dex */
@KeepForSdk
public class ProcessUtils {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private static String f38308zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private static int f38309zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private static Boolean f38310zzc;

    private ProcessUtils() {
    }

    @KeepForSdk
    public static String getMyProcessName() {
        if (f38308zza == null) {
            f38308zza = Application.getProcessName();
        }
        return f38308zza;
    }

    public static boolean zza() {
        Boolean boolValueOf = f38310zzc;
        if (boolValueOf == null) {
            if (PlatformVersion.isAtLeastP()) {
                boolValueOf = Boolean.valueOf(Process.isIsolated());
            } else {
                try {
                    Object objZza = zzj.zza(Process.class, "isIsolated", new zzi[0]);
                    Object[] objArr = new Object[0];
                    if (objZza == null) {
                        throw new zzy(zzx.zza("expected a non-null reference", objArr));
                    }
                    boolValueOf = (Boolean) objZza;
                } catch (ReflectiveOperationException unused) {
                    boolValueOf = Boolean.FALSE;
                }
            }
            f38310zzc = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }
}
