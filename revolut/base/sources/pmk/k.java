package pmk;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class k implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f237616a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f237617b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f237618c;
    public final Data d;
    public final Data e;
    public final Data f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Data f237619g;

    public k() {
        this(0);
    }

    public static k a(k kVar, Data data, Data data2, Data data3, Data data4, Data data5, Data data6, Data data7, int i) {
        if ((i & 1) != 0) {
            data = kVar.f237616a;
        }
        Data planSubscriptionData = data;
        if ((i & 2) != 0) {
            data2 = kVar.f237617b;
        }
        Data pricingPlans = data2;
        if ((i & 4) != 0) {
            data3 = kVar.f237618c;
        }
        Data planCampaigns = data3;
        if ((i & 8) != 0) {
            data4 = kVar.d;
        }
        Data isPackageAccount = data4;
        if ((i & 16) != 0) {
            data5 = kVar.e;
        }
        Data familyPlanState = data5;
        if ((i & 32) != 0) {
            data6 = kVar.f;
        }
        Data pendingOrders = data6;
        if ((i & 64) != 0) {
            data7 = kVar.f237619g;
        }
        Data minimumBalanceInfo = data7;
        kVar.getClass();
        Intrinsics.checkNotNullParameter(planSubscriptionData, "planSubscriptionData");
        Intrinsics.checkNotNullParameter(pricingPlans, "pricingPlans");
        Intrinsics.checkNotNullParameter(planCampaigns, "planCampaigns");
        Intrinsics.checkNotNullParameter(isPackageAccount, "isPackageAccount");
        Intrinsics.checkNotNullParameter(familyPlanState, "familyPlanState");
        Intrinsics.checkNotNullParameter(pendingOrders, "pendingOrders");
        Intrinsics.checkNotNullParameter(minimumBalanceInfo, "minimumBalanceInfo");
        return new k(planSubscriptionData, pricingPlans, planCampaigns, isPackageAccount, familyPlanState, pendingOrders, minimumBalanceInfo);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f237616a, kVar.f237616a) && Intrinsics.f(this.f237617b, kVar.f237617b) && Intrinsics.f(this.f237618c, kVar.f237618c) && Intrinsics.f(this.d, kVar.d) && Intrinsics.f(this.e, kVar.e) && Intrinsics.f(this.f, kVar.f) && Intrinsics.f(this.f237619g, kVar.f237619g);
    }

    public final int hashCode() {
        return this.f237619g.hashCode() + kii.e.c(this.f, kii.e.c(this.e, kii.e.c(this.d, kii.e.c(this.f237618c, kii.e.c(this.f237617b, this.f237616a.hashCode() * 31, 31), 31), 31), 31), 31);
    }

    public k(Data planSubscriptionData, Data pricingPlans, Data planCampaigns, Data isPackageAccount, Data familyPlanState, Data pendingOrders, Data minimumBalanceInfo) {
        Intrinsics.checkNotNullParameter(planSubscriptionData, "planSubscriptionData");
        Intrinsics.checkNotNullParameter(pricingPlans, "pricingPlans");
        Intrinsics.checkNotNullParameter(planCampaigns, "planCampaigns");
        Intrinsics.checkNotNullParameter(isPackageAccount, "isPackageAccount");
        Intrinsics.checkNotNullParameter(familyPlanState, "familyPlanState");
        Intrinsics.checkNotNullParameter(pendingOrders, "pendingOrders");
        Intrinsics.checkNotNullParameter(minimumBalanceInfo, "minimumBalanceInfo");
        this.f237616a = planSubscriptionData;
        this.f237617b = pricingPlans;
        this.f237618c = planCampaigns;
        this.d = isPackageAccount;
        this.e = familyPlanState;
        this.f = pendingOrders;
        this.f237619g = minimumBalanceInfo;
    }

    public /* synthetic */ k(int i) {
        Data data = new Data(null, null, true, 3, null);
        Data data2 = new Data(null, null, true, 3, null);
        Data data3 = new Data(null, null, true, 3, null);
        Data data4 = new Data(null, null, true, 3, null);
        Data data5 = new Data(null, null, true, 3, null);
        Data data6 = new Data(null, null, true, 3, null);
        od0.i.Companion.getClass();
        this(data, data2, data3, data4, data5, data6, new Data(od0.i.f224256b, null, false, 6, null));
    }
}
