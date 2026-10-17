package com.android.billingclient.api;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes16.dex */
public class PurchaseHistoryRecord {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final String f25763zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final String f25764zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private final JSONObject f25765zzc;

    public PurchaseHistoryRecord(@NonNull String str, @NonNull String str2) throws JSONException {
        this.f25763zza = str;
        this.f25764zzb = str2;
        this.f25765zzc = new JSONObject(str);
    }

    private final ArrayList zza() {
        ArrayList arrayList = new ArrayList();
        JSONObject jSONObject = this.f25765zzc;
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
        if (!(obj2 instanceof PurchaseHistoryRecord)) {
            return false;
        }
        PurchaseHistoryRecord purchaseHistoryRecord = (PurchaseHistoryRecord) obj2;
        return TextUtils.equals(this.f25763zza, purchaseHistoryRecord.getOriginalJson()) && TextUtils.equals(this.f25764zzb, purchaseHistoryRecord.getSignature());
    }

    @NonNull
    public String getDeveloperPayload() {
        return this.f25765zzc.optString("developerPayload");
    }

    @NonNull
    public String getOriginalJson() {
        return this.f25763zza;
    }

    @NonNull
    public List<String> getProducts() {
        return zza();
    }

    public long getPurchaseTime() {
        return this.f25765zzc.optLong("purchaseTime");
    }

    @NonNull
    public String getPurchaseToken() {
        JSONObject jSONObject = this.f25765zzc;
        return jSONObject.optString("token", jSONObject.optString("purchaseToken"));
    }

    public int getQuantity() {
        return this.f25765zzc.optInt("quantity", 1);
    }

    @NonNull
    public String getSignature() {
        return this.f25764zzb;
    }

    @NonNull
    @Deprecated
    public ArrayList<String> getSkus() {
        return zza();
    }

    public int hashCode() {
        return this.f25763zza.hashCode();
    }

    @NonNull
    public String toString() {
        return "PurchaseHistoryRecord. Json: ".concat(String.valueOf(this.f25763zza));
    }
}
