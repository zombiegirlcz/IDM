package com.android.billingclient.api;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes16.dex */
@Deprecated
public class SkuDetails {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final String f25779zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final JSONObject f25780zzb;

    public SkuDetails(@NonNull String str) throws JSONException {
        this.f25779zza = str;
        JSONObject jSONObject = new JSONObject(str);
        this.f25780zzb = jSONObject;
        if (TextUtils.isEmpty(jSONObject.optString("productId"))) {
            throw new IllegalArgumentException("SKU cannot be empty.");
        }
        if (TextUtils.isEmpty(jSONObject.optString("type"))) {
            throw new IllegalArgumentException("SkuType cannot be empty.");
        }
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (obj2 instanceof SkuDetails) {
            return TextUtils.equals(this.f25779zza, ((SkuDetails) obj2).f25779zza);
        }
        return false;
    }

    @NonNull
    public String getDescription() {
        return this.f25780zzb.optString("description");
    }

    @NonNull
    public String getFreeTrialPeriod() {
        return this.f25780zzb.optString("freeTrialPeriod");
    }

    @NonNull
    public String getIconUrl() {
        return this.f25780zzb.optString("iconUrl");
    }

    @NonNull
    public String getIntroductoryPrice() {
        return this.f25780zzb.optString("introductoryPrice");
    }

    public long getIntroductoryPriceAmountMicros() {
        return this.f25780zzb.optLong("introductoryPriceAmountMicros");
    }

    public int getIntroductoryPriceCycles() {
        return this.f25780zzb.optInt("introductoryPriceCycles");
    }

    @NonNull
    public String getIntroductoryPricePeriod() {
        return this.f25780zzb.optString("introductoryPricePeriod");
    }

    @NonNull
    public String getOriginalJson() {
        return this.f25779zza;
    }

    @NonNull
    public String getOriginalPrice() {
        JSONObject jSONObject = this.f25780zzb;
        return jSONObject.has("original_price") ? jSONObject.optString("original_price") : getPrice();
    }

    public long getOriginalPriceAmountMicros() {
        JSONObject jSONObject = this.f25780zzb;
        return jSONObject.has("original_price_micros") ? jSONObject.optLong("original_price_micros") : getPriceAmountMicros();
    }

    @NonNull
    public String getPrice() {
        return this.f25780zzb.optString("price");
    }

    public long getPriceAmountMicros() {
        return this.f25780zzb.optLong("price_amount_micros");
    }

    @NonNull
    public String getPriceCurrencyCode() {
        return this.f25780zzb.optString("price_currency_code");
    }

    @NonNull
    public String getSku() {
        return this.f25780zzb.optString("productId");
    }

    @NonNull
    public String getSubscriptionPeriod() {
        return this.f25780zzb.optString("subscriptionPeriod");
    }

    @NonNull
    public String getTitle() {
        return this.f25780zzb.optString("title");
    }

    @NonNull
    public String getType() {
        return this.f25780zzb.optString("type");
    }

    public int hashCode() {
        return this.f25779zza.hashCode();
    }

    @NonNull
    public String toString() {
        return "SkuDetails: ".concat(String.valueOf(this.f25779zza));
    }

    public int zza() {
        return this.f25780zzb.optInt("offer_type");
    }

    @NonNull
    public String zzb() {
        return this.f25780zzb.optString("offer_id");
    }

    @NonNull
    public String zzc() {
        JSONObject jSONObject = this.f25780zzb;
        String strOptString = jSONObject.optString("offerIdToken");
        return strOptString.isEmpty() ? jSONObject.optString("offer_id_token") : strOptString;
    }

    @NonNull
    public final String zzd() {
        return this.f25780zzb.optString("packageName");
    }

    @NonNull
    public String zze() {
        return this.f25780zzb.optString("serializedDocid");
    }

    public final String zzf() {
        return this.f25780zzb.optString("skuDetailsToken");
    }
}
