package od3;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class x extends f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f224314a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f224315b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f224316c;
    public final Data d;
    public final Data e;
    public final Data f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Data f224317g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Data f224318h;
    public final Data i;

    public x(Data metalPlanData, Data upgradeToMetalAvailableData, Data cashbackLimitData, Data cashbackByCurrenciesData, Data planCashbackCurrencyData, Data cashbackBoxesData, Data footerTypeData, Data shieldVisibleData, Data transactionsData) {
        Intrinsics.checkNotNullParameter(metalPlanData, "metalPlanData");
        Intrinsics.checkNotNullParameter(upgradeToMetalAvailableData, "upgradeToMetalAvailableData");
        Intrinsics.checkNotNullParameter(cashbackLimitData, "cashbackLimitData");
        Intrinsics.checkNotNullParameter(cashbackByCurrenciesData, "cashbackByCurrenciesData");
        Intrinsics.checkNotNullParameter(planCashbackCurrencyData, "planCashbackCurrencyData");
        Intrinsics.checkNotNullParameter(cashbackBoxesData, "cashbackBoxesData");
        Intrinsics.checkNotNullParameter(footerTypeData, "footerTypeData");
        Intrinsics.checkNotNullParameter(shieldVisibleData, "shieldVisibleData");
        Intrinsics.checkNotNullParameter(transactionsData, "transactionsData");
        this.f224314a = metalPlanData;
        this.f224315b = upgradeToMetalAvailableData;
        this.f224316c = cashbackLimitData;
        this.d = cashbackByCurrenciesData;
        this.e = planCashbackCurrencyData;
        this.f = cashbackBoxesData;
        this.f224317g = footerTypeData;
        this.f224318h = shieldVisibleData;
        this.i = transactionsData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof x)) {
            return false;
        }
        x xVar = (x) obj2;
        return Intrinsics.f(this.f224314a, xVar.f224314a) && Intrinsics.f(this.f224315b, xVar.f224315b) && Intrinsics.f(this.f224316c, xVar.f224316c) && Intrinsics.f(this.d, xVar.d) && Intrinsics.f(this.e, xVar.e) && Intrinsics.f(this.f, xVar.f) && Intrinsics.f(this.f224317g, xVar.f224317g) && Intrinsics.f(this.f224318h, xVar.f224318h) && Intrinsics.f(this.i, xVar.i);
    }

    public final int hashCode() {
        return this.i.hashCode() + kii.e.c(this.f224318h, kii.e.c(this.f224317g, kii.e.c(this.f, kii.e.c(this.e, kii.e.c(this.d, kii.e.c(this.f224316c, kii.e.c(this.f224315b, this.f224314a.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31);
    }
}
