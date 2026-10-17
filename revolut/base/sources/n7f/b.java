package n7f;

import cli.y;
import com.revolut.core.ui_kit.delegates.SingleChoiceDelegate;
import com.revolut.feature.trading.managed_portfolios.impl.domain.investor_update.model.InvestorUpdate;
import com.revolut.feature.trading.managed_portfolios.impl.ui.investor_update.history.pages.InvestorUpdateHistoryPageScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import n3j.w;
import skm.a2;
import vkm.j2;
import yhm.o;

/* JADX INFO: loaded from: classes8.dex */
public final class b extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ InvestorUpdateHistoryPageScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(InvestorUpdateHistoryPageScreen investorUpdateHistoryPageScreen, Continuation continuation) {
        super(2, continuation);
        this.v = investorUpdateHistoryPageScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        b bVar = new b(this.v, continuation);
        bVar.u = obj2;
        return bVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((SingleChoiceDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        SingleChoiceDelegate.Model model = (SingleChoiceDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        Object obj3 = model.f;
        Continuation continuation = null;
        InvestorUpdate investorUpdate = obj3 instanceof InvestorUpdate ? (InvestorUpdate) obj3 : null;
        if (investorUpdate != null) {
            h hVar = (h) this.v.Q.getValue();
            String investorUpdateId = investorUpdate.f91237a;
            com.revolut.feature.trading.managed_portfolios.impl.ui.investor_update.history.pages.a aVar2 = (com.revolut.feature.trading.managed_portfolios.impl.ui.investor_update.history.pages.a) hVar;
            aVar2.getClass();
            Intrinsics.checkNotNullParameter(investorUpdateId, "investorUpdateId");
            y yVar = aVar2.f91369q;
            Object value = ((j2) yVar.f22677a).getValue();
            d dVar = value instanceof d ? (d) value : null;
            if (dVar != null && !Intrinsics.f(dVar.f213083b, investorUpdateId)) {
                aVar2.H2(yVar, new n45.b(dVar, investorUpdateId, 18));
                a2 a2Var = aVar2.f91368p;
                if (a2Var != null) {
                    a2Var.f(null);
                }
                aVar2.f91368p = aVar2.n2(new w(aVar2, investorUpdateId, continuation, 9), new whi.b(6));
            }
        }
        return Unit.f186387a;
    }
}
