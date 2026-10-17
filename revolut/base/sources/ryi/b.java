package ryi;

import com.revolut.kompot.common.ModalDestination;
import com.revolut.retail.feature.airportlounges.impl.ui.screens.refund.AirportLoungePassDetailsRefundScreen;
import com.revolut.retail.feature.airportlounges.impl.ui.screens.refund.AirportLoungePassDetailsRefundScreenContract$ModalStep;
import ip0.e8;
import ip0.u8;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import svi.v;
import vkm.j2;
import yhm.o;
import zhm.w;

/* JADX INFO: loaded from: classes10.dex */
public final class b extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ AirportLoungePassDetailsRefundScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(AirportLoungePassDetailsRefundScreen airportLoungePassDetailsRefundScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = airportLoungePassDetailsRefundScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new b(this.v, continuation, 0);
            case 1:
                return new b(this.v, continuation, 1);
            case 2:
                return new b(this.v, continuation, 2);
            case 3:
                return new b(this.v, continuation, 3);
            default:
                return new b(this.v, continuation, 4);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((b) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((b) create((u8) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((b) create((u8) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((b) create((e8) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((b) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        Continuation continuation = null;
        AirportLoungePassDetailsRefundScreen airportLoungePassDetailsRefundScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                airportLoungePassDetailsRefundScreen.m2().onBackPressed();
                break;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                com.revolut.retail.feature.airportlounges.impl.ui.screens.refund.a aVar3 = (com.revolut.retail.feature.airportlounges.impl.ui.screens.refund.a) airportLoungePassDetailsRefundScreen.d();
                aVar3.getClass();
                aVar3.n2(new mt8.b(aVar3, true, null, 9), new whi.b(6));
                break;
            case 2:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                com.revolut.retail.feature.airportlounges.impl.ui.screens.refund.a aVar5 = (com.revolut.retail.feature.airportlounges.impl.ui.screens.refund.a) airportLoungePassDetailsRefundScreen.d();
                aVar5.getClass();
                aVar5.n2(new mt8.b(aVar5, false, null, 9), new whi.b(6));
                break;
            case 3:
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                oki.h.v2(((com.revolut.retail.feature.airportlounges.impl.ui.screens.refund.a) airportLoungePassDetailsRefundScreen.d()).f99147r, AirportLoungePassDetailsRefundScreenContract$ModalStep.AboutYourRefund.f99144a, ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                break;
            default:
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                com.revolut.retail.feature.airportlounges.impl.ui.screens.refund.a aVar8 = (com.revolut.retail.feature.airportlounges.impl.ui.screens.refund.a) airportLoungePassDetailsRefundScreen.d();
                List list = ((c) ((j2) aVar8.f99146q.f22677a).getValue()).f258377b;
                ArrayList arrayList = new ArrayList(w.t(list, 10));
                Iterator it8 = list.iterator();
                while (it8.hasNext()) {
                    arrayList.add(((v) it8.next()).f266004a);
                }
                aVar8.l2(new rm6.c(aVar8, arrayList, continuation, 25), new yi5.b(26));
                break;
        }
        return Unit.f186387a;
    }
}
