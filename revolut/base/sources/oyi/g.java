package oyi;

import aw0.n6;
import com.revolut.retail.feature.airportlounges.impl.ui.screens.pass_refund.AirportLoungesPassRefundScreen;
import com.revolut.retail.feature.airportlounges.impl.ui.screens.pass_refund.a;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;
import yhm.o;

/* JADX INFO: loaded from: classes10.dex */
public final class g extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ AirportLoungesPassRefundScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(AirportLoungesPassRefundScreen airportLoungesPassRefundScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = airportLoungesPassRefundScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new g(this.v, continuation, 0);
            case 1:
                return new g(this.v, continuation, 1);
            default:
                return new g(this.v, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((g) create((n6) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        AirportLoungesPassRefundScreen airportLoungesPassRefundScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((com.revolut.retail.feature.airportlounges.impl.ui.screens.pass_refund.c) airportLoungesPassRefundScreen.R2()).C2(a.C0608a.f99138a);
                break;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                com.revolut.retail.feature.airportlounges.impl.ui.screens.pass_refund.c cVar = (com.revolut.retail.feature.airportlounges.impl.ui.screens.pass_refund.c) airportLoungesPassRefundScreen.R2();
                if (((b) ((j2) cVar.f99142r.f22677a).getValue()).f231039a.getContent() != null) {
                    cVar.l2(new i(cVar, null, 1), new yi5.b(26));
                }
                break;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                com.revolut.retail.feature.airportlounges.impl.ui.screens.pass_refund.c cVar2 = (com.revolut.retail.feature.airportlounges.impl.ui.screens.pass_refund.c) airportLoungesPassRefundScreen.R2();
                c cVar3 = cVar2.o;
                cVar2.C2(new d(cVar3.f231043c, cVar3.d));
                break;
        }
        return Unit.f186387a;
    }
}
