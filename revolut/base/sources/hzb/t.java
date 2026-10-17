package hzb;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class t implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f157123a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f157124b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f157125c;
    public final Data d;
    public final Data e;
    public final Data f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Data f157126g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Data f157127h;
    public final Data i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Data f157128j;
    public final Data k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Data f157129l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Data f157130m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Data f157131n;
    public final Data o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Data f157132p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Data f157133q;

    public t() {
        this(0);
    }

    public static t a(t tVar, Data data, Data data2, Data data3, Data data4, Data data5, Data data6, Data data7, Data data8, Data data9, Data data10, Data data11, Data data12, Data data13, Data data14, Data data15, Data data16, int i) {
        Data data17;
        Data creditCardEntryPointAvailability;
        Data revPointsAccountStatus = (i & 1) != 0 ? tVar.f157123a : data;
        Data revPointsBenefits = (i & 2) != 0 ? tVar.f157124b : data2;
        Data pricingPlan = (i & 4) != 0 ? tVar.f157125c : data3;
        Data upsellBannerState = (i & 8) != 0 ? tVar.d : data4;
        Data revPointsEligibilities = (i & 16) != 0 ? tVar.e : data5;
        Data revPointsSpareChange = (i & 32) != 0 ? tVar.f : data6;
        Data revPointsEarningRate = (i & 64) != 0 ? tVar.f157126g : data7;
        Data loyaltyEarningRates = (i & 128) != 0 ? tVar.f157127h : data8;
        Data availableFeatures = (i & 256) != 0 ? tVar.i : data9;
        Data slotManagerItems = (i & 512) != 0 ? tVar.f157128j : data10;
        Data revPointsPocketThresholds = (i & 1024) != 0 ? tVar.k : data11;
        Data revolutPayPromotedMerchantsAvailable = tVar.f157129l;
        Data pointsBuyingActivePackageResponse = (i & 4096) != 0 ? tVar.f157130m : data12;
        Data legalEntityContext = (i & 8192) != 0 ? tVar.f157131n : data13;
        Data user = (i & 16384) != 0 ? tVar.o : data14;
        Data data18 = (i & 32768) != 0 ? tVar.f157132p : data15;
        if ((i & 65536) != 0) {
            data17 = data18;
            creditCardEntryPointAvailability = tVar.f157133q;
        } else {
            data17 = data18;
            creditCardEntryPointAvailability = data16;
        }
        tVar.getClass();
        Intrinsics.checkNotNullParameter(revPointsAccountStatus, "revPointsAccountStatus");
        Intrinsics.checkNotNullParameter(revPointsBenefits, "revPointsBenefits");
        Intrinsics.checkNotNullParameter(pricingPlan, "pricingPlan");
        Intrinsics.checkNotNullParameter(upsellBannerState, "upsellBannerState");
        Intrinsics.checkNotNullParameter(revPointsEligibilities, "revPointsEligibilities");
        Intrinsics.checkNotNullParameter(revPointsSpareChange, "revPointsSpareChange");
        Intrinsics.checkNotNullParameter(revPointsEarningRate, "revPointsEarningRate");
        Intrinsics.checkNotNullParameter(loyaltyEarningRates, "loyaltyEarningRates");
        Intrinsics.checkNotNullParameter(availableFeatures, "availableFeatures");
        Intrinsics.checkNotNullParameter(slotManagerItems, "slotManagerItems");
        Intrinsics.checkNotNullParameter(revPointsPocketThresholds, "revPointsPocketThresholds");
        Intrinsics.checkNotNullParameter(revolutPayPromotedMerchantsAvailable, "revolutPayPromotedMerchantsAvailable");
        Intrinsics.checkNotNullParameter(pointsBuyingActivePackageResponse, "pointsBuyingActivePackageResponse");
        Data data19 = revPointsAccountStatus;
        Intrinsics.checkNotNullParameter(legalEntityContext, "legalEntityContext");
        Intrinsics.checkNotNullParameter(user, "user");
        Data topBrands = data17;
        Intrinsics.checkNotNullParameter(topBrands, "topBrands");
        Intrinsics.checkNotNullParameter(creditCardEntryPointAvailability, "creditCardEntryPointAvailability");
        return new t(data19, revPointsBenefits, pricingPlan, upsellBannerState, revPointsEligibilities, revPointsSpareChange, revPointsEarningRate, loyaltyEarningRates, availableFeatures, slotManagerItems, revPointsPocketThresholds, revolutPayPromotedMerchantsAvailable, pointsBuyingActivePackageResponse, legalEntityContext, user, topBrands, creditCardEntryPointAvailability);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t)) {
            return false;
        }
        t tVar = (t) obj2;
        return Intrinsics.f(this.f157123a, tVar.f157123a) && Intrinsics.f(this.f157124b, tVar.f157124b) && Intrinsics.f(this.f157125c, tVar.f157125c) && Intrinsics.f(this.d, tVar.d) && Intrinsics.f(this.e, tVar.e) && Intrinsics.f(this.f, tVar.f) && Intrinsics.f(this.f157126g, tVar.f157126g) && Intrinsics.f(this.f157127h, tVar.f157127h) && Intrinsics.f(this.i, tVar.i) && Intrinsics.f(this.f157128j, tVar.f157128j) && Intrinsics.f(this.k, tVar.k) && Intrinsics.f(this.f157129l, tVar.f157129l) && Intrinsics.f(this.f157130m, tVar.f157130m) && Intrinsics.f(this.f157131n, tVar.f157131n) && Intrinsics.f(this.o, tVar.o) && Intrinsics.f(this.f157132p, tVar.f157132p) && Intrinsics.f(this.f157133q, tVar.f157133q);
    }

    public final int hashCode() {
        return this.f157133q.hashCode() + kii.e.c(this.f157132p, kii.e.c(this.o, kii.e.c(this.f157131n, kii.e.c(this.f157130m, kii.e.c(this.f157129l, kii.e.c(this.k, kii.e.c(this.f157128j, kii.e.c(this.i, kii.e.c(this.f157127h, kii.e.c(this.f157126g, kii.e.c(this.f, kii.e.c(this.e, kii.e.c(this.d, kii.e.c(this.f157125c, kii.e.c(this.f157124b, this.f157123a.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public t(Data revPointsAccountStatus, Data revPointsBenefits, Data pricingPlan, Data upsellBannerState, Data revPointsEligibilities, Data revPointsSpareChange, Data revPointsEarningRate, Data loyaltyEarningRates, Data availableFeatures, Data slotManagerItems, Data revPointsPocketThresholds, Data revolutPayPromotedMerchantsAvailable, Data pointsBuyingActivePackageResponse, Data legalEntityContext, Data user, Data topBrands, Data creditCardEntryPointAvailability) {
        Intrinsics.checkNotNullParameter(revPointsAccountStatus, "revPointsAccountStatus");
        Intrinsics.checkNotNullParameter(revPointsBenefits, "revPointsBenefits");
        Intrinsics.checkNotNullParameter(pricingPlan, "pricingPlan");
        Intrinsics.checkNotNullParameter(upsellBannerState, "upsellBannerState");
        Intrinsics.checkNotNullParameter(revPointsEligibilities, "revPointsEligibilities");
        Intrinsics.checkNotNullParameter(revPointsSpareChange, "revPointsSpareChange");
        Intrinsics.checkNotNullParameter(revPointsEarningRate, "revPointsEarningRate");
        Intrinsics.checkNotNullParameter(loyaltyEarningRates, "loyaltyEarningRates");
        Intrinsics.checkNotNullParameter(availableFeatures, "availableFeatures");
        Intrinsics.checkNotNullParameter(slotManagerItems, "slotManagerItems");
        Intrinsics.checkNotNullParameter(revPointsPocketThresholds, "revPointsPocketThresholds");
        Intrinsics.checkNotNullParameter(revolutPayPromotedMerchantsAvailable, "revolutPayPromotedMerchantsAvailable");
        Intrinsics.checkNotNullParameter(pointsBuyingActivePackageResponse, "pointsBuyingActivePackageResponse");
        Intrinsics.checkNotNullParameter(legalEntityContext, "legalEntityContext");
        Intrinsics.checkNotNullParameter(user, "user");
        Intrinsics.checkNotNullParameter(topBrands, "topBrands");
        Intrinsics.checkNotNullParameter(creditCardEntryPointAvailability, "creditCardEntryPointAvailability");
        this.f157123a = revPointsAccountStatus;
        this.f157124b = revPointsBenefits;
        this.f157125c = pricingPlan;
        this.d = upsellBannerState;
        this.e = revPointsEligibilities;
        this.f = revPointsSpareChange;
        this.f157126g = revPointsEarningRate;
        this.f157127h = loyaltyEarningRates;
        this.i = availableFeatures;
        this.f157128j = slotManagerItems;
        this.k = revPointsPocketThresholds;
        this.f157129l = revolutPayPromotedMerchantsAvailable;
        this.f157130m = pointsBuyingActivePackageResponse;
        this.f157131n = legalEntityContext;
        this.o = user;
        this.f157132p = topBrands;
        this.f157133q = creditCardEntryPointAvailability;
    }

    public /* synthetic */ t(int i) {
        this(new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, false, 7, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, false, 7, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, false, 7, null), new Data(null, null, true, 3, null));
    }
}
