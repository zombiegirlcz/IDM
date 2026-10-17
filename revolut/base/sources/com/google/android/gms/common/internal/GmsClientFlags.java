package com.google.android.gms.common.internal;

import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;

/* JADX INFO: loaded from: classes16.dex */
@KeepForSdk
public final class GmsClientFlags {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private static volatile boolean f38066zza = true;

    private GmsClientFlags() {
    }

    @KeepForSdk
    public static boolean isBindServiceOptimizationEnabled(@NonNull String str) {
        return f38066zza;
    }
}
