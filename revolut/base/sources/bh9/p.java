package bh9;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.feature.pay_bills_taxes.impl.ui_catalogue.screen.search.BillsSearchScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class p extends gim.i implements Function2 {
    public final /* synthetic */ BillsSearchScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(BillsSearchScreen billsSearchScreen, Continuation continuation) {
        super(2, continuation);
        this.u = billsSearchScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new p(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((p) create((FullScreenStateDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        t tVar = (t) this.u.d();
        tVar.H2(tVar.f15289w, new bek.a(17));
        tVar.l2(new s(tVar, null, 0), new ax9.d(1, tVar, t.class, "handleFieldsFetchError", "handleFieldsFetchError(Ljava/lang/Throwable;)Z", 0, 18));
        return Unit.f186387a;
    }
}
