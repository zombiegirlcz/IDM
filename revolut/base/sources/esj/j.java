package esj;

import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.retail.feature.impl.budgeting.R$string;
import com.revolut.retail.feature.impl.budgeting.ui.rev10.set_budgets.set_overall_budget.SetOverallBudgetScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes11.dex */
public final class j extends gim.i implements Function2 {
    public final /* synthetic */ SetOverallBudgetScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(SetOverallBudgetScreen setOverallBudgetScreen, Continuation continuation) {
        super(2, continuation);
        this.u = setOverallBudgetScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new j(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((j) create((CenteredAmountDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        c0 c0Var = (c0) this.u.T2();
        j60.a aVar2 = c0Var.f128963w;
        c0Var.f128965y.getClass();
        rp0.t tVar = new rp0.t(new TextLocalisedClause(R$string.analytics_limit_increase_info_alert_title, null, null, 14), new TextLocalisedClause(R$string.analytics_limit_increase_info_alert_description, null, null, 14), null, 28);
        LargeActionButtonDelegate.Model model = new LargeActionButtonDelegate.Model("ITEM_ID_GOT_IT_ACTION", LargeActionButton.ButtonStyle.f58725a, null, new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_got_it, null, null, 14), false, null, null, null, null, 1000);
        int i = R$attr.uikit_dp24;
        int i2 = R$attr.uikit_dp16;
        yp0.b.p(model, i, i, i2, i2);
        aVar2.x(new rp0.y(zhm.u.c(model), tVar, null, null, null, null, 1020));
        return Unit.f186387a;
    }
}
