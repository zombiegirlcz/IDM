package bh9;

import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.feature.apm.bills.core.api.model.BillFormField;
import com.revolut.feature.pay_bills_taxes.impl.ui_catalogue.screen.search.BillsSearchScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class o extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ BillsSearchScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(BillsSearchScreen billsSearchScreen, Continuation continuation) {
        super(2, continuation);
        this.v = billsSearchScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        o oVar = new o(this.v, continuation);
        oVar.u = obj2;
        return oVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((o) create((InputTextDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        InputTextDelegate.Model model = (InputTextDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        f fVarE3 = this.v.d();
        Intrinsics.h(model);
        t tVar = (t) fVarE3;
        tVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj3 = model.P;
        if (obj3 instanceof BillFormField) {
            ((jg9.l) tVar.f15284p).d3((BillFormField) obj3, new q(tVar, 0));
        }
        return Unit.f186387a;
    }
}
