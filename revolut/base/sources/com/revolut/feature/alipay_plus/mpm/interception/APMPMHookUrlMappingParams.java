package com.revolut.feature.alipay_plus.mpm.interception;

import com.revolut.feature.alipay_plus.mpm.support.APMPMJson;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0080\b\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fBO\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003JQ\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006 "}, d2 = {"Lcom/revolut/feature/alipay_plus/mpm/interception/APMPMHookUrlMappingParams;", "", "acquireId", "", "codeParamKey", "loadingUrl", "redirectUrl", "queryParamKey", "codeParamRule", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAcquireId", "()Ljava/lang/String;", "getCodeParamKey", "getLoadingUrl", "getRedirectUrl", "getQueryParamKey", "getCodeParamRule", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "feature_alipay_plus_nonsdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class APMPMHookUrlMappingParams {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final String acquireId;
    private final String codeParamKey;
    private final String codeParamRule;
    private final String loadingUrl;
    private final String queryParamKey;
    private final String redirectUrl;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/feature/alipay_plus/mpm/interception/APMPMHookUrlMappingParams$Companion;", "", "<init>", "()V", "fromJson", "Lcom/revolut/feature/alipay_plus/mpm/interception/APMPMHookUrlMappingParams;", "json", "", "feature_alipay_plus_nonsdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final APMPMHookUrlMappingParams fromJson(String json) {
            JSONObject object = APMPMJson.INSTANCE.parseObject(json);
            if (object == null) {
                return new APMPMHookUrlMappingParams(null, null, null, null, null, null, 63, null);
            }
            String strOptString = object.optString("acquireId");
            Intrinsics.h(strOptString);
            String str = !d0.W(strOptString) ? strOptString : null;
            String strOptString2 = object.optString("codeParamKey");
            Intrinsics.h(strOptString2);
            String str2 = !d0.W(strOptString2) ? strOptString2 : null;
            String strOptString3 = object.optString("loadingUrl");
            Intrinsics.h(strOptString3);
            String str3 = !d0.W(strOptString3) ? strOptString3 : null;
            String strOptString4 = object.optString("redirectUrl");
            Intrinsics.h(strOptString4);
            String str4 = !d0.W(strOptString4) ? strOptString4 : null;
            String strOptString5 = object.optString("queryParamKey");
            Intrinsics.h(strOptString5);
            String str5 = !d0.W(strOptString5) ? strOptString5 : null;
            String strOptString6 = object.optString("codeParamRule");
            Intrinsics.h(strOptString6);
            return new APMPMHookUrlMappingParams(str, str2, str3, str4, str5, !d0.W(strOptString6) ? strOptString6 : null);
        }

        private Companion() {
        }
    }

    public APMPMHookUrlMappingParams() {
        this(null, null, null, null, null, null, 63, null);
    }

    public static /* synthetic */ APMPMHookUrlMappingParams copy$default(APMPMHookUrlMappingParams aPMPMHookUrlMappingParams, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj2) {
        if ((i & 1) != 0) {
            str = aPMPMHookUrlMappingParams.acquireId;
        }
        if ((i & 2) != 0) {
            str2 = aPMPMHookUrlMappingParams.codeParamKey;
        }
        if ((i & 4) != 0) {
            str3 = aPMPMHookUrlMappingParams.loadingUrl;
        }
        if ((i & 8) != 0) {
            str4 = aPMPMHookUrlMappingParams.redirectUrl;
        }
        if ((i & 16) != 0) {
            str5 = aPMPMHookUrlMappingParams.queryParamKey;
        }
        if ((i & 32) != 0) {
            str6 = aPMPMHookUrlMappingParams.codeParamRule;
        }
        String str7 = str5;
        String str8 = str6;
        return aPMPMHookUrlMappingParams.copy(str, str2, str3, str4, str7, str8);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAcquireId() {
        return this.acquireId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCodeParamKey() {
        return this.codeParamKey;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getLoadingUrl() {
        return this.loadingUrl;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getRedirectUrl() {
        return this.redirectUrl;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getQueryParamKey() {
        return this.queryParamKey;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getCodeParamRule() {
        return this.codeParamRule;
    }

    @NotNull
    public final APMPMHookUrlMappingParams copy(String acquireId, String codeParamKey, String loadingUrl, String redirectUrl, String queryParamKey, String codeParamRule) {
        return new APMPMHookUrlMappingParams(acquireId, codeParamKey, loadingUrl, redirectUrl, queryParamKey, codeParamRule);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof APMPMHookUrlMappingParams)) {
            return false;
        }
        APMPMHookUrlMappingParams aPMPMHookUrlMappingParams = (APMPMHookUrlMappingParams) other;
        return Intrinsics.f(this.acquireId, aPMPMHookUrlMappingParams.acquireId) && Intrinsics.f(this.codeParamKey, aPMPMHookUrlMappingParams.codeParamKey) && Intrinsics.f(this.loadingUrl, aPMPMHookUrlMappingParams.loadingUrl) && Intrinsics.f(this.redirectUrl, aPMPMHookUrlMappingParams.redirectUrl) && Intrinsics.f(this.queryParamKey, aPMPMHookUrlMappingParams.queryParamKey) && Intrinsics.f(this.codeParamRule, aPMPMHookUrlMappingParams.codeParamRule);
    }

    public final String getAcquireId() {
        return this.acquireId;
    }

    public final String getCodeParamKey() {
        return this.codeParamKey;
    }

    public final String getCodeParamRule() {
        return this.codeParamRule;
    }

    public final String getLoadingUrl() {
        return this.loadingUrl;
    }

    public final String getQueryParamKey() {
        return this.queryParamKey;
    }

    public final String getRedirectUrl() {
        return this.redirectUrl;
    }

    public int hashCode() {
        String str = this.acquireId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.codeParamKey;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.loadingUrl;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.redirectUrl;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.queryParamKey;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.codeParamRule;
        return iHashCode5 + (str6 != null ? str6.hashCode() : 0);
    }

    public APMPMHookUrlMappingParams(String str, String str2, String str3, String str4, String str5, String str6) {
        this.acquireId = str;
        this.codeParamKey = str2;
        this.loadingUrl = str3;
        this.redirectUrl = str4;
        this.queryParamKey = str5;
        this.codeParamRule = str6;
    }

    public /* synthetic */ APMPMHookUrlMappingParams(String str, String str2, String str3, String str4, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6);
    }
}
