package com.revolut.feature.alipay_plus.mpm.model;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0006\u0010\n\u001a\u00020\u000bJ\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0016"}, d2 = {"Lcom/revolut/feature/alipay_plus/mpm/model/APMPMAcceptanceMarkLogo;", "", "logoName", "", "logoUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getLogoName", "()Ljava/lang/String;", "getLogoUrl", "toJson", "Lorg/json/JSONObject;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "feature_alipay_plus_nonsdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class APMPMAcceptanceMarkLogo {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final String logoName;
    private final String logoUrl;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/feature/alipay_plus/mpm/model/APMPMAcceptanceMarkLogo$Companion;", "", "<init>", "()V", "fromJson", "Lcom/revolut/feature/alipay_plus/mpm/model/APMPMAcceptanceMarkLogo;", "json", "Lorg/json/JSONObject;", "feature_alipay_plus_nonsdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final APMPMAcceptanceMarkLogo fromJson(@NotNull JSONObject json) {
            Intrinsics.checkNotNullParameter(json, "json");
            String strOptString = json.optString("logoUrl");
            if (d0.W(strOptString)) {
                strOptString = json.optString("logoURL");
            }
            Intrinsics.h(strOptString);
            if (d0.W(strOptString)) {
                strOptString = null;
            }
            if (strOptString == null) {
                return null;
            }
            String strOptString2 = json.optString("logoName");
            Intrinsics.h(strOptString2);
            return new APMPMAcceptanceMarkLogo(d0.W(strOptString2) ? null : strOptString2, strOptString);
        }

        private Companion() {
        }
    }

    public APMPMAcceptanceMarkLogo(String str, String str2) {
        this.logoName = str;
        this.logoUrl = str2;
    }

    public static /* synthetic */ APMPMAcceptanceMarkLogo copy$default(APMPMAcceptanceMarkLogo aPMPMAcceptanceMarkLogo, String str, String str2, int i, Object obj2) {
        if ((i & 1) != 0) {
            str = aPMPMAcceptanceMarkLogo.logoName;
        }
        if ((i & 2) != 0) {
            str2 = aPMPMAcceptanceMarkLogo.logoUrl;
        }
        return aPMPMAcceptanceMarkLogo.copy(str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getLogoName() {
        return this.logoName;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getLogoUrl() {
        return this.logoUrl;
    }

    @NotNull
    public final APMPMAcceptanceMarkLogo copy(String logoName, String logoUrl) {
        return new APMPMAcceptanceMarkLogo(logoName, logoUrl);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof APMPMAcceptanceMarkLogo)) {
            return false;
        }
        APMPMAcceptanceMarkLogo aPMPMAcceptanceMarkLogo = (APMPMAcceptanceMarkLogo) other;
        return Intrinsics.f(this.logoName, aPMPMAcceptanceMarkLogo.logoName) && Intrinsics.f(this.logoUrl, aPMPMAcceptanceMarkLogo.logoUrl);
    }

    public final String getLogoName() {
        return this.logoName;
    }

    public final String getLogoUrl() {
        return this.logoUrl;
    }

    public int hashCode() {
        String str = this.logoName;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.logoUrl;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public final JSONObject toJson() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        String str = this.logoName;
        if (str != null) {
            if (d0.W(str)) {
                str = null;
            }
            if (str != null) {
                jSONObject.put("logoName", str);
            }
        }
        String str2 = this.logoUrl;
        if (str2 != null) {
            String str3 = d0.W(str2) ? null : str2;
            if (str3 != null) {
                jSONObject.put("logoUrl", str3);
            }
        }
        return jSONObject;
    }
}
