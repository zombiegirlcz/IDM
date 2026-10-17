package com.android.billingclient.api;

import androidx.annotation.NonNull;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public final class QueryProductDetailsParams {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final com.google.android.gms.internal.play_billing.zzbw f25768zza;

    public static class Builder {

        /* JADX INFO: renamed from: zza, reason: collision with root package name */
        private com.google.android.gms.internal.play_billing.zzbw f25769zza;

        private Builder() {
            throw null;
        }

        @NonNull
        public QueryProductDetailsParams build() {
            if (this.f25769zza != null) {
                return new QueryProductDetailsParams(this, null);
            }
            throw new IllegalArgumentException("Product list must be set to a non empty list.");
        }

        @NonNull
        public Builder setProductList(@NonNull List<Product> list) {
            if (list == null || list.isEmpty()) {
                throw new IllegalArgumentException("Product list cannot be empty.");
            }
            HashSet hashSet = new HashSet();
            for (Product product : list) {
                if (!"play_pass_subs".equals(product.zzb())) {
                    hashSet.add(product.zzb());
                }
            }
            if (hashSet.size() > 1) {
                throw new IllegalArgumentException("All products should be of the same product type.");
            }
            this.f25769zza = com.google.android.gms.internal.play_billing.zzbw.zzj(list);
            return this;
        }

        public /* synthetic */ Builder(zzeb zzebVar) {
        }
    }

    public static class Product {

        /* JADX INFO: renamed from: zza, reason: collision with root package name */
        private final String f25770zza;

        /* JADX INFO: renamed from: zzb, reason: collision with root package name */
        private final String f25771zzb;

        public static class Builder {

            /* JADX INFO: renamed from: zza, reason: collision with root package name */
            private String f25772zza;

            /* JADX INFO: renamed from: zzb, reason: collision with root package name */
            private String f25773zzb;

            private Builder() {
                throw null;
            }

            @NonNull
            public Product build() {
                String str = this.f25773zzb;
                if ("first_party".equals(str)) {
                    throw new IllegalArgumentException("Serialized doc id must be provided for first party products.");
                }
                if (this.f25772zza == null) {
                    throw new IllegalArgumentException("Product id must be provided.");
                }
                if (str != null) {
                    return new Product(this, null);
                }
                throw new IllegalArgumentException("Product type must be provided.");
            }

            @NonNull
            public Builder setProductId(@NonNull String str) {
                this.f25772zza = str;
                return this;
            }

            @NonNull
            public Builder setProductType(@NonNull String str) {
                this.f25773zzb = str;
                return this;
            }

            public /* synthetic */ Builder(zzeb zzebVar) {
            }
        }

        public /* synthetic */ Product(Builder builder, zzeb zzebVar) {
            this.f25770zza = builder.f25772zza;
            this.f25771zzb = builder.f25773zzb;
        }

        @NonNull
        public static Builder newBuilder() {
            return new Builder(null);
        }

        @NonNull
        public final String zza() {
            return this.f25770zza;
        }

        @NonNull
        public final String zzb() {
            return this.f25771zzb;
        }
    }

    public /* synthetic */ QueryProductDetailsParams(Builder builder, zzeb zzebVar) {
        this.f25768zza = builder.f25769zza;
    }

    @NonNull
    public static Builder newBuilder() {
        return new Builder(null);
    }

    public final com.google.android.gms.internal.play_billing.zzbw zza() {
        return this.f25768zza;
    }

    @NonNull
    public final String zzb() {
        return ((Product) this.f25768zza.get(0)).zzb();
    }
}
