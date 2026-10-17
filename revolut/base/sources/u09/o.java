package u09;

import com.revolut.feature.learn.shared.models.domain.LearnReward;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LearnReward f276138a;

    public o(LearnReward reward) {
        Intrinsics.checkNotNullParameter(reward, "reward");
        this.f276138a = reward;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof o) && Intrinsics.f(this.f276138a, ((o) obj2).f276138a);
    }

    public final int hashCode() {
        return this.f276138a.hashCode();
    }
}
