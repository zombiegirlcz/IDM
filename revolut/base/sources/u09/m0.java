package u09;

import com.revolut.feature.learn.shared.models.domain.LearnShareReward;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class m0 extends n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k0 f276134a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LearnShareReward f276135b;

    public m0(k0 status, LearnShareReward learnShareReward) {
        Intrinsics.checkNotNullParameter(status, "status");
        this.f276134a = status;
        this.f276135b = learnShareReward;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m0)) {
            return false;
        }
        m0 m0Var = (m0) obj2;
        return Intrinsics.f(this.f276134a, m0Var.f276134a) && Intrinsics.f(this.f276135b, m0Var.f276135b);
    }

    public final int hashCode() {
        int iHashCode = this.f276134a.hashCode() * 31;
        LearnShareReward learnShareReward = this.f276135b;
        return iHashCode + (learnShareReward == null ? 0 : learnShareReward.hashCode());
    }
}
