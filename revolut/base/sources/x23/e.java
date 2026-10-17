package x23;

import com.revolut.feature.card_order_new.impl.kompot.screen.card_personalisation.CardPersonalisationController;
import com.revolut.feature.card_order_new.impl.kompot.screen.card_personalisation.CardPersonalisationControllerContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes21.dex */
public final class e extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ CardPersonalisationController f302467w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(CardPersonalisationController cardPersonalisationController, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f302467w = cardPersonalisationController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                e eVar = new e(this.f302467w, continuation, 0);
                eVar.v = obj2;
                return eVar;
            case 1:
                e eVar2 = new e(this.f302467w, continuation, 1);
                eVar2.v = obj2;
                return eVar2;
            case 2:
                e eVar3 = new e(this.f302467w, continuation, 2);
                eVar3.v = obj2;
                return eVar3;
            case 3:
                e eVar4 = new e(this.f302467w, continuation, 3);
                eVar4.v = obj2;
                return eVar4;
            case 4:
                e eVar5 = new e(this.f302467w, continuation, 4);
                eVar5.v = obj2;
                return eVar5;
            case 5:
                e eVar6 = new e(this.f302467w, continuation, 5);
                eVar6.v = obj2;
                return eVar6;
            default:
                e eVar7 = new e(this.f302467w, continuation, 6);
                eVar7.v = obj2;
                return eVar7;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((e) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((e) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((e) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((e) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 4:
                return ((e) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 5:
                return ((e) create((Integer) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((e) create((Boolean) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        CardPersonalisationController cardPersonalisationController = this.f302467w;
        switch (i) {
            case 0:
                ty0.a aVar = (ty0.a) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                i iVarE3 = cardPersonalisationController.R2();
                Intrinsics.h(aVar);
                ((com.revolut.feature.card_order_new.impl.kompot.screen.card_personalisation.c) iVarE3).N2(aVar);
                break;
            case 1:
                String listId = (String) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                i iVarE32 = cardPersonalisationController.R2();
                Intrinsics.h(listId);
                com.revolut.feature.card_order_new.impl.kompot.screen.card_personalisation.c cVar = (com.revolut.feature.card_order_new.impl.kompot.screen.card_personalisation.c) iVarE32;
                com.revolut.kompot.navigable.vc.modal.a aVar4 = cVar.z;
                cli.y yVar = cVar.f65179y;
                Intrinsics.checkNotNullParameter(listId, "listId");
                int iHashCode = listId.hashCode();
                ModalDestination.Style.POPUP popup = ModalDestination.Style.POPUP.f98311a;
                if (iHashCode != 156865824) {
                    if (iHashCode != 972208655) {
                        if (iHashCode == 1109043304 && listId.equals("TEXT_ICON_LIST_ID")) {
                            cVar.H2(yVar, new x1.n(24));
                        }
                    } else if (listId.equals("EMOJI_ICON_LIST_ID")) {
                        do3.n nVar = (do3.n) ((j) ((j2) yVar.f22677a).getValue()).f302475a.getContent();
                        oki.h.v2(aVar4, new CardPersonalisationControllerContract$ModalStep.EmojiPicker(nVar != null ? do3.q.y(nVar) : null), popup);
                    }
                } else if (listId.equals("GENERATE_ICON_LIST_ID")) {
                    oki.h.v2(aVar4, new CardPersonalisationControllerContract$ModalStep.ImageGeneration(((j) ((j2) yVar.f22677a).getValue()).f302481l), popup);
                }
                break;
            case 2:
                String str = (String) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                i iVarE33 = cardPersonalisationController.R2();
                Intrinsics.h(str);
                ((com.revolut.feature.card_order_new.impl.kompot.screen.card_personalisation.c) iVarE33).O2(str);
                break;
            case 3:
                String listId2 = (String) this.v;
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                i iVarE34 = cardPersonalisationController.R2();
                Intrinsics.h(listId2);
                com.revolut.feature.card_order_new.impl.kompot.screen.card_personalisation.c cVar2 = (com.revolut.feature.card_order_new.impl.kompot.screen.card_personalisation.c) iVarE34;
                cVar2.getClass();
                Intrinsics.checkNotNullParameter(listId2, "listId");
                if (listId2.equals("SKIP_ACTION_LIST_ID")) {
                    cVar2.M2();
                } else if (listId2.equals("DONE_ACTION_LIST_ID")) {
                    cVar2.f65173q.R();
                }
                break;
            case 4:
                ty0.a aVar7 = (ty0.a) this.v;
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                i iVarE35 = cardPersonalisationController.R2();
                Intrinsics.h(aVar7);
                ((com.revolut.feature.card_order_new.impl.kompot.screen.card_personalisation.c) iVarE35).N2(aVar7);
                break;
            case 5:
                Integer num = (Integer) this.v;
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                i iVarE36 = cardPersonalisationController.R2();
                Intrinsics.h(num);
                int iIntValue = num.intValue();
                com.revolut.feature.card_order_new.impl.kompot.screen.card_personalisation.c cVar3 = (com.revolut.feature.card_order_new.impl.kompot.screen.card_personalisation.c) iVarE36;
                cli.y yVar2 = cVar3.f65179y;
                boolean z = ((j) ((j2) yVar2.f22677a).getValue()).f302478g;
                if (z && iIntValue == 0) {
                    cVar3.H2(yVar2, new x1.n(25));
                } else if (!z && iIntValue > 0) {
                    cVar3.H2(yVar2, new x1.n(26));
                }
                break;
            default:
                Boolean bool = (Boolean) this.v;
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                i iVarE37 = cardPersonalisationController.R2();
                Intrinsics.h(bool);
                com.revolut.feature.card_order_new.impl.kompot.screen.card_personalisation.c cVar4 = (com.revolut.feature.card_order_new.impl.kompot.screen.card_personalisation.c) iVarE37;
                cVar4.H2(cVar4.f65179y, new v2e.x(bool.booleanValue(), 16));
                break;
        }
        return Unit.f186387a;
    }
}
