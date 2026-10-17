package com.revolut.feature.tab.lifestyle.impl.ui.screen;

import cli.j;
import com.revolut.core.ui_kit.models.navbar.NavBarMessage;
import com.revolut.data.model.Data;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* JADX INFO: loaded from: classes8.dex */
public final class a implements j {
    public final Data A;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final itb.b f89923a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f89924b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f89925c;
    public final boolean d;
    public final boolean e;
    public final Data f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Data f89926g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Data f89927h;
    public final Data i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final b f89928j;
    public final Data k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Set f89929l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Data f89930m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Data f89931n;
    public final Data o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Data f89932p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Data f89933q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final List f89934r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final boolean f89935s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Data f89936t;
    public final Data u;
    public final NavBarMessage v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final List f89937w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final boolean f89938x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Data f89939y;
    public final ld6.b z;

    public a(itb.b userProfileAvatarParams, Data userCompany, Data pointsAvailability, boolean z, boolean z3, Data revPointsSpareChange, Data lifestyleTabAvailability, Data homeFeed, Data homeProducts, b homeProductsState, Data homeHeader, Set expandedFeedSlotsIds, Data baseCurrency, Data currentPlan, Data plansToUpgrade, Data headerBackground, Data homeSuggestedForYou, List slots, boolean z4, Data revPointsEarningRate, Data revPointsOptInInfo, NavBarMessage navBarMessage, List widgetItems, boolean z6, Data legalEntityContext, ld6.b bVar, Data lifestyleOnboardingInfoState) {
        Intrinsics.checkNotNullParameter(userProfileAvatarParams, "userProfileAvatarParams");
        Intrinsics.checkNotNullParameter(userCompany, "userCompany");
        Intrinsics.checkNotNullParameter(pointsAvailability, "pointsAvailability");
        Intrinsics.checkNotNullParameter(revPointsSpareChange, "revPointsSpareChange");
        Intrinsics.checkNotNullParameter(lifestyleTabAvailability, "lifestyleTabAvailability");
        Intrinsics.checkNotNullParameter(homeFeed, "homeFeed");
        Intrinsics.checkNotNullParameter(homeProducts, "homeProducts");
        Intrinsics.checkNotNullParameter(homeProductsState, "homeProductsState");
        Intrinsics.checkNotNullParameter(homeHeader, "homeHeader");
        Intrinsics.checkNotNullParameter(expandedFeedSlotsIds, "expandedFeedSlotsIds");
        Intrinsics.checkNotNullParameter(baseCurrency, "baseCurrency");
        Intrinsics.checkNotNullParameter(currentPlan, "currentPlan");
        Intrinsics.checkNotNullParameter(plansToUpgrade, "plansToUpgrade");
        Intrinsics.checkNotNullParameter(headerBackground, "headerBackground");
        Intrinsics.checkNotNullParameter(homeSuggestedForYou, "homeSuggestedForYou");
        Intrinsics.checkNotNullParameter(slots, "slots");
        Intrinsics.checkNotNullParameter(revPointsEarningRate, "revPointsEarningRate");
        Intrinsics.checkNotNullParameter(revPointsOptInInfo, "revPointsOptInInfo");
        Intrinsics.checkNotNullParameter(widgetItems, "widgetItems");
        Intrinsics.checkNotNullParameter(legalEntityContext, "legalEntityContext");
        Intrinsics.checkNotNullParameter(lifestyleOnboardingInfoState, "lifestyleOnboardingInfoState");
        this.f89923a = userProfileAvatarParams;
        this.f89924b = userCompany;
        this.f89925c = pointsAvailability;
        this.d = z;
        this.e = z3;
        this.f = revPointsSpareChange;
        this.f89926g = lifestyleTabAvailability;
        this.f89927h = homeFeed;
        this.i = homeProducts;
        this.f89928j = homeProductsState;
        this.k = homeHeader;
        this.f89929l = expandedFeedSlotsIds;
        this.f89930m = baseCurrency;
        this.f89931n = currentPlan;
        this.o = plansToUpgrade;
        this.f89932p = headerBackground;
        this.f89933q = homeSuggestedForYou;
        this.f89934r = slots;
        this.f89935s = z4;
        this.f89936t = revPointsEarningRate;
        this.u = revPointsOptInInfo;
        this.v = navBarMessage;
        this.f89937w = widgetItems;
        this.f89938x = z6;
        this.f89939y = legalEntityContext;
        this.z = bVar;
        this.A = lifestyleOnboardingInfoState;
    }

    public static a a(a aVar, itb.b bVar, Data data, Data data2, boolean z, Data data3, Data data4, Data data5, Data data6, b bVar2, Data data7, Set set, Data data8, Data data9, Data data10, Data data11, Data data12, List list, boolean z3, Data data13, Data data14, NavBarMessage navBarMessage, List list2, boolean z4, Data data15, ld6.b bVar3, Data data16, int i) {
        Data data17;
        List list3;
        List list4;
        boolean z6;
        Data data18;
        Data data19;
        Data data20;
        NavBarMessage navBarMessage2;
        List list5;
        boolean z11;
        Data data21;
        ld6.b bVar4;
        itb.b userProfileAvatarParams = (i & 1) != 0 ? aVar.f89923a : bVar;
        Data userCompany = (i & 2) != 0 ? aVar.f89924b : data;
        Data pointsAvailability = (i & 4) != 0 ? aVar.f89925c : data2;
        boolean z12 = aVar.d;
        boolean z29 = (i & 16) != 0 ? aVar.e : z;
        Data revPointsSpareChange = (i & 32) != 0 ? aVar.f : data3;
        Data lifestyleTabAvailability = (i & 64) != 0 ? aVar.f89926g : data4;
        Data homeFeed = (i & 128) != 0 ? aVar.f89927h : data5;
        Data homeProducts = (i & 256) != 0 ? aVar.i : data6;
        b homeProductsState = (i & 512) != 0 ? aVar.f89928j : bVar2;
        Data homeHeader = (i & 1024) != 0 ? aVar.k : data7;
        Set expandedFeedSlotsIds = (i & 2048) != 0 ? aVar.f89929l : set;
        Data baseCurrency = (i & 4096) != 0 ? aVar.f89930m : data8;
        Data currentPlan = (i & 8192) != 0 ? aVar.f89931n : data9;
        Data plansToUpgrade = (i & 16384) != 0 ? aVar.o : data10;
        Data headerBackground = (i & 32768) != 0 ? aVar.f89932p : data11;
        aVar.getClass();
        boolean z31 = z29;
        Data data22 = (i & 131072) != 0 ? aVar.f89933q : data12;
        if ((i & 262144) != 0) {
            data17 = data22;
            list3 = aVar.f89934r;
        } else {
            data17 = data22;
            list3 = list;
        }
        if ((i & 524288) != 0) {
            list4 = list3;
            z6 = aVar.f89935s;
        } else {
            list4 = list3;
            z6 = z3;
        }
        boolean z41 = z6;
        Data data23 = (i & PKIFailureInfo.badCertTemplate) != 0 ? aVar.f89936t : data13;
        if ((i & PKIFailureInfo.badSenderNonce) != 0) {
            data18 = data23;
            data19 = aVar.u;
        } else {
            data18 = data23;
            data19 = data14;
        }
        if ((i & 4194304) != 0) {
            data20 = data19;
            navBarMessage2 = aVar.v;
        } else {
            data20 = data19;
            navBarMessage2 = navBarMessage;
        }
        NavBarMessage navBarMessage3 = navBarMessage2;
        List list6 = (i & 8388608) != 0 ? aVar.f89937w : list2;
        if ((i & 16777216) != 0) {
            list5 = list6;
            z11 = aVar.f89938x;
        } else {
            list5 = list6;
            z11 = z4;
        }
        boolean z49 = z11;
        Data data24 = (i & 33554432) != 0 ? aVar.f89939y : data15;
        if ((i & 67108864) != 0) {
            data21 = data24;
            bVar4 = aVar.z;
        } else {
            data21 = data24;
            bVar4 = bVar3;
        }
        ld6.b bVar5 = bVar4;
        Data lifestyleOnboardingInfoState = (i & 134217728) != 0 ? aVar.A : data16;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(userProfileAvatarParams, "userProfileAvatarParams");
        Intrinsics.checkNotNullParameter(userCompany, "userCompany");
        Intrinsics.checkNotNullParameter(pointsAvailability, "pointsAvailability");
        Intrinsics.checkNotNullParameter(revPointsSpareChange, "revPointsSpareChange");
        Intrinsics.checkNotNullParameter(lifestyleTabAvailability, "lifestyleTabAvailability");
        Intrinsics.checkNotNullParameter(homeFeed, "homeFeed");
        Intrinsics.checkNotNullParameter(homeProducts, "homeProducts");
        Intrinsics.checkNotNullParameter(homeProductsState, "homeProductsState");
        Intrinsics.checkNotNullParameter(homeHeader, "homeHeader");
        Intrinsics.checkNotNullParameter(expandedFeedSlotsIds, "expandedFeedSlotsIds");
        Intrinsics.checkNotNullParameter(baseCurrency, "baseCurrency");
        Intrinsics.checkNotNullParameter(currentPlan, "currentPlan");
        Intrinsics.checkNotNullParameter(plansToUpgrade, "plansToUpgrade");
        Intrinsics.checkNotNullParameter(headerBackground, "headerBackground");
        Data data25 = headerBackground;
        Data homeSuggestedForYou = data17;
        Intrinsics.checkNotNullParameter(homeSuggestedForYou, "homeSuggestedForYou");
        List slots = list4;
        Intrinsics.checkNotNullParameter(slots, "slots");
        Data revPointsEarningRate = data18;
        Intrinsics.checkNotNullParameter(revPointsEarningRate, "revPointsEarningRate");
        Data revPointsOptInInfo = data20;
        Intrinsics.checkNotNullParameter(revPointsOptInInfo, "revPointsOptInInfo");
        List widgetItems = list5;
        Intrinsics.checkNotNullParameter(widgetItems, "widgetItems");
        Data legalEntityContext = data21;
        Intrinsics.checkNotNullParameter(legalEntityContext, "legalEntityContext");
        Intrinsics.checkNotNullParameter(lifestyleOnboardingInfoState, "lifestyleOnboardingInfoState");
        return new a(userProfileAvatarParams, userCompany, pointsAvailability, z12, z31, revPointsSpareChange, lifestyleTabAvailability, homeFeed, homeProducts, homeProductsState, homeHeader, expandedFeedSlotsIds, baseCurrency, currentPlan, plansToUpgrade, data25, data17, list4, z41, data18, data20, navBarMessage3, list5, z49, legalEntityContext, bVar5, lifestyleOnboardingInfoState);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f89923a, aVar.f89923a) && Intrinsics.f(this.f89924b, aVar.f89924b) && Intrinsics.f(this.f89925c, aVar.f89925c) && this.d == aVar.d && this.e == aVar.e && Intrinsics.f(this.f, aVar.f) && Intrinsics.f(this.f89926g, aVar.f89926g) && Intrinsics.f(this.f89927h, aVar.f89927h) && Intrinsics.f(this.i, aVar.i) && Intrinsics.f(this.f89928j, aVar.f89928j) && Intrinsics.f(this.k, aVar.k) && Intrinsics.f(this.f89929l, aVar.f89929l) && Intrinsics.f(this.f89930m, aVar.f89930m) && Intrinsics.f(this.f89931n, aVar.f89931n) && Intrinsics.f(this.o, aVar.o) && Intrinsics.f(this.f89932p, aVar.f89932p) && Intrinsics.f(this.f89933q, aVar.f89933q) && Intrinsics.f(this.f89934r, aVar.f89934r) && this.f89935s == aVar.f89935s && Intrinsics.f(this.f89936t, aVar.f89936t) && Intrinsics.f(this.u, aVar.u) && Intrinsics.f(this.v, aVar.v) && Intrinsics.f(this.f89937w, aVar.f89937w) && this.f89938x == aVar.f89938x && Intrinsics.f(this.f89939y, aVar.f89939y) && this.z == aVar.z && Intrinsics.f(this.A, aVar.A);
    }

    public final int hashCode() {
        int iC = kii.e.c(this.u, kii.e.c(this.f89936t, j6.a.c(p.a.d(kii.e.c(this.f89933q, j6.a.c(kii.e.c(this.f89932p, kii.e.c(this.o, kii.e.c(this.f89931n, kii.e.c(this.f89930m, p.a.f(kii.e.c(this.k, (this.f89928j.hashCode() + kii.e.c(this.i, kii.e.c(this.f89927h, kii.e.c(this.f89926g, kii.e.c(this.f, j6.a.c(j6.a.c(kii.e.c(this.f89925c, kii.e.c(this.f89924b, this.f89923a.hashCode() * 31, 31), 31), 31, this.d), 31, this.e), 31), 31), 31), 31)) * 31, 31), 31, this.f89929l), 31), 31), 31), 31), 31, false), 31), 31, this.f89934r), 31, this.f89935s), 31), 31);
        NavBarMessage navBarMessage = this.v;
        int iC2 = kii.e.c(this.f89939y, j6.a.c(p.a.d((iC + (navBarMessage == null ? 0 : navBarMessage.hashCode())) * 31, 31, this.f89937w), 31, this.f89938x), 31);
        ld6.b bVar = this.z;
        return this.A.hashCode() + ((iC2 + (bVar != null ? bVar.hashCode() : 0)) * 31);
    }
}
