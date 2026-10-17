package lm1;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.apm.bills.billers.api.model.Biller;
import com.revolut.feature.apm.bills.billers.impl.ui.search.BillerSearchScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes20.dex */
public final class d extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ BillerSearchScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(BillerSearchScreen billerSearchScreen, Continuation continuation) {
        super(2, continuation);
        this.v = billerSearchScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        d dVar = new d(this.v, continuation);
        dVar.u = obj2;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        j jVarE3 = this.v.d();
        Object obj3 = model.u;
        jVarE3.getClass();
        Biller biller = obj3 instanceof Biller ? (Biller) obj3 : null;
        if (biller != null) {
            jVarE3.C2(new dm1.c(biller));
        }
        return Unit.f186387a;
    }
}
