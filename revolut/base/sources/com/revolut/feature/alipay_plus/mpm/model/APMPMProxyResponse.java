package com.revolut.feature.alipay_plus.mpm.model;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B'\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u000e\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\n¨\u0006\u0010"}, d2 = {"Lcom/revolut/feature/alipay_plus/mpm/model/APMPMProxyResponse;", "", "sdkResponseHeader", "Lorg/json/JSONObject;", "sdkResponseData", "resultError", "Lcom/revolut/feature/alipay_plus/mpm/model/APMPMError;", "<init>", "(Lorg/json/JSONObject;Lorg/json/JSONObject;Lcom/revolut/feature/alipay_plus/mpm/model/APMPMError;)V", "getSdkResponseHeader", "()Lorg/json/JSONObject;", "getSdkResponseData", "getResultError", "()Lcom/revolut/feature/alipay_plus/mpm/model/APMPMError;", "primaryData", "getPrimaryData", "feature_alipay_plus_nonsdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class APMPMProxyResponse {
    private final APMPMError resultError;

    @NotNull
    private final JSONObject sdkResponseData;

    @NotNull
    private final JSONObject sdkResponseHeader;

    public APMPMProxyResponse() {
        this(null, null, null, 7, null);
    }

    @NotNull
    /* JADX INFO: renamed from: getPrimaryData, reason: from getter */
    public final JSONObject getSdkResponseData() {
        return this.sdkResponseData;
    }

    public final APMPMError getResultError() {
        return this.resultError;
    }

    @NotNull
    public final JSONObject getSdkResponseData() {
        return this.sdkResponseData;
    }

    @NotNull
    public final JSONObject getSdkResponseHeader() {
        return this.sdkResponseHeader;
    }

    public APMPMProxyResponse(@NotNull JSONObject sdkResponseHeader, @NotNull JSONObject sdkResponseData, APMPMError aPMPMError) {
        Intrinsics.checkNotNullParameter(sdkResponseHeader, "sdkResponseHeader");
        Intrinsics.checkNotNullParameter(sdkResponseData, "sdkResponseData");
        this.sdkResponseHeader = sdkResponseHeader;
        this.sdkResponseData = sdkResponseData;
        this.resultError = aPMPMError;
    }

    public /* synthetic */ APMPMProxyResponse(JSONObject jSONObject, JSONObject jSONObject2, APMPMError aPMPMError, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new JSONObject() : jSONObject, (i & 2) != 0 ? new JSONObject() : jSONObject2, (i & 4) != 0 ? null : aPMPMError);
    }
}
