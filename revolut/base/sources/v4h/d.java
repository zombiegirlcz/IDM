package v4h;

import cli.j;
import com.revolut.feature.wealth.assetdetails.ui.impl.ratings.credit_quality.CreditQualityScreenContract$RatingsContext;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class d implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CreditQualityScreenContract$RatingsContext f286094a;

    public d(CreditQualityScreenContract$RatingsContext ratingsContext) {
        Intrinsics.checkNotNullParameter(ratingsContext, "ratingsContext");
        this.f286094a = ratingsContext;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f286094a, ((d) obj2).f286094a);
    }

    public final int hashCode() {
        return this.f286094a.hashCode();
    }
}
