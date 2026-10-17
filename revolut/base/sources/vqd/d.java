package vqd;

import com.revolut.feature.spending_analytics.impl.ui.rev10.rev_iq.models.ScoreCardType;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ScoreCardType f291388a;

    public d(ScoreCardType scoreCardType) {
        Intrinsics.checkNotNullParameter(scoreCardType, "scoreCardType");
        this.f291388a = scoreCardType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && this.f291388a == ((d) obj2).f291388a;
    }

    public final int hashCode() {
        return this.f291388a.hashCode();
    }
}
