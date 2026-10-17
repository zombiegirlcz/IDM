package mic;

import com.revolut.feature.rewards.api.model.rewards.RewardOutlet;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class v implements w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RewardOutlet f205681a;

    public v(RewardOutlet outlet) {
        Intrinsics.checkNotNullParameter(outlet, "outlet");
        this.f205681a = outlet;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof v) && Intrinsics.f(this.f205681a, ((v) obj2).f205681a);
    }

    public final int hashCode() {
        return this.f205681a.hashCode();
    }
}
