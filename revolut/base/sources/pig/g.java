package pig;

import com.revolut.feature.travel.miles.api.model.TravelMilesRate;
import com.revolut.feature.travel.miles.impl.ui.screen.transfer.TravelMilesTransferScreen;
import com.revolut.feature.travel.miles.impl.ui.screen.transfer.TravelMilesTransferScreenContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import om4.m1;
import vkm.j2;

/* JADX INFO: loaded from: classes9.dex */
public final class g extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ TravelMilesTransferScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(TravelMilesTransferScreen travelMilesTransferScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = travelMilesTransferScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new g(this.v, continuation, 0);
            case 1:
                return new g(this.v, continuation, 1);
            case 2:
                return new g(this.v, continuation, 2);
            case 3:
                return new g(this.v, continuation, 3);
            default:
                return new g(this.v, continuation, 4);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((g) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        TravelMilesTransferScreen travelMilesTransferScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.travel.miles.impl.ui.screen.transfer.a) travelMilesTransferScreen.d()).B2();
                break;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.travel.miles.impl.ui.screen.transfer.a aVar3 = (com.revolut.feature.travel.miles.impl.ui.screen.transfer.a) travelMilesTransferScreen.d();
                aVar3.u.Q();
                TravelMilesRate travelMilesRate = (TravelMilesRate) ((j) ((j2) aVar3.z.f22677a).getValue()).e.getContent();
                if (travelMilesRate != null) {
                    aVar3.l2(new pdi.j(aVar3, travelMilesRate, null, 14), new m1(1, aVar3, com.revolut.feature.travel.miles.impl.ui.screen.transfer.a.class, "handleTopUpError", "handleTopUpError(Ljava/lang/Throwable;)Z", 0, 27));
                }
                break;
            case 2:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.travel.miles.impl.ui.screen.transfer.a aVar5 = (com.revolut.feature.travel.miles.impl.ui.screen.transfer.a) travelMilesTransferScreen.d();
                aVar5.H2(aVar5.z, new phc.e(20));
                break;
            case 3:
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.travel.miles.impl.ui.screen.transfer.a aVar7 = (com.revolut.feature.travel.miles.impl.ui.screen.transfer.a) travelMilesTransferScreen.d();
                aVar7.H2(aVar7.z, new phc.e(19));
                break;
            default:
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                oki.h.v2(((com.revolut.feature.travel.miles.impl.ui.screen.transfer.a) travelMilesTransferScreen.d()).A, TravelMilesTransferScreenContract$ModalStep.BreakdownBottomSheet.f94386a, ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                break;
        }
        return Unit.f186387a;
    }
}
