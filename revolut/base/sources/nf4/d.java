package nf4;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.calculator.CalculatorScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import n68.x;

/* JADX INFO: loaded from: classes22.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ CalculatorScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(CalculatorScreen calculatorScreen, Continuation continuation) {
        super(2, continuation);
        this.u = calculatorScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new d(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((FullScreenStateDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.calculator.c cVar = (com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.calculator.c) this.u.d();
        cVar.getClass();
        cVar.n2(new x(cVar, null, 10), new n7h.c(cVar, 24));
        return Unit.f186387a;
    }
}
