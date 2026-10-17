package cnc;

import com.revolut.core.ui_kit.delegates.ProductSelectionDelegate;
import com.revolut.feature.robo.impl.ui.screen.manage_goal.ManageGoalScreen;
import com.revolut.feature.robo.impl.ui.screen.manage_goal.ManageGoalScreenContract$ModalStep;
import com.revolut.feature.wealth.api.declaration.DualAddMoneyDestination;
import com.revolut.feature.wealth.api.navigation.models.RecurringDepositSchedule;
import com.revolut.feature.wealth.models.addmoney.TransferSubjectId;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.shared.feature.wealth.models.account.WealthAccountType;
import java.time.LocalDate;
import java.time.temporal.TemporalUnit;
import k4l.c0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class c extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ ManageGoalScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(ManageGoalScreen manageGoalScreen, Continuation continuation) {
        super(2, continuation);
        this.v = manageGoalScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        c cVar = new c(this.v, continuation);
        cVar.u = obj2;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((ProductSelectionDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        ProductSelectionDelegate.Model model = (ProductSelectionDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        Object obj3 = model.i;
        boolean z = obj3 instanceof h;
        ManageGoalScreen manageGoalScreen = this.v;
        if (z) {
            f fVarE3 = manageGoalScreen.R2();
            h hVar = (h) obj3;
            c0 period = hVar.f25391a;
            dj0.d amount = hVar.f25392b;
            String str = hVar.f25393c;
            com.revolut.feature.robo.impl.ui.screen.manage_goal.a aVar2 = (com.revolut.feature.robo.impl.ui.screen.manage_goal.a) fVarE3;
            aVar2.getClass();
            Intrinsics.checkNotNullParameter(period, "period");
            Intrinsics.checkNotNullParameter(amount, "amount");
            TransferSubjectId.Portfolio portfolio = new TransferSubjectId.Portfolio(aVar2.o.f25389a);
            WealthAccountType wealthAccountType = WealthAccountType.ROBO;
            LocalDate localDatePlus = ((l80.f) aVar2.f85142s).e().plus(1L, (TemporalUnit) hx7.b.y(period));
            Intrinsics.checkNotNullExpressionValue(localDatePlus, "plus(...)");
            aVar2.C1(new DualAddMoneyDestination(portfolio, wealthAccountType, null, amount, new RecurringDepositSchedule(localDatePlus, period), str, false));
        } else if (obj3 instanceof g) {
            f fVarE32 = manageGoalScreen.R2();
            dj0.d amount2 = ((g) obj3).f25390a;
            com.revolut.feature.robo.impl.ui.screen.manage_goal.a aVar3 = (com.revolut.feature.robo.impl.ui.screen.manage_goal.a) fVarE32;
            aVar3.getClass();
            Intrinsics.checkNotNullParameter(amount2, "amount");
            aVar3.C1(new DualAddMoneyDestination(new TransferSubjectId.Portfolio(aVar3.o.f25389a), WealthAccountType.ROBO, amount2, null, null, null, false));
        } else if (obj3 instanceof i) {
            oki.h.v2(((com.revolut.feature.robo.impl.ui.screen.manage_goal.a) manageGoalScreen.R2()).A, ManageGoalScreenContract$ModalStep.EditGoal.f85138a, ModalDestination.Style.FULLSCREEN_SLIDE_FROM_BOTTOM.f98309a);
        }
        return Unit.f186387a;
    }
}
