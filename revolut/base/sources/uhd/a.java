package uhd;

import aii.e;
import aii.g;
import aii.p;
import aii.u;
import com.google.common.collect.ImmutableSet;
import com.revolut.feature.shops.api.config.ShopsFeatureConfig;
import com.revolut.feature.shops.api.config.ShopsFeatureConfig$AuctionBid$Destination;
import com.revolut.feature.shops.api.config.ShopsFeatureConfig$CampaignCheckout$Destination;
import com.revolut.feature.shops.api.config.ShopsFeatureConfig$CampaignCheckout$ModalDestination;
import com.revolut.feature.shops.api.config.ShopsFeatureConfig$CarouselDetails$Destination;
import com.revolut.feature.shops.api.config.ShopsFeatureConfig$NotificationsConsent$Destination;
import com.revolut.feature.shops.api.config.ShopsFeatureConfig$PersonalizedOffers$Destination;
import com.revolut.feature.shops.api.config.ShopsFeatureConfig$PersonalizedOffersFullscreen$Destination;
import com.revolut.feature.shops.api.declaration.ShopsApi$Toggles$AuctionsCustomBid;
import com.revolut.feature.shops.api.declaration.ShopsApi$Toggles$ShopsHomeFloatingButton;
import com.revolut.feature.shops.api.declaration.ShopsApi$Toggles$ShopsHomeScreenWidgetRedesign;
import com.revolut.feature.shops.api.declaration.ShopsApi$Toggles$ShopsInStore;
import com.revolut.feature.shops.api.declaration.ShopsApi$Toggles$ShopsLite;
import com.revolut.feature.shops.api.declaration.ShopsApi$Toggles$ShopsLoyalty;
import com.revolut.feature.shops.api.declaration.ShopsApi$Toggles$ShopsNearbyRewardsWidget;
import com.revolut.feature.shops.api.navigation.descriptor.ShopsItemsDetailsController$InputData;
import com.revolut.feature.shops.impl.flow.checkout.ModalCheckoutFlow;
import com.revolut.feature.shops.impl.flow.checkout.ModalCheckoutFlowContract$InputData;
import com.revolut.feature.shops.impl.flow.session.ShopsSessionFlow;
import com.revolut.feature.shops.impl.flow.session.ShopsSessionFlowContract$InputData;
import com.revolut.feature.shops.impl.ui.details.ShopsCampaignCheckoutScreen;
import com.revolut.feature.shops.impl.ui.details.ShopsCampaignCheckoutScreenContract$InputData;
import com.revolut.feature.shops.impl.ui.items_details.ShopsItemsDetailsScreen;
import com.revolut.feature.shops.impl.ui.items_details.ShopsItemsDetailsScreenContract$InputData;
import com.revolut.feature.shops.impl.ui.notification_opt_in.ShopsNotificationOptInScreen;
import com.revolut.feature.shops.impl.ui.personalized_opt_in.ShopsAdsPersonalizedOffersOptInScreen;
import com.revolut.feature.shops.impl.ui.personalized_opt_in.ShopsAdsPersonalizedOffersOptInScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import gc0.c;
import h30.q;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import ogk.b;
import zhm.v;

/* JADX INFO: loaded from: classes7.dex */
public final class a implements p, nte.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f280220a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f280221b;

    public a(ImmutableSet deeplinkGateways, q storeAvailabilityInteractor) {
        Intrinsics.checkNotNullParameter(deeplinkGateways, "deeplinkGateways");
        Intrinsics.checkNotNullParameter(storeAvailabilityInteractor, "storeAvailabilityInteractor");
        this.f280220a = deeplinkGateways;
        this.f280221b = storeAvailabilityInteractor;
    }

    public static ViewController a(u uVar) {
        if (uVar instanceof ShopsFeatureConfig.Home.Destination) {
            return new ShopsSessionFlow(new ShopsSessionFlowContract$InputData.Home(((ShopsFeatureConfig.Home.Destination) uVar).f86987a));
        }
        if (uVar instanceof ShopsFeatureConfig$CarouselDetails$Destination) {
            ShopsFeatureConfig$CarouselDetails$Destination shopsFeatureConfig$CarouselDetails$Destination = (ShopsFeatureConfig$CarouselDetails$Destination) uVar;
            return new ShopsSessionFlow(new ShopsSessionFlowContract$InputData.CarouselDetails(shopsFeatureConfig$CarouselDetails$Destination.f86984a, shopsFeatureConfig$CarouselDetails$Destination.f86985b));
        }
        if (uVar instanceof ShopsFeatureConfig$CampaignCheckout$Destination) {
            return new ShopsCampaignCheckoutScreen(new ShopsCampaignCheckoutScreenContract$InputData(((ShopsFeatureConfig$CampaignCheckout$Destination) uVar).f86982a));
        }
        if (uVar instanceof ShopsFeatureConfig$CampaignCheckout$ModalDestination) {
            return new ModalCheckoutFlow(new ModalCheckoutFlowContract$InputData(((ShopsFeatureConfig$CampaignCheckout$ModalDestination) uVar).f86983a));
        }
        if (uVar instanceof ShopsFeatureConfig$PersonalizedOffers$Destination) {
            return c.b(new ShopsAdsPersonalizedOffersOptInScreen(new ShopsAdsPersonalizedOffersOptInScreenContract$InputData(((ShopsFeatureConfig$PersonalizedOffers$Destination) uVar).f86993a)), new b(24));
        }
        if (uVar instanceof ShopsFeatureConfig$NotificationsConsent$Destination) {
            return c.b(new ShopsNotificationOptInScreen(), new b(25));
        }
        if (uVar instanceof ShopsFeatureConfig$PersonalizedOffersFullscreen$Destination) {
            ShopsFeatureConfig$PersonalizedOffersFullscreen$Destination shopsFeatureConfig$PersonalizedOffersFullscreen$Destination = (ShopsFeatureConfig$PersonalizedOffersFullscreen$Destination) uVar;
            return new ShopsSessionFlow(new ShopsSessionFlowContract$InputData.FullScreenPrompt(shopsFeatureConfig$PersonalizedOffersFullscreen$Destination.f86995b, shopsFeatureConfig$PersonalizedOffersFullscreen$Destination.f86994a));
        }
        if (uVar instanceof ShopsFeatureConfig.Map.Destination) {
            return new ShopsSessionFlow(new ShopsSessionFlowContract$InputData.Map(((ShopsFeatureConfig.Map.Destination) uVar).f86990a));
        }
        if (!(uVar instanceof ShopsFeatureConfig$AuctionBid$Destination)) {
            return null;
        }
        ShopsFeatureConfig$AuctionBid$Destination shopsFeatureConfig$AuctionBid$Destination = (ShopsFeatureConfig$AuctionBid$Destination) uVar;
        return new ShopsSessionFlow(new ShopsSessionFlowContract$InputData.AuctionBid(shopsFeatureConfig$AuctionBid$Destination.f86980a, shopsFeatureConfig$AuctionBid$Destination.f86981b));
    }

    @Override // nhi.f
    public final g c(e descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (!(descriptor instanceof thd.a)) {
            super.c(descriptor);
            return null;
        }
        thd.a aVar = (thd.a) descriptor;
        ShopsItemsDetailsController$InputData shopsItemsDetailsController$InputData = aVar.f271366a;
        return aVar.a(new ShopsItemsDetailsScreen(new ShopsItemsDetailsScreenContract$InputData(shopsItemsDetailsController$InputData.f87081a, shopsItemsDetailsController$InputData.f87082b, shopsItemsDetailsController$InputData.f87083c, shopsItemsDetailsController$InputData.d, shopsItemsDetailsController$InputData.e, shopsItemsDetailsController$InputData.f, shopsItemsDetailsController$InputData.f87084g, shopsItemsDetailsController$InputData.f87085h, shopsItemsDetailsController$InputData.i)));
    }

    @Override // nte.a
    public final List e() {
        return v.k(ShopsApi$Toggles$ShopsHomeFloatingButton.f86997c, ShopsApi$Toggles$ShopsLite.f87000c, ShopsApi$Toggles$ShopsLoyalty.f87001c, ShopsApi$Toggles$ShopsInStore.f86999c, ShopsApi$Toggles$ShopsNearbyRewardsWidget.f87002c, ShopsApi$Toggles$ShopsHomeScreenWidgetRedesign.f86998c, ShopsApi$Toggles$AuctionsCustomBid.f86996c);
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, dki.g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (this.f280221b.F0() && (destination instanceof ShopsFeatureConfig.Home.Destination)) {
            return null;
        }
        return a(destination);
    }

    @Override // aii.p
    public final Set h() {
        return this.f280220a;
    }
}
