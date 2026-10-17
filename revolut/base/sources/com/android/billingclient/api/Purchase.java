package com.android.billingclient.api;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes16.dex */
public class Purchase {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final String f25760zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final String f25761zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private final JSONObject f25762zzc;

    @zzu
    public static final class PendingPurchaseUpdate {
        private final JSONObject mParsedJson;

        private PendingPurchaseUpdate(JSONObject jSONObject) {
            this.mParsedJson = jSONObject;
        }

        @NonNull
        public List<String> getProducts() {
            JSONArray jSONArrayOptJSONArray;
            ArrayList arrayList = new ArrayList();
            if (this.mParsedJson.has("productIds") && (jSONArrayOptJSONArray = this.mParsedJson.optJSONArray("productIds")) != null) {
                for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                    arrayList.add(jSONArrayOptJSONArray.optString(i));
                }
            }
            return arrayList;
        }

        @NonNull
        public String getPurchaseToken() {
            return this.mParsedJson.optString("purchaseToken");
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface PurchaseState {
        public static final int PENDING = 2;
        public static final int PURCHASED = 1;
        public static final int UNSPECIFIED_STATE = 0;
    }

    public Purchase(@NonNull String str, @NonNull String str2) throws JSONException {
        this.f25760zza = str;
        this.f25761zzb = str2;
        this.f25762zzc = new JSONObject(str);
    }

    private final ArrayList zza() {
        ArrayList arrayList = new ArrayList();
        JSONObject jSONObject = this.f25762zzc;
        if (jSONObject.has("productIds")) {
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("productIds");
            if (jSONArrayOptJSONArray != null) {
                for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                    arrayList.add(jSONArrayOptJSONArray.optString(i));
                }
            }
        } else if (jSONObject.has("productId")) {
            arrayList.add(jSONObject.optString("productId"));
        }
        return arrayList;
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof Purchase)) {
            return false;
        }
        Purchase purchase = (Purchase) obj2;
        return TextUtils.equals(this.f25760zza, purchase.getOriginalJson()) && TextUtils.equals(this.f25761zzb, purchase.getSignature());
    }

    public AccountIdentifiers getAccountIdentifiers() {
        JSONObject jSONObject = this.f25762zzc;
        String strOptString = jSONObject.optString("obfuscatedAccountId");
        String strOptString2 = jSONObject.optString("obfuscatedProfileId");
        if (strOptString == null && strOptString2 == null) {
            return null;
        }
        return new AccountIdentifiers(strOptString, strOptString2);
    }

    @NonNull
    public String getDeveloperPayload() {
        return this.f25762zzc.optString("developerPayload");
    }

    public String getOrderId() {
        String strOptString = this.f25762zzc.optString("orderId");
        if (TextUtils.isEmpty(strOptString)) {
            return null;
        }
        return strOptString;
    }

    @NonNull
    public String getOriginalJson() {
        return this.f25760zza;
    }

    @NonNull
    public String getPackageName() {
        return this.f25762zzc.optString("packageName");
    }

    @zzu
    public PendingPurchaseUpdate getPendingPurchaseUpdate() {
        JSONObject jSONObjectOptJSONObject = this.f25762zzc.optJSONObject("pendingPurchaseUpdate");
        if (jSONObjectOptJSONObject == null) {
            return null;
        }
        return new PendingPurchaseUpdate(jSONObjectOptJSONObject);
    }

    @NonNull
    public List<String> getProducts() {
        return zza();
    }

    public int getPurchaseState() {
        return this.f25762zzc.optInt("purchaseState", 1) != 4 ? 1 : 2;
    }

    public long getPurchaseTime() {
        return this.f25762zzc.optLong("purchaseTime");
    }

    @NonNull
    public String getPurchaseToken() {
        JSONObject jSONObject = this.f25762zzc;
        return jSONObject.optString("token", jSONObject.optString("purchaseToken"));
    }

    public int getQuantity() {
        return this.f25762zzc.optInt("quantity", 1);
    }

    @NonNull
    public String getSignature() {
        return this.f25761zzb;
    }

    @NonNull
    @Deprecated
    public ArrayList<String> getSkus() {
        return zza();
    }

    public int hashCode() {
        return this.f25760zza.hashCode();
    }

    public boolean isAcknowledged() {
        return this.f25762zzc.optBoolean("acknowledged", true);
    }

    public boolean isAutoRenewing() {
        return this.f25762zzc.optBoolean("autoRenewing");
    }

    public boolean isSuspended() {
        return this.f25762zzc.optBoolean("suspended");
    }

    @NonNull
    public String toString() {
        return "Purchase. Json: ".concat(String.valueOf(this.f25760zza));
    }
}
