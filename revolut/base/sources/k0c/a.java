package k0c;

import com.revolut.feature.rev_points.api.navigation.terms.RevPointsTermsReviewInputData;
import com.revolut.feature.rev_points.impl.ui.terms_review.flow.RevPointsTermsReviewFlow;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class a {
    public static RevPointsTermsReviewFlow a(RevPointsTermsReviewInputData input) {
        Intrinsics.checkNotNullParameter(input, "input");
        return new RevPointsTermsReviewFlow(input);
    }
}
