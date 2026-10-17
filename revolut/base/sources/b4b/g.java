package b4b;

import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.feature.retail.cfd.api.domain.models.FeeBreakdownItem;
import com.revolut.feature.retail.cfd.impl.screens.order.v2.CfdOrderFormController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class g extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ CfdOrderFormController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(CfdOrderFormController cfdOrderFormController, Continuation continuation) {
        super(2, continuation);
        this.v = cfdOrderFormController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        g gVar = new g(this.v, continuation);
        gVar.u = obj2;
        return gVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g) create((CellDetailsDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        CellDetailsDelegate.Model model = (CellDetailsDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        q qVarK3 = this.v.k3();
        Intrinsics.h(model);
        com.revolut.feature.retail.cfd.impl.screens.order.v2.a aVar2 = (com.revolut.feature.retail.cfd.impl.screens.order.v2.a) qVarK3;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj3 = model.o;
        if (obj3 instanceof FeeBreakdownItem) {
            aVar2.B.x(((l4b.b) aVar2.G).a((FeeBreakdownItem) obj3));
        }
        return Unit.f186387a;
    }
}
