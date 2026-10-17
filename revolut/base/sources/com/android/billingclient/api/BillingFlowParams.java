package com.android.billingclient.api;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.android.billingclient.api.ProductDetails;
import j6.a;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class BillingFlowParams {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private boolean f25633zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private String f25634zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private String f25635zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private SubscriptionUpdateParams f25636zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    private com.google.android.gms.internal.play_billing.zzbw f25637zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    private ArrayList f25638zzf;

    /* JADX INFO: renamed from: zzg, reason: collision with root package name */
    private boolean f25639zzg;

    /* JADX INFO: renamed from: zzh, reason: collision with root package name */
    private DeveloperBillingOptionParams f25640zzh;

    public static class Builder {

        /* JADX INFO: renamed from: zza, reason: collision with root package name */
        private String f25641zza;

        /* JADX INFO: renamed from: zzb, reason: collision with root package name */
        private String f25642zzb;

        /* JADX INFO: renamed from: zzc, reason: collision with root package name */
        private List f25643zzc;

        /* JADX INFO: renamed from: zzd, reason: collision with root package name */
        private ArrayList f25644zzd;

        /* JADX INFO: renamed from: zze, reason: collision with root package name */
        private boolean f25645zze;

        /* JADX INFO: renamed from: zzf, reason: collision with root package name */
        private SubscriptionUpdateParams.Builder f25646zzf;

        /* JADX INFO: renamed from: zzg, reason: collision with root package name */
        private DeveloperBillingOptionParams f25647zzg;

        private Builder() {
            SubscriptionUpdateParams.Builder builderNewBuilder = SubscriptionUpdateParams.newBuilder();
            SubscriptionUpdateParams.Builder.zza(builderNewBuilder);
            this.f25646zzf = builderNewBuilder;
        }

        @NonNull
        public BillingFlowParams build() {
            ArrayList arrayList = this.f25644zzd;
            boolean z = true;
            boolean z3 = (arrayList == null || arrayList.isEmpty()) ? false : true;
            List list = this.f25643zzc;
            boolean z4 = (list == null || list.isEmpty()) ? false : true;
            if (!z3 && !z4) {
                throw new IllegalArgumentException("Details of the products must be provided.");
            }
            if (z3 && z4) {
                throw new IllegalArgumentException("Set SkuDetails or ProductDetailsParams, not both.");
            }
            zzcx zzcxVar = null;
            if (!z3) {
                List list2 = this.f25643zzc;
                if (list2 != null) {
                    Iterator it8 = list2.iterator();
                    while (it8.hasNext()) {
                        if (((ProductDetailsParams) it8.next()) == null) {
                            throw new IllegalArgumentException("ProductDetailsParams cannot be null.");
                        }
                    }
                }
            } else {
                if (this.f25644zzd.contains(null)) {
                    throw new IllegalArgumentException("SKU cannot be null.");
                }
                if (this.f25644zzd.size() > 1) {
                    SkuDetails skuDetails = (SkuDetails) this.f25644zzd.get(0);
                    String type = skuDetails.getType();
                    ArrayList arrayList2 = this.f25644zzd;
                    int size = arrayList2.size();
                    for (int i = 0; i < size; i++) {
                        SkuDetails skuDetails2 = (SkuDetails) arrayList2.get(i);
                        if (!type.equals("play_pass_subs") && !skuDetails2.getType().equals("play_pass_subs") && !type.equals(skuDetails2.getType())) {
                            throw new IllegalArgumentException("SKUs should have the same type.");
                        }
                    }
                    String strZzd = skuDetails.zzd();
                    ArrayList arrayList3 = this.f25644zzd;
                    int size2 = arrayList3.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        SkuDetails skuDetails3 = (SkuDetails) arrayList3.get(i2);
                        if (!type.equals("play_pass_subs") && !skuDetails3.getType().equals("play_pass_subs") && !strZzd.equals(skuDetails3.zzd())) {
                            throw new IllegalArgumentException("All SKUs must have the same package name.");
                        }
                    }
                }
            }
            BillingFlowParams billingFlowParams = new BillingFlowParams(zzcxVar);
            if ((!z3 || ((SkuDetails) this.f25644zzd.get(0)).zzd().isEmpty()) && (!z4 || ((ProductDetailsParams) this.f25643zzc.get(0)).zza().zza().isEmpty())) {
                z = false;
            }
            billingFlowParams.f25633zza = z;
            billingFlowParams.f25634zzb = this.f25641zza;
            billingFlowParams.f25635zzc = this.f25642zzb;
            billingFlowParams.f25636zzd = this.f25646zzf.build();
            ArrayList arrayList4 = this.f25644zzd;
            billingFlowParams.f25638zzf = arrayList4 != null ? new ArrayList(arrayList4) : new ArrayList();
            billingFlowParams.f25639zzg = this.f25645zze;
            List list3 = this.f25643zzc;
            billingFlowParams.f25637zze = list3 != null ? com.google.android.gms.internal.play_billing.zzbw.zzj(list3) : com.google.android.gms.internal.play_billing.zzbw.zzk();
            billingFlowParams.f25640zzh = this.f25647zzg;
            return billingFlowParams;
        }

        @NonNull
        @zzl
        public Builder enableDeveloperBillingOption(@NonNull DeveloperBillingOptionParams developerBillingOptionParams) {
            this.f25647zzg = developerBillingOptionParams;
            return this;
        }

        @NonNull
        public Builder setIsOfferPersonalized(boolean z) {
            this.f25645zze = z;
            return this;
        }

        @NonNull
        public Builder setObfuscatedAccountId(@NonNull String str) {
            this.f25641zza = str;
            return this;
        }

        @NonNull
        public Builder setObfuscatedProfileId(@NonNull String str) {
            this.f25642zzb = str;
            return this;
        }

        @NonNull
        public Builder setProductDetailsParamsList(@NonNull List<ProductDetailsParams> list) {
            this.f25643zzc = new ArrayList(list);
            return this;
        }

        @NonNull
        @Deprecated
        public Builder setSkuDetails(@NonNull SkuDetails skuDetails) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(skuDetails);
            this.f25644zzd = arrayList;
            return this;
        }

        @NonNull
        public Builder setSubscriptionUpdateParams(@NonNull SubscriptionUpdateParams subscriptionUpdateParams) {
            this.f25646zzf = SubscriptionUpdateParams.zzb(subscriptionUpdateParams);
            return this;
        }

        public /* synthetic */ Builder(zzcx zzcxVar) {
            SubscriptionUpdateParams.Builder builderNewBuilder = SubscriptionUpdateParams.newBuilder();
            SubscriptionUpdateParams.Builder.zza(builderNewBuilder);
            this.f25646zzf = builderNewBuilder;
        }
    }

    public static final class ProductDetailsParams {

        @zzy
        private final SubscriptionProductReplacementParams mSubscriptionProductReplacementParams;

        /* JADX INFO: renamed from: zza, reason: collision with root package name */
        private final ProductDetails f25648zza;

        /* JADX INFO: renamed from: zzb, reason: collision with root package name */
        private final String f25649zzb;

        public static class Builder {

            @zzy
            private SubscriptionProductReplacementParams mSubscriptionProductReplacementParams;

            /* JADX INFO: renamed from: zza, reason: collision with root package name */
            private ProductDetails f25650zza;

            /* JADX INFO: renamed from: zzb, reason: collision with root package name */
            private String f25651zzb;

            private Builder() {
                throw null;
            }

            @NonNull
            public ProductDetailsParams build() {
                com.google.android.gms.internal.play_billing.zzbj.zzc(this.f25650zza, "ProductDetails is required for constructing ProductDetailsParams.");
                return new ProductDetailsParams(this, null);
            }

            @NonNull
            public Builder setOfferToken(@NonNull String str) {
                if (TextUtils.isEmpty(str)) {
                    throw new IllegalArgumentException("offerToken can not be empty");
                }
                this.f25651zzb = str;
                return this;
            }

            @NonNull
            public Builder setProductDetails(@NonNull ProductDetails productDetails) {
                this.f25650zza = productDetails;
                if (productDetails.getOneTimePurchaseOfferDetails() != null) {
                    productDetails.getOneTimePurchaseOfferDetails().getClass();
                    ProductDetails.OneTimePurchaseOfferDetails oneTimePurchaseOfferDetails = productDetails.getOneTimePurchaseOfferDetails();
                    if (oneTimePurchaseOfferDetails.getOfferToken() != null) {
                        this.f25651zzb = oneTimePurchaseOfferDetails.getOfferToken();
                    }
                }
                return this;
            }

            @NonNull
            @zzy
            public Builder setSubscriptionProductReplacementParams(@NonNull SubscriptionProductReplacementParams subscriptionProductReplacementParams) {
                this.mSubscriptionProductReplacementParams = subscriptionProductReplacementParams;
                return this;
            }

            public /* synthetic */ Builder(zzcx zzcxVar) {
            }
        }

        @zzy
        public static class SubscriptionProductReplacementParams {
            private String oldProductId;

            @zzy
            private int replacementMode;

            @zzy
            public static class Builder {
                private String oldProductId;
                private int replacementMode;

                private Builder() {
                    this.replacementMode = 0;
                }

                @NonNull
                @zzy
                public SubscriptionProductReplacementParams build() {
                    SubscriptionProductReplacementParams subscriptionProductReplacementParams = new SubscriptionProductReplacementParams();
                    subscriptionProductReplacementParams.oldProductId = this.oldProductId;
                    subscriptionProductReplacementParams.replacementMode = this.replacementMode;
                    return subscriptionProductReplacementParams;
                }

                @NonNull
                @zzy
                public Builder setOldProductId(@NonNull String str) {
                    this.oldProductId = str;
                    return this;
                }

                @NonNull
                @zzy
                public Builder setReplacementMode(int i) {
                    this.replacementMode = i;
                    return this;
                }
            }

            @Retention(RetentionPolicy.SOURCE)
            public @interface ReplacementMode {
                public static final int CHARGE_FULL_PRICE = 4;
                public static final int CHARGE_PRORATED_PRICE = 2;
                public static final int DEFERRED = 5;
                public static final int KEEP_EXISTING = 6;
                public static final int UNKNOWN_REPLACEMENT_MODE = 0;
                public static final int WITHOUT_PRORATION = 3;
                public static final int WITH_TIME_PRORATION = 1;
            }

            @NonNull
            public static Builder newBuilder() {
                return new Builder();
            }

            @NonNull
            @zzy
            public String getOldProductId() {
                return this.oldProductId;
            }

            @zzy
            public int getReplacementMode() {
                return this.replacementMode;
            }
        }

        public /* synthetic */ ProductDetailsParams(Builder builder, zzcx zzcxVar) {
            this.f25648zza = builder.f25650zza;
            this.f25649zzb = builder.f25651zzb;
            this.mSubscriptionProductReplacementParams = builder.mSubscriptionProductReplacementParams;
        }

        @NonNull
        public static Builder newBuilder() {
            return new Builder(null);
        }

        @zzy
        public SubscriptionProductReplacementParams getSubscriptionProductReplacementParams() {
            return this.mSubscriptionProductReplacementParams;
        }

        @NonNull
        public final ProductDetails zza() {
            return this.f25648zza;
        }

        public final String zzb() {
            return this.f25649zzb;
        }
    }

    public static class SubscriptionUpdateParams {

        /* JADX INFO: renamed from: zza, reason: collision with root package name */
        private String f25652zza;

        /* JADX INFO: renamed from: zzb, reason: collision with root package name */
        private String f25653zzb;

        /* JADX INFO: renamed from: zzc, reason: collision with root package name */
        private int f25654zzc = 0;

        public static class Builder {

            /* JADX INFO: renamed from: zza, reason: collision with root package name */
            private String f25655zza;

            /* JADX INFO: renamed from: zzb, reason: collision with root package name */
            private String f25656zzb;

            /* JADX INFO: renamed from: zzc, reason: collision with root package name */
            private boolean f25657zzc;

            /* JADX INFO: renamed from: zzd, reason: collision with root package name */
            private int f25658zzd = 0;

            private Builder() {
            }

            public static /* synthetic */ Builder zza(Builder builder) {
                builder.f25657zzc = true;
                return builder;
            }

            @NonNull
            public SubscriptionUpdateParams build() {
                boolean z = true;
                zzcx zzcxVar = null;
                if (TextUtils.isEmpty(this.f25655zza) && TextUtils.isEmpty(null)) {
                    z = false;
                }
                boolean zIsEmpty = TextUtils.isEmpty(this.f25656zzb);
                if (z && !zIsEmpty) {
                    throw new IllegalArgumentException("Please provide Old SKU purchase information(token/id) or original external transaction id, not both.");
                }
                if (!this.f25657zzc && !z && zIsEmpty) {
                    throw new IllegalArgumentException("Old SKU purchase information(token/id) or original external transaction id must be provided.");
                }
                SubscriptionUpdateParams subscriptionUpdateParams = new SubscriptionUpdateParams(zzcxVar);
                subscriptionUpdateParams.f25652zza = this.f25655zza;
                subscriptionUpdateParams.f25654zzc = this.f25658zzd;
                subscriptionUpdateParams.f25653zzb = this.f25656zzb;
                return subscriptionUpdateParams;
            }

            @NonNull
            public Builder setOldPurchaseToken(@NonNull String str) {
                this.f25655zza = str;
                return this;
            }

            @NonNull
            @zze
            public Builder setOriginalExternalTransactionId(@NonNull String str) {
                this.f25656zzb = str;
                return this;
            }

            @NonNull
            @Deprecated
            public Builder setSubscriptionReplacementMode(int i) {
                this.f25658zzd = i;
                return this;
            }

            @NonNull
            @Deprecated
            public final Builder zzb(@NonNull String str) {
                this.f25655zza = str;
                return this;
            }

            public /* synthetic */ Builder(zzcx zzcxVar) {
            }
        }

        @Retention(RetentionPolicy.SOURCE)
        public @interface ReplacementMode {
            public static final int CHARGE_FULL_PRICE = 5;
            public static final int CHARGE_PRORATED_PRICE = 2;
            public static final int DEFERRED = 6;
            public static final int UNKNOWN_REPLACEMENT_MODE = 0;
            public static final int WITHOUT_PRORATION = 3;
            public static final int WITH_TIME_PRORATION = 1;
        }

        private SubscriptionUpdateParams() {
        }

        @NonNull
        public static Builder newBuilder() {
            return new Builder(null);
        }

        public static /* bridge */ /* synthetic */ Builder zzb(SubscriptionUpdateParams subscriptionUpdateParams) {
            Builder builderNewBuilder = newBuilder();
            builderNewBuilder.zzb(subscriptionUpdateParams.f25652zza);
            builderNewBuilder.setSubscriptionReplacementMode(subscriptionUpdateParams.f25654zzc);
            builderNewBuilder.setOriginalExternalTransactionId(subscriptionUpdateParams.f25653zzb);
            return builderNewBuilder;
        }

        public final int zza() {
            return this.f25654zzc;
        }

        public final String zzc() {
            return this.f25652zza;
        }

        public final String zzd() {
            return this.f25653zzb;
        }

        public /* synthetic */ SubscriptionUpdateParams(zzcx zzcxVar) {
        }
    }

    private BillingFlowParams() {
        throw null;
    }

    @NonNull
    public static Builder newBuilder() {
        return new Builder(null);
    }

    @zzl
    public DeveloperBillingOptionParams getDeveloperBillingOptionParams() {
        return this.f25640zzh;
    }

    public int zza() {
        return 0;
    }

    public final int zzb() {
        return this.f25636zzd.zza();
    }

    public long zzc() {
        return 0L;
    }

    public final BillingResult zzd() {
        ProductDetails.OneTimePurchaseOfferDetails next;
        ProductDetailsParams.SubscriptionProductReplacementParams subscriptionProductReplacementParams;
        if (this.f25637zze.isEmpty()) {
            return zzdc.f25983zzi;
        }
        ProductDetailsParams productDetailsParams = (ProductDetailsParams) this.f25637zze.get(0);
        for (int i = 1; i < this.f25637zze.size(); i++) {
            ProductDetailsParams productDetailsParams2 = (ProductDetailsParams) this.f25637zze.get(i);
            if (!productDetailsParams2.zza().getProductType().equals(productDetailsParams.zza().getProductType()) && !productDetailsParams2.zza().getProductType().equals("play_pass_subs")) {
                return zzdc.zza(5, "All products should have same ProductType.");
            }
        }
        String strZza = productDetailsParams.zza().zza();
        HashMap map = new HashMap();
        HashSet<String> hashSet = new HashSet();
        com.google.android.gms.internal.play_billing.zzbw zzbwVar = this.f25637zze;
        int size = zzbwVar.size();
        boolean z = false;
        for (int i2 = 0; i2 < size; i2++) {
            ProductDetailsParams productDetailsParams3 = (ProductDetailsParams) zzbwVar.get(i2);
            ProductDetailsParams.SubscriptionProductReplacementParams subscriptionProductReplacementParams2 = productDetailsParams3.getSubscriptionProductReplacementParams();
            if (subscriptionProductReplacementParams2 != null) {
                BillingResult billingResultZza = !productDetailsParams3.zza().getProductType().equals("subs") ? zzdc.zza(5, a.q("Non-subscription product cannot have SubscriptionProductReplacementParams. Invalid product id: ", productDetailsParams3.zza().getProductId())) : subscriptionProductReplacementParams2.getReplacementMode() <= 0 ? zzdc.zza(5, a.q("replacementMode is required for constructing SubscriptionProductReplacementParams. Not correctly set for product id: ", productDetailsParams3.zza().getProductId())) : com.google.android.gms.internal.play_billing.zzbm.zzd(subscriptionProductReplacementParams2.oldProductId) ? zzdc.zza(5, a.q("oldProductId is required for constructing SubscriptionProductReplacementParams. Not correctly set for product id: ", productDetailsParams3.zza().getProductId())) : zzdc.f25983zzi;
                if (billingResultZza != zzdc.f25983zzi) {
                    return billingResultZza;
                }
            }
            if (subscriptionProductReplacementParams2 != null && subscriptionProductReplacementParams2.getReplacementMode() == 6) {
                BillingResult billingResultZza2 = productDetailsParams3.zzb() != null ? zzdc.zza(5, a.q("When using KEEP_EXISTING mode, offerToken in ProductDetailsParams should not be set. Offer token is set for product id: ", productDetailsParams3.zza().getProductId())) : !subscriptionProductReplacementParams2.getOldProductId().equals(productDetailsParams3.zza().getProductId()) ? zzdc.zza(5, a.q("When using KEEP_EXISTING mode, oldProductId in SubscriptionProductReplacementParams should be the same as the product id in ProductDetails. Value is invalid for product id: ", productDetailsParams3.zza().getProductId())) : zzdc.f25983zzi;
                if (billingResultZza2 != zzdc.f25983zzi) {
                    return billingResultZza2;
                }
            }
            if (productDetailsParams3.zza().getSubscriptionOfferDetails() != null && productDetailsParams3.zzb() == null && (subscriptionProductReplacementParams2 == null || subscriptionProductReplacementParams2.getReplacementMode() != 6)) {
                return zzdc.zza(5, a.q("offerToken is required for constructing ProductDetailsParams for subscriptions. Missing value for product id: ", productDetailsParams3.zza().getProductId()));
            }
            if (map.containsKey(productDetailsParams3.zza().getProductId())) {
                return zzdc.zza(5, p.a.p("ProductId can not be duplicated. Invalid product id: ", productDetailsParams3.zza().getProductId(), "."));
            }
            map.put(productDetailsParams3.zza().getProductId(), productDetailsParams3);
            if (subscriptionProductReplacementParams2 != null) {
                if (hashSet.contains(subscriptionProductReplacementParams2.getOldProductId())) {
                    return zzdc.zza(5, p.a.p("OldProductId can not be duplicated. Invalid old product id: ", subscriptionProductReplacementParams2.getOldProductId(), "."));
                }
                hashSet.add(subscriptionProductReplacementParams2.getOldProductId());
                z = true;
            }
            if (!productDetailsParams.zza().getProductType().equals("play_pass_subs") && !productDetailsParams3.zza().getProductType().equals("play_pass_subs") && !strZza.equals(productDetailsParams3.zza().zza())) {
                return zzdc.zza(5, "All products must have the same package name.");
            }
        }
        for (String str : hashSet) {
            if (map.containsKey(str) && ((subscriptionProductReplacementParams = ((ProductDetailsParams) map.get(str)).getSubscriptionProductReplacementParams()) == null || !subscriptionProductReplacementParams.getOldProductId().equals(str))) {
                return zzdc.zza(5, p.a.p("OldProductId must not be one of the products to be purchased. Invalid old product id: ", str, "."));
            }
        }
        if (z && this.f25636zzd.zza() != 0) {
            return zzdc.zza(5, "SubscriptionUpdateParams.setSubscriptionReplaceMode and  ProductDetailsParams.setSubscriptionProductReplacementParams cannot be called at the same time.");
        }
        List<ProductDetails.OneTimePurchaseOfferDetails> oneTimePurchaseOfferDetailsList = productDetailsParams.zza().getOneTimePurchaseOfferDetailsList();
        String strZzb = productDetailsParams.zzb();
        if (strZzb != null && oneTimePurchaseOfferDetailsList != null) {
            Iterator<ProductDetails.OneTimePurchaseOfferDetails> it8 = oneTimePurchaseOfferDetailsList.iterator();
            while (true) {
                if (!it8.hasNext()) {
                    next = null;
                    break;
                }
                next = it8.next();
                if (strZzb.equals(next.getOfferToken())) {
                    break;
                }
            }
            if (next != null && next.zza() != null) {
                return zzdc.zza(5, "Both autoPayDetails and autoPayBalanceThreshold is required for constructing ProductDetailsParams for autopay.");
            }
        }
        return zzdc.f25983zzi;
    }

    public final String zze() {
        return this.f25634zzb;
    }

    public final String zzf() {
        return this.f25635zzc;
    }

    public String zzg() {
        return null;
    }

    public final String zzh() {
        return this.f25636zzd.zzc();
    }

    public final String zzi() {
        return this.f25636zzd.zzd();
    }

    @NonNull
    public final ArrayList zzj() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f25638zzf);
        return arrayList;
    }

    @NonNull
    public final List zzk() {
        return this.f25637zze;
    }

    public final boolean zzt() {
        return this.f25639zzg;
    }

    public final boolean zzu() {
        if (this.f25634zzb != null || this.f25635zzc != null || this.f25636zzd.zzd() != null || this.f25636zzd.zza() != 0 || this.f25633zza || this.f25639zzg) {
            return true;
        }
        com.google.android.gms.internal.play_billing.zzbw zzbwVar = this.f25637zze;
        if (zzbwVar != null) {
            int size = zzbwVar.size();
            int i = 0;
            while (i < size) {
                ProductDetailsParams.SubscriptionProductReplacementParams subscriptionProductReplacementParams = ((ProductDetailsParams) zzbwVar.get(i)).getSubscriptionProductReplacementParams();
                i++;
                if (subscriptionProductReplacementParams != null) {
                    return true;
                }
            }
        }
        return false;
    }

    public /* synthetic */ BillingFlowParams(zzcx zzcxVar) {
    }
}
