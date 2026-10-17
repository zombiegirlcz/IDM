package com.revolut.feature.alipay_plus.mpm.interception;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONObject;
import p.a;
import yhm.m;
import yhm.n;
import yhm.o;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0080\b\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001c"}, d2 = {"Lcom/revolut/feature/alipay_plus/mpm/interception/APMPMHookUrlConfig;", "", "hookType", "", "matchType", "matchRule", "mappingParams", "Lcom/revolut/feature/alipay_plus/mpm/interception/APMPMHookUrlMappingParams;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/revolut/feature/alipay_plus/mpm/interception/APMPMHookUrlMappingParams;)V", "getHookType", "()Ljava/lang/String;", "getMatchType", "getMatchRule", "getMappingParams", "()Lcom/revolut/feature/alipay_plus/mpm/interception/APMPMHookUrlMappingParams;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "feature_alipay_plus_nonsdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class APMPMHookUrlConfig {

    @NotNull
    private final String hookType;

    @NotNull
    private final APMPMHookUrlMappingParams mappingParams;

    @NotNull
    private final String matchRule;

    @NotNull
    private final String matchType;

    @NotNull
    public static final String AUTH_URL = "AUTH_URL";

    @NotNull
    public static final String REGEX = "REGEX";

    @NotNull
    public static final String CONTAIN = "CONTAIN";

    @NotNull
    public static final String PRE_CREATE_ORDER_DECODE_URL = "PRE_CREATE_ORDER_DECODE_URL";

    @NotNull
    public static final String DOWNGRADE_URL = "DOWNGRADE_URL";

    @NotNull
    public static final String DECODE_URL = "DECODE_URL";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/revolut/feature/alipay_plus/mpm/interception/APMPMHookUrlConfig$Companion;", "", "<init>", "()V", "AUTH_URL", "", "CONTAIN", "DECODE_URL", "REGEX", "DOWNGRADE_URL", "PRE_CREATE_ORDER_DECODE_URL", "parse", "", "Lcom/revolut/feature/alipay_plus/mpm/interception/APMPMHookUrlConfig;", "json", "feature_alipay_plus_nonsdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final List<APMPMHookUrlConfig> parse(@NotNull String json) {
            Object objA;
            Intrinsics.checkNotNullParameter(json, "json");
            ArrayList arrayList = new ArrayList();
            try {
                m.Companion companion = m.INSTANCE;
                objA = new JSONArray(json);
            } catch (Throwable th10) {
                m.Companion companion2 = m.INSTANCE;
                objA = o.a(th10);
            }
            if (objA instanceof n) {
                objA = null;
            }
            JSONArray jSONArray = (JSONArray) objA;
            if (jSONArray != null) {
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
                    if (jSONObjectOptJSONObject != null) {
                        String strOptString = jSONObjectOptJSONObject.optString("hookType");
                        Intrinsics.checkNotNullExpressionValue(strOptString, "optString(...)");
                        String strOptString2 = jSONObjectOptJSONObject.optString("matchType");
                        Intrinsics.checkNotNullExpressionValue(strOptString2, "optString(...)");
                        String strOptString3 = jSONObjectOptJSONObject.optString("matchRule");
                        Intrinsics.checkNotNullExpressionValue(strOptString3, "optString(...)");
                        arrayList.add(new APMPMHookUrlConfig(strOptString, strOptString2, strOptString3, APMPMHookUrlMappingParams.INSTANCE.fromJson(jSONObjectOptJSONObject.optString("mappingParams"))));
                    }
                }
            }
            return arrayList;
        }

        private Companion() {
        }
    }

    public APMPMHookUrlConfig(@NotNull String hookType, @NotNull String matchType, @NotNull String matchRule, @NotNull APMPMHookUrlMappingParams mappingParams) {
        Intrinsics.checkNotNullParameter(hookType, "hookType");
        Intrinsics.checkNotNullParameter(matchType, "matchType");
        Intrinsics.checkNotNullParameter(matchRule, "matchRule");
        Intrinsics.checkNotNullParameter(mappingParams, "mappingParams");
        this.hookType = hookType;
        this.matchType = matchType;
        this.matchRule = matchRule;
        this.mappingParams = mappingParams;
    }

    public static /* synthetic */ APMPMHookUrlConfig copy$default(APMPMHookUrlConfig aPMPMHookUrlConfig, String str, String str2, String str3, APMPMHookUrlMappingParams aPMPMHookUrlMappingParams, int i, Object obj2) {
        if ((i & 1) != 0) {
            str = aPMPMHookUrlConfig.hookType;
        }
        if ((i & 2) != 0) {
            str2 = aPMPMHookUrlConfig.matchType;
        }
        if ((i & 4) != 0) {
            str3 = aPMPMHookUrlConfig.matchRule;
        }
        if ((i & 8) != 0) {
            aPMPMHookUrlMappingParams = aPMPMHookUrlConfig.mappingParams;
        }
        return aPMPMHookUrlConfig.copy(str, str2, str3, aPMPMHookUrlMappingParams);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getHookType() {
        return this.hookType;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMatchType() {
        return this.matchType;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getMatchRule() {
        return this.matchRule;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final APMPMHookUrlMappingParams getMappingParams() {
        return this.mappingParams;
    }

    @NotNull
    public final APMPMHookUrlConfig copy(@NotNull String hookType, @NotNull String matchType, @NotNull String matchRule, @NotNull APMPMHookUrlMappingParams mappingParams) {
        Intrinsics.checkNotNullParameter(hookType, "hookType");
        Intrinsics.checkNotNullParameter(matchType, "matchType");
        Intrinsics.checkNotNullParameter(matchRule, "matchRule");
        Intrinsics.checkNotNullParameter(mappingParams, "mappingParams");
        return new APMPMHookUrlConfig(hookType, matchType, matchRule, mappingParams);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof APMPMHookUrlConfig)) {
            return false;
        }
        APMPMHookUrlConfig aPMPMHookUrlConfig = (APMPMHookUrlConfig) other;
        return Intrinsics.f(this.hookType, aPMPMHookUrlConfig.hookType) && Intrinsics.f(this.matchType, aPMPMHookUrlConfig.matchType) && Intrinsics.f(this.matchRule, aPMPMHookUrlConfig.matchRule) && Intrinsics.f(this.mappingParams, aPMPMHookUrlConfig.mappingParams);
    }

    @NotNull
    public final String getHookType() {
        return this.hookType;
    }

    @NotNull
    public final APMPMHookUrlMappingParams getMappingParams() {
        return this.mappingParams;
    }

    @NotNull
    public final String getMatchRule() {
        return this.matchRule;
    }

    @NotNull
    public final String getMatchType() {
        return this.matchType;
    }

    public int hashCode() {
        return this.mappingParams.hashCode() + a.c(a.c(this.hookType.hashCode() * 31, 31, this.matchType), 31, this.matchRule);
    }
}
