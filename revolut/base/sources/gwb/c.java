package gwb;

import aii.e;
import aii.g;
import aii.p;
import aii.u;
import com.google.common.collect.ImmutableSet;
import com.revolut.feature.rev_points.giftcards.api.RevPointsGiftcardsApi$Toggles;
import com.revolut.feature.rev_points.giftcards.api.navigation.RevPointsGiftcardsDestination;
import com.revolut.feature.rev_points.giftcards.impl.ui.flow.root.RevPointsGiftcardsFlow;
import com.revolut.feature.rev_points.giftcards.impl.ui.flow.root.RevPointsGiftcardsFlowContract$InputData;
import com.revolut.feature.rev_points.giftcards.impl.ui.flow.root.RevPointsGiftcardsFlowContract$Step;
import com.revolut.feature.rev_points.giftcards.impl.ui.screen.checkout.RevPointsGiftcardCheckoutScreen;
import com.revolut.feature.rev_points.giftcards.impl.ui.screen.purchase.RevPointsGiftCardPurchaseScreen;
import h30.q;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import uvb.i;

/* JADX INFO: loaded from: classes13.dex */
public final class c implements p, nte.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f147302a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f147303b;

    public c(ImmutableSet deeplinkGateways, q storeAvailabilityInteractor) {
        Intrinsics.checkNotNullParameter(deeplinkGateways, "deeplinkGateways");
        Intrinsics.checkNotNullParameter(storeAvailabilityInteractor, "storeAvailabilityInteractor");
        this.f147302a = deeplinkGateways;
        this.f147303b = storeAvailabilityInteractor;
    }

    public static RevPointsGiftcardsFlow a(RevPointsGiftcardsDestination revPointsGiftcardsDestination) {
        RevPointsGiftcardsDestination.StartType f83655b = revPointsGiftcardsDestination.getF83655b();
        if (f83655b instanceof RevPointsGiftcardsDestination.StartType.OpenGiftcardsDetails) {
            RevPointsGiftcardsDestination.StartType.OpenGiftcardsDetails openGiftcardsDetails = (RevPointsGiftcardsDestination.StartType.OpenGiftcardsDetails) f83655b;
            return new RevPointsGiftcardsFlow(new RevPointsGiftcardsFlowContract$InputData(new RevPointsGiftcardsFlowContract$Step.OpenGiftcardDetails(openGiftcardsDetails.getF83661a(), openGiftcardsDetails.getF83662b(), null, openGiftcardsDetails.getD(), 4)));
        }
        if (f83655b instanceof RevPointsGiftcardsDestination.StartType.OpenGiftcardsHome) {
            return new RevPointsGiftcardsFlow(new RevPointsGiftcardsFlowContract$InputData(new RevPointsGiftcardsFlowContract$Step.OpenGiftcardsHome(((RevPointsGiftcardsDestination.StartType.OpenGiftcardsHome) f83655b).getF83664a())));
        }
        if (f83655b instanceof RevPointsGiftcardsDestination.StartType.OpenGiftcardsTermsAndConditions) {
            RevPointsGiftcardsDestination.StartType.OpenGiftcardsTermsAndConditions openGiftcardsTermsAndConditions = (RevPointsGiftcardsDestination.StartType.OpenGiftcardsTermsAndConditions) f83655b;
            return new RevPointsGiftcardsFlow(new RevPointsGiftcardsFlowContract$InputData(new RevPointsGiftcardsFlowContract$Step.OpenGiftcardTermsAndConditions(openGiftcardsTermsAndConditions.getF83665a(), openGiftcardsTermsAndConditions.getF83666b())));
        }
        if (f83655b instanceof RevPointsGiftcardsDestination.StartType.UsedAndExpiredCards) {
            return new RevPointsGiftcardsFlow(new RevPointsGiftcardsFlowContract$InputData(RevPointsGiftcardsFlowContract$Step.UsedAndExpiredCards.f83694a));
        }
        if (f83655b instanceof RevPointsGiftcardsDestination.StartType.DownloadCards) {
            return new RevPointsGiftcardsFlow(new RevPointsGiftcardsFlowContract$InputData(RevPointsGiftcardsFlowContract$Step.DownloadCards.f83686a));
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // nhi.f
    public final g c(e descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (descriptor instanceof i) {
            i iVar = (i) descriptor;
            return iVar.a(new RevPointsGiftCardPurchaseScreen(iVar.b()));
        }
        if (descriptor instanceof uvb.a) {
            uvb.a aVar = (uvb.a) descriptor;
            return aVar.a(new RevPointsGiftcardCheckoutScreen(aVar.b()));
        }
        super.c(descriptor);
        return null;
    }

    @Override // nte.a
    public final List e() {
        return RevPointsGiftcardsApi$Toggles.a();
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, dki.g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (!(destination instanceof RevPointsGiftcardsDestination)) {
            return null;
        }
        if (!this.f147303b.F0()) {
            return a((RevPointsGiftcardsDestination) destination);
        }
        RevPointsGiftcardsDestination revPointsGiftcardsDestination = (RevPointsGiftcardsDestination) destination;
        RevPointsGiftcardsDestination.StartType f83655b = revPointsGiftcardsDestination.getF83655b();
        if (f83655b instanceof RevPointsGiftcardsDestination.StartType.OpenGiftcardsHome) {
            return null;
        }
        if (!(f83655b instanceof RevPointsGiftcardsDestination.StartType.OpenGiftcardsDetails)) {
            return a(revPointsGiftcardsDestination);
        }
        RevPointsGiftcardsDestination.StartType.OpenGiftcardsDetails openGiftcardsDetails = (RevPointsGiftcardsDestination.StartType.OpenGiftcardsDetails) f83655b;
        if (openGiftcardsDetails.getF83663c() == null || openGiftcardsDetails.getF83662b() != null) {
            return a(revPointsGiftcardsDestination);
        }
        return null;
    }

    @Override // aii.p
    public final Set h() {
        return this.f147302a;
    }
}
