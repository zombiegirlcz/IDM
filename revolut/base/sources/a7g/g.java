package a7g;

import com.revolut.feature.travel.flights.impl.ui.screen.search_results.TravelFlightsSearchScreen;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import lk0.h;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class g implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1888a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TravelFlightsSearchScreen f1889b;

    public /* synthetic */ g(TravelFlightsSearchScreen travelFlightsSearchScreen, int i) {
        this.f1888a = i;
        this.f1889b = travelFlightsSearchScreen;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i = this.f1888a;
        TravelFlightsSearchScreen travelFlightsSearchScreen = this.f1889b;
        switch (i) {
            case 0:
                c transitionState = (c) obj2;
                TravelFlightsSearchScreen.a aVar = TravelFlightsSearchScreen.Companion;
                Intrinsics.checkNotNullParameter(transitionState, "transitionState");
                travelFlightsSearchScreen.O = transitionState == c.ANIMATING;
                break;
            default:
                TravelFlightsSearchScreen.a aVar2 = TravelFlightsSearchScreen.Companion;
                com.revolut.feature.travel.flights.impl.ui.screen.search_results.b bVar = (com.revolut.feature.travel.flights.impl.ui.screen.search_results.b) travelFlightsSearchScreen.e3();
                bVar.getClass();
                h.b event = h.b.f196176a;
                Intrinsics.checkNotNullParameter(event, "event");
                bVar.v.onNext(event);
                break;
        }
        return Unit.f186387a;
    }
}
