package od3;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class y extends f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f224319a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f224320b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f224321c;
    public final Data d;
    public final Data e;
    public final Data f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Data f224322g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Data f224323h;
    public final Data i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Data f224324j;

    public y(Data currentSubscriptionData, Data upgradeToEarnCashbackRequiredData, Data ultraPlanAvailableData, Data cashbackLimitData, Data cashbackByCurrenciesData, Data planCashbackCurrencyData, Data cashbackBoxesData, Data footerTypeData, Data shieldVisibleData, Data transactionsData) {
        Intrinsics.checkNotNullParameter(currentSubscriptionData, "currentSubscriptionData");
        Intrinsics.checkNotNullParameter(upgradeToEarnCashbackRequiredData, "upgradeToEarnCashbackRequiredData");
        Intrinsics.checkNotNullParameter(ultraPlanAvailableData, "ultraPlanAvailableData");
        Intrinsics.checkNotNullParameter(cashbackLimitData, "cashbackLimitData");
        Intrinsics.checkNotNullParameter(cashbackByCurrenciesData, "cashbackByCurrenciesData");
        Intrinsics.checkNotNullParameter(planCashbackCurrencyData, "planCashbackCurrencyData");
        Intrinsics.checkNotNullParameter(cashbackBoxesData, "cashbackBoxesData");
        Intrinsics.checkNotNullParameter(footerTypeData, "footerTypeData");
        Intrinsics.checkNotNullParameter(shieldVisibleData, "shieldVisibleData");
        Intrinsics.checkNotNullParameter(transactionsData, "transactionsData");
        this.f224319a = currentSubscriptionData;
        this.f224320b = upgradeToEarnCashbackRequiredData;
        this.f224321c = ultraPlanAvailableData;
        this.d = cashbackLimitData;
        this.e = cashbackByCurrenciesData;
        this.f = planCashbackCurrencyData;
        this.f224322g = cashbackBoxesData;
        this.f224323h = footerTypeData;
        this.i = shieldVisibleData;
        this.f224324j = transactionsData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof y)) {
            return false;
        }
        y yVar = (y) obj2;
        return Intrinsics.f(this.f224319a, yVar.f224319a) && Intrinsics.f(this.f224320b, yVar.f224320b) && Intrinsics.f(this.f224321c, yVar.f224321c) && Intrinsics.f(this.d, yVar.d) && Intrinsics.f(this.e, yVar.e) && Intrinsics.f(this.f, yVar.f) && Intrinsics.f(this.f224322g, yVar.f224322g) && Intrinsics.f(this.f224323h, yVar.f224323h) && Intrinsics.f(this.i, yVar.i) && Intrinsics.f(this.f224324j, yVar.f224324j);
    }

    public final int hashCode() {
        return this.f224324j.hashCode() + kii.e.c(this.i, kii.e.c(this.f224323h, kii.e.c(this.f224322g, kii.e.c(this.f, kii.e.c(this.e, kii.e.c(this.d, kii.e.c(this.f224321c, kii.e.c(this.f224320b, this.f224319a.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31);
    }
}
