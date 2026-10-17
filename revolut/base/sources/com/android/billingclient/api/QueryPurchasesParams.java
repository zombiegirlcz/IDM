package com.android.billingclient.api;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes16.dex */
public final class QueryPurchasesParams {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final String f25775zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final boolean f25776zzb;

    public static class Builder {

        /* JADX INFO: renamed from: zza, reason: collision with root package name */
        private String f25777zza;

        /* JADX INFO: renamed from: zzb, reason: collision with root package name */
        private boolean f25778zzb = false;

        private Builder() {
        }

        @NonNull
        public QueryPurchasesParams build() {
            String str = this.f25777zza;
            if (str == null) {
                throw new IllegalArgumentException("Product type must be set");
            }
            if (!this.f25778zzb || str.equals("subs")) {
                return new QueryPurchasesParams(this, null);
            }
            throw new IllegalArgumentException("includeSuspendedSubscriptions is only supported for subscription purchases");
        }

        @NonNull
        public Builder includeSuspendedSubscriptions(boolean z) {
            this.f25778zzb = z;
            return this;
        }

        @NonNull
        public Builder setProductType(@NonNull String str) {
            this.f25777zza = str;
            return this;
        }

        public /* synthetic */ Builder(zzed zzedVar) {
        }
    }

    public /* synthetic */ QueryPurchasesParams(Builder builder, zzed zzedVar) {
        this.f25775zza = builder.f25777zza;
        this.f25776zzb = builder.f25778zzb;
    }

    @NonNull
    public static Builder newBuilder() {
        return new Builder(null);
    }

    public boolean getIncludeSuspendedSubscriptions() {
        return this.f25776zzb;
    }

    @NonNull
    public final String zza() {
        return this.f25775zza;
    }
}
