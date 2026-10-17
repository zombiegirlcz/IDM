package com.google.android.gms.common.internal;

import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;

/* JADX INFO: loaded from: classes.dex */
@KeepForSdk
public final class RootTelemetryConfigManager {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private static RootTelemetryConfigManager f38089zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private static final RootTelemetryConfiguration f38090zzb = new RootTelemetryConfiguration(0, false, false, 0, 0);

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private RootTelemetryConfiguration f38091zzc;

    private RootTelemetryConfigManager() {
    }

    @NonNull
    @KeepForSdk
    public static synchronized RootTelemetryConfigManager getInstance() {
        try {
            if (f38089zza == null) {
                f38089zza = new RootTelemetryConfigManager();
            }
        } catch (Throwable th10) {
            throw th10;
        }
        return f38089zza;
    }

    @KeepForSdk
    public RootTelemetryConfiguration getConfig() {
        return this.f38091zzc;
    }

    public final synchronized void zza(RootTelemetryConfiguration rootTelemetryConfiguration) {
        if (rootTelemetryConfiguration == null) {
            this.f38091zzc = f38090zzb;
            return;
        }
        RootTelemetryConfiguration rootTelemetryConfiguration2 = this.f38091zzc;
        if (rootTelemetryConfiguration2 == null || rootTelemetryConfiguration2.getVersion() < rootTelemetryConfiguration.getVersion()) {
            this.f38091zzc = rootTelemetryConfiguration;
        }
    }
}
