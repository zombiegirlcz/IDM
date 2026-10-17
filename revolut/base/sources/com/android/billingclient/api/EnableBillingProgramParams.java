package com.android.billingclient.api;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes16.dex */
@zzl
public final class EnableBillingProgramParams {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final int f25687zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final DeveloperProvidedBillingListener f25688zzb;

    public static final class Builder {

        /* JADX INFO: renamed from: zza, reason: collision with root package name */
        private int f25689zza;

        /* JADX INFO: renamed from: zzb, reason: collision with root package name */
        private DeveloperProvidedBillingListener f25690zzb;

        @NonNull
        public EnableBillingProgramParams build() {
            return new EnableBillingProgramParams(this, null);
        }

        @NonNull
        public Builder setBillingProgram(int i) {
            this.f25689zza = i;
            return this;
        }

        @NonNull
        public Builder setDeveloperProvidedBillingListener(DeveloperProvidedBillingListener developerProvidedBillingListener) {
            this.f25690zzb = developerProvidedBillingListener;
            return this;
        }
    }

    public /* synthetic */ EnableBillingProgramParams(Builder builder, zzdk zzdkVar) {
        this.f25687zza = builder.f25689zza;
        this.f25688zzb = builder.f25690zzb;
    }

    @NonNull
    public static Builder newBuilder() {
        return new Builder();
    }

    public int getBillingProgram() {
        return this.f25687zza;
    }

    public DeveloperProvidedBillingListener getDeveloperProvidedBillingListener() {
        return this.f25688zzb;
    }
}
