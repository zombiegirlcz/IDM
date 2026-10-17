package j98;

import aii.u;
import com.revolut.feature.junior.card_request.impl.ui.flow.request_review.CardRequestReviewFlow;
import com.revolut.feature.junior.card_request.impl.ui.flow.request_review.CardRequestReviewFlowContract$InputData;
import com.revolut.feature.junior_card.api.JuniorCardRequestApi$Toggles;
import com.revolut.feature.junior_card.api.navigation.CardRequestReviewConfig;
import dki.g;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class a implements ohi.a, nte.a {
    @Override // nte.a
    public final List e() {
        return JuniorCardRequestApi$Toggles.a();
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (!(destination instanceof CardRequestReviewConfig.ReviewDestination)) {
            return null;
        }
        CardRequestReviewConfig.ReviewDestination reviewDestination = (CardRequestReviewConfig.ReviewDestination) destination;
        String str = reviewDestination.f76857a;
        return new CardRequestReviewFlow(new CardRequestReviewFlowContract$InputData(reviewDestination.f76858b, str, reviewDestination.d, reviewDestination.f76859c));
    }
}
