package esj;

import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.retail.common.ui.R$string;
import com.revolut.retail.feature.impl.budgeting.ui.rev10.set_budgets.set_overall_budget.SetOverallBudgetScreen;
import e4k.m0;
import ip0.tm0;
import ip0.um0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class g extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ SetOverallBudgetScreen f128975w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(SetOverallBudgetScreen setOverallBudgetScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f128975w = setOverallBudgetScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                g gVar = new g(this.f128975w, continuation, 0);
                gVar.v = obj2;
                return gVar;
            default:
                g gVar2 = new g(this.f128975w, continuation, 1);
                gVar2.v = obj2;
                return gVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((g) create((CharSequence) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((g) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        SetOverallBudgetScreen setOverallBudgetScreen = this.f128975w;
        switch (i) {
            case 0:
                CharSequence charSequence = (CharSequence) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                v vVarT2 = setOverallBudgetScreen.T2();
                String amountString = charSequence.toString();
                c0 c0Var = (c0) vVarT2;
                c0Var.getClass();
                Intrinsics.checkNotNullParameter(amountString, "amountString");
                w wVar = (w) ((o) c0Var.t2()).f128977a.getContent();
                if (wVar != null) {
                    c0Var.x2(new m0(wVar, c0Var.f128962t.b(amountString, wVar.f.f115083b.f306286a), 2));
                }
                break;
            default:
                String menuItemId = (String) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                v vVarT22 = setOverallBudgetScreen.T2();
                Intrinsics.h(menuItemId);
                c0 c0Var2 = (c0) vVarT22;
                c0Var2.getClass();
                Intrinsics.checkNotNullParameter(menuItemId, "menuItemId");
                if (menuItemId.equals("RESET_BUDGET_MENU_ITEM_ID")) {
                    j60.a aVar3 = c0Var2.f128963w;
                    c0Var2.f128964x.getClass();
                    aVar3.x(new rp0.y(zhm.u.c(new um0("ITEM_ID_RESET_BUDGET", new tm0(LargeActionButton.ButtonStyle.f58726b, null, new TextLocalisedClause(R$string.common_action_cancel, null, null, 14), true, null, null, 48), new tm0(LargeActionButton.ButtonStyle.f58725a, null, new TextLocalisedClause(R$string.common_action_yes, null, null, 14), true, null, null, 48), (Object) null, (AnalyticsContext) null, (AnalyticsContext) null, 0, 0, 0, 1016)), new rp0.t(new TextLocalisedClause(com.revolut.retail.feature.impl.budgeting.R$string.analytics_budgets_reset_dialog_title, null, null, 14), new TextLocalisedClause(com.revolut.retail.feature.impl.budgeting.R$string.analytics_budgets_reset_dialog_description, null, null, 14), null, 28), null, null, null, null, 1020));
                }
                break;
        }
        return Unit.f186387a;
    }
}
