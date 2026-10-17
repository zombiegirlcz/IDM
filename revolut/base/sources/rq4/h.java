package rq4;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.credit.card.impl.ui.credit_limit_cap.CreditLimitCapChangeScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes22.dex */
public final class h extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ CreditLimitCapChangeScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(CreditLimitCapChangeScreen creditLimitCapChangeScreen, Continuation continuation) {
        super(2, continuation);
        this.v = creditLimitCapChangeScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        h hVar = new h(this.v, continuation);
        hVar.u = obj2;
        return hVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((h) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        ((com.revolut.feature.credit.card.impl.ui.credit_limit_cap.c) this.v.e3()).I2(model.f53228a);
        return Unit.f186387a;
    }
}
