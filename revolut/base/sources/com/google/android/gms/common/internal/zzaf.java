package com.google.android.gms.common.internal;

import com.google.android.gms.common.ConnectionResult;

/* JADX INFO: loaded from: classes16.dex */
public final class zzaf extends Exception {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    public final ConnectionResult f38142zza;

    public zzaf(ConnectionResult connectionResult) {
        Preconditions.checkArgument(connectionResult.hasResolution(), "ResolvableConnectionException can only be created with a connection result containing a resolution.");
        this.f38142zza = connectionResult;
    }
}
