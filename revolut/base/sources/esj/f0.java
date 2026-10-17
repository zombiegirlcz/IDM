package esj;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.retail.feature.impl.budgeting.R$string;
import com.revolut.retail.feature.impl.budgeting.ui.rev10.set_budgets.set_overall_budget.SetOverallBudgetScreenContract$InputData;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class f0 implements jki.p {

    @NotNull
    public static final d0 Companion = new d0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cmd.b f128972a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w80.b f128973b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SetOverallBudgetScreenContract$InputData f128974c;
    public final ldd.b d;

    public f0(cmd.b daysClauseProvider, u80.o moneyPrefixFormatter, w80.b amountFormatter, SetOverallBudgetScreenContract$InputData inputData, ldd.b focusRequesterDelegate) {
        Intrinsics.checkNotNullParameter(daysClauseProvider, "daysClauseProvider");
        Intrinsics.checkNotNullParameter(moneyPrefixFormatter, "moneyPrefixFormatter");
        Intrinsics.checkNotNullParameter(amountFormatter, "amountFormatter");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(focusRequesterDelegate, "focusRequesterDelegate");
        this.f128972a = daysClauseProvider;
        this.f128973b = amountFormatter;
        this.f128974c = inputData;
        this.d = focusRequesterDelegate;
    }

    @Override // jki.p
    public final jki.m a(jki.i iVar) {
        o domainState = (o) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (x) iii.c.f(domainState.f128977a, new eq4.g(this, 17), new eh3.s(this, 28), new dn8.k(this, domainState, 21));
    }

    public final TextLocalisedClause b() {
        int i = e0.f128969a[this.f128974c.f101562a.ordinal()];
        if (i == 1) {
            return new TextLocalisedClause(R$string.analytics_set_spending_budget_screen_title, null, null, 14);
        }
        if (i == 2) {
            return new TextLocalisedClause(R$string.analytics_edit_spending_budget_screen_title, null, null, 14);
        }
        throw new NoWhenBranchMatchedException();
    }
}
