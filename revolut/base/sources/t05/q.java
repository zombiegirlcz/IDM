package t05;

import com.revolut.feature.credit.health.impl.domain.model.CreditScoreInsight;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class q extends t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CreditScoreInsight f266928a;

    public q(CreditScoreInsight insight) {
        Intrinsics.checkNotNullParameter(insight, "insight");
        this.f266928a = insight;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof q) && Intrinsics.f(this.f266928a, ((q) obj2).f266928a);
    }

    public final int hashCode() {
        return this.f266928a.hashCode();
    }
}
