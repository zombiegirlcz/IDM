package mic;

import com.revolut.feature.rewards.api.model.rewards.RewardAction;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class p implements w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RewardAction f205674a;

    public p(RewardAction action) {
        Intrinsics.checkNotNullParameter(action, "action");
        this.f205674a = action;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof p) && Intrinsics.f(this.f205674a, ((p) obj2).f205674a);
    }

    public final int hashCode() {
        return this.f205674a.hashCode();
    }
}
