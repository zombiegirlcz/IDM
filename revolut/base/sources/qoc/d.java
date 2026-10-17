package qoc;

import com.revolut.core.ui_kit.delegates.ActionWidgetDelegate;
import com.revolut.feature.robo.impl.ui.flow.edit_goal.EditGoalFlow;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import qc0.e1;

/* JADX INFO: loaded from: classes6.dex */
public final class d extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ f v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(f fVar, Continuation continuation) {
        super(2, continuation);
        this.v = fVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        d dVar = new d(this.v, continuation);
        dVar.u = obj2;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((com.revolut.core.ui_kit.delegates.t) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        r rVar = this.v.f248119c;
        com.revolut.core.ui_kit.delegates.t tVar = (com.revolut.core.ui_kit.delegates.t) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        Object obj3 = tVar.f54722b.f51596l;
        Continuation continuation = null;
        b0 b0Var = obj3 instanceof b0 ? (b0) obj3 : null;
        if (b0Var == null) {
            return Unit.f186387a;
        }
        String portfolioId = b0Var.f248099a;
        ActionWidgetDelegate.a aVar2 = tVar.f54721a;
        if (Intrinsics.f(aVar2, ActionWidgetDelegate.a.c.f51609a)) {
            Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
            yji.n.P2(rVar, new EditGoalFlow(new jmc.b(portfolioId, true)), null, null, 3);
        } else if (Intrinsics.f(aVar2, ActionWidgetDelegate.a.d.f51610a)) {
            Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
            rVar.T2(new e1(rVar, portfolioId, continuation, 19), new yi5.b(27));
        } else if (!Intrinsics.f(aVar2, ActionWidgetDelegate.a.C0395a.f51607a) && !Intrinsics.f(aVar2, ActionWidgetDelegate.a.b.f51608a) && !(aVar2 instanceof com.revolut.core.ui_kit.delegates.h)) {
            throw new NoWhenBranchMatchedException();
        }
        return Unit.f186387a;
    }
}
