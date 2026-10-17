package xqd;

import com.revolut.feature.spending_analytics.impl.ui.rev10.rev_iq.models.ScoreCardType;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ScoreCardType f308156a;

    public b(ScoreCardType scoreCardType) {
        Intrinsics.checkNotNullParameter(scoreCardType, "scoreCardType");
        this.f308156a = scoreCardType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && this.f308156a == ((b) obj2).f308156a;
    }

    public final int hashCode() {
        return this.f308156a.hashCode();
    }
}
