package f9g;

import com.revolut.feature.travel.hotels.api.navigation.TravelHotelsFeatureConfig;
import com.revolut.feature.travel.hotels.impl.declaration.kompot.TravelHotelsCheckoutDestination;
import com.revolut.feature.travel.hotels.impl.declaration.kompot.TravelHotelsCheckoutParams;
import com.revolut.feature.travel.hotels.impl.declaration.kompot.TravelHotelsRoomsSelectionKompotDestination;
import com.revolut.feature.travel.hotels.impl.declaration.kompot.TravelHotelsRoomsSelectionParams;
import com.revolut.feature_travel_hotels_models.property.HotelsProperty;
import com.revolut.retail.core.navigation.FeatureCommand;
import java.util.concurrent.Callable;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import rfm.o;
import rfm.u;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class d implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f132943a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ HotelsProperty f132944b;

    public /* synthetic */ d(HotelsProperty hotelsProperty, int i) {
        this.f132943a = i;
        this.f132944b = hotelsProperty;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        final afi.a draft = (afi.a) obj2;
        switch (this.f132943a) {
            case 0:
                Intrinsics.checkNotNullParameter(draft, "draft");
                final int i = 1;
                final HotelsProperty hotelsProperty = this.f132944b;
                return new o(new Callable() { // from class: f9g.j
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        switch (i) {
                            case 0:
                                return new TravelHotelsCheckoutDestination(new TravelHotelsCheckoutParams(draft.f4100a, hotelsProperty.f97981a));
                            default:
                                return new TravelHotelsRoomsSelectionKompotDestination(new TravelHotelsRoomsSelectionParams(draft.f4100a, hotelsProperty.f97981a));
                        }
                    }
                });
            case 1:
                Intrinsics.checkNotNullParameter(draft, "draft");
                final int i2 = 0;
                final HotelsProperty hotelsProperty2 = this.f132944b;
                return new o(new Callable() { // from class: f9g.j
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        switch (i2) {
                            case 0:
                                return new TravelHotelsCheckoutDestination(new TravelHotelsCheckoutParams(draft.f4100a, hotelsProperty2.f97981a));
                            default:
                                return new TravelHotelsRoomsSelectionKompotDestination(new TravelHotelsRoomsSelectionParams(draft.f4100a, hotelsProperty2.f97981a));
                        }
                    }
                });
            default:
                Intrinsics.checkNotNullParameter(draft, "draft");
                u uVarG = efm.k.g(new FeatureCommand(new TravelHotelsFeatureConfig.RoomSelection(draft.f4100a, this.f132944b.f97981a)));
                Intrinsics.checkNotNullExpressionValue(uVarG, "just(...)");
                return uVarG;
        }
    }
}
