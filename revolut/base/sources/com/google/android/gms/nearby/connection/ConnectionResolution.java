package com.google.android.gms.nearby.connection;

import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes16.dex */
public final class ConnectionResolution {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final Status f47807zza;

    @Deprecated
    public ConnectionResolution(@NonNull Status status) {
        this.f47807zza = status;
    }

    @NonNull
    public Status getStatus() {
        return this.f47807zza;
    }
}
