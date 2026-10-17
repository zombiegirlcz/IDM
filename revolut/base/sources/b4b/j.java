package b4b;

import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.feature.retail.cfd.api.domain.models.Fee;
import com.revolut.feature.retail.cfd.api.domain.models.MarginQuote;
import com.revolut.feature.retail.cfd.impl.screens.order.v2.CfdOrderFormController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes6.dex */
public final class j extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ CfdOrderFormController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(CfdOrderFormController cfdOrderFormController, Continuation continuation) {
        super(2, continuation);
        this.v = cfdOrderFormController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        j jVar = new j(this.v, continuation);
        jVar.u = obj2;
        return jVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((j) create((CenteredAmountDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        MarginQuote marginQuote;
        Fee fee2;
        CenteredAmountDelegate.Model model = (CenteredAmountDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        q qVarK3 = this.v.k3();
        Intrinsics.h(model);
        com.revolut.feature.retail.cfd.impl.screens.order.v2.a aVar2 = (com.revolut.feature.retail.cfd.impl.screens.order.v2.a) qVarK3;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        bw0.m mVar = model.e;
        if (Intrinsics.f(mVar != null ? mVar.e : null, d4b.a.f111259a) && (marginQuote = (MarginQuote) ((n) ((j2) aVar2.J.f22677a).getValue()).d.getContent()) != null && (fee2 = marginQuote.f82116l) != null) {
            aVar2.B.x(((l4b.n) aVar2.F).a(fee2));
        }
        return Unit.f186387a;
    }
}
