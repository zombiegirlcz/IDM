package com.google.android.gms.common.internal;

import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* JADX INFO: loaded from: classes16.dex */
@KeepForSdk
public abstract class DowngradeableSafeParcel extends AbstractSafeParcelable implements ReflectedParcelable {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private static final Object f38049zza = new Object();

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private boolean f38050zzb = false;

    @KeepForSdk
    public static boolean canUnparcelSafely(@NonNull String str) {
        synchronized (f38049zza) {
        }
        return true;
    }

    @KeepForSdk
    public static Integer getUnparcelClientVersion() {
        synchronized (f38049zza) {
        }
        return null;
    }

    @KeepForSdk
    public abstract boolean prepareForClientVersion(int i);

    @KeepForSdk
    public void setShouldDowngrade(boolean z) {
        this.f38050zzb = z;
    }

    @KeepForSdk
    public boolean shouldDowngrade() {
        return this.f38050zzb;
    }
}
