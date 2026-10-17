package com.android.billingclient.api;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import j6.a;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes16.dex */
public final class ProductDetails {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final String f25705zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final JSONObject f25706zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private final String f25707zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private final String f25708zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    private final String f25709zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    private final String f25710zzf;

    /* JADX INFO: renamed from: zzg, reason: collision with root package name */
    private final String f25711zzg;

    /* JADX INFO: renamed from: zzh, reason: collision with root package name */
    private final String f25712zzh;

    /* JADX INFO: renamed from: zzi, reason: collision with root package name */
    private final String f25713zzi;

    /* JADX INFO: renamed from: zzj, reason: collision with root package name */
    private final List f25714zzj;

    /* JADX INFO: renamed from: zzk, reason: collision with root package name */
    private final List f25715zzk;

    @zzn
    public static final class InstallmentPlanDetails {
        private final int commitmentPaymentsCount;
        private final int subsequentCommitmentPaymentsCount;

        public InstallmentPlanDetails(JSONObject jSONObject) throws JSONException {
            this.commitmentPaymentsCount = jSONObject.getInt("commitmentPaymentsCount");
            this.subsequentCommitmentPaymentsCount = jSONObject.optInt("subsequentCommitmentPaymentsCount");
        }

        @zzn
        public int getInstallmentPlanCommitmentPaymentsCount() {
            return this.commitmentPaymentsCount;
        }

        @zzn
        public int getSubsequentInstallmentPlanCommitmentPaymentsCount() {
            return this.subsequentCommitmentPaymentsCount;
        }
    }

    public static final class OneTimePurchaseOfferDetails {

        /* JADX INFO: renamed from: zza, reason: collision with root package name */
        private final String f25716zza;

        /* JADX INFO: renamed from: zzb, reason: collision with root package name */
        private final long f25717zzb;

        /* JADX INFO: renamed from: zzc, reason: collision with root package name */
        private final String f25718zzc;

        /* JADX INFO: renamed from: zzd, reason: collision with root package name */
        private final String f25719zzd;

        /* JADX INFO: renamed from: zze, reason: collision with root package name */
        private final String f25720zze;

        /* JADX INFO: renamed from: zzf, reason: collision with root package name */
        private final String f25721zzf;

        /* JADX INFO: renamed from: zzg, reason: collision with root package name */
        private final List f25722zzg;

        /* JADX INFO: renamed from: zzh, reason: collision with root package name */
        private final Long f25723zzh;

        /* JADX INFO: renamed from: zzi, reason: collision with root package name */
        private final DiscountDisplayInfo f25724zzi;

        /* JADX INFO: renamed from: zzj, reason: collision with root package name */
        private final ValidTimeWindow f25725zzj;

        /* JADX INFO: renamed from: zzk, reason: collision with root package name */
        private final LimitedQuantityInfo f25726zzk;

        /* JADX INFO: renamed from: zzl, reason: collision with root package name */
        private final String f25727zzl;
        private final PreorderDetails zzm;
        private final RentalDetails zzn;
        private final zzdt zzo;

        @zzr
        public static final class DiscountDisplayInfo {

            /* JADX INFO: renamed from: zza, reason: collision with root package name */
            private final Integer f25728zza;

            /* JADX INFO: renamed from: zzb, reason: collision with root package name */
            private final DiscountAmount f25729zzb;

            @zzr
            public static final class DiscountAmount {

                /* JADX INFO: renamed from: zza, reason: collision with root package name */
                private final String f25730zza;

                /* JADX INFO: renamed from: zzb, reason: collision with root package name */
                private final long f25731zzb;

                /* JADX INFO: renamed from: zzc, reason: collision with root package name */
                private final String f25732zzc;

                public DiscountAmount(JSONObject jSONObject) {
                    this.f25730zza = jSONObject.optString("formattedDiscountAmount");
                    this.f25731zzb = jSONObject.optLong("discountAmountMicros");
                    this.f25732zzc = jSONObject.optString("discountAmountCurrencyCode");
                }

                @NonNull
                public String getDiscountAmountCurrencyCode() {
                    return this.f25732zzc;
                }

                public long getDiscountAmountMicros() {
                    return this.f25731zzb;
                }

                @NonNull
                public String getFormattedDiscountAmount() {
                    return this.f25730zza;
                }
            }

            public DiscountDisplayInfo(JSONObject jSONObject) throws JSONException {
                this.f25728zza = jSONObject.has("percentageDiscount") ? Integer.valueOf(jSONObject.optInt("percentageDiscount")) : null;
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("discountAmount");
                this.f25729zzb = jSONObjectOptJSONObject != null ? new DiscountAmount(jSONObjectOptJSONObject) : null;
            }

            @zzr
            public DiscountAmount getDiscountAmount() {
                return this.f25729zzb;
            }

            @zzr
            public Integer getPercentageDiscount() {
                return this.f25728zza;
            }
        }

        @zzr
        public static final class LimitedQuantityInfo {

            /* JADX INFO: renamed from: zza, reason: collision with root package name */
            private final int f25733zza;

            /* JADX INFO: renamed from: zzb, reason: collision with root package name */
            private final int f25734zzb;

            public LimitedQuantityInfo(JSONObject jSONObject) throws JSONException {
                this.f25733zza = jSONObject.getInt("maximumQuantity");
                this.f25734zzb = jSONObject.getInt("remainingQuantity");
            }

            @zzr
            public int getMaximumQuantity() {
                return this.f25733zza;
            }

            @zzr
            public int getRemainingQuantity() {
                return this.f25734zzb;
            }
        }

        @zzs
        public static final class PreorderDetails {
            private final long preorderPresaleEndTimeMillis;
            private final long preorderReleaseTimeMillis;

            public PreorderDetails(JSONObject jSONObject) throws JSONException {
                this.preorderReleaseTimeMillis = jSONObject.getLong("preorderReleaseTimeMillis");
                this.preorderPresaleEndTimeMillis = jSONObject.getLong("preorderPresaleEndTimeMillis");
            }

            @zzs
            public long getPreorderPresaleEndTimeMillis() {
                return this.preorderPresaleEndTimeMillis;
            }

            @zzs
            public long getPreorderReleaseTimeMillis() {
                return this.preorderReleaseTimeMillis;
            }
        }

        @zzt
        public static final class RentalDetails {
            private final String rentalExpirationPeriod;
            private final String rentalPeriod;

            public RentalDetails(JSONObject jSONObject) throws JSONException {
                this.rentalPeriod = jSONObject.getString("rentalPeriod");
                String strOptString = jSONObject.optString("rentalExpirationPeriod");
                this.rentalExpirationPeriod = true == strOptString.isEmpty() ? null : strOptString;
            }

            @zzt
            public String getRentalExpirationPeriod() {
                return this.rentalExpirationPeriod;
            }

            @NonNull
            @zzt
            public String getRentalPeriod() {
                return this.rentalPeriod;
            }
        }

        @zzr
        public static final class ValidTimeWindow {

            /* JADX INFO: renamed from: zza, reason: collision with root package name */
            private final Long f25735zza;

            /* JADX INFO: renamed from: zzb, reason: collision with root package name */
            private final Long f25736zzb;

            public ValidTimeWindow(JSONObject jSONObject) throws JSONException {
                this.f25735zza = jSONObject.has("startTimeMillis") ? Long.valueOf(jSONObject.optLong("startTimeMillis")) : null;
                this.f25736zzb = jSONObject.has("endTimeMillis") ? Long.valueOf(jSONObject.optLong("endTimeMillis")) : null;
            }

            @zzr
            public Long getEndTimeMillis() {
                return this.f25736zzb;
            }

            @zzr
            public Long getStartTimeMillis() {
                return this.f25735zza;
            }
        }

        public OneTimePurchaseOfferDetails(JSONObject jSONObject) throws JSONException {
            this.f25716zza = jSONObject.optString("formattedPrice");
            this.f25717zzb = jSONObject.optLong("priceAmountMicros");
            this.f25718zzc = jSONObject.optString("priceCurrencyCode");
            String strOptString = jSONObject.optString("offerIdToken");
            this.f25719zzd = true == strOptString.isEmpty() ? null : strOptString;
            String strOptString2 = jSONObject.optString("offerId");
            this.f25720zze = true == strOptString2.isEmpty() ? null : strOptString2;
            String strOptString3 = jSONObject.optString("purchaseOptionId");
            this.f25721zzf = true == strOptString3.isEmpty() ? null : strOptString3;
            jSONObject.optInt("offerType");
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("offerTags");
            this.f25722zzg = new ArrayList();
            if (jSONArrayOptJSONArray != null) {
                for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                    this.f25722zzg.add(jSONArrayOptJSONArray.getString(i));
                }
            }
            this.f25723zzh = jSONObject.has("fullPriceMicros") ? Long.valueOf(jSONObject.optLong("fullPriceMicros")) : null;
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("discountDisplayInfo");
            this.f25724zzi = jSONObjectOptJSONObject == null ? null : new DiscountDisplayInfo(jSONObjectOptJSONObject);
            JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("validTimeWindow");
            this.f25725zzj = jSONObjectOptJSONObject2 == null ? null : new ValidTimeWindow(jSONObjectOptJSONObject2);
            JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("limitedQuantityInfo");
            this.f25726zzk = jSONObjectOptJSONObject3 == null ? null : new LimitedQuantityInfo(jSONObjectOptJSONObject3);
            this.f25727zzl = jSONObject.optString("serializedDocid");
            JSONObject jSONObjectOptJSONObject4 = jSONObject.optJSONObject("preorderDetails");
            this.zzm = jSONObjectOptJSONObject4 == null ? null : new PreorderDetails(jSONObjectOptJSONObject4);
            JSONObject jSONObjectOptJSONObject5 = jSONObject.optJSONObject("rentalDetails");
            this.zzn = jSONObjectOptJSONObject5 == null ? null : new RentalDetails(jSONObjectOptJSONObject5);
            JSONObject jSONObjectOptJSONObject6 = jSONObject.optJSONObject("autoPayDetails");
            this.zzo = jSONObjectOptJSONObject6 != null ? new zzdt(jSONObjectOptJSONObject6) : null;
            JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("pricingPhases");
            if (jSONArrayOptJSONArray2 == null) {
                return;
            }
            new PricingPhases(jSONArrayOptJSONArray2);
        }

        @zzr
        public DiscountDisplayInfo getDiscountDisplayInfo() {
            return this.f25724zzi;
        }

        @NonNull
        public String getFormattedPrice() {
            return this.f25716zza;
        }

        @zzr
        public Long getFullPriceMicros() {
            return this.f25723zzh;
        }

        @zzr
        public LimitedQuantityInfo getLimitedQuantityInfo() {
            return this.f25726zzk;
        }

        @zzr
        @zzt
        public String getOfferId() {
            return this.f25720zze;
        }

        @zzr
        public List<String> getOfferTags() {
            return this.f25722zzg;
        }

        @zzr
        @zzt
        public String getOfferToken() {
            return this.f25719zzd;
        }

        @zzs
        public PreorderDetails getPreorderDetails() {
            return this.zzm;
        }

        public long getPriceAmountMicros() {
            return this.f25717zzb;
        }

        @NonNull
        public String getPriceCurrencyCode() {
            return this.f25718zzc;
        }

        @zzt
        public String getPurchaseOptionId() {
            return this.f25721zzf;
        }

        @zzt
        public RentalDetails getRentalDetails() {
            return this.zzn;
        }

        @zzr
        public ValidTimeWindow getValidTimeWindow() {
            return this.f25725zzj;
        }

        public final zzdt zza() {
            return this.zzo;
        }

        public final String zzb() {
            return this.f25727zzl;
        }
    }

    public static final class PricingPhase {

        /* JADX INFO: renamed from: zza, reason: collision with root package name */
        private final String f25737zza;

        /* JADX INFO: renamed from: zzb, reason: collision with root package name */
        private final long f25738zzb;

        /* JADX INFO: renamed from: zzc, reason: collision with root package name */
        private final String f25739zzc;

        /* JADX INFO: renamed from: zzd, reason: collision with root package name */
        private final String f25740zzd;

        /* JADX INFO: renamed from: zze, reason: collision with root package name */
        private final int f25741zze;

        /* JADX INFO: renamed from: zzf, reason: collision with root package name */
        private final int f25742zzf;

        public PricingPhase(JSONObject jSONObject) {
            this.f25740zzd = jSONObject.optString("billingPeriod");
            this.f25739zzc = jSONObject.optString("priceCurrencyCode");
            this.f25737zza = jSONObject.optString("formattedPrice");
            this.f25738zzb = jSONObject.optLong("priceAmountMicros");
            this.f25742zzf = jSONObject.optInt("recurrenceMode");
            this.f25741zze = jSONObject.optInt("billingCycleCount");
        }

        public int getBillingCycleCount() {
            return this.f25741zze;
        }

        @NonNull
        public String getBillingPeriod() {
            return this.f25740zzd;
        }

        @NonNull
        public String getFormattedPrice() {
            return this.f25737zza;
        }

        public long getPriceAmountMicros() {
            return this.f25738zzb;
        }

        @NonNull
        public String getPriceCurrencyCode() {
            return this.f25739zzc;
        }

        public int getRecurrenceMode() {
            return this.f25742zzf;
        }
    }

    public static class PricingPhases {

        /* JADX INFO: renamed from: zza, reason: collision with root package name */
        private final List f25743zza;

        public PricingPhases(JSONArray jSONArray) {
            ArrayList arrayList = new ArrayList();
            if (jSONArray != null) {
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
                    if (jSONObjectOptJSONObject != null) {
                        arrayList.add(new PricingPhase(jSONObjectOptJSONObject));
                    }
                }
            }
            this.f25743zza = arrayList;
        }

        @NonNull
        public List<PricingPhase> getPricingPhaseList() {
            return this.f25743zza;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface RecurrenceMode {
        public static final int FINITE_RECURRING = 2;
        public static final int INFINITE_RECURRING = 1;
        public static final int NON_RECURRING = 3;
    }

    public static final class SubscriptionOfferDetails {

        /* JADX INFO: renamed from: zza, reason: collision with root package name */
        private final String f25744zza;

        /* JADX INFO: renamed from: zzb, reason: collision with root package name */
        private final String f25745zzb;

        /* JADX INFO: renamed from: zzc, reason: collision with root package name */
        private final String f25746zzc;

        /* JADX INFO: renamed from: zzd, reason: collision with root package name */
        private final PricingPhases f25747zzd;

        /* JADX INFO: renamed from: zze, reason: collision with root package name */
        private final List f25748zze;

        /* JADX INFO: renamed from: zzf, reason: collision with root package name */
        private final InstallmentPlanDetails f25749zzf;

        public SubscriptionOfferDetails(JSONObject jSONObject) throws JSONException {
            this.f25744zza = jSONObject.optString("basePlanId");
            String strOptString = jSONObject.optString("offerId");
            this.f25745zzb = true == strOptString.isEmpty() ? null : strOptString;
            this.f25746zzc = jSONObject.getString("offerIdToken");
            this.f25747zzd = new PricingPhases(jSONObject.getJSONArray("pricingPhases"));
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("installmentPlanDetails");
            this.f25749zzf = jSONObjectOptJSONObject != null ? new InstallmentPlanDetails(jSONObjectOptJSONObject) : null;
            JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("transitionPlanDetails");
            if (jSONObjectOptJSONObject2 != null) {
                jSONObjectOptJSONObject2.getString("productId");
                jSONObjectOptJSONObject2.optString("title");
                jSONObjectOptJSONObject2.optString("name");
                jSONObjectOptJSONObject2.optString("description");
                jSONObjectOptJSONObject2.optString("basePlanId");
                JSONObject jSONObjectOptJSONObject3 = jSONObjectOptJSONObject2.optJSONObject("pricingPhase");
                if (jSONObjectOptJSONObject3 != null) {
                    new PricingPhase(jSONObjectOptJSONObject3);
                }
            }
            ArrayList arrayList = new ArrayList();
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("offerTags");
            if (jSONArrayOptJSONArray != null) {
                for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                    arrayList.add(jSONArrayOptJSONArray.getString(i));
                }
            }
            this.f25748zze = arrayList;
        }

        @NonNull
        public String getBasePlanId() {
            return this.f25744zza;
        }

        @zzn
        public InstallmentPlanDetails getInstallmentPlanDetails() {
            return this.f25749zzf;
        }

        public String getOfferId() {
            return this.f25745zzb;
        }

        @NonNull
        public List<String> getOfferTags() {
            return this.f25748zze;
        }

        @NonNull
        public String getOfferToken() {
            return this.f25746zzc;
        }

        @NonNull
        public PricingPhases getPricingPhases() {
            return this.f25747zzd;
        }
    }

    public ProductDetails(String str) throws JSONException {
        this.f25705zza = str;
        JSONObject jSONObject = new JSONObject(str);
        this.f25706zzb = jSONObject;
        String strOptString = jSONObject.optString("productId");
        this.f25707zzc = strOptString;
        String strOptString2 = jSONObject.optString("type");
        this.f25708zzd = strOptString2;
        if (TextUtils.isEmpty(strOptString)) {
            throw new IllegalArgumentException("Product id cannot be empty.");
        }
        if (TextUtils.isEmpty(strOptString2)) {
            throw new IllegalArgumentException("Product type cannot be empty.");
        }
        this.f25709zze = jSONObject.optString("title");
        this.f25710zzf = jSONObject.optString("name");
        this.f25711zzg = jSONObject.optString("description");
        jSONObject.optString("packageDisplayName");
        jSONObject.optString("iconUrl");
        this.f25712zzh = jSONObject.optString("skuDetailsToken");
        this.f25713zzi = jSONObject.optString("serializedDocid");
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("subscriptionOfferDetails");
        if (jSONArrayOptJSONArray != null) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                arrayList.add(new SubscriptionOfferDetails(jSONArrayOptJSONArray.getJSONObject(i)));
            }
            this.f25714zzj = arrayList;
        } else {
            this.f25714zzj = (strOptString2.equals("subs") || strOptString2.equals("play_pass_subs")) ? new ArrayList() : null;
        }
        JSONObject jSONObjectOptJSONObject = this.f25706zzb.optJSONObject("oneTimePurchaseOfferDetails");
        JSONArray jSONArrayOptJSONArray2 = this.f25706zzb.optJSONArray("oneTimePurchaseOfferDetailsList");
        ArrayList arrayList2 = new ArrayList();
        if (jSONArrayOptJSONArray2 != null) {
            for (int i2 = 0; i2 < jSONArrayOptJSONArray2.length(); i2++) {
                arrayList2.add(new OneTimePurchaseOfferDetails(jSONArrayOptJSONArray2.getJSONObject(i2)));
            }
            this.f25715zzk = arrayList2;
            return;
        }
        if (jSONObjectOptJSONObject == null) {
            this.f25715zzk = null;
        } else {
            arrayList2.add(new OneTimePurchaseOfferDetails(jSONObjectOptJSONObject));
            this.f25715zzk = arrayList2;
        }
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (obj2 instanceof ProductDetails) {
            return TextUtils.equals(this.f25705zza, ((ProductDetails) obj2).f25705zza);
        }
        return false;
    }

    @NonNull
    public String getDescription() {
        return this.f25711zzg;
    }

    @NonNull
    public String getName() {
        return this.f25710zzf;
    }

    public OneTimePurchaseOfferDetails getOneTimePurchaseOfferDetails() {
        List list = this.f25715zzk;
        if (list == null || list.isEmpty()) {
            return null;
        }
        return (OneTimePurchaseOfferDetails) list.get(0);
    }

    @zzr
    @zzt
    public List<OneTimePurchaseOfferDetails> getOneTimePurchaseOfferDetailsList() {
        return this.f25715zzk;
    }

    @NonNull
    public String getProductId() {
        return this.f25707zzc;
    }

    @NonNull
    public String getProductType() {
        return this.f25708zzd;
    }

    public List<SubscriptionOfferDetails> getSubscriptionOfferDetails() {
        return this.f25714zzj;
    }

    @NonNull
    public String getTitle() {
        return this.f25709zze;
    }

    public int hashCode() {
        return this.f25705zza.hashCode();
    }

    @NonNull
    public String toString() {
        List list = this.f25714zzj;
        String string = this.f25706zzb.toString();
        String strValueOf = String.valueOf(list);
        StringBuilder sb6 = new StringBuilder("ProductDetails{jsonString='");
        a.D(sb6, this.f25705zza, "', parsedJson=", string, ", productId='");
        sb6.append(this.f25707zzc);
        sb6.append("', productType='");
        sb6.append(this.f25708zzd);
        sb6.append("', title='");
        sb6.append(this.f25709zze);
        sb6.append("', productDetailsToken='");
        return a.w(sb6, this.f25712zzh, "', subscriptionOfferDetails=", strValueOf, "}");
    }

    @NonNull
    public final String zza() {
        return this.f25706zzb.optString("packageName");
    }

    public final String zzb() {
        return this.f25712zzh;
    }

    public final String zzc(String str) {
        List<OneTimePurchaseOfferDetails> list;
        if (!TextUtils.isEmpty(str) && (list = this.f25715zzk) != null && !list.isEmpty()) {
            for (OneTimePurchaseOfferDetails oneTimePurchaseOfferDetails : list) {
                if (!TextUtils.isEmpty(oneTimePurchaseOfferDetails.zzb()) && Objects.equals(oneTimePurchaseOfferDetails.getOfferToken(), str)) {
                    return oneTimePurchaseOfferDetails.zzb();
                }
            }
        }
        return this.f25713zzi;
    }
}
