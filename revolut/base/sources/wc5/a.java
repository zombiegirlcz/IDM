package wc5;

import cli.j;
import com.revolut.feature.crypto.asset.details.api.dialog.StakingRewardsDialogDescriptor$Type;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StakingRewardsDialogDescriptor$Type f296343a;

    public a(StakingRewardsDialogDescriptor$Type type) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.f296343a = type;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f296343a, ((a) obj2).f296343a);
    }

    public final int hashCode() {
        return this.f296343a.hashCode();
    }
}
