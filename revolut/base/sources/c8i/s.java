package c8i;

import com.revolut.retail.feature.balance.picker.api.models.BalanceWrapper;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class s implements w5i.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m2j.j f22219a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kdh.b f22220b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w5i.b f22221c;
    public final r7i.a0 d;
    public final ou5.b e;
    public final r7i.s f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final g8i.a f22222g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final n f22223h;
    public final r7i.p i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final k7i.i f22224j;
    public final gte.a k;

    public s(m2j.j balancesInteractor, kdh.b balancesSortInteractor, w5i.b pocketEligibilityChecker, r7i.a0 subaccountsEligibilityChecker, ou5.b savingsEligibilityChecker, r7i.s juniorAccountsEligibilityChecker, g8i.a teenAccountsEligibilityChecker, n moveMoneyBalancesIndiaFilterInteractor, r7i.p investAccountsEligibilityChecker, k7i.i moveMoneyBalanceAccountEligibilityChecker, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(balancesInteractor, "balancesInteractor");
        Intrinsics.checkNotNullParameter(balancesSortInteractor, "balancesSortInteractor");
        Intrinsics.checkNotNullParameter(pocketEligibilityChecker, "pocketEligibilityChecker");
        Intrinsics.checkNotNullParameter(subaccountsEligibilityChecker, "subaccountsEligibilityChecker");
        Intrinsics.checkNotNullParameter(savingsEligibilityChecker, "savingsEligibilityChecker");
        Intrinsics.checkNotNullParameter(juniorAccountsEligibilityChecker, "juniorAccountsEligibilityChecker");
        Intrinsics.checkNotNullParameter(teenAccountsEligibilityChecker, "teenAccountsEligibilityChecker");
        Intrinsics.checkNotNullParameter(moveMoneyBalancesIndiaFilterInteractor, "moveMoneyBalancesIndiaFilterInteractor");
        Intrinsics.checkNotNullParameter(investAccountsEligibilityChecker, "investAccountsEligibilityChecker");
        Intrinsics.checkNotNullParameter(moveMoneyBalanceAccountEligibilityChecker, "moveMoneyBalanceAccountEligibilityChecker");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f22219a = balancesInteractor;
        this.f22220b = balancesSortInteractor;
        this.f22221c = pocketEligibilityChecker;
        this.d = subaccountsEligibilityChecker;
        this.e = savingsEligibilityChecker;
        this.f = juniorAccountsEligibilityChecker;
        this.f22222g = teenAccountsEligibilityChecker;
        this.f22223h = moveMoneyBalancesIndiaFilterInteractor;
        this.i = investAccountsEligibilityChecker;
        this.f22224j = moveMoneyBalanceAccountEligibilityChecker;
        this.k = featureToggleInteractor;
    }

    public static rfm.j b(efm.d0 d0Var, BalanceWrapper balanceWrapper) {
        c64.a aVar = new c64.a(new c69.v(balanceWrapper, 12), 8);
        d0Var.getClass();
        rfm.j jVar = new rfm.j(d0Var, aVar, 2);
        Intrinsics.checkNotNullExpressionValue(jVar, "flatMapMaybe(...)");
        return jVar;
    }
}
