package com.revolut.feature.alipay_plus.mpm.model;

import com.revolut.feature.alipay_plus.mpm.support.APMPMJson;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;
import zhm.d0;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\f\u001a\u00020\u0005J\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000eJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0019"}, d2 = {"Lcom/revolut/feature/alipay_plus/mpm/model/APMPMProxyRequest;", "", "operationType", "", "sdkRequestData", "Lorg/json/JSONObject;", "<init>", "(Ljava/lang/String;Lorg/json/JSONObject;)V", "getOperationType", "()Ljava/lang/String;", "getSdkRequestData", "()Lorg/json/JSONObject;", "bodyJson", "bodyMap", "", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "feature_alipay_plus_nonsdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class APMPMProxyRequest {

    @NotNull
    private final String operationType;

    @NotNull
    private final JSONObject sdkRequestData;

    @NotNull
    public static final String OP_GET_AUTH_CODE = "alipay.aps.extensions.getAuthCode";

    @NotNull
    public static final String OP_FETCH_CONFIG = "alipay.aps.extensions.fetchConfig";

    @NotNull
    public static final String OAUTH_TYPE_JS_API = "JS_API";

    @NotNull
    public static final String OP_INQUIRE_QUOTE = "alipay.aps.payments.inquiryForeignExchangeQuote";

    @NotNull
    public static final String OAUTH_TYPE_OAUTH_URL = "OAUTH_URL";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J<\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u00052\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0005J\u0016\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0005J\u0006\u0010\u0015\u001a\u00020\u000bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/revolut/feature/alipay_plus/mpm/model/APMPMProxyRequest$Companion;", "", "<init>", "()V", "OP_GET_AUTH_CODE", "", "OP_INQUIRE_QUOTE", "OP_FETCH_CONFIG", "OAUTH_TYPE_JS_API", "OAUTH_TYPE_OAUTH_URL", "getAuthCode", "Lcom/revolut/feature/alipay_plus/mpm/model/APMPMProxyRequest;", "oauthType", "authClientId", "scopes", "", "acquirerId", "acquirerAuthUrl", "inquireQuote", "buyCurrency", "sellCurrency", "fetchConfig", "feature_alipay_plus_nonsdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ APMPMProxyRequest getAuthCode$default(Companion companion, String str, String str2, List list, String str3, String str4, int i, Object obj2) {
            if ((i & 8) != 0) {
                str3 = null;
            }
            if ((i & 16) != 0) {
                str4 = null;
            }
            return companion.getAuthCode(str, str2, list, str3, str4);
        }

        @NotNull
        public final APMPMProxyRequest fetchConfig() {
            return new APMPMProxyRequest("alipay.aps.extensions.fetchConfig", new JSONObject());
        }

        @NotNull
        public final APMPMProxyRequest getAuthCode(@NotNull String oauthType, @NotNull String authClientId, @NotNull List<String> scopes, String acquirerId, String acquirerAuthUrl) throws JSONException {
            Intrinsics.checkNotNullParameter(oauthType, "oauthType");
            Intrinsics.checkNotNullParameter(authClientId, "authClientId");
            Intrinsics.checkNotNullParameter(scopes, "scopes");
            JSONObject jSONObjectPut = new JSONObject().put("oauthType", oauthType).put("authClientId", authClientId).put("scopes", d0.k0(scopes, ",", null, null, 0, null, 62));
            if (acquirerId != null) {
                if (kotlin.text.d0.W(acquirerId)) {
                    acquirerId = null;
                }
                if (acquirerId != null) {
                    jSONObjectPut.put("acquirerId", acquirerId);
                }
            }
            if (acquirerAuthUrl != null) {
                if (kotlin.text.d0.W(acquirerAuthUrl)) {
                    acquirerAuthUrl = null;
                }
                if (acquirerAuthUrl != null) {
                    jSONObjectPut.put("acquirerAuthUrl", acquirerAuthUrl);
                }
            }
            Intrinsics.h(jSONObjectPut);
            return new APMPMProxyRequest("alipay.aps.extensions.getAuthCode", jSONObjectPut);
        }

        @NotNull
        public final APMPMProxyRequest inquireQuote(@NotNull String buyCurrency, @NotNull String sellCurrency) throws JSONException {
            Intrinsics.checkNotNullParameter(buyCurrency, "buyCurrency");
            Intrinsics.checkNotNullParameter(sellCurrency, "sellCurrency");
            JSONObject jSONObjectPut = new JSONObject().put("buyCurrency", buyCurrency).put("sellCurrency", sellCurrency).put("quoteCurrencyPair", buyCurrency + "/" + sellCurrency);
            Intrinsics.checkNotNullExpressionValue(jSONObjectPut, "put(...)");
            return new APMPMProxyRequest("alipay.aps.payments.inquiryForeignExchangeQuote", jSONObjectPut);
        }

        private Companion() {
        }
    }

    public APMPMProxyRequest(@NotNull String operationType, @NotNull JSONObject sdkRequestData) {
        Intrinsics.checkNotNullParameter(operationType, "operationType");
        Intrinsics.checkNotNullParameter(sdkRequestData, "sdkRequestData");
        this.operationType = operationType;
        this.sdkRequestData = sdkRequestData;
    }

    public static /* synthetic */ APMPMProxyRequest copy$default(APMPMProxyRequest aPMPMProxyRequest, String str, JSONObject jSONObject, int i, Object obj2) {
        if ((i & 1) != 0) {
            str = aPMPMProxyRequest.operationType;
        }
        if ((i & 2) != 0) {
            jSONObject = aPMPMProxyRequest.sdkRequestData;
        }
        return aPMPMProxyRequest.copy(str, jSONObject);
    }

    @NotNull
    public final JSONObject bodyJson() throws JSONException {
        JSONObject jSONObjectPut = new JSONObject().put("sdkRequestHeader", new JSONObject().put("Operation-Type", this.operationType).put("Content-Type", "application/json").put("apiType", "API_TYPE_APS").toString()).put("sdkRequestData", this.sdkRequestData.toString());
        Intrinsics.checkNotNullExpressionValue(jSONObjectPut, "put(...)");
        return jSONObjectPut;
    }

    @NotNull
    public final Map<String, Object> bodyMap() {
        return APMPMJson.INSTANCE.toMap(bodyJson());
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getOperationType() {
        return this.operationType;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final JSONObject getSdkRequestData() {
        return this.sdkRequestData;
    }

    @NotNull
    public final APMPMProxyRequest copy(@NotNull String operationType, @NotNull JSONObject sdkRequestData) {
        Intrinsics.checkNotNullParameter(operationType, "operationType");
        Intrinsics.checkNotNullParameter(sdkRequestData, "sdkRequestData");
        return new APMPMProxyRequest(operationType, sdkRequestData);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof APMPMProxyRequest)) {
            return false;
        }
        APMPMProxyRequest aPMPMProxyRequest = (APMPMProxyRequest) other;
        return Intrinsics.f(this.operationType, aPMPMProxyRequest.operationType) && Intrinsics.f(this.sdkRequestData, aPMPMProxyRequest.sdkRequestData);
    }

    @NotNull
    public final String getOperationType() {
        return this.operationType;
    }

    @NotNull
    public final JSONObject getSdkRequestData() {
        return this.sdkRequestData;
    }

    public int hashCode() {
        return this.sdkRequestData.hashCode() + (this.operationType.hashCode() * 31);
    }
}
