package moc;

import com.revolut.feature.faq.api.navigation.FaqFeatureConfig;
import com.revolut.kompot.common.ExternalDestination;
import k1h.g;
import k1h.h;
import k1h.i;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import yji.n;
import zh9.u0;

/* JADX INFO: loaded from: classes6.dex */
public final class b extends n implements a {
    public final void Z2(i parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        if (parcel instanceof h) {
            A2(new ExternalDestination.Browser(((h) parcel).f180265a, null));
        } else {
            if (!(parcel instanceof g)) {
                throw new NoWhenBranchMatchedException();
            }
            A2(u0.c(new FaqFeatureConfig.Starter("question.how-is-the-projections-values-of-my-portfolio-calculated", 2)));
        }
    }
}
