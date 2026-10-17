package a15;

import com.revolut.feature.credit.health.impl.domain.model.CreditScoreInsight;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class i extends j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CreditScoreInsight f537a;

    public i(CreditScoreInsight insight) {
        Intrinsics.checkNotNullParameter(insight, "insight");
        this.f537a = insight;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f537a, ((i) obj2).f537a);
    }

    public final int hashCode() {
        return this.f537a.hashCode();
    }
}
