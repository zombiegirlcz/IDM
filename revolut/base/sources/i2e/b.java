package i2e;

import aii.e;
import aii.g;
import aii.p;
import aii.u;
import com.google.common.collect.ImmutableSet;
import com.revolut.feature.rev_points.giftcards.api.navigation.RevPointsGiftcardsDestination;
import com.revolut.feature.shops.api.config.ShopsFeatureConfig;
import com.revolut.feature.store.api.declaration.StoreApi$Toggles$Store;
import com.revolut.feature.store.api.declaration.StoreApi$Toggles$StoreDealsAndBrands;
import com.revolut.feature.store.api.declaration.StoreApi$Toggles$StoreExclusives;
import com.revolut.feature.store.api.navigation.BrandDetailTab;
import com.revolut.feature.store.api.navigation.StoreDescriptor;
import com.revolut.feature.store.api.navigation.StoreDestination;
import com.revolut.feature.store.api.navigation.StoreTab;
import com.revolut.feature.store.impl.ui.root.StoreFlow;
import com.revolut.feature.store.impl.ui.root.StoreFlowContract$InputData;
import com.revolut.feature.store.impl.ui.root.StoreFlowContract$Step;
import h30.q;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import t1e.s;
import zhm.v;

/* JADX INFO: loaded from: classes7.dex */
public final class b implements p, nte.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f157928a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f157929b;

    public b(ImmutableSet deeplinkGateways, q storeAvailabilityInteractor) {
        Intrinsics.checkNotNullParameter(deeplinkGateways, "deeplinkGateways");
        Intrinsics.checkNotNullParameter(storeAvailabilityInteractor, "storeAvailabilityInteractor");
        this.f157928a = deeplinkGateways;
        this.f157929b = storeAvailabilityInteractor;
    }

    public static StoreFlow a(StoreDestination.StartType.OpenStoreHome openStoreHome) {
        return new StoreFlow(new StoreFlowContract$InputData(new StoreFlowContract$Step.OpenHome(openStoreHome.f88620a, openStoreHome.f88621b)));
    }

    @Override // nhi.f
    public final g c(e descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (!(descriptor instanceof StoreDescriptor)) {
            return null;
        }
        StoreDescriptor storeDescriptor = (StoreDescriptor) descriptor;
        return storeDescriptor.a(a(new StoreDestination.StartType.OpenStoreHome(storeDescriptor.f88612a.f88613a, 2)));
    }

    @Override // nte.a
    public final List e() {
        return v.k(StoreApi$Toggles$Store.f88419c, StoreApi$Toggles$StoreExclusives.f88421c, StoreApi$Toggles$StoreDealsAndBrands.f88420c);
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, dki.g flowModel) {
        s sVar;
        Object next;
        RevPointsGiftcardsDestination.StartType.OpenGiftcardsDetails openGiftcardsDetails;
        String str;
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (destination instanceof StoreDestination) {
            StoreDestination.StartType startType = ((StoreDestination) destination).f88614b;
            if (startType instanceof StoreDestination.StartType.OpenStoreHome) {
                return a((StoreDestination.StartType.OpenStoreHome) startType);
            }
            if (!(startType instanceof StoreDestination.StartType.OpenBrandDetail)) {
                throw new NoWhenBranchMatchedException();
            }
            StoreDestination.StartType.OpenBrandDetail openBrandDetail = (StoreDestination.StartType.OpenBrandDetail) startType;
            return new StoreFlow(new StoreFlowContract$InputData(new StoreFlowContract$Step.OpenBrandDetail(openBrandDetail.f88617a, openBrandDetail.f88618b, openBrandDetail.f88619c, openBrandDetail.d)));
        }
        boolean z = destination instanceof RevPointsGiftcardsDestination;
        q qVar = this.f157929b;
        StoreTab storeTab = StoreTab.Brands.f88622a;
        if (z) {
            if (qVar.F0()) {
                RevPointsGiftcardsDestination.StartType startType2 = ((RevPointsGiftcardsDestination) destination).f83655b;
                if (startType2 instanceof RevPointsGiftcardsDestination.StartType.OpenGiftcardsHome) {
                    RevPointsGiftcardsDestination.GiftcardsHomePagerItem giftcardsHomePagerItem = ((RevPointsGiftcardsDestination.StartType.OpenGiftcardsHome) startType2).f83664a;
                    if (giftcardsHomePagerItem instanceof RevPointsGiftcardsDestination.GiftcardsHomePagerItem.Discover) {
                        return a(new StoreDestination.StartType.OpenStoreHome(storeTab, s.GIFTCARDS.c()));
                    }
                    if (Intrinsics.f(giftcardsHomePagerItem, RevPointsGiftcardsDestination.GiftcardsHomePagerItem.MyCards.f83658a)) {
                        return a(new StoreDestination.StartType.OpenStoreHome(StoreTab.YourItems.f88625a, 2));
                    }
                    throw new NoWhenBranchMatchedException();
                }
                if ((startType2 instanceof RevPointsGiftcardsDestination.StartType.OpenGiftcardsDetails) && (str = (openGiftcardsDetails = (RevPointsGiftcardsDestination.StartType.OpenGiftcardsDetails) startType2).f83663c) != null && openGiftcardsDetails.f83662b == null) {
                    BrandDetailTab.Redeem redeem = BrandDetailTab.Redeem.f88611a;
                    new StoreDestination.StartType.OpenBrandDetail(str, null, redeem, null);
                    return new StoreFlow(new StoreFlowContract$InputData(new StoreFlowContract$Step.OpenBrandDetail(str, null, redeem, null)));
                }
            }
        } else if (qVar.F0() && (destination instanceof ShopsFeatureConfig.Home.Destination)) {
            String pillId = ((ShopsFeatureConfig.Home.Destination) destination).f86987a;
            if (pillId != null) {
                s.Companion.getClass();
                Intrinsics.checkNotNullParameter(pillId, "pillId");
                Iterator<E> it8 = s.b().iterator();
                while (true) {
                    if (!it8.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it8.next();
                    if (Intrinsics.f(((s) next).getId(), pillId)) {
                        break;
                    }
                }
                sVar = (s) next;
            } else {
                sVar = null;
            }
            String strC = sVar != null ? sVar.c() : null;
            if (sVar == null) {
                storeTab = StoreTab.Deals.f88623a;
            }
            return a(new StoreDestination.StartType.OpenStoreHome(storeTab, strC));
        }
        return null;
    }

    @Override // aii.p
    public final Set h() {
        return this.f157928a;
    }
}
