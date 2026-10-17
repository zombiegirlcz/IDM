package anc;

import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.robo.impl.ui.screen.edit_goal.EditGoalScreen;
import com.revolut.feature.robo.impl.ui.screen.edit_goal.EditGoalScreenContract$ModalStep;
import com.revolut.feature.wealth.models.robo.PortfolioGoal;
import com.revolut.kompot.common.ModalDestination;
import java.time.YearMonth;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;

/* JADX INFO: loaded from: classes6.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ EditGoalScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(EditGoalScreen editGoalScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = editGoalScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new d(this.v, continuation, 0);
            case 1:
                return new d(this.v, continuation, 1);
            case 2:
                return new d(this.v, continuation, 2);
            default:
                return new d(this.v, continuation, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((d) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((d) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((d) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((d) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        EditGoalScreen editGoalScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.robo.impl.ui.screen.edit_goal.a aVar2 = (com.revolut.feature.robo.impl.ui.screen.edit_goal.a) editGoalScreen.e3();
                YearMonth yearMonth = ((e) ((j2) aVar2.f85136s.f22677a).getValue()).f6744c;
                if (yearMonth != null) {
                    oki.h.v2(aVar2.f85137t, new EditGoalScreenContract$ModalStep.PickTargetDate(yearMonth), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                }
                break;
            case 1:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.robo.impl.ui.screen.edit_goal.a aVar4 = (com.revolut.feature.robo.impl.ui.screen.edit_goal.a) editGoalScreen.e3();
                y yVar = aVar4.f85136s;
                j2 j2Var = (j2) yVar.f22677a;
                j2 j2Var2 = (j2) yVar.f22677a;
                Data data = ((e) j2Var.getValue()).f6742a;
                od0.i iVar = data != null ? (od0.i) data.getContent() : null;
                dj0.d dVar = ((e) j2Var2.getValue()).f6743b;
                YearMonth yearMonth2 = ((e) j2Var2.getValue()).f6744c;
                Data data2 = ((e) j2Var2.getValue()).d;
                Boolean bool = data2 != null ? (Boolean) data2.getContent() : null;
                if (iVar != null && dVar != null && yearMonth2 != null && bool != null) {
                    boolean zBooleanValue = bool.booleanValue();
                    if (dVar.f115082a > 0) {
                        PortfolioGoal portfolioGoal = new PortfolioGoal(dVar, yearMonth2);
                        aVar4.C2(((PortfolioGoal) iVar.f224257a) == null ? new i(portfolioGoal) : new k(portfolioGoal, zBooleanValue));
                    }
                }
                break;
            case 2:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.robo.impl.ui.screen.edit_goal.a) editGoalScreen.e3()).C2(j.f6749a);
                break;
            default:
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.robo.impl.ui.screen.edit_goal.a) editGoalScreen.e3()).C2(h.f6747a);
                break;
        }
        return Unit.f186387a;
    }
}
