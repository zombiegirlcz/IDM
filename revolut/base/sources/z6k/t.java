package z6k;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.retail.feature.payments.money_request.impl.ui_kompot.details.MoneyRequestDetailsNewScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class t extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ MoneyRequestDetailsNewScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(MoneyRequestDetailsNewScreen moneyRequestDetailsNewScreen, Continuation continuation) {
        super(2, continuation);
        this.v = moneyRequestDetailsNewScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        t tVar = new t(this.v, continuation);
        tVar.u = obj2;
        return tVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((t) create((FullScreenStateDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        FullScreenStateDelegate.Model model = (FullScreenStateDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        g gVarE3 = this.v.R2();
        Object obj3 = model.k;
        Intrinsics.i(obj3, "null cannot be cast to non-null type kotlin.String");
        String link = (String) obj3;
        com.revolut.retail.feature.payments.money_request.impl.ui_kompot.details.b bVar = (com.revolut.retail.feature.payments.money_request.impl.ui_kompot.details.b) gVarE3;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(link, "link");
        bVar.l2(new yy6.f(bVar, link, null, 15), new yi5.b(26));
        return Unit.f186387a;
    }
}
