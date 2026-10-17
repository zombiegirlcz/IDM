package com.google.android.gms.common.api.internal;

import a0.d;
import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.google.android.gms.common.R;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.StringResourceValueReader;
import com.google.android.gms.common.internal.zzae;

/* JADX INFO: loaded from: classes16.dex */
@KeepForSdk
@Deprecated
public final class GoogleServices {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private static final Object f37780zza = new Object();

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private static GoogleServices f37781zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private final String f37782zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private final Status f37783zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    private final boolean f37784zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    private final boolean f37785zzf;

    @KeepForSdk
    public GoogleServices(String str, boolean z) {
        this.f37782zzc = str;
        this.f37783zzd = Status.RESULT_SUCCESS;
        this.f37784zze = z;
        this.f37785zzf = !z;
    }

    @KeepForSdk
    private static GoogleServices checkInitialized(String str) {
        GoogleServices googleServices;
        synchronized (f37780zza) {
            try {
                googleServices = f37781zzb;
                if (googleServices == null) {
                    StringBuilder sb6 = new StringBuilder(String.valueOf(str).length() + 34);
                    sb6.append("Initialize must be called before ");
                    sb6.append(str);
                    sb6.append(".");
                    throw new IllegalStateException(sb6.toString());
                }
            } catch (Throwable th10) {
                throw th10;
            }
        }
        return googleServices;
    }

    @KeepForSdk
    public static void clearInstanceForTest() {
        synchronized (f37780zza) {
            f37781zzb = null;
        }
    }

    @KeepForSdk
    public static String getGoogleAppId() {
        return checkInitialized("getGoogleAppId").f37782zzc;
    }

    @NonNull
    @KeepForSdk
    public static Status initialize(@NonNull Context context) {
        Status status;
        Preconditions.checkNotNull(context, "Context must not be null.");
        synchronized (f37780zza) {
            try {
                if (f37781zzb == null) {
                    f37781zzb = new GoogleServices(context);
                }
                status = f37781zzb.f37783zzd;
            } catch (Throwable th10) {
                throw th10;
            }
        }
        return status;
    }

    @KeepForSdk
    public static boolean isMeasurementEnabled() {
        GoogleServices googleServicesCheckInitialized = checkInitialized("isMeasurementEnabled");
        return googleServicesCheckInitialized.f37783zzd.isSuccess() && googleServicesCheckInitialized.f37784zze;
    }

    @KeepForSdk
    public static boolean isMeasurementExplicitlyDisabled() {
        return checkInitialized("isMeasurementExplicitlyDisabled").f37785zzf;
    }

    @KeepForSdk
    public Status checkGoogleAppId(String str) {
        String str2 = this.f37782zzc;
        return (str2 == null || str2.equals(str)) ? Status.RESULT_SUCCESS : new Status(10, d.u(new StringBuilder(str2.length() + 97), "Initialize was called with two different Google App IDs.  Only the first app ID will be used: '", str2, "'."));
    }

    @KeepForSdk
    public GoogleServices(Context context) {
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("google_app_measurement_enable", "integer", resources.getResourcePackageName(R.string.common_google_play_services_unknown_issue));
        if (identifier != 0) {
            int integer = resources.getInteger(identifier);
            boolean z = integer == 0;
            z = integer != 0;
            this.f37785zzf = z;
        } else {
            this.f37785zzf = false;
        }
        this.f37784zze = z;
        String strZza = zzae.zza(context);
        strZza = strZza == null ? new StringResourceValueReader(context).getString("google_app_id") : strZza;
        if (TextUtils.isEmpty(strZza)) {
            this.f37783zzd = new Status(10, "Missing google app id value from from string resources with name google_app_id.");
            this.f37782zzc = null;
        } else {
            this.f37782zzc = strZza;
            this.f37783zzd = Status.RESULT_SUCCESS;
        }
    }

    @NonNull
    @KeepForSdk
    public static Status initialize(@NonNull Context context, @NonNull String str, boolean z) {
        Preconditions.checkNotNull(context, "Context must not be null.");
        Preconditions.checkNotEmpty(str, "App ID must be nonempty.");
        synchronized (f37780zza) {
            try {
                GoogleServices googleServices = f37781zzb;
                if (googleServices != null) {
                    return googleServices.checkGoogleAppId(str);
                }
                GoogleServices googleServices2 = new GoogleServices(str, z);
                f37781zzb = googleServices2;
                return googleServices2.f37783zzd;
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }
}
