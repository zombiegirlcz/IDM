package com.android.billingclient.api;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes16.dex */
public final class QueryPurchaseHistoryParams {

    public static class Builder {

        /* JADX INFO: renamed from: zza, reason: collision with root package name */
        private String f25774zza;

        private Builder() {
            throw null;
        }

        @NonNull
        public QueryPurchaseHistoryParams build() {
            if (this.f25774zza != null) {
                return new QueryPurchaseHistoryParams(this, null);
            }
            throw new IllegalArgumentException("Product type must be set");
        }

        @NonNull
        public Builder setProductType(@NonNull String str) {
            this.f25774zza = str;
            return this;
        }

        public /* synthetic */ Builder(zzec zzecVar) {
        }
    }

    public /* synthetic */ QueryPurchaseHistoryParams(Builder builder, zzec zzecVar) {
    }

    @NonNull
    public static Builder newBuilder() {
        return new Builder(null);
    }
}
