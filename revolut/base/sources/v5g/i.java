package v5g;

import com.revolut.feature.travel.flights.impl.ui.screen.discover.TravelFlightsDiscoverScreenContract$SearchParameters;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class i implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f286221a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TravelFlightsDiscoverScreenContract$SearchParameters f286222b;

    public /* synthetic */ i(TravelFlightsDiscoverScreenContract$SearchParameters travelFlightsDiscoverScreenContract$SearchParameters, int i) {
        this.f286221a = i;
        this.f286222b = travelFlightsDiscoverScreenContract$SearchParameters;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        d update = (d) obj2;
        switch (this.f286221a) {
            case 0:
                Intrinsics.checkNotNullParameter(update, "$this$update");
                update.getClass();
                TravelFlightsDiscoverScreenContract$SearchParameters searchParameters = this.f286222b;
                Intrinsics.checkNotNullParameter(searchParameters, "searchParameters");
                return new d(searchParameters);
            default:
                TravelFlightsDiscoverScreenContract$SearchParameters travelFlightsDiscoverScreenContract$SearchParameters = update.f286218a;
                TravelFlightsDiscoverScreenContract$SearchParameters searchParameters2 = this.f286222b;
                if (Intrinsics.f(travelFlightsDiscoverScreenContract$SearchParameters, searchParameters2)) {
                    return update;
                }
                Intrinsics.checkNotNullParameter(searchParameters2, "searchParameters");
                return new d(searchParameters2);
        }
    }
}
