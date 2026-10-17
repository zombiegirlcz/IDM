package wt4;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.feature.credit.card.impl.ui.overdue_explainer.CreditCardOverdueExplainerController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import wr1.s;

/* JADX INFO: loaded from: classes22.dex */
public final class m extends gim.i implements Function2 {
    public final /* synthetic */ CreditCardOverdueExplainerController u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(CreditCardOverdueExplainerController creditCardOverdueExplainerController, Continuation continuation) {
        super(2, continuation);
        this.u = creditCardOverdueExplainerController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new m(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((m) create((FullScreenStateDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        n nVar = (n) this.u.O.getValue();
        nVar.getClass();
        nVar.n2(new s(nVar, null, 3), new whi.b(6));
        return Unit.f186387a;
    }
}
