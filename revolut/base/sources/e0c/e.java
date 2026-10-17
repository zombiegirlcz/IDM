package e0c;

import com.revolut.feature.rev_points.giftcards.api.navigation.RevPointsGiftcardsDestination;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class e extends c0c.d {
    @Override // c0c.d
    public final void Z2(c0c.c clickData) {
        Intrinsics.checkNotNullParameter(clickData, "clickData");
        A2(new RevPointsGiftcardsDestination(new RevPointsGiftcardsDestination.StartType.OpenGiftcardsHome(new RevPointsGiftcardsDestination.GiftcardsHomePagerItem.Discover(false)), null));
    }
}
