package com.google.android.gms.auth;

import android.content.Intent;

/* JADX INFO: loaded from: classes16.dex */
public class GooglePlayServicesAvailabilityException extends UserRecoverableAuthException {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final int f37279zza;

    public GooglePlayServicesAvailabilityException(int i, String str, Intent intent) {
        super(str, intent);
        this.f37279zza = i;
    }

    public int getConnectionStatusCode() {
        return this.f37279zza;
    }
}
