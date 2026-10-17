package a07;

import com.revolut.feature.freelancer.impl.ui.profile.FreelancerProfileFlowContract$Step;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class g implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FreelancerProfileFlowContract$Step f146a;

    public g(FreelancerProfileFlowContract$Step step) {
        Intrinsics.checkNotNullParameter(step, "step");
        this.f146a = step;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f146a, ((g) obj2).f146a);
    }

    public final int hashCode() {
        return this.f146a.hashCode();
    }
}
