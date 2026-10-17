package com.android.billingclient.api;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
@Deprecated
public class SkuDetailsParams {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private String f25781zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private List f25782zzb;

    public static class Builder {

        /* JADX INFO: renamed from: zza, reason: collision with root package name */
        private String f25783zza;

        /* JADX INFO: renamed from: zzb, reason: collision with root package name */
        private List f25784zzb;

        private Builder() {
            throw null;
        }

        @NonNull
        public SkuDetailsParams build() {
            String str = this.f25783zza;
            if (str == null) {
                throw new IllegalArgumentException("SKU type must be set");
            }
            if (this.f25784zzb == null) {
                throw new IllegalArgumentException("SKU list must be set");
            }
            SkuDetailsParams skuDetailsParams = new SkuDetailsParams();
            skuDetailsParams.f25781zza = str;
            skuDetailsParams.f25782zzb = this.f25784zzb;
            return skuDetailsParams;
        }

        @NonNull
        public Builder setSkusList(@NonNull List<String> list) {
            this.f25784zzb = new ArrayList(list);
            return this;
        }

        @NonNull
        public Builder setType(@NonNull String str) {
            this.f25783zza = str;
            return this;
        }

        public /* synthetic */ Builder(zzee zzeeVar) {
        }
    }

    @NonNull
    public static Builder newBuilder() {
        return new Builder(null);
    }

    @NonNull
    public String getSkuType() {
        return this.f25781zza;
    }

    @NonNull
    public List<String> getSkusList() {
        return this.f25782zzb;
    }
}
