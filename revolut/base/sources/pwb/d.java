package pwb;

import com.revolut.feature.rev_points.giftcards.impl.ui.flow.home.RevPointsGiftcardsHomePagerFlow;
import com.revolut.feature.rev_points.giftcards.impl.ui.flow.home.RevPointsGiftcardsHomePagerFlowContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import mx0.p6;

/* JADX INFO: loaded from: classes6.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ RevPointsGiftcardsHomePagerFlow f240377w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(RevPointsGiftcardsHomePagerFlow revPointsGiftcardsHomePagerFlow, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f240377w = revPointsGiftcardsHomePagerFlow;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                d dVar = new d(this.f240377w, continuation, 0);
                dVar.v = obj2;
                return dVar;
            default:
                d dVar2 = new d(this.f240377w, continuation, 1);
                dVar2.v = obj2;
                return dVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((d) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((d) create((p6) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        RevPointsGiftcardsHomePagerFlow revPointsGiftcardsHomePagerFlow = this.f240377w;
        switch (i) {
            case 0:
                String id10 = (String) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                e eVarE3 = revPointsGiftcardsHomePagerFlow.e3();
                Intrinsics.h(id10);
                com.revolut.feature.rev_points.giftcards.impl.ui.flow.home.c cVar = (com.revolut.feature.rev_points.giftcards.impl.ui.flow.home.c) eVarE3;
                cVar.getClass();
                Intrinsics.checkNotNullParameter(id10, "id");
                if (id10.equals("REV_POINTS_BALANCE_MENU_ID")) {
                    oki.h.v2(cVar.u, RevPointsGiftcardsHomePagerFlowContract$ModalStep.Balance.f83673a, ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                }
                break;
            default:
                p6 p6Var = (p6) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.rev_points.giftcards.impl.ui.flow.home.c) revPointsGiftcardsHomePagerFlow.e3()).I2(p6Var.f209928b);
                break;
        }
        return Unit.f186387a;
    }
}
