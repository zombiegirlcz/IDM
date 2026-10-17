package cbh;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.feature.wealth.impl.ui.invest.transactions.list.screen.InvestTransactionsListScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes9.dex */
public final class i extends gim.i implements Function2 {
    public final /* synthetic */ InvestTransactionsListScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(InvestTransactionsListScreen investTransactionsListScreen, Continuation continuation) {
        super(2, continuation);
        this.u = investTransactionsListScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new i(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((i) create((FullScreenStateDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        y yVar = (y) this.u.d();
        if (yVar.J2()) {
            yVar.C.k(Unit.f186387a);
        } else {
            yVar.f22854s.b3();
        }
        return Unit.f186387a;
    }
}
