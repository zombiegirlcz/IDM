package com.google.android.gms.nearby.exposurenotification;

import ch.qos.logback.core.util.FileSize;
import com.google.android.gms.internal.nearby.zzub;
import com.google.android.gms.internal.nearby.zzuc;

/* JADX INFO: loaded from: classes16.dex */
public enum ExposureNotificationStatus {
    ACTIVATED(1),
    INACTIVATED(2),
    BLUETOOTH_DISABLED(4),
    LOCATION_DISABLED(8),
    NO_CONSENT(16),
    NOT_IN_ALLOWLIST(32),
    BLUETOOTH_SUPPORT_UNKNOWN(64),
    HW_NOT_SUPPORT(128),
    FOCUS_LOST(256),
    LOW_STORAGE(512),
    UNKNOWN(FileSize.KB_COEFFICIENT),
    EN_NOT_SUPPORT(2048),
    USER_PROFILE_NOT_SUPPORT(4096);


    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final long f47948zzb;

    ExposureNotificationStatus(long j2) {
        this.f47948zzb = j2;
    }

    public static zzuc zza(long j2) {
        zzub zzubVar = new zzub();
        for (ExposureNotificationStatus exposureNotificationStatus : values()) {
            if ((exposureNotificationStatus.f47948zzb & j2) != 0) {
                zzubVar.zza(exposureNotificationStatus);
            }
        }
        return zzubVar.zzb();
    }
}
