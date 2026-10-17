package d9g;

import android.content.Context;
import com.revolut.feature.travel.hotels.api.navigation.TravelHotelsFeatureConfig;
import com.revolut.feature.travel.hotels.impl.declaration.kompot.TravelHotelsBookingDetailsDestination;
import com.revolut.feature.travel.hotels.impl.declaration.kompot.TravelHotelsBookingDetailsParams;
import com.revolut.feature.travel.hotels.impl.declaration.kompot.TravelHotelsCheckoutDestination;
import com.revolut.feature.travel.hotels.impl.declaration.kompot.TravelHotelsCheckoutParams;
import com.revolut.feature.travel.hotels.impl.declaration.kompot.TravelHotelsRoomsSelectionKompotDestination;
import com.revolut.feature.travel.hotels.impl.declaration.kompot.TravelHotelsRoomsSelectionParams;
import com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig;
import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.retail.core.navigation.ActivityAnimation;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.feature.FeatureConfig;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import sri.m;

/* JADX INFO: loaded from: classes9.dex */
public final class f implements o8g.a {
    @Override // uri.a
    public final boolean b(FeatureConfig config) {
        Intrinsics.checkNotNullParameter(config, "config");
        return config instanceof TravelHotelsFeatureConfig;
    }

    @Override // uri.a
    public final void c(m navigator, Context context, FeatureConfig featureConfig) {
        TravelHotelsFeatureConfig config = (TravelHotelsFeatureConfig) featureConfig;
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(config, "config");
        if (config instanceof TravelHotelsFeatureConfig.BookingDetails) {
            TravelHotelsFeatureConfig.BookingDetails bookingDetails = (TravelHotelsFeatureConfig.BookingDetails) config;
            navigator.c(new FeatureCommand(new KompotBridgeFeatureConfig((ActivityAnimation) null, (ParcelableDestination) new TravelHotelsBookingDetailsDestination(new TravelHotelsBookingDetailsParams(bookingDetails.f93624a, bookingDetails.f93625b)), false, (Integer) null, 0, 61)));
        } else if (config instanceof TravelHotelsFeatureConfig.Checkout) {
            TravelHotelsFeatureConfig.Checkout checkout = (TravelHotelsFeatureConfig.Checkout) config;
            navigator.c(new FeatureCommand(new KompotBridgeFeatureConfig((ActivityAnimation) null, (ParcelableDestination) new TravelHotelsCheckoutDestination(new TravelHotelsCheckoutParams(checkout.f93626a, checkout.f93627b)), false, (Integer) null, 0, 61)));
        } else {
            if (!(config instanceof TravelHotelsFeatureConfig.RoomSelection)) {
                throw new NoWhenBranchMatchedException();
            }
            TravelHotelsFeatureConfig.RoomSelection roomSelection = (TravelHotelsFeatureConfig.RoomSelection) config;
            navigator.c(new FeatureCommand(new KompotBridgeFeatureConfig((ActivityAnimation) null, (ParcelableDestination) new TravelHotelsRoomsSelectionKompotDestination(new TravelHotelsRoomsSelectionParams(roomSelection.f93628a, roomSelection.f93629b)), false, (Integer) null, 0, 61)));
        }
    }
}
