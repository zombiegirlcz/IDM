package xqa;

import com.revolut.feature.push_to_card.api.model.CardEligibility;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CardEligibility f308142a;

    public g(CardEligibility eligibility) {
        Intrinsics.checkNotNullParameter(eligibility, "eligibility");
        this.f308142a = eligibility;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f308142a, ((g) obj2).f308142a);
    }

    public final int hashCode() {
        return this.f308142a.hashCode();
    }
}
