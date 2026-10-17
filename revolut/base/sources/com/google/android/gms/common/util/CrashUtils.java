package com.google.android.gms.common.util;

import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes16.dex */
@KeepForSdk
public final class CrashUtils {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private static final String[] f38287zza = {"android.", "com.android.", "dalvik.", "java.", "javax."};

    @KeepForSdk
    public static boolean addDynamiteErrorToDropBox(@NonNull Context context, @NonNull Throwable th10) {
        try {
            Preconditions.checkNotNull(context);
            Preconditions.checkNotNull(th10);
            return false;
        } catch (Exception e) {
            return false;
        }
    }
}
