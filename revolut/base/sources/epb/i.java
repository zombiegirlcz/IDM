package epb;

import com.revolut.feature.retail.savings.impl.ui.fund_information.holdings_breakdown.HoldingsBreakdownController;
import com.revolut.feature.retail.savings.impl.ui.fund_information.holdings_breakdown.HoldingsBreakdownControllerContract$InputData;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import yhm.o;
import yji.l;

/* JADX INFO: loaded from: classes6.dex */
public final class i extends gim.i implements Function2 {
    public final /* synthetic */ j u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j jVar, Continuation continuation) {
        super(2, continuation);
        this.u = jVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new i(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((i) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        j jVar = this.u;
        l.j2(jVar, new HoldingsBreakdownController(new HoldingsBreakdownControllerContract$InputData(jVar.I2())), ModalDestination.Style.POPUP.f98311a, null, 2);
        return Unit.f186387a;
    }
}
