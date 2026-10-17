package com.android.billingclient.api;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes16.dex */
public final class AcknowledgePurchaseParams {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private String f25607zza;

    public static final class Builder {

        /* JADX INFO: renamed from: zza, reason: collision with root package name */
        private String f25608zza;

        private Builder() {
            throw null;
        }

        @NonNull
        public AcknowledgePurchaseParams build() {
            String str = this.f25608zza;
            if (str == null) {
                throw new IllegalArgumentException("Purchase token must be set");
            }
            AcknowledgePurchaseParams acknowledgePurchaseParams = new AcknowledgePurchaseParams(null);
            acknowledgePurchaseParams.f25607zza = str;
            return acknowledgePurchaseParams;
        }

        @NonNull
        public Builder setPurchaseToken(@NonNull String str) {
            this.f25608zza = str;
            return this;
        }

        public /* synthetic */ Builder(zza zzaVar) {
        }
    }

    private AcknowledgePurchaseParams() {
        throw null;
    }

    @NonNull
    public static Builder newBuilder() {
        return new Builder(null);
    }

    @NonNull
    public String getPurchaseToken() {
        return this.f25607zza;
    }

    public /* synthetic */ AcknowledgePurchaseParams(zza zzaVar) {
    }
}
