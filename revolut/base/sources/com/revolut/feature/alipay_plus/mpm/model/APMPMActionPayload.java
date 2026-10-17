package com.revolut.feature.alipay_plus.mpm.model;

import com.revolut.feature.alipay_plus.mpm.support.APMPMJson;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.d0;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\b\u0080\b\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0017\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007HÆ\u0003JC\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00112\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u001f\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u001e"}, d2 = {"Lcom/revolut/feature/alipay_plus/mpm/model/APMPMActionPayload;", "", "actionType", "", "redirectUrl", "title", "rawPayload", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "getActionType", "()Ljava/lang/String;", "getRedirectUrl", "getTitle", "getRawPayload", "()Ljava/util/Map;", "isOpenUrl", "", "()Z", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "Companion", "feature_alipay_plus_nonsdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class APMPMActionPayload {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final String actionType;
    private final boolean isOpenUrl;

    @NotNull
    private final Map<String, Object> rawPayload;
    private final String redirectUrl;
    private final String title;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0000¢\u0006\u0002\b\bJ\u0019\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005H\u0000¢\u0006\u0002\b\fJ\u0015\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000fH\u0000¢\u0006\u0002\b\u0010¨\u0006\u0011"}, d2 = {"Lcom/revolut/feature/alipay_plus/mpm/model/APMPMActionPayload$Companion;", "", "<init>", "()V", "toJson", "", "actionType", "redirectUrl", "toJson$feature_alipay_plus_nonsdk_release", "fromJson", "Lcom/revolut/feature/alipay_plus/mpm/model/APMPMActionPayload;", "json", "fromJson$feature_alipay_plus_nonsdk_release", "fromJsonObject", "raw", "Lorg/json/JSONObject;", "fromJsonObject$feature_alipay_plus_nonsdk_release", "feature_alipay_plus_nonsdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final APMPMActionPayload fromJson$feature_alipay_plus_nonsdk_release(String json) {
            JSONObject object = APMPMJson.INSTANCE.parseObject(json);
            if (object != null) {
                return fromJsonObject$feature_alipay_plus_nonsdk_release(object);
            }
            return null;
        }

        @NotNull
        public final APMPMActionPayload fromJsonObject$feature_alipay_plus_nonsdk_release(@NotNull JSONObject raw) {
            Intrinsics.checkNotNullParameter(raw, "raw");
            String strOptString = raw.optString("sdkActionType", raw.optString("actionType"));
            APMPMJson aPMPMJson = APMPMJson.INSTANCE;
            String strFirstNonBlank = aPMPMJson.firstNonBlank(raw.optString("redirectUrl"), raw.optString("redirectURL"), raw.optString("url"));
            Intrinsics.h(strOptString);
            String strOptString2 = raw.optString("title");
            Intrinsics.h(strOptString2);
            if (d0.W(strOptString2)) {
                strOptString2 = null;
            }
            return new APMPMActionPayload(strOptString, strFirstNonBlank, strOptString2, aPMPMJson.toMap(raw));
        }

        @NotNull
        public final String toJson$feature_alipay_plus_nonsdk_release(@NotNull String actionType, @NotNull String redirectUrl) {
            Intrinsics.checkNotNullParameter(actionType, "actionType");
            Intrinsics.checkNotNullParameter(redirectUrl, "redirectUrl");
            String string = new JSONObject().put("sdkActionType", actionType).put("redirectUrl", redirectUrl).toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            return string;
        }

        private Companion() {
        }
    }

    public APMPMActionPayload(@NotNull String actionType, String str, String str2, @NotNull Map<String, ? extends Object> rawPayload) {
        Intrinsics.checkNotNullParameter(actionType, "actionType");
        Intrinsics.checkNotNullParameter(rawPayload, "rawPayload");
        this.actionType = actionType;
        this.redirectUrl = str;
        this.title = str2;
        this.rawPayload = rawPayload;
        this.isOpenUrl = (!a0.z(actionType, "OPEN_URL", true) || str == null || d0.W(str)) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ APMPMActionPayload copy$default(APMPMActionPayload aPMPMActionPayload, String str, String str2, String str3, Map map, int i, Object obj2) {
        if ((i & 1) != 0) {
            str = aPMPMActionPayload.actionType;
        }
        if ((i & 2) != 0) {
            str2 = aPMPMActionPayload.redirectUrl;
        }
        if ((i & 4) != 0) {
            str3 = aPMPMActionPayload.title;
        }
        if ((i & 8) != 0) {
            map = aPMPMActionPayload.rawPayload;
        }
        return aPMPMActionPayload.copy(str, str2, str3, map);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getActionType() {
        return this.actionType;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getRedirectUrl() {
        return this.redirectUrl;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    public final Map<String, Object> component4() {
        return this.rawPayload;
    }

    @NotNull
    public final APMPMActionPayload copy(@NotNull String actionType, String redirectUrl, String title, @NotNull Map<String, ? extends Object> rawPayload) {
        Intrinsics.checkNotNullParameter(actionType, "actionType");
        Intrinsics.checkNotNullParameter(rawPayload, "rawPayload");
        return new APMPMActionPayload(actionType, redirectUrl, title, rawPayload);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof APMPMActionPayload)) {
            return false;
        }
        APMPMActionPayload aPMPMActionPayload = (APMPMActionPayload) other;
        return Intrinsics.f(this.actionType, aPMPMActionPayload.actionType) && Intrinsics.f(this.redirectUrl, aPMPMActionPayload.redirectUrl) && Intrinsics.f(this.title, aPMPMActionPayload.title) && Intrinsics.f(this.rawPayload, aPMPMActionPayload.rawPayload);
    }

    @NotNull
    public final String getActionType() {
        return this.actionType;
    }

    @NotNull
    public final Map<String, Object> getRawPayload() {
        return this.rawPayload;
    }

    public final String getRedirectUrl() {
        return this.redirectUrl;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iHashCode = this.actionType.hashCode() * 31;
        String str = this.redirectUrl;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.title;
        return this.rawPayload.hashCode() + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    /* JADX INFO: renamed from: isOpenUrl, reason: from getter */
    public final boolean getIsOpenUrl() {
        return this.isOpenUrl;
    }
}
