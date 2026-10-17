package q84;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.credit.application.plugins.impl.ui.debts.OutstandingDebtsFlowContract$Step;
import com.revolut.feature.credit.application.plugins.impl.ui.debts.OutstandingDebtsFlowController;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes22.dex */
public final class f extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ OutstandingDebtsFlowController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(OutstandingDebtsFlowController outstandingDebtsFlowController, Continuation continuation) {
        super(2, continuation);
        this.v = outstandingDebtsFlowController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        f fVar = new f(this.v, continuation);
        fVar.u = obj2;
        return fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        pu3.d dVar;
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        d dVar2 = (d) this.v.P.getValue();
        String listId = model.f53228a;
        Object obj3 = model.u;
        com.revolut.feature.credit.application.plugins.impl.ui.debts.c cVar = (com.revolut.feature.credit.application.plugins.impl.ui.debts.c) dVar2;
        cVar.getClass();
        Intrinsics.checkNotNullParameter(listId, "listId");
        j60.a.v(cVar.f67437t, false, null, 3);
        if (obj3 instanceof b) {
            b bVar = (b) obj3;
            if (i.f242977a[bVar.ordinal()] == 1) {
                oki.h.u2(cVar, cVar.u, OutstandingDebtsFlowContract$Step.AddOtherDebt.f67416a, null, 6);
            } else {
                int i = a.f242970a[bVar.ordinal()];
                if (i == 1) {
                    dVar = pu3.d.MORTGAGE;
                } else if (i == 2) {
                    dVar = pu3.d.LOAN;
                } else {
                    if (i != 3) {
                        if (i != 4) {
                            throw new NoWhenBranchMatchedException();
                        }
                        throw new IllegalStateException("Can't map this state " + bVar + " to dept");
                    }
                    dVar = pu3.d.CREDIT_CARD;
                }
                cVar.l2(new prl.k(cVar, dVar, (Continuation) null, 22), new yi5.b(26));
            }
        }
        return Unit.f186387a;
    }
}
