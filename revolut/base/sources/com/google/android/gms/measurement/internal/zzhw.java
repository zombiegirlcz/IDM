package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.wrappers.PackageManagerWrapper;
import com.google.android.gms.common.wrappers.Wrappers;

/* JADX INFO: loaded from: classes16.dex */
public final class zzhw {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final zzio f47107zza;

    public zzhw(zzpv zzpvVar) {
        this.f47107zza = zzpvVar.zzt();
    }

    public final boolean zza() {
        try {
            zzio zzioVar = this.f47107zza;
            PackageManagerWrapper packageManagerWrapperPackageManager = Wrappers.packageManager(zzioVar.zzaT());
            if (packageManagerWrapperPackageManager != null) {
                return packageManagerWrapperPackageManager.getPackageInfo("com.android.vending", 128).versionCode >= 80837300;
            }
            zzioVar.zzaW().zzj().zza("Failed to get PackageManager for Install Referrer Play Store compatibility check");
            return false;
        } catch (Exception e) {
            this.f47107zza.zzaW().zzj().zzb("Failed to retrieve Play Store version for Install Referrer", e);
            return false;
        }
    }
}
