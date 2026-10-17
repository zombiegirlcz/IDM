package f33;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.feature.card_order_new.impl.kompot.screen.delivery_methods.DeliveryMethodsController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class c extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ DeliveryMethodsController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(DeliveryMethodsController deliveryMethodsController, Continuation continuation) {
        super(2, continuation);
        this.v = deliveryMethodsController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        c cVar = new c(this.v, continuation);
        cVar.u = obj2;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((SelectableDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        SelectableDelegate.Model model = (SelectableDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        i iVarR2 = this.v.R2();
        RowDelegate.Model model2 = (RowDelegate.Model) model.f53305b;
        h hVar = (h) iVarR2;
        hVar.getClass();
        Intrinsics.checkNotNullParameter(model2, "model");
        Object obj3 = model2.u;
        d93.b bVar = obj3 instanceof d93.b ? (d93.b) obj3 : null;
        if (bVar != null) {
            hVar.l2(new esa.i(hVar, bVar, null, 17), new yi5.b(26));
        }
        return Unit.f186387a;
    }
}
