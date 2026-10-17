package f11;

import com.revolut.crypto.challenge.impl.model.ChallengeStatusDetails;
import com.revolut.crypto.challenge.impl.model.PlanReward;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f131161a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ChallengeStatusDetails f131162b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PlanReward f131163c;

    public b(a state, ChallengeStatusDetails details, PlanReward planReward) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(details, "details");
        this.f131161a = state;
        this.f131162b = details;
        this.f131163c = planReward;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return this.f131161a == bVar.f131161a && Intrinsics.f(this.f131162b, bVar.f131162b) && Intrinsics.f(this.f131163c, bVar.f131163c);
    }

    public final int hashCode() {
        int iHashCode = (this.f131162b.hashCode() + (this.f131161a.hashCode() * 31)) * 31;
        PlanReward planReward = this.f131163c;
        return iHashCode + (planReward == null ? 0 : planReward.hashCode());
    }
}
