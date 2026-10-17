package com.android.billingclient.api;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes16.dex */
public final class InAppMessageResult {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final int f25693zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final String f25694zzb;

    @Retention(RetentionPolicy.SOURCE)
    public @interface InAppMessageResponseCode {
        public static final int NO_ACTION_NEEDED = 0;
        public static final int SUBSCRIPTION_STATUS_UPDATED = 1;
    }

    public InAppMessageResult(int i, String str) {
        this.f25693zza = i;
        this.f25694zzb = str;
    }

    public String getPurchaseToken() {
        return this.f25694zzb;
    }

    public int getResponseCode() {
        return this.f25693zza;
    }
}
