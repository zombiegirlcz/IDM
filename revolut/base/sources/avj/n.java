package avj;

import com.revolut.feature.address.common.api.flow.AddressFlowContract$OutputData;
import com.revolut.feature.address.models.Address;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class n implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10058a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.retail.feature.impl.travel_trips.ui.screen.travel_itinerary.add_event.b f10059b;

    public /* synthetic */ n(com.revolut.retail.feature.impl.travel_trips.ui.screen.travel_itinerary.add_event.b bVar, int i) {
        this.f10058a = i;
        this.f10059b = bVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f10058a) {
            case 0:
                Throwable error = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(error, "error");
                com.revolut.retail.feature.impl.travel_trips.ui.screen.travel_itinerary.add_event.b bVar = this.f10059b;
                yji.l.b1(bVar, bVar.X1(abk.c.b(bVar.f101635q, error)), null, null, 7);
                break;
            case 1:
                bvj.b result = (bvj.b) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                com.revolut.retail.feature.impl.travel_trips.ui.screen.travel_itinerary.add_event.b bVar2 = this.f10059b;
                bVar2.H2(bVar2.f101637s, new auj.o(result, 4));
                break;
            case 2:
                evj.b result2 = (evj.b) obj2;
                Intrinsics.checkNotNullParameter(result2, "result");
                com.revolut.retail.feature.impl.travel_trips.ui.screen.travel_itinerary.add_event.b bVar3 = this.f10059b;
                bVar3.H2(bVar3.f101637s, new auj.o(result2, 5));
                break;
            default:
                AddressFlowContract$OutputData result3 = (AddressFlowContract$OutputData) obj2;
                Intrinsics.checkNotNullParameter(result3, "result");
                Address address = result3.f60940a;
                if (Intrinsics.f(address, Address.INSTANCE.getEMPTY())) {
                    address = null;
                }
                com.revolut.retail.feature.impl.travel_trips.ui.screen.travel_itinerary.add_event.b bVar4 = this.f10059b;
                bVar4.H2(bVar4.f101637s, new p(address, 0));
                break;
        }
        return Unit.f186387a;
    }
}
