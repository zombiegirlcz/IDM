package qee;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.feature.support.impl.ui.troubleshooting.carddelivery.kompot.CardDeliveryDetailsController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import qc0.e1;

/* JADX INFO: loaded from: classes8.dex */
public final class j extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ CardDeliveryDetailsController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(CardDeliveryDetailsController cardDeliveryDetailsController, Continuation continuation) {
        super(2, continuation);
        this.v = cardDeliveryDetailsController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        j jVar = new j(this.v, continuation);
        jVar.u = obj2;
        return jVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((j) create((LargeActionButtonDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        LargeActionButtonDelegate.Model model = (LargeActionButtonDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        a aVarE3 = this.v.d();
        String listId = model.f52613a;
        com.revolut.feature.support.impl.ui.troubleshooting.carddelivery.kompot.a aVar2 = (com.revolut.feature.support.impl.ui.troubleshooting.carddelivery.kompot.a) aVarE3;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(listId, "listId");
        if (Intrinsics.f(listId, "TERMINATE_MCY_CARD_ACTION_ID")) {
            aVar2.A1(new e1(aVar2, null, 5), new yi5.b(25));
        } else if (Intrinsics.f(listId, "TERMINATE_MCY_CARD_CANCEL_BUTTON_ID")) {
            j60.a.v(aVar2.v, false, null, 3);
        }
        return Unit.f186387a;
    }
}
