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
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0080\b\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\u000f\u001a\u00020\u0010J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J3\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\r¨\u0006\u001c"}, d2 = {"Lcom/revolut/feature/alipay_plus/mpm/model/APMPMRegionAcceptanceMark;", "", "region", "", "mpmLogos", "", "Lcom/revolut/feature/alipay_plus/mpm/model/APMPMAcceptanceMarkLogo;", "upmLogos", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "getRegion", "()Ljava/lang/String;", "getMpmLogos", "()Ljava/util/List;", "getUpmLogos", "toJson", "Lorg/json/JSONObject;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "feature_alipay_plus_nonsdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class APMPMRegionAcceptanceMark {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final List<APMPMAcceptanceMarkLogo> mpmLogos;

    @NotNull
    private final String region;

    @NotNull
    private final List<APMPMAcceptanceMarkLogo> upmLogos;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u0018\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0002¨\u0006\r"}, d2 = {"Lcom/revolut/feature/alipay_plus/mpm/model/APMPMRegionAcceptanceMark$Companion;", "", "<init>", "()V", "fromJson", "Lcom/revolut/feature/alipay_plus/mpm/model/APMPMRegionAcceptanceMark;", "json", "Lorg/json/JSONObject;", "parseLogos", "", "Lcom/revolut/feature/alipay_plus/mpm/model/APMPMAcceptanceMarkLogo;", "array", "Lorg/json/JSONArray;", "feature_alipay_plus_nonsdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final List<APMPMAcceptanceMarkLogo> parseLogos(JSONArray array) {
            APMPMAcceptanceMarkLogo aPMPMAcceptanceMarkLogoFromJson;
            if (array == null) {
                return f0.f322471a;
            }
            ArrayList arrayList = new ArrayList();
            int length = array.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObjectOptJSONObject = array.optJSONObject(i);
                if (jSONObjectOptJSONObject != null && (aPMPMAcceptanceMarkLogoFromJson = APMPMAcceptanceMarkLogo.INSTANCE.fromJson(jSONObjectOptJSONObject)) != null) {
                    arrayList.add(aPMPMAcceptanceMarkLogoFromJson);
                }
            }
            return arrayList;
        }

        public final APMPMRegionAcceptanceMark fromJson(@NotNull JSONObject json) {
            Intrinsics.checkNotNullParameter(json, "json");
            String strOptString = json.optString("region");
            Intrinsics.h(strOptString);
            if (d0.W(strOptString)) {
                strOptString = null;
            }
            if (strOptString == null) {
                return null;
            }
            return new APMPMRegionAcceptanceMark(strOptString, parseLogos(json.optJSONArray("mpmLogos")), parseLogos(json.optJSONArray("upmLogos")));
        }

        private Companion() {
        }
    }

    public APMPMRegionAcceptanceMark(@NotNull String region, @NotNull List<APMPMAcceptanceMarkLogo> mpmLogos, @NotNull List<APMPMAcceptanceMarkLogo> upmLogos) {
        Intrinsics.checkNotNullParameter(region, "region");
        Intrinsics.checkNotNullParameter(mpmLogos, "mpmLogos");
        Intrinsics.checkNotNullParameter(upmLogos, "upmLogos");
        this.region = region;
        this.mpmLogos = mpmLogos;
        this.upmLogos = upmLogos;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ APMPMRegionAcceptanceMark copy$default(APMPMRegionAcceptanceMark aPMPMRegionAcceptanceMark, String str, List list, List list2, int i, Object obj2) {
        if ((i & 1) != 0) {
            str = aPMPMRegionAcceptanceMark.region;
        }
        if ((i & 2) != 0) {
            list = aPMPMRegionAcceptanceMark.mpmLogos;
        }
        if ((i & 4) != 0) {
            list2 = aPMPMRegionAcceptanceMark.upmLogos;
        }
        return aPMPMRegionAcceptanceMark.copy(str, list, list2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getRegion() {
        return this.region;
    }

    @NotNull
    public final List<APMPMAcceptanceMarkLogo> component2() {
        return this.mpmLogos;
    }

    @NotNull
    public final List<APMPMAcceptanceMarkLogo> component3() {
        return this.upmLogos;
    }

    @NotNull
    public final APMPMRegionAcceptanceMark copy(@NotNull String region, @NotNull List<APMPMAcceptanceMarkLogo> mpmLogos, @NotNull List<APMPMAcceptanceMarkLogo> upmLogos) {
        Intrinsics.checkNotNullParameter(region, "region");
        Intrinsics.checkNotNullParameter(mpmLogos, "mpmLogos");
        Intrinsics.checkNotNullParameter(upmLogos, "upmLogos");
        return new APMPMRegionAcceptanceMark(region, mpmLogos, upmLogos);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof APMPMRegionAcceptanceMark)) {
            return false;
        }
        APMPMRegionAcceptanceMark aPMPMRegionAcceptanceMark = (APMPMRegionAcceptanceMark) other;
        return Intrinsics.f(this.region, aPMPMRegionAcceptanceMark.region) && Intrinsics.f(this.mpmLogos, aPMPMRegionAcceptanceMark.mpmLogos) && Intrinsics.f(this.upmLogos, aPMPMRegionAcceptanceMark.upmLogos);
    }

    @NotNull
    public final List<APMPMAcceptanceMarkLogo> getMpmLogos() {
        return this.mpmLogos;
    }

    @NotNull
    public final String getRegion() {
        return this.region;
    }

    @NotNull
    public final List<APMPMAcceptanceMarkLogo> getUpmLogos() {
        return this.upmLogos;
    }

    public int hashCode() {
        return this.upmLogos.hashCode() + a.d(this.region.hashCode() * 31, 31, this.mpmLogos);
    }

    @NotNull
    public final JSONObject toJson() throws JSONException {
        JSONObject jSONObjectPut = new JSONObject().put("region", this.region);
        JSONArray jSONArray = new JSONArray();
        Iterator<T> it8 = this.mpmLogos.iterator();
        while (it8.hasNext()) {
            jSONArray.put(((APMPMAcceptanceMarkLogo) it8.next()).toJson());
        }
        Unit unit = Unit.f186387a;
        JSONObject jSONObjectPut2 = jSONObjectPut.put("mpmLogos", jSONArray);
        JSONArray jSONArray2 = new JSONArray();
        Iterator<T> it9 = this.upmLogos.iterator();
        while (it9.hasNext()) {
            jSONArray2.put(((APMPMAcceptanceMarkLogo) it9.next()).toJson());
        }
        Unit unit2 = Unit.f186387a;
        JSONObject jSONObjectPut3 = jSONObjectPut2.put("upmLogos", jSONArray2);
        Intrinsics.checkNotNullExpressionValue(jSONObjectPut3, "put(...)");
        return jSONObjectPut3;
    }
}
