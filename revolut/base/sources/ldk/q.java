package ldk;

import com.revolut.retail.feature.plan_rewards.api.model.RewardInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class q implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RewardInfo f194175a;

    public q(RewardInfo info) {
        Intrinsics.checkNotNullParameter(info, "info");
        this.f194175a = info;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof q) && Intrinsics.f(this.f194175a, ((q) obj2).f194175a);
    }

    public final int hashCode() {
        return this.f194175a.hashCode();
    }
}
