package l4g;

import com.revolut.feature.travel.flights.impl.ui.flow.home.TravelFlightsHomeFlow;
import com.revolut.feature.travel.flights.impl.ui.flow.home.TravelFlightsHomeFlowContract$PagerItem;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l0c.s;
import m1c.e0;
import mx0.p6;
import yhm.o;

/* JADX INFO: loaded from: classes9.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ TravelFlightsHomeFlow f192108w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(TravelFlightsHomeFlow travelFlightsHomeFlow, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f192108w = travelFlightsHomeFlow;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                c cVar = new c(this.f192108w, continuation, 0);
                cVar.v = obj2;
                return cVar;
            default:
                c cVar2 = new c(this.f192108w, continuation, 1);
                cVar2.v = obj2;
                return cVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((c) create((p6) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((c) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object next;
        int i = this.u;
        TravelFlightsHomeFlow travelFlightsHomeFlow = this.f192108w;
        switch (i) {
            case 0:
                p6 p6Var = (p6) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                d dVarE3 = travelFlightsHomeFlow.e3();
                String tabId = p6Var.f209928b;
                l lVar = (l) dVarE3;
                lVar.getClass();
                Intrinsics.checkNotNullParameter(tabId, "tabId");
                Iterator it8 = lVar.f192122q.iterator();
                while (true) {
                    if (it8.hasNext()) {
                        next = it8.next();
                        if (Intrinsics.f(((TravelFlightsHomeFlowContract$PagerItem) next).getF94249a(), tabId)) {
                        }
                    } else {
                        next = null;
                    }
                }
                TravelFlightsHomeFlowContract$PagerItem travelFlightsHomeFlowContract$PagerItem = (TravelFlightsHomeFlowContract$PagerItem) next;
                if (travelFlightsHomeFlowContract$PagerItem != null) {
                    lVar.H2(lVar.f192123r, new s(travelFlightsHomeFlowContract$PagerItem, 11));
                }
                break;
            default:
                String id10 = (String) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                d dVarE32 = travelFlightsHomeFlow.e3();
                Intrinsics.h(id10);
                l lVar2 = (l) dVarE32;
                lVar2.getClass();
                Intrinsics.checkNotNullParameter(id10, "id");
                ((lzb.a) lVar2.f192121p).b3(id10, e0.FLIGHTS);
                break;
        }
        return Unit.f186387a;
    }
}
