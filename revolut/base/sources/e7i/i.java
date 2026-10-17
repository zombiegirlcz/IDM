package e7i;

import com.revolut.core.ui_kit.views.navbar.BasicNavBar;
import com.revolut.feature_move_money.impl.automation.screen.limit.MoveMoneyAutomationLimitScreen;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class i extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ MoveMoneyAutomationLimitScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(MoveMoneyAutomationLimitScreen moveMoneyAutomationLimitScreen, Continuation continuation) {
        super(2, continuation);
        this.v = moveMoneyAutomationLimitScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        i iVar = new i(this.v, continuation);
        iVar.u = obj2;
        return iVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((i) create((BasicNavBar.b) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object next;
        BasicNavBar.b bVar = (BasicNavBar.b) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        if (bVar instanceof com.revolut.core.ui_kit.views.navbar.e) {
            n nVarE3 = this.v.R2();
            String tabId = ((com.revolut.core.ui_kit.views.navbar.e) bVar).f59525a;
            q qVar = (q) nVarE3;
            qVar.getClass();
            Intrinsics.checkNotNullParameter(tabId, "tabId");
            Iterator<E> it8 = ibd.j.a().iterator();
            while (true) {
                if (!it8.hasNext()) {
                    next = null;
                    break;
                }
                next = it8.next();
                if (Intrinsics.f(((ibd.j) next).name(), tabId)) {
                    break;
                }
            }
            ibd.j jVar = (ibd.j) next;
            if (jVar != null) {
                qVar.H2(qVar.f123347q, new e2j.j(jVar, 29));
            }
        }
        return Unit.f186387a;
    }
}
