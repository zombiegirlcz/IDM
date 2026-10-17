package wc5;

import com.revolut.feature.crypto.asset.details.api.dialog.StakingRewardsDialogDescriptor$Type;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StakingRewardsDialogDescriptor$Type f296344a;

    public b(StakingRewardsDialogDescriptor$Type type) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.f296344a = type;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f296344a, ((b) obj2).f296344a);
    }

    public final int hashCode() {
        return this.f296344a.hashCode();
    }
}
