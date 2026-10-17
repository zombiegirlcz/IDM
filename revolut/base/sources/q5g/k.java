package q5g;

import com.revolut.feature.travel.flights.impl.ui.screen.checkout.TravelFlightsCheckoutScreen;
import com.revolut.kompot.common.ExternalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class k extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ TravelFlightsCheckoutScreen f242384w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(TravelFlightsCheckoutScreen travelFlightsCheckoutScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f242384w = travelFlightsCheckoutScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                k kVar = new k(this.f242384w, continuation, 0);
                kVar.v = obj2;
                return kVar;
            default:
                k kVar2 = new k(this.f242384w, continuation, 1);
                kVar2.v = obj2;
                return kVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((k) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((k) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        TravelFlightsCheckoutScreen travelFlightsCheckoutScreen = this.f242384w;
        switch (i) {
            case 0:
                ty0.a clickData = (ty0.a) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                b0 b0VarE3 = travelFlightsCheckoutScreen.R2();
                Intrinsics.h(clickData);
                com.revolut.feature.travel.flights.impl.ui.screen.checkout.b bVar = (com.revolut.feature.travel.flights.impl.ui.screen.checkout.b) b0VarE3;
                bVar.getClass();
                Intrinsics.checkNotNullParameter(clickData, "clickData");
                String str = clickData.f275445a;
                if (Intrinsics.f(str, "FLIGHTS_CHECKOUT_TERMS_URL")) {
                    Object obj3 = clickData.d;
                    String str2 = obj3 instanceof String ? (String) obj3 : null;
                    if (str2 != null) {
                        bVar.C1(new ExternalDestination.Browser(str2, null));
                    }
                } else if (Intrinsics.f(str, "FLIGHTS_CHECKOUT_REVPOINTS_TERMS")) {
                    bVar.n2(new pwb.p(bVar, null, 13), new whi.b(6));
                }
                break;
            default:
                String id10 = (String) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                b0 b0VarE32 = travelFlightsCheckoutScreen.R2();
                Intrinsics.h(id10);
                com.revolut.feature.travel.flights.impl.ui.screen.checkout.b bVar2 = (com.revolut.feature.travel.flights.impl.ui.screen.checkout.b) b0VarE32;
                bVar2.getClass();
                Intrinsics.checkNotNullParameter(id10, "id");
                ((lzb.a) bVar2.f93312r).b3(id10, m1c.e0.FLIGHTS);
                break;
        }
        return Unit.f186387a;
    }
}
