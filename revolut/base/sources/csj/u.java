package csj;

import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.model.account.AccountId;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.data.model.Data;
import com.revolut.retail.common.ui.R$string;
import com.revolut.retail.feature.impl.budgeting.ui.rev10.set_budgets.models.CategoryBudgetEditingInfo;
import com.revolut.retail.feature.impl.budgeting.ui.rev10.set_budgets.set_category_budgets.SetCategoryBudgetsScreenContract$InputData;
import ip0.tm0;
import ip0.um0;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import rp0.y;
import vkm.q0;
import vkm.z1;

/* JADX INFO: loaded from: classes11.dex */
public final class u extends jki.g implements n {

    @NotNull
    public static final q Companion = new q();
    public final z1 A;
    public final i B;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ge3.e f108498p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final grj.j f108499q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final tzi.a f108500r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final pzi.b f108501s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final mrj.a f108502t;
    public final w80.b u;
    public final r10.w v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final j60.a f108503w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final zrj.a f108504x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final asj.j f108505y;
    public final SetCategoryBudgetsScreenContract$InputData z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(ge3.e transactionCategorisationInteractor, grj.j jointBudgetingDataSynchronizer, tzi.a budgetingCycleInteractor, pzi.b budgetingInteractor, mrj.a spentAmountsLoader, w80.b amountFormatter, r10.w setCategoryBudgetsDomainStateMapper, j60.a bottomDialog, zrj.a exceedOverallBudgetDialogProvider, asj.j setBudgetsSharedStateProvider, SetCategoryBudgetsScreenContract$InputData inputData, x stateMapper) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(transactionCategorisationInteractor, "transactionCategorisationInteractor");
        Intrinsics.checkNotNullParameter(jointBudgetingDataSynchronizer, "jointBudgetingDataSynchronizer");
        Intrinsics.checkNotNullParameter(budgetingCycleInteractor, "budgetingCycleInteractor");
        Intrinsics.checkNotNullParameter(budgetingInteractor, "budgetingInteractor");
        Intrinsics.checkNotNullParameter(spentAmountsLoader, "spentAmountsLoader");
        Intrinsics.checkNotNullParameter(amountFormatter, "amountFormatter");
        Intrinsics.checkNotNullParameter(setCategoryBudgetsDomainStateMapper, "setCategoryBudgetsDomainStateMapper");
        Intrinsics.checkNotNullParameter(bottomDialog, "bottomDialog");
        Intrinsics.checkNotNullParameter(exceedOverallBudgetDialogProvider, "exceedOverallBudgetDialogProvider");
        Intrinsics.checkNotNullParameter(setBudgetsSharedStateProvider, "setBudgetsSharedStateProvider");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.f108498p = transactionCategorisationInteractor;
        this.f108499q = jointBudgetingDataSynchronizer;
        this.f108500r = budgetingCycleInteractor;
        this.f108501s = budgetingInteractor;
        this.f108502t = spentAmountsLoader;
        this.u = amountFormatter;
        this.v = setCategoryBudgetsDomainStateMapper;
        this.f108503w = bottomDialog;
        this.f108504x = exceedOverallBudgetDialogProvider;
        this.f108505y = setBudgetsSharedStateProvider;
        this.z = inputData;
        z1 z1VarB = vkm.q.b(0, 2, ukm.f.DROP_OLDEST);
        z1VarB.k(Unit.f186387a);
        this.A = z1VarB;
        this.B = new i(new Data(null, null, true, 3, null));
    }

    @Override // yji.l
    public final void T1(long j2) {
        Continuation continuation = null;
        if (this.z.f101557c instanceof AccountId.Joint) {
            n2(new t(this, null), new whi.b(6));
        }
        yji.l.b1(this, vkm.q.Q(new q0(this.A, new co7.c(this, continuation, 5), 1), new bw4.s(continuation, this, 25)), null, new ck7.j(this, continuation, 18), 3);
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.B;
    }

    public final void y2() {
        g gVar = (g) ((i) t2()).f108482a.getContent();
        if (gVar == null) {
            return;
        }
        dj0.d overallBudget = gVar.f108479a;
        List list = gVar.f108480b;
        List list2 = list;
        dj0.d.Companion.getClass();
        dj0.d dVar = dj0.d.e;
        int i = 0;
        dj0.d categoriesSum = dVar;
        int i2 = 0;
        for (Object obj2 : list2) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                zhm.v.s();
                throw null;
            }
            categoriesSum = i2 == 0 ? ((CategoryBudgetEditingInfo) obj2).f101549c : pyd.c.O(categoriesSum, ((CategoryBudgetEditingInfo) obj2).f101549c);
            i2 = i3;
        }
        boolean zF = categoriesSum.f(overallBudget);
        SetCategoryBudgetsScreenContract$InputData setCategoryBudgetsScreenContract$InputData = this.z;
        if (zF && setCategoryBudgetsScreenContract$InputData.d) {
            this.f108504x.getClass();
            Intrinsics.checkNotNullParameter(overallBudget, "overallBudget");
            Intrinsics.checkNotNullParameter(categoriesSum, "categoriesSum");
            this.f108503w.x(new y(zhm.u.c(new um0("ITEM_ID_EXCEED_OVERALL_BUDGET_ACTIONS", new tm0(LargeActionButton.ButtonStyle.f58726b, null, new TextLocalisedClause(R$string.common_action_cancel, null, null, 14), true, null, null, 48), new tm0(LargeActionButton.ButtonStyle.f58725a, null, new TextLocalisedClause(R$string.common_action_confirm, null, null, 14), true, null, null, 48), (Object) null, (AnalyticsContext) null, (AnalyticsContext) null, 0, 0, 0, 1016)), new rp0.t(new TextLocalisedClause(com.revolut.retail.feature.impl.budgeting.R$string.analytics_limit_increase_alert_title_format, zhm.u.c(new MoneyClause(pyd.c.H(categoriesSum, overallBudget), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), null, 12), new TextLocalisedClause(com.revolut.retail.feature.impl.budgeting.R$string.analytics_limit_increase_alert_description, zhm.u.c(new MoneyClause(categoriesSum, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), null, 12), null, 28), null, null, null, null, 1020));
            return;
        }
        int i5 = r.f108496b[setCategoryBudgetsScreenContract$InputData.f101556b.ordinal()];
        if (i5 != 1) {
            if (i5 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            v2(new k(list, overallBudget));
            return;
        }
        if (!setCategoryBudgetsScreenContract$InputData.d) {
            dj0.d.Companion.getClass();
            overallBudget = dj0.d.e;
            for (Object obj3 : list2) {
                int i6 = i + 1;
                if (i < 0) {
                    zhm.v.s();
                    throw null;
                }
                overallBudget = i == 0 ? ((CategoryBudgetEditingInfo) obj3).f101549c : pyd.c.O(overallBudget, ((CategoryBudgetEditingInfo) obj3).f101549c);
                i = i6;
            }
        }
        v2(new l(list, overallBudget));
    }
}
