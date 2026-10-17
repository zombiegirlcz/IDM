package u09;

import com.revolut.feature.learn.shared.models.domain.LearnReward;
import com.revolut.feature.learn.shared.models.domain.LearnShareReward;
import com.revolut.feature.learn.shared.models.domain.LearnSubmitQuizNextStep;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class l0 extends n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k0 f276131a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LearnShareReward f276132b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LearnReward f276133c;
    public final LearnSubmitQuizNextStep d;
    public final List e;

    public l0(k0 status, LearnShareReward learnShareReward, LearnReward reward, LearnSubmitQuizNextStep next, ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(reward, "reward");
        Intrinsics.checkNotNullParameter(next, "next");
        this.f276131a = status;
        this.f276132b = learnShareReward;
        this.f276133c = reward;
        this.d = next;
        this.e = arrayList;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj2;
        return Intrinsics.f(this.f276131a, l0Var.f276131a) && Intrinsics.f(this.f276132b, l0Var.f276132b) && Intrinsics.f(this.f276133c, l0Var.f276133c) && Intrinsics.f(this.d, l0Var.d) && Intrinsics.f(this.e, l0Var.e);
    }

    public final int hashCode() {
        int iHashCode = this.f276131a.hashCode() * 31;
        LearnShareReward learnShareReward = this.f276132b;
        int iHashCode2 = (this.d.hashCode() + ((this.f276133c.hashCode() + ((iHashCode + (learnShareReward == null ? 0 : learnShareReward.hashCode())) * 31)) * 31)) * 31;
        List list = this.e;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }
}
