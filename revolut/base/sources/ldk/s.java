package ldk;

import com.revolut.retail.feature.plan_rewards.api.model.RewardInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RewardInfo f194176a;

    public s(RewardInfo info) {
        Intrinsics.checkNotNullParameter(info, "info");
        this.f194176a = info;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof s) && Intrinsics.f(this.f194176a, ((s) obj2).f194176a);
    }

    public final int hashCode() {
        return this.f194176a.hashCode();
    }
}
