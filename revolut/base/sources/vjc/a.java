package vjc;

import com.revolut.feature.rewards.api.model.rewards.RewardFooterAction;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f289699a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RewardFooterAction.Cancel f289700b;

    public a(String perkId, RewardFooterAction.Cancel cancelAction) {
        Intrinsics.checkNotNullParameter(perkId, "perkId");
        Intrinsics.checkNotNullParameter(cancelAction, "cancelAction");
        this.f289699a = perkId;
        this.f289700b = cancelAction;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f289699a, aVar.f289699a) && Intrinsics.f(this.f289700b, aVar.f289700b);
    }

    public final int hashCode() {
        return this.f289700b.hashCode() + (this.f289699a.hashCode() * 31);
    }
}
