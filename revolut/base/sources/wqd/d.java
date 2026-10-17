package wqd;

import com.revolut.feature.spending_analytics.impl.ui.rev10.rev_iq.models.ScoreCardType;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ScoreCardType f299439a;

    public d(ScoreCardType scoreCardType) {
        Intrinsics.checkNotNullParameter(scoreCardType, "scoreCardType");
        this.f299439a = scoreCardType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && this.f299439a == ((d) obj2).f299439a;
    }

    public final int hashCode() {
        return this.f299439a.hashCode();
    }
}
