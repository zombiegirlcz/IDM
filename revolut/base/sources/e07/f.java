package e07;

import aii.r;
import com.revolut.feature.freelancer.common.models.FreelancerProfileSettings;
import com.revolut.feature.freelancer.impl.ui.profile.FreelancerProfileFlowContract$Step;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FreelancerProfileFlowContract$Step f121443a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FreelancerProfileSettings f121444b;

    public f(FreelancerProfileFlowContract$Step step, FreelancerProfileSettings freelancerProfileSettings) {
        Intrinsics.checkNotNullParameter(step, "step");
        this.f121443a = step;
        this.f121444b = freelancerProfileSettings;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f121443a, fVar.f121443a) && Intrinsics.f(this.f121444b, fVar.f121444b);
    }

    public final int hashCode() {
        int iHashCode = this.f121443a.hashCode() * 31;
        FreelancerProfileSettings freelancerProfileSettings = this.f121444b;
        return iHashCode + (freelancerProfileSettings == null ? 0 : freelancerProfileSettings.hashCode());
    }
}
