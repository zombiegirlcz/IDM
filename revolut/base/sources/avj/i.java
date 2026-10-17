package avj;

import com.revolut.kompot.common.R$id;
import com.revolut.retail.feature.impl.travel_trips.ui.screen.travel_itinerary.add_event.TravelItineraryAddEventContract$InputData;
import com.revolut.retail.feature.impl.travel_trips.ui.screen.travel_itinerary.add_event.TravelItineraryAddEventScreen;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KProperty;
import zhm.u;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class i implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10056a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TravelItineraryAddEventScreen f10057b;

    public /* synthetic */ i(TravelItineraryAddEventScreen travelItineraryAddEventScreen, int i) {
        this.f10056a = i;
        this.f10057b = travelItineraryAddEventScreen;
    }

    /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f10056a;
        TravelItineraryAddEventScreen travelItineraryAddEventScreen = this.f10057b;
        switch (i) {
            case 0:
                KProperty[] kPropertyArr = TravelItineraryAddEventScreen.R;
                TravelItineraryAddEventScreen travelItineraryAddEventScreen2 = this.f10057b;
                return tki.g.a(travelItineraryAddEventScreen2, travelItineraryAddEventScreen2.d(), u.c(travelItineraryAddEventScreen2.M), R$id.screenRecyclerNavbarFooterNextbutton_recyclerView, null, null, new i(travelItineraryAddEventScreen2, 3), 24);
            case 1:
                KProperty[] kPropertyArr2 = TravelItineraryAddEventScreen.R;
                phm.a aVar = (phm.a) ue0.e.j(travelItineraryAddEventScreen.m2()).a().get(xuj.i.class);
                b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                if (aVar2 == null) {
                    throw new IllegalStateException(a0.d.q("Api ", xuj.i.class, " is not found"));
                }
                xuj.i iVar = ((xuj.i) aVar2.b()).f309099m;
                TravelItineraryAddEventContract$InputData travelItineraryAddEventContract$InputData = travelItineraryAddEventScreen.K;
                travelItineraryAddEventContract$InputData.getClass();
                return new xuj.a(iVar, travelItineraryAddEventContract$InputData);
            case 2:
                KProperty[] kPropertyArr3 = TravelItineraryAddEventScreen.R;
                return (g) ((xuj.a) travelItineraryAddEventScreen.P.getValue()).f309075c.get();
            default:
                return rd0.e.b(travelItineraryAddEventScreen.M.e.f121375b);
        }
    }
}
