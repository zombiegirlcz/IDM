package lnj;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.retail.feature.esim.impl.ui.screens.subscription_refund.refund.EsimRefundScreen;
import com.revolut.retail.feature.esim.impl.ui.screens.subscription_refund.refund.a;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class d extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ EsimRefundScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(EsimRefundScreen esimRefundScreen, Continuation continuation) {
        super(2, continuation);
        this.v = esimRefundScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        d dVar = new d(this.v, continuation);
        dVar.u = obj2;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((FullScreenStateDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        FullScreenStateDelegate.Model model = (FullScreenStateDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        h hVarE3 = this.v.d();
        String listId = model.f52373a;
        com.revolut.retail.feature.esim.impl.ui.screens.subscription_refund.refund.c cVar = (com.revolut.retail.feature.esim.impl.ui.screens.subscription_refund.refund.c) hVarE3;
        cVar.getClass();
        Intrinsics.checkNotNullParameter(listId, "listId");
        if (Intrinsics.f(listId, "ID_BUTTON_EMPTY_STATE_GET_HELP")) {
            cVar.C2(a.C0624a.f101453a);
        } else if (Intrinsics.f(listId, "ID_BUTTON_GENERAL_ERROR")) {
            cVar.f101459s.a();
        }
        return Unit.f186387a;
    }
}
