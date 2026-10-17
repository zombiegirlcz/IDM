package com.android.billingclient.api;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import j6.a;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes16.dex */
@zzv
public final class UnfetchedProduct {
    private final String jsonString;
    private final String productId;
    private final String productType;
    private final String serializedDocid;
    private final int statusCode;

    @Retention(RetentionPolicy.SOURCE)
    public @interface StatusCode {

        @zzv
        public static final int INVALID_PRODUCT_ID_FORMAT = 2;

        @zzv
        public static final int NO_ELIGIBLE_OFFER = 4;

        @zzv
        public static final int PRODUCT_NOT_FOUND = 3;

        @zzv
        public static final int UNKNOWN = 0;
    }

    public UnfetchedProduct(String str) throws JSONException {
        this.jsonString = str;
        JSONObject jSONObject = new JSONObject(str);
        this.productId = jSONObject.optString("productId");
        String strOptString = jSONObject.optString("type");
        this.productType = strOptString;
        this.statusCode = jSONObject.has("statusCode") ? jSONObject.optInt("statusCode") : 0;
        if (TextUtils.isEmpty(strOptString)) {
            throw new IllegalArgumentException("Product type cannot be empty.");
        }
        this.serializedDocid = jSONObject.optString("serializedDocid");
    }

    @NonNull
    public static UnfetchedProduct fromJson(@NonNull String str) throws JSONException {
        return new UnfetchedProduct(str);
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (obj2 instanceof UnfetchedProduct) {
            return TextUtils.equals(this.jsonString, ((UnfetchedProduct) obj2).jsonString);
        }
        return false;
    }

    @NonNull
    @zzv
    public String getProductId() {
        return this.productId;
    }

    @NonNull
    @zzv
    public String getProductType() {
        return this.productType;
    }

    public String getSerializedDocid() {
        return this.serializedDocid;
    }

    @zzv
    public int getStatusCode() {
        return this.statusCode;
    }

    public int hashCode() {
        return this.jsonString.hashCode();
    }

    @NonNull
    public String toString() {
        StringBuilder sb6 = new StringBuilder("UnfetchedProduct{productId='");
        sb6.append(this.productId);
        sb6.append("', productType='");
        sb6.append(this.productType);
        sb6.append("', statusCode=");
        return a.v(sb6, "}", this.statusCode);
    }
}
