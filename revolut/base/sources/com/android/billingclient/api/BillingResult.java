package com.android.billingclient.api;

import a0.d;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes16.dex */
public final class BillingResult {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private int f25659zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private int f25660zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private String f25661zzc;

    public static class Builder {

        /* JADX INFO: renamed from: zza, reason: collision with root package name */
        private int f25662zza;

        /* JADX INFO: renamed from: zzb, reason: collision with root package name */
        private int f25663zzb = 0;

        /* JADX INFO: renamed from: zzc, reason: collision with root package name */
        private String f25664zzc = "";

        private Builder() {
        }

        @NonNull
        public BillingResult build() {
            BillingResult billingResult = new BillingResult();
            billingResult.f25659zza = this.f25662zza;
            billingResult.f25660zzb = this.f25663zzb;
            billingResult.f25661zzc = this.f25664zzc;
            return billingResult;
        }

        @NonNull
        public Builder setDebugMessage(@NonNull String str) {
            this.f25664zzc = str;
            return this;
        }

        @NonNull
        @zzq
        public Builder setOnPurchasesUpdatedSubResponseCode(int i) {
            this.f25663zzb = i;
            return this;
        }

        @NonNull
        public Builder setResponseCode(int i) {
            this.f25662zza = i;
            return this;
        }

        public /* synthetic */ Builder(zzdb zzdbVar) {
        }
    }

    @NonNull
    public static Builder newBuilder() {
        return new Builder(null);
    }

    @NonNull
    public String getDebugMessage() {
        return this.f25661zzc;
    }

    @zzq
    public int getOnPurchasesUpdatedSubResponseCode() {
        return this.f25660zzb;
    }

    public int getResponseCode() {
        return this.f25659zza;
    }

    @NonNull
    public String toString() {
        return d.s("Response Code: ", com.google.android.gms.internal.play_billing.zzc.zzl(this.f25659zza), ", Debug Message: ", this.f25661zzc);
    }
}
