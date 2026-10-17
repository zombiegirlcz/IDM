package c7i;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w5i.a f21985a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r10.r f21986b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final od0.i f21987c;

    public b(w5i.a allowedBalancePickerGroupsProvider, r10.r moveMoneyBalancesInteractorFactory, od0.i pickerBalancesFilterInteractor, b7i.d accountEligibilityInteractorFactory) {
        Intrinsics.checkNotNullParameter(allowedBalancePickerGroupsProvider, "allowedBalancePickerGroupsProvider");
        Intrinsics.checkNotNullParameter(moveMoneyBalancesInteractorFactory, "moveMoneyBalancesInteractorFactory");
        Intrinsics.checkNotNullParameter(pickerBalancesFilterInteractor, "pickerBalancesFilterInteractor");
        Intrinsics.checkNotNullParameter(accountEligibilityInteractorFactory, "accountEligibilityInteractorFactory");
        this.f21985a = allowedBalancePickerGroupsProvider;
        this.f21986b = moveMoneyBalancesInteractorFactory;
        this.f21987c = pickerBalancesFilterInteractor;
    }
}
