package gvi;

import com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.traveller_details.AsftTravellerDetailsScreen;
import com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.traveller_details.AsftTravellerDetailsScreenContract$DomainState$TravellerDetails;
import com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.traveller_details.AsftTravellerDetailsScreenContract$InputData;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.text.d0;
import vkm.j2;
import zhm.w;

/* JADX INFO: loaded from: classes10.dex */
public final class e extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ AsftTravellerDetailsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(AsftTravellerDetailsScreen asftTravellerDetailsScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = asftTravellerDetailsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new e(this.v, continuation, 0);
            default:
                return new e(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((e) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        AsftTravellerDetailsScreen asftTravellerDetailsScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((r) asftTravellerDetailsScreen.R2()).B2();
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                r rVar = (r) asftTravellerDetailsScreen.R2();
                List<AsftTravellerDetailsScreenContract$DomainState$TravellerDetails> list = ((h) ((j2) rVar.f147200t.f22677a).getValue()).f147181b;
                ArrayList<AsftTravellerDetailsScreenContract$DomainState$TravellerDetails> arrayList = new ArrayList(w.t(list, 10));
                for (AsftTravellerDetailsScreenContract$DomainState$TravellerDetails asftTravellerDetailsScreenContract$DomainState$TravellerDetails : list) {
                    arrayList.add(new AsftTravellerDetailsScreenContract$DomainState$TravellerDetails(d0.F0(asftTravellerDetailsScreenContract$DomainState$TravellerDetails.f98904a).toString(), d0.F0(asftTravellerDetailsScreenContract$DomainState$TravellerDetails.f98905b).toString()));
                }
                AsftTravellerDetailsScreenContract$InputData asftTravellerDetailsScreenContract$InputData = rVar.o;
                if (asftTravellerDetailsScreenContract$InputData.d) {
                    String str = asftTravellerDetailsScreenContract$InputData.f98907b;
                    ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
                    for (AsftTravellerDetailsScreenContract$DomainState$TravellerDetails asftTravellerDetailsScreenContract$DomainState$TravellerDetails2 : arrayList) {
                        arrayList2.add(new bti.j(asftTravellerDetailsScreenContract$DomainState$TravellerDetails2.f98904a, asftTravellerDetailsScreenContract$DomainState$TravellerDetails2.f98905b));
                    }
                    rVar.f147198r.d3(new bti.i(str, arrayList2, null, asftTravellerDetailsScreenContract$InputData.f98908c, null));
                } else {
                    rVar.C2(new k(arrayList));
                }
                break;
        }
        return Unit.f186387a;
    }
}
