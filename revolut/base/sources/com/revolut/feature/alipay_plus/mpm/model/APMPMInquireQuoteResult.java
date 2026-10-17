package com.revolut.feature.alipay_plus.mpm.model;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0017"}, d2 = {"Lcom/revolut/feature/alipay_plus/mpm/model/APMPMInquireQuoteResult;", "", "quoteId", "", "quoteCurrencyPair", "quotePrice", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getQuoteId", "()Ljava/lang/String;", "getQuoteCurrencyPair", "getQuotePrice", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "feature_alipay_plus_nonsdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class APMPMInquireQuoteResult {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final String quoteCurrencyPair;
    private final String quoteId;
    private final String quotePrice;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/feature/alipay_plus/mpm/model/APMPMInquireQuoteResult$Companion;", "", "<init>", "()V", "fromProxyResponse", "Lcom/revolut/feature/alipay_plus/mpm/model/APMPMInquireQuoteResult;", "response", "Lcom/revolut/feature/alipay_plus/mpm/model/APMPMProxyResponse;", "feature_alipay_plus_nonsdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final APMPMInquireQuoteResult fromProxyResponse(@NotNull APMPMProxyResponse response) {
            Intrinsics.checkNotNullParameter(response, "response");
            JSONObject sdkResponseData = response.getSdkResponseData();
            JSONObject jSONObjectOptJSONObject = sdkResponseData.optJSONObject("foreignExchangeQuote");
            if (jSONObjectOptJSONObject != null) {
                sdkResponseData = jSONObjectOptJSONObject;
            }
            String strOptString = sdkResponseData.optString("quoteId");
            Intrinsics.h(strOptString);
            if (d0.W(strOptString)) {
                strOptString = null;
            }
            if (strOptString == null) {
                return null;
            }
            String strOptString2 = sdkResponseData.optString("quoteCurrencyPair");
            Intrinsics.h(strOptString2);
            if (d0.W(strOptString2)) {
                strOptString2 = null;
            }
            if (strOptString2 == null) {
                return null;
            }
            String strOptString3 = sdkResponseData.optString("quotePrice");
            Intrinsics.h(strOptString3);
            if (d0.W(strOptString3)) {
                strOptString3 = null;
            }
            if (strOptString3 == null) {
                return null;
            }
            return new APMPMInquireQuoteResult(strOptString, strOptString2, strOptString3);
        }

        private Companion() {
        }
    }

    public APMPMInquireQuoteResult(String str, String str2, String str3) {
        this.quoteId = str;
        this.quoteCurrencyPair = str2;
        this.quotePrice = str3;
    }

    public static /* synthetic */ APMPMInquireQuoteResult copy$default(APMPMInquireQuoteResult aPMPMInquireQuoteResult, String str, String str2, String str3, int i, Object obj2) {
        if ((i & 1) != 0) {
            str = aPMPMInquireQuoteResult.quoteId;
        }
        if ((i & 2) != 0) {
            str2 = aPMPMInquireQuoteResult.quoteCurrencyPair;
        }
        if ((i & 4) != 0) {
            str3 = aPMPMInquireQuoteResult.quotePrice;
        }
        return aPMPMInquireQuoteResult.copy(str, str2, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getQuoteId() {
        return this.quoteId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getQuoteCurrencyPair() {
        return this.quoteCurrencyPair;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getQuotePrice() {
        return this.quotePrice;
    }

    @NotNull
    public final APMPMInquireQuoteResult copy(String quoteId, String quoteCurrencyPair, String quotePrice) {
        return new APMPMInquireQuoteResult(quoteId, quoteCurrencyPair, quotePrice);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof APMPMInquireQuoteResult)) {
            return false;
        }
        APMPMInquireQuoteResult aPMPMInquireQuoteResult = (APMPMInquireQuoteResult) other;
        return Intrinsics.f(this.quoteId, aPMPMInquireQuoteResult.quoteId) && Intrinsics.f(this.quoteCurrencyPair, aPMPMInquireQuoteResult.quoteCurrencyPair) && Intrinsics.f(this.quotePrice, aPMPMInquireQuoteResult.quotePrice);
    }

    public final String getQuoteCurrencyPair() {
        return this.quoteCurrencyPair;
    }

    public final String getQuoteId() {
        return this.quoteId;
    }

    public final String getQuotePrice() {
        return this.quotePrice;
    }

    public int hashCode() {
        String str = this.quoteId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.quoteCurrencyPair;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.quotePrice;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }
}
