package ls4;

import com.revolut.feature.credit.card.impl.ui.instalment.repay.anticipation.choose_instalments.CreditCardChooseInstalmentsScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes22.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ CreditCardChooseInstalmentsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(CreditCardChooseInstalmentsScreen creditCardChooseInstalmentsScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = creditCardChooseInstalmentsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new d(this.v, continuation, 0);
            default:
                return new d(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((d) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        CreditCardChooseInstalmentsScreen creditCardChooseInstalmentsScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.credit.card.impl.ui.instalment.repay.anticipation.choose_instalments.a) ((j) creditCardChooseInstalmentsScreen.M.getValue())).C2(g.f199615a);
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.credit.card.impl.ui.instalment.repay.anticipation.choose_instalments.a aVar3 = (com.revolut.feature.credit.card.impl.ui.instalment.repay.anticipation.choose_instalments.a) ((j) creditCardChooseInstalmentsScreen.M.getValue());
                aVar3.C2(new h(aVar3.I2().a(), aVar3.I2().f199612b.f68789b, aVar3.I2().f199612b.f68790c));
                break;
        }
        return Unit.f186387a;
    }
}
