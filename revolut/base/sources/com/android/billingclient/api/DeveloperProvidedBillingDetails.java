package com.android.billingclient.api;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import v0.a;

/* JADX INFO: loaded from: classes16.dex */
@zzl
public final class DeveloperProvidedBillingDetails {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final String f25681zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final JSONObject f25682zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private final List f25683zzc;

    @zzl
    public static class Product {

        /* JADX INFO: renamed from: zza, reason: collision with root package name */
        private final String f25684zza;

        /* JADX INFO: renamed from: zzb, reason: collision with root package name */
        private final String f25685zzb;

        /* JADX INFO: renamed from: zzc, reason: collision with root package name */
        private final String f25686zzc;

        public /* synthetic */ Product(JSONObject jSONObject, zzdj zzdjVar) {
            this.f25684zza = jSONObject.optString("productId");
            this.f25685zzb = jSONObject.optString("productType");
            String strOptString = jSONObject.optString("offerToken");
            this.f25686zzc = true == strOptString.isEmpty() ? null : strOptString;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Product)) {
                return false;
            }
            Product product = (Product) obj2;
            return this.f25684zza.equals(product.getId()) && this.f25685zzb.equals(product.getType()) && Objects.equals(this.f25686zzc, product.getOfferToken());
        }

        @NonNull
        public String getId() {
            return this.f25684zza;
        }

        public String getOfferToken() {
            return this.f25686zzc;
        }

        @NonNull
        public String getType() {
            return this.f25685zzb;
        }

        public int hashCode() {
            return Objects.hash(this.f25684zza, this.f25685zzb, this.f25686zzc);
        }

        @NonNull
        public String toString() {
            String str = this.f25684zza;
            String str2 = this.f25685zzb;
            return a.i(a.m("{id: ", str, ", type: ", str2, ", offer token: "), this.f25686zzc, "}");
        }
    }

    public DeveloperProvidedBillingDetails(String str) throws JSONException {
        this.f25681zza = str;
        JSONObject jSONObject = new JSONObject(str);
        this.f25682zzb = jSONObject;
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("products");
        ArrayList arrayList = new ArrayList();
        if (jSONArrayOptJSONArray != null) {
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
                if (jSONObjectOptJSONObject != null) {
                    arrayList.add(new Product(jSONObjectOptJSONObject, null));
                }
            }
        }
        this.f25683zzc = arrayList;
    }

    @NonNull
    public String getLinkUri() {
        return this.f25682zzb.optString("linkUri");
    }

    public String getOriginalExternalTransactionId() {
        String strOptString = this.f25682zzb.optString("originalExternalTransactionId");
        if (strOptString.isEmpty()) {
            return null;
        }
        return strOptString;
    }

    @NonNull
    public List<Product> getProducts() {
        return this.f25683zzc;
    }
}
