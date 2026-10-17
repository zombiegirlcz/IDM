package umd;

import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.spending_analytics.api.R$string;
import com.revolut.feature.spending_analytics.impl.ui.budget.overview.BudgetOverviewContract$InputData;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uk2.w;

/* JADX INFO: loaded from: classes7.dex */
public final class q implements cli.n {

    @NotNull
    public static final o Companion = new o();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w80.b f281304a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l80.e f281305b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final thf.c f281306c;
    public final a9e.a d;
    public final BudgetOverviewContract$InputData e;

    public q(w80.b amountFormatter, l80.e dateProvider, thf.c transactionCategoryResourcesMapper, a9e.a recurringPaymentItemMapper, BudgetOverviewContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(amountFormatter, "amountFormatter");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(transactionCategoryResourcesMapper, "transactionCategoryResourcesMapper");
        Intrinsics.checkNotNullParameter(recurringPaymentItemMapper, "recurringPaymentItemMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f281304a = amountFormatter;
        this.f281305b = dateProvider;
        this.f281306c = transactionCategoryResourcesMapper;
        this.d = recurringPaymentItemMapper;
        this.e = inputData;
    }

    public static MoneyClause b(dj0.d dVar, Custom custom) {
        return new MoneyClause(otd.f.a(dVar), new MoneyClause.Format.Defaults(null, null, false, false, 15), custom, null, 8);
    }

    public final TextLocalisedClause a() {
        int i = p.f281303a[this.e.f87511a.ordinal()];
        if (i == 1) {
            return null;
        }
        if (i == 2) {
            return new TextLocalisedClause(R$string.analytics_budget_overview_toolbar_title_joint, null, null, 14);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        c domainState = (c) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (d) iii.c.f(domainState.f281286a, new um7.d(this, 3), new n(this, 0), new w(this, 7));
    }
}
