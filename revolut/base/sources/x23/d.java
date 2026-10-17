package x23;

import com.revolut.core.ui_kit.views.CardPersonalisationView;
import com.revolut.feature.card_order_new.impl.kompot.screen.card_personalisation.CardPersonalisationController;
import com.revolut.feature.card_order_new.impl.kompot.screen.card_personalisation.CardPersonalisationControllerContract$ModalStep;
import com.revolut.feature.cards_core.api.CardsCoreApi$Toggles;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;
import mx0.u2;
import vkm.j2;

/* JADX INFO: loaded from: classes21.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ CardPersonalisationController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(CardPersonalisationController cardPersonalisationController, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = cardPersonalisationController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new d(this.v, continuation, 0);
            case 1:
                return new d(this.v, continuation, 1);
            case 2:
                return new d(this.v, continuation, 2);
            case 3:
                return new d(this.v, continuation, 3);
            case 4:
                return new d(this.v, continuation, 4);
            default:
                return new d(this.v, continuation, 5);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((d) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        CardPersonalisationController cardPersonalisationController = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.card_order_new.impl.kompot.screen.card_personalisation.c cVar = (com.revolut.feature.card_order_new.impl.kompot.screen.card_personalisation.c) cardPersonalisationController.R2();
                if (!((j) ((j2) cVar.f65179y.f22677a).getValue()).e) {
                    cVar.K2();
                }
                break;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.card_order_new.impl.kompot.screen.card_personalisation.c) cardPersonalisationController.R2()).L2();
                break;
            case 2:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.card_order_new.impl.kompot.screen.card_personalisation.c cVar2 = (com.revolut.feature.card_order_new.impl.kompot.screen.card_personalisation.c) cardPersonalisationController.R2();
                cli.y yVar = cVar2.f65179y;
                if (((j) ((j2) yVar.f22677a).getValue()).e) {
                    cVar2.H2(yVar, new x1.n(21));
                    CardPersonalisationView cardPersonalisationView = ((CardPersonalisationController) cVar2.f65175s.f302493a).d3().f211227c;
                    cardPersonalisationView.post(new u2(cardPersonalisationView, 1));
                } else {
                    oki.h.v2(cVar2.z, new CardPersonalisationControllerContract$ModalStep.Guidelines(true), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                }
                break;
            case 3:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.card_order_new.impl.kompot.screen.card_personalisation.c cVar3 = (com.revolut.feature.card_order_new.impl.kompot.screen.card_personalisation.c) cardPersonalisationController.R2();
                if (((jte.d) cVar3.f65178x).c(CardsCoreApi$Toggles.AiCardCustomisation.f65554c) || ((j) ((j2) cVar3.f65179y.f22677a).getValue()).f) {
                    cVar3.K2();
                } else {
                    cVar3.M2();
                }
                break;
            case 4:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                KProperty[] kPropertyArr = CardPersonalisationController.T;
                cardPersonalisationController.d3().f211227c.H0();
                ((com.revolut.feature.card_order_new.impl.kompot.screen.card_personalisation.c) cardPersonalisationController.R2()).f65173q.R();
                break;
            default:
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                r70.c.b(((com.revolut.feature.card_order_new.impl.kompot.screen.card_personalisation.c) cardPersonalisationController.R2()).f65174r, 3);
                break;
        }
        return Unit.f186387a;
    }
}
