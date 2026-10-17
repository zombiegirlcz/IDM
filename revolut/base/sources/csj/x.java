package csj;

import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.retail.feature.impl.budgeting.R$string;
import com.revolut.retail.feature.impl.budgeting.ui.rev10.set_budgets.set_category_budgets.SetCategoryBudgetsScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class x implements jki.p {

    @NotNull
    public static final v Companion = new v();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final thf.c f108507a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SetCategoryBudgetsScreenContract$InputData f108508b;

    public x(thf.c transactionCategoryResourcesMapper, SetCategoryBudgetsScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(transactionCategoryResourcesMapper, "transactionCategoryResourcesMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f108507a = transactionCategoryResourcesMapper;
        this.f108508b = inputData;
    }

    public static TextLocalisedClause b(dj0.d dVar, boolean z) {
        if (z) {
            return new TextLocalisedClause(R$string.analytics_budget_category_screen_monthly_overflow_format, zhm.u.c(new MoneyClause(dVar, new MoneyClause.Format.Defaults(null, null, false, false, 15), new Custom(Integer.valueOf(R$attr.uikit_colorRed), false, null, false, null, 254), null, 8)), new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 8);
        }
        return new TextLocalisedClause(R$string.analytics_budget_category_screen_left_to_allocate_format, zhm.u.c(new MoneyClause(dVar, new MoneyClause.Format.Defaults(null, null, false, false, 15), new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), null, 8)), new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 8);
    }

    @Override // jki.p
    public final jki.m a(jki.i iVar) {
        i domainState = (i) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (o) iii.c.f(domainState.f108482a, new cs.a(this, 7), new clk.b(this, 22), new cf1.h(this, 10));
    }
}
