package l5g;

import cli.y;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.travel.flights.impl.ui.screen.checkin.TravelFlightsCheckInScreen;
import com.revolut.feature.travel.flights.impl.ui.screen.checkin.TravelFlightsCheckInScreenContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import l7g.b0;
import oki.h;
import vkm.j2;
import yhm.o;

/* JADX INFO: loaded from: classes9.dex */
public final class b extends i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ TravelFlightsCheckInScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(TravelFlightsCheckInScreen travelFlightsCheckInScreen, Continuation continuation) {
        super(2, continuation);
        this.v = travelFlightsCheckInScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        b bVar = new b(this.v, continuation);
        bVar.u = obj2;
        return bVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        f fVarD3 = this.v.R2();
        Intrinsics.h(model);
        com.revolut.feature.travel.flights.impl.ui.screen.checkin.a aVar2 = (com.revolut.feature.travel.flights.impl.ui.screen.checkin.a) fVarD3;
        y yVar = aVar2.f93291q;
        Intrinsics.checkNotNullParameter(model, "model");
        if (a0.H(model.f53228a, "CHECK_IN_BOUND_", false)) {
            Object obj3 = model.u;
            Integer num = obj3 instanceof Integer ? (Integer) obj3 : null;
            if (num != null) {
                int iIntValue = num.intValue();
                b0 b0Var = (b0) ((e) ((j2) yVar.f22677a).getValue()).f192259b.getContent();
                if (b0Var != null && iIntValue >= 0 && iIntValue < b0Var.f192594p.size()) {
                    h.v2(aVar2.f93292r, new TravelFlightsCheckInScreenContract$ModalStep.CheckInDetails(((e) ((j2) yVar.f22677a).getValue()).f192258a, iIntValue), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                }
            }
        }
        return Unit.f186387a;
    }
}
