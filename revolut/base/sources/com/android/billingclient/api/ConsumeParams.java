package com.android.billingclient.api;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes16.dex */
public final class ConsumeParams {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private String f25665zza;

    public static final class Builder {

        /* JADX INFO: renamed from: zza, reason: collision with root package name */
        private String f25666zza;

        private Builder() {
            throw null;
        }

        @NonNull
        public ConsumeParams build() {
            String str = this.f25666zza;
            if (str == null) {
                throw new IllegalArgumentException("Purchase token must be set");
            }
            ConsumeParams consumeParams = new ConsumeParams(null);
            consumeParams.f25665zza = str;
            return consumeParams;
        }

        @NonNull
        public Builder setPurchaseToken(@NonNull String str) {
            this.f25666zza = str;
            return this;
        }

        public /* synthetic */ Builder(zzdd zzddVar) {
        }
    }

    private ConsumeParams() {
        throw null;
    }

    @NonNull
    public static Builder newBuilder() {
        return new Builder(null);
    }

    @NonNull
    public String getPurchaseToken() {
        return this.f25665zza;
    }

    public /* synthetic */ ConsumeParams(zzdd zzddVar) {
    }
}
