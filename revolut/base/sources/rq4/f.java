package rq4;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.feature.credit.card.impl.ui.credit_limit_cap.CreditLimitCapChangeScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes22.dex */
public final class f extends gim.i implements Function2 {
    public final /* synthetic */ CreditLimitCapChangeScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(CreditLimitCapChangeScreen creditLimitCapChangeScreen, Continuation continuation) {
        super(2, continuation);
        this.u = creditLimitCapChangeScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new f(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((FullScreenStateDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        com.revolut.feature.credit.card.impl.ui.credit_limit_cap.c cVar = (com.revolut.feature.credit.card.impl.ui.credit_limit_cap.c) this.u.e3();
        cVar.getClass();
        cVar.n2(new rlh.c(cVar, null, 11), new whi.b(6));
        return Unit.f186387a;
    }
}
