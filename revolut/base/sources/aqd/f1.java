package aqd;

import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.details.IncomeSortersDetailsController;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes7.dex */
public final class f1 extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ IncomeSortersDetailsController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(IncomeSortersDetailsController incomeSortersDetailsController, Continuation continuation) {
        super(2, continuation);
        this.v = incomeSortersDetailsController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        f1 f1Var = new f1(this.v, continuation);
        f1Var.u = obj2;
        return f1Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f1) create((CellDetailsChevronDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        CellDetailsChevronDelegate.Model model = (CellDetailsChevronDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        String str = model.f51822a;
        boolean zF = Intrinsics.f(str, "PAUSE_SORTER_ID");
        IncomeSortersDetailsController incomeSortersDetailsController = this.v;
        if (zF) {
            com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.details.e eVar = (com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.details.e) incomeSortersDetailsController.d();
            m mVar = (m) ((t) ((j2) eVar.f87766x.f22677a).getValue()).f8402a.getContent();
            if (mVar != null) {
                s sVar = mVar.f8365c;
                if (sVar instanceof p) {
                    r6.b.D("Cannot pause an IS in creation flow");
                } else {
                    if (!(sVar instanceof r)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    eVar.l2(new akl.s1(eVar, sVar, ((r) sVar).f8392c.f99160a, (Continuation) null, 5), new yi5.b(26));
                }
            }
        } else if (Intrinsics.f(str, "DELETE_SORTER_ID")) {
            ((com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.details.e) incomeSortersDetailsController.d()).J2();
        } else {
            hx7.e.n(new IllegalArgumentException(j6.a.q("Unknown id ", model.f51822a)));
        }
        return Unit.f186387a;
    }
}
