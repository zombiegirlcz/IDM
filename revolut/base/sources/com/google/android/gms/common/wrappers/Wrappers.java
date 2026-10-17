package com.google.android.gms.common.wrappers;

import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;

/* JADX INFO: loaded from: classes.dex */
@KeepForSdk
public class Wrappers {

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private static final Wrappers f38334zzb = new Wrappers();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private PackageManagerWrapper f38335zza = null;

    @NonNull
    @KeepForSdk
    public static PackageManagerWrapper packageManager(@NonNull Context context) {
        return f38334zzb.zza(context);
    }

    @NonNull
    public final synchronized PackageManagerWrapper zza(@NonNull Context context) {
        try {
            if (this.f38335zza == null) {
                if (context.getApplicationContext() != null) {
                    context = context.getApplicationContext();
                }
                this.f38335zza = new PackageManagerWrapper(context);
            }
        } catch (Throwable th10) {
            throw th10;
        }
        return this.f38335zza;
    }
}
