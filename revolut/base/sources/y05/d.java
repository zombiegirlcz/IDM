package y05;

import cli.j;
import com.revolut.feature.credit.health.impl.domain.model.CreditScoreInsight;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class d implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CreditScoreInsight f310145a;

    public d(CreditScoreInsight insight) {
        Intrinsics.checkNotNullParameter(insight, "insight");
        this.f310145a = insight;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f310145a, ((d) obj2).f310145a);
    }

    public final int hashCode() {
        return this.f310145a.hashCode();
    }
}
