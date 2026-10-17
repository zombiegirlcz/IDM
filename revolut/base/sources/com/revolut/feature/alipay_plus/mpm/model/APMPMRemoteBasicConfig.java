package com.revolut.feature.alipay_plus.mpm.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p.a;
import zhm.f0;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0080\b\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eBA\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0004\b\t\u0010\nJ\u0006\u0010\u0011\u001a\u00020\u0012J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003JC\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000e¨\u0006\u001f"}, d2 = {"Lcom/revolut/feature/alipay_plus/mpm/model/APMPMRemoteBasicConfig;", "", "regionDecidingFactor", "", "regionAcceptanceMarks", "", "Lcom/revolut/feature/alipay_plus/mpm/model/APMPMRegionAcceptanceMark;", "pspRegions", "availableRegions", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getRegionDecidingFactor", "()Ljava/lang/String;", "getRegionAcceptanceMarks", "()Ljava/util/List;", "getPspRegions", "getAvailableRegions", "toJson", "Lorg/json/JSONObject;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "feature_alipay_plus_nonsdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class APMPMRemoteBasicConfig {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final List<String> availableRegions;

    @NotNull
    private final List<String> pspRegions;

    @NotNull
    private final List<APMPMRegionAcceptanceMark> regionAcceptanceMarks;

    @NotNull
    private final String regionDecidingFactor;

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nJ\u0018\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0002J\u0018\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0002¨\u0006\u0012"}, d2 = {"Lcom/revolut/feature/alipay_plus/mpm/model/APMPMRemoteBasicConfig$Companion;", "", "<init>", "()V", "fromProxyResponse", "Lcom/revolut/feature/alipay_plus/mpm/model/APMPMRemoteBasicConfig;", "response", "Lcom/revolut/feature/alipay_plus/mpm/model/APMPMProxyResponse;", "fromJson", "json", "Lorg/json/JSONObject;", "parseMarks", "", "Lcom/revolut/feature/alipay_plus/mpm/model/APMPMRegionAcceptanceMark;", "array", "Lorg/json/JSONArray;", "parseStrings", "", "feature_alipay_plus_nonsdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final List<APMPMRegionAcceptanceMark> parseMarks(JSONArray array) {
            APMPMRegionAcceptanceMark aPMPMRegionAcceptanceMarkFromJson;
            if (array == null) {
                return f0.f322471a;
            }
            ArrayList arrayList = new ArrayList();
            int length = array.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObjectOptJSONObject = array.optJSONObject(i);
                if (jSONObjectOptJSONObject != null && (aPMPMRegionAcceptanceMarkFromJson = APMPMRegionAcceptanceMark.INSTANCE.fromJson(jSONObjectOptJSONObject)) != null) {
                    arrayList.add(aPMPMRegionAcceptanceMarkFromJson);
                }
            }
            return arrayList;
        }

        private final List<String> parseStrings(JSONArray array) {
            if (array == null) {
                return f0.f322471a;
            }
            ArrayList arrayList = new ArrayList();
            int length = array.length();
            for (int i = 0; i < length; i++) {
                String strOptString = array.optString(i);
                Intrinsics.h(strOptString);
                if (d0.W(strOptString)) {
                    strOptString = null;
                }
                if (strOptString != null) {
                    arrayList.add(strOptString);
                }
            }
            return arrayList;
        }

        @NotNull
        public final APMPMRemoteBasicConfig fromJson(@NotNull JSONObject json) {
            Intrinsics.checkNotNullParameter(json, "json");
            JSONObject jSONObjectOptJSONObject = json.optJSONObject("basicConfigs");
            if (jSONObjectOptJSONObject != null) {
                json = jSONObjectOptJSONObject;
            }
            String strOptString = json.optString("regionDecidingFactor");
            Intrinsics.checkNotNullExpressionValue(strOptString, "optString(...)");
            return new APMPMRemoteBasicConfig(strOptString, parseMarks(json.optJSONArray("regionAcceptanceMarks")), parseStrings(json.optJSONArray("pspRegions")), parseStrings(json.optJSONArray("availableRegions")));
        }

        @NotNull
        public final APMPMRemoteBasicConfig fromProxyResponse(@NotNull APMPMProxyResponse response) {
            Intrinsics.checkNotNullParameter(response, "response");
            return fromJson(response.getSdkResponseData());
        }

        private Companion() {
        }
    }

    public APMPMRemoteBasicConfig() {
        this(null, null, null, null, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ APMPMRemoteBasicConfig copy$default(APMPMRemoteBasicConfig aPMPMRemoteBasicConfig, String str, List list, List list2, List list3, int i, Object obj2) {
        if ((i & 1) != 0) {
            str = aPMPMRemoteBasicConfig.regionDecidingFactor;
        }
        if ((i & 2) != 0) {
            list = aPMPMRemoteBasicConfig.regionAcceptanceMarks;
        }
        if ((i & 4) != 0) {
            list2 = aPMPMRemoteBasicConfig.pspRegions;
        }
        if ((i & 8) != 0) {
            list3 = aPMPMRemoteBasicConfig.availableRegions;
        }
        return aPMPMRemoteBasicConfig.copy(str, list, list2, list3);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getRegionDecidingFactor() {
        return this.regionDecidingFactor;
    }

    @NotNull
    public final List<APMPMRegionAcceptanceMark> component2() {
        return this.regionAcceptanceMarks;
    }

    @NotNull
    public final List<String> component3() {
        return this.pspRegions;
    }

    @NotNull
    public final List<String> component4() {
        return this.availableRegions;
    }

    @NotNull
    public final APMPMRemoteBasicConfig copy(@NotNull String regionDecidingFactor, @NotNull List<APMPMRegionAcceptanceMark> regionAcceptanceMarks, @NotNull List<String> pspRegions, @NotNull List<String> availableRegions) {
        Intrinsics.checkNotNullParameter(regionDecidingFactor, "regionDecidingFactor");
        Intrinsics.checkNotNullParameter(regionAcceptanceMarks, "regionAcceptanceMarks");
        Intrinsics.checkNotNullParameter(pspRegions, "pspRegions");
        Intrinsics.checkNotNullParameter(availableRegions, "availableRegions");
        return new APMPMRemoteBasicConfig(regionDecidingFactor, regionAcceptanceMarks, pspRegions, availableRegions);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof APMPMRemoteBasicConfig)) {
            return false;
        }
        APMPMRemoteBasicConfig aPMPMRemoteBasicConfig = (APMPMRemoteBasicConfig) other;
        return Intrinsics.f(this.regionDecidingFactor, aPMPMRemoteBasicConfig.regionDecidingFactor) && Intrinsics.f(this.regionAcceptanceMarks, aPMPMRemoteBasicConfig.regionAcceptanceMarks) && Intrinsics.f(this.pspRegions, aPMPMRemoteBasicConfig.pspRegions) && Intrinsics.f(this.availableRegions, aPMPMRemoteBasicConfig.availableRegions);
    }

    @NotNull
    public final List<String> getAvailableRegions() {
        return this.availableRegions;
    }

    @NotNull
    public final List<String> getPspRegions() {
        return this.pspRegions;
    }

    @NotNull
    public final List<APMPMRegionAcceptanceMark> getRegionAcceptanceMarks() {
        return this.regionAcceptanceMarks;
    }

    @NotNull
    public final String getRegionDecidingFactor() {
        return this.regionDecidingFactor;
    }

    public int hashCode() {
        return this.availableRegions.hashCode() + a.d(a.d(this.regionDecidingFactor.hashCode() * 31, 31, this.regionAcceptanceMarks), 31, this.pspRegions);
    }

    @NotNull
    public final JSONObject toJson() throws JSONException {
        JSONObject jSONObjectPut = new JSONObject().put("regionDecidingFactor", this.regionDecidingFactor);
        JSONArray jSONArray = new JSONArray();
        Iterator<T> it8 = this.regionAcceptanceMarks.iterator();
        while (it8.hasNext()) {
            jSONArray.put(((APMPMRegionAcceptanceMark) it8.next()).toJson());
        }
        Unit unit = Unit.f186387a;
        JSONObject jSONObjectPut2 = jSONObjectPut.put("regionAcceptanceMarks", jSONArray);
        JSONArray jSONArray2 = new JSONArray();
        Iterator<T> it9 = this.pspRegions.iterator();
        while (it9.hasNext()) {
            jSONArray2.put((String) it9.next());
        }
        Unit unit2 = Unit.f186387a;
        JSONObject jSONObjectPut3 = jSONObjectPut2.put("pspRegions", jSONArray2);
        JSONArray jSONArray3 = new JSONArray();
        Iterator<T> it10 = this.availableRegions.iterator();
        while (it10.hasNext()) {
            jSONArray3.put((String) it10.next());
        }
        Unit unit3 = Unit.f186387a;
        JSONObject jSONObjectPut4 = jSONObjectPut3.put("availableRegions", jSONArray3);
        Intrinsics.checkNotNullExpressionValue(jSONObjectPut4, "put(...)");
        return jSONObjectPut4;
    }

    public APMPMRemoteBasicConfig(@NotNull String regionDecidingFactor, @NotNull List<APMPMRegionAcceptanceMark> regionAcceptanceMarks, @NotNull List<String> pspRegions, @NotNull List<String> availableRegions) {
        Intrinsics.checkNotNullParameter(regionDecidingFactor, "regionDecidingFactor");
        Intrinsics.checkNotNullParameter(regionAcceptanceMarks, "regionAcceptanceMarks");
        Intrinsics.checkNotNullParameter(pspRegions, "pspRegions");
        Intrinsics.checkNotNullParameter(availableRegions, "availableRegions");
        this.regionDecidingFactor = regionDecidingFactor;
        this.regionAcceptanceMarks = regionAcceptanceMarks;
        this.pspRegions = pspRegions;
        this.availableRegions = availableRegions;
    }

    public APMPMRemoteBasicConfig(String str, List list, List list2, List list3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? f0.f322471a : list, (i & 4) != 0 ? f0.f322471a : list2, (i & 8) != 0 ? f0.f322471a : list3);
    }
}
