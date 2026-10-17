package qee;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.support.impl.ui.troubleshooting.carddelivery.kompot.CardDeliveryDetailsController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class h extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ CardDeliveryDetailsController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(CardDeliveryDetailsController cardDeliveryDetailsController, Continuation continuation) {
        super(2, continuation);
        this.v = cardDeliveryDetailsController;
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
        a aVarE3 = this.v.d();
        Intrinsics.h(model);
        com.revolut.feature.support.impl.ui.troubleshooting.carddelivery.kompot.a aVar2 = (com.revolut.feature.support.impl.ui.troubleshooting.carddelivery.kompot.a) aVarE3;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        if (Intrinsics.f(model.f53228a, "LIST_ID_DELIVERY_ADDRESS")) {
            aVar2.A1(new q(aVar2, null), new yi5.b(25));
        }
        return Unit.f186387a;
    }
}
