package nqd;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.list.IncomeSortersListController;
import com.revolut.retail.feature.analytics.models.income_sorter.IncomeSorter;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class i extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ IncomeSortersListController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(IncomeSortersListController incomeSortersListController, Continuation continuation) {
        super(2, continuation);
        this.v = incomeSortersListController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        i iVar = new i(this.v, continuation);
        iVar.u = obj2;
        return iVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((i) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        Object obj3 = model.u;
        IncomeSorter incomeSorter = obj3 instanceof IncomeSorter ? (IncomeSorter) obj3 : null;
        if (incomeSorter != null) {
            o oVar = (o) this.v.d();
            oVar.getClass();
            Intrinsics.checkNotNullParameter(incomeSorter, "incomeSorter");
            oVar.l1().M0(new kqd.m(incomeSorter.f99160a));
        }
        return Unit.f186387a;
    }
}
