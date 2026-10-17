package com.google.android.gms.measurement.internal;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import ch.qos.logback.core.util.a;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.ProcessUtils;
import com.google.android.gms.common.wrappers.Wrappers;
import grl.b4;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes16.dex */
public final class zzam extends zzjq {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private Boolean f46867zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private String f46868zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private zzal f46869zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private Boolean f46870zzd;

    public zzam(zzio zzioVar) {
        super(zzioVar);
        this.f46869zzc = new zzal() { // from class: com.google.android.gms.measurement.internal.zzak
            @Override // com.google.android.gms.measurement.internal.zzal
            public final String zza(String str, String str2) {
                return null;
            }
        };
    }

    public static final long zzF() {
        return ((Long) zzgi.f46973zzd.zza(null)).longValue();
    }

    public static final int zzG() {
        return Math.max(0, ((Integer) zzgi.f46978zzi.zza(null)).intValue());
    }

    public static final long zzH() {
        return ((Integer) zzgi.f46980zzk.zza(null)).intValue();
    }

    public static final long zzI() {
        return ((Long) zzgi.zzQ.zza(null)).longValue();
    }

    public static final long zzJ() {
        return ((Long) zzgi.zzL.zza(null)).longValue();
    }

    private final String zzK(String str, String str2) {
        try {
            String str3 = (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class).invoke(null, str, "");
            Preconditions.checkNotNull(str3);
            return str3;
        } catch (ClassNotFoundException e) {
            this.zzu.zzaW().zze().zzb("Could not find SystemProperties class", e);
            return "";
        } catch (IllegalAccessException e2) {
            this.zzu.zzaW().zze().zzb("Could not access SystemProperties.get()", e2);
            return "";
        } catch (NoSuchMethodException e4) {
            this.zzu.zzaW().zze().zzb("Could not find SystemProperties.get() method", e4);
            return "";
        } catch (InvocationTargetException e5) {
            this.zzu.zzaW().zze().zzb("SystemProperties.get() threw an exception", e5);
            return "";
        }
    }

    public final boolean zzA() {
        this.zzu.zzaV();
        Boolean boolZzn = zzn("firebase_analytics_collection_deactivated");
        return boolZzn != null && boolZzn.booleanValue();
    }

    public final boolean zzB(String str) {
        return "1".equals(this.f46869zzc.zza(str, "measurement.event_sampling_enabled"));
    }

    public final boolean zzC() {
        if (this.f46867zza == null) {
            Boolean boolZzn = zzn("app_measurement_lite");
            this.f46867zza = boolZzn;
            if (boolZzn == null) {
                this.f46867zza = Boolean.FALSE;
            }
        }
        return this.f46867zza.booleanValue() || !this.zzu.zzN();
    }

    public final boolean zzD() {
        if (this.f46870zzd == null) {
            synchronized (this) {
                try {
                    if (this.f46870zzd == null) {
                        zzio zzioVar = this.zzu;
                        ApplicationInfo applicationInfo = zzioVar.zzaT().getApplicationInfo();
                        String myProcessName = ProcessUtils.getMyProcessName();
                        if (applicationInfo != null) {
                            String str = applicationInfo.processName;
                            boolean z = false;
                            if (str != null && str.equals(myProcessName)) {
                                z = true;
                            }
                            this.f46870zzd = Boolean.valueOf(z);
                        }
                        if (this.f46870zzd == null) {
                            this.f46870zzd = Boolean.TRUE;
                            zzioVar.zzaW().zze().zza("My process not in the list of running processes");
                        }
                    }
                } finally {
                }
            }
        }
        return this.f46870zzd.booleanValue();
    }

    public final boolean zzE() {
        Boolean boolZzn = zzn("google_analytics_sgtm_upload_enabled");
        if (boolZzn == null) {
            return false;
        }
        return boolZzn.booleanValue();
    }

    public final double zza(String str, zzgg zzggVar) {
        if (TextUtils.isEmpty(str)) {
            return ((Double) zzggVar.zza(null)).doubleValue();
        }
        String strZza = this.f46869zzc.zza(str, zzggVar.zzb());
        if (TextUtils.isEmpty(strZza)) {
            return ((Double) zzggVar.zza(null)).doubleValue();
        }
        try {
            return ((Double) zzggVar.zza(Double.valueOf(Double.parseDouble(strZza)))).doubleValue();
        } catch (NumberFormatException unused) {
            return ((Double) zzggVar.zza(null)).doubleValue();
        }
    }

    public final int zzb(String str) {
        return zzi(str, zzgi.zzV, 500, b4.EXPIRED_OR_INVALID_KEY_VALUE);
    }

    public final int zzc(String str, boolean z) {
        if (z) {
            return zzi(str, zzgi.zzag, 100, 500);
        }
        return 500;
    }

    public final int zzd(String str, boolean z) {
        return Math.max(zzc(str, z), 256);
    }

    public final int zze() {
        return this.zzu.zzw().zzao(201500000, true) ? 100 : 25;
    }

    public final int zzf(String str) {
        return zzi(str, zzgi.zzW, 25, 100);
    }

    public final int zzh(String str, zzgg zzggVar) {
        if (TextUtils.isEmpty(str)) {
            return ((Integer) zzggVar.zza(null)).intValue();
        }
        String strZza = this.f46869zzc.zza(str, zzggVar.zzb());
        if (TextUtils.isEmpty(strZza)) {
            return ((Integer) zzggVar.zza(null)).intValue();
        }
        try {
            return ((Integer) zzggVar.zza(Integer.valueOf(Integer.parseInt(strZza)))).intValue();
        } catch (NumberFormatException unused) {
            return ((Integer) zzggVar.zza(null)).intValue();
        }
    }

    public final int zzi(String str, zzgg zzggVar, int i, int i2) {
        return Math.max(Math.min(zzh(str, zzggVar), i2), i);
    }

    public final long zzj() {
        this.zzu.zzaV();
        return 119002L;
    }

    public final long zzk(String str, zzgg zzggVar) {
        if (TextUtils.isEmpty(str)) {
            return ((Long) zzggVar.zza(null)).longValue();
        }
        String strZza = this.f46869zzc.zza(str, zzggVar.zzb());
        if (TextUtils.isEmpty(strZza)) {
            return ((Long) zzggVar.zza(null)).longValue();
        }
        try {
            return ((Long) zzggVar.zza(Long.valueOf(Long.parseLong(strZza)))).longValue();
        } catch (NumberFormatException unused) {
            return ((Long) zzggVar.zza(null)).longValue();
        }
    }

    public final Bundle zzl() {
        try {
            zzio zzioVar = this.zzu;
            if (zzioVar.zzaT().getPackageManager() == null) {
                zzioVar.zzaW().zze().zza("Failed to load metadata: PackageManager is null");
                return null;
            }
            ApplicationInfo applicationInfo = Wrappers.packageManager(zzioVar.zzaT()).getApplicationInfo(zzioVar.zzaT().getPackageName(), 128);
            if (applicationInfo != null) {
                return applicationInfo.metaData;
            }
            zzioVar.zzaW().zze().zza("Failed to load metadata: ApplicationInfo is null");
            return null;
        } catch (PackageManager.NameNotFoundException e) {
            this.zzu.zzaW().zze().zzb("Failed to load metadata: Package name not found", e);
            return null;
        }
    }

    public final zzju zzm(String str, boolean z) {
        Object obj2;
        Preconditions.checkNotEmpty(str);
        zzio zzioVar = this.zzu;
        Bundle bundleZzl = zzl();
        if (bundleZzl == null) {
            a.w(zzioVar, "Failed to load metadata: Metadata bundle is null");
            obj2 = null;
        } else {
            obj2 = bundleZzl.get(str);
        }
        if (obj2 == null) {
            return zzju.UNINITIALIZED;
        }
        if (Boolean.TRUE.equals(obj2)) {
            return zzju.GRANTED;
        }
        if (Boolean.FALSE.equals(obj2)) {
            return zzju.DENIED;
        }
        if (z && "eu_consent_policy".equals(obj2)) {
            return zzju.POLICY;
        }
        zzioVar.zzaW().zzk().zzb("Invalid manifest metadata for", str);
        return zzju.UNINITIALIZED;
    }

    public final Boolean zzn(String str) {
        Preconditions.checkNotEmpty(str);
        Bundle bundleZzl = zzl();
        if (bundleZzl == null) {
            a.w(this.zzu, "Failed to load metadata: Metadata bundle is null");
            return null;
        }
        if (bundleZzl.containsKey(str)) {
            return Boolean.valueOf(bundleZzl.getBoolean(str));
        }
        return null;
    }

    public final String zzo() {
        return zzK("debug.firebase.analytics.app", "");
    }

    public final String zzp() {
        return zzK("debug.deferred.deeplink", "");
    }

    public final String zzq() {
        this.zzu.zzaV();
        return "FA";
    }

    public final String zzr(String str, zzgg zzggVar) {
        return TextUtils.isEmpty(str) ? (String) zzggVar.zza(null) : (String) zzggVar.zza(this.f46869zzc.zza(str, zzggVar.zzb()));
    }

    public final String zzs() {
        return this.f46868zzb;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0026 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List zzt(java.lang.String r4) {
        /*
            r3 = this;
            java.lang.String r4 = "analytics.safelisted_events"
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r4)
            android.os.Bundle r0 = r3.zzl()
            r1 = 0
            if (r0 != 0) goto L15
            com.google.android.gms.measurement.internal.zzio r4 = r3.zzu
            java.lang.String r0 = "Failed to load metadata: Metadata bundle is null"
            ch.qos.logback.core.util.a.w(r4, r0)
        L13:
            r4 = r1
            goto L24
        L15:
            boolean r2 = r0.containsKey(r4)
            if (r2 != 0) goto L1c
            goto L13
        L1c:
            int r4 = r0.getInt(r4)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
        L24:
            if (r4 == 0) goto L50
            com.google.android.gms.measurement.internal.zzio r0 = r3.zzu     // Catch: android.content.res.Resources.NotFoundException -> L40
            android.content.Context r0 = r0.zzaT()     // Catch: android.content.res.Resources.NotFoundException -> L40
            android.content.res.Resources r0 = r0.getResources()     // Catch: android.content.res.Resources.NotFoundException -> L40
            int r4 = r4.intValue()     // Catch: android.content.res.Resources.NotFoundException -> L40
            java.lang.String[] r4 = r0.getStringArray(r4)     // Catch: android.content.res.Resources.NotFoundException -> L40
            if (r4 != 0) goto L3b
            return r1
        L3b:
            java.util.List r4 = java.util.Arrays.asList(r4)     // Catch: android.content.res.Resources.NotFoundException -> L40
            return r4
        L40:
            r4 = move-exception
            com.google.android.gms.measurement.internal.zzio r0 = r3.zzu
            com.google.android.gms.measurement.internal.zzhe r0 = r0.zzaW()
            com.google.android.gms.measurement.internal.zzhc r0 = r0.zze()
            java.lang.String r2 = "Failed to load string array from metadata: resource not found"
            r0.zzb(r2, r4)
        L50:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzam.zzt(java.lang.String):java.util.List");
    }

    public final void zzu(zzal zzalVar) {
        this.f46869zzc = zzalVar;
    }

    public final void zzv(String str) {
        this.f46868zzb = str;
    }

    public final boolean zzw() {
        Boolean boolZzn = zzn("google_analytics_adid_collection_enabled");
        return boolZzn == null || boolZzn.booleanValue();
    }

    public final boolean zzx(String str, zzgg zzggVar) {
        if (TextUtils.isEmpty(str)) {
            return ((Boolean) zzggVar.zza(null)).booleanValue();
        }
        String strZza = this.f46869zzc.zza(str, zzggVar.zzb());
        return TextUtils.isEmpty(strZza) ? ((Boolean) zzggVar.zza(null)).booleanValue() : ((Boolean) zzggVar.zza(Boolean.valueOf("1".equals(strZza)))).booleanValue();
    }

    public final boolean zzy(String str) {
        return "1".equals(this.f46869zzc.zza(str, "gaia_collection_enabled"));
    }

    public final boolean zzz() {
        Boolean boolZzn = zzn("google_analytics_automatic_screen_reporting_enabled");
        return boolZzn == null || boolZzn.booleanValue();
    }
}
