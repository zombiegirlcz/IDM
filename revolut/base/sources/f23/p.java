package f23;

import com.revolut.feature.card_order_new.api.CardOrderAccountWrapper;
import com.revolut.feature.card_order_new.impl.kompot.ordernewcard.OrderNewCardFlow;
import com.revolut.feature.card_order_new.impl.kompot.ordernewcard.OrderNewCardFlowContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class p extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ OrderNewCardFlow f131403w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(OrderNewCardFlow orderNewCardFlow, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f131403w = orderNewCardFlow;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                p pVar = new p(this.f131403w, continuation, 0);
                pVar.v = obj2;
                return pVar;
            default:
                p pVar2 = new p(this.f131403w, continuation, 1);
                pVar2.v = obj2;
                return pVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        String str = (String) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((p) create(str, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        OrderNewCardFlow orderNewCardFlow = this.f131403w;
        switch (i) {
            case 0:
                String tabId = (String) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                q qVarE3 = orderNewCardFlow.e3();
                Intrinsics.h(tabId);
                com.revolut.feature.card_order_new.impl.kompot.ordernewcard.a aVar2 = (com.revolut.feature.card_order_new.impl.kompot.ordernewcard.a) qVarE3;
                aVar2.getClass();
                Intrinsics.checkNotNullParameter(tabId, "tabId");
                aVar2.H2(aVar2.getState(), new e2j.i(tabId, 26));
                break;
            default:
                String str = (String) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if (Intrinsics.f(str, "MENU_NOT_NOW_ITEM_ID")) {
                    com.revolut.feature.card_order_new.impl.kompot.ordernewcard.a aVar4 = (com.revolut.feature.card_order_new.impl.kompot.ordernewcard.a) orderNewCardFlow.e3();
                    if (aVar4.o.f65091b instanceof CardOrderAccountWrapper.Junior) {
                        oki.h.v2(aVar4.f65110x, OrderNewCardFlowContract$ModalStep.JuniorSkip.f65100a, ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                    }
                }
                break;
        }
        return Unit.f186387a;
    }
}
