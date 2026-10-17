package xqa;

import com.revolut.feature.push_to_card.api.model.CardEligibility;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wi0.b f308140a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CardEligibility f308141b;

    public f(wi0.b preselectedCountry, CardEligibility eligibility) {
        Intrinsics.checkNotNullParameter(preselectedCountry, "preselectedCountry");
        Intrinsics.checkNotNullParameter(eligibility, "eligibility");
        this.f308140a = preselectedCountry;
        this.f308141b = eligibility;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f308140a, fVar.f308140a) && Intrinsics.f(this.f308141b, fVar.f308141b);
    }

    public final int hashCode() {
        return this.f308141b.hashCode() + (this.f308140a.f297794a.hashCode() * 31);
    }
}
