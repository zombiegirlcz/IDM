package mic;

import com.revolut.feature.rewards.api.model.rewards.RewardFooterAction;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class o implements w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RewardFooterAction f205673a;

    public o(RewardFooterAction action) {
        Intrinsics.checkNotNullParameter(action, "action");
        this.f205673a = action;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof o) && Intrinsics.f(this.f205673a, ((o) obj2).f205673a);
    }

    public final int hashCode() {
        return this.f205673a.hashCode();
    }
}
