package p5e;

import com.revolut.feature.structured_note.details.impl.ui.screens.payout_calculator.PayoutCalculatorScreen;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import l2c.l;
import yhm.o;

/* JADX INFO: loaded from: classes7.dex */
public final class c extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ PayoutCalculatorScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(PayoutCalculatorScreen payoutCalculatorScreen, Continuation continuation) {
        super(2, continuation);
        this.v = payoutCalculatorScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        c cVar = new c(this.v, continuation);
        cVar.u = obj2;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((Pair) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Pair pair = (Pair) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        cy0.a aVar2 = (cy0.a) pair.f186386b;
        i iVar = (i) this.v.O.getValue();
        int i = aVar2.f110014a;
        iVar.getClass();
        iVar.H2(iVar.f233110q, new h(new l(i, 7), iVar, 0));
        return Unit.f186387a;
    }
}
