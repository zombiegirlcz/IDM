package jxi;

import com.revolut.core.ui_kit.models.AnimationRequest;
import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class r implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f179217a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f179218b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f179219c;
    public final Data d;
    public final Data e;
    public final Data f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Data f179220g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Data f179221h;
    public final Data i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Data f179222j;
    public final AnimationRequest k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final hha.d f179223l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Data f179224m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Data f179225n;

    public r(Data userData, Data revPointsAccountData, Data passData, Data refundsData, Data termsAndConditionsUrl, Data userCapabilitiesData, Data nearbyAirportsResultData, Data savedLoungesData, Data slotItemsData, Data helpItemsData, AnimationRequest animationRequest, hha.d dVar, Data legalEntityContext, Data passActivityData) {
        Intrinsics.checkNotNullParameter(userData, "userData");
        Intrinsics.checkNotNullParameter(revPointsAccountData, "revPointsAccountData");
        Intrinsics.checkNotNullParameter(passData, "passData");
        Intrinsics.checkNotNullParameter(refundsData, "refundsData");
        Intrinsics.checkNotNullParameter(termsAndConditionsUrl, "termsAndConditionsUrl");
        Intrinsics.checkNotNullParameter(userCapabilitiesData, "userCapabilitiesData");
        Intrinsics.checkNotNullParameter(nearbyAirportsResultData, "nearbyAirportsResultData");
        Intrinsics.checkNotNullParameter(savedLoungesData, "savedLoungesData");
        Intrinsics.checkNotNullParameter(slotItemsData, "slotItemsData");
        Intrinsics.checkNotNullParameter(helpItemsData, "helpItemsData");
        Intrinsics.checkNotNullParameter(legalEntityContext, "legalEntityContext");
        Intrinsics.checkNotNullParameter(passActivityData, "passActivityData");
        this.f179217a = userData;
        this.f179218b = revPointsAccountData;
        this.f179219c = passData;
        this.d = refundsData;
        this.e = termsAndConditionsUrl;
        this.f = userCapabilitiesData;
        this.f179220g = nearbyAirportsResultData;
        this.f179221h = savedLoungesData;
        this.i = slotItemsData;
        this.f179222j = helpItemsData;
        this.k = animationRequest;
        this.f179223l = dVar;
        this.f179224m = legalEntityContext;
        this.f179225n = passActivityData;
    }

    public static r a(r rVar, Data data, Data data2, Data data3, Data data4, Data data5, Data data6, Data data7, Data data8, Data data9, Data data10, AnimationRequest animationRequest, hha.d dVar, Data data11, Data data12, int i) {
        Data userData = (i & 1) != 0 ? rVar.f179217a : data;
        Data revPointsAccountData = (i & 2) != 0 ? rVar.f179218b : data2;
        Data passData = (i & 4) != 0 ? rVar.f179219c : data3;
        Data refundsData = (i & 8) != 0 ? rVar.d : data4;
        Data termsAndConditionsUrl = (i & 16) != 0 ? rVar.e : data5;
        Data userCapabilitiesData = (i & 32) != 0 ? rVar.f : data6;
        Data nearbyAirportsResultData = (i & 64) != 0 ? rVar.f179220g : data7;
        Data savedLoungesData = (i & 128) != 0 ? rVar.f179221h : data8;
        Data slotItemsData = (i & 256) != 0 ? rVar.i : data9;
        Data helpItemsData = (i & 512) != 0 ? rVar.f179222j : data10;
        AnimationRequest animationRequest2 = (i & 1024) != 0 ? rVar.k : animationRequest;
        hha.d dVar2 = (i & 2048) != 0 ? rVar.f179223l : dVar;
        Data legalEntityContext = (i & 4096) != 0 ? rVar.f179224m : data11;
        Data passActivityData = (i & 8192) != 0 ? rVar.f179225n : data12;
        rVar.getClass();
        Intrinsics.checkNotNullParameter(userData, "userData");
        Intrinsics.checkNotNullParameter(revPointsAccountData, "revPointsAccountData");
        Intrinsics.checkNotNullParameter(passData, "passData");
        Intrinsics.checkNotNullParameter(refundsData, "refundsData");
        Intrinsics.checkNotNullParameter(termsAndConditionsUrl, "termsAndConditionsUrl");
        Intrinsics.checkNotNullParameter(userCapabilitiesData, "userCapabilitiesData");
        Intrinsics.checkNotNullParameter(nearbyAirportsResultData, "nearbyAirportsResultData");
        Intrinsics.checkNotNullParameter(savedLoungesData, "savedLoungesData");
        Intrinsics.checkNotNullParameter(slotItemsData, "slotItemsData");
        Intrinsics.checkNotNullParameter(helpItemsData, "helpItemsData");
        Intrinsics.checkNotNullParameter(legalEntityContext, "legalEntityContext");
        Intrinsics.checkNotNullParameter(passActivityData, "passActivityData");
        return new r(userData, revPointsAccountData, passData, refundsData, termsAndConditionsUrl, userCapabilitiesData, nearbyAirportsResultData, savedLoungesData, slotItemsData, helpItemsData, animationRequest2, dVar2, legalEntityContext, passActivityData);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        return Intrinsics.f(this.f179217a, rVar.f179217a) && Intrinsics.f(this.f179218b, rVar.f179218b) && Intrinsics.f(this.f179219c, rVar.f179219c) && Intrinsics.f(this.d, rVar.d) && Intrinsics.f(this.e, rVar.e) && Intrinsics.f(this.f, rVar.f) && Intrinsics.f(this.f179220g, rVar.f179220g) && Intrinsics.f(this.f179221h, rVar.f179221h) && Intrinsics.f(this.i, rVar.i) && Intrinsics.f(this.f179222j, rVar.f179222j) && Intrinsics.f(this.k, rVar.k) && Intrinsics.f(this.f179223l, rVar.f179223l) && Intrinsics.f(this.f179224m, rVar.f179224m) && Intrinsics.f(this.f179225n, rVar.f179225n);
    }

    public final int hashCode() {
        int iC = kii.e.c(this.f179222j, kii.e.c(this.i, kii.e.c(this.f179221h, kii.e.c(this.f179220g, kii.e.c(this.f, kii.e.c(this.e, kii.e.c(this.d, kii.e.c(this.f179219c, kii.e.c(this.f179218b, this.f179217a.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31);
        AnimationRequest animationRequest = this.k;
        int iHashCode = (iC + (animationRequest == null ? 0 : animationRequest.hashCode())) * 31;
        hha.d dVar = this.f179223l;
        return this.f179225n.hashCode() + kii.e.c(this.f179224m, (iHashCode + (dVar != null ? dVar.hashCode() : 0)) * 31, 31);
    }
}
