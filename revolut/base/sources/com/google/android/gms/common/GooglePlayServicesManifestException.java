package com.google.android.gms.common;

import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepName;

/* JADX INFO: loaded from: classes16.dex */
@KeepName
public class GooglePlayServicesManifestException extends IllegalStateException {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final int f37668zza;

    public GooglePlayServicesManifestException(int i, @NonNull String str) {
        super(str);
        this.f37668zza = i;
    }

    public int getActualVersion() {
        return this.f37668zza;
    }

    public int getExpectedVersion() {
        return GoogleApiAvailabilityLight.GOOGLE_PLAY_SERVICES_VERSION_CODE;
    }
}
