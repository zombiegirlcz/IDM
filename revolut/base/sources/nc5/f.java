package nc5;

import com.revolut.feature.crypto.asset.details.api.dialog.StakingRewardsDialogDescriptor$Type;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements aii.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StakingRewardsDialogDescriptor$Type f214151a;

    public f(StakingRewardsDialogDescriptor$Type type) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.f214151a = type;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f214151a, ((f) obj2).f214151a);
    }

    public final int hashCode() {
        return this.f214151a.hashCode();
    }
}
