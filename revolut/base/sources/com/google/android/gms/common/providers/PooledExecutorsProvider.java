package com.google.android.gms.common.providers;

import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes16.dex */
@KeepForSdk
@Deprecated
public class PooledExecutorsProvider {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private static PooledExecutorFactory f38223zza;

    public interface PooledExecutorFactory {
        @NonNull
        @KeepForSdk
        @Deprecated
        ScheduledExecutorService newSingleThreadScheduledExecutor();
    }

    private PooledExecutorsProvider() {
    }

    @NonNull
    @KeepForSdk
    @Deprecated
    public static synchronized PooledExecutorFactory getInstance() {
        try {
            if (f38223zza == null) {
                f38223zza = new zza();
            }
        } catch (Throwable th10) {
            throw th10;
        }
        return f38223zza;
    }
}
