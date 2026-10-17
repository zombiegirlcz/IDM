package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.res.Resources;
import androidx.annotation.NonNull;
import com.google.android.gms.common.R;
import com.google.android.gms.common.annotation.KeepForSdk;

/* JADX INFO: loaded from: classes.dex */
@KeepForSdk
public class StringResourceValueReader {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final Resources f38097zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final String f38098zzb;

    public StringResourceValueReader(@NonNull Context context) {
        Preconditions.checkNotNull(context);
        Resources resources = context.getResources();
        this.f38097zza = resources;
        this.f38098zzb = resources.getResourcePackageName(R.string.common_google_play_services_unknown_issue);
    }

    @KeepForSdk
    public String getString(@NonNull String str) {
        String str2 = this.f38098zzb;
        Resources resources = this.f38097zza;
        int identifier = resources.getIdentifier(str, "string", str2);
        if (identifier == 0) {
            return null;
        }
        return resources.getString(identifier);
    }
}
